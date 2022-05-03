package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_channels_checkUsername;
import org.telegram.tgnet.TLRPC$TL_channels_getAdminedPublicChannels;
import org.telegram.tgnet.TLRPC$TL_channels_updateUsername;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_chats;
import org.telegram.tgnet.TLRPC$TL_messages_exportChatInvite;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
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
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;

public class ChatEditTypeActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ShadowSectionCell adminedInfoCell;
    private LinearLayout adminnedChannelsLayout;
    private long chatId;
    private int checkReqId;
    private Runnable checkRunnable;
    private TextInfoPrivacyCell checkTextView;
    private TLRPC$Chat currentChat;
    private ActionBarMenuItem doneButton;
    private EditTextBoldCursor editText;
    private HeaderCell headerCell;
    private HeaderCell headerCell2;
    private boolean ignoreTextChanges;
    private TLRPC$ChatFull info;
    private TextInfoPrivacyCell infoCell;
    private TLRPC$TL_chatInviteExported invite;
    private InviteLinkBottomSheet inviteLinkBottomSheet;
    private boolean isChannel;
    private boolean isForcePublic;
    private boolean isPrivate;
    private boolean isSaveRestricted;
    private String lastCheckName;
    private boolean lastNameAvailable;
    private LinearLayout linearLayout;
    private LinearLayout linearLayoutTypeContainer;
    private LinearLayout linkContainer;
    private LoadingCell loadingAdminedCell;
    private boolean loadingAdminedChannels;
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
    private boolean canCreatePublic = true;
    private ArrayList<AdminedChannelCell> adminedChannelCells = new ArrayList<>();
    HashMap<Long, TLRPC$User> usersMap = new HashMap<>();

    public ChatEditTypeActivity(long j, boolean z) {
        this.chatId = j;
        this.isForcePublic = z;
    }

    @Override
    public boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditTypeActivity.onFragmentCreate():boolean");
    }

    public void lambda$onFragmentCreate$1(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditTypeActivity.this.lambda$onFragmentCreate$0(tLRPC$TL_error);
            }
        });
    }

    public void lambda$onFragmentCreate$0(TLRPC$TL_error tLRPC$TL_error) {
        boolean z = tLRPC$TL_error == null || !tLRPC$TL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
        this.canCreatePublic = z;
        if (!z) {
            loadAdminedChannels();
        }
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public void onResume() {
        TLRPC$ChatFull tLRPC$ChatFull;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TextSettingsCell textSettingsCell = this.textCell2;
        if (!(textSettingsCell == null || (tLRPC$ChatFull = this.info) == null)) {
            if (tLRPC$ChatFull.stickerset != null) {
                textSettingsCell.setTextAndValue(LocaleController.getString("GroupStickers", R.string.GroupStickers), this.info.stickerset.title, false);
            } else {
                textSettingsCell.setText(LocaleController.getString("GroupStickers", R.string.GroupStickers), false);
            }
        }
        TLRPC$ChatFull tLRPC$ChatFull2 = this.info;
        if (tLRPC$ChatFull2 != null) {
            TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported = tLRPC$ChatFull2.exported_invite;
            this.invite = tLRPC$TL_chatInviteExported;
            this.permanentLinkView.setLink(tLRPC$TL_chatInviteExported == null ? null : tLRPC$TL_chatInviteExported.link);
            this.permanentLinkView.loadUsers(this.invite, this.chatId);
        }
    }

    @Override
    public void onBecomeFullyVisible() {
        EditTextBoldCursor editTextBoldCursor;
        super.onBecomeFullyVisible();
        if (this.isForcePublic && (editTextBoldCursor = this.usernameTextView) != null) {
            editTextBoldCursor.requestFocus();
            AndroidUtilities.showKeyboard(this.usernameTextView);
        }
    }

    @Override
    public View createView(final Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    ChatEditTypeActivity.this.finishFragment();
                } else if (i == 1) {
                    ChatEditTypeActivity.this.processDone();
                }
            }
        });
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, R.drawable.ic_done, AndroidUtilities.dp(56.0f), LocaleController.getString("Done", R.string.Done));
        ScrollView scrollView = new ScrollView(this, context) {
            @Override
            public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                rect.bottom += AndroidUtilities.dp(60.0f);
                return super.requestChildRectangleOnScreen(view, rect, z);
            }
        };
        this.fragmentView = scrollView;
        scrollView.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        ScrollView scrollView2 = (ScrollView) this.fragmentView;
        scrollView2.setFillViewport(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        scrollView2.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        this.linearLayout.setOrientation(1);
        if (this.isForcePublic) {
            this.actionBar.setTitle(LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup));
        } else if (this.isChannel) {
            this.actionBar.setTitle(LocaleController.getString("ChannelSettingsTitle", R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString("GroupSettingsTitle", R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.linearLayoutTypeContainer = linearLayout2;
        linearLayout2.setOrientation(1);
        this.linearLayoutTypeContainer.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        this.linearLayout.addView(this.linearLayoutTypeContainer, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell = new HeaderCell(context, 23);
        this.headerCell2 = headerCell;
        headerCell.setHeight(46);
        if (this.isChannel) {
            this.headerCell2.setText(LocaleController.getString("ChannelTypeHeader", R.string.ChannelTypeHeader));
        } else {
            this.headerCell2.setText(LocaleController.getString("GroupTypeHeader", R.string.GroupTypeHeader));
        }
        this.linearLayoutTypeContainer.addView(this.headerCell2);
        RadioButtonCell radioButtonCell = new RadioButtonCell(context);
        this.radioButtonCell2 = radioButtonCell;
        radioButtonCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
        if (this.isChannel) {
            this.radioButtonCell2.setTextAndValue(LocaleController.getString("ChannelPrivate", R.string.ChannelPrivate), LocaleController.getString("ChannelPrivateInfo", R.string.ChannelPrivateInfo), false, this.isPrivate);
        } else {
            this.radioButtonCell2.setTextAndValue(LocaleController.getString("MegaPrivate", R.string.MegaPrivate), LocaleController.getString("MegaPrivateInfo", R.string.MegaPrivateInfo), false, this.isPrivate);
        }
        this.linearLayoutTypeContainer.addView(this.radioButtonCell2, LayoutHelper.createLinear(-1, -2));
        this.radioButtonCell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatEditTypeActivity.this.lambda$createView$2(view);
            }
        });
        RadioButtonCell radioButtonCell2 = new RadioButtonCell(context);
        this.radioButtonCell1 = radioButtonCell2;
        radioButtonCell2.setBackgroundDrawable(Theme.getSelectorDrawable(false));
        if (this.isChannel) {
            this.radioButtonCell1.setTextAndValue(LocaleController.getString("ChannelPublic", R.string.ChannelPublic), LocaleController.getString("ChannelPublicInfo", R.string.ChannelPublicInfo), false, !this.isPrivate);
        } else {
            this.radioButtonCell1.setTextAndValue(LocaleController.getString("MegaPublic", R.string.MegaPublic), LocaleController.getString("MegaPublicInfo", R.string.MegaPublicInfo), false, !this.isPrivate);
        }
        this.linearLayoutTypeContainer.addView(this.radioButtonCell1, LayoutHelper.createLinear(-1, -2));
        this.radioButtonCell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatEditTypeActivity.this.lambda$createView$3(view);
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
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.linkContainer = linearLayout3;
        linearLayout3.setOrientation(1);
        this.linkContainer.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        this.linearLayout.addView(this.linkContainer, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell2 = new HeaderCell(context, 23);
        this.headerCell = headerCell2;
        this.linkContainer.addView(headerCell2);
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.publicContainer = linearLayout4;
        linearLayout4.setOrientation(0);
        this.linkContainer.addView(this.publicContainer, LayoutHelper.createLinear(-1, 36, 23.0f, 7.0f, 23.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.editText = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.editText.setTextSize(1, 18.0f);
        this.editText.setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText"));
        this.editText.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.editText.setMaxLines(1);
        this.editText.setLines(1);
        this.editText.setEnabled(false);
        this.editText.setBackgroundDrawable(null);
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setSingleLine(true);
        this.editText.setInputType(163840);
        this.editText.setImeOptions(6);
        this.publicContainer.addView(this.editText, LayoutHelper.createLinear(-2, 36));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.usernameTextView = editTextBoldCursor2;
        editTextBoldCursor2.setTextSize(1, 18.0f);
        this.usernameTextView.setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText"));
        this.usernameTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.usernameTextView.setMaxLines(1);
        this.usernameTextView.setLines(1);
        this.usernameTextView.setBackgroundDrawable(null);
        this.usernameTextView.setPadding(0, 0, 0, 0);
        this.usernameTextView.setSingleLine(true);
        this.usernameTextView.setInputType(163872);
        this.usernameTextView.setImeOptions(6);
        this.usernameTextView.setHint(LocaleController.getString("ChannelUsernamePlaceholder", R.string.ChannelUsernamePlaceholder));
        this.usernameTextView.setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.usernameTextView.setCursorSize(AndroidUtilities.dp(20.0f));
        this.usernameTextView.setCursorWidth(1.5f);
        this.publicContainer.addView(this.usernameTextView, LayoutHelper.createLinear(-1, 36));
        this.usernameTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!ChatEditTypeActivity.this.ignoreTextChanges) {
                    ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                    chatEditTypeActivity.checkUserName(chatEditTypeActivity.usernameTextView.getText().toString());
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                ChatEditTypeActivity.this.checkDoneButton();
            }
        });
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.privateContainer = linearLayout5;
        linearLayout5.setOrientation(1);
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
                TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported = ChatEditTypeActivity.this.invite;
                TLRPC$ChatFull tLRPC$ChatFull = ChatEditTypeActivity.this.info;
                ChatEditTypeActivity chatEditTypeActivity2 = ChatEditTypeActivity.this;
                chatEditTypeActivity.inviteLinkBottomSheet = new InviteLinkBottomSheet(context2, tLRPC$TL_chatInviteExported, tLRPC$ChatFull, chatEditTypeActivity2.usersMap, chatEditTypeActivity2, chatEditTypeActivity2.chatId, true, ChatObject.isChannel(ChatEditTypeActivity.this.currentChat));
                ChatEditTypeActivity.this.inviteLinkBottomSheet.show();
            }
        });
        this.permanentLinkView.setUsers(0, null);
        this.privateContainer.addView(this.permanentLinkView);
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
        this.checkTextView = textInfoPrivacyCell;
        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
        this.checkTextView.setBottomPadding(6);
        this.linearLayout.addView(this.checkTextView, LayoutHelper.createLinear(-2, -2));
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
        this.typeInfoCell = textInfoPrivacyCell2;
        this.linearLayout.addView(textInfoPrivacyCell2, LayoutHelper.createLinear(-1, -2));
        LoadingCell loadingCell = new LoadingCell(context);
        this.loadingAdminedCell = loadingCell;
        this.linearLayout.addView(loadingCell, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.adminnedChannelsLayout = linearLayout6;
        linearLayout6.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        this.adminnedChannelsLayout.setOrientation(1);
        this.linearLayout.addView(this.adminnedChannelsLayout, LayoutHelper.createLinear(-1, -2));
        ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context);
        this.adminedInfoCell = shadowSectionCell2;
        this.linearLayout.addView(shadowSectionCell2, LayoutHelper.createLinear(-1, -2));
        TextCell textCell = new TextCell(context);
        this.manageLinksTextView = textCell;
        textCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        this.manageLinksTextView.setTextAndIcon(LocaleController.getString("ManageInviteLinks", R.string.ManageInviteLinks), R.drawable.actions_link, false);
        this.manageLinksTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatEditTypeActivity.this.lambda$createView$4(view);
            }
        });
        this.linearLayout.addView(this.manageLinksTextView, LayoutHelper.createLinear(-1, -2));
        TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context);
        this.manageLinksInfoCell = textInfoPrivacyCell3;
        this.linearLayout.addView(textInfoPrivacyCell3, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.saveContainer = linearLayout7;
        linearLayout7.setOrientation(1);
        this.linearLayout.addView(this.saveContainer);
        HeaderCell headerCell3 = new HeaderCell(context, 23);
        this.saveHeaderCell = headerCell3;
        headerCell3.setHeight(46);
        this.saveHeaderCell.setText(LocaleController.getString("SavingContentTitle", R.string.SavingContentTitle));
        this.saveHeaderCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        this.saveContainer.addView(this.saveHeaderCell, LayoutHelper.createLinear(-1, -2));
        TextCheckCell textCheckCell = new TextCheckCell(context);
        this.saveRestrictCell = textCheckCell;
        textCheckCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        this.saveRestrictCell.setTextAndCheck(LocaleController.getString("RestrictSavingContent", R.string.RestrictSavingContent), this.isSaveRestricted, false);
        this.saveRestrictCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatEditTypeActivity.this.lambda$createView$5(view);
            }
        });
        this.saveContainer.addView(this.saveRestrictCell, LayoutHelper.createLinear(-1, -2));
        this.saveRestrictInfoCell = new TextInfoPrivacyCell(context);
        if (!this.isChannel || ChatObject.isMegagroup(this.currentChat)) {
            this.saveRestrictInfoCell.setText(LocaleController.getString("RestrictSavingContentInfoGroup", R.string.RestrictSavingContentInfoGroup));
        } else {
            this.saveRestrictInfoCell.setText(LocaleController.getString("RestrictSavingContentInfoChannel", R.string.RestrictSavingContentInfoChannel));
        }
        this.saveContainer.addView(this.saveRestrictInfoCell, LayoutHelper.createLinear(-1, -2));
        if (!this.isPrivate && (str = this.currentChat.username) != null) {
            this.ignoreTextChanges = true;
            this.usernameTextView.setText(str);
            this.usernameTextView.setSelection(this.currentChat.username.length());
            this.ignoreTextChanges = false;
        }
        updatePrivatePublic();
        return this.fragmentView;
    }

    public void lambda$createView$2(View view) {
        if (!this.isPrivate) {
            this.isPrivate = true;
            updatePrivatePublic();
        }
    }

    public void lambda$createView$3(View view) {
        if (this.isPrivate) {
            this.isPrivate = false;
            updatePrivatePublic();
        }
    }

    public void lambda$createView$4(View view) {
        ManageLinksActivity manageLinksActivity = new ManageLinksActivity(this.chatId, 0L, 0);
        manageLinksActivity.setInfo(this.info, this.invite);
        presentFragment(manageLinksActivity);
    }

    public void lambda$createView$5(View view) {
        boolean z = !this.isSaveRestricted;
        this.isSaveRestricted = z;
        ((TextCheckCell) view).setChecked(z);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) objArr[0];
            if (tLRPC$ChatFull.id == this.chatId) {
                this.info = tLRPC$ChatFull;
                this.invite = tLRPC$ChatFull.exported_invite;
                updatePrivatePublic();
            }
        }
    }

    public void setInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.info = tLRPC$ChatFull;
        if (tLRPC$ChatFull != null) {
            TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported = tLRPC$ChatFull.exported_invite;
            if (tLRPC$TL_chatInviteExported != null) {
                this.invite = tLRPC$TL_chatInviteExported;
            } else {
                generateLink(false);
            }
        }
    }

    public void processDone() {
        if (this.currentChat.noforwards != this.isSaveRestricted) {
            MessagesController messagesController = getMessagesController();
            long j = this.chatId;
            TLRPC$Chat tLRPC$Chat = this.currentChat;
            boolean z = this.isSaveRestricted;
            tLRPC$Chat.noforwards = z;
            messagesController.toggleChatNoForwards(j, z);
        }
        if (trySetUsername()) {
            finishFragment();
        }
    }

    private boolean trySetUsername() {
        String str;
        if (getParentActivity() == null) {
            return false;
        }
        if (this.isPrivate || (((this.currentChat.username != null || this.usernameTextView.length() == 0) && ((str = this.currentChat.username) == null || str.equalsIgnoreCase(this.usernameTextView.getText().toString()))) || this.usernameTextView.length() == 0 || this.lastNameAvailable)) {
            String str2 = this.currentChat.username;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            if (!this.isPrivate) {
                str3 = this.usernameTextView.getText().toString();
            }
            if (str2.equals(str3)) {
                return true;
            }
            if (!ChatObject.isChannel(this.currentChat)) {
                getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new MessagesStorage.LongCallback() {
                    @Override
                    public final void run(long j) {
                        ChatEditTypeActivity.this.lambda$trySetUsername$6(j);
                    }
                });
                return false;
            }
            getMessagesController().updateChannelUserName(this.chatId, str3);
            this.currentChat.username = str3;
            return true;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        AndroidUtilities.shakeView(this.checkTextView, 2.0f, 0);
        return false;
    }

    public void lambda$trySetUsername$6(long j) {
        if (j != 0) {
            this.chatId = j;
            this.currentChat = getMessagesController().getChat(Long.valueOf(j));
            processDone();
        }
    }

    private void loadAdminedChannels() {
        if (!this.loadingAdminedChannels && this.adminnedChannelsLayout != null) {
            this.loadingAdminedChannels = true;
            updatePrivatePublic();
            getConnectionsManager().sendRequest(new TLRPC$TL_channels_getAdminedPublicChannels(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChatEditTypeActivity.this.lambda$loadAdminedChannels$12(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadAdminedChannels$12(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditTypeActivity.this.lambda$loadAdminedChannels$11(tLObject);
            }
        });
    }

    public void lambda$loadAdminedChannels$11(TLObject tLObject) {
        this.loadingAdminedChannels = false;
        if (!(tLObject == null || getParentActivity() == null)) {
            for (int i = 0; i < this.adminedChannelCells.size(); i++) {
                this.linearLayout.removeView(this.adminedChannelCells.get(i));
            }
            this.adminedChannelCells.clear();
            TLRPC$TL_messages_chats tLRPC$TL_messages_chats = (TLRPC$TL_messages_chats) tLObject;
            for (int i2 = 0; i2 < tLRPC$TL_messages_chats.chats.size(); i2++) {
                AdminedChannelCell adminedChannelCell = new AdminedChannelCell(getParentActivity(), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ChatEditTypeActivity.this.lambda$loadAdminedChannels$10(view);
                    }
                });
                TLRPC$Chat tLRPC$Chat = tLRPC$TL_messages_chats.chats.get(i2);
                boolean z = true;
                if (i2 != tLRPC$TL_messages_chats.chats.size() - 1) {
                    z = false;
                }
                adminedChannelCell.setChannel(tLRPC$Chat, z);
                this.adminedChannelCells.add(adminedChannelCell);
                this.adminnedChannelsLayout.addView(adminedChannelCell, LayoutHelper.createLinear(-1, 72));
            }
            updatePrivatePublic();
        }
    }

    public void lambda$loadAdminedChannels$10(View view) {
        final TLRPC$Chat currentChannel = ((AdminedChannelCell) view.getParent()).getCurrentChannel();
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
        if (this.isChannel) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, getMessagesController().linkPrefix + "/" + currentChannel.username, currentChannel.title)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, getMessagesController().linkPrefix + "/" + currentChannel.username, currentChannel.title)));
        }
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString("RevokeButton", R.string.RevokeButton), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                ChatEditTypeActivity.this.lambda$loadAdminedChannels$9(currentChannel, dialogInterface, i);
            }
        });
        showDialog(builder.create());
    }

    public void lambda$loadAdminedChannels$9(TLRPC$Chat tLRPC$Chat, DialogInterface dialogInterface, int i) {
        TLRPC$TL_channels_updateUsername tLRPC$TL_channels_updateUsername = new TLRPC$TL_channels_updateUsername();
        tLRPC$TL_channels_updateUsername.channel = MessagesController.getInputChannel(tLRPC$Chat);
        tLRPC$TL_channels_updateUsername.username = "";
        getConnectionsManager().sendRequest(tLRPC$TL_channels_updateUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChatEditTypeActivity.this.lambda$loadAdminedChannels$8(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$loadAdminedChannels$8(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatEditTypeActivity.this.lambda$loadAdminedChannels$7();
                }
            });
        }
    }

    public void lambda$loadAdminedChannels$7() {
        this.canCreatePublic = true;
        if (this.usernameTextView.length() > 0) {
            checkUserName(this.usernameTextView.getText().toString());
        }
        updatePrivatePublic();
    }

    private void updatePrivatePublic() {
        String str;
        int i;
        String str2;
        int i2;
        if (this.sectionCell2 != null) {
            Drawable drawable = null;
            int i3 = 8;
            if (this.isPrivate || this.canCreatePublic) {
                this.typeInfoCell.setTag("windowBackgroundWhiteGrayText4");
                this.typeInfoCell.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText4"));
                if (this.isForcePublic) {
                    this.sectionCell2.setVisibility(8);
                } else {
                    this.sectionCell2.setVisibility(0);
                }
                this.adminedInfoCell.setVisibility(8);
                TextInfoPrivacyCell textInfoPrivacyCell = this.typeInfoCell;
                textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(textInfoPrivacyCell.getContext(), (int) R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                this.adminnedChannelsLayout.setVisibility(8);
                this.linkContainer.setVisibility(0);
                this.loadingAdminedCell.setVisibility(8);
                if (this.isChannel) {
                    TextInfoPrivacyCell textInfoPrivacyCell2 = this.typeInfoCell;
                    if (this.isPrivate) {
                        i2 = R.string.ChannelPrivateLinkHelp;
                        str2 = "ChannelPrivateLinkHelp";
                    } else {
                        i2 = R.string.ChannelUsernameHelp;
                        str2 = "ChannelUsernameHelp";
                    }
                    textInfoPrivacyCell2.setText(LocaleController.getString(str2, i2));
                    this.headerCell.setText(this.isPrivate ? LocaleController.getString("ChannelInviteLinkTitle", R.string.ChannelInviteLinkTitle) : LocaleController.getString("ChannelLinkTitle", R.string.ChannelLinkTitle));
                } else {
                    TextInfoPrivacyCell textInfoPrivacyCell3 = this.typeInfoCell;
                    if (this.isPrivate) {
                        i = R.string.MegaPrivateLinkHelp;
                        str = "MegaPrivateLinkHelp";
                    } else {
                        i = R.string.MegaUsernameHelp;
                        str = "MegaUsernameHelp";
                    }
                    textInfoPrivacyCell3.setText(LocaleController.getString(str, i));
                    this.headerCell.setText(this.isPrivate ? LocaleController.getString("ChannelInviteLinkTitle", R.string.ChannelInviteLinkTitle) : LocaleController.getString("ChannelLinkTitle", R.string.ChannelLinkTitle));
                }
                this.publicContainer.setVisibility(this.isPrivate ? 8 : 0);
                this.privateContainer.setVisibility(this.isPrivate ? 0 : 8);
                this.saveContainer.setVisibility(0);
                this.manageLinksTextView.setVisibility(0);
                this.manageLinksInfoCell.setVisibility(0);
                this.linkContainer.setPadding(0, 0, 0, this.isPrivate ? 0 : AndroidUtilities.dp(7.0f));
                LinkActionView linkActionView = this.permanentLinkView;
                TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported = this.invite;
                linkActionView.setLink(tLRPC$TL_chatInviteExported != null ? tLRPC$TL_chatInviteExported.link : null);
                this.permanentLinkView.loadUsers(this.invite, this.chatId);
                TextInfoPrivacyCell textInfoPrivacyCell4 = this.checkTextView;
                if (!this.isPrivate && textInfoPrivacyCell4.length() != 0) {
                    i3 = 0;
                }
                textInfoPrivacyCell4.setVisibility(i3);
                if (this.isPrivate) {
                    TextInfoPrivacyCell textInfoPrivacyCell5 = this.typeInfoCell;
                    textInfoPrivacyCell5.setBackgroundDrawable(Theme.getThemedDrawable(textInfoPrivacyCell5.getContext(), (int) R.drawable.greydivider, "windowBackgroundGrayShadow"));
                    this.manageLinksInfoCell.setBackground(Theme.getThemedDrawable(this.typeInfoCell.getContext(), (int) R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                    this.manageLinksInfoCell.setText(LocaleController.getString("ManageLinksInfoHelp", R.string.ManageLinksInfoHelp));
                } else {
                    TextInfoPrivacyCell textInfoPrivacyCell6 = this.typeInfoCell;
                    if (this.checkTextView.getVisibility() != 0) {
                        drawable = Theme.getThemedDrawable(this.typeInfoCell.getContext(), (int) R.drawable.greydivider_bottom, "windowBackgroundGrayShadow");
                    }
                    textInfoPrivacyCell6.setBackgroundDrawable(drawable);
                }
            } else {
                this.typeInfoCell.setText(LocaleController.getString("ChangePublicLimitReached", R.string.ChangePublicLimitReached));
                this.typeInfoCell.setTag("windowBackgroundWhiteRedText4");
                this.typeInfoCell.setTextColor(Theme.getColor("windowBackgroundWhiteRedText4"));
                this.linkContainer.setVisibility(8);
                this.checkTextView.setVisibility(8);
                this.sectionCell2.setVisibility(8);
                this.adminedInfoCell.setVisibility(0);
                if (this.loadingAdminedChannels) {
                    this.loadingAdminedCell.setVisibility(0);
                    this.adminnedChannelsLayout.setVisibility(8);
                    this.typeInfoCell.setBackgroundDrawable(this.checkTextView.getVisibility() == 0 ? null : Theme.getThemedDrawable(this.typeInfoCell.getContext(), (int) R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                    this.adminedInfoCell.setBackgroundDrawable(null);
                } else {
                    ShadowSectionCell shadowSectionCell = this.adminedInfoCell;
                    shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawable(shadowSectionCell.getContext(), (int) R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                    TextInfoPrivacyCell textInfoPrivacyCell7 = this.typeInfoCell;
                    textInfoPrivacyCell7.setBackgroundDrawable(Theme.getThemedDrawable(textInfoPrivacyCell7.getContext(), (int) R.drawable.greydivider_top, "windowBackgroundGrayShadow"));
                    this.loadingAdminedCell.setVisibility(8);
                    this.adminnedChannelsLayout.setVisibility(0);
                }
            }
            this.radioButtonCell1.setChecked(!this.isPrivate, true);
            this.radioButtonCell2.setChecked(this.isPrivate, true);
            this.usernameTextView.clearFocus();
            checkDoneButton();
        }
    }

    public void checkDoneButton() {
        if (this.isPrivate || this.usernameTextView.length() > 0) {
            this.doneButton.setEnabled(true);
            this.doneButton.setAlpha(1.0f);
            return;
        }
        this.doneButton.setEnabled(false);
        this.doneButton.setAlpha(0.5f);
    }

    public boolean checkUserName(final String str) {
        if (str == null || str.length() <= 0) {
            this.checkTextView.setVisibility(8);
        } else {
            this.checkTextView.setVisibility(0);
        }
        this.typeInfoCell.setBackgroundDrawable(this.checkTextView.getVisibility() == 0 ? null : Theme.getThemedDrawable(this.typeInfoCell.getContext(), (int) R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
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
                this.checkTextView.setText(LocaleController.getString("LinkInvalid", R.string.LinkInvalid));
                this.checkTextView.setTextColor("windowBackgroundWhiteRedText4");
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (i == 0 && charAt >= '0' && charAt <= '9') {
                    if (this.isChannel) {
                        this.checkTextView.setText(LocaleController.getString("LinkInvalidStartNumber", R.string.LinkInvalidStartNumber));
                    } else {
                        this.checkTextView.setText(LocaleController.getString("LinkInvalidStartNumberMega", R.string.LinkInvalidStartNumberMega));
                    }
                    this.checkTextView.setTextColor("windowBackgroundWhiteRedText4");
                    return false;
                } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.checkTextView.setText(LocaleController.getString("LinkInvalid", R.string.LinkInvalid));
                    this.checkTextView.setTextColor("windowBackgroundWhiteRedText4");
                    return false;
                }
            }
        }
        if (str == null || str.length() < 5) {
            if (this.isChannel) {
                this.checkTextView.setText(LocaleController.getString("LinkInvalidShort", R.string.LinkInvalidShort));
            } else {
                this.checkTextView.setText(LocaleController.getString("LinkInvalidShortMega", R.string.LinkInvalidShortMega));
            }
            this.checkTextView.setTextColor("windowBackgroundWhiteRedText4");
            return false;
        } else if (str.length() > 32) {
            this.checkTextView.setText(LocaleController.getString("LinkInvalidLong", R.string.LinkInvalidLong));
            this.checkTextView.setTextColor("windowBackgroundWhiteRedText4");
            return false;
        } else {
            this.checkTextView.setText(LocaleController.getString("LinkChecking", R.string.LinkChecking));
            this.checkTextView.setTextColor("windowBackgroundWhiteGrayText8");
            this.lastCheckName = str;
            Runnable chatEditTypeActivity$$ExternalSyntheticLambda7 = new Runnable() {
                @Override
                public final void run() {
                    ChatEditTypeActivity.this.lambda$checkUserName$15(str);
                }
            };
            this.checkRunnable = chatEditTypeActivity$$ExternalSyntheticLambda7;
            AndroidUtilities.runOnUIThread(chatEditTypeActivity$$ExternalSyntheticLambda7, 300L);
            return true;
        }
    }

    public void lambda$checkUserName$15(final String str) {
        TLRPC$TL_channels_checkUsername tLRPC$TL_channels_checkUsername = new TLRPC$TL_channels_checkUsername();
        tLRPC$TL_channels_checkUsername.username = str;
        tLRPC$TL_channels_checkUsername.channel = getMessagesController().getInputChannel(this.chatId);
        this.checkReqId = getConnectionsManager().sendRequest(tLRPC$TL_channels_checkUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChatEditTypeActivity.this.lambda$checkUserName$14(str, tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public void lambda$checkUserName$14(final String str, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditTypeActivity.this.lambda$checkUserName$13(str, tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$checkUserName$13(String str, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        this.checkReqId = 0;
        String str2 = this.lastCheckName;
        if (str2 != null && str2.equals(str)) {
            if (tLRPC$TL_error != null || !(tLObject instanceof TLRPC$TL_boolTrue)) {
                if (tLRPC$TL_error == null || !tLRPC$TL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                    this.checkTextView.setText(LocaleController.getString("LinkInUse", R.string.LinkInUse));
                } else {
                    this.canCreatePublic = false;
                    loadAdminedChannels();
                }
                this.checkTextView.setTextColor("windowBackgroundWhiteRedText4");
                this.lastNameAvailable = false;
                return;
            }
            this.checkTextView.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            this.checkTextView.setTextColor("windowBackgroundWhiteGreenText");
            this.lastNameAvailable = true;
        }
    }

    public void generateLink(final boolean z) {
        TLRPC$TL_messages_exportChatInvite tLRPC$TL_messages_exportChatInvite = new TLRPC$TL_messages_exportChatInvite();
        tLRPC$TL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tLRPC$TL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.chatId);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_exportChatInvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChatEditTypeActivity.this.lambda$generateLink$17(z, tLObject, tLRPC$TL_error);
            }
        }), this.classGuid);
    }

    public void lambda$generateLink$17(final boolean z, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditTypeActivity.this.lambda$generateLink$16(tLRPC$TL_error, tLObject, z);
            }
        });
    }

    public void lambda$generateLink$16(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, boolean z) {
        String str = null;
        if (tLRPC$TL_error == null) {
            TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported = (TLRPC$TL_chatInviteExported) tLObject;
            this.invite = tLRPC$TL_chatInviteExported;
            TLRPC$ChatFull tLRPC$ChatFull = this.info;
            if (tLRPC$ChatFull != null) {
                tLRPC$ChatFull.exported_invite = tLRPC$TL_chatInviteExported;
            }
            if (z) {
                if (getParentActivity() != null) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    builder.setMessage(LocaleController.getString("RevokeAlertNewLink", R.string.RevokeAlertNewLink));
                    builder.setTitle(LocaleController.getString("RevokeLink", R.string.RevokeLink));
                    builder.setNegativeButton(LocaleController.getString("OK", R.string.OK), null);
                    showDialog(builder.create());
                } else {
                    return;
                }
            }
        }
        LinkActionView linkActionView = this.permanentLinkView;
        if (linkActionView != null) {
            TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported2 = this.invite;
            if (tLRPC$TL_chatInviteExported2 != null) {
                str = tLRPC$TL_chatInviteExported2.link;
            }
            linkActionView.setLink(str);
            this.permanentLinkView.loadUsers(this.invite, this.chatId);
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate chatEditTypeActivity$$ExternalSyntheticLambda18 = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ChatEditTypeActivity.this.lambda$getThemeDescriptions$18();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.sectionCell2, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.infoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.infoCell, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.textCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.textCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteRedText5"));
        arrayList.add(new ThemeDescription(this.textCell2, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.textCell2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.usernameTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.usernameTextView, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.linearLayoutTypeContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.linkContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.headerCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.headerCell2, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.saveHeaderCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.saveRestrictCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.saveRestrictCell, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.saveRestrictCell, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrack"));
        arrayList.add(new ThemeDescription(this.saveRestrictCell, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrackChecked"));
        arrayList.add(new ThemeDescription(this.checkTextView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteRedText4"));
        arrayList.add(new ThemeDescription(this.checkTextView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText8"));
        arrayList.add(new ThemeDescription(this.checkTextView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGreenText"));
        arrayList.add(new ThemeDescription(this.typeInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.typeInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.typeInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteRedText4"));
        arrayList.add(new ThemeDescription(this.manageLinksInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.manageLinksInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.manageLinksInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteRedText4"));
        arrayList.add(new ThemeDescription(this.saveRestrictInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.saveRestrictInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.saveRestrictInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteRedText4"));
        arrayList.add(new ThemeDescription(this.adminedInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.loadingAdminedCell, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "progressCircle"));
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "radioBackground"));
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "radioBackgroundChecked"));
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{RadioButtonCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{RadioButtonCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "radioBackground"));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "radioBackgroundChecked"));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{RadioButtonCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{RadioButtonCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{AdminedChannelCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{AdminedChannelCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText"));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_LINKCOLOR, new Class[]{AdminedChannelCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteLinkText"));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{AdminedChannelCell.class}, new String[]{"deleteButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText"));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, chatEditTypeActivity$$ExternalSyntheticLambda18, "avatar_text"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatEditTypeActivity$$ExternalSyntheticLambda18, "avatar_backgroundRed"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatEditTypeActivity$$ExternalSyntheticLambda18, "avatar_backgroundOrange"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatEditTypeActivity$$ExternalSyntheticLambda18, "avatar_backgroundViolet"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatEditTypeActivity$$ExternalSyntheticLambda18, "avatar_backgroundGreen"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatEditTypeActivity$$ExternalSyntheticLambda18, "avatar_backgroundCyan"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatEditTypeActivity$$ExternalSyntheticLambda18, "avatar_backgroundBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatEditTypeActivity$$ExternalSyntheticLambda18, "avatar_backgroundPink"));
        arrayList.add(new ThemeDescription(this.manageLinksTextView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.manageLinksTextView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.manageLinksTextView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayIcon"));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$18() {
        LinearLayout linearLayout = this.adminnedChannelsLayout;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.adminnedChannelsLayout.getChildAt(i);
                if (childAt instanceof AdminedChannelCell) {
                    ((AdminedChannelCell) childAt).update();
                }
            }
        }
        this.permanentLinkView.updateColors();
        this.manageLinksTextView.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        InviteLinkBottomSheet inviteLinkBottomSheet = this.inviteLinkBottomSheet;
        if (inviteLinkBottomSheet != null) {
            inviteLinkBottomSheet.updateColors();
        }
    }
}
