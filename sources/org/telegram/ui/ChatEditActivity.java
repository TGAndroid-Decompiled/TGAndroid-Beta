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
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.util.Consumer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotVerifySheet;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;

public class ChatEditActivity extends BaseFragment implements ImageUpdater.ImageUpdaterDelegate, NotificationCenter.NotificationCenterDelegate {
    private TextCell adminCell;
    private TextCell autoTranslationCell;
    private TLRPC.ChatReactions availableReactions;
    private TLRPC.FileLocation avatar;
    private AnimatorSet avatarAnimation;
    private LinearLayout avatarContainer;
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImage;
    private View avatarOverlay;
    private RadialProgressView avatarProgressView;
    private LinearLayout balanceContainer;
    private TextCell blockCell;
    private TL_stories.TL_premium_boostsStatus boostsStatus;
    private TextCell botAffiliateProgramCell;
    private TextInfoPrivacyCell botInfoCell;
    RLottieDrawable cameraDrawable;
    private boolean canForum;
    private TextCell changeBotSettingsCell;
    private TextCell channelAffiliateProgramsCell;
    private TLRPC.TL_chatAdminRights chatAdminRights;
    private TLRPC.TL_chatBannedRights chatBannedRights;
    private TLRPC.TL_chatBannedRights chatDefaultBannedRights;
    private long chatId;
    private PeerColorActivity.ChangeNameColorCell colorCell;
    private boolean createAfterUpload;
    private TLRPC.Chat currentChat;
    private TLRPC.User currentUser;
    private TextSettingsCell deleteCell;
    private FrameLayout deleteContainer;
    private ShadowSectionCell deleteInfoCell;
    private EditTextBoldCursor descriptionTextView;
    private View doneButton;
    private boolean donePressed;
    private TextCell editCommandsCell;
    private TextCell editIntroCell;
    private boolean forum;
    private boolean forumTabs;
    private TextCell forumsCell;
    private boolean hasUploadedPhoto;
    private TextCell historyCell;
    private boolean historyHidden;
    private ImageUpdater imageUpdater;
    private TLRPC.ChatFull info;
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
    private final List preloadedReactions;
    private AlertDialog progressDialog;
    private PhotoViewer.PhotoViewerProvider provider;
    private TextCell publicLinkCell;
    private TextCell reactionsCell;
    private SectionsScrollView scrollView;
    private TextCell setAvatarCell;
    private LinearLayout settingsContainer;
    private TextInfoPrivacyCell settingsSectionCell;
    private ShadowSectionCell settingsTopSectionCell;
    private TextCell starsBalanceCell;
    private TextCell statsAndBoosts;
    private TextCell stickersCell;
    private FrameLayout stickersContainer;
    private TextInfoPrivacyCell stickersInfoCell;
    private TextCell suggestedCell;
    private TextCell tonBalanceCell;
    private TextCell typeCell;
    private LinearLayout typeEditContainer;
    private UndoView undoView;
    private ValueAnimator updateHistoryShowAnimator;
    private long userId;
    private TLRPC.UserFull userInfo;
    private TextCell verifyCell;
    private TextInfoPrivacyCell verifyInfoCell;

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

    @Override
    public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }

    class AnonymousClass1 extends PhotoViewer.EmptyPhotoViewerProvider {
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
        public org.telegram.ui.PhotoViewer.PlaceProviderObject getPlaceForPhoto(org.telegram.messenger.MessageObject r6, org.telegram.tgnet.TLRPC.FileLocation r7, int r8, boolean r9, boolean r10) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditActivity.AnonymousClass1.getPlaceForPhoto(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.PhotoViewer$PlaceProviderObject");
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
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = ChatEditActivity.this.getMessagesController().getInputUser(ChatEditActivity.this.userId);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            ChatEditActivity.this.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$onDeletePhoto$1(tLObject, tL_error);
                }
            });
            return false;
        }

        public void lambda$onDeletePhoto$1(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onDeletePhoto$0();
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
                chatEditActivity.cameraDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
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
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            this.imageUpdater = new ImageUpdater(true, (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true);
        } else {
            this.imageUpdater = new ImageUpdater(false, 0, false);
        }
    }

    @Override
    public boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditActivity.onFragmentCreate():boolean");
    }

    private void loadLinksCount() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.chatId);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadLinksCount$1(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadLinksCount$1(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadLinksCount$0(tL_error, tLObject);
            }
        });
    }

    public void lambda$loadLinksCount$0(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            this.info.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject).count;
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
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.currentUser.bot) {
                getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
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
    public boolean onBackPressed(boolean z) {
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji == null || !editTextEmoji.isPopupShowing()) {
            return checkDiscard(z);
        }
        if (!z) {
            return false;
        }
        this.nameTextView.hidePopup(true);
        return false;
    }

    @Override
    public android.view.View createView(final android.content.Context r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditActivity.createView(android.content.Context):android.view.View");
    }

    public void lambda$createView$3(View view) {
        if (this.imageUpdater.isUploadingImage()) {
            return;
        }
        ImageLocation forPhoto = null;
        TLRPC.User user = this.userId == 0 ? null : getMessagesController().getUser(Long.valueOf(this.userId));
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.getInstance().setParentActivity(this);
            TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
            int i = userProfilePhoto2.dc_id;
            if (i != 0) {
                userProfilePhoto2.photo_big.dc_id = i;
            }
            PhotoViewer.getInstance().openPhoto(user.photo.photo_big, this.provider);
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto == null || chatPhoto.photo_big == null) {
            return;
        }
        PhotoViewer.getInstance().setParentActivity(this);
        TLRPC.ChatPhoto chatPhoto2 = chat.photo;
        int i2 = chatPhoto2.dc_id;
        if (i2 != 0) {
            chatPhoto2.photo_big.dc_id = i2;
        }
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull != null) {
            TLRPC.Photo photo = chatFull.chat_photo;
            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                forPhoto = ImageLocation.getForPhoto(this.info.chat_photo.video_sizes.get(0), this.info.chat_photo);
            }
        }
        PhotoViewer.getInstance().openPhotoWithVideo(chat.photo.photo_big, forPhoto, this.provider);
    }

    public void lambda$createView$8(View view) {
        this.imageUpdater.openMenu(this.avatar != null, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$6();
            }
        }, new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.lambda$createView$7(dialogInterface);
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
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = getMessagesController().getInputUser(this.userId);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$createView$5(tLObject, tL_error);
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

    public void lambda$createView$5(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$4();
            }
        });
    }

    public void lambda$createView$4() {
        this.avatarImage.setImageDrawable(this.avatarDrawable);
        this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), R.drawable.msg_addphoto, true);
        TLRPC.User user = this.currentUser;
        if (user != null) {
            user.photo = null;
            getMessagesController().putUser(this.currentUser, true);
        }
        this.hasUploadedPhoto = true;
        if (this.cameraDrawable == null) {
            int i = R.raw.camera_outline;
            this.cameraDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
        }
        this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
        this.setAvatarCell.imageView.setAnimation(this.cameraDrawable);
    }

    public void lambda$createView$7(DialogInterface dialogInterface) {
        if (!this.imageUpdater.isUploadingImage()) {
            this.cameraDrawable.setCustomEndFrame(86);
            this.setAvatarCell.imageView.playAnimation();
        } else {
            this.cameraDrawable.setCurrentFrame(0, false);
        }
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
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null) {
                TLRPC.ChannelLocation channelLocation = chatFull.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    locationActivity.setInitialLocation((TLRPC.TL_channelLocation) channelLocation);
                }
            }
            locationActivity.setDelegate(new LocationActivity.LocationActivityDelegate() {
                @Override
                public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
                    this.f$0.lambda$createView$10(messageMedia, i, z, i2, j);
                }
            });
            presentFragment(locationActivity);
        }
    }

    public void lambda$createView$10(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        TLRPC.ChatFull chatFull = this.info;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
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

    public void lambda$createView$15(View view) {
        PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(this.chatId);
        postSuggestionsEditActivity.setOnApplied(new MessagesStorage.LongCallback() {
            @Override
            public final void run(long j) {
                this.f$0.lambda$createView$14(j);
            }
        });
        presentFragment(postSuggestionsEditActivity);
    }

    public void lambda$createView$14(long j) {
        updateSuggestedCell(Long.valueOf(j), false);
    }

    public void lambda$createView$16(View view) {
        presentFragment(new ChannelColorActivity(-this.currentChat.id).setOnApplied(this));
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(this.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public void lambda$createView$17(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            this.autoTranslationCell.getCheckBox().setIcon(tL_premium_boostsStatus.level < getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
        }
    }

    public void lambda$createView$24(final boolean[] zArr, final long j, View view) {
        if (zArr[0]) {
            return;
        }
        final AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
        alertDialog.showDelayed(400L);
        zArr[0] = true;
        final boolean z = !this.autoTranslationCell.isChecked();
        if (!this.autoTranslationCell.getCheckBox().hasIcon()) {
            this.autoTranslationCell.setChecked(z);
        }
        getMessagesController().getBoostsController().getBoostsStats(j, new Consumer() {
            @Override
            public final void accept(Object obj) {
                this.f$0.lambda$createView$23(z, zArr, j, alertDialog, (TL_stories.TL_premium_boostsStatus) obj);
            }
        });
    }

    public void lambda$createView$23(final boolean z, boolean[] zArr, final long j, final AlertDialog alertDialog, final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        TLRPC.Chat chat = this.currentChat;
        int i = chat.level;
        int i2 = tL_premium_boostsStatus.level;
        if (i != i2) {
            chat.level = i2;
            getMessagesController().putChat(this.currentChat, false);
        }
        this.autoTranslationCell.getCheckBox().setIcon(tL_premium_boostsStatus.level < getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
        if (z && tL_premium_boostsStatus.level < getMessagesController().channelAutotranslationLevelMin) {
            this.autoTranslationCell.setChecked(false);
            zArr[0] = false;
            getMessagesController().getBoostsController().userCanBoostChannel(j, tL_premium_boostsStatus, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    this.f$0.lambda$createView$19(alertDialog, tL_premium_boostsStatus, j, (ChannelBoostsController.CanApplyBoost) obj);
                }
            });
            return;
        }
        TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
        getMessagesController();
        tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(this.currentChat);
        tL_channels_toggleAutotranslation.enabled = z;
        this.autoTranslationCell.setChecked(z);
        zArr[0] = false;
        alertDialog.dismiss();
        getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$createView$22(z, tLObject, tL_error);
            }
        }, 64);
    }

    public void lambda$createView$19(AlertDialog alertDialog, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        alertDialog.dismiss();
        if (getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(this, getContext(), 35, this.currentAccount, getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j));
        if (chat != null) {
            limitReachedBottomSheet.showStatisticButtonInLink(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$18(chat);
                }
            });
        }
        showDialog(limitReachedBottomSheet);
    }

    public void lambda$createView$18(TLRPC.Chat chat) {
        presentFragment(StatisticActivity.create(chat));
    }

    public void lambda$createView$22(final boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$20(z);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$21();
                }
            });
        }
    }

    public void lambda$createView$20(boolean z) {
        this.currentChat.autotranslation = z;
        getMessagesController().putChat(this.currentChat, false);
    }

    public void lambda$createView$21() {
        this.autoTranslationCell.setChecked(this.currentChat.autotranslation);
    }

    public void lambda$createView$26(Context context, View view) {
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
            RadioButtonCell radioButtonCell = new RadioButtonCell(context, true);
            radioButtonCellArr[i] = radioButtonCell;
            radioButtonCell.setTag(Integer.valueOf(i));
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
                    this.f$0.lambda$createView$25(radioButtonCellArr, builder, view2);
                }
            });
        }
        builder.setCustomView(linearLayout);
        showDialog(builder.create());
    }

    public void lambda$createView$25(RadioButtonCell[] radioButtonCellArr, BottomSheet.Builder builder, View view) {
        Integer num = (Integer) view.getTag();
        radioButtonCellArr[0].setChecked(num.intValue() == 0, true);
        radioButtonCellArr[1].setChecked(num.intValue() == 1, true);
        this.historyHidden = num.intValue() == 1;
        builder.getDismissRunnable().run();
        updateFields(true, true);
    }

    public void lambda$createView$27(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.boostsStatus = tL_premium_boostsStatus;
    }

    public void lambda$createView$28(View view) {
        GroupColorActivity groupColorActivity = new GroupColorActivity(-this.currentChat.id);
        groupColorActivity.boostsStatus = this.boostsStatus;
        groupColorActivity.setOnApplied(this);
        presentFragment(groupColorActivity);
    }

    public void lambda$createView$31(FrameLayout frameLayout, final View view) {
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        if (!this.canForum) {
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden));
            } else {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", getMessagesController().forumUpgradeParticipantsMin, new Object[0]));
            }
            BulletinFactory.of(this).createSimpleBulletin(R.raw.topics, spannableStringBuilderReplaceTags).show();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        EnableTopicsActivity enableTopicsActivity = new EnableTopicsActivity(-this.chatId);
        enableTopicsActivity.setResourceProvider(this.resourceProvider);
        enableTopicsActivity.setOnForumChanged(this.forum, this.forumTabs, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$createView$30(view, (Boolean) obj, (Boolean) obj2);
            }
        });
        presentFragment(enableTopicsActivity);
    }

    public void lambda$createView$30(View view, Boolean bool, Boolean bool2) {
        this.forum = bool.booleanValue();
        this.forumTabs = bool2.booleanValue();
        this.avatarImage.animateToRoundRadius(AndroidUtilities.dp(this.forum ? 16.0f : 32.0f));
        ((TextCell) view).setChecked(this.forum);
        updateFields(false, true);
        if (this.donePressed) {
            return;
        }
        TLRPC.Chat chat = this.currentChat;
        if (chat.forum == this.forum && chat.forum_tabs == this.forumTabs) {
            return;
        }
        if (!ChatObject.isChannel(chat) && this.forum) {
            Context context = getContext();
            if (context == null) {
                context = LaunchActivity.instance;
            }
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context == null) {
                return;
            }
            final AlertDialog alertDialog = new AlertDialog(context, 3);
            this.donePressed = true;
            alertDialog.showDelayed(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j) {
                    this.f$0.lambda$createView$29(alertDialog, j);
                }
            });
            return;
        }
        boolean z = this.currentChat.forum_tabs != this.forumTabs;
        getMessagesController().toggleChannelForum(this.chatId, this.forum, this.forumTabs);
        TLRPC.Chat chat2 = this.currentChat;
        chat2.forum = this.forum;
        chat2.forum_tabs = this.forumTabs;
        if (z) {
            updatePastFragmentsOnTabs();
        }
    }

    public void lambda$createView$29(AlertDialog alertDialog, long j) {
        alertDialog.dismiss();
        this.donePressed = false;
        if (j == 0) {
            return;
        }
        this.chatId = j;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j));
        this.currentChat = chat;
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull != null) {
            chatFull.hidden_prehistory = true;
        }
        boolean z = chat.forum_tabs != this.forumTabs;
        getMessagesController().toggleChannelForum(this.chatId, this.forum, this.forumTabs);
        TLRPC.Chat chat2 = this.currentChat;
        chat2.forum = this.forum;
        chat2.forum_tabs = this.forumTabs;
        if (z) {
            updatePastFragmentsOnTabs();
        }
    }

    public void lambda$createView$32(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("type", (this.isChannel || this.currentChat.gigagroup) ? 0 : 3);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(this.info);
        presentFragment(chatUsersActivity);
    }

    public void lambda$createView$33(View view) {
        ManageLinksActivity manageLinksActivity = new ManageLinksActivity(this.chatId, 0L, 0);
        TLRPC.ChatFull chatFull = this.info;
        manageLinksActivity.setInfo(chatFull, chatFull.exported_invite);
        presentFragment(manageLinksActivity);
    }

    public void lambda$createView$34(View view) {
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

    public void lambda$createView$35(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("type", 1);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(this.info);
        presentFragment(chatUsersActivity);
    }

    public void lambda$createView$36(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("type", 2);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(this.info);
        presentFragment(chatUsersActivity);
    }

    public void lambda$createView$37(View view) {
        presentFragment(new MemberRequestsActivity(this.chatId));
    }

    public void lambda$createView$38(View view) {
        presentFragment(new ChannelAffiliateProgramsFragment(-this.chatId));
    }

    public void lambda$createView$39(View view) {
        presentFragment(new ChannelAdminLogActivity(this.currentChat));
    }

    public void lambda$createView$40(View view) {
        presentFragment(StatisticActivity.create(this.currentChat, false));
    }

    public void lambda$createView$41(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("bot_id", this.userId);
        presentFragment(new ChangeUsernameActivity(bundle));
    }

    public void lambda$createView$42(View view) {
        presentFragment(new AffiliateProgramFragment(this.userId));
    }

    public void lambda$createView$43(View view) {
        Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + getActiveUsername(this.currentUser) + "-intro");
    }

    public void lambda$createView$44(View view) {
        Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + getActiveUsername(this.currentUser) + "-commands");
    }

    public void lambda$createView$45(View view) {
        Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + getActiveUsername(this.currentUser));
    }

    public void lambda$createView$46(View view) {
        BotVerifySheet.openVerify(this.currentAccount, this.userId, this.userInfo.bot_info.verifier_settings);
    }

    public void lambda$createView$47(BotStarsController botStarsController, View view) {
        if (botStarsController.isStarsBalanceAvailable(this.userId)) {
            presentFragment(new BotStarsActivity(1, this.userId));
        }
    }

    public void lambda$createView$48(BotStarsController botStarsController, View view) {
        if (botStarsController.isStarsBalanceAvailable(this.userId)) {
            presentFragment(new BotStarsActivity(0, this.userId));
        }
    }

    public void lambda$createView$50(View view) {
        AlertsCreator.createClearOrDeleteDialogAlert(this, false, this.currentChat, null, false, true, true, false, new MessagesStorage.BooleanCallback() {
            @Override
            public final void run(boolean z) {
                this.f$0.lambda$createView$49(z);
            }
        });
    }

    public void lambda$createView$49(boolean z) {
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-this.chatId));
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        finishFragment();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-this.currentChat.id), null, this.currentChat, Boolean.valueOf(z));
    }

    public static CharSequence applyNewSpan(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        FilterCreateActivity.NewSpan newSpan = new FilterCreateActivity.NewSpan(false, 10);
        newSpan.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        newSpan.setColor(Theme.getColor(Theme.key_premiumGradient1));
        spannableStringBuilder.setSpan(newSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    private void updatePublicLinksCount() {
        if (this.publicLinkCell == null) {
            return;
        }
        if (this.currentUser.usernames.size() > 1) {
            Iterator<TLRPC.TL_username> it = this.currentUser.usernames.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().active) {
                    i++;
                }
            }
            this.publicLinkCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotPublicLinks), (CharSequence) LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i), Integer.valueOf(this.currentUser.usernames.size())), R.drawable.msg_link2, true);
            return;
        }
        this.publicLinkCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotPublicLink), (CharSequence) ("t.me/" + this.currentUser.username), R.drawable.msg_link2, true);
    }

    private void updatePastFragmentsOnTabs() {
        DialogsActivity dialogsActivity;
        RightSlidingDialogContainer rightSlidingDialogContainer;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i = 0;
        while (i < fragmentStack.size()) {
            if (fragmentStack.get(i) instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) fragmentStack.get(i);
                if (chatActivity.getArguments().getLong("chat_id") == this.chatId) {
                    getParentLayout().removeFragmentFromStack(chatActivity);
                    chatActivity.clearViews();
                    getParentLayout().addFragmentToStack(chatActivity, i);
                    if (!this.forumTabs) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.chatId);
                        getParentLayout().addFragmentToStack(new TopicsFragment(bundle), i);
                        i++;
                    }
                }
            } else if (this.forumTabs && (fragmentStack.get(i) instanceof TopicsFragment)) {
                TopicsFragment topicsFragment = (TopicsFragment) fragmentStack.get(i);
                if (topicsFragment.getCurrentChat() != null && topicsFragment.getCurrentChat().id == this.chatId) {
                    getParentLayout().removeFragmentFromStack(topicsFragment);
                    i--;
                }
            } else if (this.forumTabs && (fragmentStack.get(i) instanceof DialogsActivity) && (dialogsActivity = (DialogsActivity) fragmentStack.get(i)) != null && (rightSlidingDialogContainer = dialogsActivity.rightSlidingDialogContainer) != null && rightSlidingDialogContainer.hasFragment()) {
                dialogsActivity.rightSlidingDialogContainer.lambda$presentFragment$1();
            }
            i++;
        }
    }

    private String getActiveUsername(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        Iterator<TLRPC.TL_username> it = user.usernames.iterator();
        while (it.hasNext()) {
            TLRPC.TL_username next = it.next();
            if (next.active) {
                return next.username;
            }
        }
        return null;
    }

    private void setAvatar() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditActivity.setAvatar():void");
    }

    private void updateCanForum() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditActivity.updateCanForum():void");
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        EditTextBoldCursor editTextBoldCursor;
        boolean z = true;
        int i3 = 0;
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.chatId) {
                if (this.info == null && (editTextBoldCursor = this.descriptionTextView) != null) {
                    editTextBoldCursor.setText(chatFull.about);
                }
                boolean z2 = this.info == null;
                this.info = chatFull;
                updateCanForum();
                if (ChatObject.isChannel(this.currentChat) && !this.info.hidden_prehistory) {
                    z = false;
                }
                this.historyHidden = z;
                updateFields(false, false);
                if (z2) {
                    loadLinksCount();
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatSwitchedForum) {
            long jLongValue = ((Long) objArr[0]).longValue();
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
            if (this.chatId != jLongValue) {
                return;
            }
            this.forum = zBooleanValue;
            this.forumTabs = zBooleanValue2;
            TextCell textCell = this.forumsCell;
            if (textCell != null) {
                textCell.setChecked(zBooleanValue);
                return;
            }
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) != 0) {
                setAvatar();
            }
            if ((iIntValue & MessagesController.UPDATE_MASK_NAME) != 0) {
                updatePublicLinksCount();
                return;
            }
            return;
        }
        if (i == NotificationCenter.channelRightsUpdated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            if (chat == null || chat.id != this.chatId) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.chatAdminRights;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.chatBannedRights) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.chatDefaultBannedRights) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            INavigationLayout iNavigationLayout = this.parentLayout;
            if (iNavigationLayout != null && iNavigationLayout.getLastFragment() == this) {
                finishFragment();
                return;
            } else {
                removeSelfFromStack();
                return;
            }
        }
        if (i == NotificationCenter.chatAvailableReactionsUpdated) {
            long jLongValue2 = ((Long) objArr[0]).longValue();
            if (jLongValue2 == this.chatId) {
                TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(jLongValue2);
                this.info = chatFull2;
                if (chatFull2 != null) {
                    this.availableReactions = chatFull2.available_reactions;
                }
                updateReactionsCell(true);
                return;
            }
            return;
        }
        if (i != NotificationCenter.botStarsUpdated) {
            if (i == NotificationCenter.userInfoDidLoad) {
                if (((Long) objArr[0]).longValue() == this.userId) {
                    setInfo(getMessagesController().getUserFull(this.userId));
                    return;
                }
                return;
            } else {
                if (i == NotificationCenter.channelConnectedBotsUpdate) {
                    ((Long) objArr[0]).longValue();
                    return;
                }
                if (i == NotificationCenter.dialogDeleted && (-this.chatId) == ((Long) objArr[0]).longValue()) {
                    INavigationLayout iNavigationLayout2 = this.parentLayout;
                    if (iNavigationLayout2 != null && iNavigationLayout2.getLastFragment() == this) {
                        finishFragment();
                        return;
                    } else {
                        removeSelfFromStack();
                        return;
                    }
                }
                return;
            }
        }
        if (((Long) objArr[0]).longValue() == this.userId) {
            if (this.starsBalanceCell != null) {
                BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
                this.starsBalanceCell.setVisibility(botStarsController.botHasStars(this.userId) ? 0 : 8);
                this.starsBalanceCell.setValue(StarsIntroActivity.replaceStarsWithPlain(TextUtils.concat("XTR", StarsIntroActivity.formatStarsAmount(botStarsController.getBotStarsBalance(this.userId), 0.8f, ' ')), 0.85f), true);
                TextCell textCell2 = this.publicLinkCell;
                if (textCell2 != null) {
                    textCell2.setNeedDivider(botStarsController.botHasStars(this.userId) || botStarsController.botHasTON(this.userId));
                }
                this.balanceContainer.setVisibility((this.starsBalanceCell.getVisibility() == 0 || this.tonBalanceCell.getVisibility() == 0) ? 0 : 8);
            }
            if (this.tonBalanceCell != null) {
                BotStarsController botStarsController2 = BotStarsController.getInstance(this.currentAccount);
                this.tonBalanceCell.setVisibility(botStarsController2.botHasTON(this.userId) ? 0 : 8);
                long tONBalance = botStarsController2.getTONBalance(this.userId);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (tONBalance > 0) {
                    double d = tONBalance / 1.0E9d;
                    if (d > 1000.0d) {
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                    } else {
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                        decimalFormatSymbols.setDecimalSeparator('.');
                        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                        decimalFormat.setMinimumFractionDigits(2);
                        decimalFormat.setMaximumFractionDigits(3);
                        decimalFormat.setGroupingUsed(false);
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                    }
                }
                this.tonBalanceCell.setValue(spannableStringBuilder, true);
                TextCell textCell3 = this.publicLinkCell;
                if (textCell3 != null) {
                    if (!botStarsController2.botHasStars(this.userId) && !botStarsController2.botHasTON(this.userId)) {
                        z = false;
                    }
                    textCell3.setNeedDivider(z);
                }
                LinearLayout linearLayout = this.balanceContainer;
                if (this.starsBalanceCell.getVisibility() != 0 && this.tonBalanceCell.getVisibility() != 0) {
                    i3 = 8;
                }
                linearLayout.setVisibility(i3);
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
    public void didStartUpload(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didUploadPhoto$53(photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str);
            }
        });
    }

    public void lambda$didUploadPhoto$53(TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        TLRPC.FileLocation fileLocation = photoSize.location;
        this.avatar = fileLocation;
        if (inputFile != null || inputFile2 != null || videoSize != null) {
            long j = 0;
            if (this.userId != 0) {
                TLRPC.User user = this.currentUser;
                if (user != null) {
                    user.photo = new TLRPC.TL_userProfilePhoto();
                    TLRPC.UserProfilePhoto userProfilePhoto = this.currentUser.photo;
                    if (inputFile != null) {
                        j = inputFile.id;
                    } else if (inputFile2 != null) {
                        j = inputFile2.id;
                    }
                    userProfilePhoto.photo_id = j;
                    userProfilePhoto.photo_big = photoSize2.location;
                    userProfilePhoto.photo_small = photoSize.location;
                    getMessagesController().putUser(this.currentUser, true);
                }
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                if (inputFile != null) {
                    tL_photos_uploadProfilePhoto.file = inputFile;
                    tL_photos_uploadProfilePhoto.flags |= 1;
                }
                if (inputFile2 != null) {
                    tL_photos_uploadProfilePhoto.video = inputFile2;
                    int i = tL_photos_uploadProfilePhoto.flags;
                    tL_photos_uploadProfilePhoto.video_start_ts = d;
                    tL_photos_uploadProfilePhoto.flags = i | 6;
                }
                if (videoSize != null) {
                    tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                    tL_photos_uploadProfilePhoto.flags |= 16;
                }
                tL_photos_uploadProfilePhoto.bot = getMessagesController().getInputUser(this.currentUser);
                tL_photos_uploadProfilePhoto.flags |= 32;
                getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$didUploadPhoto$52(tLObject, tL_error);
                    }
                });
            } else {
                getMessagesController().changeChatAvatar(this.chatId, null, inputFile, inputFile2, videoSize, d, str, photoSize.location, photoSize2.location, null);
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
        ImageLocation forLocal = ImageLocation.getForLocal(fileLocation);
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        Object obj = this.currentUser;
        if (obj == null) {
            obj = this.currentChat;
        }
        backupImageView.setImage(forLocal, "50_50", avatarDrawable, obj);
        this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), R.drawable.msg_addphoto, true);
        if (this.cameraDrawable == null) {
            int i2 = R.raw.camera_outline;
            this.cameraDrawable = new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
        }
        this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
        this.setAvatarCell.imageView.setAnimation(this.cameraDrawable);
        showAvatarProgress(true, false);
    }

    public void lambda$didUploadPhoto$52(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didUploadPhoto$51();
            }
        });
    }

    public void lambda$didUploadPhoto$51() {
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

    public boolean checkDiscard(boolean z) {
        EditTextEmoji editTextEmoji;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.userId != 0) {
            TLRPC.UserFull userFull = this.userInfo;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextEmoji editTextEmoji2 = this.nameTextView;
            if ((editTextEmoji2 == null || this.currentUser.first_name.equals(editTextEmoji2.getText().toString())) && ((editTextBoldCursor2 = this.descriptionTextView) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            if (z) {
                showDialog(new AlertDialog.Builder(getParentActivity()).setTitle(LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges)).setMessage(LocaleController.getString(R.string.BotSettingsChangedAlert)).setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        this.f$0.lambda$checkDiscard$54(alertDialog, i);
                    }
                }).setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        this.f$0.lambda$checkDiscard$55(alertDialog, i);
                    }
                }).create());
            }
            return false;
        }
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull != null && (str = chatFull.about) != null) {
            str3 = str;
        }
        if ((chatFull == null || !ChatObject.isChannel(this.currentChat) || this.info.hidden_prehistory == this.historyHidden) && (((editTextEmoji = this.nameTextView) == null || this.currentChat.title.equals(editTextEmoji.getText().toString())) && (((editTextBoldCursor = this.descriptionTextView) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.forum == this.currentChat.forum))) {
            return true;
        }
        if (z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges));
            if (this.isChannel) {
                builder.setMessage(LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert));
            } else {
                builder.setMessage(LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert));
            }
            builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.lambda$checkDiscard$56(alertDialog, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.lambda$checkDiscard$57(alertDialog, i);
                }
            });
            showDialog(builder.create());
        }
        return false;
    }

    public void lambda$checkDiscard$54(AlertDialog alertDialog, int i) {
        processDone();
    }

    public void lambda$checkDiscard$55(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$56(AlertDialog alertDialog, int i) {
        processDone();
    }

    public void lambda$checkDiscard$57(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    private int getAdminCount() {
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull == null) {
            return 1;
        }
        int size = chatFull.participants.participants.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.ChatParticipant chatParticipant = this.info.participants.participants.get(i2);
            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
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
        String str3 = "";
        if (this.currentUser != null) {
            final TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().getInputUser(this.currentUser);
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            if (!this.currentUser.first_name.equals(this.nameTextView.getText().toString())) {
                setbotinfo.name = this.nameTextView.getText().toString();
                setbotinfo.flags |= 8;
            }
            TLRPC.UserFull userFull = this.userInfo;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.descriptionTextView;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                setbotinfo.about = this.descriptionTextView.getText().toString();
                setbotinfo.flags = 1 | setbotinfo.flags;
            }
            this.progressDialog = new AlertDialog(getParentActivity(), 3);
            final int iSendRequest = getConnectionsManager().sendRequest(setbotinfo, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$processDone$59(setbotinfo, tLObject, tL_error);
                }
            });
            this.progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f$0.lambda$processDone$60(iSendRequest, dialogInterface);
                }
            });
            this.progressDialog.show();
            return;
        }
        if (!ChatObject.isChannel(this.currentChat) && (!this.historyHidden || this.forum)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j) {
                    this.f$0.lambda$processDone$61(j);
                }
            });
            return;
        }
        if (this.info != null && ChatObject.isChannel(this.currentChat)) {
            TLRPC.ChatFull chatFull = this.info;
            boolean z = chatFull.hidden_prehistory;
            boolean z2 = this.historyHidden;
            if (z != z2) {
                chatFull.hidden_prehistory = z2;
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
                    this.f$0.lambda$processDone$62(dialogInterface);
                }
            });
            this.progressDialog.show();
            return;
        }
        if (!this.currentChat.title.equals(this.nameTextView.getText().toString())) {
            getMessagesController().changeChatTitle(this.chatId, this.nameTextView.getText().toString());
        }
        TLRPC.ChatFull chatFull2 = this.info;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.descriptionTextView;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            getMessagesController().updateChatAbout(this.chatId, this.descriptionTextView.getText().toString(), this.info);
        }
        boolean z3 = this.forum;
        TLRPC.Chat chat = this.currentChat;
        if (z3 != chat.forum || this.forumTabs != chat.forum_tabs) {
            boolean z4 = this.forumTabs != chat.forum_tabs;
            getMessagesController().toggleChannelForum(this.chatId, this.forum, this.forumTabs);
            if (this.forum && !this.forumTabs) {
                List fragmentStack = getParentLayout().getFragmentStack();
                for (int i = 0; i < fragmentStack.size(); i++) {
                    if ((fragmentStack.get(i) instanceof ChatActivity) && ((ChatActivity) fragmentStack.get(i)).getArguments().getLong("chat_id") == this.chatId) {
                        getParentLayout().removeFragmentFromStack(i);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.chatId);
                        getParentLayout().addFragmentToStack(TopicsFragment.getTopicsOrChat(this, bundle), i);
                    }
                }
            }
            if (z4) {
                updatePastFragmentsOnTabs();
            }
        }
        finishFragment();
    }

    public void lambda$processDone$59(TL_bots.setBotInfo setbotinfo, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.UserFull userFull = this.userInfo;
        if (userFull != null) {
            userFull.about = setbotinfo.about;
            getMessagesStorage().updateUserInfo(this.userInfo, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processDone$58();
            }
        });
    }

    public void lambda$processDone$58() {
        this.progressDialog.dismiss();
        finishFragment();
    }

    public void lambda$processDone$60(int i, DialogInterface dialogInterface) {
        this.donePressed = false;
        this.progressDialog = null;
        getConnectionsManager().cancelRequest(i, true);
    }

    public void lambda$processDone$61(long j) {
        if (j == 0) {
            this.donePressed = false;
            return;
        }
        this.chatId = j;
        this.currentChat = getMessagesController().getChat(Long.valueOf(j));
        this.donePressed = false;
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull != null) {
            chatFull.hidden_prehistory = true;
        }
        processDone();
    }

    public void lambda$processDone$62(DialogInterface dialogInterface) {
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
        if (!z2) {
            if (z) {
                this.avatarProgressView.setAlpha(1.0f);
                this.avatarProgressView.setVisibility(0);
                this.avatarOverlay.setAlpha(1.0f);
                this.avatarOverlay.setVisibility(0);
                return;
            }
            this.avatarProgressView.setAlpha(0.0f);
            this.avatarProgressView.setVisibility(4);
            this.avatarOverlay.setAlpha(0.0f);
            this.avatarOverlay.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.avatarAnimation = animatorSet2;
        if (z) {
            this.avatarProgressView.setVisibility(0);
            this.avatarOverlay.setVisibility(0);
            AnimatorSet animatorSet3 = this.avatarAnimation;
            RadialProgressView radialProgressView = this.avatarProgressView;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<View, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.avatarProgressView;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<View, Float>) property2, 0.0f));
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
            String string = editTextEmoji.getText().toString();
            if (string.length() != 0) {
                bundle.putString("nameTextView", string);
            }
        }
    }

    @Override
    public void restoreSelfArgs(Bundle bundle) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.currentPicturePath = bundle.getString("path");
        }
    }

    public void setInfo(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.userInfo = userFull;
        if (userFull != null) {
            if (this.currentUser == null) {
                this.currentUser = this.userId == 0 ? null : getMessagesController().getUser(Long.valueOf(this.userId));
            }
            TextCell textCell = this.botAffiliateProgramCell;
            if (textCell != null) {
                textCell.setDrawLoading(this.userInfo == null, 45, true);
                TLRPC.UserFull userFull2 = this.userInfo;
                if (userFull2 != null) {
                    this.botAffiliateProgramCell.setValue(userFull2.starref_program == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(r7.commission_permille / 10.0f)), false);
                }
            }
            TextCell textCell2 = this.verifyCell;
            if (textCell2 != null) {
                TLRPC.UserFull userFull3 = this.userInfo;
                textCell2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            TextInfoPrivacyCell textInfoPrivacyCell = this.verifyInfoCell;
            if (textInfoPrivacyCell != null) {
                TLRPC.UserFull userFull4 = this.userInfo;
                textInfoPrivacyCell.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    public void setInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        if (chatFull != null) {
            if (this.currentChat == null) {
                this.currentChat = getMessagesController().getChat(Long.valueOf(this.chatId));
            }
            this.historyHidden = !ChatObject.isChannel(this.currentChat) || this.info.hidden_prehistory;
            this.availableReactions = this.info.available_reactions;
            this.preloadedReactions.clear();
            this.preloadedReactions.addAll(ReactionsUtils.startPreloadReactions(this.currentChat, this.info));
            if (this.channelAffiliateProgramsCell != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.currentChat)) {
                this.channelAffiliateProgramsCell.setVisibility(0);
            }
        }
    }

    private void updateFields(boolean z, boolean z2) {
        int sendMediaSelectedCount;
        int i;
        String str;
        TLRPC.ChatFull chatFull;
        int i2;
        String str2;
        String string;
        TextCell textCell;
        TextCell textCell2;
        TextCell textCell3;
        TextCell textCell4;
        int i3;
        String str3;
        String string2;
        TextCell textCell5;
        TextCell textCell6;
        TextCell textCell7;
        TextCell textCell8;
        TextCell textCell9;
        TLRPC.Chat chat;
        if (z && (chat = getMessagesController().getChat(Long.valueOf(this.chatId))) != null) {
            this.currentChat = chat;
        }
        boolean zIsPublic = ChatObject.isPublic(this.currentChat);
        TextInfoPrivacyCell textInfoPrivacyCell = this.settingsSectionCell;
        if (textInfoPrivacyCell != null) {
            textInfoPrivacyCell.setVisibility((this.typeCell != null || ((textCell7 = this.linkedCell) != null && textCell7.getVisibility() == 0) || (((textCell8 = this.historyCell) != null && textCell8.getVisibility() == 0) || ((textCell9 = this.locationCell) != null && textCell9.getVisibility() == 0))) ? 0 : 8);
        }
        TextCell textCell10 = this.logCell;
        if (textCell10 != null) {
            textCell10.setVisibility(ChatObject.isChannel(this.currentChat) ? 0 : 8);
        }
        TextCell textCell11 = this.linkedCell;
        if (textCell11 != null) {
            TLRPC.ChatFull chatFull2 = this.info;
            if (chatFull2 == null || (!this.isChannel && chatFull2.linked_chat_id == 0)) {
                textCell11.setVisibility(8);
            } else {
                textCell11.setVisibility(0);
                if (this.info.linked_chat_id == 0) {
                    this.linkedCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("Discussion", R.string.Discussion), (CharSequence) LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.info.linked_chat_id));
                    if (chat2 == null) {
                        this.linkedCell.setVisibility(8);
                    } else if (this.isChannel) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.linkedCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("Discussion", R.string.Discussion), (CharSequence) chat2.title, R.drawable.msg_discuss, true);
                        } else {
                            this.linkedCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("Discussion", R.string.Discussion), (CharSequence) ("@" + publicUsername), R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            TextCell textCell12 = this.linkedCell;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i4 = R.drawable.msg_channel;
                            TextCell textCell13 = this.forumsCell;
                            textCell12.setTextAndValueAndIcon(string3, str4, i4, textCell13 != null && textCell13.getVisibility() == 0);
                        } else {
                            TextCell textCell14 = this.linkedCell;
                            String string4 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str5 = "@" + publicUsername2;
                            int i5 = R.drawable.msg_channel;
                            TextCell textCell15 = this.forumsCell;
                            textCell14.setTextAndValueAndIcon(string4, str5, i5, textCell15 != null && textCell15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        TextCell textCell16 = this.locationCell;
        if (textCell16 != null) {
            TLRPC.ChatFull chatFull3 = this.info;
            if (chatFull3 != null && chatFull3.can_set_location) {
                textCell16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.info.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.locationCell.setTextAndValue(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC.TL_channelLocation) channelLocation).address, z2, true);
                } else {
                    this.locationCell.setTextAndValue(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z2, true);
                }
            } else {
                textCell16.setVisibility(8);
            }
        }
        if (this.typeCell != null) {
            TLRPC.ChatFull chatFull4 = this.info;
            if (chatFull4 != null && (chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                if (!zIsPublic) {
                    string2 = LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit);
                } else {
                    string2 = String.format("https://" + getMessagesController().linkPrefix + "/%s", ChatObject.getPublicUsername(this.currentChat));
                }
                TextCell textCell17 = this.typeCell;
                String string5 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i6 = R.drawable.msg_channel;
                TextCell textCell18 = this.historyCell;
                textCell17.setTextAndValueAndIcon(string5, string2, i6, (textCell18 != null && textCell18.getVisibility() == 0) || ((textCell5 = this.linkedCell) != null && textCell5.getVisibility() == 0) || ((textCell6 = this.forumsCell) != null && textCell6.getVisibility() == 0));
            } else {
                boolean z3 = this.currentChat.noforwards;
                if (this.isChannel) {
                    if (zIsPublic) {
                        i3 = R.string.TypePublic;
                        str3 = "TypePublic";
                    } else if (z3) {
                        i3 = R.string.TypePrivateRestrictedForwards;
                        str3 = "TypePrivateRestrictedForwards";
                    } else {
                        i3 = R.string.TypePrivate;
                        str3 = "TypePrivate";
                    }
                    string = LocaleController.getString(str3, i3);
                } else {
                    if (zIsPublic) {
                        i2 = R.string.TypePublicGroup;
                        str2 = "TypePublicGroup";
                    } else if (z3) {
                        i2 = R.string.TypePrivateGroupRestrictedForwards;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i2 = R.string.TypePrivateGroup;
                        str2 = "TypePrivateGroup";
                    }
                    string = LocaleController.getString(str2, i2);
                }
                if (this.isChannel) {
                    TextCell textCell19 = this.typeCell;
                    String string6 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i7 = R.drawable.msg_channel;
                    TextCell textCell20 = this.historyCell;
                    textCell19.setTextAndValueAndIcon(string6, string, i7, (textCell20 != null && textCell20.getVisibility() == 0) || ((textCell3 = this.linkedCell) != null && textCell3.getVisibility() == 0) || ((textCell4 = this.forumsCell) != null && textCell4.getVisibility() == 0));
                } else {
                    TextCell textCell21 = this.typeCell;
                    String string7 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i8 = R.drawable.msg_groups;
                    TextCell textCell22 = this.historyCell;
                    textCell21.setTextAndValueAndIcon(string7, string, i8, (textCell22 != null && textCell22.getVisibility() == 0) || ((textCell = this.linkedCell) != null && textCell.getVisibility() == 0) || ((textCell2 = this.forumsCell) != null && textCell2.getVisibility() == 0));
                }
            }
        }
        if (this.historyCell != null) {
            if (!this.historyHidden || this.forum) {
                i = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            } else {
                i = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            }
            this.historyCell.setTextAndValueAndIcon(LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort), LocaleController.getString(str, i), z2, R.drawable.msg_discuss, this.forumsCell != null);
            this.historyCell.setEnabled(!this.forum);
            updateHistoryShow((this.forum || zIsPublic || ((chatFull = this.info) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true, z2);
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
                    this.membersCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), (CharSequence) String.format("%d", Integer.valueOf(this.info.participants_count)), R.drawable.msg_groups, true);
                    TextCell textCell25 = this.blockCell;
                    String string8 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull5 = this.info;
                    String str6 = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                    int i9 = R.drawable.msg_user_remove;
                    TextCell textCell26 = this.logCell;
                    textCell25.setTextAndValueAndIcon(string8, str6, i9, textCell26 != null && textCell26.getVisibility() == 0);
                } else {
                    if (ChatObject.isChannel(this.currentChat)) {
                        this.membersCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("ChannelMembers", R.string.ChannelMembers), (CharSequence) String.format("%d", Integer.valueOf(this.info.participants_count)), R.drawable.msg_groups, true);
                    } else {
                        this.membersCell.setTextAndValueAndIcon(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.info.participants.participants.size())), R.drawable.msg_groups, this.memberRequestsCell.getVisibility() == 0);
                    }
                    TLRPC.Chat chat3 = this.currentChat;
                    if (chat3.gigagroup) {
                        TextCell textCell27 = this.blockCell;
                        String string9 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull6 = this.info;
                        String str7 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                        int i10 = R.drawable.msg_user_remove;
                        TextCell textCell28 = this.logCell;
                        textCell27.setTextAndValueAndIcon(string9, str7, i10, textCell28 != null && textCell28.getVisibility() == 0);
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat3.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            sendMediaSelectedCount = (!tL_chatBannedRights.send_plain ? 1 : 0) + ChatUsersActivity.getSendMediaSelectedCount(tL_chatBannedRights);
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.currentChat.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                sendMediaSelectedCount++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                sendMediaSelectedCount++;
                            }
                            if (this.forum && !tL_chatBannedRights2.manage_topics) {
                                sendMediaSelectedCount++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                sendMediaSelectedCount++;
                            }
                        } else {
                            sendMediaSelectedCount = this.forum ? 14 : 13;
                        }
                        this.blockCell.setTextAndValueAndIcon(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(sendMediaSelectedCount), Integer.valueOf(this.forum ? 14 : 13)), z2, R.drawable.msg_permissions, true);
                    }
                    TextCell textCell29 = this.memberRequestsCell;
                    if (textCell29 != null) {
                        String string10 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String str8 = String.format("%d", Integer.valueOf(this.info.requests_pending));
                        int i11 = R.drawable.msg_requests;
                        TextCell textCell30 = this.logCell;
                        textCell29.setTextAndValueAndIcon(string10, str8, i11, textCell30 != null && textCell30.getVisibility() == 0);
                    }
                }
                this.adminCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), (CharSequence) String.format("%d", Integer.valueOf(ChatObject.isChannel(this.currentChat) ? this.info.admins_count : getAdminCount())), R.drawable.msg_admins, true);
            } else {
                if (this.isChannel) {
                    textCell23.setTextAndIcon((CharSequence) LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), R.drawable.msg_groups, true);
                    TextCell textCell31 = this.blockCell;
                    String string11 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                    int i12 = R.drawable.msg_chats_remove;
                    TextCell textCell32 = this.logCell;
                    textCell31.setTextAndIcon(string11, i12, textCell32 != null && textCell32.getVisibility() == 0);
                } else {
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i13 = R.drawable.msg_groups;
                    TextCell textCell33 = this.logCell;
                    textCell23.setTextAndIcon(string12, i13, textCell33 != null && textCell33.getVisibility() == 0);
                    if (this.currentChat.gigagroup) {
                        TextCell textCell34 = this.blockCell;
                        String string13 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                        int i14 = R.drawable.msg_chats_remove;
                        TextCell textCell35 = this.logCell;
                        textCell34.setTextAndIcon(string13, i14, textCell35 != null && textCell35.getVisibility() == 0);
                    } else {
                        this.blockCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.ChannelPermissions), R.drawable.msg_permissions, true);
                    }
                }
                this.adminCell.setTextAndIcon((CharSequence) LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), R.drawable.msg_admins, true);
            }
            this.reactionsCell.setVisibility(ChatObject.canChangeChatInfo(this.currentChat) ? 0 : 8);
            updateReactionsCell(z2);
            if (this.info == null || !ChatObject.canUserDoAdminAction(this.currentChat, 3) || (zIsPublic && this.currentChat.creator)) {
                this.inviteLinksCell.setVisibility(8);
            } else if (this.info.invitesCount > 0) {
                this.inviteLinksCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("InviteLinks", R.string.InviteLinks), (CharSequence) Integer.toString(this.info.invitesCount), R.drawable.msg_link2, true);
            } else {
                this.inviteLinksCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("InviteLinks", R.string.InviteLinks), (CharSequence) "1", R.drawable.msg_link2, true);
            }
        }
        TextCell textCell36 = this.stickersCell;
        if (textCell36 != null && this.info != null) {
            String string14 = LocaleController.getString(R.string.GroupStickers);
            TLRPC.StickerSet stickerSet = this.info.stickerset;
            textCell36.setTextAndValueAndIcon((CharSequence) string14, (CharSequence) (stickerSet != null ? stickerSet.title : LocaleController.getString(R.string.Add)), R.drawable.msg_sticker, false);
        }
        if (this.suggestedCell != null) {
            updateSuggestedCell(z2);
        }
    }

    public void updateColorCell() {
        TextCell textCell;
        TextCell textCell2;
        PeerColorActivity.ChangeNameColorCell changeNameColorCell = this.colorCell;
        if (changeNameColorCell != null) {
            TLRPC.Chat chat = this.currentChat;
            TextCell textCell3 = this.historyCell;
            changeNameColorCell.set(chat, (textCell3 != null && textCell3.getVisibility() == 0) || ((textCell = this.forumsCell) != null && textCell.getVisibility() == 0) || ((ChatObject.isMegagroup(this.currentChat) && ChatObject.hasAdminRights(this.currentChat)) || ((textCell2 = this.autoTranslationCell) != null && textCell2.getVisibility() == 0)));
        }
    }

    public void updateSuggestedCell(boolean z) {
        updateSuggestedCell(null, z);
    }

    public void updateSuggestedCell(Long l, boolean z) {
        TLRPC.Chat chat = this.currentChat;
        if (chat == null || this.suggestedCell == null) {
            return;
        }
        long jLongValue = 0;
        if (l != null ? l.longValue() >= 0 : chat.broadcast_messages_allowed) {
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.currentChat.linked_monoforum_id));
            if (l != null) {
                jLongValue = l.longValue();
            } else if (chat2 != null) {
                jLongValue = chat2.send_paid_messages_stars;
            }
            this.suggestedCell.setTextAndValueAndIcon(TextCell.applyNewSpan(LocaleController.getString(R.string.PostSuggestions)), (CharSequence) StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(jLongValue)), 0.66f), R.drawable.msg_markunread, true);
            return;
        }
        this.suggestedCell.setTextAndValueAndIcon(TextCell.applyNewSpan(LocaleController.getString(R.string.PostSuggestions)), (CharSequence) LocaleController.getString(R.string.PostSuggestionsOff), R.drawable.msg_markunread, true);
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
            this.historyCell.setTranslationY((-r6.getHeight()) / 2.0f);
        }
        this.historyCell.setVisibility(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((View) arrayList.get(i3)).setTranslationY((-this.historyCell.getHeight()) * (1.0f - this.historyCell.getAlpha()));
        }
        if (z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.historyCell.getAlpha(), z ? 1.0f : 0.0f);
            this.updateHistoryShowAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$updateHistoryShow$63(arrayList, valueAnimator2);
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
        this.historyCell.setTranslationY(((-r13.getHeight()) / 2.0f) * (z ? 0.0f : 1.0f));
        this.historyCell.setScaleY(((z ? 1.0f : 0.0f) * 0.8f) + 0.2f);
        this.historyCell.setVisibility(z ? 0 : 8);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((View) arrayList.get(i4)).setTranslationY(0.0f);
        }
        this.updateHistoryShowAnimator = null;
    }

    public void lambda$updateHistoryShow$63(ArrayList arrayList, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.historyCell.setAlpha(fFloatValue);
        float f = 1.0f - fFloatValue;
        this.historyCell.setTranslationY(((-r0.getHeight()) / 2.0f) * f);
        this.historyCell.setScaleY((fFloatValue * 0.8f) + 0.2f);
        for (int i = 0; i < arrayList.size(); i++) {
            ((View) arrayList.get(i)).setTranslationY((-this.historyCell.getHeight()) * f);
        }
    }

    private void updateReactionsCell(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditActivity.updateReactionsCell(boolean):void");
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.lambda$getThemeDescriptions$64();
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
        if (this.suggestedCell != null) {
            arrayList.add(new ThemeDescription(this.suggestedCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
            arrayList.add(new ThemeDescription(this.suggestedCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
            arrayList.add(new ThemeDescription(this.suggestedCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        }
        if (this.statsAndBoosts != null) {
            arrayList.add(new ThemeDescription(this.statsAndBoosts, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
            arrayList.add(new ThemeDescription(this.statsAndBoosts, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
            arrayList.add(new ThemeDescription(this.statsAndBoosts, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        }
        return arrayList;
    }

    public void lambda$getThemeDescriptions$64() {
        BackupImageView backupImageView = this.avatarImage;
        if (backupImageView != null) {
            backupImageView.invalidate();
        }
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i4);
        }
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.setTranslationY(-i4);
        }
    }
}
