package org.telegram.p009ui;

import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AvatarsImageView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.LinkSpanDrawable;
import org.telegram.p009ui.DialogsActivity;

public class KeepMediaPopupView extends ActionBarPopupWindow.ActionBarPopupWindowLayout {
    private final CacheByChatsController cacheByChatsController;
    Callback callback;
    ArrayList<CheckItem> checkItems;
    int currentType;
    ActionBarMenuSubItem delete;
    private final TextView description;
    private ArrayList<CacheByChatsController.KeepMediaException> exceptions;
    ExceptionsView exceptionsView;
    ActionBarMenuSubItem forever;
    FrameLayout gap;
    ActionBarMenuSubItem oneDay;
    ActionBarMenuSubItem oneMinute;
    ActionBarMenuSubItem oneMonth;
    ActionBarMenuSubItem oneWeek;
    BaseFragment parentFragment;

    public interface Callback {
        void onKeepMediaChange(int i, int i2);
    }

    public KeepMediaPopupView(final BaseFragment baseFragment, Context context) {
        super(context, null);
        this.checkItems = new ArrayList<>();
        this.parentFragment = baseFragment;
        this.cacheByChatsController = baseFragment.getMessagesController().getCacheByChatsController();
        setFitItems(true);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(this, C1072R.C1073drawable.msg_autodelete, LocaleController.formatPluralString("Minutes", 1, new Object[0]), false, null);
            this.oneMinute = addItem;
            this.checkItems.add(new CheckItem(addItem, CacheByChatsController.KEEP_MEDIA_ONE_MINUTE));
        }
        this.oneDay = ActionBarMenuItem.addItem(this, C1072R.C1073drawable.msg_autodelete_1d, LocaleController.formatPluralString("Days", 1, new Object[0]), false, null);
        this.oneWeek = ActionBarMenuItem.addItem(this, C1072R.C1073drawable.msg_autodelete_1w, LocaleController.formatPluralString("Weeks", 1, new Object[0]), false, null);
        this.oneMonth = ActionBarMenuItem.addItem(this, C1072R.C1073drawable.msg_autodelete_1m, LocaleController.formatPluralString("Months", 1, new Object[0]), false, null);
        this.forever = ActionBarMenuItem.addItem(this, C1072R.C1073drawable.msg_cancel, LocaleController.getString("AutoDeleteMediaNever", C1072R.string.AutoDeleteMediaNever), false, null);
        ActionBarMenuSubItem addItem2 = ActionBarMenuItem.addItem(this, C1072R.C1073drawable.msg_delete, LocaleController.getString("DeleteException", C1072R.string.DeleteException), false, null);
        this.delete = addItem2;
        addItem2.setColors(Theme.getColor("windowBackgroundWhiteRedText"), Theme.getColor("windowBackgroundWhiteRedText"));
        this.checkItems.add(new CheckItem(this.oneDay, CacheByChatsController.KEEP_MEDIA_ONE_DAY));
        this.checkItems.add(new CheckItem(this.oneWeek, CacheByChatsController.KEEP_MEDIA_ONE_WEEK));
        this.checkItems.add(new CheckItem(this.oneMonth, CacheByChatsController.KEEP_MEDIA_ONE_MONTH));
        this.checkItems.add(new CheckItem(this.forever, CacheByChatsController.KEEP_MEDIA_FOREVER));
        this.checkItems.add(new CheckItem(this.delete, CacheByChatsController.KEEP_MEDIA_DELETE));
        FrameLayout frameLayout = new FrameLayout(context);
        this.gap = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor("actionBarDefaultSubmenuSeparator"));
        View view = new View(context);
        view.setBackground(Theme.getThemedDrawable(context, C1072R.C1073drawable.greydivider, "windowBackgroundGrayShadow", null));
        this.gap.addView(view, LayoutHelper.createFrame(-1, -1.0f));
        this.gap.setTag(C1072R.C1074id.fit_width_tag, 1);
        addView(this.gap, LayoutHelper.createLinear(-1, 8));
        ExceptionsView exceptionsView = new ExceptionsView(context);
        this.exceptionsView = exceptionsView;
        addView((View) exceptionsView, LayoutHelper.createLinear(-1, 48));
        this.exceptionsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                KeepMediaPopupView.this.lambda$new$2(baseFragment, view2);
            }
        });
        for (int i = 0; i < this.checkItems.size(); i++) {
            final int i2 = this.checkItems.get(i).type;
            this.checkItems.get(i).item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view2) {
                    ((ActionBarPopupWindow.ActionBarPopupWindowLayout) KeepMediaPopupView.this).window.dismiss();
                    KeepMediaPopupView.this.cacheByChatsController.setKeepMedia(KeepMediaPopupView.this.currentType, i2);
                    KeepMediaPopupView keepMediaPopupView = KeepMediaPopupView.this;
                    Callback callback = keepMediaPopupView.callback;
                    if (callback != null) {
                        callback.onKeepMediaChange(keepMediaPopupView.currentType, i2);
                    }
                }
            });
        }
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        this.description = linksTextView;
        linksTextView.setTag(C1072R.C1074id.fit_width_tag, 1);
        linksTextView.setPadding(AndroidUtilities.m35dp(13.0f), 0, AndroidUtilities.m35dp(13.0f), AndroidUtilities.m35dp(8.0f));
        linksTextView.setTextSize(1, 13.0f);
        linksTextView.setTextColor(Theme.getColor("actionBarDefaultSubmenuItem"));
        linksTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linksTextView.setLinkTextColor(Theme.getColor("windowBackgroundWhiteLinkText"));
        linksTextView.setText(LocaleController.getString("KeepMediaPopupDescription", C1072R.string.KeepMediaPopupDescription));
        addView((View) linksTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public void lambda$new$2(BaseFragment baseFragment, View view) {
        this.window.dismiss();
        if (this.exceptions.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i = this.currentType;
            if (i == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            final DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                @Override
                public final void didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z) {
                    KeepMediaPopupView.this.lambda$new$1(dialogsActivity, dialogsActivity2, arrayList, charSequence, z);
                }
            });
            baseFragment.presentFragment(dialogsActivity);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("type", this.currentType);
        CacheChatsExceptionsFragment cacheChatsExceptionsFragment = new CacheChatsExceptionsFragment(bundle2);
        cacheChatsExceptionsFragment.setExceptions(this.exceptions);
        baseFragment.presentFragment(cacheChatsExceptionsFragment);
    }

    public void lambda$new$1(final DialogsActivity dialogsActivity, DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z) {
        final CacheByChatsController.KeepMediaException keepMediaException = null;
        int i = 0;
        while (i < arrayList.size()) {
            ArrayList<CacheByChatsController.KeepMediaException> arrayList2 = this.exceptions;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i++;
            keepMediaException = keepMediaException2;
        }
        this.cacheByChatsController.saveKeepMediaExceptions(this.currentType, this.exceptions);
        Bundle bundle = new Bundle();
        bundle.putInt("type", this.currentType);
        final CacheChatsExceptionsFragment cacheChatsExceptionsFragment = new CacheChatsExceptionsFragment(this, bundle) {
            @Override
            public void onTransitionAnimationEnd(boolean z2, boolean z3) {
                super.onTransitionAnimationEnd(z2, z3);
                if (!z2 || z3) {
                    return;
                }
                dialogsActivity.removeSelfFromStack();
            }
        };
        cacheChatsExceptionsFragment.setExceptions(this.exceptions);
        this.parentFragment.presentFragment(cacheChatsExceptionsFragment);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CacheChatsExceptionsFragment.this.showPopupFor(keepMediaException);
            }
        }, 150L);
    }

    public void update(int i) {
        this.currentType = i;
        ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = this.cacheByChatsController.getKeepMediaExceptions(i);
        this.exceptions = keepMediaExceptions;
        if (keepMediaExceptions.isEmpty()) {
            this.exceptionsView.titleView.setText(LocaleController.getString("AddAnException", C1072R.string.AddAnException));
            this.exceptionsView.titleView.setRightPadding(AndroidUtilities.m35dp(8.0f));
            this.exceptionsView.avatarsImageView.setObject(0, this.parentFragment.getCurrentAccount(), null);
            this.exceptionsView.avatarsImageView.setObject(1, this.parentFragment.getCurrentAccount(), null);
            this.exceptionsView.avatarsImageView.setObject(2, this.parentFragment.getCurrentAccount(), null);
            this.exceptionsView.avatarsImageView.commitTransition(false);
        } else {
            int min = Math.min(3, this.exceptions.size());
            this.exceptionsView.titleView.setRightPadding(AndroidUtilities.m35dp((Math.max(0, min - 1) * 12) + 64));
            this.exceptionsView.titleView.setText(LocaleController.formatPluralString("ExceptionShort", this.exceptions.size(), Integer.valueOf(this.exceptions.size())));
            for (int i2 = 0; i2 < min; i2++) {
                this.exceptionsView.avatarsImageView.setObject(i2, this.parentFragment.getCurrentAccount(), this.parentFragment.getMessagesController().getUserOrChat(this.exceptions.get(i2).dialogId));
            }
            this.exceptionsView.avatarsImageView.commitTransition(false);
        }
        this.delete.setVisibility(8);
        this.description.setVisibility(8);
        updateAvatarsPosition();
    }

    public void updateForDialog(boolean z) {
        this.gap.setVisibility(0);
        this.delete.setVisibility(z ? 8 : 0);
        this.description.setVisibility(0);
        this.exceptionsView.setVisibility(8);
    }

    public class ExceptionsView extends FrameLayout {
        AvatarsImageView avatarsImageView;
        boolean ignoreLayout;
        SimpleTextView titleView;

        public ExceptionsView(Context context) {
            super(context);
            KeepMediaPopupView.this = r9;
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.titleView = simpleTextView;
            simpleTextView.setTextSize(16);
            this.titleView.setEllipsizeByGradient(true);
            this.titleView.setRightPadding(AndroidUtilities.m35dp(68.0f));
            this.titleView.setTextColor(Theme.getColor("dialogTextBlack"));
            addView(this.titleView, LayoutHelper.createFrame(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            this.avatarsImageView = avatarsImageView;
            avatarsImageView.setStyle(11);
            this.avatarsImageView.setAvatarsTextSize(AndroidUtilities.m35dp(22.0f));
            addView(this.avatarsImageView, LayoutHelper.createFrame(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            setBackground(Theme.createRadSelectorDrawable(Theme.getColor("listSelectorSDK21"), 0, 4));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            View view = (View) getParent();
            if (view != null && view.getWidth() > 0) {
                i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
            }
            this.ignoreLayout = true;
            this.titleView.setVisibility(8);
            super.onMeasure(i, i2);
            this.titleView.setVisibility(0);
            this.titleView.getLayoutParams().width = getMeasuredWidth();
            this.ignoreLayout = false;
            KeepMediaPopupView.this.updateAvatarsPosition();
            super.onMeasure(i, i2);
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    public void updateAvatarsPosition() {
        if (this.exceptions != null) {
            this.exceptionsView.avatarsImageView.setTranslationX(AndroidUtilities.m35dp(12.0f) * (3 - Math.min(3, this.exceptions.size())));
        }
    }

    public static class CheckItem {
        final ActionBarMenuSubItem item;
        final int type;

        private CheckItem(ActionBarMenuSubItem actionBarMenuSubItem, int i) {
            this.item = actionBarMenuSubItem;
            this.type = i;
        }
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }
}
