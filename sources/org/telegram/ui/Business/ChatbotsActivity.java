package org.telegram.ui.Business;

import android.content.Context;
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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.TextCheckCell2;
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
    private static final int BUTTON_DELETE = -3;
    private static final int PERMISSION_GIFTS = -15;
    private static final int PERMISSION_GIFTS_SELL = -17;
    private static final int PERMISSION_GIFTS_SETTINGS = -18;
    private static final int PERMISSION_GIFTS_TRANSFER = -19;
    private static final int PERMISSION_GIFTS_TRANSFER_STARS = -20;
    private static final int PERMISSION_GIFTS_VIEW = -16;
    private static final int PERMISSION_MESSAGES = -4;
    private static final int PERMISSION_MESSAGES_DELETE_RECEIVED = -9;
    private static final int PERMISSION_MESSAGES_DELETE_SENT = -8;
    private static final int PERMISSION_MESSAGES_MARK_AS_READ = -7;
    private static final int PERMISSION_MESSAGES_READ = -5;
    private static final int PERMISSION_MESSAGES_REPLY = -6;
    private static final int PERMISSION_PROFILE = -10;
    private static final int PERMISSION_PROFILE_BIO = -12;
    private static final int PERMISSION_PROFILE_NAME = -11;
    private static final int PERMISSION_PROFILE_PICTURE = -13;
    private static final int PERMISSION_PROFILE_USERNAME = -14;
    private static final int PERMISSION_STORIES = -21;
    private static final int RADIO_EXCLUDE = -1;
    private static final int RADIO_INCLUDE = -2;
    public TL_account.TL_connectedBot currentBot;
    public TL_account.connectedBots currentValue;
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
    private boolean shownGiftsPermissionsAlert;
    private boolean shownUsernamePermissionsAlert;
    private boolean valueSet;
    private boolean wasLoading;
    private int searchId = 0;
    private Runnable search = new Runnable() {
        @Override
        public final void run() {
            ChatbotsActivity.this.lambda$new$3();
        }
    };
    public TL_account.TL_businessBotRights rights = TL_account.TL_businessBotRights.makeDefault();
    private TLRPC.User selectedBot = null;
    private LongSparseArray foundBots = new LongSparseArray();
    private int shakeDp = -4;
    private boolean expandedMessagesSection = true;
    private boolean expandedProfileSection = false;
    private boolean expandedGiftsSection = false;

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
                        ChatbotsActivity.this.lambda$onBackPressed$355();
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
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, this.doneButtonDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
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
        FrameLayout frameLayout5 = new FrameLayout(context) {
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
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getThemedColor(i4)) {
            @Override
            public int getIntrinsicWidth() {
                return (int) (this.size + (this.thickness * 2.0f));
            }

            @Override
            public int getIntrinsicHeight() {
                return (int) (this.size + (this.thickness * 2.0f));
            }
        };
        this.emptyViewLoading.setScaleType(ImageView.ScaleType.CENTER);
        this.emptyViewLoading.setImageDrawable(circularProgressDrawable);
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
        TL_account.TL_connectedBot tL_connectedBot = this.currentBot;
        businessRecipientsHelper.setValue(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ChatbotsActivity.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                ChatbotsActivity.this.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, null);
        this.listView = universalRecyclerView;
        frameLayout.addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1.0f));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public boolean lambda$createView$0(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
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
        boolean z = true;
        if (this.wasLoading != (this.searchHelper.isSearchInProgress() || this.scheduledLoading || this.foundBots.size() > 0)) {
            if (!this.searchHelper.isSearchInProgress() && !this.scheduledLoading && this.foundBots.size() <= 0) {
                z = false;
            }
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
            } else {
                SearchAdapterHelper searchAdapterHelper = this.searchHelper;
                this.lastQuery = obj;
                int i = this.searchId;
                this.searchId = i + 1;
                searchAdapterHelper.queryServerSearch(obj, true, false, true, false, false, 0L, false, 0, i, 0L);
            }
        }
    }

    private void checkAlert(int i, boolean z, final Runnable runnable) {
        if (!this.shownUsernamePermissionsAlert && i == PERMISSION_PROFILE_USERNAME && z) {
            new AlertDialog.Builder(getContext(), getResourceProvider()).setTitle(LocaleController.getString(R.string.BusinessBotPermissionsWarning)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.selectedBot)))).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.Allow), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    ChatbotsActivity.this.lambda$checkAlert$4(runnable, alertDialog, i2);
                }
            }).makeRed(-1).show();
            return;
        }
        if (!this.shownGiftsPermissionsAlert && z && (i == PERMISSION_GIFTS_SELL || i == PERMISSION_GIFTS_SETTINGS || i == PERMISSION_GIFTS_TRANSFER || i == PERMISSION_GIFTS_TRANSFER_STARS)) {
            new AlertDialog.Builder(getContext(), getResourceProvider()).setTitle(LocaleController.getString(R.string.BusinessBotPermissionsWarning)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.selectedBot)))).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.Allow), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    ChatbotsActivity.this.lambda$checkAlert$5(runnable, alertDialog, i2);
                }
            }).makeRed(-1).show();
        } else {
            runnable.run();
        }
    }

    public void lambda$checkAlert$4(Runnable runnable, AlertDialog alertDialog, int i) {
        this.shownUsernamePermissionsAlert = true;
        runnable.run();
    }

    public void lambda$checkAlert$5(Runnable runnable, AlertDialog alertDialog, int i) {
        this.shownGiftsPermissionsAlert = true;
        runnable.run();
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asTopView(this.introText, "RestrictedEmoji", "🤖"));
        TLRPC.User user = this.selectedBot;
        boolean z = false;
        if (user != null) {
            arrayList.add(UItem.asAddChat(Long.valueOf(user.id)).setChecked(true).setCloseIcon(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatbotsActivity.this.clear(view);
                }
            }));
        } else {
            universalAdapter.whiteSectionStart();
            arrayList.add(UItem.asCustom(this.editTextContainer));
            this.foundBots.clear();
            boolean z2 = false;
            for (int i = 0; i < this.searchHelper.getLocalServerSearch().size(); i++) {
                TLObject tLObject = (TLObject) this.searchHelper.getLocalServerSearch().get(i);
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    if (user2.bot) {
                        arrayList.add(UItem.asAddChat(Long.valueOf(user2.id)));
                        this.foundBots.put(user2.id, user2);
                        z2 = true;
                    }
                }
            }
            for (int i2 = 0; i2 < this.searchHelper.getGlobalSearch().size(); i2++) {
                TLObject tLObject2 = (TLObject) this.searchHelper.getGlobalSearch().get(i2);
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) tLObject2;
                    if (user3.bot) {
                        arrayList.add(UItem.asAddChat(Long.valueOf(user3.id)));
                        this.foundBots.put(user3.id, user3);
                        z2 = true;
                    }
                }
            }
            if (this.foundBots.size() <= 0 && (!TextUtils.isEmpty(this.editText.getText().toString()) || this.searchHelper.isSearchInProgress() || this.scheduledLoading)) {
                arrayList.add(UItem.asCustom(this.emptyView));
                z2 = true;
            }
            this.editTextDivider.setVisibility(z2 ? 0 : 8);
            universalAdapter.whiteSectionEnd();
        }
        arrayList.add(UItem.asShadow(LocaleController.getString(R.string.BusinessBotLinkInfo)));
        if (this.selectedBot != null) {
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BusinessBotChats)));
            arrayList.add(UItem.asRadio(RADIO_EXCLUDE, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept)).setChecked(this.exclude));
            arrayList.add(UItem.asRadio(RADIO_INCLUDE, LocaleController.getString(R.string.BusinessChatsOnlySelected)).setChecked(!this.exclude));
            arrayList.add(UItem.asShadow(null));
            this.recipientsHelper.fillItems(arrayList);
            arrayList.add(UItem.asShadow(LocaleController.getString(R.string.BusinessBotChatsInfo)));
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BusinessBotPermissions)));
            int i3 = PERMISSION_MESSAGES;
            String string = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
            StringBuilder sb = new StringBuilder();
            TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
            sb.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
            sb.append("/5");
            UItem asExpandableSwitch = UItem.asExpandableSwitch(i3, string, sb.toString());
            TL_account.TL_businessBotRights tL_businessBotRights2 = this.rights;
            arrayList.add(asExpandableSwitch.setChecked(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages).setCollapsed(!this.expandedMessagesSection).setClickCallback(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatbotsActivity.this.lambda$fillItems$6(view);
                }
            }));
            if (this.expandedMessagesSection) {
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_MESSAGES_READ, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead)).setChecked(true).setEnabled(false).setPad(1));
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_MESSAGES_REPLY, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply)).setChecked(this.rights.reply).setPad(1));
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_MESSAGES_MARK_AS_READ, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead)).setChecked(this.rights.read_messages).setPad(1));
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_MESSAGES_DELETE_SENT, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent)).setChecked(this.rights.delete_sent_messages).setPad(1));
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_MESSAGES_DELETE_RECEIVED, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived)).setChecked(this.rights.delete_received_messages).setPad(1));
            }
            int i4 = PERMISSION_PROFILE;
            String string2 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
            StringBuilder sb2 = new StringBuilder();
            TL_account.TL_businessBotRights tL_businessBotRights3 = this.rights;
            sb2.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
            sb2.append("/4");
            UItem asExpandableSwitch2 = UItem.asExpandableSwitch(i4, string2, sb2.toString());
            TL_account.TL_businessBotRights tL_businessBotRights4 = this.rights;
            arrayList.add(asExpandableSwitch2.setChecked(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username).setCollapsed(!this.expandedProfileSection).setClickCallback(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatbotsActivity.this.lambda$fillItems$8(view);
                }
            }));
            if (this.expandedProfileSection) {
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_PROFILE_NAME, LocaleController.getString(R.string.BusinessBotPermissionsProfileName)).setChecked(this.rights.edit_name).setPad(1));
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_PROFILE_BIO, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio)).setChecked(this.rights.edit_bio).setPad(1));
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_PROFILE_PICTURE, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture)).setChecked(this.rights.edit_profile_photo).setPad(1));
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_PROFILE_USERNAME, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername)).setChecked(this.rights.edit_username).setPad(1));
            }
            int i5 = PERMISSION_GIFTS;
            String string3 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
            StringBuilder sb3 = new StringBuilder();
            TL_account.TL_businessBotRights tL_businessBotRights5 = this.rights;
            sb3.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
            sb3.append("/5");
            UItem asExpandableSwitch3 = UItem.asExpandableSwitch(i5, string3, sb3.toString());
            TL_account.TL_businessBotRights tL_businessBotRights6 = this.rights;
            if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                z = true;
            }
            arrayList.add(asExpandableSwitch3.setChecked(z).setCollapsed(!this.expandedGiftsSection).setClickCallback(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatbotsActivity.this.lambda$fillItems$10(view);
                }
            }));
            if (this.expandedGiftsSection) {
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_GIFTS_VIEW, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView)).setChecked(this.rights.view_gifts).setPad(1));
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_GIFTS_SELL, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell)).setChecked(this.rights.sell_gifts).setPad(1));
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_GIFTS_SETTINGS, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings)).setChecked(this.rights.change_gift_settings).setPad(1));
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_GIFTS_TRANSFER, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer)).setChecked(this.rights.transfer_and_upgrade_gifts).setPad(1));
                arrayList.add(UItem.asRoundCheckbox(PERMISSION_GIFTS_TRANSFER_STARS, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars)).setChecked(this.rights.transfer_stars).setPad(1));
            }
            arrayList.add(UItem.asExpandableSwitch(PERMISSION_STORIES, LocaleController.getString(R.string.BusinessBotPermissionsStories), "").setChecked(this.rights.manage_stories).setClickCallback(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatbotsActivity.this.lambda$fillItems$11(view);
                }
            }));
            arrayList.add(UItem.asShadow(-4, null));
            arrayList.add(UItem.asShadow(-5, null));
            arrayList.add(UItem.asShadow(-6, null));
            arrayList.add(UItem.asShadow(-7, null));
        }
    }

    public void lambda$fillItems$6(View view) {
        TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
        if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
            tL_businessBotRights.delete_sent_messages = false;
            tL_businessBotRights.delete_received_messages = false;
            tL_businessBotRights.read_messages = false;
            tL_businessBotRights.reply = false;
        } else {
            tL_businessBotRights.delete_sent_messages = true;
            tL_businessBotRights.delete_received_messages = true;
            tL_businessBotRights.read_messages = true;
            tL_businessBotRights.reply = true;
        }
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void lambda$fillItems$8(View view) {
        TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
        if (tL_businessBotRights.edit_name && tL_businessBotRights.edit_bio && tL_businessBotRights.edit_profile_photo && tL_businessBotRights.edit_username) {
            tL_businessBotRights.edit_username = false;
            tL_businessBotRights.edit_profile_photo = false;
            tL_businessBotRights.edit_bio = false;
            tL_businessBotRights.edit_name = false;
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        checkAlert(PERMISSION_PROFILE_USERNAME, true, new Runnable() {
            @Override
            public final void run() {
                ChatbotsActivity.this.lambda$fillItems$7();
            }
        });
    }

    public void lambda$fillItems$7() {
        TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
        tL_businessBotRights.edit_username = true;
        tL_businessBotRights.edit_profile_photo = true;
        tL_businessBotRights.edit_bio = true;
        tL_businessBotRights.edit_name = true;
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void lambda$fillItems$10(View view) {
        TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
        if (tL_businessBotRights.view_gifts && tL_businessBotRights.sell_gifts && tL_businessBotRights.change_gift_settings && tL_businessBotRights.transfer_and_upgrade_gifts && tL_businessBotRights.transfer_stars) {
            tL_businessBotRights.transfer_stars = false;
            tL_businessBotRights.transfer_and_upgrade_gifts = false;
            tL_businessBotRights.change_gift_settings = false;
            tL_businessBotRights.sell_gifts = false;
            tL_businessBotRights.view_gifts = false;
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        checkAlert(PERMISSION_GIFTS_SELL, true, new Runnable() {
            @Override
            public final void run() {
                ChatbotsActivity.this.lambda$fillItems$9();
            }
        });
    }

    public void lambda$fillItems$9() {
        TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
        tL_businessBotRights.transfer_stars = true;
        tL_businessBotRights.transfer_and_upgrade_gifts = true;
        tL_businessBotRights.change_gift_settings = true;
        tL_businessBotRights.sell_gifts = true;
        tL_businessBotRights.view_gifts = true;
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void lambda$fillItems$11(View view) {
        this.rights.manage_stories = !r3.manage_stories;
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void onClick(UItem uItem, final View view, int i, float f, float f2) {
        if (this.recipientsHelper.onClick(uItem)) {
            return;
        }
        int i2 = uItem.id;
        if (i2 == RADIO_EXCLUDE) {
            BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
            this.exclude = true;
            businessRecipientsHelper.setExclude(true);
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == RADIO_INCLUDE) {
            BusinessRecipientsHelper businessRecipientsHelper2 = this.recipientsHelper;
            this.exclude = false;
            businessRecipientsHelper2.setExclude(false);
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == BUTTON_DELETE) {
            this.selectedBot = null;
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (uItem.viewType == 13) {
            TLRPC.User user = (TLRPC.User) this.foundBots.get(uItem.dialogId);
            if (user == null) {
                return;
            }
            if (!user.bot_business) {
                showDialog(new AlertDialog.Builder(getContext(), this.resourceProvider).setTitle(LocaleController.getString(R.string.BusinessBotNotSupportedTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage))).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
                return;
            }
            this.selectedBot = user;
            AndroidUtilities.hideKeyboard(this.editText);
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == PERMISSION_MESSAGES) {
            boolean z = !this.expandedMessagesSection;
            this.expandedMessagesSection = z;
            ((TextCheckCell2) view).setChecked(z);
            this.listView.adapter.update(true);
            return;
        }
        if (i2 == PERMISSION_MESSAGES_READ) {
            int i3 = -this.shakeDp;
            this.shakeDp = i3;
            AndroidUtilities.shakeViewSpring(view, i3);
            return;
        }
        if (i2 == PERMISSION_MESSAGES_REPLY) {
            TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
            boolean z2 = !tL_businessBotRights.reply;
            tL_businessBotRights.reply = z2;
            ((CheckBoxCell) view).setChecked(z2, true);
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == PERMISSION_MESSAGES_MARK_AS_READ) {
            TL_account.TL_businessBotRights tL_businessBotRights2 = this.rights;
            boolean z3 = !tL_businessBotRights2.read_messages;
            tL_businessBotRights2.read_messages = z3;
            ((CheckBoxCell) view).setChecked(z3, true);
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == PERMISSION_MESSAGES_DELETE_SENT) {
            TL_account.TL_businessBotRights tL_businessBotRights3 = this.rights;
            boolean z4 = !tL_businessBotRights3.delete_sent_messages;
            tL_businessBotRights3.delete_sent_messages = z4;
            ((CheckBoxCell) view).setChecked(z4, true);
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == PERMISSION_MESSAGES_DELETE_RECEIVED) {
            TL_account.TL_businessBotRights tL_businessBotRights4 = this.rights;
            boolean z5 = !tL_businessBotRights4.delete_received_messages;
            tL_businessBotRights4.delete_received_messages = z5;
            ((CheckBoxCell) view).setChecked(z5, true);
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == PERMISSION_PROFILE) {
            boolean z6 = !this.expandedProfileSection;
            this.expandedProfileSection = z6;
            ((TextCheckCell2) view).setChecked(z6);
            this.listView.adapter.update(true);
            return;
        }
        if (i2 == PERMISSION_PROFILE_NAME) {
            TL_account.TL_businessBotRights tL_businessBotRights5 = this.rights;
            boolean z7 = !tL_businessBotRights5.edit_name;
            tL_businessBotRights5.edit_name = z7;
            ((CheckBoxCell) view).setChecked(z7, true);
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == PERMISSION_PROFILE_BIO) {
            TL_account.TL_businessBotRights tL_businessBotRights6 = this.rights;
            boolean z8 = !tL_businessBotRights6.edit_bio;
            tL_businessBotRights6.edit_bio = z8;
            ((CheckBoxCell) view).setChecked(z8, true);
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == PERMISSION_PROFILE_PICTURE) {
            TL_account.TL_businessBotRights tL_businessBotRights7 = this.rights;
            boolean z9 = !tL_businessBotRights7.edit_profile_photo;
            tL_businessBotRights7.edit_profile_photo = z9;
            ((CheckBoxCell) view).setChecked(z9, true);
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == PERMISSION_PROFILE_USERNAME) {
            checkAlert(i2, !this.rights.edit_username, new Runnable() {
                @Override
                public final void run() {
                    ChatbotsActivity.this.lambda$onClick$12(view);
                }
            });
            return;
        }
        if (i2 == PERMISSION_GIFTS) {
            boolean z10 = !this.expandedGiftsSection;
            this.expandedGiftsSection = z10;
            ((TextCheckCell2) view).setChecked(z10);
            this.listView.adapter.update(true);
            return;
        }
        if (i2 == PERMISSION_GIFTS_VIEW) {
            checkAlert(i2, !this.rights.view_gifts, new Runnable() {
                @Override
                public final void run() {
                    ChatbotsActivity.this.lambda$onClick$13(view);
                }
            });
            return;
        }
        if (i2 == PERMISSION_GIFTS_SELL) {
            checkAlert(i2, !this.rights.sell_gifts, new Runnable() {
                @Override
                public final void run() {
                    ChatbotsActivity.this.lambda$onClick$14(view);
                }
            });
            return;
        }
        if (i2 == PERMISSION_GIFTS_SETTINGS) {
            checkAlert(i2, !this.rights.change_gift_settings, new Runnable() {
                @Override
                public final void run() {
                    ChatbotsActivity.this.lambda$onClick$15(view);
                }
            });
            return;
        }
        if (i2 == PERMISSION_GIFTS_TRANSFER) {
            checkAlert(i2, !this.rights.transfer_and_upgrade_gifts, new Runnable() {
                @Override
                public final void run() {
                    ChatbotsActivity.this.lambda$onClick$16(view);
                }
            });
        } else if (i2 == PERMISSION_GIFTS_TRANSFER_STARS) {
            checkAlert(i2, !this.rights.transfer_stars, new Runnable() {
                @Override
                public final void run() {
                    ChatbotsActivity.this.lambda$onClick$17(view);
                }
            });
        } else if (i2 == PERMISSION_STORIES) {
            checkAlert(i2, !this.rights.manage_stories, new Runnable() {
                @Override
                public final void run() {
                    ChatbotsActivity.this.lambda$onClick$18();
                }
            });
        }
    }

    public void lambda$onClick$12(View view) {
        TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
        boolean z = !tL_businessBotRights.edit_username;
        tL_businessBotRights.edit_username = z;
        ((CheckBoxCell) view).setChecked(z, true);
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void lambda$onClick$13(View view) {
        TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
        boolean z = !tL_businessBotRights.view_gifts;
        tL_businessBotRights.view_gifts = z;
        ((CheckBoxCell) view).setChecked(z, true);
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void lambda$onClick$14(View view) {
        TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
        boolean z = !tL_businessBotRights.sell_gifts;
        tL_businessBotRights.sell_gifts = z;
        ((CheckBoxCell) view).setChecked(z, true);
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void lambda$onClick$15(View view) {
        TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
        boolean z = !tL_businessBotRights.change_gift_settings;
        tL_businessBotRights.change_gift_settings = z;
        ((CheckBoxCell) view).setChecked(z, true);
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void lambda$onClick$16(View view) {
        TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
        boolean z = !tL_businessBotRights.transfer_and_upgrade_gifts;
        tL_businessBotRights.transfer_and_upgrade_gifts = z;
        ((CheckBoxCell) view).setChecked(z, true);
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void lambda$onClick$17(View view) {
        TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
        boolean z = !tL_businessBotRights.transfer_stars;
        tL_businessBotRights.transfer_stars = z;
        ((CheckBoxCell) view).setChecked(z, true);
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void lambda$onClick$18() {
        this.rights.manage_stories = !r0.manage_stories;
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void clear(View view) {
        this.selectedBot = null;
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void processDone() {
        TLRPC.User user;
        if (this.doneButtonDrawable.getProgress() > 0.0f) {
            return;
        }
        if (!hasChanges()) {
            lambda$onBackPressed$355();
            return;
        }
        if (this.recipientsHelper.validate(this.listView)) {
            final ArrayList arrayList = new ArrayList();
            TL_account.TL_connectedBot tL_connectedBot = this.currentBot;
            if (tL_connectedBot != null && ((user = this.selectedBot) == null || tL_connectedBot.bot_id != user.id)) {
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.deleted = true;
                updateconnectedbot.bot = getMessagesController().getInputUser(this.currentBot.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                arrayList.add(updateconnectedbot);
            }
            if (this.selectedBot != null) {
                TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                updateconnectedbot2.deleted = false;
                updateconnectedbot2.rights = this.rights;
                updateconnectedbot2.bot = getMessagesController().getInputUser(this.selectedBot);
                updateconnectedbot2.recipients = this.recipientsHelper.getBotInputValue();
                arrayList.add(updateconnectedbot2);
                TL_account.TL_connectedBot tL_connectedBot2 = this.currentBot;
                if (tL_connectedBot2 != null) {
                    tL_connectedBot2.bot_id = this.selectedBot.id;
                    tL_connectedBot2.recipients = this.recipientsHelper.getBotValue();
                    this.currentBot.rights = this.rights;
                }
            }
            if (arrayList.isEmpty()) {
                lambda$onBackPressed$355();
                return;
            }
            final int[] iArr = {0};
            for (int i = 0; i < arrayList.size(); i++) {
                getConnectionsManager().sendRequest((TLObject) arrayList.get(i), new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ChatbotsActivity.this.lambda$processDone$21(iArr, arrayList, tLObject, tL_error);
                    }
                });
            }
        }
    }

    public void lambda$processDone$21(final int[] iArr, final ArrayList arrayList, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatbotsActivity.this.lambda$processDone$20(tL_error, tLObject, iArr, arrayList);
            }
        });
    }

    public void lambda$processDone$20(TLRPC.TL_error tL_error, final TLObject tLObject, int[] iArr, ArrayList arrayList) {
        if (tL_error != null) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.showError(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ChatbotsActivity.this.lambda$processDone$19(tLObject);
                }
            });
        }
        int i = iArr[0] + 1;
        iArr[0] = i;
        if (i == arrayList.size()) {
            BusinessChatbotController.getInstance(this.currentAccount).invalidate(true);
            getMessagesController().clearFullUsers();
            lambda$onBackPressed$355();
        }
    }

    public void lambda$processDone$19(TLObject tLObject) {
        MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
    }

    private void setValue() {
        if (this.loading || this.valueSet) {
            return;
        }
        this.loading = true;
        BusinessChatbotController.getInstance(this.currentAccount).load(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatbotsActivity.this.lambda$setValue$22((TL_account.connectedBots) obj);
            }
        });
    }

    public void lambda$setValue$22(TL_account.connectedBots connectedbots) {
        UniversalAdapter universalAdapter;
        this.currentValue = connectedbots;
        TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : this.currentValue.connected_bots.get(0);
        this.currentBot = tL_connectedBot;
        this.selectedBot = tL_connectedBot == null ? null : getMessagesController().getUser(Long.valueOf(this.currentBot.bot_id));
        TL_account.TL_connectedBot tL_connectedBot2 = this.currentBot;
        this.rights = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
        TL_account.TL_connectedBot tL_connectedBot3 = this.currentBot;
        this.exclude = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        if (businessRecipientsHelper != null) {
            businessRecipientsHelper.setValue(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(true);
        }
        checkDone(true);
        this.valueSet = true;
    }

    public boolean hasChanges() {
        if (!this.valueSet) {
            return false;
        }
        TLRPC.User user = this.selectedBot;
        boolean z = user != null;
        TL_account.TL_connectedBot tL_connectedBot = this.currentBot;
        if (z != (tL_connectedBot != null)) {
            return true;
        }
        if ((user == null ? 0L : user.id) != (tL_connectedBot != null ? tL_connectedBot.bot_id : 0L)) {
            return true;
        }
        if (user != null) {
            if (!this.rights.equals(tL_connectedBot.rights)) {
                return true;
            }
            BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
            if (businessRecipientsHelper != null && businessRecipientsHelper.hasChanges()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean onBackPressed() {
        if (hasChanges()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.UnsavedChanges));
            builder.setMessage(LocaleController.getString(R.string.BusinessBotUnsavedChanges));
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    ChatbotsActivity.this.lambda$onBackPressed$23(alertDialog, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    ChatbotsActivity.this.lambda$onBackPressed$24(alertDialog, i);
                }
            });
            showDialog(builder.create());
            return false;
        }
        return super.onBackPressed();
    }

    public void lambda$onBackPressed$23(AlertDialog alertDialog, int i) {
        processDone();
    }

    public void lambda$onBackPressed$24(AlertDialog alertDialog, int i) {
        lambda$onBackPressed$355();
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
