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
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.util.Consumer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
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
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
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
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotVerifySheet;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.community.CommunityCreateActivity;
import org.telegram.ui.community.CommunityEditActivity;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.cells.CommunityLinkView2;

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
    private TextCell communityCell;
    private TextInfoPrivacyCell communityGapView;
    private TextInfoPrivacyCell communityInfoCell;
    private CommunityLinkView2 communityLinkView;
    private TextCell communityUnlinkCell;
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
    private TextCell welcomeMessagesCell;

    public static boolean m1843$r8$lambda$sZ3VDA2UpoqvnlILdeYRWh7Quw(View view, MotionEvent motionEvent) {
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
        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
            TLRPC.ChatPhoto chatPhoto;
            TLRPC.FileLocation fileLocation2;
            TLRPC.UserProfilePhoto userProfilePhoto;
            if (fileLocation == null) {
                return null;
            }
            if (ChatEditActivity.this.currentUser != null) {
                TLRPC.User user = ChatEditActivity.this.userId == 0 ? null : ChatEditActivity.this.getMessagesController().getUser(Long.valueOf(ChatEditActivity.this.userId));
                if (user == null || (userProfilePhoto = user.photo) == null || (fileLocation2 = userProfilePhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
            } else {
                TLRPC.Chat chat = ChatEditActivity.this.getMessagesController().getChat(Long.valueOf(ChatEditActivity.this.chatId));
                if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
            }
            if (fileLocation2 == null || fileLocation2.local_id != fileLocation.local_id || fileLocation2.volume_id != fileLocation.volume_id || fileLocation2.dc_id != fileLocation.dc_id) {
                return null;
            }
            int[] iArr = new int[2];
            ChatEditActivity.this.avatarImage.getLocationInWindow(iArr);
            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
            placeProviderObject.viewX = iArr[0];
            placeProviderObject.viewY = iArr[1];
            placeProviderObject.parentView = ChatEditActivity.this.avatarImage;
            placeProviderObject.imageReceiver = ChatEditActivity.this.avatarImage.getImageReceiver();
            placeProviderObject.dialogId = ChatEditActivity.this.userId != 0 ? ChatEditActivity.this.userId : -ChatEditActivity.this.chatId;
            placeProviderObject.thumb = placeProviderObject.imageReceiver.getBitmapSafe();
            placeProviderObject.size = -1L;
            placeProviderObject.radius = ChatEditActivity.this.avatarImage.getImageReceiver().getRoundRadius(true);
            placeProviderObject.scale = ChatEditActivity.this.avatarContainer.getScaleX();
            placeProviderObject.canEdit = true;
            return placeProviderObject;
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
                    ChatEditActivity.AnonymousClass1.$r8$lambda$U95tD8JhVfI9ucZRtRRM4px55os(this.f$0, tLObject, tL_error);
                }
            });
            return false;
        }

        public static void $r8$lambda$U95tD8JhVfI9ucZRtRRM4px55os(final AnonymousClass1 anonymousClass1, TLObject tLObject, TLRPC.TL_error tL_error) {
            anonymousClass1.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatEditActivity.AnonymousClass1.$r8$lambda$5j1dAaMgpvmjudxZyzzMLY7Itio(this.f$0);
                }
            });
        }

        public static void $r8$lambda$5j1dAaMgpvmjudxZyzzMLY7Itio(AnonymousClass1 anonymousClass1) {
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
                ChatEditActivity.m1831$r8$lambda$PlhowYFCPmliuBBxG6m68KqCNk(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void m1831$r8$lambda$PlhowYFCPmliuBBxG6m68KqCNk(final ChatEditActivity chatEditActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        chatEditActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditActivity.$r8$lambda$onMxOssKPU9Aq5MrOcZ8L34VYts(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$onMxOssKPU9Aq5MrOcZ8L34VYts(ChatEditActivity chatEditActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        chatEditActivity.getClass();
        if (tL_error == null) {
            chatEditActivity.info.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject).count;
            chatEditActivity.getMessagesStorage().saveChatLinksCount(chatEditActivity.chatId, chatEditActivity.info.invitesCount);
            chatEditActivity.updateFields(false, false);
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
    public View createView(Context context) {
        final ChatEditActivity chatEditActivity;
        Context context2;
        SizeNotifierFrameLayout sizeNotifierFrameLayout;
        ViewGroup viewGroup;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.User user;
        final ChatEditActivity chatEditActivity2;
        int i;
        int i2;
        int i3;
        int i4;
        TLRPC.ChatFull chatFull;
        final Context context3;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i5) {
                if (i5 == -1) {
                    if (ChatEditActivity.this.checkDiscard(true)) {
                        ChatEditActivity.this.finishFragment();
                    }
                } else if (i5 == 1) {
                    ChatEditActivity.this.processDone();
                }
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = new SizeNotifierFrameLayout(context) {
            private boolean ignoreLayout;

            @Override
            protected void onMeasure(int i5, int i6) {
                int size = View.MeasureSpec.getSize(i5);
                int size2 = View.MeasureSpec.getSize(i6);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                measureChildWithMargins(((BaseFragment) ChatEditActivity.this).actionBar, i5, 0, i6, 0);
                if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                    this.ignoreLayout = true;
                    ChatEditActivity.this.nameTextView.hideEmojiView();
                    this.ignoreLayout = false;
                }
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) ChatEditActivity.this).actionBar) {
                        if (ChatEditActivity.this.nameTextView != null && ChatEditActivity.this.nameTextView.isPopupView(childAt)) {
                            if (AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                                if (AndroidUtilities.isTablet()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), (paddingTop - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((paddingTop - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                                }
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            }
                        } else {
                            measureChildWithMargins(childAt, i5, 0, i6, 0);
                        }
                    }
                }
            }

            @Override
            protected void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                int paddingTop;
                int measuredHeight;
                int measuredHeight2;
                int childCount = getChildCount();
                int iMeasureKeyboardHeight = measureKeyboardHeight();
                int emojiPadding = (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : ChatEditActivity.this.nameTextView.getEmojiPadding();
                setBottomClip(emojiPadding);
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        int i15 = layoutParams.gravity;
                        if (i15 == -1) {
                            i15 = 51;
                        }
                        int i16 = i15 & 112;
                        int i17 = i15 & 7;
                        if (i17 != 1) {
                            if (i17 == 5) {
                                i9 = i7 - measuredWidth;
                                i10 = layoutParams.rightMargin;
                            } else {
                                i11 = layoutParams.leftMargin;
                            }
                            if (i16 != 16) {
                                if (i16 != 48) {
                                    paddingTop = layoutParams.topMargin + getPaddingTop();
                                } else if (i16 != 80) {
                                    i12 = ((i8 - emojiPadding) - i6) - measuredHeight3;
                                    i13 = layoutParams.bottomMargin;
                                } else {
                                    paddingTop = layoutParams.topMargin;
                                }
                                if (ChatEditActivity.this.nameTextView != null && ChatEditActivity.this.nameTextView.isPopupView(childAt)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    paddingTop = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(i11, paddingTop, measuredWidth + i11, measuredHeight3 + paddingTop);
                            } else {
                                i12 = ((((i8 - emojiPadding) - i6) - measuredHeight3) / 2) + layoutParams.topMargin;
                                i13 = layoutParams.bottomMargin;
                            }
                            paddingTop = i12 - i13;
                            if (ChatEditActivity.this.nameTextView != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(i11, paddingTop, measuredWidth + i11, measuredHeight3 + paddingTop);
                        } else {
                            i9 = (((i7 - i5) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i10 = layoutParams.rightMargin;
                        }
                        i11 = i9 - i10;
                        if (i16 != 16) {
                            if (i16 != 48) {
                                paddingTop = layoutParams.topMargin + getPaddingTop();
                            } else if (i16 != 80) {
                                i12 = ((i8 - emojiPadding) - i6) - measuredHeight3;
                                i13 = layoutParams.bottomMargin;
                            } else {
                                paddingTop = layoutParams.topMargin;
                            }
                            if (ChatEditActivity.this.nameTextView != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(i11, paddingTop, measuredWidth + i11, measuredHeight3 + paddingTop);
                        } else {
                            i12 = ((((i8 - emojiPadding) - i6) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i13 = layoutParams.bottomMargin;
                        }
                        paddingTop = i12 - i13;
                        if (ChatEditActivity.this.nameTextView != null) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i11, paddingTop, measuredWidth + i11, measuredHeight3 + paddingTop);
                    }
                }
                notifyHeightChanged();
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        sizeNotifierFrameLayout2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ChatEditActivity.m1843$r8$lambda$sZ3VDA2UpoqvnlILdeYRWh7Quw(view, motionEvent);
            }
        });
        this.fragmentView = sizeNotifierFrameLayout2;
        sizeNotifierFrameLayout2.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        SectionsScrollView.SectionsLinearLayout sectionsLinearLayout = new SectionsScrollView.SectionsLinearLayout(context);
        this.linearLayout = sectionsLinearLayout;
        SectionsScrollView sectionsScrollView = new SectionsScrollView(context, this.linearLayout, this.resourceProvider, false);
        this.scrollView = sectionsScrollView;
        sectionsScrollView.setFillViewport(true);
        sizeNotifierFrameLayout2.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.scrollView);
        this.scrollView.addView(sectionsLinearLayout, new FrameLayout.LayoutParams(-1, -2));
        sectionsLinearLayout.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.avatarContainer = linearLayout;
        linearLayout.setOrientation(1);
        this.avatarContainer.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        sectionsLinearLayout.addView(this.avatarContainer, LayoutHelper.createLinear(-1, -2));
        final FrameLayout frameLayout = new FrameLayout(context);
        this.avatarContainer.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
        BackupImageView backupImageView = new BackupImageView(context) {
            @Override
            public void invalidate() {
                if (ChatEditActivity.this.avatarOverlay != null) {
                    ChatEditActivity.this.avatarOverlay.invalidate();
                }
                super.invalidate();
            }

            @Override
            public void invalidate(int i5, int i6, int i7, int i8) {
                if (ChatEditActivity.this.avatarOverlay != null) {
                    ChatEditActivity.this.avatarOverlay.invalidate();
                }
                super.invalidate(i5, i6, i7, i8);
            }
        };
        this.avatarImage = backupImageView;
        backupImageView.setRoundRadius(this.forum ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        if (this.currentUser != null || ChatObject.canChangeChatInfo(this.currentChat)) {
            BackupImageView backupImageView2 = this.avatarImage;
            boolean z = LocaleController.isRTL;
            frameLayout.addView(backupImageView2, LayoutHelper.createFrame(64, 64.0f, (z ? 5 : 3) | 48, z ? 0.0f : 16.0f, 12.0f, z ? 16.0f : 0.0f, 8.0f));
            final Paint paint = new Paint(1);
            paint.setColor(1426063360);
            View view = new View(context) {
                @Override
                protected void onDraw(Canvas canvas) {
                    if (ChatEditActivity.this.avatarImage == null || !ChatEditActivity.this.avatarImage.getImageReceiver().hasNotThumb()) {
                        return;
                    }
                    paint.setAlpha((int) (ChatEditActivity.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
            };
            this.avatarOverlay = view;
            boolean z2 = LocaleController.isRTL;
            frameLayout.addView(view, LayoutHelper.createFrame(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 12.0f, z2 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.avatarProgressView = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.avatarProgressView.setProgressColor(-1);
            this.avatarProgressView.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.avatarProgressView;
            boolean z3 = LocaleController.isRTL;
            frameLayout.addView(radialProgressView2, LayoutHelper.createFrame(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 16.0f, 12.0f, z3 ? 16.0f : 0.0f, 8.0f));
            showAvatarProgress(false, false);
            this.avatarContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity.m1839$r8$lambda$je_Pb18bjodthj4CUl_B8Aqryc(this.f$0, view2);
                }
            });
        } else {
            BackupImageView backupImageView3 = this.avatarImage;
            boolean z4 = LocaleController.isRTL;
            frameLayout.addView(backupImageView3, LayoutHelper.createFrame(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 12.0f, z4 ? 16.0f : 0.0f, 12.0f));
        }
        EditTextEmoji editTextEmoji2 = new EditTextEmoji(context, sizeNotifierFrameLayout2, this, 0, false);
        this.nameTextView = editTextEmoji2;
        if (this.userId != 0) {
            editTextEmoji2.setHint(LocaleController.getString(R.string.BotName));
        } else if (this.isChannel) {
            editTextEmoji2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            editTextEmoji2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        EditTextEmoji editTextEmoji3 = this.nameTextView;
        TLRPC.Chat chat = this.currentChat;
        editTextEmoji3.setEnabled(chat != null || ChatObject.canChangeChatInfo(chat));
        EditTextEmoji editTextEmoji4 = this.nameTextView;
        editTextEmoji4.setFocusable(editTextEmoji4.isEnabled());
        this.nameTextView.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                ChatEditActivity.this.avatarDrawable.setInfo(5L, ChatEditActivity.this.nameTextView.getText().toString(), null);
                if (ChatEditActivity.this.avatarImage != null) {
                    ChatEditActivity.this.avatarImage.invalidate();
                }
            }
        });
        this.nameTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        EditTextEmoji editTextEmoji5 = this.nameTextView;
        boolean z5 = LocaleController.isRTL;
        frameLayout.addView(editTextEmoji5, LayoutHelper.createFrame(-1, -2.0f, 16, z5 ? 5.0f : 96.0f, 0.0f, z5 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.settingsContainer = linearLayout2;
        linearLayout2.setOrientation(1);
        sectionsLinearLayout.addView(this.settingsContainer, LayoutHelper.createLinear(-1, -2));
        if (this.currentUser != null || ChatObject.canChangeChatInfo(this.currentChat)) {
            TextCell textCell = new TextCell(context) {
                @Override
                protected void onDraw(Canvas canvas) {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                }
            };
            this.setAvatarCell = textCell;
            textCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            this.setAvatarCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
            this.setAvatarCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.openSetPhotoAlert();
                }
            });
            this.settingsContainer.addView(this.setAvatarCell, LayoutHelper.createLinear(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.descriptionTextView = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.descriptionTextView.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
        EditTextBoldCursor editTextBoldCursor2 = this.descriptionTextView;
        int i5 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor2.setTextColor(Theme.getColor(i5));
        this.descriptionTextView.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
        this.descriptionTextView.setBackgroundDrawable(null);
        this.descriptionTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.descriptionTextView.setInputType(180225);
        this.descriptionTextView.setImeOptions(6);
        this.descriptionTextView.setEnabled(this.currentUser != null || ChatObject.canChangeChatInfo(this.currentChat));
        EditTextBoldCursor editTextBoldCursor3 = this.descriptionTextView;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.descriptionTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.descriptionTextView.setHint(LocaleController.getString("DescriptionOptionalPlaceholder", R.string.DescriptionOptionalPlaceholder));
        this.descriptionTextView.setCursorColor(Theme.getColor(i5));
        this.descriptionTextView.setCursorSize(AndroidUtilities.dp(20.0f));
        this.descriptionTextView.setCursorWidth(1.5f);
        if (this.descriptionTextView.isEnabled()) {
            this.settingsContainer.addView(this.descriptionTextView, LayoutHelper.createLinear(-1, -2, 23.0f, 15.0f, 23.0f, 9.0f));
        } else {
            this.settingsContainer.addView(this.descriptionTextView, LayoutHelper.createLinear(-1, -2, 23.0f, 12.0f, 23.0f, 6.0f));
        }
        this.descriptionTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                return ChatEditActivity.$r8$lambda$j_CSR4HHqsNtkAeaBoUX8mZgdCw(this.f$0, textView, i6, keyEvent);
            }
        });
        this.descriptionTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            }
        });
        ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context);
        this.settingsTopSectionCell = shadowSectionCell;
        sectionsLinearLayout.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.typeEditContainer = linearLayout3;
        linearLayout3.setOrientation(1);
        sectionsLinearLayout.addView(this.typeEditContainer, LayoutHelper.createLinear(-1, -2));
        TLRPC.Chat chat2 = this.currentChat;
        if (chat2 != null) {
            if (chat2.megagroup && ((chatFull3 = this.info) == null || chatFull3.can_set_location)) {
                TextCell textCell2 = new TextCell(context);
                this.locationCell = textCell2;
                textCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.locationCell, LayoutHelper.createLinear(-1, -2));
                this.locationCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.$r8$lambda$q8WdUv590tzH7s9Fkt7Xx9zGBPI(this.f$0, view2);
                    }
                });
            }
            if (this.currentChat.creator && ((chatFull2 = this.info) == null || chatFull2.can_set_username)) {
                TextCell textCell3 = new TextCell(context);
                this.typeCell = textCell3;
                textCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.typeCell, LayoutHelper.createLinear(-1, -2));
                this.typeCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.m1820$r8$lambda$098XGVHpfkNPaejTiT0D7gzVzU(this.f$0, view2);
                    }
                });
            }
            if (ChatObject.isChannel(this.currentChat) && ((this.isChannel && ChatObject.canUserDoAdminAction(this.currentChat, 1)) || (!this.isChannel && ChatObject.canUserDoAdminAction(this.currentChat, 0)))) {
                TextCell textCell4 = new TextCell(context);
                this.linkedCell = textCell4;
                textCell4.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.linkedCell, LayoutHelper.createLinear(-1, -2));
                this.linkedCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.$r8$lambda$e27yJIDYh9MmbxkAQz5Dah1_mHE(this.f$0, view2);
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.currentChat) && this.isChannel && ChatObject.canUserDoAdminAction(this.currentChat, 1)) {
                TextCell textCell5 = new TextCell(context);
                this.suggestedCell = textCell5;
                textCell5.setBackground(Theme.getSelectorDrawable(true));
                this.suggestedCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.PostSuggestions), (CharSequence) "", R.drawable.msg_markunread, true);
                this.typeEditContainer.addView(this.suggestedCell, LayoutHelper.createLinear(-1, -2));
                this.suggestedCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.$r8$lambda$H4vEZlNjA_TbA65KZpDlipPgP30(this.f$0, view2);
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.currentChat) && ChatObject.canChangeChatInfo(this.currentChat)) {
                chatEditActivity = this;
                sizeNotifierFrameLayout = sizeNotifierFrameLayout2;
                PeerColorActivity.ChangeNameColorCell changeNameColorCell = new PeerColorActivity.ChangeNameColorCell(this.currentAccount, -this.currentChat.id, context, getResourceProvider());
                chatEditActivity.colorCell = changeNameColorCell;
                changeNameColorCell.setBackground(Theme.getSelectorDrawable(true));
                chatEditActivity.typeEditContainer.addView(chatEditActivity.colorCell, LayoutHelper.createLinear(-1, -2));
                chatEditActivity.colorCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.m1834$r8$lambda$Uwd4JAZ1KzRcWij8VJcCmdTYa8(this.f$0, view2);
                    }
                });
            } else {
                chatEditActivity = this;
                sizeNotifierFrameLayout = sizeNotifierFrameLayout2;
            }
            if (!ChatObject.isChannelAndNotMegaGroup(chatEditActivity.currentChat) || ChatObject.isCommunity(chatEditActivity.currentChat)) {
                context3 = context;
            } else {
                final long j = -chatEditActivity.currentChat.id;
                context3 = context;
                TextCell textCell6 = new TextCell(context3, 23, false, true, chatEditActivity.resourceProvider);
                chatEditActivity.autoTranslationCell = textCell6;
                textCell6.setBackground(Theme.getSelectorDrawable(true));
                chatEditActivity.autoTranslationCell.setTextAndCheckAndIcon(LocaleController.getString(R.string.ChannelAutotranslation), chatEditActivity.currentChat.autotranslation, R.drawable.msg_translate, false);
                chatEditActivity.getMessagesController().getBoostsController().getBoostsStats(j, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        ChatEditActivity.m1846$r8$lambda$xrz1JwqTdeCu2z07McARRQ6xM0(this.f$0, (TL_stories.TL_premium_boostsStatus) obj);
                    }
                });
                chatEditActivity.typeEditContainer.addView(chatEditActivity.autoTranslationCell, LayoutHelper.createLinear(-1, -2));
                final boolean[] zArr = {false};
                chatEditActivity.autoTranslationCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.$r8$lambda$hcDvlHHidyH2wlp2T8wwuHcnh2A(this.f$0, zArr, j, view2);
                    }
                });
            }
            if (!chatEditActivity.isChannel && ChatObject.canBlockUsers(chatEditActivity.currentChat) && (ChatObject.isChannel(chatEditActivity.currentChat) || chatEditActivity.currentChat.creator)) {
                TextCell textCell7 = new TextCell(context3);
                chatEditActivity.historyCell = textCell7;
                textCell7.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                chatEditActivity.typeEditContainer.addView(chatEditActivity.historyCell, LayoutHelper.createLinear(-1, -2));
                chatEditActivity.historyCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.$r8$lambda$9cDpBZJQesT8KfBSOLxmKUH3u38(this.f$0, context3, view2);
                    }
                });
            }
            if (ChatObject.isMegagroup(chatEditActivity.currentChat) && ChatObject.hasAdminRights(chatEditActivity.currentChat) && !ChatObject.isCommunity(chatEditActivity.currentChat)) {
                MessagesController.getInstance(chatEditActivity.currentAccount).getBoostsController().getBoostsStats(-chatEditActivity.currentChat.id, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        this.f$0.boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                    }
                });
                PeerColorActivity.ChangeNameColorCell changeNameColorCell2 = new PeerColorActivity.ChangeNameColorCell(chatEditActivity.currentAccount, -chatEditActivity.currentChat.id, context, chatEditActivity.getResourceProvider());
                chatEditActivity.colorCell = changeNameColorCell2;
                changeNameColorCell2.setBackground(Theme.getSelectorDrawable(true));
                chatEditActivity.typeEditContainer.addView(chatEditActivity.colorCell, LayoutHelper.createLinear(-1, -2));
                chatEditActivity.colorCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.$r8$lambda$eAOEEylGIkCOauuOWxul_JtCL3I(this.f$0, view2);
                    }
                });
            }
            if (!chatEditActivity.isChannel && chatEditActivity.currentChat.creator) {
                TextCell textCell8 = new TextCell(context, 23, false, true, null);
                context2 = context;
                chatEditActivity.forumsCell = textCell8;
                textCell8.setBackground(Theme.getSelectorDrawable(true));
                chatEditActivity.forumsCell.setTextAndCheckAndIcon(LocaleController.getString(R.string.ChannelTopics), chatEditActivity.forum, R.drawable.msg_topics, false);
                chatEditActivity.forumsCell.getCheckBox().setIcon(chatEditActivity.canForum ? 0 : R.drawable.permission_locked);
                chatEditActivity.typeEditContainer.addView(chatEditActivity.forumsCell, LayoutHelper.createFrame(-1, -2.0f));
                chatEditActivity.forumsCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.m1821$r8$lambda$2Vfs_XhayBM19IHN0YFQ0vTr_U(this.f$0, frameLayout, view2);
                    }
                });
            } else {
                context2 = context;
            }
            chatEditActivity.updateColorCell();
        } else {
            chatEditActivity = this;
            context2 = context;
            sizeNotifierFrameLayout = sizeNotifierFrameLayout2;
            sectionsLinearLayout = sectionsLinearLayout;
        }
        ActionBarMenu actionBarMenuCreateMenu = chatEditActivity.actionBar.createMenu();
        if (chatEditActivity.currentUser != null || ChatObject.canChangeChatInfo(chatEditActivity.currentChat) || chatEditActivity.historyCell != null) {
            ActionBarMenuItem actionBarMenuItemAddItemWithWidth = actionBarMenuCreateMenu.addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            chatEditActivity.doneButton = actionBarMenuItemAddItemWithWidth;
            actionBarMenuItemAddItemWithWidth.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (chatEditActivity.locationCell == null && chatEditActivity.historyCell == null && chatEditActivity.typeCell == null && chatEditActivity.linkedCell == null && chatEditActivity.forumsCell == null) {
            viewGroup = sectionsLinearLayout;
        } else {
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context2, 12, chatEditActivity.resourceProvider);
            chatEditActivity.settingsSectionCell = textInfoPrivacyCell;
            if (chatEditActivity.forumsCell != null) {
                textInfoPrivacyCell.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                textInfoPrivacyCell.setFixedSize(12);
            }
            viewGroup = sectionsLinearLayout;
            viewGroup.addView(chatEditActivity.settingsSectionCell, LayoutHelper.createLinear(-1, -2));
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        chatEditActivity.infoContainer = linearLayout4;
        linearLayout4.setOrientation(1);
        viewGroup.addView(chatEditActivity.infoContainer, LayoutHelper.createLinear(-1, -2));
        if (chatEditActivity.currentChat != null) {
            TextCell textCell9 = new TextCell(context2);
            chatEditActivity.blockCell = textCell9;
            textCell9.setBackground(Theme.getSelectorDrawable(false));
            TextCell textCell10 = chatEditActivity.blockCell;
            if (ChatObject.isChannel(chatEditActivity.currentChat)) {
                i4 = 0;
            } else {
                TLRPC.Chat chat3 = chatEditActivity.currentChat;
                if (chat3.creator || (ChatObject.hasAdminRights(chat3) && ChatObject.canChangeChatInfo(chatEditActivity.currentChat))) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
            }
            textCell10.setVisibility(i4);
            chatEditActivity.blockCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity.$r8$lambda$kekhtLecH5j2AOzSiodRX2LEL9E(this.f$0, view2);
                }
            });
            TextCell textCell11 = new TextCell(context2);
            chatEditActivity.inviteLinksCell = textCell11;
            textCell11.setBackground(Theme.getSelectorDrawable(false));
            chatEditActivity.inviteLinksCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity.$r8$lambda$UPlXlZI_8xOcUChk7PCsCKV78qE(this.f$0, view2);
                }
            });
            TextCell textCell12 = new TextCell(context2);
            chatEditActivity.reactionsCell = textCell12;
            textCell12.setBackground(Theme.getSelectorDrawable(false));
            chatEditActivity.reactionsCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity.$r8$lambda$7oH9UOOLFGU8M03cWRxfxGir6Uw(this.f$0, view2);
                }
            });
            if (ChatObject.canUserDoAdminAction(chatEditActivity.currentChat, 28)) {
                TextCell textCell13 = new TextCell(context2);
                chatEditActivity.welcomeMessagesCell = textCell13;
                textCell13.setBackground(Theme.getSelectorDrawable(false));
                chatEditActivity.welcomeMessagesCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.$r8$lambda$UL0j5M5F8S_9EFiKENk7S999rAo(this.f$0, view2);
                    }
                });
                chatEditActivity.checkWelcomeMessagesValue();
            }
            TextCell textCell14 = new TextCell(context2);
            chatEditActivity.adminCell = textCell14;
            textCell14.setBackground(Theme.getSelectorDrawable(false));
            chatEditActivity.adminCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity.$r8$lambda$56rva0schmvExkbaVXbHHrXgduo(this.f$0, view2);
                }
            });
            TextCell textCell15 = new TextCell(context2);
            chatEditActivity.membersCell = textCell15;
            textCell15.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            chatEditActivity.membersCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity.$r8$lambda$MMngHuMo2SnktU3N454YjxNv2d8(this.f$0, view2);
                }
            });
            if (!ChatObject.isChannelAndNotMegaGroup(chatEditActivity.currentChat)) {
                TextCell textCell16 = new TextCell(context2);
                chatEditActivity.memberRequestsCell = textCell16;
                textCell16.setBackground(Theme.getSelectorDrawable(false));
                chatEditActivity.memberRequestsCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity chatEditActivity3 = this.f$0;
                        chatEditActivity3.presentFragment(new MemberRequestsActivity(chatEditActivity3.chatId));
                    }
                });
            }
            TextCell textCell17 = new TextCell(context2);
            chatEditActivity.channelAffiliateProgramsCell = textCell17;
            textCell17.setTextAndIcon(applyNewSpan(LocaleController.getString(R.string.ChannelAffiliatePrograms)), R.drawable.menu_feature_premium, false);
            chatEditActivity.channelAffiliateProgramsCell.setBackground(Theme.getSelectorDrawable(false));
            chatEditActivity.channelAffiliateProgramsCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity chatEditActivity3 = this.f$0;
                    chatEditActivity3.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity3.chatId));
                }
            });
            chatEditActivity.channelAffiliateProgramsCell.setVisibility(8);
            if (ChatObject.isChannel(chatEditActivity.currentChat) || chatEditActivity.currentChat.gigagroup) {
                TextCell textCell18 = new TextCell(context2);
                chatEditActivity.logCell = textCell18;
                textCell18.setTextAndIcon((CharSequence) LocaleController.getString(R.string.EventLog), R.drawable.msg_log, false);
                chatEditActivity.logCell.setBackground(Theme.getSelectorDrawable(false));
                chatEditActivity.logCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.$r8$lambda$wOE1KUnWP75eHcjBxOQfXpkXVHU(this.f$0, view2);
                    }
                });
            }
            if (ChatObject.isBoostSupported(chatEditActivity.currentChat)) {
                TextCell textCell19 = new TextCell(context2);
                chatEditActivity.statsAndBoosts = textCell19;
                textCell19.setTextAndIcon((CharSequence) LocaleController.getString(R.string.StatisticsAndBoosts), R.drawable.msg_stats, true);
                chatEditActivity.statsAndBoosts.setBackground(Theme.getSelectorDrawable(false));
                chatEditActivity.statsAndBoosts.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity chatEditActivity3 = this.f$0;
                        chatEditActivity3.presentFragment(StatisticActivity.create(chatEditActivity3.currentChat, false));
                    }
                });
            }
            chatEditActivity.infoContainer.addView(chatEditActivity.reactionsCell, LayoutHelper.createLinear(-1, -2));
            TextCell textCell20 = chatEditActivity.welcomeMessagesCell;
            if (textCell20 != null) {
                chatEditActivity.infoContainer.addView(textCell20, LayoutHelper.createLinear(-1, -2));
            }
            if (!chatEditActivity.isChannel && !chatEditActivity.currentChat.gigagroup) {
                chatEditActivity.infoContainer.addView(chatEditActivity.blockCell, LayoutHelper.createLinear(-1, -2));
            }
            if (!chatEditActivity.isChannel) {
                chatEditActivity.infoContainer.addView(chatEditActivity.inviteLinksCell, LayoutHelper.createLinear(-1, -2));
            }
            chatEditActivity.infoContainer.addView(chatEditActivity.adminCell, LayoutHelper.createLinear(-1, -2));
            chatEditActivity.infoContainer.addView(chatEditActivity.membersCell, LayoutHelper.createLinear(-1, -2));
            TextCell textCell21 = chatEditActivity.memberRequestsCell;
            if (textCell21 != null && (chatFull = chatEditActivity.info) != null && chatFull.requests_pending > 0) {
                chatEditActivity.infoContainer.addView(textCell21, LayoutHelper.createLinear(-1, -2));
            }
            if (chatEditActivity.isChannel) {
                chatEditActivity.infoContainer.addView(chatEditActivity.inviteLinksCell, LayoutHelper.createLinear(-1, -2));
            }
            if (chatEditActivity.isChannel || chatEditActivity.currentChat.gigagroup) {
                chatEditActivity.infoContainer.addView(chatEditActivity.blockCell, LayoutHelper.createLinear(-1, -2));
            }
            TextCell textCell22 = chatEditActivity.statsAndBoosts;
            if (textCell22 != null) {
                chatEditActivity.infoContainer.addView(textCell22, LayoutHelper.createLinear(-1, -2));
            }
            TextCell textCell23 = chatEditActivity.logCell;
            if (textCell23 != null) {
                chatEditActivity.infoContainer.addView(textCell23, LayoutHelper.createLinear(-1, -2));
            }
            TextCell textCell24 = chatEditActivity.channelAffiliateProgramsCell;
            if (textCell24 != null) {
                chatEditActivity.infoContainer.addView(textCell24, LayoutHelper.createLinear(-1, -2));
            }
            if (chatEditActivity.channelAffiliateProgramsCell != null && chatEditActivity.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(chatEditActivity.currentChat)) {
                chatEditActivity.channelAffiliateProgramsCell.setVisibility(0);
            }
            TextCell textCell25 = chatEditActivity.logCell;
            if (textCell25 != null) {
                TextCell textCell26 = chatEditActivity.channelAffiliateProgramsCell;
                textCell25.setNeedDivider(textCell26 != null && textCell26.getVisibility() == 0);
            }
        }
        if (chatEditActivity.currentUser != null) {
            TextCell textCell27 = new TextCell(context2);
            chatEditActivity.publicLinkCell = textCell27;
            textCell27.setBackground(Theme.getSelectorDrawable(false));
            chatEditActivity.publicLinkCell.setPrioritizeTitleOverValue(true);
            chatEditActivity.infoContainer.addView(chatEditActivity.publicLinkCell, LayoutHelper.createLinear(-1, -2));
            chatEditActivity.publicLinkCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity.m1841$r8$lambda$pvTy6EaEUeauJh8ul_IGb6kc(this.f$0, view2);
                }
            });
            chatEditActivity.updatePublicLinksCount();
            TextCell textCell28 = new TextCell(context2);
            chatEditActivity.botAffiliateProgramCell = textCell28;
            textCell28.setBackground(Theme.getSelectorDrawable(false));
            chatEditActivity.botAffiliateProgramCell.setTextAndValueAndIcon(applyNewSpan(LocaleController.getString(R.string.AffiliateProgramBot)), (CharSequence) "", R.drawable.msg_shareout, true);
            chatEditActivity.infoContainer.addView(chatEditActivity.botAffiliateProgramCell, LayoutHelper.createLinear(-1, -2));
            chatEditActivity.botAffiliateProgramCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity chatEditActivity3 = this.f$0;
                    chatEditActivity3.presentFragment(new AffiliateProgramFragment(chatEditActivity3.userId));
                }
            });
            chatEditActivity.botAffiliateProgramCell.setDrawLoading(chatEditActivity.userInfo == null, 45, false);
            TLRPC.UserFull userFull = chatEditActivity.userInfo;
            if (userFull != null) {
                TextCell textCell29 = chatEditActivity.botAffiliateProgramCell;
                TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                textCell29.setValue(starrefprogram == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f)), false);
            }
            if (!chatEditActivity.getMessagesController().starrefProgramAllowed) {
                chatEditActivity.botAffiliateProgramCell.setVisibility(8);
            }
            TextCell textCell30 = new TextCell(context2);
            chatEditActivity.editIntroCell = textCell30;
            textCell30.setBackground(Theme.getSelectorDrawable(false));
            chatEditActivity.editIntroCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.BotEditIntro), R.drawable.msg_log, true);
            chatEditActivity.infoContainer.addView(chatEditActivity.editIntroCell, LayoutHelper.createLinear(-1, -2));
            chatEditActivity.editIntroCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity.$r8$lambda$XPqQLfEUQ27BSpyymaC9l2oWmTw(this.f$0, view2);
                }
            });
            TextCell textCell31 = new TextCell(context2);
            chatEditActivity.editCommandsCell = textCell31;
            textCell31.setBackground(Theme.getSelectorDrawable(false));
            chatEditActivity.editCommandsCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.BotEditCommands), R.drawable.msg_media, true);
            chatEditActivity.infoContainer.addView(chatEditActivity.editCommandsCell, LayoutHelper.createLinear(-1, -2));
            chatEditActivity.editCommandsCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity.m1826$r8$lambda$CNCyxXbpqNMXoNSNjGq1Vs33HE(this.f$0, view2);
                }
            });
            TextCell textCell32 = new TextCell(context2);
            chatEditActivity.changeBotSettingsCell = textCell32;
            textCell32.setBackground(Theme.getSelectorDrawable(false));
            chatEditActivity.changeBotSettingsCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.BotChangeSettings), R.drawable.msg_bot, true);
            chatEditActivity.infoContainer.addView(chatEditActivity.changeBotSettingsCell, LayoutHelper.createLinear(-1, -2));
            chatEditActivity.changeBotSettingsCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity.m1833$r8$lambda$TgpJsT_JtB0OqSRKRv7EU946M(this.f$0, view2);
                }
            });
        }
        TLRPC.Chat chat4 = chatEditActivity.currentChat;
        if (chat4 != null) {
            if (!ChatObject.hasAdminRights(chat4)) {
                chatEditActivity.infoContainer.setVisibility(8);
                chatEditActivity.settingsTopSectionCell.setVisibility(8);
            }
            if (chatEditActivity.stickersCell == null) {
                ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context2);
                chatEditActivity.infoSectionCell = shadowSectionCell2;
                viewGroup.addView(shadowSectionCell2, LayoutHelper.createLinear(-1, -2));
            }
        } else if (chatEditActivity.currentUser != null) {
            chatEditActivity.botInfoCell = new TextInfoPrivacyCell(context2, 12, chatEditActivity.resourceProvider);
            String string = LocaleController.getString(R.string.BotManageInfo);
            SpannableString spannableStringValueOf = SpannableString.valueOf(string);
            int iIndexOf = string.indexOf("@BotFather");
            if (iIndexOf != -1) {
                spannableStringValueOf.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(View view2) {
                        Browser.openUrl(view2.getContext(), "https://t.me/BotFather");
                    }

                    @Override
                    public void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                    }
                }, iIndexOf, iIndexOf + 10, 33);
            }
            chatEditActivity.botInfoCell.setText(spannableStringValueOf);
            viewGroup.addView(chatEditActivity.botInfoCell, LayoutHelper.createLinear(-1, -2));
            TextCell textCell33 = new TextCell(context2);
            chatEditActivity.verifyCell = textCell33;
            textCell33.setBackground(Theme.getSelectorDrawable(true));
            chatEditActivity.verifyCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.BotVerifyAccounts), R.drawable.menu_factcheck, false);
            TextCell textCell34 = chatEditActivity.verifyCell;
            int i6 = Theme.key_windowBackgroundWhiteBlueText4;
            textCell34.setColors(i6, i6);
            viewGroup.addView(chatEditActivity.verifyCell, LayoutHelper.createLinear(-1, -2));
            chatEditActivity.verifyCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity chatEditActivity3 = this.f$0;
                    BotVerifySheet.openVerify(chatEditActivity3.currentAccount, chatEditActivity3.userId, chatEditActivity3.userInfo.bot_info.verifier_settings);
                }
            });
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context2, 12, chatEditActivity.resourceProvider);
            chatEditActivity.verifyInfoCell = textInfoPrivacyCell2;
            textInfoPrivacyCell2.setFixedSize(12);
            viewGroup.addView(chatEditActivity.verifyInfoCell, LayoutHelper.createLinear(-1, -2));
            TextCell textCell35 = chatEditActivity.verifyCell;
            TLRPC.UserFull userFull2 = chatEditActivity.userInfo;
            textCell35.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            TextInfoPrivacyCell textInfoPrivacyCell3 = chatEditActivity.verifyInfoCell;
            TLRPC.UserFull userFull3 = chatEditActivity.userInfo;
            textInfoPrivacyCell3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = chatEditActivity.currentUser;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout5 = new LinearLayout(context2);
                chatEditActivity.balanceContainer = linearLayout5;
                linearLayout5.setOrientation(1);
                viewGroup.addView(chatEditActivity.balanceContainer, LayoutHelper.createLinear(-1, -2));
                HeaderCell headerCell = new HeaderCell(context2);
                headerCell.setText(LocaleController.getString(R.string.BotBalance));
                chatEditActivity.balanceContainer.addView(headerCell, LayoutHelper.createLinear(-1, -2));
                TextCell textCell36 = new TextCell(context2);
                chatEditActivity.tonBalanceCell = textCell36;
                textCell36.setBackground(Theme.getSelectorDrawable(false));
                chatEditActivity.tonBalanceCell.setPrioritizeTitleOverValue(true);
                chatEditActivity.balanceContainer.addView(chatEditActivity.tonBalanceCell, LayoutHelper.createLinear(-1, -2));
                final BotStarsController botStarsController = BotStarsController.getInstance(chatEditActivity.currentAccount);
                chatEditActivity.tonBalanceCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.$r8$lambda$NJPLl0WjkS_b1FtSYnztmQNeH9w(this.f$0, botStarsController, view2);
                    }
                });
                if (!botStarsController.isTONBalanceAvailable(chatEditActivity.userId)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
                    spannableStringBuilder.setSpan(new LoadingSpan(chatEditActivity.tonBalanceCell.valueTextView, AndroidUtilities.dp(30.0f)), 0, spannableStringBuilder.length(), 33);
                    chatEditActivity.tonBalanceCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotBalanceTON), (CharSequence) spannableStringBuilder, R.drawable.outline_gram_24, false);
                } else {
                    long tONBalance = botStarsController.getTONBalance(chatEditActivity.userId);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (tONBalance > 0) {
                        double d = tONBalance / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder2.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder2.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                        }
                    }
                    chatEditActivity.tonBalanceCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotBalanceTON), (CharSequence) spannableStringBuilder2, R.drawable.outline_gram_24, true);
                }
                chatEditActivity.tonBalanceCell.setVisibility(botStarsController.botHasTON(chatEditActivity.userId) ? 0 : 8);
                TextCell textCell37 = new TextCell(context2);
                chatEditActivity.starsBalanceCell = textCell37;
                textCell37.setBackground(Theme.getSelectorDrawable(false));
                chatEditActivity.starsBalanceCell.setPrioritizeTitleOverValue(true);
                chatEditActivity.balanceContainer.addView(chatEditActivity.starsBalanceCell, LayoutHelper.createLinear(-1, -2));
                chatEditActivity.starsBalanceCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.m1847$r8$lambda$zQKxp_BCblddrPxOaBKe0ai8GI(this.f$0, botStarsController, view2);
                    }
                });
                if (!botStarsController.isStarsBalanceAvailable(chatEditActivity.userId)) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new LoadingSpan(chatEditActivity.starsBalanceCell.valueTextView, AndroidUtilities.dp(30.0f)), 0, spannableStringBuilder3.length(), 33);
                    chatEditActivity.starsBalanceCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotBalanceStars), (CharSequence) spannableStringBuilder3, R.drawable.menu_premium_main, false);
                } else {
                    chatEditActivity.starsBalanceCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotBalanceStars), botStarsController.getBotStarsBalance(chatEditActivity.userId).amount > 0 ? StarsIntroActivity.replaceStarsWithPlain(TextUtils.concat("XTR", StarsIntroActivity.formatStarsAmountShort(botStarsController.getBotStarsBalance(chatEditActivity.userId), 0.85f, ' ')), 0.85f) : "", R.drawable.menu_premium_main, false);
                }
                chatEditActivity.starsBalanceCell.setVisibility(botStarsController.botHasStars(chatEditActivity.userId) ? 0 : 8);
                TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context2, 12, chatEditActivity.getResourceProvider());
                textInfoPrivacyCell4.setFixedSize(12);
                textInfoPrivacyCell4.setTag(R.id.fit_width_tag, 1);
                viewGroup.addView(textInfoPrivacyCell4, LayoutHelper.createLinear(-1, 12));
                chatEditActivity.balanceContainer.setVisibility((chatEditActivity.starsBalanceCell.getVisibility() == 0 || chatEditActivity.tonBalanceCell.getVisibility() == 0) ? 0 : 8);
            }
        }
        TLRPC.Chat chat5 = chatEditActivity.currentChat;
        if ((chat5 == null || !chat5.creator) && !((user = chatEditActivity.currentUser) != null && user.bot && user.bot_can_edit)) {
            chatEditActivity2 = chatEditActivity;
        } else {
            final long j2 = chat5 != null ? chat5.linked_community_id : chatEditActivity.currentUser.linked_community_id;
            final long j3 = chat5 != null ? -chat5.id : chatEditActivity.currentUser.id;
            final boolean z6 = chatEditActivity.currentUser != null;
            if (j2 != 0) {
                CommunityLinkView2 communityLinkView2 = new CommunityLinkView2(context2, chatEditActivity.resourceProvider);
                chatEditActivity.communityLinkView = communityLinkView2;
                communityLinkView2.setChat(chatEditActivity.currentAccount, chatEditActivity.getMessagesController().getChat(Long.valueOf(j2)));
                chatEditActivity.communityLinkView.setBackground(Theme.getSelectorDrawable(false));
                chatEditActivity.communityLinkView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.$r8$lambda$KbwfbyCjFRPb1HviZiJODgbJ8E8(this.f$0, j2, view2);
                    }
                });
                viewGroup.addView(chatEditActivity.communityLinkView, LayoutHelper.createLinear(-1, -2));
                TextCell textCell38 = new TextCell(context2);
                chatEditActivity.communityUnlinkCell = textCell38;
                if (z6) {
                    i3 = R.string.CommunityRemoveBotFromCommunity;
                } else if (chatEditActivity.isChannel) {
                    i3 = R.string.CommunityRemoveChannelFromCommunity;
                } else {
                    i3 = R.string.CommunityRemoveGroupFromCommunity;
                }
                textCell38.setTextAndIcon((CharSequence) LocaleController.getString(i3), R.drawable.outline_community_remove_24, false);
                TextCell textCell39 = chatEditActivity.communityUnlinkCell;
                int i7 = Theme.key_text_RedRegular;
                textCell39.setColors(i7, i7);
                chatEditActivity.communityUnlinkCell.setBackground(Theme.getSelectorDrawable(false));
                chatEditActivity2 = chatEditActivity;
                chatEditActivity.communityUnlinkCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.m1836$r8$lambda$YJE_zkAEL7dqptnkKMXINCb3zk(this.f$0, z6, j3, j2, view2);
                    }
                });
                viewGroup.addView(chatEditActivity2.communityUnlinkCell, LayoutHelper.createLinear(-1, -2));
                TextInfoPrivacyCell textInfoPrivacyCell5 = new TextInfoPrivacyCell(context2, 12, chatEditActivity2.getResourceProvider());
                chatEditActivity2.communityGapView = textInfoPrivacyCell5;
                textInfoPrivacyCell5.setFixedSize(14);
                chatEditActivity2.communityGapView.setTag(R.id.fit_width_tag, 1);
                viewGroup.addView(chatEditActivity2.communityGapView, LayoutHelper.createLinear(-1, 14));
            } else {
                chatEditActivity2 = chatEditActivity;
                TextCell textCell40 = new TextCell(context2);
                chatEditActivity2.communityCell = textCell40;
                textCell40.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                chatEditActivity2.communityCell.setTextColor(Theme.getColor(Theme.key_telegram_color_text));
                chatEditActivity2.communityCell.setBackground(Theme.getSelectorDrawable(false));
                TextCell textCell41 = chatEditActivity2.communityCell;
                if (z6) {
                    i = R.string.CommunityAddBotToCommunity;
                } else if (chatEditActivity2.isChannel) {
                    i = R.string.CommunityAddChannelToCommunity;
                } else {
                    i = R.string.CommunityAddGroupToCommunity;
                }
                textCell41.setTextAndIcon((CharSequence) LocaleController.getString(i), R.drawable.msg_groups, false);
                chatEditActivity2.communityCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChatEditActivity.m1844$r8$lambda$w58xf7GYLW4T8jw4UiDeOjpmaU(this.f$0, j3, view2);
                    }
                });
                TextInfoPrivacyCell textInfoPrivacyCell6 = new TextInfoPrivacyCell(context2, 12, chatEditActivity2.resourceProvider);
                chatEditActivity2.communityInfoCell = textInfoPrivacyCell6;
                if (z6) {
                    i2 = R.string.CommunityAddBotToCommunityInfo;
                } else if (chatEditActivity2.isChannel) {
                    i2 = R.string.CommunityAddChannelToCommunityInfo;
                } else {
                    i2 = R.string.CommunityAddGroupToCommunityInfo;
                }
                textInfoPrivacyCell6.setText(LocaleController.getString(i2));
                viewGroup.addView(chatEditActivity2.communityCell, LayoutHelper.createLinear(-1, -2));
                viewGroup.addView(chatEditActivity2.communityInfoCell, LayoutHelper.createLinear(-1, -2));
            }
        }
        TLRPC.Chat chat6 = chatEditActivity2.currentChat;
        if (chat6 != null && chat6.creator) {
            FrameLayout frameLayout2 = new FrameLayout(context2);
            chatEditActivity2.deleteContainer = frameLayout2;
            viewGroup.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
            TextSettingsCell textSettingsCell = new TextSettingsCell(context2);
            chatEditActivity2.deleteCell = textSettingsCell;
            textSettingsCell.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
            chatEditActivity2.deleteCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            if (chatEditActivity2.currentUser != null) {
                chatEditActivity2.deleteCell.setText(LocaleController.getString(R.string.DeleteBot), false);
            } else if (chatEditActivity2.isChannel) {
                chatEditActivity2.deleteCell.setText(LocaleController.getString(R.string.ChannelDelete), false);
            } else {
                chatEditActivity2.deleteCell.setText(LocaleController.getString(R.string.DeleteAndExitButton), false);
            }
            chatEditActivity2.deleteContainer.addView(chatEditActivity2.deleteCell, LayoutHelper.createFrame(-1, -2.0f));
            chatEditActivity2.deleteCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity chatEditActivity3 = this.f$0;
                    AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity3, false, chatEditActivity3.currentChat, null, false, true, true, false, new MessagesStorage.BooleanCallback() {
                        @Override
                        public final void run(boolean z7) {
                            ChatEditActivity.m1842$r8$lambda$qyIb0v9vX1LUIfiJBLH5qXjAQ(chatEditActivity3, z7);
                        }
                    });
                }
            });
            ShadowSectionCell shadowSectionCell3 = new ShadowSectionCell(context2);
            chatEditActivity2.deleteInfoCell = shadowSectionCell3;
            viewGroup.addView(shadowSectionCell3, LayoutHelper.createLinear(-1, -2));
        }
        UndoView undoView = new UndoView(context2);
        chatEditActivity2.undoView = undoView;
        sizeNotifierFrameLayout.addView(undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        EditTextEmoji editTextEmoji6 = chatEditActivity2.nameTextView;
        TLRPC.User user3 = chatEditActivity2.currentUser;
        editTextEmoji6.setText(Emoji.replaceEmoji(user3 != null ? ContactsController.formatName(user3) : chatEditActivity2.currentChat.title, chatEditActivity2.nameTextView.getEditText().getPaint().getFontMetricsInt(), true));
        EditTextEmoji editTextEmoji7 = chatEditActivity2.nameTextView;
        editTextEmoji7.setSelection(editTextEmoji7.length());
        TLRPC.ChatFull chatFull4 = chatEditActivity2.info;
        if (chatFull4 != null) {
            chatEditActivity2.descriptionTextView.setText(chatFull4.about);
        } else {
            TLRPC.UserFull userFull4 = chatEditActivity2.userInfo;
            if (userFull4 != null) {
                chatEditActivity2.descriptionTextView.setText(userFull4.about);
            }
        }
        chatEditActivity2.setAvatar();
        chatEditActivity2.updateFields(true, false);
        return chatEditActivity2.fragmentView;
    }

    public static void m1839$r8$lambda$je_Pb18bjodthj4CUl_B8Aqryc(ChatEditActivity chatEditActivity, View view) {
        if (chatEditActivity.imageUpdater.isUploadingImage()) {
            return;
        }
        ImageLocation forPhoto = null;
        TLRPC.User user = chatEditActivity.userId == 0 ? null : chatEditActivity.getMessagesController().getUser(Long.valueOf(chatEditActivity.userId));
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.getInstance().setParentActivity(chatEditActivity);
            TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
            int i = userProfilePhoto2.dc_id;
            if (i != 0) {
                userProfilePhoto2.photo_big.dc_id = i;
            }
            PhotoViewer.getInstance().openPhoto(user.photo.photo_big, chatEditActivity.provider);
            return;
        }
        TLRPC.Chat chat = chatEditActivity.getMessagesController().getChat(Long.valueOf(chatEditActivity.chatId));
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto == null || chatPhoto.photo_big == null) {
            return;
        }
        PhotoViewer.getInstance().setParentActivity(chatEditActivity);
        TLRPC.ChatPhoto chatPhoto2 = chat.photo;
        int i2 = chatPhoto2.dc_id;
        if (i2 != 0) {
            chatPhoto2.photo_big.dc_id = i2;
        }
        TLRPC.ChatFull chatFull = chatEditActivity.info;
        if (chatFull != null) {
            TLRPC.Photo photo = chatFull.chat_photo;
            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                forPhoto = ImageLocation.getForPhoto(chatEditActivity.info.chat_photo.video_sizes.get(0), chatEditActivity.info.chat_photo);
            }
        }
        PhotoViewer.getInstance().openPhotoWithVideo(chat.photo.photo_big, forPhoto, chatEditActivity.provider);
    }

    public static boolean $r8$lambda$j_CSR4HHqsNtkAeaBoUX8mZgdCw(ChatEditActivity chatEditActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            chatEditActivity.getClass();
            return false;
        }
        View view = chatEditActivity.doneButton;
        if (view == null) {
            return false;
        }
        view.performClick();
        return true;
    }

    public static void $r8$lambda$q8WdUv590tzH7s9Fkt7Xx9zGBPI(final ChatEditActivity chatEditActivity, View view) {
        chatEditActivity.getClass();
        if (AndroidUtilities.isMapsInstalled(chatEditActivity)) {
            LocationActivity locationActivity = new LocationActivity(4);
            locationActivity.setDialogId(-chatEditActivity.chatId);
            TLRPC.ChatFull chatFull = chatEditActivity.info;
            if (chatFull != null) {
                TLRPC.ChannelLocation channelLocation = chatFull.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    locationActivity.setInitialLocation((TLRPC.TL_channelLocation) channelLocation);
                }
            }
            locationActivity.setDelegate(new LocationActivity.LocationActivityDelegate() {
                @Override
                public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
                    ChatEditActivity.$r8$lambda$w3bQj2ybaQF3etPGstP4FAF6Ejk(this.f$0, messageMedia, i, z, i2, j);
                }
            });
            chatEditActivity.presentFragment(locationActivity);
        }
    }

    public static void $r8$lambda$w3bQj2ybaQF3etPGstP4FAF6Ejk(ChatEditActivity chatEditActivity, TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        chatEditActivity.getClass();
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        TLRPC.ChatFull chatFull = chatEditActivity.info;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        chatEditActivity.updateFields(false, true);
        chatEditActivity.getMessagesController().loadFullChat(chatEditActivity.chatId, 0, true);
    }

    public static void m1820$r8$lambda$098XGVHpfkNPaejTiT0D7gzVzU(ChatEditActivity chatEditActivity, View view) {
        long j = chatEditActivity.chatId;
        TextCell textCell = chatEditActivity.locationCell;
        ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j, textCell != null && textCell.getVisibility() == 0);
        chatEditTypeActivity.setInfo(chatEditActivity.info);
        chatEditActivity.presentFragment(chatEditTypeActivity);
    }

    public static void $r8$lambda$e27yJIDYh9MmbxkAQz5Dah1_mHE(ChatEditActivity chatEditActivity, View view) {
        ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity.chatId);
        chatLinkActivity.setInfo(chatEditActivity.info);
        chatEditActivity.presentFragment(chatLinkActivity);
    }

    public static void $r8$lambda$H4vEZlNjA_TbA65KZpDlipPgP30(final ChatEditActivity chatEditActivity, View view) {
        PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity.chatId);
        postSuggestionsEditActivity.setOnApplied(new MessagesStorage.LongCallback() {
            @Override
            public final void run(long j) {
                this.f$0.updateSuggestedCell(Long.valueOf(j), false);
            }
        });
        chatEditActivity.presentFragment(postSuggestionsEditActivity);
    }

    public static void m1834$r8$lambda$Uwd4JAZ1KzRcWij8VJcCmdTYa8(ChatEditActivity chatEditActivity, View view) {
        chatEditActivity.presentFragment(new ChannelColorActivity(-chatEditActivity.currentChat.id).setOnApplied(chatEditActivity));
        MessagesController.getInstance(chatEditActivity.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(chatEditActivity.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static void m1846$r8$lambda$xrz1JwqTdeCu2z07McARRQ6xM0(ChatEditActivity chatEditActivity, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            chatEditActivity.autoTranslationCell.getCheckBox().setIcon(tL_premium_boostsStatus.level < chatEditActivity.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
        } else {
            chatEditActivity.getClass();
        }
    }

    public static void $r8$lambda$hcDvlHHidyH2wlp2T8wwuHcnh2A(final ChatEditActivity chatEditActivity, final boolean[] zArr, final long j, View view) {
        chatEditActivity.getClass();
        if (zArr[0]) {
            return;
        }
        final AlertDialog alertDialog = new AlertDialog(chatEditActivity.getParentActivity(), 3);
        alertDialog.showDelayed(400L);
        zArr[0] = true;
        final boolean z = !chatEditActivity.autoTranslationCell.isChecked();
        if (!chatEditActivity.autoTranslationCell.getCheckBox().hasIcon()) {
            chatEditActivity.autoTranslationCell.setChecked(z);
        }
        chatEditActivity.getMessagesController().getBoostsController().getBoostsStats(j, new Consumer() {
            @Override
            public final void accept(Object obj) {
                ChatEditActivity.$r8$lambda$X2NbyuGqY4iWnjzMLzHle7qaKxg(this.f$0, z, zArr, j, alertDialog, (TL_stories.TL_premium_boostsStatus) obj);
            }
        });
    }

    public static void $r8$lambda$X2NbyuGqY4iWnjzMLzHle7qaKxg(final ChatEditActivity chatEditActivity, final boolean z, boolean[] zArr, final long j, final AlertDialog alertDialog, final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        TLRPC.Chat chat = chatEditActivity.currentChat;
        int i = chat.level;
        int i2 = tL_premium_boostsStatus.level;
        if (i != i2) {
            chat.level = i2;
            chatEditActivity.getMessagesController().putChat(chatEditActivity.currentChat, false);
        }
        chatEditActivity.autoTranslationCell.getCheckBox().setIcon(tL_premium_boostsStatus.level < chatEditActivity.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
        if (z && tL_premium_boostsStatus.level < chatEditActivity.getMessagesController().channelAutotranslationLevelMin) {
            chatEditActivity.autoTranslationCell.setChecked(false);
            zArr[0] = false;
            chatEditActivity.getMessagesController().getBoostsController().userCanBoostChannel(j, tL_premium_boostsStatus, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ChatEditActivity.m1830$r8$lambda$Pbjc6fZgX9B3VtQqr_pSBMp3tU(this.f$0, alertDialog, tL_premium_boostsStatus, j, (ChannelBoostsController.CanApplyBoost) obj);
                }
            });
            return;
        }
        TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
        chatEditActivity.getMessagesController();
        tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(chatEditActivity.currentChat);
        tL_channels_toggleAutotranslation.enabled = z;
        chatEditActivity.autoTranslationCell.setChecked(z);
        zArr[0] = false;
        alertDialog.dismiss();
        chatEditActivity.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                ChatEditActivity.$r8$lambda$PbNrAKRbDrxjDdufSTwxcXqaZ1E(this.f$0, z, tLObject, tL_error);
            }
        }, 64);
    }

    public static void m1830$r8$lambda$Pbjc6fZgX9B3VtQqr_pSBMp3tU(final ChatEditActivity chatEditActivity, AlertDialog alertDialog, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        chatEditActivity.getClass();
        alertDialog.dismiss();
        if (chatEditActivity.getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(chatEditActivity, chatEditActivity.getContext(), 35, chatEditActivity.currentAccount, chatEditActivity.getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        final TLRPC.Chat chat = chatEditActivity.getMessagesController().getChat(Long.valueOf(-j));
        if (chat != null) {
            limitReachedBottomSheet.showStatisticButtonInLink(new Runnable() {
                @Override
                public final void run() {
                    ChatEditActivity.m1829$r8$lambda$PBc1njLPCiEz7WtrjFCIR_1dI(this.f$0, chat);
                }
            });
        }
        chatEditActivity.showDialog(limitReachedBottomSheet);
    }

    public static void m1829$r8$lambda$PBc1njLPCiEz7WtrjFCIR_1dI(ChatEditActivity chatEditActivity, TLRPC.Chat chat) {
        chatEditActivity.getClass();
        chatEditActivity.presentFragment(StatisticActivity.create(chat));
    }

    public static void $r8$lambda$PbNrAKRbDrxjDdufSTwxcXqaZ1E(final ChatEditActivity chatEditActivity, final boolean z, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
        chatEditActivity.getClass();
        if (tLObject instanceof TLRPC.Updates) {
            chatEditActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatEditActivity.$r8$lambda$aIsZq5vFdox2gV0fW3HeQYNudIk(this.f$0, z);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatEditActivity chatEditActivity2 = this.f$0;
                    chatEditActivity2.autoTranslationCell.setChecked(chatEditActivity2.currentChat.autotranslation);
                }
            });
        }
    }

    public static void $r8$lambda$aIsZq5vFdox2gV0fW3HeQYNudIk(ChatEditActivity chatEditActivity, boolean z) {
        chatEditActivity.currentChat.autotranslation = z;
        chatEditActivity.getMessagesController().putChat(chatEditActivity.currentChat, false);
    }

    public static void $r8$lambda$9cDpBZJQesT8KfBSOLxmKUH3u38(final ChatEditActivity chatEditActivity, Context context, View view) {
        chatEditActivity.getClass();
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
                radioButtonCellArr[i].setTextAndValue(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !chatEditActivity.historyHidden);
            } else if (ChatObject.isChannel(chatEditActivity.currentChat)) {
                radioButtonCellArr[i].setTextAndValue(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, chatEditActivity.historyHidden);
            } else {
                radioButtonCellArr[i].setTextAndValue(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, chatEditActivity.historyHidden);
            }
            linearLayout2.addView(radioButtonCellArr[i], LayoutHelper.createLinear(-1, -2));
            radioButtonCellArr[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatEditActivity.m1828$r8$lambda$MrerE0VrPCeysl2bCX22cSlT3E(this.f$0, radioButtonCellArr, builder, view2);
                }
            });
        }
        builder.setCustomView(linearLayout);
        chatEditActivity.showDialog(builder.create());
    }

    public static void m1828$r8$lambda$MrerE0VrPCeysl2bCX22cSlT3E(ChatEditActivity chatEditActivity, RadioButtonCell[] radioButtonCellArr, BottomSheet.Builder builder, View view) {
        chatEditActivity.getClass();
        Integer num = (Integer) view.getTag();
        radioButtonCellArr[0].setChecked(num.intValue() == 0, true);
        radioButtonCellArr[1].setChecked(num.intValue() == 1, true);
        chatEditActivity.historyHidden = num.intValue() == 1;
        builder.getDismissRunnable().run();
        chatEditActivity.updateFields(true, true);
    }

    public static void $r8$lambda$eAOEEylGIkCOauuOWxul_JtCL3I(ChatEditActivity chatEditActivity, View view) {
        GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity.currentChat.id);
        groupColorActivity.boostsStatus = chatEditActivity.boostsStatus;
        groupColorActivity.setOnApplied(chatEditActivity);
        chatEditActivity.presentFragment(groupColorActivity);
    }

    public static void m1821$r8$lambda$2Vfs_XhayBM19IHN0YFQ0vTr_U(final ChatEditActivity chatEditActivity, FrameLayout frameLayout, final View view) {
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        if (!chatEditActivity.canForum) {
            TLRPC.ChatFull chatFull = chatEditActivity.info;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden));
            } else {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", chatEditActivity.getMessagesController().forumUpgradeParticipantsMin, new Object[0]));
            }
            BulletinFactory.of(chatEditActivity).createSimpleBulletin(R.raw.topics, spannableStringBuilderReplaceTags).show();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        EnableTopicsActivity enableTopicsActivity = new EnableTopicsActivity(-chatEditActivity.chatId);
        enableTopicsActivity.setResourceProvider(chatEditActivity.resourceProvider);
        enableTopicsActivity.setOnForumChanged(chatEditActivity.forum, chatEditActivity.forumTabs, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ChatEditActivity.m1845$r8$lambda$xExt86mSzW30kS1DZH4k4COSU(this.f$0, view, (Boolean) obj, (Boolean) obj2);
            }
        });
        chatEditActivity.presentFragment(enableTopicsActivity);
    }

    public static void m1845$r8$lambda$xExt86mSzW30kS1DZH4k4COSU(final ChatEditActivity chatEditActivity, View view, Boolean bool, Boolean bool2) {
        chatEditActivity.getClass();
        chatEditActivity.forum = bool.booleanValue();
        chatEditActivity.forumTabs = bool2.booleanValue();
        chatEditActivity.avatarImage.animateToRoundRadius(AndroidUtilities.dp(chatEditActivity.forum ? 16.0f : 32.0f));
        ((TextCell) view).setChecked(chatEditActivity.forum);
        chatEditActivity.updateFields(false, true);
        if (chatEditActivity.donePressed) {
            return;
        }
        TLRPC.Chat chat = chatEditActivity.currentChat;
        if (chat.forum == chatEditActivity.forum && chat.forum_tabs == chatEditActivity.forumTabs) {
            return;
        }
        if (!ChatObject.isChannel(chat) && chatEditActivity.forum) {
            Context context = chatEditActivity.getContext();
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
            chatEditActivity.donePressed = true;
            alertDialog.showDelayed(250L);
            chatEditActivity.getMessagesController().convertToMegaGroup(chatEditActivity.getParentActivity(), chatEditActivity.chatId, chatEditActivity, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j) {
                    ChatEditActivity.$r8$lambda$hMI1hMB92lm1I0iElzEyPrJrgvY(this.f$0, alertDialog, j);
                }
            });
            return;
        }
        boolean z = chatEditActivity.currentChat.forum_tabs != chatEditActivity.forumTabs;
        chatEditActivity.getMessagesController().toggleChannelForum(chatEditActivity.chatId, chatEditActivity.forum, chatEditActivity.forumTabs);
        TLRPC.Chat chat2 = chatEditActivity.currentChat;
        chat2.forum = chatEditActivity.forum;
        chat2.forum_tabs = chatEditActivity.forumTabs;
        if (z) {
            chatEditActivity.updatePastFragmentsOnTabs();
        }
    }

    public static void $r8$lambda$hMI1hMB92lm1I0iElzEyPrJrgvY(ChatEditActivity chatEditActivity, AlertDialog alertDialog, long j) {
        chatEditActivity.getClass();
        alertDialog.dismiss();
        chatEditActivity.donePressed = false;
        if (j == 0) {
            return;
        }
        chatEditActivity.chatId = j;
        TLRPC.Chat chat = chatEditActivity.getMessagesController().getChat(Long.valueOf(j));
        chatEditActivity.currentChat = chat;
        TLRPC.ChatFull chatFull = chatEditActivity.info;
        if (chatFull != null) {
            chatFull.hidden_prehistory = true;
        }
        boolean z = chat.forum_tabs != chatEditActivity.forumTabs;
        chatEditActivity.getMessagesController().toggleChannelForum(chatEditActivity.chatId, chatEditActivity.forum, chatEditActivity.forumTabs);
        TLRPC.Chat chat2 = chatEditActivity.currentChat;
        chat2.forum = chatEditActivity.forum;
        chat2.forum_tabs = chatEditActivity.forumTabs;
        if (z) {
            chatEditActivity.updatePastFragmentsOnTabs();
        }
    }

    public static void $r8$lambda$kekhtLecH5j2AOzSiodRX2LEL9E(ChatEditActivity chatEditActivity, View view) {
        chatEditActivity.getClass();
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chatEditActivity.chatId);
        bundle.putInt("type", ((chatEditActivity.isChannel || chatEditActivity.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity.currentChat)) ? 0 : 3);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(chatEditActivity.info);
        chatEditActivity.presentFragment(chatUsersActivity);
    }

    public static void $r8$lambda$UPlXlZI_8xOcUChk7PCsCKV78qE(ChatEditActivity chatEditActivity, View view) {
        ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity.chatId, 0L, 0);
        TLRPC.ChatFull chatFull = chatEditActivity.info;
        manageLinksActivity.setInfo(chatFull, chatFull.exported_invite);
        chatEditActivity.presentFragment(manageLinksActivity);
    }

    public static void $r8$lambda$7oH9UOOLFGU8M03cWRxfxGir6Uw(ChatEditActivity chatEditActivity, View view) {
        if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity.currentChat)) {
            chatEditActivity.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity.chatId, chatEditActivity.info));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chatEditActivity.chatId);
        ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle);
        chatReactionsEditActivity.setInfo(chatEditActivity.info);
        chatEditActivity.presentFragment(chatReactionsEditActivity);
    }

    public static void $r8$lambda$UL0j5M5F8S_9EFiKENk7S999rAo(ChatEditActivity chatEditActivity, View view) {
        chatEditActivity.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 9);
        bundle.putLong("chat_id", chatEditActivity.chatId);
        bundle.putLong("welcome_messages_chat_id", chatEditActivity.chatId);
        chatEditActivity.presentFragment(new ChatActivity(bundle));
    }

    public static void $r8$lambda$56rva0schmvExkbaVXbHHrXgduo(ChatEditActivity chatEditActivity, View view) {
        chatEditActivity.getClass();
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chatEditActivity.chatId);
        bundle.putInt("type", 1);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(chatEditActivity.info);
        chatEditActivity.presentFragment(chatUsersActivity);
    }

    public static void $r8$lambda$MMngHuMo2SnktU3N454YjxNv2d8(ChatEditActivity chatEditActivity, View view) {
        chatEditActivity.getClass();
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chatEditActivity.chatId);
        bundle.putInt("type", 2);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(chatEditActivity.info);
        chatEditActivity.presentFragment(chatUsersActivity);
    }

    public static void $r8$lambda$wOE1KUnWP75eHcjBxOQfXpkXVHU(ChatEditActivity chatEditActivity, View view) {
        chatEditActivity.getClass();
        chatEditActivity.presentFragment(new ChannelAdminLogActivity(chatEditActivity.currentChat));
    }

    public static void m1841$r8$lambda$pvTy6EaEUeauJh8ul_IGb6kc(ChatEditActivity chatEditActivity, View view) {
        chatEditActivity.getClass();
        Bundle bundle = new Bundle();
        bundle.putLong("bot_id", chatEditActivity.userId);
        chatEditActivity.presentFragment(new ChangeUsernameActivity(bundle));
    }

    public static void $r8$lambda$XPqQLfEUQ27BSpyymaC9l2oWmTw(ChatEditActivity chatEditActivity, View view) {
        chatEditActivity.getClass();
        Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + chatEditActivity.getActiveUsername(chatEditActivity.currentUser) + "-intro");
    }

    public static void m1826$r8$lambda$CNCyxXbpqNMXoNSNjGq1Vs33HE(ChatEditActivity chatEditActivity, View view) {
        chatEditActivity.getClass();
        Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + chatEditActivity.getActiveUsername(chatEditActivity.currentUser) + "-commands");
    }

    public static void m1833$r8$lambda$TgpJsT_JtB0OqSRKRv7EU946M(ChatEditActivity chatEditActivity, View view) {
        chatEditActivity.getClass();
        Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + chatEditActivity.getActiveUsername(chatEditActivity.currentUser));
    }

    public static void $r8$lambda$NJPLl0WjkS_b1FtSYnztmQNeH9w(ChatEditActivity chatEditActivity, BotStarsController botStarsController, View view) {
        if (botStarsController.isStarsBalanceAvailable(chatEditActivity.userId)) {
            chatEditActivity.presentFragment(new BotStarsActivity(1, chatEditActivity.userId));
        }
    }

    public static void m1847$r8$lambda$zQKxp_BCblddrPxOaBKe0ai8GI(ChatEditActivity chatEditActivity, BotStarsController botStarsController, View view) {
        if (botStarsController.isStarsBalanceAvailable(chatEditActivity.userId)) {
            chatEditActivity.presentFragment(new BotStarsActivity(0, chatEditActivity.userId));
        }
    }

    public static void $r8$lambda$KbwfbyCjFRPb1HviZiJODgbJ8E8(ChatEditActivity chatEditActivity, long j, View view) {
        if (ChatObject.hasAdminRights(chatEditActivity.getMessagesController().getChat(Long.valueOf(j)))) {
            Bundle bundle = new Bundle();
            bundle.putLong("community_id", j);
            chatEditActivity.presentFragment(new CommunityEditActivity(bundle));
            return;
        }
        chatEditActivity.showDialog(new CommunitySheet(chatEditActivity, j));
    }

    public static void m1836$r8$lambda$YJE_zkAEL7dqptnkKMXINCb3zk(final ChatEditActivity chatEditActivity, boolean z, final long j, final long j2, View view) {
        int i;
        chatEditActivity.getClass();
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z) {
            i = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else if (chatEditActivity.isChannel) {
            i = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
        } else {
            i = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        AlertsCreator.showSimpleConfirmAlert(chatEditActivity, string, LocaleController.getString(i), LocaleController.getString(R.string.Remove), true, new Runnable() {
            @Override
            public final void run() {
                ChatEditActivity chatEditActivity2 = this.f$0;
                MessagesController.getInstance(chatEditActivity2.currentAccount).unlinkCommunity(j, j2, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        ChatEditActivity.$r8$lambda$0teWHSFF6by2f6hVDju8AwTkhg8(chatEditActivity2, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                    }
                });
            }
        });
    }

    public static void $r8$lambda$0teWHSFF6by2f6hVDju8AwTkhg8(ChatEditActivity chatEditActivity, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            chatEditActivity.getClass();
            BulletinFactory.of(chatEditActivity).showForError(tL_error);
        }
        AndroidUtilities.removeFromParent(chatEditActivity.communityGapView);
        AndroidUtilities.removeFromParent(chatEditActivity.communityLinkView);
        AndroidUtilities.removeFromParent(chatEditActivity.communityUnlinkCell);
    }

    public static void m1844$r8$lambda$w58xf7GYLW4T8jw4UiDeOjpmaU(ChatEditActivity chatEditActivity, long j, View view) {
        chatEditActivity.getClass();
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j);
        chatEditActivity.presentFragment(new CommunityCreateActivity(bundle));
    }

    public static void m1842$r8$lambda$qyIb0v9vX1LUIfiJBLH5qXjAQ(ChatEditActivity chatEditActivity, boolean z) {
        chatEditActivity.getClass();
        if (AndroidUtilities.isTablet()) {
            chatEditActivity.getNotificationCenter().postNotificationName(NotificationCenter.closeChats, Long.valueOf(-chatEditActivity.chatId));
        } else {
            chatEditActivity.getNotificationCenter().postNotificationName(NotificationCenter.closeChats, new Object[0]);
        }
        chatEditActivity.finishFragment();
        chatEditActivity.getNotificationCenter().postNotificationName(NotificationCenter.needDeleteDialog, Long.valueOf(-chatEditActivity.currentChat.id), null, chatEditActivity.currentChat, Boolean.valueOf(z));
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
            ArrayList<TLRPC.TL_username> arrayList = this.currentUser.usernames;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                TLRPC.TL_username tL_username = arrayList.get(i);
                i++;
                if (tL_username.active) {
                    i2++;
                }
            }
            this.publicLinkCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotPublicLinks), (CharSequence) LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i2), Integer.valueOf(this.currentUser.usernames.size())), R.drawable.msg_link2, true);
            return;
        }
        this.publicLinkCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotPublicLink), (CharSequence) ("t.me/" + this.currentUser.username), R.drawable.msg_link2, true);
    }

    public void openSetPhotoAlert() {
        this.imageUpdater.openMenu(this.avatar != null, new Runnable() {
            @Override
            public final void run() {
                ChatEditActivity.m1824$r8$lambda$7BHwzHs66HbKvJ9Tk74Awf7ups(this.f$0);
            }
        }, new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                ChatEditActivity.$r8$lambda$KzHfhEs4Zi1VZ450sM7vINvgzF4(this.f$0, dialogInterface);
            }
        }, 0);
        this.cameraDrawable.setCurrentFrame(0);
        this.cameraDrawable.setCustomEndFrame(43);
        this.setAvatarCell.imageView.playAnimation();
    }

    public static void m1824$r8$lambda$7BHwzHs66HbKvJ9Tk74Awf7ups(final ChatEditActivity chatEditActivity) {
        chatEditActivity.avatar = null;
        if (chatEditActivity.userId == 0) {
            MessagesController.getInstance(chatEditActivity.currentAccount).changeChatAvatar(chatEditActivity.chatId, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = chatEditActivity.getMessagesController().getInputUser(chatEditActivity.userId);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            chatEditActivity.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChatEditActivity.$r8$lambda$wwj09HiEOBOc9Xx6GwhKzolhj8Q(this.f$0, tLObject, tL_error);
                }
            });
        }
        chatEditActivity.showAvatarProgress(false, true);
        BackupImageView backupImageView = chatEditActivity.avatarImage;
        AvatarDrawable avatarDrawable = chatEditActivity.avatarDrawable;
        Object obj = chatEditActivity.currentUser;
        if (obj == null) {
            obj = chatEditActivity.currentChat;
        }
        backupImageView.setImage((ImageLocation) null, (String) null, avatarDrawable, obj);
        chatEditActivity.cameraDrawable.setCurrentFrame(0);
        chatEditActivity.setAvatarCell.imageView.playAnimation();
    }

    public static void $r8$lambda$wwj09HiEOBOc9Xx6GwhKzolhj8Q(final ChatEditActivity chatEditActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        chatEditActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditActivity.$r8$lambda$EkcyD6bGmmdh2Z0OUVew7k5Npf4(this.f$0);
            }
        });
    }

    public static void $r8$lambda$EkcyD6bGmmdh2Z0OUVew7k5Npf4(ChatEditActivity chatEditActivity) {
        chatEditActivity.avatarImage.setImageDrawable(chatEditActivity.avatarDrawable);
        chatEditActivity.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), R.drawable.msg_addphoto, true);
        TLRPC.User user = chatEditActivity.currentUser;
        if (user != null) {
            user.photo = null;
            chatEditActivity.getMessagesController().putUser(chatEditActivity.currentUser, true);
        }
        chatEditActivity.hasUploadedPhoto = true;
        if (chatEditActivity.cameraDrawable == null) {
            int i = R.raw.camera_outline;
            chatEditActivity.cameraDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
        }
        chatEditActivity.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
        chatEditActivity.setAvatarCell.imageView.setAnimation(chatEditActivity.cameraDrawable);
    }

    public static void $r8$lambda$KzHfhEs4Zi1VZ450sM7vINvgzF4(ChatEditActivity chatEditActivity, DialogInterface dialogInterface) {
        if (!chatEditActivity.imageUpdater.isUploadingImage()) {
            chatEditActivity.cameraDrawable.setCustomEndFrame(86);
            chatEditActivity.setAvatarCell.imageView.playAnimation();
        } else {
            chatEditActivity.cameraDrawable.setCurrentFrame(0, false);
        }
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
                dialogsActivity.rightSlidingDialogContainer.finishPreview();
            }
            i++;
        }
    }

    private String getActiveUsername(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_username tL_username = arrayList.get(i);
            i++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    private void setAvatar() {
        boolean z;
        if (this.avatarImage == null || this.hasUploadedPhoto) {
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        TLRPC.User user = this.userId == 0 ? null : getMessagesController().getUser(Long.valueOf(this.userId));
        if (chat == null && user == null) {
            return;
        }
        this.currentUser = user;
        this.currentChat = chat;
        if (user == null ? chat.photo != null : user.photo != null) {
            TLRPC.User user2 = user != null ? user : chat;
            this.avatar = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, user2, 1);
            this.avatarImage.setForUserOrChat(user2, this.avatarDrawable);
            z = forUserOrChat != null;
            if (this.setAvatarCell != null) {
                if (!z || this.imageUpdater.isUploadingImage()) {
                    this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), R.drawable.msg_addphoto, true);
                } else {
                    this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), R.drawable.msg_addphoto, true);
                }
                if (this.cameraDrawable == null) {
                    int i = R.raw.camera_outline;
                    this.cameraDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
                this.setAvatarCell.imageView.setAnimation(this.cameraDrawable);
            }
            if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
                PhotoViewer.getInstance().checkCurrentImageVisibility();
            }
            if (this.channelAffiliateProgramsCell == null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.currentChat)) {
                this.channelAffiliateProgramsCell.setVisibility(0);
                return;
            }
            return;
        }
        this.avatarImage.setImageDrawable(this.avatarDrawable);
        if (this.setAvatarCell != null) {
            if (!z) {
                this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), R.drawable.msg_addphoto, true);
            } else {
                this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), R.drawable.msg_addphoto, true);
            }
            if (this.cameraDrawable == null) {
                int i2 = R.raw.camera_outline;
                this.cameraDrawable = new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            }
            this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.setAvatarCell.imageView.setAnimation(this.cameraDrawable);
        }
        if (PhotoViewer.hasInstance()) {
            PhotoViewer.getInstance().checkCurrentImageVisibility();
        }
        if (this.channelAffiliateProgramsCell == null) {
        }
    }

    private void updateCanForum() {
        TLRPC.ChatFull chatFull;
        boolean z;
        if (this.userId != 0) {
            this.canForum = false;
            return;
        }
        if (this.forum) {
            chatFull = this.info;
            if (chatFull != null || chatFull.linked_chat_id == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            TLRPC.ChatFull chatFull2 = this.info;
            if (Math.max(chatFull2 == null ? 0 : chatFull2.participants_count, this.currentChat.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) {
                chatFull = this.info;
                if (chatFull != null) {
                }
                z = true;
            } else {
                z = false;
            }
        }
        this.canForum = z;
        TextCell textCell = this.forumsCell;
        if (textCell != null) {
            textCell.getCheckBox().setIcon(this.canForum ? 0 : R.drawable.permission_locked);
        }
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
                checkWelcomeMessagesValue();
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
                    ((Long) objArr[0]).getClass();
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
                ChatEditActivity.m1822$r8$lambda$3tGh3dYE0BcOdG7KZZkCPyV3b8(this.f$0, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str);
            }
        });
    }

    public static void m1822$r8$lambda$3tGh3dYE0BcOdG7KZZkCPyV3b8(final ChatEditActivity chatEditActivity, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        chatEditActivity.getClass();
        TLRPC.FileLocation fileLocation = photoSize.location;
        chatEditActivity.avatar = fileLocation;
        if (inputFile != null || inputFile2 != null || videoSize != null) {
            long j = 0;
            if (chatEditActivity.userId != 0) {
                TLRPC.User user = chatEditActivity.currentUser;
                if (user != null) {
                    user.photo = new TLRPC.TL_userProfilePhoto();
                    TLRPC.UserProfilePhoto userProfilePhoto = chatEditActivity.currentUser.photo;
                    if (inputFile != null) {
                        j = inputFile.id;
                    } else if (inputFile2 != null) {
                        j = inputFile2.id;
                    }
                    userProfilePhoto.photo_id = j;
                    userProfilePhoto.photo_big = photoSize2.location;
                    userProfilePhoto.photo_small = photoSize.location;
                    chatEditActivity.getMessagesController().putUser(chatEditActivity.currentUser, true);
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
                tL_photos_uploadProfilePhoto.bot = chatEditActivity.getMessagesController().getInputUser(chatEditActivity.currentUser);
                tL_photos_uploadProfilePhoto.flags |= 32;
                chatEditActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ChatEditActivity.$r8$lambda$ir7lBAGhqFlpWNhWbuuqQyIZFD8(this.f$0, tLObject, tL_error);
                    }
                });
            } else {
                chatEditActivity.getMessagesController().changeChatAvatar(chatEditActivity.chatId, null, inputFile, inputFile2, videoSize, d, str, photoSize.location, photoSize2.location, null);
            }
            if (chatEditActivity.createAfterUpload) {
                try {
                    AlertDialog alertDialog = chatEditActivity.progressDialog;
                    if (alertDialog != null && alertDialog.isShowing()) {
                        chatEditActivity.progressDialog.dismiss();
                        chatEditActivity.progressDialog = null;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                chatEditActivity.donePressed = false;
                chatEditActivity.doneButton.performClick();
            }
            chatEditActivity.showAvatarProgress(false, true);
            return;
        }
        BackupImageView backupImageView = chatEditActivity.avatarImage;
        ImageLocation forLocal = ImageLocation.getForLocal(fileLocation);
        AvatarDrawable avatarDrawable = chatEditActivity.avatarDrawable;
        Object obj = chatEditActivity.currentUser;
        if (obj == null) {
            obj = chatEditActivity.currentChat;
        }
        backupImageView.setImage(forLocal, "50_50", avatarDrawable, obj);
        chatEditActivity.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), R.drawable.msg_addphoto, true);
        if (chatEditActivity.cameraDrawable == null) {
            int i2 = R.raw.camera_outline;
            chatEditActivity.cameraDrawable = new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
        }
        chatEditActivity.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
        chatEditActivity.setAvatarCell.imageView.setAnimation(chatEditActivity.cameraDrawable);
        chatEditActivity.showAvatarProgress(true, false);
    }

    public static void $r8$lambda$ir7lBAGhqFlpWNhWbuuqQyIZFD8(final ChatEditActivity chatEditActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        chatEditActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditActivity.$r8$lambda$n4_tvUb8eV5AVgksOV5O7UdltH8(this.f$0);
            }
        });
    }

    public static void $r8$lambda$n4_tvUb8eV5AVgksOV5O7UdltH8(ChatEditActivity chatEditActivity) {
        chatEditActivity.hasUploadedPhoto = true;
        NotificationCenter.getInstance(chatEditActivity.currentAccount).postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
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
                showDialog(new AlertDialog.Builder(getParentActivity()).setTitle(LocaleController.getString(R.string.UserRestrictionsApplyChanges)).setMessage(LocaleController.getString(R.string.BotSettingsChangedAlert)).setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        this.f$0.processDone();
                    }
                }).setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        this.f$0.finishFragment();
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
                    this.f$0.processDone();
                }
            });
            builder.setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.finishFragment();
                }
            });
            showDialog(builder.create());
        }
        return false;
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
                    ChatEditActivity.m1819$r8$lambda$ksSMT1jupWPEPaqa6w5F_shOo(this.f$0, setbotinfo, tLObject, tL_error);
                }
            });
            this.progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ChatEditActivity.m1838$r8$lambda$jFzXME9DSmt63gLnKJOhqLRTag(this.f$0, iSendRequest, dialogInterface);
                }
            });
            this.progressDialog.show();
            return;
        }
        if (!ChatObject.isChannel(this.currentChat) && (!this.historyHidden || this.forum)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j) {
                    ChatEditActivity.m1823$r8$lambda$6Zf6YbAnhBwXX_6SERo86iXe7s(this.f$0, j);
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
                    ChatEditActivity.$r8$lambda$AJGyxGoYa38yMzug9to9EV5vPMI(this.f$0, dialogInterface);
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

    public static void m1819$r8$lambda$ksSMT1jupWPEPaqa6w5F_shOo(final ChatEditActivity chatEditActivity, TL_bots.setBotInfo setbotinfo, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.UserFull userFull = chatEditActivity.userInfo;
        if (userFull != null) {
            userFull.about = setbotinfo.about;
            chatEditActivity.getMessagesStorage().updateUserInfo(chatEditActivity.userInfo, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatEditActivity.$r8$lambda$eyQLFObpLHIJzViFtwIJxrTesHU(this.f$0);
            }
        });
    }

    public static void $r8$lambda$eyQLFObpLHIJzViFtwIJxrTesHU(ChatEditActivity chatEditActivity) {
        chatEditActivity.progressDialog.dismiss();
        chatEditActivity.finishFragment();
    }

    public static void m1838$r8$lambda$jFzXME9DSmt63gLnKJOhqLRTag(ChatEditActivity chatEditActivity, int i, DialogInterface dialogInterface) {
        chatEditActivity.donePressed = false;
        chatEditActivity.progressDialog = null;
        chatEditActivity.getConnectionsManager().cancelRequest(i, true);
    }

    public static void m1823$r8$lambda$6Zf6YbAnhBwXX_6SERo86iXe7s(ChatEditActivity chatEditActivity, long j) {
        if (j == 0) {
            chatEditActivity.donePressed = false;
            return;
        }
        chatEditActivity.chatId = j;
        chatEditActivity.currentChat = chatEditActivity.getMessagesController().getChat(Long.valueOf(j));
        chatEditActivity.donePressed = false;
        TLRPC.ChatFull chatFull = chatEditActivity.info;
        if (chatFull != null) {
            chatFull.hidden_prehistory = true;
        }
        chatEditActivity.processDone();
    }

    public static void $r8$lambda$AJGyxGoYa38yMzug9to9EV5vPMI(ChatEditActivity chatEditActivity, DialogInterface dialogInterface) {
        chatEditActivity.createAfterUpload = false;
        chatEditActivity.progressDialog = null;
        chatEditActivity.donePressed = false;
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
                    TextCell textCell2 = this.botAffiliateProgramCell;
                    TL_payments.starRefProgram starrefprogram = userFull2.starref_program;
                    textCell2.setValue(starrefprogram == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f)), false);
                }
            }
            TextCell textCell3 = this.verifyCell;
            if (textCell3 != null) {
                TLRPC.UserFull userFull3 = this.userInfo;
                textCell3.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
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
        checkWelcomeMessagesValue();
    }

    private void updateFields(boolean z, boolean z2) {
        int i;
        int sendMediaSelectedCount;
        int i2;
        String str;
        TLRPC.ChatFull chatFull;
        int i3;
        String str2;
        String string;
        TextCell textCell;
        TextCell textCell2;
        TextCell textCell3;
        TextCell textCell4;
        int i4;
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
                            int i5 = R.drawable.msg_channel;
                            TextCell textCell13 = this.forumsCell;
                            textCell12.setTextAndValueAndIcon(string3, str4, i5, textCell13 != null && textCell13.getVisibility() == 0);
                        } else {
                            TextCell textCell14 = this.linkedCell;
                            String string4 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str5 = "@" + publicUsername2;
                            int i6 = R.drawable.msg_channel;
                            TextCell textCell15 = this.forumsCell;
                            textCell14.setTextAndValueAndIcon(string4, str5, i6, textCell15 != null && textCell15.getVisibility() == 0);
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
                int i7 = R.drawable.msg_channel;
                TextCell textCell18 = this.historyCell;
                textCell17.setTextAndValueAndIcon(string5, string2, i7, (textCell18 != null && textCell18.getVisibility() == 0) || ((textCell5 = this.linkedCell) != null && textCell5.getVisibility() == 0) || ((textCell6 = this.forumsCell) != null && textCell6.getVisibility() == 0));
            } else {
                boolean z3 = this.currentChat.noforwards;
                if (this.isChannel) {
                    if (zIsPublic) {
                        i4 = R.string.TypePublic;
                        str3 = "TypePublic";
                    } else if (z3) {
                        i4 = R.string.TypePrivateRestrictedForwards;
                        str3 = "TypePrivateRestrictedForwards";
                    } else {
                        i4 = R.string.TypePrivate;
                        str3 = "TypePrivate";
                    }
                    string = LocaleController.getString(str3, i4);
                } else {
                    if (zIsPublic) {
                        i3 = R.string.TypePublicGroup;
                        str2 = "TypePublicGroup";
                    } else if (z3) {
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
                    String string6 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i8 = R.drawable.msg_channel;
                    TextCell textCell20 = this.historyCell;
                    textCell19.setTextAndValueAndIcon(string6, string, i8, (textCell20 != null && textCell20.getVisibility() == 0) || ((textCell3 = this.linkedCell) != null && textCell3.getVisibility() == 0) || ((textCell4 = this.forumsCell) != null && textCell4.getVisibility() == 0));
                } else {
                    TextCell textCell21 = this.typeCell;
                    String string7 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i9 = R.drawable.msg_groups;
                    TextCell textCell22 = this.historyCell;
                    textCell21.setTextAndValueAndIcon(string7, string, i9, (textCell22 != null && textCell22.getVisibility() == 0) || ((textCell = this.linkedCell) != null && textCell.getVisibility() == 0) || ((textCell2 = this.forumsCell) != null && textCell2.getVisibility() == 0));
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
            updateHistoryShow((this.forum || zIsPublic || ((chatFull = this.info) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true, z2);
        }
        if (this.membersCell != null) {
            if (this.info != null) {
                TextCell textCell23 = this.memberRequestsCell;
                if (textCell23 != null) {
                    if (textCell23.getParent() == null) {
                        this.infoContainer.addView(this.memberRequestsCell, this.infoContainer.indexOfChild(this.membersCell) + 1, LayoutHelper.createLinear(-1, -2));
                    }
                    this.memberRequestsCell.setVisibility(this.info.requests_pending > 0 ? 0 : 8);
                }
                if (this.isChannel && !ChatObject.isCommunity(this.currentChat)) {
                    this.membersCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), (CharSequence) String.format("%d", Integer.valueOf(this.info.participants_count)), R.drawable.msg_groups, true);
                    TextCell textCell24 = this.blockCell;
                    String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull5 = this.info;
                    String str6 = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                    int i10 = R.drawable.msg_user_remove;
                    TextCell textCell25 = this.logCell;
                    textCell24.setTextAndValueAndIcon(string8, str6, i10, textCell25 != null && textCell25.getVisibility() == 0);
                } else {
                    if (ChatObject.isChannel(this.currentChat)) {
                        this.membersCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("ChannelMembers", R.string.ChannelMembers), (CharSequence) String.format("%d", Integer.valueOf(this.info.participants_count)), R.drawable.msg_groups, true);
                    } else {
                        this.membersCell.setTextAndValueAndIcon(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.info.participants.participants.size())), R.drawable.msg_groups, this.memberRequestsCell.getVisibility() == 0);
                    }
                    TLRPC.Chat chat3 = this.currentChat;
                    if (chat3.gigagroup && !ChatObject.isCommunity(chat3)) {
                        TextCell textCell26 = this.blockCell;
                        String string9 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull6 = this.info;
                        String str7 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                        int i11 = R.drawable.msg_user_remove;
                        TextCell textCell27 = this.logCell;
                        textCell26.setTextAndValueAndIcon(string9, str7, i11, textCell27 != null && textCell27.getVisibility() == 0);
                    } else {
                        int i12 = this.forum ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.currentChat.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i13 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i13++;
                            }
                            sendMediaSelectedCount = i13 + ChatUsersActivity.getSendMediaSelectedCount(tL_chatBannedRights);
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
                            i = i12;
                        } else {
                            i = i12;
                            sendMediaSelectedCount = i;
                        }
                        this.blockCell.setTextAndValueAndIcon(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(sendMediaSelectedCount), Integer.valueOf(i)), z2, R.drawable.msg_permissions, true);
                    }
                    TextCell textCell28 = this.memberRequestsCell;
                    if (textCell28 != null) {
                        String string10 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String str8 = String.format("%d", Integer.valueOf(this.info.requests_pending));
                        int i14 = R.drawable.msg_requests;
                        TextCell textCell29 = this.logCell;
                        textCell28.setTextAndValueAndIcon(string10, str8, i14, textCell29 != null && textCell29.getVisibility() == 0);
                    }
                }
                this.adminCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), (CharSequence) String.format("%d", Integer.valueOf(ChatObject.isChannel(this.currentChat) ? this.info.admins_count : getAdminCount())), R.drawable.msg_admins, true);
            } else {
                if (this.isChannel && !ChatObject.isCommunity(this.currentChat)) {
                    this.membersCell.setTextAndIcon((CharSequence) LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), R.drawable.msg_groups, true);
                    TextCell textCell30 = this.blockCell;
                    String string11 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i15 = R.drawable.msg_chats_remove;
                    TextCell textCell31 = this.logCell;
                    textCell30.setTextAndIcon(string11, i15, textCell31 != null && textCell31.getVisibility() == 0);
                } else {
                    TextCell textCell32 = this.membersCell;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i16 = R.drawable.msg_groups;
                    TextCell textCell33 = this.logCell;
                    textCell32.setTextAndIcon(string12, i16, textCell33 != null && textCell33.getVisibility() == 0);
                    if (this.currentChat.gigagroup) {
                        TextCell textCell34 = this.blockCell;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i17 = R.drawable.msg_chats_remove;
                        TextCell textCell35 = this.logCell;
                        textCell34.setTextAndIcon(string13, i17, textCell35 != null && textCell35.getVisibility() == 0);
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
        boolean z2;
        TLRPC.Chat chat = this.currentChat;
        if (chat == null || this.suggestedCell == null) {
            return;
        }
        long jLongValue = 0;
        if (l != null) {
            z2 = l.longValue() >= 0;
        } else {
            z2 = chat.broadcast_messages_allowed;
        }
        if (z2) {
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.currentChat.linked_monoforum_id));
            if (l != null) {
                jLongValue = l.longValue();
            } else if (chat2 != null) {
                jLongValue = chat2.send_paid_messages_stars;
            }
            this.suggestedCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.PostSuggestions), (CharSequence) StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(jLongValue)), 0.66f), R.drawable.msg_markunread, true);
            return;
        }
        this.suggestedCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.PostSuggestions), (CharSequence) LocaleController.getString(R.string.PostSuggestionsOff), R.drawable.msg_markunread, true);
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
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.historyCell.getAlpha(), z ? 1.0f : 0.0f);
            this.updateHistoryShowAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ChatEditActivity.$r8$lambda$PZFRAOQ5Vo798Qg4j_9r8rPqjyI(this.f$0, arrayList, valueAnimator2);
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

    public static void $r8$lambda$PZFRAOQ5Vo798Qg4j_9r8rPqjyI(ChatEditActivity chatEditActivity, ArrayList arrayList, ValueAnimator valueAnimator) {
        chatEditActivity.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatEditActivity.historyCell.setAlpha(fFloatValue);
        TextCell textCell = chatEditActivity.historyCell;
        float f = 1.0f - fFloatValue;
        textCell.setTranslationY(((-textCell.getHeight()) / 2.0f) * f);
        chatEditActivity.historyCell.setScaleY((fFloatValue * 0.8f) + 0.2f);
        for (int i = 0; i < arrayList.size(); i++) {
            ((View) arrayList.get(i)).setTranslationY((-chatEditActivity.historyCell.getHeight()) * f);
        }
    }

    private void updateReactionsCell(boolean z) {
        String string;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.chatId);
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.currentChat);
        TLRPC.ChatReactions chatReactions = this.availableReactions;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            string = LocaleController.getString(R.string.ReactionsOff);
            if (chatFull != null && chatFull.paid_reactions_available) {
                string = "1";
            }
        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            int i = 0;
            for (int i2 = 0; i2 < tL_chatReactionsSome.reactions.size(); i2++) {
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i2);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                    if (tL_availableReaction != null && !tL_availableReaction.inactive) {
                        i++;
                    }
                } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                    i++;
                }
            }
            if (zIsChannelAndNotMegaGroup) {
                if (chatFull != null && chatFull.paid_reactions_available) {
                    i++;
                }
                string = i == 0 ? LocaleController.getString(R.string.ReactionsOff) : String.valueOf(i);
            } else {
                int iMin = Math.min(getMediaDataController().getEnabledReactionsList().size(), i);
                string = iMin == 0 ? LocaleController.getString(R.string.ReactionsOff) : LocaleController.formatString(R.string.ReactionsCount, Integer.valueOf(iMin), Integer.valueOf(getMediaDataController().getEnabledReactionsList().size()));
            }
        } else {
            string = LocaleController.getString(R.string.ReactionsAll);
        }
        this.reactionsCell.setTextAndValueAndIcon(LocaleController.getString(R.string.Reactions), string, z, R.drawable.msg_reactions2, true);
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ChatEditActivity.$r8$lambda$WrmaA_dCp8YwooHaZ1G0n53Ckyw(this.f$0);
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

    public static void $r8$lambda$WrmaA_dCp8YwooHaZ1G0n53Ckyw(ChatEditActivity chatEditActivity) {
        BackupImageView backupImageView = chatEditActivity.avatarImage;
        if (backupImageView != null) {
            backupImageView.invalidate();
        }
    }

    private void checkWelcomeMessagesValue() {
        if (this.welcomeMessagesCell == null) {
            return;
        }
        String firstWelcomeMessageText = getMessagesController().getFirstWelcomeMessageText(-this.chatId);
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull != null && !chatFull.has_welcome_messages && firstWelcomeMessageText == null) {
            firstWelcomeMessageText = LocaleController.getString(R.string.WelcomeMessageOff);
        }
        this.welcomeMessagesCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.WelcomeMessage), (CharSequence) firstWelcomeMessageText, R.drawable.menu_welcome_messages, true);
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
