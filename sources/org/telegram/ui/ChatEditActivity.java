package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChannelLocation;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipant;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$ChatReactions;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_bots_setBotInfo;
import org.telegram.tgnet.TLRPC$TL_channelLocation;
import org.telegram.tgnet.TLRPC$TL_chatBannedRights;
import org.telegram.tgnet.TLRPC$TL_chatParticipantAdmin;
import org.telegram.tgnet.TLRPC$TL_chatParticipantCreator;
import org.telegram.tgnet.TLRPC$TL_chatReactionsNone;
import org.telegram.tgnet.TLRPC$TL_chatReactionsSome;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputPhotoEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_exportedChatInvites;
import org.telegram.tgnet.TLRPC$TL_messages_getExportedChatInvites;
import org.telegram.tgnet.TLRPC$TL_photo;
import org.telegram.tgnet.TLRPC$TL_photos_updateProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_photos_uploadProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.tgnet.TLRPC$TL_userProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_username;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.ChatEditActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.PhotoViewer;
public class ChatEditActivity extends BaseFragment implements ImageUpdater.ImageUpdaterDelegate, NotificationCenter.NotificationCenterDelegate {
    private TextCell adminCell;
    private TLRPC$ChatReactions availableReactions;
    private TLRPC$FileLocation avatar;
    private AnimatorSet avatarAnimation;
    private LinearLayout avatarContainer;
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImage;
    private View avatarOverlay;
    private RadialProgressView avatarProgressView;
    private TextCell blockCell;
    private TextInfoPrivacyCell botInfoCell;
    RLottieDrawable cameraDrawable;
    private boolean canForum;
    private TextCell changeBotSettingsCell;
    private long chatId;
    private PeerColorActivity.ChangeNameColorCell colorCell;
    private boolean createAfterUpload;
    private TLRPC$Chat currentChat;
    private TLRPC$User currentUser;
    private TextSettingsCell deleteCell;
    private FrameLayout deleteContainer;
    private ShadowSectionCell deleteInfoCell;
    private EditTextBoldCursor descriptionTextView;
    private View doneButton;
    private boolean donePressed;
    private TextCell editCommandsCell;
    private TextCell editIntroCell;
    private boolean forum;
    private TextCell forumsCell;
    private boolean hasUploadedPhoto;
    private TextCell historyCell;
    private boolean historyHidden;
    private ImageUpdater imageUpdater;
    private TLRPC$ChatFull info;
    private LinearLayout infoContainer;
    private ShadowSectionCell infoSectionCell;
    private TextCell inviteLinksCell;
    private boolean isChannel;
    private LinearLayout linearLayout;
    private TextCell linkedCell;
    private TextCell locationCell;
    private TextCell logCell;
    private TextCell memberRequestsCell;
    private TextCell membersCell;
    private EditTextEmoji nameTextView;
    private final List<AnimatedEmojiDrawable> preloadedReactions;
    private AlertDialog progressDialog;
    private PhotoViewer.PhotoViewerProvider provider;
    private TextCell publicLinkCell;
    private TextCell reactionsCell;
    private TextCell setAvatarCell;
    private LinearLayout settingsContainer;
    private TextInfoPrivacyCell settingsSectionCell;
    private ShadowSectionCell settingsTopSectionCell;
    private TextCell signCell;
    private boolean signMessages;
    private TextCell statsAndBoosts;
    private TextCell stickersCell;
    private FrameLayout stickersContainer;
    private TextInfoPrivacyCell stickersInfoCell;
    private TextCell typeCell;
    private LinearLayout typeEditContainer;
    private UndoView undoView;
    private ValueAnimator updateHistoryShowAnimator;
    private long userId;
    private TLRPC$UserFull userInfo;

    public static boolean lambda$createView$2(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    public class AnonymousClass1 extends PhotoViewer.EmptyPhotoViewerProvider {
        @Override
        public boolean canLoadMoreAvatars() {
            return false;
        }

        @Override
        public int getTotalImageCount() {
            return 1;
        }

        AnonymousClass1() {
        }

        @Override
        public org.telegram.ui.PhotoViewer.PlaceProviderObject getPlaceForPhoto(org.telegram.messenger.MessageObject r7, org.telegram.tgnet.TLRPC$FileLocation r8, int r9, boolean r10) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditActivity.AnonymousClass1.getPlaceForPhoto(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean):org.telegram.ui.PhotoViewer$PlaceProviderObject");
        }

        @Override
        public void willHidePhotoViewer() {
            ChatEditActivity.this.avatarImage.getImageReceiver().setVisible(true, true);
        }

        @Override
        public void openPhotoForEdit(String str, String str2, boolean z) {
            ChatEditActivity.this.imageUpdater.openPhotoForEdit(str, str2, 0, z);
        }

        @Override
        public boolean onDeletePhoto(int i) {
            if (ChatEditActivity.this.userId == 0) {
                return true;
            }
            TLRPC$TL_photos_updateProfilePhoto tLRPC$TL_photos_updateProfilePhoto = new TLRPC$TL_photos_updateProfilePhoto();
            tLRPC$TL_photos_updateProfilePhoto.bot = ChatEditActivity.this.getMessagesController().getInputUser(ChatEditActivity.this.userId);
            tLRPC$TL_photos_updateProfilePhoto.flags |= 2;
            tLRPC$TL_photos_updateProfilePhoto.id = new TLRPC$TL_inputPhotoEmpty();
            ChatEditActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_photos_updateProfilePhoto, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChatEditActivity.AnonymousClass1.this.lambda$onDeletePhoto$1(tLObject, tLRPC$TL_error);
                }
            });
            return false;
        }

        public void lambda$onDeletePhoto$1(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatEditActivity.AnonymousClass1.this.lambda$onDeletePhoto$0();
                }
            });
        }

        public void lambda$onDeletePhoto$0() {
            ChatEditActivity.this.avatarImage.setImageDrawable(ChatEditActivity.this.avatarDrawable);
            ChatEditActivity.this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), R.drawable.msg_addphoto, true);
            if (ChatEditActivity.this.currentUser != null) {
                ChatEditActivity.this.currentUser.photo = null;
                ChatEditActivity.this.getMessagesController().putUser(ChatEditActivity.this.currentUser, true);
            }
            ChatEditActivity.this.hasUploadedPhoto = true;
            ChatEditActivity chatEditActivity = ChatEditActivity.this;
            if (chatEditActivity.cameraDrawable == null) {
                int i = R.raw.camera_outline;
                chatEditActivity.cameraDrawable = new RLottieDrawable(i, BuildConfig.APP_CENTER_HASH + i, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            }
            ChatEditActivity.this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
            ChatEditActivity.this.setAvatarCell.imageView.setAnimation(ChatEditActivity.this.cameraDrawable);
        }
    }

    public ChatEditActivity(Bundle bundle) {
        super(bundle);
        this.preloadedReactions = new ArrayList();
        this.provider = new AnonymousClass1();
        this.avatarDrawable = new AvatarDrawable();
        this.chatId = bundle.getLong("chat_id", 0L);
        this.userId = bundle.getLong("user_id", 0L);
        if (this.chatId != 0) {
            TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            this.imageUpdater = new ImageUpdater(true, (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true);
            return;
        }
        this.imageUpdater = new ImageUpdater(false, 0, false);
    }

    @Override
    public boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditActivity.onFragmentCreate():boolean");
    }

    private void loadLinksCount() {
        TLRPC$TL_messages_getExportedChatInvites tLRPC$TL_messages_getExportedChatInvites = new TLRPC$TL_messages_getExportedChatInvites();
        tLRPC$TL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.chatId);
        tLRPC$TL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tLRPC$TL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getExportedChatInvites, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChatEditActivity.this.lambda$loadLinksCount$1(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadLinksCount$1(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditActivity.this.lambda$loadLinksCount$0(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$loadLinksCount$0(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            this.info.invitesCount = ((TLRPC$TL_messages_exportedChatInvites) tLObject).count;
            getMessagesStorage().saveChatLinksCount(this.chatId, this.info.invitesCount);
            updateFields(false, false);
        }
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.clear();
        }
        if (this.currentChat != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userInfoDidLoad);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onResume();
            this.nameTextView.getEditText().requestFocus();
        }
        updateColorCell();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        updateFields(true, true);
        this.imageUpdater.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        ReactionsUtils.stopPreloadReactions(this.preloadedReactions);
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onPause();
        }
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
        this.imageUpdater.onPause();
    }

    @Override
    public void onBecomeFullyHidden() {
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
    }

    @Override
    public void dismissCurrentDialog() {
        if (this.imageUpdater.dismissCurrentDialog(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public boolean dismissDialogOnPause(Dialog dialog) {
        return this.imageUpdater.dismissDialogOnPause(dialog) && super.dismissDialogOnPause(dialog);
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.imageUpdater.onRequestPermissionsResultFragment(i, strArr, iArr);
    }

    @Override
    public boolean onBackPressed() {
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null && editTextEmoji.isPopupShowing()) {
            this.nameTextView.hidePopup(true);
            return false;
        }
        return checkDiscard();
    }

    @Override
    public android.view.View createView(final android.content.Context r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditActivity.createView(android.content.Context):android.view.View");
    }

    public void lambda$createView$3(View view) {
        if (this.imageUpdater.isUploadingImage()) {
            return;
        }
        ImageLocation imageLocation = null;
        TLRPC$User user = this.userId == 0 ? null : getMessagesController().getUser(Long.valueOf(this.userId));
        if (user != null) {
            TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = user.photo;
            if (tLRPC$UserProfilePhoto == null || tLRPC$UserProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.getInstance().setParentActivity(this);
            TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto2 = user.photo;
            int i = tLRPC$UserProfilePhoto2.dc_id;
            if (i != 0) {
                tLRPC$UserProfilePhoto2.photo_big.dc_id = i;
            }
            PhotoViewer.getInstance().openPhoto(user.photo.photo_big, this.provider);
            return;
        }
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        TLRPC$ChatPhoto tLRPC$ChatPhoto = chat.photo;
        if (tLRPC$ChatPhoto == null || tLRPC$ChatPhoto.photo_big == null) {
            return;
        }
        PhotoViewer.getInstance().setParentActivity(this);
        TLRPC$ChatPhoto tLRPC$ChatPhoto2 = chat.photo;
        int i2 = tLRPC$ChatPhoto2.dc_id;
        if (i2 != 0) {
            tLRPC$ChatPhoto2.photo_big.dc_id = i2;
        }
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        if (tLRPC$ChatFull != null) {
            TLRPC$Photo tLRPC$Photo = tLRPC$ChatFull.chat_photo;
            if ((tLRPC$Photo instanceof TLRPC$TL_photo) && !tLRPC$Photo.video_sizes.isEmpty()) {
                imageLocation = ImageLocation.getForPhoto(this.info.chat_photo.video_sizes.get(0), this.info.chat_photo);
            }
        }
        PhotoViewer.getInstance().openPhotoWithVideo(chat.photo.photo_big, imageLocation, this.provider);
    }

    public void lambda$createView$8(View view) {
        this.imageUpdater.openMenu(this.avatar != null, new Runnable() {
            @Override
            public final void run() {
                ChatEditActivity.this.lambda$createView$6();
            }
        }, new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                ChatEditActivity.this.lambda$createView$7(dialogInterface);
            }
        }, 0);
        this.cameraDrawable.setCurrentFrame(0);
        this.cameraDrawable.setCustomEndFrame(43);
        this.setAvatarCell.imageView.playAnimation();
    }

    public void lambda$createView$6() {
        this.avatar = null;
        if (this.userId == 0) {
            MessagesController.getInstance(this.currentAccount).changeChatAvatar(this.chatId, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC$TL_photos_updateProfilePhoto tLRPC$TL_photos_updateProfilePhoto = new TLRPC$TL_photos_updateProfilePhoto();
            tLRPC$TL_photos_updateProfilePhoto.bot = getMessagesController().getInputUser(this.userId);
            tLRPC$TL_photos_updateProfilePhoto.flags |= 2;
            tLRPC$TL_photos_updateProfilePhoto.id = new TLRPC$TL_inputPhotoEmpty();
            getConnectionsManager().sendRequest(tLRPC$TL_photos_updateProfilePhoto, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChatEditActivity.this.lambda$createView$5(tLObject, tLRPC$TL_error);
                }
            });
        }
        showAvatarProgress(false, true);
        BackupImageView backupImageView = this.avatarImage;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        Object obj = this.currentUser;
        if (obj == null) {
            obj = this.currentChat;
        }
        backupImageView.setImage((ImageLocation) null, (String) null, avatarDrawable, obj);
        this.cameraDrawable.setCurrentFrame(0);
        this.setAvatarCell.imageView.playAnimation();
    }

    public void lambda$createView$5(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditActivity.this.lambda$createView$4();
            }
        });
    }

    public void lambda$createView$4() {
        this.avatarImage.setImageDrawable(this.avatarDrawable);
        this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), R.drawable.msg_addphoto, true);
        TLRPC$User tLRPC$User = this.currentUser;
        if (tLRPC$User != null) {
            tLRPC$User.photo = null;
            getMessagesController().putUser(this.currentUser, true);
        }
        this.hasUploadedPhoto = true;
        if (this.cameraDrawable == null) {
            int i = R.raw.camera_outline;
            this.cameraDrawable = new RLottieDrawable(i, BuildConfig.APP_CENTER_HASH + i, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
        }
        this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
        this.setAvatarCell.imageView.setAnimation(this.cameraDrawable);
    }

    public void lambda$createView$7(DialogInterface dialogInterface) {
        if (!this.imageUpdater.isUploadingImage()) {
            this.cameraDrawable.setCustomEndFrame(86);
            this.setAvatarCell.imageView.playAnimation();
            return;
        }
        this.cameraDrawable.setCurrentFrame(0, false);
    }

    public boolean lambda$createView$9(TextView textView, int i, KeyEvent keyEvent) {
        View view;
        if (i != 6 || (view = this.doneButton) == null) {
            return false;
        }
        view.performClick();
        return true;
    }

    public void lambda$createView$11(View view) {
        if (AndroidUtilities.isMapsInstalled(this)) {
            LocationActivity locationActivity = new LocationActivity(4);
            locationActivity.setDialogId(-this.chatId);
            TLRPC$ChatFull tLRPC$ChatFull = this.info;
            if (tLRPC$ChatFull != null) {
                TLRPC$ChannelLocation tLRPC$ChannelLocation = tLRPC$ChatFull.location;
                if (tLRPC$ChannelLocation instanceof TLRPC$TL_channelLocation) {
                    locationActivity.setInitialLocation((TLRPC$TL_channelLocation) tLRPC$ChannelLocation);
                }
            }
            locationActivity.setDelegate(new LocationActivity.LocationActivityDelegate() {
                @Override
                public final void didSelectLocation(TLRPC$MessageMedia tLRPC$MessageMedia, int i, boolean z, int i2) {
                    ChatEditActivity.this.lambda$createView$10(tLRPC$MessageMedia, i, z, i2);
                }
            });
            presentFragment(locationActivity);
        }
    }

    public void lambda$createView$10(TLRPC$MessageMedia tLRPC$MessageMedia, int i, boolean z, int i2) {
        TLRPC$TL_channelLocation tLRPC$TL_channelLocation = new TLRPC$TL_channelLocation();
        tLRPC$TL_channelLocation.address = tLRPC$MessageMedia.address;
        tLRPC$TL_channelLocation.geo_point = tLRPC$MessageMedia.geo;
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        tLRPC$ChatFull.location = tLRPC$TL_channelLocation;
        tLRPC$ChatFull.flags |= LiteMode.FLAG_CHAT_SCALE;
        updateFields(false, true);
        getMessagesController().loadFullChat(this.chatId, 0, true);
    }

    public void lambda$createView$12(View view) {
        long j = this.chatId;
        TextCell textCell = this.locationCell;
        ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j, textCell != null && textCell.getVisibility() == 0);
        chatEditTypeActivity.setInfo(this.info);
        presentFragment(chatEditTypeActivity);
    }

    public void lambda$createView$13(View view) {
        ChatLinkActivity chatLinkActivity = new ChatLinkActivity(this.chatId);
        chatLinkActivity.setInfo(this.info);
        presentFragment(chatLinkActivity);
    }

    public void lambda$createView$14(View view) {
        presentFragment(new ChannelColorActivity(-this.currentChat.id).setOnApplied(this));
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(this.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public void lambda$createView$16(Context context, View view) {
        final BottomSheet.Builder builder = new BottomSheet.Builder(context);
        builder.setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        HeaderCell headerCell = new HeaderCell(context, Theme.key_dialogTextBlue2, 23, 15, false);
        headerCell.setHeight(47);
        headerCell.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
        linearLayout.addView(headerCell);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2));
        final RadioButtonCell[] radioButtonCellArr = new RadioButtonCell[2];
        for (int i = 0; i < 2; i++) {
            radioButtonCellArr[i] = new RadioButtonCell(context, true);
            radioButtonCellArr[i].setTag(Integer.valueOf(i));
            radioButtonCellArr[i].setBackgroundDrawable(Theme.getSelectorDrawable(false));
            if (i == 0) {
                radioButtonCellArr[i].setTextAndValue(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !this.historyHidden);
            } else if (ChatObject.isChannel(this.currentChat)) {
                radioButtonCellArr[i].setTextAndValue(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, this.historyHidden);
            } else {
                radioButtonCellArr[i].setTextAndValue(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, this.historyHidden);
            }
            linearLayout2.addView(radioButtonCellArr[i], LayoutHelper.createLinear(-1, -2));
            radioButtonCellArr[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$15(radioButtonCellArr, builder, view2);
                }
            });
        }
        builder.setCustomView(linearLayout);
        showDialog(builder.create());
    }

    public void lambda$createView$15(RadioButtonCell[] radioButtonCellArr, BottomSheet.Builder builder, View view) {
        Integer num = (Integer) view.getTag();
        radioButtonCellArr[0].setChecked(num.intValue() == 0, true);
        radioButtonCellArr[1].setChecked(num.intValue() == 1, true);
        this.historyHidden = num.intValue() == 1;
        builder.getDismissRunnable().run();
        updateFields(true, true);
    }

    public void lambda$createView$17(View view) {
        boolean z = !this.signMessages;
        this.signMessages = z;
        ((TextCell) view).setChecked(z);
    }

    public void lambda$createView$18(FrameLayout frameLayout, View view) {
        SpannableStringBuilder replaceTags;
        if (!this.canForum) {
            TLRPC$ChatFull tLRPC$ChatFull = this.info;
            if (tLRPC$ChatFull != null && tLRPC$ChatFull.linked_chat_id != 0) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", getMessagesController().forumUpgradeParticipantsMin, new Object[0]));
            }
            BulletinFactory.of(this).createSimpleBulletin(R.raw.topics, replaceTags).show();
            frameLayout.performHapticFeedback(3);
            return;
        }
        boolean z = !this.forum;
        this.forum = z;
        this.avatarImage.animateToRoundRadius(AndroidUtilities.dp(z ? 16.0f : 32.0f));
        ((TextCell) view).setChecked(this.forum);
        updateFields(false, true);
    }

    public void lambda$createView$19(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("type", (this.isChannel || this.currentChat.gigagroup) ? 0 : 3);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(this.info);
        presentFragment(chatUsersActivity);
    }

    public void lambda$createView$20(View view) {
        ManageLinksActivity manageLinksActivity = new ManageLinksActivity(this.chatId, 0L, 0);
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        manageLinksActivity.setInfo(tLRPC$ChatFull, tLRPC$ChatFull.exported_invite);
        presentFragment(manageLinksActivity);
    }

    public void lambda$createView$21(View view) {
        if (ChatObject.isChannelAndNotMegaGroup(this.currentChat)) {
            presentFragment(new ChatCustomReactionsEditActivity(this.chatId, this.info));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle);
        chatReactionsEditActivity.setInfo(this.info);
        presentFragment(chatReactionsEditActivity);
    }

    public void lambda$createView$22(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("type", 1);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(this.info);
        presentFragment(chatUsersActivity);
    }

    public void lambda$createView$23(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("type", 2);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(this.info);
        presentFragment(chatUsersActivity);
    }

    public void lambda$createView$24(View view) {
        presentFragment(new MemberRequestsActivity(this.chatId));
    }

    public void lambda$createView$25(View view) {
        presentFragment(new ChannelAdminLogActivity(this.currentChat));
    }

    public void lambda$createView$26(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putBoolean("is_megagroup", this.currentChat.megagroup);
        TLRPC$ChatFull chatFull = getMessagesController().getChatFull(this.chatId);
        if (chatFull == null || !chatFull.can_view_stats) {
            bundle.putBoolean("only_boosts", true);
        }
        presentFragment(new StatisticActivity(bundle));
    }

    public void lambda$createView$27(View view) {
        presentFragment(new ChannelAdminLogActivity(this.currentChat));
    }

    public void lambda$createView$28(View view) {
        GroupStickersActivity groupStickersActivity = new GroupStickersActivity(this.currentChat.id);
        groupStickersActivity.setInfo(this.info);
        presentFragment(groupStickersActivity);
    }

    public void lambda$createView$29(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("bot_id", this.userId);
        presentFragment(new ChangeUsernameActivity(bundle));
    }

    public void lambda$createView$30(View view) {
        Context context = view.getContext();
        Browser.openUrl(context, "https://t.me/BotFather?start=" + getActiveUsername(this.currentUser) + "-intro");
    }

    public void lambda$createView$31(View view) {
        Context context = view.getContext();
        Browser.openUrl(context, "https://t.me/BotFather?start=" + getActiveUsername(this.currentUser) + "-commands");
    }

    public void lambda$createView$32(View view) {
        Context context = view.getContext();
        Browser.openUrl(context, "https://t.me/BotFather?start=" + getActiveUsername(this.currentUser));
    }

    public void lambda$createView$34(View view) {
        AlertsCreator.createClearOrDeleteDialogAlert(this, false, true, false, this.currentChat, null, false, true, false, new MessagesStorage.BooleanCallback() {
            @Override
            public final void run(boolean z) {
                ChatEditActivity.this.lambda$createView$33(z);
            }
        }, null);
    }

    public void lambda$createView$33(boolean z) {
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-this.chatId));
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        finishFragment();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-this.currentChat.id), null, this.currentChat, Boolean.valueOf(z));
    }

    private void updatePublicLinksCount() {
        if (this.publicLinkCell == null) {
            return;
        }
        if (this.currentUser.usernames.size() > 1) {
            Iterator<TLRPC$TL_username> it = this.currentUser.usernames.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().active) {
                    i++;
                }
            }
            this.publicLinkCell.setTextAndValueAndIcon(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i), Integer.valueOf(this.currentUser.usernames.size())), R.drawable.msg_link2, true);
            return;
        }
        TextCell textCell = this.publicLinkCell;
        String string = LocaleController.getString(R.string.BotPublicLink);
        textCell.setTextAndValueAndIcon(string, "t.me/" + this.currentUser.username, R.drawable.msg_link2, true);
    }

    private String getActiveUsername(TLRPC$User tLRPC$User) {
        String str = tLRPC$User.username;
        if (str != null) {
            return str;
        }
        Iterator<TLRPC$TL_username> it = tLRPC$User.usernames.iterator();
        while (it.hasNext()) {
            TLRPC$TL_username next = it.next();
            if (next.active) {
                return next.username;
            }
        }
        return null;
    }

    private void setAvatar() {
        if (this.avatarImage == null || this.hasUploadedPhoto) {
            return;
        }
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        TLRPC$User user = this.userId == 0 ? null : getMessagesController().getUser(Long.valueOf(this.userId));
        if (chat == null && user == null) {
            return;
        }
        this.currentUser = user;
        this.currentChat = chat;
        boolean z = false;
        if (user == null ? chat.photo != null : user.photo != null) {
            TLRPC$Chat tLRPC$Chat = user != null ? user : chat;
            this.avatar = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(tLRPC$Chat, 1);
            this.avatarImage.setForUserOrChat(tLRPC$Chat, this.avatarDrawable);
            if (forUserOrChat != null) {
                z = true;
            }
        } else {
            this.avatarImage.setImageDrawable(this.avatarDrawable);
        }
        if (this.setAvatarCell != null) {
            if (z || this.imageUpdater.isUploadingImage()) {
                this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), R.drawable.msg_addphoto, true);
            } else {
                this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), R.drawable.msg_addphoto, true);
            }
            if (this.cameraDrawable == null) {
                int i = R.raw.camera_outline;
                this.cameraDrawable = new RLottieDrawable(i, BuildConfig.APP_CENTER_HASH + i, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            }
            this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.setAvatarCell.imageView.setAnimation(this.cameraDrawable);
        }
        if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().checkCurrentImageVisibility();
        }
    }

    private void updateCanForum() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditActivity.updateCanForum():void");
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        boolean z = true;
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) objArr[0];
            if (tLRPC$ChatFull.id == this.chatId) {
                if (this.info == null && (editTextBoldCursor = this.descriptionTextView) != null) {
                    editTextBoldCursor.setText(tLRPC$ChatFull.about);
                }
                boolean z2 = this.info == null;
                this.info = tLRPC$ChatFull;
                updateCanForum();
                if (ChatObject.isChannel(this.currentChat) && !this.info.hidden_prehistory) {
                    z = false;
                }
                this.historyHidden = z;
                updateFields(false, false);
                if (z2) {
                    loadLinksCount();
                }
            }
        } else if (i == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0) {
                setAvatar();
            }
            if ((intValue & MessagesController.UPDATE_MASK_NAME) != 0) {
                updatePublicLinksCount();
            }
        } else if (i == NotificationCenter.chatAvailableReactionsUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.chatId) {
                TLRPC$ChatFull chatFull = getMessagesController().getChatFull(longValue);
                this.info = chatFull;
                if (chatFull != null) {
                    this.availableReactions = chatFull.available_reactions;
                }
                updateReactionsCell(true);
            }
        }
    }

    @Override
    public void onUploadProgressChanged(float f) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override
    public void didStartUpload(boolean z) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public void didUploadPhoto(final TLRPC$InputFile tLRPC$InputFile, final TLRPC$InputFile tLRPC$InputFile2, final double d, final String str, final TLRPC$PhotoSize tLRPC$PhotoSize, final TLRPC$PhotoSize tLRPC$PhotoSize2, boolean z, final TLRPC$VideoSize tLRPC$VideoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditActivity.this.lambda$didUploadPhoto$37(tLRPC$PhotoSize2, tLRPC$InputFile, tLRPC$InputFile2, tLRPC$VideoSize, tLRPC$PhotoSize, d, str);
            }
        });
    }

    public void lambda$didUploadPhoto$37(TLRPC$PhotoSize tLRPC$PhotoSize, TLRPC$InputFile tLRPC$InputFile, TLRPC$InputFile tLRPC$InputFile2, TLRPC$VideoSize tLRPC$VideoSize, TLRPC$PhotoSize tLRPC$PhotoSize2, double d, String str) {
        TLRPC$FileLocation tLRPC$FileLocation = tLRPC$PhotoSize.location;
        this.avatar = tLRPC$FileLocation;
        if (tLRPC$InputFile != null || tLRPC$InputFile2 != null || tLRPC$VideoSize != null) {
            long j = 0;
            if (this.userId != 0) {
                TLRPC$User tLRPC$User = this.currentUser;
                if (tLRPC$User != null) {
                    tLRPC$User.photo = new TLRPC$TL_userProfilePhoto();
                    TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = this.currentUser.photo;
                    if (tLRPC$InputFile != null) {
                        j = tLRPC$InputFile.id;
                    } else if (tLRPC$InputFile2 != null) {
                        j = tLRPC$InputFile2.id;
                    }
                    tLRPC$UserProfilePhoto.photo_id = j;
                    tLRPC$UserProfilePhoto.photo_big = tLRPC$PhotoSize2.location;
                    tLRPC$UserProfilePhoto.photo_small = tLRPC$PhotoSize.location;
                    getMessagesController().putUser(this.currentUser, true);
                }
                TLRPC$TL_photos_uploadProfilePhoto tLRPC$TL_photos_uploadProfilePhoto = new TLRPC$TL_photos_uploadProfilePhoto();
                if (tLRPC$InputFile != null) {
                    tLRPC$TL_photos_uploadProfilePhoto.file = tLRPC$InputFile;
                    tLRPC$TL_photos_uploadProfilePhoto.flags |= 1;
                }
                if (tLRPC$InputFile2 != null) {
                    tLRPC$TL_photos_uploadProfilePhoto.video = tLRPC$InputFile2;
                    int i = tLRPC$TL_photos_uploadProfilePhoto.flags | 2;
                    tLRPC$TL_photos_uploadProfilePhoto.flags = i;
                    tLRPC$TL_photos_uploadProfilePhoto.video_start_ts = d;
                    tLRPC$TL_photos_uploadProfilePhoto.flags = i | 4;
                }
                if (tLRPC$VideoSize != null) {
                    tLRPC$TL_photos_uploadProfilePhoto.video_emoji_markup = tLRPC$VideoSize;
                    tLRPC$TL_photos_uploadProfilePhoto.flags |= 16;
                }
                tLRPC$TL_photos_uploadProfilePhoto.bot = getMessagesController().getInputUser(this.currentUser);
                tLRPC$TL_photos_uploadProfilePhoto.flags |= 32;
                getConnectionsManager().sendRequest(tLRPC$TL_photos_uploadProfilePhoto, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        ChatEditActivity.this.lambda$didUploadPhoto$36(tLObject, tLRPC$TL_error);
                    }
                });
            } else {
                getMessagesController().changeChatAvatar(this.chatId, null, tLRPC$InputFile, tLRPC$InputFile2, tLRPC$VideoSize, d, str, tLRPC$PhotoSize.location, tLRPC$PhotoSize2.location, null);
            }
            if (this.createAfterUpload) {
                try {
                    AlertDialog alertDialog = this.progressDialog;
                    if (alertDialog != null && alertDialog.isShowing()) {
                        this.progressDialog.dismiss();
                        this.progressDialog = null;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.donePressed = false;
                this.doneButton.performClick();
            }
            showAvatarProgress(false, true);
            return;
        }
        BackupImageView backupImageView = this.avatarImage;
        ImageLocation forLocal = ImageLocation.getForLocal(tLRPC$FileLocation);
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        Object obj = this.currentUser;
        if (obj == null) {
            obj = this.currentChat;
        }
        backupImageView.setImage(forLocal, "50_50", avatarDrawable, obj);
        this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), R.drawable.msg_addphoto, true);
        if (this.cameraDrawable == null) {
            int i2 = R.raw.camera_outline;
            this.cameraDrawable = new RLottieDrawable(i2, BuildConfig.APP_CENTER_HASH + i2, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
        }
        this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
        this.setAvatarCell.imageView.setAnimation(this.cameraDrawable);
        showAvatarProgress(true, false);
    }

    public void lambda$didUploadPhoto$36(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditActivity.this.lambda$didUploadPhoto$35();
            }
        });
    }

    public void lambda$didUploadPhoto$35() {
        this.hasUploadedPhoto = true;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    @Override
    public String getInitialSearchString() {
        return this.nameTextView.getText().toString();
    }

    public void showConvertTooltip() {
        this.undoView.showWithAction(0L, 76, (Runnable) null);
    }

    public boolean checkDiscard() {
        EditTextEmoji editTextEmoji;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        long j = this.userId;
        String str3 = BuildConfig.APP_CENTER_HASH;
        if (j != 0) {
            TLRPC$UserFull tLRPC$UserFull = this.userInfo;
            if (tLRPC$UserFull != null && (str2 = tLRPC$UserFull.about) != null) {
                str3 = str2;
            }
            EditTextEmoji editTextEmoji2 = this.nameTextView;
            if ((editTextEmoji2 == null || this.currentUser.first_name.equals(editTextEmoji2.getText().toString())) && ((editTextBoldCursor2 = this.descriptionTextView) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            showDialog(new AlertDialog.Builder(getParentActivity()).setTitle(LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges)).setMessage(LocaleController.getString(R.string.BotSettingsChangedAlert)).setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatEditActivity.this.lambda$checkDiscard$38(dialogInterface, i);
                }
            }).setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatEditActivity.this.lambda$checkDiscard$39(dialogInterface, i);
                }
            }).create());
            return false;
        }
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        if (tLRPC$ChatFull != null && (str = tLRPC$ChatFull.about) != null) {
            str3 = str;
        }
        if ((tLRPC$ChatFull == null || !ChatObject.isChannel(this.currentChat) || this.info.hidden_prehistory == this.historyHidden) && (((editTextEmoji = this.nameTextView) == null || this.currentChat.title.equals(editTextEmoji.getText().toString())) && ((editTextBoldCursor = this.descriptionTextView) == null || str3.equals(editTextBoldCursor.getText().toString())))) {
            boolean z = this.signMessages;
            TLRPC$Chat tLRPC$Chat = this.currentChat;
            if (z == tLRPC$Chat.signatures && this.forum == tLRPC$Chat.forum) {
                return true;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges));
        if (this.isChannel) {
            builder.setMessage(LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert));
        } else {
            builder.setMessage(LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert));
        }
        builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                ChatEditActivity.this.lambda$checkDiscard$40(dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                ChatEditActivity.this.lambda$checkDiscard$41(dialogInterface, i);
            }
        });
        showDialog(builder.create());
        return false;
    }

    public void lambda$checkDiscard$38(DialogInterface dialogInterface, int i) {
        processDone();
    }

    public void lambda$checkDiscard$39(DialogInterface dialogInterface, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$40(DialogInterface dialogInterface, int i) {
        processDone();
    }

    public void lambda$checkDiscard$41(DialogInterface dialogInterface, int i) {
        finishFragment();
    }

    private int getAdminCount() {
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        if (tLRPC$ChatFull == null) {
            return 1;
        }
        int size = tLRPC$ChatFull.participants.participants.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC$ChatParticipant tLRPC$ChatParticipant = this.info.participants.participants.get(i2);
            if ((tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipantAdmin) || (tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipantCreator)) {
                i++;
            }
        }
        return i;
    }

    public void processDone() {
        EditTextEmoji editTextEmoji;
        String str;
        String str2;
        if (this.donePressed || (editTextEmoji = this.nameTextView) == null) {
            return;
        }
        if (editTextEmoji.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.nameTextView);
            return;
        }
        this.donePressed = true;
        TLRPC$User tLRPC$User = this.currentUser;
        String str3 = BuildConfig.APP_CENTER_HASH;
        if (tLRPC$User != null) {
            final TLRPC$TL_bots_setBotInfo tLRPC$TL_bots_setBotInfo = new TLRPC$TL_bots_setBotInfo();
            tLRPC$TL_bots_setBotInfo.bot = getMessagesController().getInputUser(this.currentUser);
            tLRPC$TL_bots_setBotInfo.flags |= 4;
            tLRPC$TL_bots_setBotInfo.lang_code = BuildConfig.APP_CENTER_HASH;
            if (!this.currentUser.first_name.equals(this.nameTextView.getText().toString())) {
                tLRPC$TL_bots_setBotInfo.name = this.nameTextView.getText().toString();
                tLRPC$TL_bots_setBotInfo.flags |= 8;
            }
            TLRPC$UserFull tLRPC$UserFull = this.userInfo;
            if (tLRPC$UserFull != null && (str2 = tLRPC$UserFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.descriptionTextView;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                tLRPC$TL_bots_setBotInfo.about = this.descriptionTextView.getText().toString();
                tLRPC$TL_bots_setBotInfo.flags = 1 | tLRPC$TL_bots_setBotInfo.flags;
            }
            this.progressDialog = new AlertDialog(getParentActivity(), 3);
            final int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_bots_setBotInfo, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChatEditActivity.this.lambda$processDone$43(tLRPC$TL_bots_setBotInfo, tLObject, tLRPC$TL_error);
                }
            });
            this.progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ChatEditActivity.this.lambda$processDone$44(sendRequest, dialogInterface);
                }
            });
            this.progressDialog.show();
        } else if (!ChatObject.isChannel(this.currentChat) && (!this.historyHidden || this.forum)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j) {
                    ChatEditActivity.this.lambda$processDone$45(j);
                }
            });
        } else {
            if (this.info != null && ChatObject.isChannel(this.currentChat)) {
                TLRPC$ChatFull tLRPC$ChatFull = this.info;
                boolean z = tLRPC$ChatFull.hidden_prehistory;
                boolean z2 = this.historyHidden;
                if (z != z2) {
                    tLRPC$ChatFull.hidden_prehistory = z2;
                    getMessagesController().toggleChannelInvitesHistory(this.chatId, this.historyHidden);
                }
            }
            if (this.imageUpdater.isUploadingImage()) {
                this.createAfterUpload = true;
                AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
                this.progressDialog = alertDialog;
                alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        ChatEditActivity.this.lambda$processDone$46(dialogInterface);
                    }
                });
                this.progressDialog.show();
                return;
            }
            if (!this.currentChat.title.equals(this.nameTextView.getText().toString())) {
                getMessagesController().changeChatTitle(this.chatId, this.nameTextView.getText().toString());
            }
            TLRPC$ChatFull tLRPC$ChatFull2 = this.info;
            if (tLRPC$ChatFull2 != null && (str = tLRPC$ChatFull2.about) != null) {
                str3 = str;
            }
            EditTextBoldCursor editTextBoldCursor2 = this.descriptionTextView;
            if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
                getMessagesController().updateChatAbout(this.chatId, this.descriptionTextView.getText().toString(), this.info);
            }
            boolean z3 = this.signMessages;
            TLRPC$Chat tLRPC$Chat = this.currentChat;
            if (z3 != tLRPC$Chat.signatures) {
                tLRPC$Chat.signatures = true;
                getMessagesController().toggleChannelSignatures(this.chatId, this.signMessages);
            }
            if (this.forum != this.currentChat.forum) {
                getMessagesController().toggleChannelForum(this.chatId, this.forum);
                List<BaseFragment> fragmentStack = getParentLayout().getFragmentStack();
                for (int i = 0; i < fragmentStack.size(); i++) {
                    if ((fragmentStack.get(i) instanceof ChatActivity) && ((ChatActivity) fragmentStack.get(i)).getArguments().getLong("chat_id") == this.chatId) {
                        getParentLayout().removeFragmentFromStack(i);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.chatId);
                        getParentLayout().addFragmentToStack(TopicsFragment.getTopicsOrChat(this, bundle), i);
                    }
                }
            }
            finishFragment();
        }
    }

    public void lambda$processDone$43(TLRPC$TL_bots_setBotInfo tLRPC$TL_bots_setBotInfo, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$UserFull tLRPC$UserFull = this.userInfo;
        if (tLRPC$UserFull != null) {
            tLRPC$UserFull.about = tLRPC$TL_bots_setBotInfo.about;
            getMessagesStorage().updateUserInfo(this.userInfo, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditActivity.this.lambda$processDone$42();
            }
        });
    }

    public void lambda$processDone$42() {
        this.progressDialog.dismiss();
        finishFragment();
    }

    public void lambda$processDone$44(int i, DialogInterface dialogInterface) {
        this.donePressed = false;
        this.progressDialog = null;
        getConnectionsManager().cancelRequest(i, true);
    }

    public void lambda$processDone$45(long j) {
        if (j == 0) {
            this.donePressed = false;
            return;
        }
        this.chatId = j;
        this.currentChat = getMessagesController().getChat(Long.valueOf(j));
        this.donePressed = false;
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        if (tLRPC$ChatFull != null) {
            tLRPC$ChatFull.hidden_prehistory = true;
        }
        processDone();
    }

    public void lambda$processDone$46(DialogInterface dialogInterface) {
        this.createAfterUpload = false;
        this.progressDialog = null;
        this.donePressed = false;
    }

    private void showAvatarProgress(final boolean z, boolean z2) {
        if (this.avatarProgressView == null) {
            return;
        }
        AnimatorSet animatorSet = this.avatarAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.avatarAnimation = null;
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.avatarAnimation = animatorSet2;
            if (z) {
                this.avatarProgressView.setVisibility(0);
                this.avatarOverlay.setVisibility(0);
                this.avatarAnimation.playTogether(ObjectAnimator.ofFloat(this.avatarProgressView, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.avatarOverlay, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.avatarProgressView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.avatarOverlay, View.ALPHA, 0.0f));
            }
            this.avatarAnimation.setDuration(180L);
            this.avatarAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (ChatEditActivity.this.avatarAnimation == null || ChatEditActivity.this.avatarProgressView == null) {
                        return;
                    }
                    if (!z) {
                        ChatEditActivity.this.avatarProgressView.setVisibility(4);
                        ChatEditActivity.this.avatarOverlay.setVisibility(4);
                    }
                    ChatEditActivity.this.avatarAnimation = null;
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    ChatEditActivity.this.avatarAnimation = null;
                }
            });
            this.avatarAnimation.start();
        } else if (z) {
            this.avatarProgressView.setAlpha(1.0f);
            this.avatarProgressView.setVisibility(0);
            this.avatarOverlay.setAlpha(1.0f);
            this.avatarOverlay.setVisibility(0);
        } else {
            this.avatarProgressView.setAlpha(0.0f);
            this.avatarProgressView.setVisibility(4);
            this.avatarOverlay.setAlpha(0.0f);
            this.avatarOverlay.setVisibility(4);
        }
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        this.imageUpdater.onActivityResult(i, i2, intent);
    }

    @Override
    public void saveSelfArgs(Bundle bundle) {
        String str;
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null && (str = imageUpdater.currentPicturePath) != null) {
            bundle.putString("path", str);
        }
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            String obj = editTextEmoji.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public void setInfo(TLRPC$UserFull tLRPC$UserFull) {
        this.userInfo = tLRPC$UserFull;
        if (tLRPC$UserFull == null || this.currentUser != null) {
            return;
        }
        this.currentUser = this.userId == 0 ? null : getMessagesController().getUser(Long.valueOf(this.userId));
    }

    public void setInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.info = tLRPC$ChatFull;
        if (tLRPC$ChatFull != null) {
            if (this.currentChat == null) {
                this.currentChat = getMessagesController().getChat(Long.valueOf(this.chatId));
            }
            this.historyHidden = !ChatObject.isChannel(this.currentChat) || this.info.hidden_prehistory;
            this.availableReactions = this.info.available_reactions;
            this.preloadedReactions.clear();
            this.preloadedReactions.addAll(ReactionsUtils.startPreloadReactions(this.currentChat, this.info));
        }
    }

    private void updateFields(boolean z, boolean z2) {
        int i;
        int i2;
        String str;
        TLRPC$ChatFull tLRPC$ChatFull;
        int i3;
        String str2;
        String string;
        TextCell textCell;
        TextCell textCell2;
        TextCell textCell3;
        TextCell textCell4;
        int i4;
        String str3;
        String format;
        TextCell textCell5;
        TextCell textCell6;
        TLRPC$ChatFull tLRPC$ChatFull2;
        TextCell textCell7;
        TextCell textCell8;
        TextCell textCell9;
        TLRPC$Chat chat;
        if (z && (chat = getMessagesController().getChat(Long.valueOf(this.chatId))) != null) {
            this.currentChat = chat;
        }
        boolean z3 = !ChatObject.isPublic(this.currentChat);
        TextInfoPrivacyCell textInfoPrivacyCell = this.settingsSectionCell;
        if (textInfoPrivacyCell != null) {
            textInfoPrivacyCell.setVisibility((this.signCell == null && this.typeCell == null && ((textCell7 = this.linkedCell) == null || textCell7.getVisibility() != 0) && (((textCell8 = this.historyCell) == null || textCell8.getVisibility() != 0) && ((textCell9 = this.locationCell) == null || textCell9.getVisibility() != 0))) ? 8 : 0);
        }
        TextCell textCell10 = this.logCell;
        if (textCell10 != null) {
            TLRPC$Chat tLRPC$Chat = this.currentChat;
            textCell10.setVisibility((!tLRPC$Chat.megagroup || tLRPC$Chat.gigagroup || ((tLRPC$ChatFull2 = this.info) != null && tLRPC$ChatFull2.participants_count > 200)) ? 0 : 8);
        }
        TextCell textCell11 = this.linkedCell;
        if (textCell11 != null) {
            TLRPC$ChatFull tLRPC$ChatFull3 = this.info;
            if (tLRPC$ChatFull3 == null || (!this.isChannel && tLRPC$ChatFull3.linked_chat_id == 0)) {
                textCell11.setVisibility(8);
            } else {
                textCell11.setVisibility(0);
                if (this.info.linked_chat_id == 0) {
                    this.linkedCell.setTextAndValueAndIcon(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), R.drawable.msg_discuss, true);
                } else {
                    TLRPC$Chat chat2 = getMessagesController().getChat(Long.valueOf(this.info.linked_chat_id));
                    if (chat2 == null) {
                        this.linkedCell.setVisibility(8);
                    } else if (this.isChannel) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.linkedCell.setTextAndValueAndIcon(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, R.drawable.msg_discuss, true);
                        } else {
                            this.linkedCell.setTextAndValueAndIcon(LocaleController.getString("Discussion", R.string.Discussion), "@" + publicUsername, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            TextCell textCell12 = this.linkedCell;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i5 = R.drawable.msg_channel;
                            TextCell textCell13 = this.forumsCell;
                            textCell12.setTextAndValueAndIcon(string2, str4, i5, textCell13 != null && textCell13.getVisibility() == 0);
                        } else {
                            TextCell textCell14 = this.linkedCell;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str5 = "@" + publicUsername2;
                            int i6 = R.drawable.msg_channel;
                            TextCell textCell15 = this.forumsCell;
                            textCell14.setTextAndValueAndIcon(string3, str5, i6, textCell15 != null && textCell15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        TextCell textCell16 = this.locationCell;
        if (textCell16 != null) {
            TLRPC$ChatFull tLRPC$ChatFull4 = this.info;
            if (tLRPC$ChatFull4 != null && tLRPC$ChatFull4.can_set_location) {
                textCell16.setVisibility(0);
                TLRPC$ChannelLocation tLRPC$ChannelLocation = this.info.location;
                if (tLRPC$ChannelLocation instanceof TLRPC$TL_channelLocation) {
                    this.locationCell.setTextAndValue(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC$TL_channelLocation) tLRPC$ChannelLocation).address, z2, true);
                } else {
                    this.locationCell.setTextAndValue(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z2, true);
                }
            } else {
                textCell16.setVisibility(8);
            }
        }
        if (this.typeCell != null) {
            TLRPC$ChatFull tLRPC$ChatFull5 = this.info;
            if (tLRPC$ChatFull5 != null && (tLRPC$ChatFull5.location instanceof TLRPC$TL_channelLocation)) {
                if (z3) {
                    format = LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit);
                } else {
                    format = String.format("https://" + getMessagesController().linkPrefix + "/%s", ChatObject.getPublicUsername(this.currentChat));
                }
                TextCell textCell17 = this.typeCell;
                String string4 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i7 = R.drawable.msg_channel;
                TextCell textCell18 = this.historyCell;
                textCell17.setTextAndValueAndIcon(string4, format, i7, (textCell18 != null && textCell18.getVisibility() == 0) || ((textCell5 = this.linkedCell) != null && textCell5.getVisibility() == 0) || ((textCell6 = this.forumsCell) != null && textCell6.getVisibility() == 0));
            } else {
                boolean z4 = this.currentChat.noforwards;
                if (this.isChannel) {
                    if (!z3) {
                        i4 = R.string.TypePublic;
                        str3 = "TypePublic";
                    } else if (z4) {
                        i4 = R.string.TypePrivateRestrictedForwards;
                        str3 = "TypePrivateRestrictedForwards";
                    } else {
                        i4 = R.string.TypePrivate;
                        str3 = "TypePrivate";
                    }
                    string = LocaleController.getString(str3, i4);
                } else {
                    if (!z3) {
                        i3 = R.string.TypePublicGroup;
                        str2 = "TypePublicGroup";
                    } else if (z4) {
                        i3 = R.string.TypePrivateGroupRestrictedForwards;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i3 = R.string.TypePrivateGroup;
                        str2 = "TypePrivateGroup";
                    }
                    string = LocaleController.getString(str2, i3);
                }
                if (this.isChannel) {
                    TextCell textCell19 = this.typeCell;
                    String string5 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i8 = R.drawable.msg_channel;
                    TextCell textCell20 = this.historyCell;
                    textCell19.setTextAndValueAndIcon(string5, string, i8, (textCell20 != null && textCell20.getVisibility() == 0) || ((textCell3 = this.linkedCell) != null && textCell3.getVisibility() == 0) || ((textCell4 = this.forumsCell) != null && textCell4.getVisibility() == 0));
                } else {
                    TextCell textCell21 = this.typeCell;
                    String string6 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i9 = R.drawable.msg_groups;
                    TextCell textCell22 = this.historyCell;
                    textCell21.setTextAndValueAndIcon(string6, string, i9, (textCell22 != null && textCell22.getVisibility() == 0) || ((textCell = this.linkedCell) != null && textCell.getVisibility() == 0) || ((textCell2 = this.forumsCell) != null && textCell2.getVisibility() == 0));
                }
            }
        }
        if (this.historyCell != null) {
            if (!this.historyHidden || this.forum) {
                i2 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            } else {
                i2 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            }
            this.historyCell.setTextAndValueAndIcon(LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort), LocaleController.getString(str, i2), z2, R.drawable.msg_discuss, this.forumsCell != null);
            this.historyCell.setEnabled(!this.forum);
            updateHistoryShow(!this.forum && z3 && ((tLRPC$ChatFull = this.info) == null || tLRPC$ChatFull.linked_chat_id == 0) && (tLRPC$ChatFull == null || !(tLRPC$ChatFull.location instanceof TLRPC$TL_channelLocation)), z2);
        }
        TextCell textCell23 = this.membersCell;
        if (textCell23 != null) {
            if (this.info != null) {
                TextCell textCell24 = this.memberRequestsCell;
                if (textCell24 != null) {
                    if (textCell24.getParent() == null) {
                        this.infoContainer.addView(this.memberRequestsCell, this.infoContainer.indexOfChild(this.membersCell) + 1, LayoutHelper.createLinear(-1, -2));
                    }
                    this.memberRequestsCell.setVisibility(this.info.requests_pending > 0 ? 0 : 8);
                }
                if (this.isChannel) {
                    this.membersCell.setTextAndValueAndIcon(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.info.participants_count)), R.drawable.msg_groups, true);
                    TextCell textCell25 = this.blockCell;
                    String string7 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                    TLRPC$ChatFull tLRPC$ChatFull6 = this.info;
                    String format2 = String.format("%d", Integer.valueOf(Math.max(tLRPC$ChatFull6.banned_count, tLRPC$ChatFull6.kicked_count)));
                    int i10 = R.drawable.msg_user_remove;
                    TextCell textCell26 = this.logCell;
                    textCell25.setTextAndValueAndIcon(string7, format2, i10, textCell26 != null && textCell26.getVisibility() == 0);
                } else {
                    if (ChatObject.isChannel(this.currentChat)) {
                        this.membersCell.setTextAndValueAndIcon(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.info.participants_count)), R.drawable.msg_groups, true);
                    } else {
                        this.membersCell.setTextAndValueAndIcon(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.info.participants.participants.size())), R.drawable.msg_groups, this.memberRequestsCell.getVisibility() == 0);
                    }
                    TLRPC$Chat tLRPC$Chat2 = this.currentChat;
                    if (tLRPC$Chat2.gigagroup) {
                        TextCell textCell27 = this.blockCell;
                        String string8 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                        TLRPC$ChatFull tLRPC$ChatFull7 = this.info;
                        String format3 = String.format("%d", Integer.valueOf(Math.max(tLRPC$ChatFull7.banned_count, tLRPC$ChatFull7.kicked_count)));
                        int i11 = R.drawable.msg_user_remove;
                        TextCell textCell28 = this.logCell;
                        textCell27.setTextAndValueAndIcon(string8, format3, i11, textCell28 != null && textCell28.getVisibility() == 0);
                    } else {
                        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights = tLRPC$Chat2.default_banned_rights;
                        if (tLRPC$TL_chatBannedRights != null) {
                            i = (!tLRPC$TL_chatBannedRights.send_plain ? 1 : 0) + ChatUsersActivity.getSendMediaSelectedCount(tLRPC$TL_chatBannedRights);
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights2 = this.currentChat.default_banned_rights;
                            if (!tLRPC$TL_chatBannedRights2.pin_messages) {
                                i++;
                            }
                            if (!tLRPC$TL_chatBannedRights2.invite_users) {
                                i++;
                            }
                            if (this.forum && !tLRPC$TL_chatBannedRights2.manage_topics) {
                                i++;
                            }
                            if (!tLRPC$TL_chatBannedRights2.change_info) {
                                i++;
                            }
                        } else {
                            i = this.forum ? 14 : 13;
                        }
                        TextCell textCell29 = this.blockCell;
                        String string9 = LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions);
                        Object[] objArr = new Object[2];
                        objArr[0] = Integer.valueOf(i);
                        objArr[1] = Integer.valueOf(this.forum ? 14 : 13);
                        textCell29.setTextAndValueAndIcon(string9, String.format("%d/%d", objArr), z2, R.drawable.msg_permissions, true);
                    }
                    TextCell textCell30 = this.memberRequestsCell;
                    if (textCell30 != null) {
                        String string10 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format4 = String.format("%d", Integer.valueOf(this.info.requests_pending));
                        int i12 = R.drawable.msg_requests;
                        TextCell textCell31 = this.logCell;
                        textCell30.setTextAndValueAndIcon(string10, format4, i12, textCell31 != null && textCell31.getVisibility() == 0);
                    }
                }
                TextCell textCell32 = this.adminCell;
                String string11 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                Object[] objArr2 = new Object[1];
                objArr2[0] = Integer.valueOf(ChatObject.isChannel(this.currentChat) ? this.info.admins_count : getAdminCount());
                textCell32.setTextAndValueAndIcon(string11, String.format("%d", objArr2), R.drawable.msg_admins, true);
            } else {
                if (this.isChannel) {
                    textCell23.setTextAndIcon((CharSequence) LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), R.drawable.msg_groups, true);
                    TextCell textCell33 = this.blockCell;
                    String string12 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                    int i13 = R.drawable.msg_chats_remove;
                    TextCell textCell34 = this.logCell;
                    textCell33.setTextAndIcon(string12, i13, textCell34 != null && textCell34.getVisibility() == 0);
                } else {
                    String string13 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i14 = R.drawable.msg_groups;
                    TextCell textCell35 = this.logCell;
                    textCell23.setTextAndIcon(string13, i14, textCell35 != null && textCell35.getVisibility() == 0);
                    if (this.currentChat.gigagroup) {
                        TextCell textCell36 = this.blockCell;
                        String string14 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                        int i15 = R.drawable.msg_chats_remove;
                        TextCell textCell37 = this.logCell;
                        textCell36.setTextAndIcon(string14, i15, textCell37 != null && textCell37.getVisibility() == 0);
                    } else {
                        this.blockCell.setTextAndIcon((CharSequence) LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions), R.drawable.msg_permissions, true);
                    }
                }
                this.adminCell.setTextAndIcon((CharSequence) LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), R.drawable.msg_admins, true);
            }
            this.reactionsCell.setVisibility(ChatObject.canChangeChatInfo(this.currentChat) ? 0 : 8);
            updateReactionsCell(z2);
            if (this.info == null || !ChatObject.canUserDoAdminAction(this.currentChat, 3) || (!z3 && this.currentChat.creator)) {
                this.inviteLinksCell.setVisibility(8);
            } else if (this.info.invitesCount > 0) {
                this.inviteLinksCell.setTextAndValueAndIcon(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.info.invitesCount), R.drawable.msg_link2, true);
            } else {
                this.inviteLinksCell.setTextAndValueAndIcon(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", R.drawable.msg_link2, true);
            }
        }
        TextCell textCell38 = this.stickersCell;
        if (textCell38 == null || this.info == null) {
            return;
        }
        String string15 = LocaleController.getString(R.string.GroupStickers);
        TLRPC$StickerSet tLRPC$StickerSet = this.info.stickerset;
        textCell38.setTextAndValueAndIcon(string15, tLRPC$StickerSet != null ? tLRPC$StickerSet.title : LocaleController.getString(R.string.Add), R.drawable.msg_sticker, false);
    }

    public void updateColorCell() {
        TextCell textCell;
        TextCell textCell2;
        PeerColorActivity.ChangeNameColorCell changeNameColorCell = this.colorCell;
        if (changeNameColorCell != null) {
            TLRPC$Chat tLRPC$Chat = this.currentChat;
            TextCell textCell3 = this.historyCell;
            changeNameColorCell.set(tLRPC$Chat, (textCell3 != null && textCell3.getVisibility() == 0) || ((textCell = this.signCell) != null && textCell.getVisibility() == 0) || ((textCell2 = this.forumsCell) != null && textCell2.getVisibility() == 0));
        }
    }

    private void updateHistoryShow(final boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.updateHistoryShowAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.historyCell.getAlpha() <= 0.0f && !z) {
            this.historyCell.setVisibility(8);
            updateColorCell();
            return;
        }
        if (this.historyCell.getVisibility() == 0 && this.historyCell.getAlpha() >= 1.0f && z) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (int i = 0; i < this.typeEditContainer.getChildCount(); i++) {
            if (!z3 && this.typeEditContainer.getChildAt(i) == this.historyCell) {
                z3 = true;
            } else if (z3) {
                arrayList.add(this.typeEditContainer.getChildAt(i));
            }
        }
        boolean z4 = false;
        for (int i2 = 0; i2 < this.linearLayout.getChildCount(); i2++) {
            if (!z4 && this.linearLayout.getChildAt(i2) == this.typeEditContainer) {
                z4 = true;
            } else if (z4) {
                arrayList.add(this.linearLayout.getChildAt(i2));
            }
        }
        if (this.historyCell.getVisibility() != 0) {
            this.historyCell.setAlpha(0.0f);
            TextCell textCell = this.historyCell;
            textCell.setTranslationY((-textCell.getHeight()) / 2.0f);
        }
        this.historyCell.setVisibility(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((View) arrayList.get(i3)).setTranslationY((-this.historyCell.getHeight()) * (1.0f - this.historyCell.getAlpha()));
        }
        if (z2) {
            float[] fArr = new float[2];
            fArr[0] = this.historyCell.getAlpha();
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.updateHistoryShowAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ChatEditActivity.this.lambda$updateHistoryShow$47(arrayList, valueAnimator2);
                }
            });
            this.updateHistoryShowAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ChatEditActivity.this.historyCell.setVisibility(z ? 0 : 8);
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        ((View) arrayList.get(i4)).setTranslationY(0.0f);
                    }
                }
            });
            this.updateHistoryShowAnimator.setDuration(320L);
            this.updateHistoryShowAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.updateHistoryShowAnimator.start();
            return;
        }
        this.historyCell.setAlpha(z ? 1.0f : 0.0f);
        TextCell textCell2 = this.historyCell;
        textCell2.setTranslationY(((-textCell2.getHeight()) / 2.0f) * (z ? 0.0f : 1.0f));
        this.historyCell.setScaleY(((z ? 1.0f : 0.0f) * 0.8f) + 0.2f);
        this.historyCell.setVisibility(z ? 0 : 8);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((View) arrayList.get(i4)).setTranslationY(0.0f);
        }
        this.updateHistoryShowAnimator = null;
    }

    public void lambda$updateHistoryShow$47(ArrayList arrayList, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.historyCell.setAlpha(floatValue);
        TextCell textCell = this.historyCell;
        float f = 1.0f - floatValue;
        textCell.setTranslationY(((-textCell.getHeight()) / 2.0f) * f);
        this.historyCell.setScaleY((floatValue * 0.8f) + 0.2f);
        for (int i = 0; i < arrayList.size(); i++) {
            ((View) arrayList.get(i)).setTranslationY((-this.historyCell.getHeight()) * f);
        }
    }

    private void updateReactionsCell(boolean z) {
        String string;
        int i;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.currentChat);
        TLRPC$ChatReactions tLRPC$ChatReactions = this.availableReactions;
        if (tLRPC$ChatReactions == null || (tLRPC$ChatReactions instanceof TLRPC$TL_chatReactionsNone)) {
            string = LocaleController.getString("ReactionsOff", R.string.ReactionsOff);
        } else if (tLRPC$ChatReactions instanceof TLRPC$TL_chatReactionsSome) {
            TLRPC$TL_chatReactionsSome tLRPC$TL_chatReactionsSome = (TLRPC$TL_chatReactionsSome) tLRPC$ChatReactions;
            int i2 = 0;
            while (i < tLRPC$TL_chatReactionsSome.reactions.size()) {
                TLRPC$Reaction tLRPC$Reaction = tLRPC$TL_chatReactionsSome.reactions.get(i);
                if (tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) {
                    TLRPC$TL_availableReaction tLRPC$TL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon);
                    if (tLRPC$TL_availableReaction != null) {
                        if (tLRPC$TL_availableReaction.inactive) {
                        }
                        i2++;
                    }
                } else {
                    i = tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji ? 0 : i + 1;
                    i2++;
                }
            }
            if (isChannelAndNotMegaGroup) {
                string = i2 == 0 ? LocaleController.getString("ReactionsOff", R.string.ReactionsOff) : String.valueOf(i2);
            } else {
                int min = Math.min(getMediaDataController().getEnabledReactionsList().size(), i2);
                if (min == 0) {
                    string = LocaleController.getString("ReactionsOff", R.string.ReactionsOff);
                } else {
                    string = LocaleController.formatString("ReactionsCount", R.string.ReactionsCount, Integer.valueOf(min), Integer.valueOf(getMediaDataController().getEnabledReactionsList().size()));
                }
            }
        } else {
            string = LocaleController.getString("ReactionsAll", R.string.ReactionsAll);
        }
        this.reactionsCell.setTextAndValueAndIcon(LocaleController.getString("Reactions", R.string.Reactions), string, z, R.drawable.msg_reactions2, true);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ChatEditActivity.this.lambda$getThemeDescriptions$48();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        TextCell textCell = this.setAvatarCell;
        int i = ThemeDescription.FLAG_SELECTOR;
        int i2 = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(textCell, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.setAvatarCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.setAvatarCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueIcon));
        arrayList.add(new ThemeDescription(this.membersCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.membersCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        int i4 = Theme.key_windowBackgroundWhiteGrayIcon;
        arrayList.add(new ThemeDescription(this.membersCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.adminCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.adminCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.adminCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.inviteLinksCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.inviteLinksCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.inviteLinksCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        if (this.memberRequestsCell != null) {
            arrayList.add(new ThemeDescription(this.memberRequestsCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
            arrayList.add(new ThemeDescription(this.memberRequestsCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
            arrayList.add(new ThemeDescription(this.memberRequestsCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        }
        arrayList.add(new ThemeDescription(this.blockCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.blockCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.blockCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.logCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.logCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.logCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.typeCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.typeCell, 0, new Class[]{TextDetailCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        int i5 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.typeCell, 0, new Class[]{TextDetailCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.historyCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.historyCell, 0, new Class[]{TextDetailCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.historyCell, 0, new Class[]{TextDetailCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.locationCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.locationCell, 0, new Class[]{TextDetailCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.locationCell, 0, new Class[]{TextDetailCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.nameTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i3));
        EditTextEmoji editTextEmoji = this.nameTextView;
        int i6 = ThemeDescription.FLAG_HINTTEXTCOLOR;
        int i7 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(editTextEmoji, i6, null, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.nameTextView, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
        arrayList.add(new ThemeDescription(this.nameTextView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
        arrayList.add(new ThemeDescription(this.descriptionTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.descriptionTextView, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, i7));
        LinearLayout linearLayout = this.avatarContainer;
        int i8 = ThemeDescription.FLAG_BACKGROUND;
        int i9 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(linearLayout, i8, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.settingsContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.typeEditContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.deleteContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.stickersContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.infoContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i9));
        int i10 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.settingsTopSectionCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.settingsSectionCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.deleteInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.signCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.signCell, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.signCell, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.signCell, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.deleteCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.deleteCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_text_RedRegular));
        arrayList.add(new ThemeDescription(this.stickersCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.stickersCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.stickersInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.stickersInfoCell, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, themeDescriptionDelegate, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_undo_background));
        int i11 = Theme.key_undo_cancelColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i11));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i11));
        int i12 = Theme.key_undo_infoColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i12));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i12));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i12));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{UndoView.class}, new String[]{"leftImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i12));
        arrayList.add(new ThemeDescription(this.reactionsCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.reactionsCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.reactionsCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        if (this.statsAndBoosts != null) {
            arrayList.add(new ThemeDescription(this.statsAndBoosts, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
            arrayList.add(new ThemeDescription(this.statsAndBoosts, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
            arrayList.add(new ThemeDescription(this.statsAndBoosts, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        }
        return arrayList;
    }

    public void lambda$getThemeDescriptions$48() {
        BackupImageView backupImageView = this.avatarImage;
        if (backupImageView != null) {
            backupImageView.invalidate();
        }
    }
}
