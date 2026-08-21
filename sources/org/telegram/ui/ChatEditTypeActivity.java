package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AdminedChannelCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.JoinToSendSettingsView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.TypefaceSpan;

public class ChatEditTypeActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ShadowSectionCell adminedInfoCell;
    private LinearLayout adminnedChannelsLayout;
    private boolean applyToAllInviteLinks;
    private long chatId;
    private int checkReqId;
    private Runnable checkRunnable;
    private TextInfoPrivacyCell checkTextView;
    private TLRPC.Chat currentChat;
    private ActionBarMenuItem doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    private ValueAnimator doneButtonDrawableAnimator;
    private EditTextBoldCursor editText;
    private ChangeUsernameActivity.UsernameCell editableUsernameCell;
    private Boolean editableUsernameUpdated;
    private Boolean editableUsernameWasActive;
    private HeaderCell headerCell;
    private HeaderCell headerCell2;
    private boolean ignoreScroll;
    private boolean ignoreTextChanges;
    private TLRPC.ChatFull info;
    private TextInfoPrivacyCell infoCell;
    private TLRPC.TL_chatInviteExported invite;
    private InviteLinkBottomSheet inviteLinkBottomSheet;
    private boolean isChannel;
    private boolean isForcePublic;
    private boolean isPrivate;
    private boolean isSaveRestricted;
    private JoinToSendSettingsView joinContainer;
    private String lastCheckName;
    private boolean lastNameAvailable;
    private LinearLayout linearLayout;
    private LinearLayout linearLayoutTypeContainer;
    private LinearLayout linkContainer;
    private LoadingCell loadingAdminedCell;
    private boolean loadingAdminedChannels;
    private boolean loadingInvite;
    private TextInfoPrivacyCell manageLinksInfoCell;
    private TextCell manageLinksTextView;
    private LinkActionView permanentLinkView;
    private LinearLayout privateContainer;
    private LinearLayout publicContainer;
    private RadioButtonCell radioButtonCell1;
    private RadioButtonCell radioButtonCell2;
    private LinearLayout saveContainer;
    private HeaderCell saveHeaderCell;
    private TextCheckCell saveRestrictCell;
    private TextInfoPrivacyCell saveRestrictInfoCell;
    private ShadowSectionCell sectionCell2;
    private TextSettingsCell textCell;
    private TextSettingsCell textCell2;
    private TextInfoPrivacyCell typeInfoCell;
    private EditTextBoldCursor usernameTextView;
    private UsernamesListView usernamesListView;
    private ArrayList editableUsernames = new ArrayList();
    private ArrayList usernames = new ArrayList();
    private ArrayList loadingUsernames = new ArrayList();
    private boolean canCreatePublic = true;
    private ArrayList adminedChannelCells = new ArrayList();
    HashMap usersMap = new HashMap();
    private Runnable enableDoneLoading = new Runnable() {
        @Override
        public final void run() {
            this.f$0.updateDoneProgress(true);
        }
    };
    private boolean deactivatingLinks = false;
    private boolean activatingEditableLink = false;

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public ChatEditTypeActivity(long j, boolean z) {
        this.chatId = j;
        this.isForcePublic = z;
    }

    @Override
    public boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditTypeActivity.onFragmentCreate():boolean");
    }

    public static void m1855$r8$lambda$oC6cqGKyzXK3g8xo92w1KKKrSU(final ChatEditTypeActivity chatEditTypeActivity, TLObject tLObject, final TLRPC.TL_error tL_error) {
        chatEditTypeActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditTypeActivity.$r8$lambda$rXxiQ_RMknhkfxOUSgKyNQuvxs0(this.f$0, tL_error);
            }
        });
    }

    public static void $r8$lambda$rXxiQ_RMknhkfxOUSgKyNQuvxs0(ChatEditTypeActivity chatEditTypeActivity, TLRPC.TL_error tL_error) {
        boolean z;
        if (tL_error != null) {
            chatEditTypeActivity.getClass();
            if (tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        chatEditTypeActivity.canCreatePublic = z;
        if (z || !chatEditTypeActivity.getUserConfig().isPremium()) {
            return;
        }
        chatEditTypeActivity.loadAdminedChannels();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public void onResume() {
        TLRPC.ChatFull chatFull;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TextSettingsCell textSettingsCell = this.textCell2;
        if (textSettingsCell != null && (chatFull = this.info) != null) {
            if (chatFull.stickerset != null) {
                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.GroupStickers), this.info.stickerset.title, false);
            } else {
                textSettingsCell.setText(LocaleController.getString(R.string.GroupStickers), false);
            }
        }
        TLRPC.ChatFull chatFull2 = this.info;
        if (chatFull2 != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull2.exported_invite;
            this.invite = tL_chatInviteExported;
            this.permanentLinkView.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.permanentLinkView.loadUsers(this.invite, this.chatId);
        }
    }

    @Override
    public void onBecomeFullyVisible() {
        EditTextBoldCursor editTextBoldCursor;
        super.onBecomeFullyVisible();
        if (!this.isForcePublic || (editTextBoldCursor = this.usernameTextView) == null) {
            return;
        }
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(this.usernameTextView);
    }

    @Override
    public View createView(final Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    ChatEditTypeActivity.this.finishFragment();
                } else if (i == 1) {
                    if (ChatEditTypeActivity.this.doneButtonDrawable == null || ChatEditTypeActivity.this.doneButtonDrawable.getProgress() <= 0.0f) {
                        ChatEditTypeActivity.this.processDone();
                    }
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.MULTIPLY));
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(i)));
        this.doneButtonDrawable = crossfadeDrawable;
        this.doneButton = actionBarMenuCreateMenu.addItemWithWidth(1, crossfadeDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
        this.linearLayout = new SectionsScrollView.SectionsLinearLayout(context);
        SectionsScrollView sectionsScrollView = new SectionsScrollView(context, this.linearLayout, this.resourceProvider, false) {
            @Override
            public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                rect.bottom += AndroidUtilities.dp(60.0f);
                return super.requestChildRectangleOnScreen(view, rect, z);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return super.onTouchEvent(motionEvent);
                }
                return !ChatEditTypeActivity.this.ignoreScroll && super.onTouchEvent(motionEvent);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return !ChatEditTypeActivity.this.ignoreScroll && super.onInterceptTouchEvent(motionEvent);
            }
        };
        this.fragmentView = sectionsScrollView;
        sectionsScrollView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        SectionsScrollView sectionsScrollView2 = (SectionsScrollView) this.fragmentView;
        sectionsScrollView2.setFillViewport(true);
        sectionsScrollView2.addView(this.linearLayout, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(sectionsScrollView2);
        this.linearLayout.setOrientation(1);
        if (this.isForcePublic) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.isChannel) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayoutTypeContainer = linearLayout;
        linearLayout.setOrientation(1);
        this.linearLayout.addView(this.linearLayoutTypeContainer, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell = new HeaderCell(context, 23);
        this.headerCell2 = headerCell;
        headerCell.setHeight(46);
        if (this.isChannel) {
            this.headerCell2.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.headerCell2.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.linearLayoutTypeContainer.addView(this.headerCell2);
        RadioButtonCell radioButtonCell = new RadioButtonCell(context);
        this.radioButtonCell2 = radioButtonCell;
        if (this.isChannel) {
            radioButtonCell.setTextAndValue(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.isPrivate);
        } else {
            radioButtonCell.setTextAndValue(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.isPrivate);
        }
        this.linearLayoutTypeContainer.addView(this.radioButtonCell2, LayoutHelper.createLinear(-1, -2));
        this.radioButtonCell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatEditTypeActivity.m1854$r8$lambda$l9ExsINfMeyv7lcVOCLK22TuDY(this.f$0, view);
            }
        });
        RadioButtonCell radioButtonCell2 = new RadioButtonCell(context);
        this.radioButtonCell1 = radioButtonCell2;
        if (this.isChannel) {
            radioButtonCell2.setTextAndValue(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.isPrivate);
        } else {
            radioButtonCell2.setTextAndValue(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.isPrivate);
        }
        this.linearLayoutTypeContainer.addView(this.radioButtonCell1, LayoutHelper.createLinear(-1, -2));
        this.radioButtonCell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatEditTypeActivity.$r8$lambda$Na6wOj_y1VuZEfDktk7JyJEMdBA(this.f$0, view);
            }
        });
        ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context);
        this.sectionCell2 = shadowSectionCell;
        this.linearLayout.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
        if (this.isForcePublic) {
            this.radioButtonCell2.setVisibility(8);
            this.radioButtonCell1.setVisibility(8);
            this.sectionCell2.setVisibility(8);
            this.headerCell2.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.linkContainer = linearLayout2;
        linearLayout2.setOrientation(1);
        this.linearLayout.addView(this.linkContainer, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell2 = new HeaderCell(context, 23);
        this.headerCell = headerCell2;
        this.linkContainer.addView(headerCell2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.publicContainer = linearLayout3;
        linearLayout3.setOrientation(0);
        this.linkContainer.addView(this.publicContainer, LayoutHelper.createLinear(-1, 36, 23.0f, 7.0f, 23.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.editText = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.editText.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.editText;
        int i2 = Theme.key_windowBackgroundWhiteHintText;
        editTextBoldCursor2.setHintTextColor(Theme.getColor(i2));
        EditTextBoldCursor editTextBoldCursor3 = this.editText;
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor3.setTextColor(Theme.getColor(i3));
        this.editText.setMaxLines(1);
        this.editText.setLines(1);
        this.editText.setEnabled(false);
        this.editText.setBackground(null);
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setSingleLine(true);
        this.editText.setInputType(163840);
        this.editText.setImeOptions(6);
        this.publicContainer.addView(this.editText, LayoutHelper.createLinear(-2, 36));
        EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) getText());
                if (ChatEditTypeActivity.this.checkTextView != null && ChatEditTypeActivity.this.checkTextView.getTextView() != null && !TextUtils.isEmpty(ChatEditTypeActivity.this.checkTextView.getTextView().getText())) {
                    sb.append("\n");
                    sb.append(ChatEditTypeActivity.this.checkTextView.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb);
            }
        };
        this.usernameTextView = editTextBoldCursor4;
        editTextBoldCursor4.setTextSize(1, 18.0f);
        this.usernameTextView.setHintTextColor(Theme.getColor(i2));
        this.usernameTextView.setTextColor(Theme.getColor(i3));
        this.usernameTextView.setMaxLines(1);
        this.usernameTextView.setLines(1);
        this.usernameTextView.setBackground(null);
        this.usernameTextView.setPadding(0, 0, 0, 0);
        this.usernameTextView.setSingleLine(true);
        this.usernameTextView.setInputType(163872);
        this.usernameTextView.setImeOptions(6);
        this.usernameTextView.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.usernameTextView.setCursorColor(Theme.getColor(i3));
        this.usernameTextView.setCursorSize(AndroidUtilities.dp(20.0f));
        this.usernameTextView.setCursorWidth(1.5f);
        this.publicContainer.addView(this.usernameTextView, LayoutHelper.createLinear(-1, 36));
        this.usernameTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                if (ChatEditTypeActivity.this.ignoreTextChanges) {
                    return;
                }
                String string = ChatEditTypeActivity.this.usernameTextView.getText().toString();
                if (ChatEditTypeActivity.this.editableUsernameCell != null) {
                    ChatEditTypeActivity.this.editableUsernameCell.updateUsername(string);
                }
                ChatEditTypeActivity.this.checkUserName(string);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                ChatEditTypeActivity.this.checkDoneButton();
            }
        });
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.privateContainer = linearLayout4;
        linearLayout4.setOrientation(1);
        this.linkContainer.addView(this.privateContainer, LayoutHelper.createLinear(-1, -2));
        LinkActionView linkActionView = new LinkActionView(context, this, null, this.chatId, true, ChatObject.isChannel(this.currentChat));
        this.permanentLinkView = linkActionView;
        linkActionView.setDelegate(new LinkActionView.Delegate() {
            @Override
            public void editLink() {
                LinkActionView.Delegate.CC.$default$editLink(this);
            }

            @Override
            public void removeLink() {
                LinkActionView.Delegate.CC.$default$removeLink(this);
            }

            @Override
            public void revokeLink() {
                ChatEditTypeActivity.this.generateLink(true);
            }

            @Override
            public void showUsersForPermanentLink() {
                ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                Context context2 = context;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = ChatEditTypeActivity.this.invite;
                TLRPC.ChatFull chatFull = ChatEditTypeActivity.this.info;
                ChatEditTypeActivity chatEditTypeActivity2 = ChatEditTypeActivity.this;
                chatEditTypeActivity.inviteLinkBottomSheet = new InviteLinkBottomSheet(context2, tL_chatInviteExported, chatFull, chatEditTypeActivity2.usersMap, chatEditTypeActivity2, chatEditTypeActivity2.chatId, true, ChatObject.isChannel(ChatEditTypeActivity.this.currentChat));
                ChatEditTypeActivity.this.inviteLinkBottomSheet.show();
            }
        });
        this.permanentLinkView.setUsers(0, null, false);
        this.privateContainer.addView(this.permanentLinkView);
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(context, 12, this.resourceProvider);
        this.checkTextView = anonymousClass6;
        anonymousClass6.setBottomPadding(6);
        this.linearLayout.addView(this.checkTextView, LayoutHelper.createLinear(-2, -2));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.typeInfoCell = textInfoPrivacyCell;
        textInfoPrivacyCell.setImportantForAccessibility(1);
        this.linearLayout.addView(this.typeInfoCell, LayoutHelper.createLinear(-1, -2));
        LoadingCell loadingCell = new LoadingCell(context);
        this.loadingAdminedCell = loadingCell;
        this.linearLayout.addView(loadingCell, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.adminnedChannelsLayout = linearLayout5;
        linearLayout5.setOrientation(1);
        this.linearLayout.addView(this.adminnedChannelsLayout, LayoutHelper.createLinear(-1, -2));
        ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context);
        this.adminedInfoCell = shadowSectionCell2;
        this.linearLayout.addView(shadowSectionCell2, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout6 = this.linearLayout;
        UsernamesListView usernamesListView = new UsernamesListView(context);
        this.usernamesListView = usernamesListView;
        linearLayout6.addView(usernamesListView, LayoutHelper.createLinear(-1, -2));
        this.usernamesListView.setVisibility((this.isPrivate || this.usernames.isEmpty()) ? 8 : 0);
        TextCell textCell = new TextCell(context);
        this.manageLinksTextView = textCell;
        textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.ManageInviteLinks), R.drawable.msg_link2, false);
        this.manageLinksTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatEditTypeActivity.$r8$lambda$iYwr6fkDLrItBkfHF2gZvqveIVw(this.f$0, view);
            }
        });
        this.linearLayout.addView(this.manageLinksTextView, LayoutHelper.createLinear(-1, -2));
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.manageLinksInfoCell = textInfoPrivacyCell2;
        this.linearLayout.addView(textInfoPrivacyCell2, LayoutHelper.createLinear(-1, -2));
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context, this.currentChat, context);
        this.joinContainer = anonymousClass7;
        TLRPC.ChatFull chatFull = this.info;
        anonymousClass7.showJoinToSend((chatFull == null || chatFull.linked_chat_id == 0 || this.isChannel) ? false : true);
        this.joinContainer.setFullInfo(this, this.info);
        this.linearLayout.addView(this.joinContainer);
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.saveContainer = linearLayout7;
        linearLayout7.setOrientation(1);
        this.linearLayout.addView(this.saveContainer);
        HeaderCell headerCell3 = new HeaderCell(context, 23);
        this.saveHeaderCell = headerCell3;
        headerCell3.setHeight(46);
        this.saveHeaderCell.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.saveContainer.addView(this.saveHeaderCell, LayoutHelper.createLinear(-1, -2));
        TextCheckCell textCheckCell = new TextCheckCell(context);
        this.saveRestrictCell = textCheckCell;
        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.RestrictSavingContent), this.isSaveRestricted, false);
        this.saveRestrictCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatEditTypeActivity.$r8$lambda$wTNCpGwZeEDRfnLokKTszZlt_hM(this.f$0, view);
            }
        });
        this.saveContainer.addView(this.saveRestrictCell, LayoutHelper.createLinear(-1, -2));
        this.saveRestrictInfoCell = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        if (this.isChannel && !ChatObject.isMegagroup(this.currentChat)) {
            this.saveRestrictInfoCell.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.saveRestrictInfoCell.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.saveContainer.addView(this.saveRestrictInfoCell, LayoutHelper.createLinear(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.currentChat, true);
        if (!this.isPrivate && publicUsername != null) {
            this.ignoreTextChanges = true;
            this.usernameTextView.setText(publicUsername);
            this.usernameTextView.setSelection(publicUsername.length());
            this.ignoreTextChanges = false;
        }
        updatePrivatePublic();
        return this.fragmentView;
    }

    public static void m1854$r8$lambda$l9ExsINfMeyv7lcVOCLK22TuDY(ChatEditTypeActivity chatEditTypeActivity, View view) {
        if (chatEditTypeActivity.isPrivate) {
            return;
        }
        chatEditTypeActivity.isPrivate = true;
        chatEditTypeActivity.updatePrivatePublic();
    }

    public static void $r8$lambda$Na6wOj_y1VuZEfDktk7JyJEMdBA(ChatEditTypeActivity chatEditTypeActivity, View view) {
        if (chatEditTypeActivity.isPrivate) {
            if (!chatEditTypeActivity.canCreatePublic) {
                chatEditTypeActivity.showPremiumIncreaseLimitDialog();
            } else {
                chatEditTypeActivity.isPrivate = false;
                chatEditTypeActivity.updatePrivatePublic();
            }
        }
    }

    class AnonymousClass6 extends TextInfoPrivacyCell {
        int prevHeight;
        ValueAnimator translateAnimator;

        AnonymousClass6(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context, i, resourcesProvider);
            this.prevHeight = -1;
        }

        @Override
        public void setText(CharSequence charSequence) {
            if (charSequence != 0) {
                charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                int iIndexOf = charSequence.toString().indexOf(10);
                if (iIndexOf >= 0) {
                    charSequence.replace(iIndexOf, iIndexOf + 1, " ");
                    charSequence.setSpan(new ForegroundColorSpan(ChatEditTypeActivity.this.getThemedColor(Theme.key_text_RedRegular)), 0, iIndexOf, 33);
                }
                TypefaceSpan[] typefaceSpanArr = (TypefaceSpan[]) charSequence.getSpans(0, charSequence.length(), TypefaceSpan.class);
                final String string = (ChatEditTypeActivity.this.usernameTextView == null || ChatEditTypeActivity.this.usernameTextView.getText() == null) ? "" : ChatEditTypeActivity.this.usernameTextView.getText().toString();
                for (int i = 0; i < typefaceSpanArr.length; i++) {
                    charSequence.setSpan(new ClickableSpan() {
                        @Override
                        public void onClick(View view) {
                            Browser.openUrl(AnonymousClass6.this.getContext(), "https://fragment.com/username/" + string);
                        }

                        @Override
                        public void updateDrawState(TextPaint textPaint) {
                            super.updateDrawState(textPaint);
                            textPaint.setUnderlineText(false);
                        }
                    }, charSequence.getSpanStart(typefaceSpanArr[i]), charSequence.getSpanEnd(typefaceSpanArr[i]), 33);
                    charSequence.removeSpan(typefaceSpanArr[i]);
                }
            }
            super.setText(charSequence);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.prevHeight != -1 && ChatEditTypeActivity.this.linearLayout != null) {
                final ArrayList arrayList = new ArrayList();
                boolean z2 = false;
                for (int i5 = 0; i5 < ChatEditTypeActivity.this.linearLayout.getChildCount(); i5++) {
                    View childAt = ChatEditTypeActivity.this.linearLayout.getChildAt(i5);
                    if (z2) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z2 = true;
                    }
                }
                final float height = this.prevHeight - getHeight();
                ValueAnimator valueAnimator = this.translateAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.translateAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ChatEditTypeActivity.AnonymousClass6.m1857$r8$lambda$5iypMHzfd2L8oljr3QXR7PEQpM(arrayList, height, valueAnimator2);
                    }
                });
                this.translateAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.translateAnimator.setDuration(350L);
                this.translateAnimator.start();
            }
            this.prevHeight = getHeight();
        }

        public static void m1857$r8$lambda$5iypMHzfd2L8oljr3QXR7PEQpM(ArrayList arrayList, float f, ValueAnimator valueAnimator) {
            float fFloatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (int i = 0; i < arrayList.size(); i++) {
                View view = (View) arrayList.get(i);
                if (view != null) {
                    view.setTranslationY(f * fFloatValue);
                }
            }
        }
    }

    public static void $r8$lambda$iYwr6fkDLrItBkfHF2gZvqveIVw(ChatEditTypeActivity chatEditTypeActivity, View view) {
        ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditTypeActivity.chatId, 0L, 0);
        manageLinksActivity.setInfo(chatEditTypeActivity.info, chatEditTypeActivity.invite);
        chatEditTypeActivity.presentFragment(manageLinksActivity);
    }

    class AnonymousClass7 extends JoinToSendSettingsView {
        final Context val$context;

        AnonymousClass7(Context context, TLRPC.Chat chat, Context context2) {
            super(context, chat);
            this.val$context = context2;
        }

        @Override
        public boolean onJoinRequestToggle(final boolean z, Runnable runnable) {
            int i;
            String str;
            if (!ChatEditTypeActivity.this.isPrivate || ChatEditTypeActivity.this.info == null || (i = ChatEditTypeActivity.this.info.invitesCount) == 0) {
                return true;
            }
            if (ChatEditTypeActivity.this.isChannel) {
                str = z ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel";
            } else {
                str = z ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.val$context, ((BaseFragment) ChatEditTypeActivity.this).resourceProvider);
            builder.setTitle(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i, new Object[0])));
            builder.setPositiveButton(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    ChatEditTypeActivity.AnonymousClass7.m1859$r8$lambda$rKFG_oUzek0ixz8vH3s_DZQoUM(this.f$0, z, alertDialog, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    ChatEditTypeActivity.AnonymousClass7.m1858$r8$lambda$d11mUTqKbJkRWJxFZ5M0FWeSew(this.f$0, z, alertDialog, i2);
                }
            });
            ChatEditTypeActivity.this.showDialog(builder.create());
            return false;
        }

        public static void m1859$r8$lambda$rKFG_oUzek0ixz8vH3s_DZQoUM(AnonymousClass7 anonymousClass7, boolean z, AlertDialog alertDialog, int i) {
            anonymousClass7.setJoinRequest(z);
            ChatEditTypeActivity.this.applyToAllInviteLinks = true;
        }

        public static void m1858$r8$lambda$d11mUTqKbJkRWJxFZ5M0FWeSew(AnonymousClass7 anonymousClass7, boolean z, AlertDialog alertDialog, int i) {
            anonymousClass7.setJoinRequest(z);
            ChatEditTypeActivity.this.applyToAllInviteLinks = false;
        }
    }

    public static void $r8$lambda$wTNCpGwZeEDRfnLokKTszZlt_hM(ChatEditTypeActivity chatEditTypeActivity, View view) {
        boolean z = !chatEditTypeActivity.isSaveRestricted;
        chatEditTypeActivity.isSaveRestricted = z;
        ((TextCheckCell) view).setChecked(z);
    }

    public void updateDoneProgress(boolean z) {
        if (!z) {
            AndroidUtilities.cancelRunOnUIThread(this.enableDoneLoading);
        }
        if (this.doneButtonDrawable != null) {
            ValueAnimator valueAnimator = this.doneButtonDrawableAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.doneButtonDrawable.getProgress(), z ? 1.0f : 0.0f);
            this.doneButtonDrawableAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ChatEditTypeActivity.$r8$lambda$S16o2zBas5HxI0r7LAq1BBT7kA4(this.f$0, valueAnimator2);
                }
            });
            this.doneButtonDrawableAnimator.setDuration((long) (Math.abs(this.doneButtonDrawable.getProgress() - (z ? 1.0f : 0.0f)) * 200.0f));
            this.doneButtonDrawableAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.doneButtonDrawableAnimator.start();
        }
    }

    public static void $r8$lambda$S16o2zBas5HxI0r7LAq1BBT7kA4(ChatEditTypeActivity chatEditTypeActivity, ValueAnimator valueAnimator) {
        chatEditTypeActivity.doneButtonDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        chatEditTypeActivity.doneButtonDrawable.invalidateSelf();
    }

    private void showPremiumIncreaseLimitDialog() {
        if (getParentActivity() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(this, getParentActivity(), 2, this.currentAccount, null);
        limitReachedBottomSheet.parentIsChannel = this.isChannel;
        limitReachedBottomSheet.onSuccessRunnable = new Runnable() {
            @Override
            public final void run() {
                ChatEditTypeActivity.$r8$lambda$EbbeOdPm0wjAN6Fe6JFkaRDG5cs(this.f$0);
            }
        };
        showDialog(limitReachedBottomSheet);
    }

    public static void $r8$lambda$EbbeOdPm0wjAN6Fe6JFkaRDG5cs(ChatEditTypeActivity chatEditTypeActivity) {
        chatEditTypeActivity.canCreatePublic = true;
        chatEditTypeActivity.updatePrivatePublic();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.chatId) {
                this.info = chatFull;
                this.invite = chatFull.exported_invite;
                updatePrivatePublic();
                return;
            }
            return;
        }
        if (i == NotificationCenter.dialogDeleted) {
            if ((-this.chatId) == ((Long) objArr[0]).longValue()) {
                INavigationLayout iNavigationLayout = this.parentLayout;
                if (iNavigationLayout != null && iNavigationLayout.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public void setInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            if (tL_chatInviteExported != null) {
                this.invite = tL_chatInviteExported;
            } else {
                generateLink(false);
            }
        }
    }

    public void processDone() {
        AndroidUtilities.runOnUIThread(this.enableDoneLoading, 200L);
        if (trySetUsername() && trySetRestrict() && tryUpdateJoinSettings()) {
            finishFragment();
        }
    }

    private boolean tryUpdateJoinSettings() {
        if (this.joinContainer == null) {
            return true;
        }
        if (getParentActivity() == null) {
            return false;
        }
        if (!this.isChannel && !ChatObject.isChannel(this.currentChat)) {
            JoinToSendSettingsView joinToSendSettingsView = this.joinContainer;
            if (joinToSendSettingsView.isJoinToSend || joinToSendSettingsView.isJoinRequest) {
                getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new MessagesStorage.LongCallback() {
                    @Override
                    public final void run(long j) {
                        ChatEditTypeActivity.m1856$r8$lambda$pyW6PG1P2pcMS8b8RhC_pu02dU(this.f$0, j);
                    }
                });
                return false;
            }
        }
        if (this.currentChat.join_to_send != this.joinContainer.isJoinToSend) {
            MessagesController messagesController = getMessagesController();
            long j = this.chatId;
            TLRPC.Chat chat = this.currentChat;
            boolean z = this.joinContainer.isJoinToSend;
            chat.join_to_send = z;
            messagesController.toggleChatJoinToSend(j, z, null, null);
        }
        if (this.currentChat.join_request != this.joinContainer.isJoinRequest || this.applyToAllInviteLinks) {
            MessagesController messagesController2 = getMessagesController();
            long j2 = this.chatId;
            TLRPC.Chat chat2 = this.currentChat;
            boolean z2 = this.joinContainer.isJoinRequest;
            chat2.join_request = z2;
            messagesController2.toggleChatJoinRequest(j2, 0L, z2, this.applyToAllInviteLinks, false, null, null);
        }
        return true;
    }

    public static void m1856$r8$lambda$pyW6PG1P2pcMS8b8RhC_pu02dU(ChatEditTypeActivity chatEditTypeActivity, long j) {
        if (j == 0) {
            chatEditTypeActivity.getClass();
            return;
        }
        chatEditTypeActivity.chatId = j;
        chatEditTypeActivity.currentChat = chatEditTypeActivity.getMessagesController().getChat(Long.valueOf(j));
        chatEditTypeActivity.processDone();
    }

    class UsernamesListView extends RecyclerListView {
        private final int VIEW_TYPE_HEADER;
        private final int VIEW_TYPE_HELP;
        private final int VIEW_TYPE_USERNAME;
        private Adapter adapter;
        private Paint backgroundPaint;
        private ItemTouchHelper itemTouchHelper;
        private LinearLayoutManager layoutManager;
        private boolean needReorder;

        public UsernamesListView(Context context) {
            super(context);
            this.VIEW_TYPE_HEADER = 0;
            this.VIEW_TYPE_USERNAME = 1;
            this.VIEW_TYPE_HELP = 2;
            this.needReorder = false;
            this.backgroundPaint = new Paint(1);
            Adapter adapter = new Adapter();
            this.adapter = adapter;
            setAdapter(adapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            this.layoutManager = linearLayoutManager;
            setLayoutManager(linearLayoutManager);
            setOnItemClickListener(new AnonymousClass1(ChatEditTypeActivity.this));
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new TouchHelperCallback());
            this.itemTouchHelper = itemTouchHelper;
            itemTouchHelper.attachToRecyclerView(this);
        }

        class AnonymousClass1 implements RecyclerListView.OnItemClickListener {
            final ChatEditTypeActivity val$this$0;

            AnonymousClass1(ChatEditTypeActivity chatEditTypeActivity) {
                this.val$this$0 = chatEditTypeActivity;
            }

            @Override
            public void onItemClick(final View view, int i) {
                final TLRPC.TL_username tL_username;
                if (!(view instanceof ChangeUsernameActivity.UsernameCell) || (tL_username = ((ChangeUsernameActivity.UsernameCell) view).currentUsername) == null) {
                    return;
                }
                if (tL_username.editable) {
                    ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                    View view2 = chatEditTypeActivity.fragmentView;
                    if (view2 instanceof ScrollView) {
                        ((ScrollView) view2).smoothScrollTo(0, chatEditTypeActivity.linkContainer.getTop() - AndroidUtilities.dp(128.0f));
                    }
                    ChatEditTypeActivity.this.usernameTextView.requestFocus();
                    AndroidUtilities.showKeyboard(ChatEditTypeActivity.this.usernameTextView);
                    return;
                }
                new AlertDialog.Builder(UsernamesListView.this.getContext(), ChatEditTypeActivity.this.getResourceProvider()).setTitle(LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink)).setMessage(LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage)).setPositiveButton(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        ChatEditTypeActivity.UsernamesListView.AnonymousClass1.m1864$r8$lambda$wHWyNemsPxOfmtYuAjLA5OVg(this.f$0, tL_username, view, alertDialog, i2);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        alertDialog.dismiss();
                    }
                }).show();
            }

            public static void m1864$r8$lambda$wHWyNemsPxOfmtYuAjLA5OVg(final AnonymousClass1 anonymousClass1, final TLRPC.TL_username tL_username, View view, AlertDialog alertDialog, int i) {
                anonymousClass1.getClass();
                if (tL_username.editable) {
                    if (ChatEditTypeActivity.this.editableUsernameWasActive == null) {
                        ChatEditTypeActivity.this.editableUsernameWasActive = Boolean.valueOf(tL_username.active);
                    }
                    ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                    boolean z = !tL_username.active;
                    tL_username.active = z;
                    chatEditTypeActivity.editableUsernameUpdated = Boolean.valueOf(z);
                } else {
                    final TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    tL_inputChannel.channel_id = ChatEditTypeActivity.this.currentChat.id;
                    tL_inputChannel.access_hash = ChatEditTypeActivity.this.currentChat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    final boolean z2 = tL_username.active;
                    tL_channels_toggleUsername.active = !z2;
                    ChatEditTypeActivity.this.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            ChatEditTypeActivity.UsernamesListView.AnonymousClass1.m1862$r8$lambda$YVSmlZ4h4F9LGbp_qpKOTOVHC4(this.f$0, tL_channels_toggleUsername, tL_username, z2, tLObject, tL_error);
                        }
                    });
                    ChatEditTypeActivity.this.loadingUsernames.add(tL_username.username);
                    ((ChangeUsernameActivity.UsernameCell) view).setLoading(true);
                }
                ChatEditTypeActivity.this.checkDoneButton();
            }

            public static void m1862$r8$lambda$YVSmlZ4h4F9LGbp_qpKOTOVHC4(final AnonymousClass1 anonymousClass1, final TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, final TLRPC.TL_username tL_username, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
                anonymousClass1.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatEditTypeActivity.UsernamesListView.AnonymousClass1.$r8$lambda$j2Hr4tpb7dcpNlMQzeoh2DEgoGY(this.f$0, tL_channels_toggleUsername, tLObject, tL_username, z, tL_error);
                    }
                });
            }

            public static void $r8$lambda$j2Hr4tpb7dcpNlMQzeoh2DEgoGY(final AnonymousClass1 anonymousClass1, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, final TLRPC.TL_username tL_username, final boolean z, TLRPC.TL_error tL_error) {
                ChatEditTypeActivity.this.loadingUsernames.remove(tL_channels_toggleUsername.username);
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    UsernamesListView.this.toggleUsername(tL_username, true ^ z);
                } else if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            ChatEditTypeActivity.UsernamesListView.AnonymousClass1 anonymousClass2 = this.f$0;
                            new AlertDialog.Builder(ChatEditTypeActivity.UsernamesListView.this.getContext(), ((RecyclerListView) ChatEditTypeActivity.UsernamesListView.this).resourcesProvider).setTitle(LocaleController.getString(R.string.UsernameActivateErrorTitle)).setMessage(LocaleController.getString(R.string.UsernameActivateErrorMessage)).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                                @Override
                                public final void onClick(AlertDialog alertDialog, int i) {
                                    ChatEditTypeActivity.UsernamesListView.AnonymousClass1.$r8$lambda$SSdU1t2PgxF37SewkINzYF3LsEM(anonymousClass2, tL_username, z, alertDialog, i);
                                }
                            }).show();
                        }
                    });
                } else {
                    UsernamesListView.this.toggleUsername(tL_username, z, true);
                    ChatEditTypeActivity.this.checkDoneButton();
                }
                ChatEditTypeActivity.this.getMessagesController().updateUsernameActiveness(ChatEditTypeActivity.this.currentChat, tL_username.username, tL_username.active);
            }

            public static void $r8$lambda$SSdU1t2PgxF37SewkINzYF3LsEM(AnonymousClass1 anonymousClass1, TLRPC.TL_username tL_username, boolean z, AlertDialog alertDialog, int i) {
                UsernamesListView.this.toggleUsername(tL_username, z, true);
                ChatEditTypeActivity.this.checkDoneButton();
            }
        }

        public void toggleUsername(TLRPC.TL_username tL_username, boolean z) {
            toggleUsername(tL_username, z, false);
        }

        public void toggleUsername(TLRPC.TL_username tL_username, boolean z, boolean z2) {
            for (int i = 0; i < ChatEditTypeActivity.this.usernames.size(); i++) {
                if (ChatEditTypeActivity.this.usernames.get(i) == tL_username) {
                    toggleUsername(i + 1, z, z2);
                    return;
                }
            }
        }

        public void toggleUsername(int i, boolean z, boolean z2) {
            TLRPC.TL_username tL_username;
            int iMin;
            int i2 = i - 1;
            if (i2 < 0 || i2 >= ChatEditTypeActivity.this.usernames.size() || (tL_username = (TLRPC.TL_username) ChatEditTypeActivity.this.usernames.get(i2)) == null) {
                return;
            }
            int i3 = -1;
            if (tL_username.active != z) {
                tL_username.active = z;
                if (z) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= ChatEditTypeActivity.this.usernames.size()) {
                            i4 = -1;
                            break;
                        } else if (!((TLRPC.TL_username) ChatEditTypeActivity.this.usernames.get(i4)).active) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 >= 0) {
                        iMin = Math.max(0, i4 - 1);
                        i3 = iMin + 1;
                    }
                } else {
                    int i5 = -1;
                    for (int i6 = 0; i6 < ChatEditTypeActivity.this.usernames.size(); i6++) {
                        if (((TLRPC.TL_username) ChatEditTypeActivity.this.usernames.get(i6)).active) {
                            i5 = i6;
                        }
                    }
                    if (i5 >= 0) {
                        iMin = Math.min(ChatEditTypeActivity.this.usernames.size() - 1, i5 + 1);
                        i3 = iMin + 1;
                    }
                }
            }
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (getChildAdapterPosition(childAt) == i) {
                    if (z2) {
                        AndroidUtilities.shakeView(childAt);
                    }
                    if (!(childAt instanceof ChangeUsernameActivity.UsernameCell)) {
                        break;
                    }
                    ChangeUsernameActivity.UsernameCell usernameCell = (ChangeUsernameActivity.UsernameCell) childAt;
                    usernameCell.setLoading(ChatEditTypeActivity.this.loadingUsernames.contains(tL_username.username));
                    usernameCell.update();
                    break;
                }
            }
            if (i3 < 0 || i == i3) {
                return;
            }
            this.adapter.moveElement(i, i3);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }

        public class TouchHelperCallback extends ItemTouchHelper.Callback {
            @Override
            public boolean isLongPressDragEnabled() {
                return true;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            }

            public TouchHelperCallback() {
            }

            @Override
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                if (viewHolder.getItemViewType() != 1 || !((ChangeUsernameActivity.UsernameCell) viewHolder.itemView).active) {
                    return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                }
                return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
            }

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
                    return false;
                }
                View view = viewHolder2.itemView;
                if ((view instanceof ChangeUsernameActivity.UsernameCell) && !((ChangeUsernameActivity.UsernameCell) view).active) {
                    return false;
                }
                UsernamesListView.this.adapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
                return true;
            }

            @Override
            public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
                super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
            }

            @Override
            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
                if (i == 0) {
                    ChatEditTypeActivity.this.ignoreScroll = false;
                    UsernamesListView.this.sendReorder();
                } else {
                    ChatEditTypeActivity.this.ignoreScroll = true;
                    UsernamesListView.this.cancelClickRunnables(false);
                    viewHolder.itemView.setPressed(true);
                }
                super.onSelectedChanged(viewHolder, i);
            }

            @Override
            public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                super.clearView(recyclerView, viewHolder);
                viewHolder.itemView.setPressed(false);
            }
        }

        public void sendReorder() {
            if (!this.needReorder || ChatEditTypeActivity.this.currentChat == null) {
                return;
            }
            this.needReorder = false;
            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_inputChannel.channel_id = ChatEditTypeActivity.this.currentChat.id;
            tL_inputChannel.access_hash = ChatEditTypeActivity.this.currentChat.access_hash;
            tL_channels_reorderUsernames.channel = tL_inputChannel;
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < ChatEditTypeActivity.this.editableUsernames.size(); i++) {
                if (((TLRPC.TL_username) ChatEditTypeActivity.this.editableUsernames.get(i)).active) {
                    arrayList.add(((TLRPC.TL_username) ChatEditTypeActivity.this.editableUsernames.get(i)).username);
                }
            }
            for (int i2 = 0; i2 < ChatEditTypeActivity.this.usernames.size(); i2++) {
                if (((TLRPC.TL_username) ChatEditTypeActivity.this.usernames.get(i2)).active) {
                    arrayList.add(((TLRPC.TL_username) ChatEditTypeActivity.this.usernames.get(i2)).username);
                }
            }
            tL_channels_reorderUsernames.order = arrayList;
            ChatEditTypeActivity.this.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChatEditTypeActivity.UsernamesListView.m1860$r8$lambda$oQEsyq3f16mseGL6oDuSzZA71Y(tLObject, tL_error);
                }
            });
            updateChat();
        }

        public static void m1860$r8$lambda$oQEsyq3f16mseGL6oDuSzZA71Y(TLObject tLObject, TLRPC.TL_error tL_error) {
            boolean z = tLObject instanceof TLRPC.TL_boolTrue;
        }

        private void updateChat() {
            ChatEditTypeActivity.this.currentChat.usernames.clear();
            ChatEditTypeActivity.this.currentChat.usernames.addAll(ChatEditTypeActivity.this.editableUsernames);
            ChatEditTypeActivity.this.currentChat.usernames.addAll(ChatEditTypeActivity.this.usernames);
            ChatEditTypeActivity.this.getMessagesController().putChat(ChatEditTypeActivity.this.currentChat, true);
        }

        private class Adapter extends RecyclerListView.SelectionAdapter {
            private Adapter() {
            }

            public void swapElements(int i, int i2) {
                int i3 = i - 1;
                int i4 = i2 - 1;
                if (i3 >= ChatEditTypeActivity.this.usernames.size() || i4 >= ChatEditTypeActivity.this.usernames.size()) {
                    return;
                }
                if (i != i2) {
                    UsernamesListView.this.needReorder = true;
                }
                swapListElements(ChatEditTypeActivity.this.usernames, i3, i4);
                notifyItemMoved(i, i2);
                int size = ChatEditTypeActivity.this.usernames.size();
                if (i == size || i2 == size) {
                    notifyItemChanged(i, 3);
                    notifyItemChanged(i2, 3);
                }
            }

            private void swapListElements(List list, int i, int i2) {
                TLRPC.TL_username tL_username = (TLRPC.TL_username) list.get(i);
                list.set(i, (TLRPC.TL_username) list.get(i2));
                list.set(i2, tL_username);
            }

            public void moveElement(int i, int i2) {
                int i3 = i - 1;
                int i4 = i2 - 1;
                if (i3 >= ChatEditTypeActivity.this.usernames.size() || i4 >= ChatEditTypeActivity.this.usernames.size()) {
                    return;
                }
                ChatEditTypeActivity.this.usernames.add(i4, (TLRPC.TL_username) ChatEditTypeActivity.this.usernames.remove(i3));
                notifyItemMoved(i, i2);
                int i5 = 0;
                while (i5 < ChatEditTypeActivity.this.usernames.size()) {
                    i5++;
                    notifyItemChanged(i5);
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i == 0) {
                    return new RecyclerListView.Holder(new HeaderCell(UsernamesListView.this.getContext(), ((RecyclerListView) UsernamesListView.this).resourcesProvider));
                }
                if (i == 1) {
                    return new RecyclerListView.Holder(new ChangeUsernameActivity.UsernameCell(UsernamesListView.this.getContext(), ((RecyclerListView) UsernamesListView.this).resourcesProvider) {
                        @Override
                        protected String getUsernameEditable() {
                            if (ChatEditTypeActivity.this.usernameTextView == null) {
                                return null;
                            }
                            return ChatEditTypeActivity.this.usernameTextView.getText().toString();
                        }
                    });
                }
                if (i != 2) {
                    return null;
                }
                return new RecyclerListView.Holder(new TextInfoPrivacyCell(UsernamesListView.this.getContext(), 12, ((RecyclerListView) UsernamesListView.this).resourcesProvider));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int itemViewType = viewHolder.getItemViewType();
                if (itemViewType == 0) {
                    ((HeaderCell) viewHolder.itemView).setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, ((RecyclerListView) UsernamesListView.this).resourcesProvider));
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(R.string.UsernamesChannelHeader));
                    return;
                }
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    ((TextInfoPrivacyCell) viewHolder.itemView).setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    ((TextInfoPrivacyCell) viewHolder.itemView).setBackground(Theme.getThemedDrawableByKey(UsernamesListView.this.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    return;
                }
                TLRPC.TL_username tL_username = (TLRPC.TL_username) ChatEditTypeActivity.this.usernames.get(i - 1);
                if (((ChangeUsernameActivity.UsernameCell) viewHolder.itemView).editable) {
                    ChatEditTypeActivity.this.editableUsernameCell = null;
                }
                ((ChangeUsernameActivity.UsernameCell) viewHolder.itemView).set(tL_username, i < ChatEditTypeActivity.this.usernames.size(), false);
                if (tL_username == null || !tL_username.editable) {
                    return;
                }
                ChatEditTypeActivity.this.editableUsernameCell = (ChangeUsernameActivity.UsernameCell) viewHolder.itemView;
            }

            @Override
            public int getItemViewType(int i) {
                if (i == 0) {
                    return 0;
                }
                return i <= ChatEditTypeActivity.this.usernames.size() ? 1 : 2;
            }

            @Override
            public int getItemCount() {
                return ChatEditTypeActivity.this.usernames.size() + 2;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.getItemViewType() == 1;
            }
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            int childAdapterPosition;
            int size = ChatEditTypeActivity.this.usernames.size();
            int iMin = Integer.MAX_VALUE;
            int iMax = Integer.MIN_VALUE;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != null && (childAdapterPosition = getChildAdapterPosition(childAt)) >= 1 && childAdapterPosition <= size) {
                    iMin = Math.min(childAt.getTop(), iMin);
                    iMax = Math.max(childAt.getBottom(), iMax);
                }
            }
            if (iMin < iMax) {
                this.backgroundPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, iMin, getWidth(), iMax, this.backgroundPaint);
            } else {
                canvas2 = canvas;
            }
            super.dispatchDraw(canvas2);
        }
    }

    private boolean trySetRestrict() {
        TLRPC.Chat chat = this.currentChat;
        if (chat.noforwards != this.isSaveRestricted) {
            if (!ChatObject.isChannel(chat)) {
                updateDoneProgress(true);
                getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new MessagesStorage.LongCallback() {
                    @Override
                    public final void run(long j) {
                        ChatEditTypeActivity.m1850$r8$lambda$K6lM78Ay9GIKrxPh3YZG_e0_wo(this.f$0, j);
                    }
                });
                return false;
            }
            MessagesController messagesController = getMessagesController();
            long j = -this.chatId;
            TLRPC.Chat chat2 = this.currentChat;
            boolean z = this.isSaveRestricted;
            chat2.noforwards = z;
            messagesController.toggleChatNoForwards(j, z);
        }
        return true;
    }

    public static void m1850$r8$lambda$K6lM78Ay9GIKrxPh3YZG_e0_wo(ChatEditTypeActivity chatEditTypeActivity, long j) {
        if (j == 0) {
            chatEditTypeActivity.getClass();
            return;
        }
        chatEditTypeActivity.chatId = j;
        chatEditTypeActivity.currentChat = chatEditTypeActivity.getMessagesController().getChat(Long.valueOf(j));
        MessagesController messagesController = chatEditTypeActivity.getMessagesController();
        long j2 = -chatEditTypeActivity.chatId;
        TLRPC.Chat chat = chatEditTypeActivity.currentChat;
        boolean z = chatEditTypeActivity.isSaveRestricted;
        chat.noforwards = z;
        messagesController.toggleChatNoForwards(j2, z);
        chatEditTypeActivity.processDone();
    }

    private boolean trySetUsername() {
        if (getParentActivity() == null) {
            return false;
        }
        String publicUsername = ChatObject.getPublicUsername(this.currentChat, true);
        if (!this.isPrivate && (((publicUsername == null && this.usernameTextView.length() != 0) || (publicUsername != null && !publicUsername.equalsIgnoreCase(this.usernameTextView.getText().toString()))) && this.usernameTextView.length() != 0 && !this.lastNameAvailable)) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.checkTextView);
            updateDoneProgress(false);
            return false;
        }
        if (publicUsername == null) {
            publicUsername = "";
        }
        String string = this.isPrivate ? "" : this.usernameTextView.getText().toString();
        if (publicUsername.equals(string)) {
            return tryDeactivateAllLinks();
        }
        if (!ChatObject.isChannel(this.currentChat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j) {
                    ChatEditTypeActivity.m1853$r8$lambda$_OJ5MNaQxDMKBqZd3647ikN7fg(this.f$0, j);
                }
            });
            return false;
        }
        getMessagesController().updateChannelUserName(this, this.chatId, string, new Runnable() {
            @Override
            public final void run() {
                ChatEditTypeActivity.$r8$lambda$WaSDWOBXT90FWcqMrsR7uW5Zh7g(this.f$0);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f$0.updateDoneProgress(false);
            }
        });
        return false;
    }

    public static void m1853$r8$lambda$_OJ5MNaQxDMKBqZd3647ikN7fg(ChatEditTypeActivity chatEditTypeActivity, long j) {
        if (j == 0) {
            chatEditTypeActivity.getClass();
            return;
        }
        chatEditTypeActivity.chatId = j;
        chatEditTypeActivity.currentChat = chatEditTypeActivity.getMessagesController().getChat(Long.valueOf(j));
        chatEditTypeActivity.processDone();
    }

    public static void $r8$lambda$WaSDWOBXT90FWcqMrsR7uW5Zh7g(ChatEditTypeActivity chatEditTypeActivity) {
        chatEditTypeActivity.currentChat = chatEditTypeActivity.getMessagesController().getChat(Long.valueOf(chatEditTypeActivity.chatId));
        chatEditTypeActivity.processDone();
    }

    private boolean tryDeactivateAllLinks() {
        ArrayList<TLRPC.TL_username> arrayList;
        if (!this.isPrivate || (arrayList = this.currentChat.usernames) == null || arrayList.isEmpty()) {
            return true;
        }
        if (this.deactivatingLinks) {
            return false;
        }
        this.deactivatingLinks = true;
        boolean z = false;
        for (int i = 0; i < this.currentChat.usernames.size(); i++) {
            TLRPC.TL_username tL_username = this.currentChat.usernames.get(i);
            if (tL_username != null && tL_username.active && !tL_username.editable) {
                z = true;
            }
        }
        if (z) {
            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
            tL_channels_deactivateAllUsernames.channel = MessagesController.getInputChannel(this.currentChat);
            getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChatEditTypeActivity.$r8$lambda$EWN8SR36POjGivx7t0TLuObncjY(this.f$0, tLObject, tL_error);
                }
            });
        } else {
            this.deactivatingLinks = false;
        }
        return !z;
    }

    public static void $r8$lambda$EWN8SR36POjGivx7t0TLuObncjY(final ChatEditTypeActivity chatEditTypeActivity, final TLObject tLObject, TLRPC.TL_error tL_error) {
        chatEditTypeActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditTypeActivity.$r8$lambda$aNVxu4efxuOrdMfrA863068GbBg(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$aNVxu4efxuOrdMfrA863068GbBg(final ChatEditTypeActivity chatEditTypeActivity, TLObject tLObject) {
        chatEditTypeActivity.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            for (int i = 0; i < chatEditTypeActivity.currentChat.usernames.size(); i++) {
                TLRPC.TL_username tL_username = chatEditTypeActivity.currentChat.usernames.get(i);
                if (tL_username != null && tL_username.active && !tL_username.editable) {
                    tL_username.active = false;
                }
            }
        }
        chatEditTypeActivity.deactivatingLinks = false;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.processDone();
            }
        });
    }

    private void loadAdminedChannels() {
        if (this.loadingAdminedChannels || this.adminnedChannelsLayout == null) {
            return;
        }
        this.loadingAdminedChannels = true;
        updatePrivatePublic();
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatEditTypeActivity.m1848$r8$lambda$1YGscBEcJ1aXisPU3FemnL6sn8(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void m1848$r8$lambda$1YGscBEcJ1aXisPU3FemnL6sn8(final ChatEditTypeActivity chatEditTypeActivity, final TLObject tLObject, TLRPC.TL_error tL_error) {
        chatEditTypeActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditTypeActivity.$r8$lambda$fq_3qcKVf6jUhn7t1ahGpCCPylU(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$fq_3qcKVf6jUhn7t1ahGpCCPylU(final ChatEditTypeActivity chatEditTypeActivity, TLObject tLObject) {
        chatEditTypeActivity.loadingAdminedChannels = false;
        if (tLObject == null || chatEditTypeActivity.getParentActivity() == null) {
            return;
        }
        for (int i = 0; i < chatEditTypeActivity.adminedChannelCells.size(); i++) {
            chatEditTypeActivity.linearLayout.removeView((View) chatEditTypeActivity.adminedChannelCells.get(i));
        }
        chatEditTypeActivity.adminedChannelCells.clear();
        TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
        for (int i2 = 0; i2 < tL_messages_chats.chats.size(); i2++) {
            AdminedChannelCell adminedChannelCell = new AdminedChannelCell(chatEditTypeActivity.getParentActivity(), new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatEditTypeActivity.$r8$lambda$fq1IkpycLZm7TlaTz6gujCCxBfE(this.f$0, view);
                }
            }, false, 0);
            TLRPC.Chat chat = tL_messages_chats.chats.get(i2);
            boolean z = true;
            if (i2 != tL_messages_chats.chats.size() - 1) {
                z = false;
            }
            adminedChannelCell.setChannel(chat, z);
            chatEditTypeActivity.adminedChannelCells.add(adminedChannelCell);
            chatEditTypeActivity.adminnedChannelsLayout.addView(adminedChannelCell, LayoutHelper.createLinear(-1, 72));
        }
        chatEditTypeActivity.updatePrivatePublic();
    }

    public static void $r8$lambda$fq1IkpycLZm7TlaTz6gujCCxBfE(final ChatEditTypeActivity chatEditTypeActivity, View view) {
        chatEditTypeActivity.getClass();
        final TLRPC.Chat currentChannel = ((AdminedChannelCell) view.getParent()).getCurrentChannel();
        AlertDialog.Builder builder = new AlertDialog.Builder(chatEditTypeActivity.getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.AppName));
        if (chatEditTypeActivity.isChannel) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, chatEditTypeActivity.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, chatEditTypeActivity.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title)));
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                ChatEditTypeActivity.$r8$lambda$PMfFVTcznMl9Epa5Jbik7yUwnsE(this.f$0, currentChannel, alertDialog, i);
            }
        });
        chatEditTypeActivity.showDialog(builder.create());
    }

    public static void $r8$lambda$PMfFVTcznMl9Epa5Jbik7yUwnsE(final ChatEditTypeActivity chatEditTypeActivity, TLRPC.Chat chat, AlertDialog alertDialog, int i) {
        chatEditTypeActivity.getClass();
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        chatEditTypeActivity.getConnectionsManager().sendRequest(tL_channels_updateUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatEditTypeActivity.$r8$lambda$jZ7_SwBBtnlezv76fhVlv4HKRfA(this.f$0, tLObject, tL_error);
            }
        }, 64);
    }

    public static void $r8$lambda$jZ7_SwBBtnlezv76fhVlv4HKRfA(final ChatEditTypeActivity chatEditTypeActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        chatEditTypeActivity.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatEditTypeActivity.$r8$lambda$qYYRivnzllvtio3QiOKdcH6zIPs(this.f$0);
                }
            });
        }
    }

    public static void $r8$lambda$qYYRivnzllvtio3QiOKdcH6zIPs(ChatEditTypeActivity chatEditTypeActivity) {
        chatEditTypeActivity.canCreatePublic = true;
        if (chatEditTypeActivity.usernameTextView.length() > 0) {
            chatEditTypeActivity.checkUserName(chatEditTypeActivity.usernameTextView.getText().toString());
        }
        chatEditTypeActivity.updatePrivatePublic();
    }

    private void updatePrivatePublic() {
        if (this.sectionCell2 == null) {
            return;
        }
        int i = 8;
        if (!this.isPrivate && !this.canCreatePublic && getUserConfig().isPremium()) {
            this.typeInfoCell.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            TextInfoPrivacyCell textInfoPrivacyCell = this.typeInfoCell;
            int i2 = Theme.key_text_RedRegular;
            textInfoPrivacyCell.setTag(Integer.valueOf(i2));
            this.typeInfoCell.setTextColor(Theme.getColor(i2));
            this.linkContainer.setVisibility(8);
            this.checkTextView.setVisibility(8);
            this.sectionCell2.setVisibility(8);
            this.adminedInfoCell.setVisibility(0);
            if (this.loadingAdminedChannels) {
                this.loadingAdminedCell.setVisibility(0);
                this.adminnedChannelsLayout.setVisibility(8);
            } else {
                this.loadingAdminedCell.setVisibility(8);
                this.adminnedChannelsLayout.setVisibility(0);
            }
        } else {
            TextInfoPrivacyCell textInfoPrivacyCell2 = this.typeInfoCell;
            int i3 = Theme.key_windowBackgroundWhiteGrayText4;
            textInfoPrivacyCell2.setTag(Integer.valueOf(i3));
            this.typeInfoCell.setTextColor(Theme.getColor(i3));
            if (this.isForcePublic) {
                this.sectionCell2.setVisibility(8);
            } else {
                this.sectionCell2.setVisibility(0);
            }
            this.adminedInfoCell.setVisibility(8);
            this.adminnedChannelsLayout.setVisibility(8);
            this.linkContainer.setVisibility(0);
            this.loadingAdminedCell.setVisibility(8);
            if (this.isChannel) {
                this.typeInfoCell.setText(LocaleController.getString(this.isPrivate ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.headerCell.setText(LocaleController.getString(this.isPrivate ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.typeInfoCell.setText(LocaleController.getString(this.isPrivate ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.headerCell.setText(LocaleController.getString(this.isPrivate ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.publicContainer.setVisibility(this.isPrivate ? 8 : 0);
            this.privateContainer.setVisibility(this.isPrivate ? 0 : 8);
            this.saveContainer.setVisibility(0);
            this.manageLinksTextView.setVisibility(0);
            this.manageLinksInfoCell.setVisibility(0);
            this.linkContainer.setPadding(0, 0, 0, this.isPrivate ? 0 : AndroidUtilities.dp(7.0f));
            LinkActionView linkActionView = this.permanentLinkView;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
            linkActionView.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.permanentLinkView.loadUsers(this.invite, this.chatId);
            TextInfoPrivacyCell textInfoPrivacyCell3 = this.checkTextView;
            textInfoPrivacyCell3.setVisibility((this.isPrivate || textInfoPrivacyCell3.length() == 0) ? 8 : 0);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.chatId);
            this.manageLinksInfoCell.setText(LocaleController.getString((chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(this.chatId)))) ? R.string.ManageLinksInfoHelpPaid : R.string.ManageLinksInfoHelp));
        }
        this.radioButtonCell1.setChecked(!this.isPrivate, true);
        this.radioButtonCell2.setChecked(this.isPrivate, true);
        this.usernameTextView.clearFocus();
        JoinToSendSettingsView joinToSendSettingsView = this.joinContainer;
        if (joinToSendSettingsView != null) {
            joinToSendSettingsView.setVisibility((!this.isChannel || this.isPrivate) ? 0 : 8);
            JoinToSendSettingsView joinToSendSettingsView2 = this.joinContainer;
            TLRPC.ChatFull chatFull2 = this.info;
            joinToSendSettingsView2.showJoinToSend((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.isChannel) ? false : true);
        }
        UsernamesListView usernamesListView = this.usernamesListView;
        if (usernamesListView != null) {
            if (!this.isPrivate && !this.usernames.isEmpty()) {
                i = 0;
            }
            usernamesListView.setVisibility(i);
        }
        checkDoneButton();
    }

    public void checkDoneButton() {
        if (this.isPrivate || this.usernameTextView.length() > 0 || hasActiveLink()) {
            this.doneButton.setEnabled(true);
            this.doneButton.setAlpha(1.0f);
        } else {
            this.doneButton.setEnabled(false);
            this.doneButton.setAlpha(0.5f);
        }
    }

    public boolean hasActiveLink() {
        if (this.usernames == null) {
            return false;
        }
        for (int i = 0; i < this.usernames.size(); i++) {
            TLRPC.TL_username tL_username = (TLRPC.TL_username) this.usernames.get(i);
            if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkUserName(final String str) {
        if (str != null && str.length() > 0) {
            this.checkTextView.setVisibility(0);
        } else {
            this.checkTextView.setVisibility(8);
        }
        Runnable runnable = this.checkRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.checkRunnable = null;
            this.lastCheckName = null;
            if (this.checkReqId != 0) {
                getConnectionsManager().cancelRequest(this.checkReqId, true);
            }
        }
        this.lastNameAvailable = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalid));
                this.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (i == 0 && cCharAt >= '0' && cCharAt <= '9') {
                    if (this.isChannel) {
                        this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    } else {
                        this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                    }
                    this.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
                    return false;
                }
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalid));
                    this.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            if (this.isChannel) {
                this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidShort));
            } else {
                this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
            }
            this.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
            return false;
        }
        if (str.length() > 32) {
            this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidLong));
            this.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
            return false;
        }
        this.checkTextView.setText(LocaleController.getString(R.string.LinkChecking));
        this.checkTextView.setTextColorByKey(Theme.key_windowBackgroundWhiteGrayText8);
        this.lastCheckName = str;
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                ChatEditTypeActivity.$r8$lambda$v9qr6DRnhx65H2AVDwarHcqQQog(this.f$0, str);
            }
        };
        this.checkRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 300L);
        return true;
    }

    public static void $r8$lambda$v9qr6DRnhx65H2AVDwarHcqQQog(final ChatEditTypeActivity chatEditTypeActivity, final String str) {
        chatEditTypeActivity.getClass();
        final TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = chatEditTypeActivity.getMessagesController().getInputChannel(chatEditTypeActivity.chatId);
        chatEditTypeActivity.checkReqId = chatEditTypeActivity.getConnectionsManager().sendRequest(tL_channels_checkUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatEditTypeActivity.m1852$r8$lambda$XDkYciMPTJcdTwRUE2YaM2m9bQ(this.f$0, str, tL_channels_checkUsername, tLObject, tL_error);
            }
        }, 2);
    }

    public static void m1852$r8$lambda$XDkYciMPTJcdTwRUE2YaM2m9bQ(final ChatEditTypeActivity chatEditTypeActivity, final String str, final TLRPC.TL_channels_checkUsername tL_channels_checkUsername, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        chatEditTypeActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditTypeActivity.$r8$lambda$Lkm4bO5Q1jZjJ5L3KxVbXoQ18_I(this.f$0, str, tL_error, tLObject, tL_channels_checkUsername);
            }
        });
    }

    public static void $r8$lambda$Lkm4bO5Q1jZjJ5L3KxVbXoQ18_I(ChatEditTypeActivity chatEditTypeActivity, String str, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_checkUsername tL_channels_checkUsername) {
        chatEditTypeActivity.checkReqId = 0;
        String str2 = chatEditTypeActivity.lastCheckName;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            chatEditTypeActivity.checkTextView.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            chatEditTypeActivity.checkTextView.setTextColorByKey(Theme.key_windowBackgroundWhiteGreenText);
            chatEditTypeActivity.lastNameAvailable = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            chatEditTypeActivity.checkTextView.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            chatEditTypeActivity.checkTextView.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                chatEditTypeActivity.checkTextView.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                chatEditTypeActivity.checkTextView.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            chatEditTypeActivity.checkTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText8));
        } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            chatEditTypeActivity.canCreatePublic = false;
            chatEditTypeActivity.showPremiumIncreaseLimitDialog();
        } else {
            chatEditTypeActivity.checkTextView.setText(LocaleController.getString(R.string.LinkInUse));
            chatEditTypeActivity.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
        }
        chatEditTypeActivity.lastNameAvailable = false;
    }

    public void generateLink(final boolean z) {
        this.loadingInvite = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.chatId);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatEditTypeActivity.$r8$lambda$xRCZowAhCgH92KzrwhCfixSQqm4(this.f$0, z, tLObject, tL_error);
            }
        }), this.classGuid);
    }

    public static void $r8$lambda$xRCZowAhCgH92KzrwhCfixSQqm4(final ChatEditTypeActivity chatEditTypeActivity, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        chatEditTypeActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditTypeActivity.$r8$lambda$aiOEpbsSPHhubPyWhQRYXg8NTMM(this.f$0, tL_error, tLObject, z);
            }
        });
    }

    public static void $r8$lambda$aiOEpbsSPHhubPyWhQRYXg8NTMM(ChatEditTypeActivity chatEditTypeActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        if (tL_error == null) {
            chatEditTypeActivity.getClass();
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
            chatEditTypeActivity.invite = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = chatEditTypeActivity.info;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
            if (z) {
                if (chatEditTypeActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(chatEditTypeActivity.getParentActivity());
                builder.setMessage(LocaleController.getString(R.string.RevokeAlertNewLink));
                builder.setTitle(LocaleController.getString(R.string.RevokeLink));
                builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                chatEditTypeActivity.showDialog(builder.create());
            }
        }
        chatEditTypeActivity.loadingInvite = false;
        LinkActionView linkActionView = chatEditTypeActivity.permanentLinkView;
        if (linkActionView != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatEditTypeActivity.invite;
            linkActionView.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
            chatEditTypeActivity.permanentLinkView.loadUsers(chatEditTypeActivity.invite, chatEditTypeActivity.chatId);
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ChatEditTypeActivity.$r8$lambda$dfwIXEH5nd2NldRFrXlZB4SqHiw(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        int i = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.sectionCell2, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.infoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        int i2 = Theme.key_windowBackgroundWhiteGrayText4;
        arrayList.add(new ThemeDescription(this.infoCell, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        TextSettingsCell textSettingsCell = this.textCell;
        int i3 = ThemeDescription.FLAG_SELECTOR;
        int i4 = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(textSettingsCell, i3, null, null, null, null, i4));
        int i5 = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(this.textCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.textCell2, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i4));
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.textCell2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        arrayList.add(new ThemeDescription(this.usernameTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i6));
        EditTextBoldCursor editTextBoldCursor = this.usernameTextView;
        int i7 = ThemeDescription.FLAG_HINTTEXTCOLOR;
        int i8 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(editTextBoldCursor, i7, null, null, null, null, i8));
        LinearLayout linearLayout = this.linearLayoutTypeContainer;
        int i9 = ThemeDescription.FLAG_BACKGROUND;
        int i10 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(linearLayout, i9, null, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.linkContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i10));
        int i11 = Theme.key_windowBackgroundWhiteBlueHeader;
        arrayList.add(new ThemeDescription(this.headerCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i11));
        arrayList.add(new ThemeDescription(this.headerCell2, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i11));
        arrayList.add(new ThemeDescription(this.saveHeaderCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i11));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.saveRestrictCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.saveRestrictCell, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        arrayList.add(new ThemeDescription(this.saveRestrictCell, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.saveRestrictCell, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.checkTextView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.checkTextView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText8));
        arrayList.add(new ThemeDescription(this.checkTextView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGreenText));
        arrayList.add(new ThemeDescription(this.typeInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.typeInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.typeInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.manageLinksInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.manageLinksInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.manageLinksInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.saveRestrictInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.saveRestrictInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.saveRestrictInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.adminedInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.loadingAdminedCell, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i4));
        int i12 = Theme.key_radioBackground;
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i12));
        int i13 = Theme.key_radioBackgroundChecked;
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{RadioButtonCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        int i14 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{RadioButtonCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i14));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i12));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{RadioButtonCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{RadioButtonCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i14));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{AdminedChannelCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        int i15 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{AdminedChannelCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_LINKCOLOR, new Class[]{AdminedChannelCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteLinkText));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{AdminedChannelCell.class}, new String[]{"deleteButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, themeDescriptionDelegate, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.manageLinksTextView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.manageLinksTextView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        arrayList.add(new ThemeDescription(this.manageLinksTextView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
        return arrayList;
    }

    public static void $r8$lambda$dfwIXEH5nd2NldRFrXlZB4SqHiw(ChatEditTypeActivity chatEditTypeActivity) {
        LinearLayout linearLayout = chatEditTypeActivity.adminnedChannelsLayout;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = chatEditTypeActivity.adminnedChannelsLayout.getChildAt(i);
                if (childAt instanceof AdminedChannelCell) {
                    ((AdminedChannelCell) childAt).update();
                }
            }
        }
        chatEditTypeActivity.permanentLinkView.updateColors();
        InviteLinkBottomSheet inviteLinkBottomSheet = chatEditTypeActivity.inviteLinkBottomSheet;
        if (inviteLinkBottomSheet != null) {
            inviteLinkBottomSheet.updateColors();
        }
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i4);
        }
    }
}
