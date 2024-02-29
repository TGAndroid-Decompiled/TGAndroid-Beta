package org.telegram.ui.Business;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_account_connectedBots;
import org.telegram.tgnet.TLRPC$TL_account_updateConnectedBot;
import org.telegram.tgnet.TLRPC$TL_connectedBot;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputBusinessRecipients;
import org.telegram.tgnet.TLRPC$TL_inputUserEmpty;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
public class ChatbotsActivity extends BaseFragment {
    public TLRPC$TL_connectedBot currentBot;
    public TLRPC$TL_account_connectedBots currentValue;
    private ActionBarMenuItem doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    private EditTextBoldCursor editText;
    private FrameLayout editTextContainer;
    private View editTextDivider;
    private FrameLayout emptyView;
    private ImageView emptyViewLoading;
    private TextView emptyViewText;
    public boolean exclude;
    private SpannableStringBuilder introText;
    private String lastQuery;
    private UniversalRecyclerView listView;
    private boolean loading;
    private BusinessRecipientsHelper recipientsHelper;
    private boolean scheduledLoading;
    private SearchAdapterHelper searchHelper;
    private boolean valueSet;
    private boolean wasLoading;
    private int searchId = 0;
    private Runnable search = new Runnable() {
        @Override
        public final void run() {
            ChatbotsActivity.this.lambda$new$3();
        }
    };
    public boolean allowReply = true;
    private TLRPC$User selectedBot = null;
    private LongSparseArray<TLRPC$User> foundBots = new LongSparseArray<>();

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessBots));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (ChatbotsActivity.this.onBackPressed()) {
                        ChatbotsActivity.this.finishFragment();
                    }
                } else if (i == 1) {
                    ChatbotsActivity.this.processDone();
                }
            }
        });
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(mutate, new CircularProgressDrawable(Theme.getColor(i)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, this.doneButtonDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString("Done", R.string.Done));
        checkDone(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        new LinearLayout(getContext()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.editText = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.editText.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
        EditTextBoldCursor editTextBoldCursor2 = this.editText;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor2.setTextColor(Theme.getColor(i2));
        this.editText.setBackgroundDrawable(null);
        this.editText.setMaxLines(1);
        this.editText.setLines(1);
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setSingleLine(true);
        this.editText.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.editText.setInputType(180224);
        this.editText.setImeOptions(6);
        this.editText.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.editText.setCursorColor(Theme.getColor(i2));
        this.editText.setCursorSize(AndroidUtilities.dp(19.0f));
        this.editText.setCursorWidth(1.5f);
        this.editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                boolean lambda$createView$0;
                lambda$createView$0 = ChatbotsActivity.this.lambda$createView$0(textView, i3, keyEvent);
                return lambda$createView$0;
            }
        });
        this.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                ChatbotsActivity.this.scheduleSearch();
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.editTextContainer = frameLayout2;
        frameLayout2.addView(this.editText, LayoutHelper.createFrame(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.editTextContainer;
        int i3 = Theme.key_windowBackgroundWhite;
        frameLayout3.setBackgroundColor(getThemedColor(i3));
        View view = new View(context);
        this.editTextDivider = view;
        view.setBackgroundColor(getThemedColor(Theme.key_divider));
        FrameLayout frameLayout4 = this.editTextContainer;
        View view2 = this.editTextDivider;
        float f = 1.0f / AndroidUtilities.density;
        boolean z = LocaleController.isRTL;
        frameLayout4.addView(view2, LayoutHelper.createFrame(-1, f, 87, z ? 0 : 21, 0.0f, z ? 21 : 0, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(this, context) {
            @Override
            protected void onMeasure(int i4, int i5) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
            }
        };
        this.emptyView = frameLayout5;
        frameLayout5.setBackgroundColor(getThemedColor(i3));
        TextView textView = new TextView(context);
        this.emptyViewText = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.emptyViewText.setTextSize(1, 14.0f);
        TextView textView2 = this.emptyViewText;
        int i4 = Theme.key_windowBackgroundWhiteGrayText2;
        textView2.setTextColor(getThemedColor(i4));
        this.emptyView.addView(this.emptyViewText, LayoutHelper.createFrame(-2, -2, 17));
        this.emptyViewLoading = new ImageView(context);
        this.emptyViewLoading.setImageDrawable(new CircularProgressDrawable(this, getThemedColor(i4)) {
            @Override
            public int getIntrinsicWidth() {
                return (int) (this.size + (this.thickness * 2.0f));
            }

            @Override
            public int getIntrinsicHeight() {
                return (int) (this.size + (this.thickness * 2.0f));
            }
        });
        this.emptyView.addView(this.emptyViewLoading, LayoutHelper.createFrame(-2, -2, 17));
        this.emptyViewLoading.setAlpha(0.0f);
        this.emptyViewLoading.setTranslationY(AndroidUtilities.dp(8.0f));
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BusinessBotsInfo), new Runnable() {
            @Override
            public final void run() {
                ChatbotsActivity.this.lambda$createView$1();
            }
        });
        this.introText = replaceSingleTag;
        int indexOf = replaceSingleTag.toString().indexOf(">");
        if (indexOf >= 0) {
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.arrow_newchat);
            coloredImageSpan.setColorKey(Theme.key_chat_messageLinkIn);
            this.introText.setSpan(coloredImageSpan, indexOf, indexOf + 1, 33);
        }
        SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
        this.searchHelper = searchAdapterHelper;
        searchAdapterHelper.setDelegate(new AnonymousClass5());
        BusinessRecipientsHelper businessRecipientsHelper = new BusinessRecipientsHelper(this, new Runnable() {
            @Override
            public final void run() {
                ChatbotsActivity.this.lambda$createView$2();
            }
        });
        this.recipientsHelper = businessRecipientsHelper;
        TLRPC$TL_connectedBot tLRPC$TL_connectedBot = this.currentBot;
        businessRecipientsHelper.setValue(tLRPC$TL_connectedBot != null ? tLRPC$TL_connectedBot.recipients : null);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, this.currentAccount, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ChatbotsActivity.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                ChatbotsActivity.this.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, null, getResourceProvider());
        this.listView = universalRecyclerView;
        frameLayout.addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1.0f));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public boolean lambda$createView$0(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            this.scheduledLoading = false;
            AndroidUtilities.cancelRunOnUIThread(this.search);
            if (TextUtils.isEmpty(this.editText.getText())) {
                this.lastQuery = null;
                this.searchHelper.clear();
                this.listView.adapter.update(true);
            } else {
                AndroidUtilities.runOnUIThread(this.search);
            }
            updateSearchLoading();
            return true;
        }
        return false;
    }

    public void lambda$createView$1() {
        Browser.openUrl(getContext(), LocaleController.getString(R.string.BusinessBotsInfoLink));
    }

    public class AnonymousClass5 implements SearchAdapterHelper.SearchAdapterHelperDelegate {
        @Override
        public boolean canApplySearchResults(int i) {
            return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$canApplySearchResults(this, i);
        }

        @Override
        public androidx.collection.LongSparseArray getExcludeCallParticipants() {
            return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
        }

        @Override
        public androidx.collection.LongSparseArray getExcludeUsers() {
            return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeUsers(this);
        }

        @Override
        public void onSetHashtags(ArrayList arrayList, HashMap hashMap) {
            SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$onSetHashtags(this, arrayList, hashMap);
        }

        AnonymousClass5() {
        }

        @Override
        public void onDataSetChanged(int i) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatbotsActivity.AnonymousClass5.this.lambda$onDataSetChanged$0();
                }
            });
        }

        public void lambda$onDataSetChanged$0() {
            ChatbotsActivity.this.listView.adapter.update(true);
            ChatbotsActivity.this.updateSearchLoading();
        }
    }

    public void lambda$createView$2() {
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void updateSearchLoading() {
        boolean z = false;
        if (this.wasLoading != (this.searchHelper.isSearchInProgress() || this.scheduledLoading || this.foundBots.size() > 0)) {
            z = (this.searchHelper.isSearchInProgress() || this.scheduledLoading || this.foundBots.size() > 0) ? true : true;
            this.wasLoading = z;
            ViewPropertyAnimator duration = this.emptyViewText.animate().alpha(z ? 0.0f : 1.0f).translationY(z ? -AndroidUtilities.dp(8.0f) : 0.0f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.emptyViewLoading.animate().alpha(z ? 1.0f : 0.0f).translationY(z ? 0.0f : AndroidUtilities.dp(8.0f)).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
        }
    }

    public void scheduleSearch() {
        this.scheduledLoading = false;
        AndroidUtilities.cancelRunOnUIThread(this.search);
        if (TextUtils.isEmpty(this.editText.getText())) {
            this.lastQuery = null;
            this.searchHelper.clear();
        } else {
            this.scheduledLoading = true;
            AndroidUtilities.runOnUIThread(this.search, 800L);
        }
        this.listView.adapter.update(true);
        updateSearchLoading();
    }

    public void lambda$new$3() {
        String obj = this.editText.getText().toString();
        String str = this.lastQuery;
        if (str == null || !TextUtils.equals(str, obj)) {
            this.scheduledLoading = false;
            if (TextUtils.isEmpty(obj)) {
                this.lastQuery = null;
                this.searchHelper.clear();
                this.listView.adapter.update(true);
                return;
            }
            SearchAdapterHelper searchAdapterHelper = this.searchHelper;
            this.lastQuery = obj;
            int i = this.searchId;
            this.searchId = i + 1;
            searchAdapterHelper.queryServerSearch(obj, true, false, true, false, false, 0L, false, 0, i, 0L);
        }
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asTopView(this.introText, "RestrictedEmoji", "🤖"));
        TLRPC$User tLRPC$User = this.selectedBot;
        if (tLRPC$User != null) {
            arrayList.add(UItem.asAddChat(Long.valueOf(tLRPC$User.id)).setChecked(true).setCloseIcon(new Runnable() {
                @Override
                public final void run() {
                    ChatbotsActivity.this.clear();
                }
            }));
        } else {
            universalAdapter.whiteSectionStart();
            arrayList.add(UItem.asCustom(this.editTextContainer));
            this.foundBots.clear();
            boolean z = false;
            for (int i = 0; i < this.searchHelper.getLocalServerSearch().size(); i++) {
                TLObject tLObject = this.searchHelper.getLocalServerSearch().get(i);
                if (tLObject instanceof TLRPC$User) {
                    TLRPC$User tLRPC$User2 = (TLRPC$User) tLObject;
                    if (tLRPC$User2.bot) {
                        arrayList.add(UItem.asAddChat(Long.valueOf(tLRPC$User2.id)));
                        this.foundBots.put(tLRPC$User2.id, tLRPC$User2);
                        z = true;
                    }
                }
            }
            for (int i2 = 0; i2 < this.searchHelper.getGlobalSearch().size(); i2++) {
                TLObject tLObject2 = this.searchHelper.getGlobalSearch().get(i2);
                if (tLObject2 instanceof TLRPC$User) {
                    TLRPC$User tLRPC$User3 = (TLRPC$User) tLObject2;
                    if (tLRPC$User3.bot) {
                        arrayList.add(UItem.asAddChat(Long.valueOf(tLRPC$User3.id)));
                        this.foundBots.put(tLRPC$User3.id, tLRPC$User3);
                        z = true;
                    }
                }
            }
            if (this.foundBots.size() <= 0 && (!TextUtils.isEmpty(this.editText.getText().toString()) || this.searchHelper.isSearchInProgress() || this.scheduledLoading)) {
                arrayList.add(UItem.asCustom(this.emptyView));
                z = true;
            }
            this.editTextDivider.setVisibility(z ? 0 : 8);
            universalAdapter.whiteSectionEnd();
        }
        arrayList.add(UItem.asShadow(LocaleController.getString(R.string.BusinessBotLinkInfo)));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BusinessBotChats)));
        arrayList.add(UItem.asRadio(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept)).setChecked(this.exclude));
        arrayList.add(UItem.asRadio(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected)).setChecked(!this.exclude));
        arrayList.add(UItem.asShadow(null));
        this.recipientsHelper.fillItems(arrayList);
        arrayList.add(UItem.asShadow(LocaleController.getString(R.string.BusinessBotChatsInfo)));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BusinessBotPermissions)));
        arrayList.add(UItem.asCheck(-5, LocaleController.getString(R.string.BusinessBotPermissionsReply)).setChecked(this.allowReply));
        arrayList.add(UItem.asShadow(LocaleController.getString(R.string.BusinessBotPermissionsInfo)));
        arrayList.add(UItem.asShadow(null));
    }

    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        if (this.recipientsHelper.onClick(uItem)) {
            return;
        }
        int i2 = uItem.id;
        if (i2 == -1) {
            BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
            this.exclude = true;
            businessRecipientsHelper.setExclude(true);
            this.listView.adapter.update(true);
            checkDone(true);
        } else if (i2 == -2) {
            BusinessRecipientsHelper businessRecipientsHelper2 = this.recipientsHelper;
            this.exclude = false;
            businessRecipientsHelper2.setExclude(false);
            this.listView.adapter.update(true);
            checkDone(true);
        } else if (i2 == -5) {
            boolean z = !this.allowReply;
            this.allowReply = z;
            ((TextCheckCell) view).setChecked(z);
            checkDone(true);
        } else if (i2 == -6) {
            this.selectedBot = null;
            this.listView.adapter.update(true);
            checkDone(true);
        } else if (uItem.viewType == 10) {
            this.selectedBot = this.foundBots.get(uItem.dialogId);
            AndroidUtilities.hideKeyboard(this.editText);
            this.listView.adapter.update(true);
            checkDone(true);
        }
    }

    public void clear() {
        this.selectedBot = null;
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void processDone() {
        if (this.doneButtonDrawable.getProgress() > 0.0f) {
            return;
        }
        if (!hasChanges()) {
            finishFragment();
        } else if (this.recipientsHelper.validate(this.listView)) {
            TLRPC$TL_account_updateConnectedBot tLRPC$TL_account_updateConnectedBot = new TLRPC$TL_account_updateConnectedBot();
            if (this.selectedBot == null) {
                tLRPC$TL_account_updateConnectedBot.deleted = true;
                tLRPC$TL_account_updateConnectedBot.bot = new TLRPC$TL_inputUserEmpty();
                tLRPC$TL_account_updateConnectedBot.recipients = new TLRPC$TL_inputBusinessRecipients();
            } else {
                tLRPC$TL_account_updateConnectedBot.can_reply = this.allowReply;
                tLRPC$TL_account_updateConnectedBot.bot = getMessagesController().getInputUser(this.selectedBot);
                tLRPC$TL_account_updateConnectedBot.recipients = this.recipientsHelper.getInputValue();
                TLRPC$TL_connectedBot tLRPC$TL_connectedBot = this.currentBot;
                if (tLRPC$TL_connectedBot != null) {
                    tLRPC$TL_connectedBot.can_reply = this.allowReply;
                    tLRPC$TL_connectedBot.bot_id = this.selectedBot.id;
                    tLRPC$TL_connectedBot.recipients = this.recipientsHelper.getValue();
                }
            }
            getConnectionsManager().sendRequest(tLRPC$TL_account_updateConnectedBot, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChatbotsActivity.this.lambda$processDone$5(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$processDone$5(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatbotsActivity.this.lambda$processDone$4(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$processDone$4(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$Updates) {
            getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
        }
        if (tLRPC$TL_error != null) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.showError(tLRPC$TL_error);
            return;
        }
        BusinessChatbotController.getInstance(this.currentAccount).invalidate();
        finishFragment();
    }

    private void setValue() {
        if (this.loading || this.valueSet) {
            return;
        }
        this.loading = true;
        BusinessChatbotController.getInstance(this.currentAccount).load(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatbotsActivity.this.lambda$setValue$6((TLRPC$TL_account_connectedBots) obj);
            }
        });
    }

    public void lambda$setValue$6(TLRPC$TL_account_connectedBots tLRPC$TL_account_connectedBots) {
        UniversalAdapter universalAdapter;
        this.currentValue = tLRPC$TL_account_connectedBots;
        TLRPC$TL_connectedBot tLRPC$TL_connectedBot = (tLRPC$TL_account_connectedBots == null || tLRPC$TL_account_connectedBots.connected_bots.isEmpty()) ? null : this.currentValue.connected_bots.get(0);
        this.currentBot = tLRPC$TL_connectedBot;
        this.selectedBot = tLRPC$TL_connectedBot == null ? null : getMessagesController().getUser(Long.valueOf(this.currentBot.bot_id));
        TLRPC$TL_connectedBot tLRPC$TL_connectedBot2 = this.currentBot;
        this.allowReply = tLRPC$TL_connectedBot2 != null ? tLRPC$TL_connectedBot2.can_reply : true;
        this.exclude = tLRPC$TL_connectedBot2 != null ? tLRPC$TL_connectedBot2.recipients.exclude_selected : true;
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        if (businessRecipientsHelper != null) {
            businessRecipientsHelper.setValue(tLRPC$TL_connectedBot2 != null ? tLRPC$TL_connectedBot2.recipients : null);
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(true);
        }
        checkDone(true);
        this.valueSet = true;
    }

    public boolean hasChanges() {
        if (this.valueSet) {
            TLRPC$User tLRPC$User = this.selectedBot;
            boolean z = tLRPC$User != null;
            TLRPC$TL_connectedBot tLRPC$TL_connectedBot = this.currentBot;
            if (z != (tLRPC$TL_connectedBot != null)) {
                return true;
            }
            if (tLRPC$User != null) {
                if (this.allowReply != tLRPC$TL_connectedBot.can_reply) {
                    return true;
                }
                BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
                if (businessRecipientsHelper != null && businessRecipientsHelper.hasChanges()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean onBackPressed() {
        if (hasChanges()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.UnsavedChanges));
            builder.setMessage(LocaleController.getString(R.string.BusinessBotUnsavedChanges));
            builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatbotsActivity.this.lambda$onBackPressed$7(dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatbotsActivity.this.lambda$onBackPressed$8(dialogInterface, i);
                }
            });
            showDialog(builder.create());
            return false;
        }
        return super.onBackPressed();
    }

    public void lambda$onBackPressed$7(DialogInterface dialogInterface, int i) {
        processDone();
    }

    public void lambda$onBackPressed$8(DialogInterface dialogInterface, int i) {
        finishFragment();
    }

    private void checkDone(boolean z) {
        if (this.doneButton == null) {
            return;
        }
        boolean hasChanges = hasChanges();
        this.doneButton.setEnabled(hasChanges);
        if (z) {
            this.doneButton.animate().alpha(hasChanges ? 1.0f : 0.0f).scaleX(hasChanges ? 1.0f : 0.0f).scaleY(hasChanges ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneButton.setAlpha(hasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleX(hasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleY(hasChanges ? 1.0f : 0.0f);
    }

    @Override
    public boolean onFragmentCreate() {
        setValue();
        return super.onFragmentCreate();
    }
}
