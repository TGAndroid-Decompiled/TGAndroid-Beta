package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AutoDeletePopupWrapper;
import org.telegram.ui.Components.LinkSpanDrawable;
public class AutoDeletePopupWrapper {
    View backItem;
    Callback callback;
    private final ActionBarMenuSubItem disableItem;
    long lastDismissTime;
    TextView textView;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout windowLayout;

    public interface Callback {

        public final class CC {
            public static void $default$showGlobalAutoDeleteScreen(Callback callback) {
            }
        }

        void dismiss();

        void setAutoDeleteHistory(int i, int i2);

        void showGlobalAutoDeleteScreen();
    }

    public AutoDeletePopupWrapper(final Context context, final PopupSwipeBackLayout popupSwipeBackLayout, final Callback callback, boolean z, final int i, final Theme.ResourcesProvider resourcesProvider) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, z ? R.drawable.popup_fixed_alert : 0, resourcesProvider);
        this.windowLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
        this.callback = callback;
        if (popupSwipeBackLayout != null) {
            ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_arrow_back, LocaleController.getString("Back", R.string.Back), false, resourcesProvider);
            this.backItem = addItem;
            addItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PopupSwipeBackLayout.this.closeForeground();
                }
            });
        }
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString("AutoDelete1Day", R.string.AutoDelete1Day), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AutoDeletePopupWrapper.this.lambda$new$1(callback, view);
            }
        });
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString("AutoDelete7Days", R.string.AutoDelete7Days), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AutoDeletePopupWrapper.this.lambda$new$2(callback, view);
            }
        });
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString("AutoDelete1Month", R.string.AutoDelete1Month), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AutoDeletePopupWrapper.this.lambda$new$3(callback, view);
            }
        });
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_customize, i == 1 ? LocaleController.getString("AutoDeleteCustom2", R.string.AutoDeleteCustom2) : LocaleController.getString("AutoDeleteCustom", R.string.AutoDeleteCustom), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AutoDeletePopupWrapper.this.lambda$new$5(context, i, resourcesProvider, callback, view);
            }
        });
        ActionBarMenuSubItem addItem2 = ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_disable, LocaleController.getString("AutoDeleteDisable", R.string.AutoDeleteDisable), false, resourcesProvider);
        this.disableItem = addItem2;
        addItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AutoDeletePopupWrapper.this.lambda$new$6(callback, view);
            }
        });
        if (i != 1) {
            addItem2.setColors(Theme.getColor("text_RedBold"), Theme.getColor("text_RedBold"));
        }
        if (i != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(Theme.getColor("actionBarDefaultSubmenuSeparator", resourcesProvider));
            View view = new View(context);
            view.setBackground(Theme.getThemedDrawable(context, R.drawable.greydivider, "windowBackgroundGrayShadow", resourcesProvider));
            frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f));
            int i2 = R.id.fit_width_tag;
            frameLayout.setTag(i2, 1);
            this.windowLayout.addView((View) frameLayout, LayoutHelper.createLinear(-1, 8));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.textView = linksTextView;
            linksTextView.setTag(i2, 1);
            this.textView.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            this.textView.setTextSize(1, 13.0f);
            this.textView.setTextColor(Theme.getColor("actionBarDefaultSubmenuItem"));
            this.textView.setMovementMethod(LinkMovementMethod.getInstance());
            this.textView.setLinkTextColor(Theme.getColor("windowBackgroundWhiteLinkText"));
            this.textView.setText(LocaleController.getString("AutoDeletePopupDescription", R.string.AutoDeletePopupDescription));
            this.windowLayout.addView((View) this.textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public void lambda$new$1(Callback callback, View view) {
        dismiss();
        callback.setAutoDeleteHistory(86400, 70);
    }

    public void lambda$new$2(Callback callback, View view) {
        dismiss();
        callback.setAutoDeleteHistory(604800, 70);
    }

    public void lambda$new$3(Callback callback, View view) {
        dismiss();
        callback.setAutoDeleteHistory(2678400, 70);
    }

    public void lambda$new$5(Context context, int i, Theme.ResourcesProvider resourcesProvider, final Callback callback, View view) {
        dismiss();
        AlertsCreator.createAutoDeleteDatePickerDialog(context, i, resourcesProvider, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public final void didSelectDate(boolean z, int i2) {
                AutoDeletePopupWrapper.lambda$new$4(AutoDeletePopupWrapper.Callback.this, z, i2);
            }
        });
    }

    public static void lambda$new$4(Callback callback, boolean z, int i) {
        callback.setAutoDeleteHistory(i * 60, i == 0 ? 71 : 70);
    }

    public void lambda$new$6(Callback callback, View view) {
        dismiss();
        callback.setAutoDeleteHistory(0, 71);
    }

    private void dismiss() {
        this.callback.dismiss();
        this.lastDismissTime = System.currentTimeMillis();
    }

    public void lambda$updateItems$7(final int i) {
        if (System.currentTimeMillis() - this.lastDismissTime < 200) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AutoDeletePopupWrapper.this.lambda$updateItems$7(i);
                }
            });
        } else if (i == 0) {
            this.disableItem.setVisibility(8);
        } else {
            this.disableItem.setVisibility(0);
        }
    }

    public void allowExtenededHint() {
        if (this.textView == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString("AutoDeletePopupDescription", R.string.AutoDeletePopupDescription));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append(AndroidUtilities.replaceSingleTag(LocaleController.getString("AutoDeletePopupDescription2", R.string.AutoDeletePopupDescription2), new Runnable() {
            @Override
            public final void run() {
                AutoDeletePopupWrapper.this.lambda$allowExtenededHint$8();
            }
        }));
        this.textView.setText(spannableStringBuilder);
    }

    public void lambda$allowExtenededHint$8() {
        this.callback.showGlobalAutoDeleteScreen();
    }
}
