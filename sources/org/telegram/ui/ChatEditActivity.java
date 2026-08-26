package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.FBool;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.community.CommunityCreateActivity;
import org.telegram.ui.community.CommunityEditActivity;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.cells.CommunityLinkView2;

public class ChatEditActivity extends BaseFragment implements ImageUpdater.ImageUpdaterDelegate, NotificationCenter.NotificationCenterDelegate {
    public TextCell adminCell;
    public TextCell autoTranslationCell;
    public TLRPC.ChatReactions availableReactions;
    public TLRPC.FileLocation avatar;
    public AnimatorSet avatarAnimation;
    public LinearLayout avatarContainer;
    public final AvatarDrawable avatarDrawable;
    public UserCell.AnonymousClass2 avatarImage;
    public ChatActivity.AnonymousClass27 avatarOverlay;
    public RadialProgressView avatarProgressView;
    public LinearLayout balanceContainer;
    public TextCell blockCell;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    public TextCell botAffiliateProgramCell;
    public TextInfoPrivacyCell botInfoCell;
    public RLottieDrawable cameraDrawable;
    public boolean canForum;
    public TextCell changeBotSettingsCell;
    public TextCell channelAffiliateProgramsCell;
    public TLRPC.TL_chatAdminRights chatAdminRights;
    public TLRPC.TL_chatBannedRights chatBannedRights;
    public TLRPC.TL_chatBannedRights chatDefaultBannedRights;
    public long chatId;
    public PeerColorActivity.ChangeNameColorCell colorCell;
    public TextCell communityCell;
    public TextInfoPrivacyCell communityGapView;
    public TextInfoPrivacyCell communityInfoCell;
    public CommunityLinkView2 communityLinkView;
    public TextCell communityUnlinkCell;
    public boolean createAfterUpload;
    public TLRPC.Chat currentChat;
    public TLRPC.User currentUser;
    public TextSettingsCell deleteCell;
    public FrameLayout deleteContainer;
    public ShadowSectionCell deleteInfoCell;
    public EditTextBoldCursor descriptionTextView;
    public ActionBarMenuItem doneButton;
    public boolean donePressed;
    public TextCell editCommandsCell;
    public TextCell editIntroCell;
    public boolean forum;
    public boolean forumTabs;
    public TextCell forumsCell;
    public boolean hasUploadedPhoto;
    public TextCell historyCell;
    public boolean historyHidden;
    public final ImageUpdater imageUpdater;
    public TLRPC.ChatFull info;
    public LinearLayout infoContainer;
    public TextCell inviteLinksCell;
    public boolean isChannel;
    public GLIconSettingsView linearLayout;
    public TextCell linkedCell;
    public TextCell locationCell;
    public TextCell logCell;
    public TextCell memberRequestsCell;
    public TextCell membersCell;
    public EditTextEmoji nameTextView;
    public final ArrayList preloadedReactions;
    public AlertDialog progressDialog;
    public final AnonymousClass1 provider;
    public TextCell publicLinkCell;
    public TextCell reactionsCell;
    public SectionsScrollView scrollView;
    public AnonymousClass7 setAvatarCell;
    public LinearLayout settingsContainer;
    public TextInfoPrivacyCell settingsSectionCell;
    public ShadowSectionCell settingsTopSectionCell;
    public TextCell starsBalanceCell;
    public TextCell statsAndBoosts;
    public TextCell suggestedCell;
    public TextCell tonBalanceCell;
    public TextCell typeCell;
    public LinearLayout typeEditContainer;
    public UndoView undoView;
    public ValueAnimator updateHistoryShowAnimator;
    public final long userId;
    public TLRPC.UserFull userInfo;
    public TextCell verifyCell;
    public TextInfoPrivacyCell verifyInfoCell;
    public TextCell welcomeMessagesCell;

    public final class AnonymousClass1 extends PhotoViewer.EmptyPhotoViewerProvider {
        public AnonymousClass1() {
        }

        @Override
        public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
            TLRPC.ChatPhoto chatPhoto;
            TLRPC.FileLocation fileLocation2;
            TLRPC.UserProfilePhoto userProfilePhoto;
            if (fileLocation != null) {
                ChatEditActivity chatEditActivity = ChatEditActivity.this;
                TLRPC.User user = chatEditActivity.currentUser;
                long j = chatEditActivity.userId;
                if (user != null) {
                    TLRPC.User user2 = j == 0 ? null : chatEditActivity.getMessagesController().getUser(Long.valueOf(j));
                    if (user2 == null || (userProfilePhoto = user2.photo) == null || (fileLocation2 = userProfilePhoto.photo_big) == null) {
                        fileLocation2 = null;
                    }
                } else {
                    TLRPC.Chat chat = chatEditActivity.getMessagesController().getChat(Long.valueOf(chatEditActivity.chatId));
                    if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                        fileLocation2 = null;
                    }
                }
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    chatEditActivity.avatarImage.getLocationInWindow(iArr);
                    PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                    placeProviderObject.viewX = iArr[0];
                    placeProviderObject.viewY = iArr[1];
                    UserCell.AnonymousClass2 anonymousClass2 = chatEditActivity.avatarImage;
                    placeProviderObject.parentView = anonymousClass2;
                    ImageReceiver imageReceiver = anonymousClass2.getImageReceiver();
                    placeProviderObject.imageReceiver = imageReceiver;
                    if (j == 0) {
                        j = -chatEditActivity.chatId;
                    }
                    placeProviderObject.dialogId = j;
                    placeProviderObject.thumb = imageReceiver.getBitmapSafe();
                    placeProviderObject.size = -1L;
                    placeProviderObject.radius = chatEditActivity.avatarImage.getImageReceiver().getRoundRadius(true);
                    placeProviderObject.scale = chatEditActivity.avatarContainer.getScaleX();
                    placeProviderObject.canEdit = true;
                    return placeProviderObject;
                }
            }
            return null;
        }

        @Override
        public final int getTotalImageCount() {
            return 1;
        }

        @Override
        public final boolean onDeletePhoto() {
            ChatEditActivity chatEditActivity = ChatEditActivity.this;
            long j = chatEditActivity.userId;
            if (j == 0) {
                return true;
            }
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = chatEditActivity.getMessagesController().getInputUser(j);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            chatEditActivity.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new CallLogActivity$$ExternalSyntheticLambda1(this, 13));
            return false;
        }

        @Override
        public final void openPhotoForEdit(String str, String str2, boolean z) {
            ChatEditActivity.this.imageUpdater.openPhotoForEdit(str, str2, z);
        }

        @Override
        public final void willHidePhotoViewer() {
            ChatEditActivity.this.avatarImage.getImageReceiver().setVisible(true, true);
        }
    }

    public final class AnonymousClass3 extends SizeNotifierFrameLayout {
        public final int $r8$classId;
        public boolean ignoreLayout;
        public final BaseFragment this$0;

        public AnonymousClass3(int i, Context context, BaseFragment baseFragment) {
            super(context, null);
            this.$r8$classId = i;
            this.this$0 = baseFragment;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int paddingTop;
            EditTextEmoji editTextEmoji;
            int measuredHeight;
            int measuredHeight2;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int paddingTop2;
            EditTextEmoji editTextEmoji2;
            int measuredHeight3;
            int measuredHeight4;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int paddingTop3;
            EditTextEmoji editTextEmoji3;
            int measuredHeight5;
            int measuredHeight6;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int paddingTop4;
            EmojiView emojiView;
            int measuredHeight7;
            int measuredHeight8;
            switch (this.$r8$classId) {
                case 0:
                    int childCount = getChildCount();
                    int iMeasureKeyboardHeight = measureKeyboardHeight();
                    int iDp = AndroidUtilities.dp(20.0f);
                    ChatEditActivity chatEditActivity = (ChatEditActivity) this.this$0;
                    int emojiPadding = (iMeasureKeyboardHeight > iDp || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : chatEditActivity.nameTextView.getEmojiPadding();
                    setBottomClip(emojiPadding);
                    for (int i25 = 0; i25 < childCount; i25++) {
                        View childAt = getChildAt(i25);
                        if (childAt.getVisibility() != 8) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                            int measuredWidth = childAt.getMeasuredWidth();
                            int measuredHeight9 = childAt.getMeasuredHeight();
                            int i26 = layoutParams.gravity;
                            if (i26 == -1) {
                                i26 = 51;
                            }
                            int i27 = i26 & 112;
                            int i28 = i26 & 7;
                            if (i28 != 1) {
                                if (i28 != 5) {
                                    i7 = layoutParams.leftMargin;
                                } else {
                                    i5 = i3 - measuredWidth;
                                    i6 = layoutParams.rightMargin;
                                }
                                if (i27 != 16) {
                                    if (i27 != 48) {
                                        paddingTop = layoutParams.topMargin + getPaddingTop();
                                    } else if (i27 != 80) {
                                        paddingTop = layoutParams.topMargin;
                                    } else {
                                        i8 = ((i4 - emojiPadding) - i2) - measuredHeight9;
                                        i9 = layoutParams.bottomMargin;
                                    }
                                    editTextEmoji = chatEditActivity.nameTextView;
                                    if (editTextEmoji != null && editTextEmoji.isPopupView(childAt)) {
                                        if (AndroidUtilities.isTablet()) {
                                            measuredHeight = getMeasuredHeight();
                                            measuredHeight2 = childAt.getMeasuredHeight();
                                        } else {
                                            measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                            measuredHeight2 = childAt.getMeasuredHeight();
                                        }
                                        paddingTop = measuredHeight - measuredHeight2;
                                    }
                                    childAt.layout(i7, paddingTop, measuredWidth + i7, measuredHeight9 + paddingTop);
                                } else {
                                    i8 = ((((i4 - emojiPadding) - i2) - measuredHeight9) / 2) + layoutParams.topMargin;
                                    i9 = layoutParams.bottomMargin;
                                }
                                paddingTop = i8 - i9;
                                editTextEmoji = chatEditActivity.nameTextView;
                                if (editTextEmoji != null) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    paddingTop = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(i7, paddingTop, measuredWidth + i7, measuredHeight9 + paddingTop);
                            } else {
                                i5 = (((i3 - i) - measuredWidth) / 2) + layoutParams.leftMargin;
                                i6 = layoutParams.rightMargin;
                            }
                            i7 = i5 - i6;
                            if (i27 != 16) {
                                if (i27 != 48) {
                                    paddingTop = layoutParams.topMargin + getPaddingTop();
                                } else if (i27 != 80) {
                                    paddingTop = layoutParams.topMargin;
                                } else {
                                    i8 = ((i4 - emojiPadding) - i2) - measuredHeight9;
                                    i9 = layoutParams.bottomMargin;
                                }
                                editTextEmoji = chatEditActivity.nameTextView;
                                if (editTextEmoji != null) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    paddingTop = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(i7, paddingTop, measuredWidth + i7, measuredHeight9 + paddingTop);
                            } else {
                                i8 = ((((i4 - emojiPadding) - i2) - measuredHeight9) / 2) + layoutParams.topMargin;
                                i9 = layoutParams.bottomMargin;
                            }
                            paddingTop = i8 - i9;
                            editTextEmoji = chatEditActivity.nameTextView;
                            if (editTextEmoji != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(i7, paddingTop, measuredWidth + i7, measuredHeight9 + paddingTop);
                        }
                    }
                    notifyHeightChanged();
                    break;
                case 1:
                    int childCount2 = getChildCount();
                    int iMeasureKeyboardHeight2 = measureKeyboardHeight();
                    int iDp2 = AndroidUtilities.dp(20.0f);
                    ChannelCreateActivity channelCreateActivity = (ChannelCreateActivity) this.this$0;
                    int emojiPadding2 = (iMeasureKeyboardHeight2 > iDp2 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : channelCreateActivity.nameTextView.getEmojiPadding();
                    setBottomClip(emojiPadding2);
                    for (int i29 = 0; i29 < childCount2; i29++) {
                        View childAt2 = getChildAt(i29);
                        if (childAt2.getVisibility() != 8) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                            int measuredWidth2 = childAt2.getMeasuredWidth();
                            int measuredHeight10 = childAt2.getMeasuredHeight();
                            int i30 = layoutParams2.gravity;
                            if (i30 == -1) {
                                i30 = 51;
                            }
                            int i31 = i30 & 112;
                            int i32 = i30 & 7;
                            if (i32 != 1) {
                                if (i32 != 5) {
                                    i12 = layoutParams2.leftMargin;
                                } else {
                                    i10 = i3 - measuredWidth2;
                                    i11 = layoutParams2.rightMargin;
                                }
                                if (i31 != 16) {
                                    if (i31 != 48) {
                                        paddingTop2 = layoutParams2.topMargin + getPaddingTop();
                                    } else if (i31 != 80) {
                                        paddingTop2 = layoutParams2.topMargin;
                                    } else {
                                        i13 = ((i4 - emojiPadding2) - i2) - measuredHeight10;
                                        i14 = layoutParams2.bottomMargin;
                                    }
                                    editTextEmoji2 = channelCreateActivity.nameTextView;
                                    if (editTextEmoji2 != null && editTextEmoji2.isPopupView(childAt2)) {
                                        if (AndroidUtilities.isTablet()) {
                                            measuredHeight3 = getMeasuredHeight();
                                            measuredHeight4 = childAt2.getMeasuredHeight();
                                        } else {
                                            measuredHeight3 = getMeasuredHeight() + iMeasureKeyboardHeight2;
                                            measuredHeight4 = childAt2.getMeasuredHeight();
                                        }
                                        paddingTop2 = measuredHeight3 - measuredHeight4;
                                    }
                                    childAt2.layout(i12, paddingTop2, measuredWidth2 + i12, measuredHeight10 + paddingTop2);
                                } else {
                                    i13 = ((((i4 - emojiPadding2) - i2) - measuredHeight10) / 2) + layoutParams2.topMargin;
                                    i14 = layoutParams2.bottomMargin;
                                }
                                paddingTop2 = i13 - i14;
                                editTextEmoji2 = channelCreateActivity.nameTextView;
                                if (editTextEmoji2 != null) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight3 = getMeasuredHeight();
                                        measuredHeight4 = childAt2.getMeasuredHeight();
                                    } else {
                                        measuredHeight3 = getMeasuredHeight() + iMeasureKeyboardHeight2;
                                        measuredHeight4 = childAt2.getMeasuredHeight();
                                    }
                                    paddingTop2 = measuredHeight3 - measuredHeight4;
                                }
                                childAt2.layout(i12, paddingTop2, measuredWidth2 + i12, measuredHeight10 + paddingTop2);
                            } else {
                                i10 = (((i3 - i) - measuredWidth2) / 2) + layoutParams2.leftMargin;
                                i11 = layoutParams2.rightMargin;
                            }
                            i12 = i10 - i11;
                            if (i31 != 16) {
                                if (i31 != 48) {
                                    paddingTop2 = layoutParams2.topMargin + getPaddingTop();
                                } else if (i31 != 80) {
                                    paddingTop2 = layoutParams2.topMargin;
                                } else {
                                    i13 = ((i4 - emojiPadding2) - i2) - measuredHeight10;
                                    i14 = layoutParams2.bottomMargin;
                                }
                                editTextEmoji2 = channelCreateActivity.nameTextView;
                                if (editTextEmoji2 != null) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight3 = getMeasuredHeight();
                                        measuredHeight4 = childAt2.getMeasuredHeight();
                                    } else {
                                        measuredHeight3 = getMeasuredHeight() + iMeasureKeyboardHeight2;
                                        measuredHeight4 = childAt2.getMeasuredHeight();
                                    }
                                    paddingTop2 = measuredHeight3 - measuredHeight4;
                                }
                                childAt2.layout(i12, paddingTop2, measuredWidth2 + i12, measuredHeight10 + paddingTop2);
                            } else {
                                i13 = ((((i4 - emojiPadding2) - i2) - measuredHeight10) / 2) + layoutParams2.topMargin;
                                i14 = layoutParams2.bottomMargin;
                            }
                            paddingTop2 = i13 - i14;
                            editTextEmoji2 = channelCreateActivity.nameTextView;
                            if (editTextEmoji2 != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight3 = getMeasuredHeight();
                                    measuredHeight4 = childAt2.getMeasuredHeight();
                                } else {
                                    measuredHeight3 = getMeasuredHeight() + iMeasureKeyboardHeight2;
                                    measuredHeight4 = childAt2.getMeasuredHeight();
                                }
                                paddingTop2 = measuredHeight3 - measuredHeight4;
                            }
                            childAt2.layout(i12, paddingTop2, measuredWidth2 + i12, measuredHeight10 + paddingTop2);
                        }
                    }
                    notifyHeightChanged();
                    break;
                case 2:
                    int childCount3 = getChildCount();
                    int iMeasureKeyboardHeight3 = measureKeyboardHeight();
                    int iDp3 = AndroidUtilities.dp(20.0f);
                    GroupCreateFinalActivity groupCreateFinalActivity = (GroupCreateFinalActivity) this.this$0;
                    int emojiPadding3 = (iMeasureKeyboardHeight3 > iDp3 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : groupCreateFinalActivity.editText.getEmojiPadding();
                    setBottomClip(emojiPadding3);
                    for (int i33 = 0; i33 < childCount3; i33++) {
                        View childAt3 = getChildAt(i33);
                        if (childAt3.getVisibility() != 8) {
                            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) childAt3.getLayoutParams();
                            int measuredWidth3 = childAt3.getMeasuredWidth();
                            int measuredHeight11 = childAt3.getMeasuredHeight();
                            int i34 = layoutParams3.gravity;
                            if (i34 == -1) {
                                i34 = 51;
                            }
                            int i35 = i34 & 112;
                            int i36 = i34 & 7;
                            if (i36 != 1) {
                                if (i36 != 5) {
                                    i17 = layoutParams3.leftMargin;
                                } else {
                                    i15 = i3 - measuredWidth3;
                                    i16 = layoutParams3.rightMargin;
                                }
                                if (i35 != 16) {
                                    if (i35 != 48) {
                                        paddingTop3 = layoutParams3.topMargin + getPaddingTop();
                                    } else if (i35 != 80) {
                                        paddingTop3 = layoutParams3.topMargin;
                                    } else {
                                        i18 = ((i4 - emojiPadding3) - i2) - measuredHeight11;
                                        i19 = layoutParams3.bottomMargin;
                                    }
                                    editTextEmoji3 = groupCreateFinalActivity.editText;
                                    if (editTextEmoji3 != null && editTextEmoji3.isPopupView(childAt3)) {
                                        if (AndroidUtilities.isTablet()) {
                                            measuredHeight5 = getMeasuredHeight();
                                            measuredHeight6 = childAt3.getMeasuredHeight();
                                        } else {
                                            measuredHeight5 = getMeasuredHeight() + iMeasureKeyboardHeight3;
                                            measuredHeight6 = childAt3.getMeasuredHeight();
                                        }
                                        paddingTop3 = measuredHeight5 - measuredHeight6;
                                    }
                                    childAt3.layout(i17, paddingTop3, measuredWidth3 + i17, measuredHeight11 + paddingTop3);
                                } else {
                                    i18 = ((((i4 - emojiPadding3) - i2) - measuredHeight11) / 2) + layoutParams3.topMargin;
                                    i19 = layoutParams3.bottomMargin;
                                }
                                paddingTop3 = i18 - i19;
                                editTextEmoji3 = groupCreateFinalActivity.editText;
                                if (editTextEmoji3 != null) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight5 = getMeasuredHeight();
                                        measuredHeight6 = childAt3.getMeasuredHeight();
                                    } else {
                                        measuredHeight5 = getMeasuredHeight() + iMeasureKeyboardHeight3;
                                        measuredHeight6 = childAt3.getMeasuredHeight();
                                    }
                                    paddingTop3 = measuredHeight5 - measuredHeight6;
                                }
                                childAt3.layout(i17, paddingTop3, measuredWidth3 + i17, measuredHeight11 + paddingTop3);
                            } else {
                                i15 = (((i3 - i) - measuredWidth3) / 2) + layoutParams3.leftMargin;
                                i16 = layoutParams3.rightMargin;
                            }
                            i17 = i15 - i16;
                            if (i35 != 16) {
                                if (i35 != 48) {
                                    paddingTop3 = layoutParams3.topMargin + getPaddingTop();
                                } else if (i35 != 80) {
                                    paddingTop3 = layoutParams3.topMargin;
                                } else {
                                    i18 = ((i4 - emojiPadding3) - i2) - measuredHeight11;
                                    i19 = layoutParams3.bottomMargin;
                                }
                                editTextEmoji3 = groupCreateFinalActivity.editText;
                                if (editTextEmoji3 != null) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight5 = getMeasuredHeight();
                                        measuredHeight6 = childAt3.getMeasuredHeight();
                                    } else {
                                        measuredHeight5 = getMeasuredHeight() + iMeasureKeyboardHeight3;
                                        measuredHeight6 = childAt3.getMeasuredHeight();
                                    }
                                    paddingTop3 = measuredHeight5 - measuredHeight6;
                                }
                                childAt3.layout(i17, paddingTop3, measuredWidth3 + i17, measuredHeight11 + paddingTop3);
                            } else {
                                i18 = ((((i4 - emojiPadding3) - i2) - measuredHeight11) / 2) + layoutParams3.topMargin;
                                i19 = layoutParams3.bottomMargin;
                            }
                            paddingTop3 = i18 - i19;
                            editTextEmoji3 = groupCreateFinalActivity.editText;
                            if (editTextEmoji3 != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight5 = getMeasuredHeight();
                                    measuredHeight6 = childAt3.getMeasuredHeight();
                                } else {
                                    measuredHeight5 = getMeasuredHeight() + iMeasureKeyboardHeight3;
                                    measuredHeight6 = childAt3.getMeasuredHeight();
                                }
                                paddingTop3 = measuredHeight5 - measuredHeight6;
                            }
                            childAt3.layout(i17, paddingTop3, measuredWidth3 + i17, measuredHeight11 + paddingTop3);
                        }
                    }
                    notifyHeightChanged();
                    break;
                default:
                    int childCount4 = getChildCount();
                    int iMeasureKeyboardHeight4 = measureKeyboardHeight();
                    int iDp4 = AndroidUtilities.dp(20.0f);
                    PollCreateActivity pollCreateActivity = (PollCreateActivity) this.this$0;
                    int i37 = (iMeasureKeyboardHeight4 > iDp4 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : pollCreateActivity.emojiPadding;
                    setBottomClip(i37);
                    for (int i38 = 0; i38 < childCount4; i38++) {
                        View childAt4 = getChildAt(i38);
                        if (childAt4.getVisibility() != 8) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) childAt4.getLayoutParams();
                            int measuredWidth4 = childAt4.getMeasuredWidth();
                            int measuredHeight12 = childAt4.getMeasuredHeight();
                            int i39 = layoutParams4.gravity;
                            if (i39 == -1) {
                                i39 = 51;
                            }
                            int i40 = i39 & 112;
                            int i41 = i39 & 7;
                            if (i41 != 1) {
                                if (i41 != 5) {
                                    i22 = layoutParams4.leftMargin;
                                } else {
                                    i20 = i3 - measuredWidth4;
                                    i21 = layoutParams4.rightMargin;
                                }
                                if (i40 != 16) {
                                    if (i40 != 48) {
                                        paddingTop4 = layoutParams4.topMargin + getPaddingTop();
                                    } else if (i40 != 80) {
                                        paddingTop4 = layoutParams4.topMargin;
                                    } else {
                                        i23 = ((i4 - i37) - i2) - measuredHeight12;
                                        i24 = layoutParams4.bottomMargin;
                                    }
                                    emojiView = pollCreateActivity.emojiView;
                                    if (emojiView != null && emojiView == childAt4) {
                                        if (AndroidUtilities.isTablet()) {
                                            measuredHeight7 = getMeasuredHeight();
                                            measuredHeight8 = childAt4.getMeasuredHeight();
                                        } else {
                                            measuredHeight7 = getMeasuredHeight() + iMeasureKeyboardHeight4;
                                            measuredHeight8 = childAt4.getMeasuredHeight();
                                        }
                                        paddingTop4 = measuredHeight7 - measuredHeight8;
                                    }
                                    childAt4.layout(i22, paddingTop4, measuredWidth4 + i22, measuredHeight12 + paddingTop4);
                                } else {
                                    i23 = ((((i4 - i37) - i2) - measuredHeight12) / 2) + layoutParams4.topMargin;
                                    i24 = layoutParams4.bottomMargin;
                                }
                                paddingTop4 = i23 - i24;
                                emojiView = pollCreateActivity.emojiView;
                                if (emojiView != null) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight7 = getMeasuredHeight();
                                        measuredHeight8 = childAt4.getMeasuredHeight();
                                    } else {
                                        measuredHeight7 = getMeasuredHeight() + iMeasureKeyboardHeight4;
                                        measuredHeight8 = childAt4.getMeasuredHeight();
                                    }
                                    paddingTop4 = measuredHeight7 - measuredHeight8;
                                }
                                childAt4.layout(i22, paddingTop4, measuredWidth4 + i22, measuredHeight12 + paddingTop4);
                            } else {
                                i20 = (((i3 - i) - measuredWidth4) / 2) + layoutParams4.leftMargin;
                                i21 = layoutParams4.rightMargin;
                            }
                            i22 = i20 - i21;
                            if (i40 != 16) {
                                if (i40 != 48) {
                                    paddingTop4 = layoutParams4.topMargin + getPaddingTop();
                                } else if (i40 != 80) {
                                    paddingTop4 = layoutParams4.topMargin;
                                } else {
                                    i23 = ((i4 - i37) - i2) - measuredHeight12;
                                    i24 = layoutParams4.bottomMargin;
                                }
                                emojiView = pollCreateActivity.emojiView;
                                if (emojiView != null) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight7 = getMeasuredHeight();
                                        measuredHeight8 = childAt4.getMeasuredHeight();
                                    } else {
                                        measuredHeight7 = getMeasuredHeight() + iMeasureKeyboardHeight4;
                                        measuredHeight8 = childAt4.getMeasuredHeight();
                                    }
                                    paddingTop4 = measuredHeight7 - measuredHeight8;
                                }
                                childAt4.layout(i22, paddingTop4, measuredWidth4 + i22, measuredHeight12 + paddingTop4);
                            } else {
                                i23 = ((((i4 - i37) - i2) - measuredHeight12) / 2) + layoutParams4.topMargin;
                                i24 = layoutParams4.bottomMargin;
                            }
                            paddingTop4 = i23 - i24;
                            emojiView = pollCreateActivity.emojiView;
                            if (emojiView != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight7 = getMeasuredHeight();
                                    measuredHeight8 = childAt4.getMeasuredHeight();
                                } else {
                                    measuredHeight7 = getMeasuredHeight() + iMeasureKeyboardHeight4;
                                    measuredHeight8 = childAt4.getMeasuredHeight();
                                }
                                paddingTop4 = measuredHeight7 - measuredHeight8;
                            }
                            childAt4.layout(i22, paddingTop4, measuredWidth4 + i22, measuredHeight12 + paddingTop4);
                        }
                    }
                    notifyHeightChanged();
                    break;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension(size, size2);
                    int paddingTop = size2 - getPaddingTop();
                    ChatEditActivity chatEditActivity = (ChatEditActivity) this.this$0;
                    measureChildWithMargins(((BaseFragment) chatEditActivity).actionBar, i, 0, i2, 0);
                    if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                        this.ignoreLayout = true;
                        chatEditActivity.nameTextView.hideEmojiView();
                        this.ignoreLayout = false;
                    }
                    int childCount = getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = getChildAt(i3);
                        if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) chatEditActivity).actionBar) {
                            EditTextEmoji editTextEmoji = chatEditActivity.nameTextView;
                            if (editTextEmoji == null || !editTextEmoji.isPopupView(childAt)) {
                                measureChildWithMargins(childAt, i, 0, i2, 0);
                            } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            } else if (AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight)), 1073741824));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight), 1073741824));
                            }
                        }
                    }
                    break;
                case 1:
                    int size3 = View.MeasureSpec.getSize(i);
                    int size4 = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension(size3, size4);
                    int paddingTop2 = size4 - getPaddingTop();
                    ChannelCreateActivity channelCreateActivity = (ChannelCreateActivity) this.this$0;
                    measureChildWithMargins(((BaseFragment) channelCreateActivity).actionBar, i, 0, i2, 0);
                    if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                        this.ignoreLayout = true;
                        channelCreateActivity.nameTextView.hideEmojiView();
                        this.ignoreLayout = false;
                    }
                    int childCount2 = getChildCount();
                    for (int i4 = 0; i4 < childCount2; i4++) {
                        View childAt2 = getChildAt(i4);
                        if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != ((BaseFragment) channelCreateActivity).actionBar) {
                            EditTextEmoji editTextEmoji2 = channelCreateActivity.nameTextView;
                            if (editTextEmoji2 == null || !editTextEmoji2.isPopupView(childAt2)) {
                                measureChildWithMargins(childAt2, i, 0, i2, 0);
                            } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, 1073741824));
                            } else if (AndroidUtilities.isTablet()) {
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop2 - AndroidUtilities.statusBarHeight)), 1073741824));
                            } else {
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop2 - AndroidUtilities.statusBarHeight), 1073741824));
                            }
                        }
                    }
                    break;
                case 2:
                    int size5 = View.MeasureSpec.getSize(i);
                    int size6 = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension(size5, size6);
                    int paddingTop3 = size6 - getPaddingTop();
                    GroupCreateFinalActivity groupCreateFinalActivity = (GroupCreateFinalActivity) this.this$0;
                    measureChildWithMargins(((BaseFragment) groupCreateFinalActivity).actionBar, i, 0, i2, 0);
                    if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                        EditTextEmoji editTextEmoji3 = groupCreateFinalActivity.editText;
                        if (!editTextEmoji3.emojiViewVisible) {
                            this.ignoreLayout = true;
                            editTextEmoji3.hideEmojiView();
                            this.ignoreLayout = false;
                        }
                    }
                    int childCount3 = getChildCount();
                    for (int i5 = 0; i5 < childCount3; i5++) {
                        View childAt3 = getChildAt(i5);
                        if (childAt3 != null && childAt3.getVisibility() != 8 && childAt3 != ((BaseFragment) groupCreateFinalActivity).actionBar) {
                            EditTextEmoji editTextEmoji4 = groupCreateFinalActivity.editText;
                            if (editTextEmoji4 == null || !editTextEmoji4.isPopupView(childAt3)) {
                                measureChildWithMargins(childAt3, i, 0, i2, 0);
                            } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt3.getLayoutParams().height, 1073741824));
                            } else if (AndroidUtilities.isTablet()) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop3 - AndroidUtilities.statusBarHeight)), 1073741824));
                            } else {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop3 - AndroidUtilities.statusBarHeight), 1073741824));
                            }
                        }
                    }
                    break;
                default:
                    int size7 = View.MeasureSpec.getSize(i);
                    int size8 = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension(size7, size8);
                    int paddingTop4 = size8 - getPaddingTop();
                    PollCreateActivity pollCreateActivity = (PollCreateActivity) this.this$0;
                    measureChildWithMargins(((BaseFragment) pollCreateActivity).actionBar, i, 0, i2, 0);
                    int iMeasureKeyboardHeight = measureKeyboardHeight();
                    if (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) && !pollCreateActivity.emojiViewVisible && !pollCreateActivity.isEmojiSearchOpened) {
                        this.ignoreLayout = true;
                        pollCreateActivity.hideEmojiView();
                        this.ignoreLayout = false;
                    }
                    int iDp = (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : pollCreateActivity.emojiPadding;
                    if (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) && pollCreateActivity.isEmojiSearchOpened) {
                        iDp = AndroidUtilities.dp(120.0f);
                    }
                    int i6 = iDp;
                    int childCount4 = getChildCount();
                    for (int i7 = 0; i7 < childCount4; i7++) {
                        View childAt4 = getChildAt(i7);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && childAt4 != ((BaseFragment) pollCreateActivity).actionBar) {
                            EmojiView emojiView = pollCreateActivity.emojiView;
                            if (emojiView == null || emojiView != childAt4) {
                                if (pollCreateActivity.listView == childAt4) {
                                    childAt4.measure(i, View.MeasureSpec.makeMeasureSpec(paddingTop4 - i6, 1073741824));
                                } else {
                                    measureChildWithMargins(childAt4, i, 0, i2, 0);
                                }
                            } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt4.getLayoutParams().height, 1073741824));
                            } else if (AndroidUtilities.isTablet()) {
                                childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop4 - AndroidUtilities.statusBarHeight)), 1073741824));
                            } else {
                                childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop4 - AndroidUtilities.statusBarHeight), 1073741824));
                            }
                        }
                    }
                    break;
            }
        }

        @Override
        public final void requestLayout() {
            switch (this.$r8$classId) {
                case 0:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
                case 1:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
                case 2:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
                default:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
            }
        }
    }

    public ChatEditActivity(Bundle bundle) {
        super(bundle);
        this.preloadedReactions = new ArrayList();
        this.provider = new AnonymousClass1();
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        this.chatId = bundle.getLong("chat_id", 0L);
        this.userId = bundle.getLong("user_id", 0L);
        if (this.chatId == 0) {
            this.imageUpdater = new ImageUpdater(0, false, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            this.imageUpdater = new ImageUpdater((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true, true);
        }
    }

    public static SpannableStringBuilder applyNewSpan(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        FilterCreateActivity.NewSpan newSpan = new FilterCreateActivity.NewSpan(10);
        newSpan.textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        newSpan.color = Theme.getColor(null, Theme.key_premiumGradient1, false);
        spannableStringBuilder.setSpan(newSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String getActiveUsername(TLRPC.User user) {
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

    @Override
    public final boolean canFinishFragment() {
        return true;
    }

    public final boolean checkDiscard(boolean z) {
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
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                String string = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.BotSettingsChangedAlert);
                builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new ChatEditActivity$$ExternalSyntheticLambda41(this, 0));
                builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new ChatEditActivity$$ExternalSyntheticLambda41(this, 1));
                showDialog(alertDialog);
                return false;
            }
        } else {
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull == null || !ChatObject.isChannel(this.currentChat) || this.info.hidden_prehistory == this.historyHidden) && (((editTextEmoji = this.nameTextView) == null || this.currentChat.title.equals(editTextEmoji.getText().toString())) && (((editTextBoldCursor = this.descriptionTextView) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.forum == this.currentChat.forum))) {
                return true;
            }
            if (z) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
                String string2 = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                AlertDialog alertDialog2 = builder2.alertDialog;
                alertDialog2.title = string2;
                if (this.isChannel) {
                    alertDialog2.message = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                } else {
                    alertDialog2.message = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                }
                builder2.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new ChatEditActivity$$ExternalSyntheticLambda41(this, 2));
                builder2.setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new ChatEditActivity$$ExternalSyntheticLambda41(this, 3));
                showDialog(alertDialog2);
            }
        }
        return false;
    }

    public final void checkWelcomeMessagesValue() {
        if (this.welcomeMessagesCell == null) {
            return;
        }
        String firstWelcomeMessageText = getMessagesController().getFirstWelcomeMessageText(-this.chatId);
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull != null && !chatFull.has_welcome_messages && firstWelcomeMessageText == null) {
            firstWelcomeMessageText = LocaleController.getString(R.string.WelcomeMessageOff);
        }
        this.welcomeMessagesCell.setTextAndValueAndIcon(LocaleController.getString(R.string.WelcomeMessage), firstWelcomeMessageText, false, R.drawable.menu_welcome_messages, true);
    }

    @Override
    public final View createView(Context context) {
        float f;
        Context context2;
        ViewGroup viewGroup;
        final int i;
        final int i2;
        final ?? r13;
        final ChatEditActivity chatEditActivity;
        ViewGroup viewGroup2;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.User user;
        ViewGroup viewGroup3;
        final ChatEditActivity chatEditActivity2;
        int i3;
        int i4;
        int i5;
        String string;
        int i6;
        TLRPC.ChatFull chatFull;
        AnonymousClass3 anonymousClass3;
        final int i7;
        boolean z;
        Context context3;
        final ChatEditActivity chatEditActivity3;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        int i8 = 21;
        final int i9 = 2;
        int i10 = 5;
        int i11 = 0;
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, i8));
        AnonymousClass3 anonymousClass4 = new AnonymousClass3(i11, context, this);
        anonymousClass4.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(8));
        this.fragmentView = anonymousClass4;
        anonymousClass4.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        GLIconSettingsView gLIconSettingsView = new GLIconSettingsView(context);
        this.linearLayout = gLIconSettingsView;
        SectionsScrollView sectionsScrollView = new SectionsScrollView(context, this.linearLayout, this.resourceProvider, false);
        this.scrollView = sectionsScrollView;
        sectionsScrollView.setFillViewport(true);
        anonymousClass4.addView(this.scrollView, LayoutHelper.createFrame(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.scrollView);
        this.scrollView.addView(gLIconSettingsView, new FrameLayout.LayoutParams(-1, -2));
        gLIconSettingsView.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.avatarContainer = linearLayout;
        linearLayout.setOrientation(1);
        this.avatarContainer.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        gLIconSettingsView.addView(this.avatarContainer, LayoutHelper.createLinear(-1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.avatarContainer.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
        UserCell.AnonymousClass2 anonymousClass2 = new UserCell.AnonymousClass2(this, context, i10);
        this.avatarImage = anonymousClass2;
        anonymousClass2.setRoundRadius(this.forum ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        if (this.currentUser != null || ChatObject.canChangeChatInfo(this.currentChat)) {
            f = 30.0f;
            UserCell.AnonymousClass2 anonymousClass5 = this.avatarImage;
            boolean z2 = LocaleController.isRTL;
            frameLayout.addView(anonymousClass5, LayoutHelper.createFrame(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 12.0f, z2 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(this, context, paint, i9);
            this.avatarOverlay = anonymousClass27;
            boolean z3 = LocaleController.isRTL;
            frameLayout.addView(anonymousClass27, LayoutHelper.createFrame(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 16.0f, 12.0f, z3 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.avatarProgressView = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.avatarProgressView.setProgressColor(-1);
            this.avatarProgressView.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.avatarProgressView;
            boolean z4 = LocaleController.isRTL;
            frameLayout.addView(radialProgressView2, LayoutHelper.createFrame(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 12.0f, z4 ? 16.0f : 0.0f, 8.0f));
            showAvatarProgress$1(false, false);
            this.avatarContainer.setOnClickListener(new View.OnClickListener(this) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i9) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j));
                                if (user2 == null) {
                                    TLRPC.Chat chat = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                                        int i12 = chatPhoto2.dc_id;
                                        if (i12 != 0) {
                                            chatPhoto2.photo_big.dc_id = i12;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i13 = userProfilePhoto2.dc_id;
                                        if (i13 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i13;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j2 = chatEditActivity19.chatId;
                            TextCell textCell = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j2, textCell != null && textCell.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i14 = 0; i14 < tL_chatReactionsSome.reactions.size(); i14++) {
                                            if (tL_chatReactionsSome.reactions.get(i14) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i14)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
        } else {
            UserCell.AnonymousClass2 anonymousClass6 = this.avatarImage;
            boolean z5 = LocaleController.isRTL;
            int i12 = (z5 ? 5 : 3) | 48;
            float f2 = z5 ? 0.0f : 16.0f;
            float f3 = z5 ? 16.0f : 0.0f;
            f = 30.0f;
            frameLayout.addView(anonymousClass6, LayoutHelper.createFrame(64, 64.0f, i12, f2, 12.0f, f3, 12.0f));
        }
        EditTextEmoji editTextEmoji2 = new EditTextEmoji(context, anonymousClass4, this);
        this.nameTextView = editTextEmoji2;
        long j = this.userId;
        if (j != 0) {
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
        this.nameTextView.getEditText().addTextChangedListener(new ArticleViewer.AnonymousClass16(this, i10));
        this.nameTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        EditTextEmoji editTextEmoji5 = this.nameTextView;
        boolean z6 = LocaleController.isRTL;
        frameLayout.addView(editTextEmoji5, LayoutHelper.createFrame(-1, -2.0f, 16, z6 ? 5.0f : 96.0f, 0.0f, z6 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.settingsContainer = linearLayout2;
        linearLayout2.setOrientation(1);
        gLIconSettingsView.addView(this.settingsContainer, LayoutHelper.createLinear(-1, -2));
        if (this.currentUser != null || ChatObject.canChangeChatInfo(this.currentChat)) {
            ?? r7 = new TextCell(context) {
                @Override
                public final void onDraw(Canvas canvas) {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                }
            };
            this.setAvatarCell = r7;
            r7.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
            final int i13 = 13;
            setOnClickListener(new View.OnClickListener(this) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i13) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j2 = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j2 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j2));
                                if (user2 == null) {
                                    TLRPC.Chat chat2 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat2.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat2.photo;
                                        int i14 = chatPhoto2.dc_id;
                                        if (i14 != 0) {
                                            chatPhoto2.photo_big.dc_id = i14;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat2.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i15 = userProfilePhoto2.dc_id;
                                        if (i15 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i15;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j3 = chatEditActivity19.chatId;
                            TextCell textCell = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j3, textCell != null && textCell.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i16 = 0; i16 < tL_chatReactionsSome.reactions.size(); i16++) {
                                            if (tL_chatReactionsSome.reactions.get(i16) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i16)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
            this.settingsContainer.addView(this.setAvatarCell, LayoutHelper.createLinear(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.descriptionTextView = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.descriptionTextView.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
        EditTextBoldCursor editTextBoldCursor2 = this.descriptionTextView;
        int i14 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor2.setTextColor(Theme.getColor(i14));
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
        this.descriptionTextView.setCursorColor(Theme.getColor(i14));
        this.descriptionTextView.setCursorSize(AndroidUtilities.dp(20.0f));
        this.descriptionTextView.setCursorWidth(1.5f);
        if (this.descriptionTextView.isEnabled()) {
            this.settingsContainer.addView(this.descriptionTextView, LayoutHelper.createLinear(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.settingsContainer.addView(this.descriptionTextView, LayoutHelper.createLinear(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.descriptionTextView.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 3));
        this.descriptionTextView.addTextChangedListener(new AnonymousClass8(i11));
        ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context);
        this.settingsTopSectionCell = shadowSectionCell;
        gLIconSettingsView.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.typeEditContainer = linearLayout3;
        linearLayout3.setOrientation(1);
        gLIconSettingsView.addView(this.typeEditContainer, LayoutHelper.createLinear(-1, -2));
        TLRPC.Chat chat2 = this.currentChat;
        CharSequence charSequenceReplaceStarsWithPlain = "";
        if (chat2 != null) {
            if (chat2.megagroup && ((chatFull3 = this.info) == null || chatFull3.can_set_location)) {
                TextCell textCell = new TextCell(context);
                this.locationCell = textCell;
                textCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.locationCell, LayoutHelper.createLinear(-1, -2));
                final int i15 = 16;
                this.locationCell.setOnClickListener(new View.OnClickListener(this) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) throws Throwable {
                        switch (i15) {
                            case 0:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                                groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                                groupColorActivity.bulletinFragment = chatEditActivity4;
                                chatEditActivity4.presentFragment(groupColorActivity);
                                break;
                            case 1:
                                ChatEditActivity chatEditActivity5 = this.f$0;
                                chatEditActivity5.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", chatEditActivity5.chatId);
                                bundle.putInt("type", 1);
                                ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                                chatUsersActivity.setInfo(chatEditActivity5.info);
                                chatEditActivity5.presentFragment(chatUsersActivity);
                                break;
                            case 2:
                                ChatEditActivity chatEditActivity6 = this.f$0;
                                if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                    long j2 = chatEditActivity6.userId;
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user2 = j2 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j2));
                                    if (user2 == null) {
                                        TLRPC.Chat chat3 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                        TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                                            int i16 = chatPhoto2.dc_id;
                                            if (i16 != 0) {
                                                chatPhoto2.photo_big.dc_id = i16;
                                            }
                                            TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                                }
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, chat3.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i17 = userProfilePhoto2.dc_id;
                                            if (i17 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i17;
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                ChatEditActivity chatEditActivity7 = this.f$0;
                                chatEditActivity7.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", chatEditActivity7.chatId);
                                bundle2.putInt("type", 2);
                                ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                                chatUsersActivity2.setInfo(chatEditActivity7.info);
                                chatEditActivity7.presentFragment(chatUsersActivity2);
                                break;
                            case 4:
                                ChatEditActivity chatEditActivity8 = this.f$0;
                                chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                                break;
                            case 5:
                                ChatEditActivity chatEditActivity9 = this.f$0;
                                chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                                break;
                            case 6:
                                ChatEditActivity chatEditActivity10 = this.f$0;
                                chatEditActivity10.getClass();
                                chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                                break;
                            case 7:
                                ChatEditActivity chatEditActivity11 = this.f$0;
                                chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                                break;
                            case 8:
                                ChatEditActivity chatEditActivity12 = this.f$0;
                                chatEditActivity12.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", chatEditActivity12.userId);
                                chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                                break;
                            case 9:
                                ChatEditActivity chatEditActivity13 = this.f$0;
                                chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                                break;
                            case 10:
                                ChatEditActivity chatEditActivity14 = this.f$0;
                                chatEditActivity14.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                                break;
                            case 11:
                                ChatEditActivity chatEditActivity15 = this.f$0;
                                chatEditActivity15.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                                break;
                            case 12:
                                ChatEditActivity chatEditActivity16 = this.f$0;
                                chatEditActivity16.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                                break;
                            case 13:
                                this.f$0.openSetPhotoAlert();
                                break;
                            case 14:
                                this.f$0.lambda$createView$43$1();
                                break;
                            case 15:
                                ChatEditActivity chatEditActivity17 = this.f$0;
                                AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                                break;
                            case 16:
                                ChatEditActivity chatEditActivity18 = this.f$0;
                                if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                    LocationActivity locationActivity = new LocationActivity(4);
                                    locationActivity.dialogId = -chatEditActivity18.chatId;
                                    TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                    chatEditActivity18.presentFragment(locationActivity);
                                    break;
                                }
                                break;
                            case 17:
                                ChatEditActivity chatEditActivity19 = this.f$0;
                                long j3 = chatEditActivity19.chatId;
                                TextCell textCell2 = chatEditActivity19.locationCell;
                                ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j3, textCell2 != null && textCell2.getVisibility() == 0);
                                TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                                chatEditTypeActivity.info = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        chatEditTypeActivity.invite = tL_chatInviteExported;
                                    } else {
                                        chatEditTypeActivity.generateLink(false);
                                    }
                                }
                                chatEditActivity19.presentFragment(chatEditTypeActivity);
                                break;
                            case 18:
                                ChatEditActivity chatEditActivity20 = this.f$0;
                                ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                                chatLinkActivity.info = chatEditActivity20.info;
                                chatEditActivity20.presentFragment(chatLinkActivity);
                                break;
                            case 19:
                                ChatEditActivity chatEditActivity21 = this.f$0;
                                PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                                postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                                chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                                break;
                            case 20:
                                this.f$0.lambda$createView$12$2();
                                break;
                            case 21:
                                ChatEditActivity chatEditActivity22 = this.f$0;
                                chatEditActivity22.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", chatEditActivity22.chatId);
                                bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                                ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                                chatUsersActivity3.setInfo(chatEditActivity22.info);
                                chatEditActivity22.presentFragment(chatUsersActivity3);
                                break;
                            case 22:
                                ChatEditActivity chatEditActivity23 = this.f$0;
                                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                                TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                                manageLinksActivity.info = chatFull7;
                                manageLinksActivity.invite = tL_chatInviteExported2;
                                manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                                manageLinksActivity.loadLinks(true);
                                chatEditActivity23.presentFragment(manageLinksActivity);
                                break;
                            case 23:
                                ChatEditActivity chatEditActivity24 = this.f$0;
                                if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                    chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                    ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                    TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                    chatReactionsEditActivity.info = chatFull8;
                                    if (chatFull8 != null) {
                                        if (chatReactionsEditActivity.currentChat == null) {
                                            chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                        }
                                        chatReactionsEditActivity.chatReactions = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            chatReactionsEditActivity.startFromType = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            chatReactionsEditActivity.startFromType = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i18 = 0; i18 < tL_chatReactionsSome.reactions.size(); i18++) {
                                                if (tL_chatReactionsSome.reactions.get(i18) instanceof TLRPC.TL_reactionEmoji) {
                                                    chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i18)).emoticon);
                                                }
                                            }
                                            chatReactionsEditActivity.startFromType = 1;
                                        }
                                    }
                                    chatEditActivity24.presentFragment(chatReactionsEditActivity);
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity25 = this.f$0;
                                chatEditActivity25.getClass();
                                Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                                bundleM.putLong("chat_id", chatEditActivity25.chatId);
                                bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                                chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                                break;
                        }
                    }
                });
            }
            if (this.currentChat.creator && ((chatFull2 = this.info) == null || chatFull2.can_set_username)) {
                TextCell textCell2 = new TextCell(context);
                this.typeCell = textCell2;
                textCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.typeCell, LayoutHelper.createLinear(-1, -2));
                final int i16 = 17;
                this.typeCell.setOnClickListener(new View.OnClickListener(this) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) throws Throwable {
                        switch (i16) {
                            case 0:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                                groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                                groupColorActivity.bulletinFragment = chatEditActivity4;
                                chatEditActivity4.presentFragment(groupColorActivity);
                                break;
                            case 1:
                                ChatEditActivity chatEditActivity5 = this.f$0;
                                chatEditActivity5.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", chatEditActivity5.chatId);
                                bundle.putInt("type", 1);
                                ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                                chatUsersActivity.setInfo(chatEditActivity5.info);
                                chatEditActivity5.presentFragment(chatUsersActivity);
                                break;
                            case 2:
                                ChatEditActivity chatEditActivity6 = this.f$0;
                                if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                    long j2 = chatEditActivity6.userId;
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user2 = j2 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j2));
                                    if (user2 == null) {
                                        TLRPC.Chat chat3 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                        TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                                            int i17 = chatPhoto2.dc_id;
                                            if (i17 != 0) {
                                                chatPhoto2.photo_big.dc_id = i17;
                                            }
                                            TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                                }
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, chat3.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i18 = userProfilePhoto2.dc_id;
                                            if (i18 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i18;
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                ChatEditActivity chatEditActivity7 = this.f$0;
                                chatEditActivity7.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", chatEditActivity7.chatId);
                                bundle2.putInt("type", 2);
                                ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                                chatUsersActivity2.setInfo(chatEditActivity7.info);
                                chatEditActivity7.presentFragment(chatUsersActivity2);
                                break;
                            case 4:
                                ChatEditActivity chatEditActivity8 = this.f$0;
                                chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                                break;
                            case 5:
                                ChatEditActivity chatEditActivity9 = this.f$0;
                                chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                                break;
                            case 6:
                                ChatEditActivity chatEditActivity10 = this.f$0;
                                chatEditActivity10.getClass();
                                chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                                break;
                            case 7:
                                ChatEditActivity chatEditActivity11 = this.f$0;
                                chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                                break;
                            case 8:
                                ChatEditActivity chatEditActivity12 = this.f$0;
                                chatEditActivity12.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", chatEditActivity12.userId);
                                chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                                break;
                            case 9:
                                ChatEditActivity chatEditActivity13 = this.f$0;
                                chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                                break;
                            case 10:
                                ChatEditActivity chatEditActivity14 = this.f$0;
                                chatEditActivity14.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                                break;
                            case 11:
                                ChatEditActivity chatEditActivity15 = this.f$0;
                                chatEditActivity15.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                                break;
                            case 12:
                                ChatEditActivity chatEditActivity16 = this.f$0;
                                chatEditActivity16.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                                break;
                            case 13:
                                this.f$0.openSetPhotoAlert();
                                break;
                            case 14:
                                this.f$0.lambda$createView$43$1();
                                break;
                            case 15:
                                ChatEditActivity chatEditActivity17 = this.f$0;
                                AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                                break;
                            case 16:
                                ChatEditActivity chatEditActivity18 = this.f$0;
                                if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                    LocationActivity locationActivity = new LocationActivity(4);
                                    locationActivity.dialogId = -chatEditActivity18.chatId;
                                    TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                    chatEditActivity18.presentFragment(locationActivity);
                                    break;
                                }
                                break;
                            case 17:
                                ChatEditActivity chatEditActivity19 = this.f$0;
                                long j3 = chatEditActivity19.chatId;
                                TextCell textCell3 = chatEditActivity19.locationCell;
                                ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j3, textCell3 != null && textCell3.getVisibility() == 0);
                                TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                                chatEditTypeActivity.info = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        chatEditTypeActivity.invite = tL_chatInviteExported;
                                    } else {
                                        chatEditTypeActivity.generateLink(false);
                                    }
                                }
                                chatEditActivity19.presentFragment(chatEditTypeActivity);
                                break;
                            case 18:
                                ChatEditActivity chatEditActivity20 = this.f$0;
                                ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                                chatLinkActivity.info = chatEditActivity20.info;
                                chatEditActivity20.presentFragment(chatLinkActivity);
                                break;
                            case 19:
                                ChatEditActivity chatEditActivity21 = this.f$0;
                                PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                                postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                                chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                                break;
                            case 20:
                                this.f$0.lambda$createView$12$2();
                                break;
                            case 21:
                                ChatEditActivity chatEditActivity22 = this.f$0;
                                chatEditActivity22.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", chatEditActivity22.chatId);
                                bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                                ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                                chatUsersActivity3.setInfo(chatEditActivity22.info);
                                chatEditActivity22.presentFragment(chatUsersActivity3);
                                break;
                            case 22:
                                ChatEditActivity chatEditActivity23 = this.f$0;
                                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                                TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                                manageLinksActivity.info = chatFull7;
                                manageLinksActivity.invite = tL_chatInviteExported2;
                                manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                                manageLinksActivity.loadLinks(true);
                                chatEditActivity23.presentFragment(manageLinksActivity);
                                break;
                            case 23:
                                ChatEditActivity chatEditActivity24 = this.f$0;
                                if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                    chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                    ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                    TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                    chatReactionsEditActivity.info = chatFull8;
                                    if (chatFull8 != null) {
                                        if (chatReactionsEditActivity.currentChat == null) {
                                            chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                        }
                                        chatReactionsEditActivity.chatReactions = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            chatReactionsEditActivity.startFromType = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            chatReactionsEditActivity.startFromType = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i19 = 0; i19 < tL_chatReactionsSome.reactions.size(); i19++) {
                                                if (tL_chatReactionsSome.reactions.get(i19) instanceof TLRPC.TL_reactionEmoji) {
                                                    chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i19)).emoticon);
                                                }
                                            }
                                            chatReactionsEditActivity.startFromType = 1;
                                        }
                                    }
                                    chatEditActivity24.presentFragment(chatReactionsEditActivity);
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity25 = this.f$0;
                                chatEditActivity25.getClass();
                                Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                                bundleM.putLong("chat_id", chatEditActivity25.chatId);
                                bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                                chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.currentChat) && ((this.isChannel && ChatObject.canUserDoAdminAction(this.currentChat, 1)) || (!this.isChannel && ChatObject.canUserDoAdminAction(this.currentChat, 0)))) {
                TextCell textCell3 = new TextCell(context);
                this.linkedCell = textCell3;
                textCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.linkedCell, LayoutHelper.createLinear(-1, -2));
                final int i17 = 18;
                this.linkedCell.setOnClickListener(new View.OnClickListener(this) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) throws Throwable {
                        switch (i17) {
                            case 0:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                                groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                                groupColorActivity.bulletinFragment = chatEditActivity4;
                                chatEditActivity4.presentFragment(groupColorActivity);
                                break;
                            case 1:
                                ChatEditActivity chatEditActivity5 = this.f$0;
                                chatEditActivity5.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", chatEditActivity5.chatId);
                                bundle.putInt("type", 1);
                                ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                                chatUsersActivity.setInfo(chatEditActivity5.info);
                                chatEditActivity5.presentFragment(chatUsersActivity);
                                break;
                            case 2:
                                ChatEditActivity chatEditActivity6 = this.f$0;
                                if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                    long j2 = chatEditActivity6.userId;
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user2 = j2 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j2));
                                    if (user2 == null) {
                                        TLRPC.Chat chat3 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                        TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                                            int i18 = chatPhoto2.dc_id;
                                            if (i18 != 0) {
                                                chatPhoto2.photo_big.dc_id = i18;
                                            }
                                            TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                                }
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, chat3.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i19 = userProfilePhoto2.dc_id;
                                            if (i19 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i19;
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                ChatEditActivity chatEditActivity7 = this.f$0;
                                chatEditActivity7.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", chatEditActivity7.chatId);
                                bundle2.putInt("type", 2);
                                ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                                chatUsersActivity2.setInfo(chatEditActivity7.info);
                                chatEditActivity7.presentFragment(chatUsersActivity2);
                                break;
                            case 4:
                                ChatEditActivity chatEditActivity8 = this.f$0;
                                chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                                break;
                            case 5:
                                ChatEditActivity chatEditActivity9 = this.f$0;
                                chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                                break;
                            case 6:
                                ChatEditActivity chatEditActivity10 = this.f$0;
                                chatEditActivity10.getClass();
                                chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                                break;
                            case 7:
                                ChatEditActivity chatEditActivity11 = this.f$0;
                                chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                                break;
                            case 8:
                                ChatEditActivity chatEditActivity12 = this.f$0;
                                chatEditActivity12.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", chatEditActivity12.userId);
                                chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                                break;
                            case 9:
                                ChatEditActivity chatEditActivity13 = this.f$0;
                                chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                                break;
                            case 10:
                                ChatEditActivity chatEditActivity14 = this.f$0;
                                chatEditActivity14.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                                break;
                            case 11:
                                ChatEditActivity chatEditActivity15 = this.f$0;
                                chatEditActivity15.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                                break;
                            case 12:
                                ChatEditActivity chatEditActivity16 = this.f$0;
                                chatEditActivity16.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                                break;
                            case 13:
                                this.f$0.openSetPhotoAlert();
                                break;
                            case 14:
                                this.f$0.lambda$createView$43$1();
                                break;
                            case 15:
                                ChatEditActivity chatEditActivity17 = this.f$0;
                                AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                                break;
                            case 16:
                                ChatEditActivity chatEditActivity18 = this.f$0;
                                if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                    LocationActivity locationActivity = new LocationActivity(4);
                                    locationActivity.dialogId = -chatEditActivity18.chatId;
                                    TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                    chatEditActivity18.presentFragment(locationActivity);
                                    break;
                                }
                                break;
                            case 17:
                                ChatEditActivity chatEditActivity19 = this.f$0;
                                long j3 = chatEditActivity19.chatId;
                                TextCell textCell4 = chatEditActivity19.locationCell;
                                ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j3, textCell4 != null && textCell4.getVisibility() == 0);
                                TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                                chatEditTypeActivity.info = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        chatEditTypeActivity.invite = tL_chatInviteExported;
                                    } else {
                                        chatEditTypeActivity.generateLink(false);
                                    }
                                }
                                chatEditActivity19.presentFragment(chatEditTypeActivity);
                                break;
                            case 18:
                                ChatEditActivity chatEditActivity20 = this.f$0;
                                ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                                chatLinkActivity.info = chatEditActivity20.info;
                                chatEditActivity20.presentFragment(chatLinkActivity);
                                break;
                            case 19:
                                ChatEditActivity chatEditActivity21 = this.f$0;
                                PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                                postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                                chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                                break;
                            case 20:
                                this.f$0.lambda$createView$12$2();
                                break;
                            case 21:
                                ChatEditActivity chatEditActivity22 = this.f$0;
                                chatEditActivity22.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", chatEditActivity22.chatId);
                                bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                                ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                                chatUsersActivity3.setInfo(chatEditActivity22.info);
                                chatEditActivity22.presentFragment(chatUsersActivity3);
                                break;
                            case 22:
                                ChatEditActivity chatEditActivity23 = this.f$0;
                                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                                TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                                manageLinksActivity.info = chatFull7;
                                manageLinksActivity.invite = tL_chatInviteExported2;
                                manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                                manageLinksActivity.loadLinks(true);
                                chatEditActivity23.presentFragment(manageLinksActivity);
                                break;
                            case 23:
                                ChatEditActivity chatEditActivity24 = this.f$0;
                                if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                    chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                    ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                    TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                    chatReactionsEditActivity.info = chatFull8;
                                    if (chatFull8 != null) {
                                        if (chatReactionsEditActivity.currentChat == null) {
                                            chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                        }
                                        chatReactionsEditActivity.chatReactions = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            chatReactionsEditActivity.startFromType = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            chatReactionsEditActivity.startFromType = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i110 = 0; i110 < tL_chatReactionsSome.reactions.size(); i110++) {
                                                if (tL_chatReactionsSome.reactions.get(i110) instanceof TLRPC.TL_reactionEmoji) {
                                                    chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i110)).emoticon);
                                                }
                                            }
                                            chatReactionsEditActivity.startFromType = 1;
                                        }
                                    }
                                    chatEditActivity24.presentFragment(chatReactionsEditActivity);
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity25 = this.f$0;
                                chatEditActivity25.getClass();
                                Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                                bundleM.putLong("chat_id", chatEditActivity25.chatId);
                                bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                                chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.currentChat) && this.isChannel && ChatObject.canUserDoAdminAction(this.currentChat, 1)) {
                TextCell textCell4 = new TextCell(context);
                this.suggestedCell = textCell4;
                textCell4.setBackground(Theme.getSelectorDrawable(true));
                this.suggestedCell.setTextAndValueAndIcon(R.drawable.msg_markunread, (CharSequence) LocaleController.getString(R.string.PostSuggestions), (CharSequence) "", true);
                this.typeEditContainer.addView(this.suggestedCell, LayoutHelper.createLinear(-1, -2));
                final int i18 = 19;
                this.suggestedCell.setOnClickListener(new View.OnClickListener(this) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) throws Throwable {
                        switch (i18) {
                            case 0:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                                groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                                groupColorActivity.bulletinFragment = chatEditActivity4;
                                chatEditActivity4.presentFragment(groupColorActivity);
                                break;
                            case 1:
                                ChatEditActivity chatEditActivity5 = this.f$0;
                                chatEditActivity5.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", chatEditActivity5.chatId);
                                bundle.putInt("type", 1);
                                ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                                chatUsersActivity.setInfo(chatEditActivity5.info);
                                chatEditActivity5.presentFragment(chatUsersActivity);
                                break;
                            case 2:
                                ChatEditActivity chatEditActivity6 = this.f$0;
                                if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                    long j2 = chatEditActivity6.userId;
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user2 = j2 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j2));
                                    if (user2 == null) {
                                        TLRPC.Chat chat3 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                        TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                                            int i19 = chatPhoto2.dc_id;
                                            if (i19 != 0) {
                                                chatPhoto2.photo_big.dc_id = i19;
                                            }
                                            TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                                }
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, chat3.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i110 = userProfilePhoto2.dc_id;
                                            if (i110 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i110;
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                ChatEditActivity chatEditActivity7 = this.f$0;
                                chatEditActivity7.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", chatEditActivity7.chatId);
                                bundle2.putInt("type", 2);
                                ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                                chatUsersActivity2.setInfo(chatEditActivity7.info);
                                chatEditActivity7.presentFragment(chatUsersActivity2);
                                break;
                            case 4:
                                ChatEditActivity chatEditActivity8 = this.f$0;
                                chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                                break;
                            case 5:
                                ChatEditActivity chatEditActivity9 = this.f$0;
                                chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                                break;
                            case 6:
                                ChatEditActivity chatEditActivity10 = this.f$0;
                                chatEditActivity10.getClass();
                                chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                                break;
                            case 7:
                                ChatEditActivity chatEditActivity11 = this.f$0;
                                chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                                break;
                            case 8:
                                ChatEditActivity chatEditActivity12 = this.f$0;
                                chatEditActivity12.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", chatEditActivity12.userId);
                                chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                                break;
                            case 9:
                                ChatEditActivity chatEditActivity13 = this.f$0;
                                chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                                break;
                            case 10:
                                ChatEditActivity chatEditActivity14 = this.f$0;
                                chatEditActivity14.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                                break;
                            case 11:
                                ChatEditActivity chatEditActivity15 = this.f$0;
                                chatEditActivity15.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                                break;
                            case 12:
                                ChatEditActivity chatEditActivity16 = this.f$0;
                                chatEditActivity16.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                                break;
                            case 13:
                                this.f$0.openSetPhotoAlert();
                                break;
                            case 14:
                                this.f$0.lambda$createView$43$1();
                                break;
                            case 15:
                                ChatEditActivity chatEditActivity17 = this.f$0;
                                AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                                break;
                            case 16:
                                ChatEditActivity chatEditActivity18 = this.f$0;
                                if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                    LocationActivity locationActivity = new LocationActivity(4);
                                    locationActivity.dialogId = -chatEditActivity18.chatId;
                                    TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                    chatEditActivity18.presentFragment(locationActivity);
                                    break;
                                }
                                break;
                            case 17:
                                ChatEditActivity chatEditActivity19 = this.f$0;
                                long j3 = chatEditActivity19.chatId;
                                TextCell textCell5 = chatEditActivity19.locationCell;
                                ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j3, textCell5 != null && textCell5.getVisibility() == 0);
                                TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                                chatEditTypeActivity.info = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        chatEditTypeActivity.invite = tL_chatInviteExported;
                                    } else {
                                        chatEditTypeActivity.generateLink(false);
                                    }
                                }
                                chatEditActivity19.presentFragment(chatEditTypeActivity);
                                break;
                            case 18:
                                ChatEditActivity chatEditActivity20 = this.f$0;
                                ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                                chatLinkActivity.info = chatEditActivity20.info;
                                chatEditActivity20.presentFragment(chatLinkActivity);
                                break;
                            case 19:
                                ChatEditActivity chatEditActivity21 = this.f$0;
                                PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                                postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                                chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                                break;
                            case 20:
                                this.f$0.lambda$createView$12$2();
                                break;
                            case 21:
                                ChatEditActivity chatEditActivity22 = this.f$0;
                                chatEditActivity22.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", chatEditActivity22.chatId);
                                bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                                ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                                chatUsersActivity3.setInfo(chatEditActivity22.info);
                                chatEditActivity22.presentFragment(chatUsersActivity3);
                                break;
                            case 22:
                                ChatEditActivity chatEditActivity23 = this.f$0;
                                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                                TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                                manageLinksActivity.info = chatFull7;
                                manageLinksActivity.invite = tL_chatInviteExported2;
                                manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                                manageLinksActivity.loadLinks(true);
                                chatEditActivity23.presentFragment(manageLinksActivity);
                                break;
                            case 23:
                                ChatEditActivity chatEditActivity24 = this.f$0;
                                if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                    chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                    ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                    TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                    chatReactionsEditActivity.info = chatFull8;
                                    if (chatFull8 != null) {
                                        if (chatReactionsEditActivity.currentChat == null) {
                                            chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                        }
                                        chatReactionsEditActivity.chatReactions = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            chatReactionsEditActivity.startFromType = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            chatReactionsEditActivity.startFromType = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i111 = 0; i111 < tL_chatReactionsSome.reactions.size(); i111++) {
                                                if (tL_chatReactionsSome.reactions.get(i111) instanceof TLRPC.TL_reactionEmoji) {
                                                    chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i111)).emoticon);
                                                }
                                            }
                                            chatReactionsEditActivity.startFromType = 1;
                                        }
                                    }
                                    chatEditActivity24.presentFragment(chatReactionsEditActivity);
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity25 = this.f$0;
                                chatEditActivity25.getClass();
                                Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                                bundleM.putLong("chat_id", chatEditActivity25.chatId);
                                bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                                chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.currentChat) && ChatObject.canChangeChatInfo(this.currentChat)) {
                anonymousClass3 = anonymousClass4;
                i7 = 1;
                z = false;
                PeerColorActivity.ChangeNameColorCell changeNameColorCell = new PeerColorActivity.ChangeNameColorCell(this.currentAccount, -this.currentChat.id, context, getResourceProvider());
                this.colorCell = changeNameColorCell;
                changeNameColorCell.setBackground(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.colorCell, LayoutHelper.createLinear(-1, -2));
                final int i19 = 20;
                this.colorCell.setOnClickListener(new View.OnClickListener(this) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) throws Throwable {
                        switch (i19) {
                            case 0:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                                groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                                groupColorActivity.bulletinFragment = chatEditActivity4;
                                chatEditActivity4.presentFragment(groupColorActivity);
                                break;
                            case 1:
                                ChatEditActivity chatEditActivity5 = this.f$0;
                                chatEditActivity5.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", chatEditActivity5.chatId);
                                bundle.putInt("type", 1);
                                ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                                chatUsersActivity.setInfo(chatEditActivity5.info);
                                chatEditActivity5.presentFragment(chatUsersActivity);
                                break;
                            case 2:
                                ChatEditActivity chatEditActivity6 = this.f$0;
                                if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                    long j2 = chatEditActivity6.userId;
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user2 = j2 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j2));
                                    if (user2 == null) {
                                        TLRPC.Chat chat3 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                        TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                                            int i110 = chatPhoto2.dc_id;
                                            if (i110 != 0) {
                                                chatPhoto2.photo_big.dc_id = i110;
                                            }
                                            TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                                }
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, chat3.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i111 = userProfilePhoto2.dc_id;
                                            if (i111 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i111;
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                ChatEditActivity chatEditActivity7 = this.f$0;
                                chatEditActivity7.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", chatEditActivity7.chatId);
                                bundle2.putInt("type", 2);
                                ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                                chatUsersActivity2.setInfo(chatEditActivity7.info);
                                chatEditActivity7.presentFragment(chatUsersActivity2);
                                break;
                            case 4:
                                ChatEditActivity chatEditActivity8 = this.f$0;
                                chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                                break;
                            case 5:
                                ChatEditActivity chatEditActivity9 = this.f$0;
                                chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                                break;
                            case 6:
                                ChatEditActivity chatEditActivity10 = this.f$0;
                                chatEditActivity10.getClass();
                                chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                                break;
                            case 7:
                                ChatEditActivity chatEditActivity11 = this.f$0;
                                chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                                break;
                            case 8:
                                ChatEditActivity chatEditActivity12 = this.f$0;
                                chatEditActivity12.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", chatEditActivity12.userId);
                                chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                                break;
                            case 9:
                                ChatEditActivity chatEditActivity13 = this.f$0;
                                chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                                break;
                            case 10:
                                ChatEditActivity chatEditActivity14 = this.f$0;
                                chatEditActivity14.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                                break;
                            case 11:
                                ChatEditActivity chatEditActivity15 = this.f$0;
                                chatEditActivity15.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                                break;
                            case 12:
                                ChatEditActivity chatEditActivity16 = this.f$0;
                                chatEditActivity16.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                                break;
                            case 13:
                                this.f$0.openSetPhotoAlert();
                                break;
                            case 14:
                                this.f$0.lambda$createView$43$1();
                                break;
                            case 15:
                                ChatEditActivity chatEditActivity17 = this.f$0;
                                AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                                break;
                            case 16:
                                ChatEditActivity chatEditActivity18 = this.f$0;
                                if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                    LocationActivity locationActivity = new LocationActivity(4);
                                    locationActivity.dialogId = -chatEditActivity18.chatId;
                                    TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                    chatEditActivity18.presentFragment(locationActivity);
                                    break;
                                }
                                break;
                            case 17:
                                ChatEditActivity chatEditActivity19 = this.f$0;
                                long j3 = chatEditActivity19.chatId;
                                TextCell textCell5 = chatEditActivity19.locationCell;
                                ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j3, textCell5 != null && textCell5.getVisibility() == 0);
                                TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                                chatEditTypeActivity.info = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        chatEditTypeActivity.invite = tL_chatInviteExported;
                                    } else {
                                        chatEditTypeActivity.generateLink(false);
                                    }
                                }
                                chatEditActivity19.presentFragment(chatEditTypeActivity);
                                break;
                            case 18:
                                ChatEditActivity chatEditActivity20 = this.f$0;
                                ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                                chatLinkActivity.info = chatEditActivity20.info;
                                chatEditActivity20.presentFragment(chatLinkActivity);
                                break;
                            case 19:
                                ChatEditActivity chatEditActivity21 = this.f$0;
                                PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                                postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                                chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                                break;
                            case 20:
                                this.f$0.lambda$createView$12$2();
                                break;
                            case 21:
                                ChatEditActivity chatEditActivity22 = this.f$0;
                                chatEditActivity22.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", chatEditActivity22.chatId);
                                bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                                ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                                chatUsersActivity3.setInfo(chatEditActivity22.info);
                                chatEditActivity22.presentFragment(chatUsersActivity3);
                                break;
                            case 22:
                                ChatEditActivity chatEditActivity23 = this.f$0;
                                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                                TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                                manageLinksActivity.info = chatFull7;
                                manageLinksActivity.invite = tL_chatInviteExported2;
                                manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                                manageLinksActivity.loadLinks(true);
                                chatEditActivity23.presentFragment(manageLinksActivity);
                                break;
                            case 23:
                                ChatEditActivity chatEditActivity24 = this.f$0;
                                if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                    chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                    ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                    TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                    chatReactionsEditActivity.info = chatFull8;
                                    if (chatFull8 != null) {
                                        if (chatReactionsEditActivity.currentChat == null) {
                                            chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                        }
                                        chatReactionsEditActivity.chatReactions = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            chatReactionsEditActivity.startFromType = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            chatReactionsEditActivity.startFromType = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                                if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                    chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                                }
                                            }
                                            chatReactionsEditActivity.startFromType = 1;
                                        }
                                    }
                                    chatEditActivity24.presentFragment(chatReactionsEditActivity);
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity25 = this.f$0;
                                chatEditActivity25.getClass();
                                Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                                bundleM.putLong("chat_id", chatEditActivity25.chatId);
                                bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                                chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                                break;
                        }
                    }
                });
            } else {
                anonymousClass3 = anonymousClass4;
                i7 = 1;
                z = false;
            }
            if (!ChatObject.isChannelAndNotMegaGroup(this.currentChat) || ChatObject.isCommunity(this.currentChat)) {
                context3 = context;
                viewGroup = anonymousClass3;
                chatEditActivity3 = this;
                i2 = 5;
            } else {
                long j2 = -this.currentChat.id;
                TextCell textCell5 = new TextCell(23, context, this.resourceProvider, false, true);
                context3 = context;
                this.autoTranslationCell = textCell5;
                textCell5.setBackground(Theme.getSelectorDrawable(i7));
                this.autoTranslationCell.setTextAndCheckAndIcon(R.drawable.msg_translate, LocaleController.getString(R.string.ChannelAutotranslation), this.currentChat.autotranslation);
                getMessagesController().getBoostsController().getBoostsStats(j2, new Consumer(this) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void accept(Object obj) {
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        switch (i7) {
                            case 0:
                                this.f$0.boostsStatus = tL_premium_boostsStatus;
                                break;
                            default:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                if (tL_premium_boostsStatus == null) {
                                    chatEditActivity4.getClass();
                                } else {
                                    chatEditActivity4.autoTranslationCell.getCheckBox().setIcon(tL_premium_boostsStatus.level < chatEditActivity4.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                }
                                break;
                        }
                    }
                });
                this.typeEditContainer.addView(this.autoTranslationCell, LayoutHelper.createLinear(-1, -2));
                boolean[] zArr = new boolean[i7];
                zArr[z ? 1 : 0] = z;
                viewGroup = anonymousClass3;
                i2 = 5;
                chatEditActivity3 = this;
                this.autoTranslationCell.setOnClickListener(new ChatEditActivity$$ExternalSyntheticLambda1(this, zArr, j2, 0));
            }
            if (!chatEditActivity3.isChannel && ChatObject.canBlockUsers(chatEditActivity3.currentChat) && (ChatObject.isChannel(chatEditActivity3.currentChat) || chatEditActivity3.currentChat.creator)) {
                TextCell textCell6 = new TextCell(context3);
                chatEditActivity3.historyCell = textCell6;
                textCell6.setBackgroundDrawable(Theme.getSelectorDrawable(i7));
                chatEditActivity3.typeEditContainer.addView(chatEditActivity3.historyCell, LayoutHelper.createLinear(-1, -2));
                chatEditActivity3.historyCell.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(25, chatEditActivity3, context3));
            }
            if (ChatObject.isMegagroup(chatEditActivity3.currentChat) && ChatObject.hasAdminRights(chatEditActivity3.currentChat) && !ChatObject.isCommunity(chatEditActivity3.currentChat)) {
                ChannelBoostsController boostsController = MessagesController.getInstance(chatEditActivity3.currentAccount).getBoostsController();
                long j3 = -chatEditActivity3.currentChat.id;
                final int i20 = z ? 1 : 0;
                boostsController.getBoostsStats(j3, new Consumer(chatEditActivity3) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity3;
                    }

                    @Override
                    public final void accept(Object obj) {
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        switch (i20) {
                            case 0:
                                this.f$0.boostsStatus = tL_premium_boostsStatus;
                                break;
                            default:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                if (tL_premium_boostsStatus == null) {
                                    chatEditActivity4.getClass();
                                } else {
                                    chatEditActivity4.autoTranslationCell.getCheckBox().setIcon(tL_premium_boostsStatus.level < chatEditActivity4.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                }
                                break;
                        }
                    }
                });
                Context context4 = context3;
                chatEditActivity = chatEditActivity3;
                PeerColorActivity.ChangeNameColorCell changeNameColorCell2 = new PeerColorActivity.ChangeNameColorCell(chatEditActivity3.currentAccount, -chatEditActivity3.currentChat.id, context4, chatEditActivity3.getResourceProvider());
                chatEditActivity.colorCell = changeNameColorCell2;
                changeNameColorCell2.setBackground(Theme.getSelectorDrawable(i7));
                chatEditActivity.typeEditContainer.addView(chatEditActivity.colorCell, LayoutHelper.createLinear(-1, -2));
                PeerColorActivity.ChangeNameColorCell changeNameColorCell3 = chatEditActivity.colorCell;
                final int i21 = z ? 1 : 0;
                changeNameColorCell3.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view) throws Throwable {
                        switch (i21) {
                            case 0:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                                groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                                groupColorActivity.bulletinFragment = chatEditActivity4;
                                chatEditActivity4.presentFragment(groupColorActivity);
                                break;
                            case 1:
                                ChatEditActivity chatEditActivity5 = this.f$0;
                                chatEditActivity5.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", chatEditActivity5.chatId);
                                bundle.putInt("type", 1);
                                ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                                chatUsersActivity.setInfo(chatEditActivity5.info);
                                chatEditActivity5.presentFragment(chatUsersActivity);
                                break;
                            case 2:
                                ChatEditActivity chatEditActivity6 = this.f$0;
                                if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                    long j4 = chatEditActivity6.userId;
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                    if (user2 == null) {
                                        TLRPC.Chat chat3 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                        TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                                            int i110 = chatPhoto2.dc_id;
                                            if (i110 != 0) {
                                                chatPhoto2.photo_big.dc_id = i110;
                                            }
                                            TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                                }
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, chat3.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i111 = userProfilePhoto2.dc_id;
                                            if (i111 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i111;
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                ChatEditActivity chatEditActivity7 = this.f$0;
                                chatEditActivity7.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", chatEditActivity7.chatId);
                                bundle2.putInt("type", 2);
                                ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                                chatUsersActivity2.setInfo(chatEditActivity7.info);
                                chatEditActivity7.presentFragment(chatUsersActivity2);
                                break;
                            case 4:
                                ChatEditActivity chatEditActivity8 = this.f$0;
                                chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                                break;
                            case 5:
                                ChatEditActivity chatEditActivity9 = this.f$0;
                                chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                                break;
                            case 6:
                                ChatEditActivity chatEditActivity10 = this.f$0;
                                chatEditActivity10.getClass();
                                chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                                break;
                            case 7:
                                ChatEditActivity chatEditActivity11 = this.f$0;
                                chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                                break;
                            case 8:
                                ChatEditActivity chatEditActivity12 = this.f$0;
                                chatEditActivity12.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", chatEditActivity12.userId);
                                chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                                break;
                            case 9:
                                ChatEditActivity chatEditActivity13 = this.f$0;
                                chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                                break;
                            case 10:
                                ChatEditActivity chatEditActivity14 = this.f$0;
                                chatEditActivity14.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                                break;
                            case 11:
                                ChatEditActivity chatEditActivity15 = this.f$0;
                                chatEditActivity15.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                                break;
                            case 12:
                                ChatEditActivity chatEditActivity16 = this.f$0;
                                chatEditActivity16.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                                break;
                            case 13:
                                this.f$0.openSetPhotoAlert();
                                break;
                            case 14:
                                this.f$0.lambda$createView$43$1();
                                break;
                            case 15:
                                ChatEditActivity chatEditActivity17 = this.f$0;
                                AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                                break;
                            case 16:
                                ChatEditActivity chatEditActivity18 = this.f$0;
                                if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                    LocationActivity locationActivity = new LocationActivity(4);
                                    locationActivity.dialogId = -chatEditActivity18.chatId;
                                    TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                    chatEditActivity18.presentFragment(locationActivity);
                                    break;
                                }
                                break;
                            case 17:
                                ChatEditActivity chatEditActivity19 = this.f$0;
                                long j5 = chatEditActivity19.chatId;
                                TextCell textCell7 = chatEditActivity19.locationCell;
                                ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell7 != null && textCell7.getVisibility() == 0);
                                TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                                chatEditTypeActivity.info = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        chatEditTypeActivity.invite = tL_chatInviteExported;
                                    } else {
                                        chatEditTypeActivity.generateLink(false);
                                    }
                                }
                                chatEditActivity19.presentFragment(chatEditTypeActivity);
                                break;
                            case 18:
                                ChatEditActivity chatEditActivity20 = this.f$0;
                                ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                                chatLinkActivity.info = chatEditActivity20.info;
                                chatEditActivity20.presentFragment(chatLinkActivity);
                                break;
                            case 19:
                                ChatEditActivity chatEditActivity21 = this.f$0;
                                PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                                postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                                chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                                break;
                            case 20:
                                this.f$0.lambda$createView$12$2();
                                break;
                            case 21:
                                ChatEditActivity chatEditActivity22 = this.f$0;
                                chatEditActivity22.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", chatEditActivity22.chatId);
                                bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                                ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                                chatUsersActivity3.setInfo(chatEditActivity22.info);
                                chatEditActivity22.presentFragment(chatUsersActivity3);
                                break;
                            case 22:
                                ChatEditActivity chatEditActivity23 = this.f$0;
                                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                                TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                                manageLinksActivity.info = chatFull7;
                                manageLinksActivity.invite = tL_chatInviteExported2;
                                manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                                manageLinksActivity.loadLinks(true);
                                chatEditActivity23.presentFragment(manageLinksActivity);
                                break;
                            case 23:
                                ChatEditActivity chatEditActivity24 = this.f$0;
                                if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                    chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                    ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                    TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                    chatReactionsEditActivity.info = chatFull8;
                                    if (chatFull8 != null) {
                                        if (chatReactionsEditActivity.currentChat == null) {
                                            chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                        }
                                        chatReactionsEditActivity.chatReactions = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            chatReactionsEditActivity.startFromType = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            chatReactionsEditActivity.startFromType = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                                if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                    chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                                }
                                            }
                                            chatReactionsEditActivity.startFromType = 1;
                                        }
                                    }
                                    chatEditActivity24.presentFragment(chatReactionsEditActivity);
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity25 = this.f$0;
                                chatEditActivity25.getClass();
                                Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                                bundleM.putLong("chat_id", chatEditActivity25.chatId);
                                bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                                chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                                break;
                        }
                    }
                });
            } else {
                chatEditActivity = chatEditActivity3;
            }
            if (!chatEditActivity.isChannel && chatEditActivity.currentChat.creator) {
                TextCell textCell7 = new TextCell(23, context, null, false, true);
                context2 = context;
                chatEditActivity.forumsCell = textCell7;
                textCell7.setBackground(Theme.getSelectorDrawable(i7));
                chatEditActivity.forumsCell.setTextAndCheckAndIcon(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), chatEditActivity.forum);
                chatEditActivity.forumsCell.getCheckBox().setIcon(chatEditActivity.canForum ? 0 : R.drawable.permission_locked);
                chatEditActivity.typeEditContainer.addView(chatEditActivity.forumsCell, LayoutHelper.createFrame(-2.0f, -1));
                chatEditActivity.forumsCell.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(26, chatEditActivity, frameLayout));
            } else {
                context2 = context;
            }
            chatEditActivity.updateColorCell();
            i = i7;
            r13 = z;
        } else {
            context2 = context;
            viewGroup = anonymousClass4;
            gLIconSettingsView = gLIconSettingsView;
            j = j;
            i = 1;
            i2 = 5;
            r13 = 0;
            chatEditActivity = this;
        }
        ActionBarMenu actionBarMenuCreateMenu = chatEditActivity.actionBar.createMenu();
        if (chatEditActivity.currentUser != null || ChatObject.canChangeChatInfo(chatEditActivity.currentChat) || chatEditActivity.historyCell != null) {
            ActionBarMenuItem actionBarMenuItemAddItemWithWidth = actionBarMenuCreateMenu.addItemWithWidth(i, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            chatEditActivity.doneButton = actionBarMenuItemAddItemWithWidth;
            actionBarMenuItemAddItemWithWidth.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (chatEditActivity.locationCell == null && chatEditActivity.historyCell == null && chatEditActivity.typeCell == null && chatEditActivity.linkedCell == null && chatEditActivity.forumsCell == null) {
            viewGroup2 = gLIconSettingsView;
        } else {
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context2, 12, chatEditActivity.resourceProvider);
            chatEditActivity.settingsSectionCell = textInfoPrivacyCell;
            if (chatEditActivity.forumsCell != null) {
                textInfoPrivacyCell.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                textInfoPrivacyCell.setFixedSize(12);
            }
            viewGroup2 = gLIconSettingsView;
            viewGroup2.addView(chatEditActivity.settingsSectionCell, LayoutHelper.createLinear(-1, -2));
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        chatEditActivity.infoContainer = linearLayout4;
        linearLayout4.setOrientation(i);
        viewGroup2.addView(chatEditActivity.infoContainer, LayoutHelper.createLinear(-1, -2));
        if (chatEditActivity.currentChat != null) {
            TextCell textCell8 = new TextCell(context2);
            chatEditActivity.blockCell = textCell8;
            textCell8.setBackground(Theme.getSelectorDrawable(r13));
            TextCell textCell9 = chatEditActivity.blockCell;
            if (ChatObject.isChannel(chatEditActivity.currentChat)) {
                i6 = 0;
            } else {
                TLRPC.Chat chat3 = chatEditActivity.currentChat;
                if (chat3.creator || (ChatObject.hasAdminRights(chat3) && ChatObject.canChangeChatInfo(chatEditActivity.currentChat))) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
            }
            textCell9.setVisibility(i6);
            final int i22 = 21;
            chatEditActivity.blockCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i22) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j4 = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                if (user2 == null) {
                                    TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                        int i110 = chatPhoto2.dc_id;
                                        if (i110 != 0) {
                                            chatPhoto2.photo_big.dc_id = i110;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i111 = userProfilePhoto2.dc_id;
                                        if (i111 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i111;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j5 = chatEditActivity19.chatId;
                            TextCell textCell10 = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell10 != null && textCell10.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                            if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
            TextCell textCell10 = new TextCell(context2);
            chatEditActivity.inviteLinksCell = textCell10;
            textCell10.setBackground(Theme.getSelectorDrawable(r13));
            final int i23 = 22;
            chatEditActivity.inviteLinksCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i23) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j4 = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                if (user2 == null) {
                                    TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                        int i110 = chatPhoto2.dc_id;
                                        if (i110 != 0) {
                                            chatPhoto2.photo_big.dc_id = i110;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i111 = userProfilePhoto2.dc_id;
                                        if (i111 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i111;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j5 = chatEditActivity19.chatId;
                            TextCell textCell11 = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell11 != null && textCell11.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                            if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
            TextCell textCell11 = new TextCell(context2);
            chatEditActivity.reactionsCell = textCell11;
            textCell11.setBackground(Theme.getSelectorDrawable(r13));
            final int i24 = 23;
            chatEditActivity.reactionsCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i24) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j4 = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                if (user2 == null) {
                                    TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                        int i110 = chatPhoto2.dc_id;
                                        if (i110 != 0) {
                                            chatPhoto2.photo_big.dc_id = i110;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i111 = userProfilePhoto2.dc_id;
                                        if (i111 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i111;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j5 = chatEditActivity19.chatId;
                            TextCell textCell12 = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell12 != null && textCell12.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                            if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(chatEditActivity.currentChat, 28)) {
                TextCell textCell12 = new TextCell(context2);
                chatEditActivity.welcomeMessagesCell = textCell12;
                textCell12.setBackground(Theme.getSelectorDrawable(r13));
                final int i25 = 24;
                chatEditActivity.welcomeMessagesCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view) throws Throwable {
                        switch (i25) {
                            case 0:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                                groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                                groupColorActivity.bulletinFragment = chatEditActivity4;
                                chatEditActivity4.presentFragment(groupColorActivity);
                                break;
                            case 1:
                                ChatEditActivity chatEditActivity5 = this.f$0;
                                chatEditActivity5.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", chatEditActivity5.chatId);
                                bundle.putInt("type", 1);
                                ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                                chatUsersActivity.setInfo(chatEditActivity5.info);
                                chatEditActivity5.presentFragment(chatUsersActivity);
                                break;
                            case 2:
                                ChatEditActivity chatEditActivity6 = this.f$0;
                                if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                    long j4 = chatEditActivity6.userId;
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                    if (user2 == null) {
                                        TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                        TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                            int i110 = chatPhoto2.dc_id;
                                            if (i110 != 0) {
                                                chatPhoto2.photo_big.dc_id = i110;
                                            }
                                            TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                                }
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i111 = userProfilePhoto2.dc_id;
                                            if (i111 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i111;
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                ChatEditActivity chatEditActivity7 = this.f$0;
                                chatEditActivity7.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", chatEditActivity7.chatId);
                                bundle2.putInt("type", 2);
                                ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                                chatUsersActivity2.setInfo(chatEditActivity7.info);
                                chatEditActivity7.presentFragment(chatUsersActivity2);
                                break;
                            case 4:
                                ChatEditActivity chatEditActivity8 = this.f$0;
                                chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                                break;
                            case 5:
                                ChatEditActivity chatEditActivity9 = this.f$0;
                                chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                                break;
                            case 6:
                                ChatEditActivity chatEditActivity10 = this.f$0;
                                chatEditActivity10.getClass();
                                chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                                break;
                            case 7:
                                ChatEditActivity chatEditActivity11 = this.f$0;
                                chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                                break;
                            case 8:
                                ChatEditActivity chatEditActivity12 = this.f$0;
                                chatEditActivity12.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", chatEditActivity12.userId);
                                chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                                break;
                            case 9:
                                ChatEditActivity chatEditActivity13 = this.f$0;
                                chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                                break;
                            case 10:
                                ChatEditActivity chatEditActivity14 = this.f$0;
                                chatEditActivity14.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                                break;
                            case 11:
                                ChatEditActivity chatEditActivity15 = this.f$0;
                                chatEditActivity15.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                                break;
                            case 12:
                                ChatEditActivity chatEditActivity16 = this.f$0;
                                chatEditActivity16.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                                break;
                            case 13:
                                this.f$0.openSetPhotoAlert();
                                break;
                            case 14:
                                this.f$0.lambda$createView$43$1();
                                break;
                            case 15:
                                ChatEditActivity chatEditActivity17 = this.f$0;
                                AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                                break;
                            case 16:
                                ChatEditActivity chatEditActivity18 = this.f$0;
                                if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                    LocationActivity locationActivity = new LocationActivity(4);
                                    locationActivity.dialogId = -chatEditActivity18.chatId;
                                    TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                    chatEditActivity18.presentFragment(locationActivity);
                                    break;
                                }
                                break;
                            case 17:
                                ChatEditActivity chatEditActivity19 = this.f$0;
                                long j5 = chatEditActivity19.chatId;
                                TextCell textCell13 = chatEditActivity19.locationCell;
                                ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell13 != null && textCell13.getVisibility() == 0);
                                TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                                chatEditTypeActivity.info = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        chatEditTypeActivity.invite = tL_chatInviteExported;
                                    } else {
                                        chatEditTypeActivity.generateLink(false);
                                    }
                                }
                                chatEditActivity19.presentFragment(chatEditTypeActivity);
                                break;
                            case 18:
                                ChatEditActivity chatEditActivity20 = this.f$0;
                                ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                                chatLinkActivity.info = chatEditActivity20.info;
                                chatEditActivity20.presentFragment(chatLinkActivity);
                                break;
                            case 19:
                                ChatEditActivity chatEditActivity21 = this.f$0;
                                PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                                postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                                chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                                break;
                            case 20:
                                this.f$0.lambda$createView$12$2();
                                break;
                            case 21:
                                ChatEditActivity chatEditActivity22 = this.f$0;
                                chatEditActivity22.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", chatEditActivity22.chatId);
                                bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                                ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                                chatUsersActivity3.setInfo(chatEditActivity22.info);
                                chatEditActivity22.presentFragment(chatUsersActivity3);
                                break;
                            case 22:
                                ChatEditActivity chatEditActivity23 = this.f$0;
                                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                                TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                                manageLinksActivity.info = chatFull7;
                                manageLinksActivity.invite = tL_chatInviteExported2;
                                manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                                manageLinksActivity.loadLinks(true);
                                chatEditActivity23.presentFragment(manageLinksActivity);
                                break;
                            case 23:
                                ChatEditActivity chatEditActivity24 = this.f$0;
                                if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                    chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                    ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                    TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                    chatReactionsEditActivity.info = chatFull8;
                                    if (chatFull8 != null) {
                                        if (chatReactionsEditActivity.currentChat == null) {
                                            chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                        }
                                        chatReactionsEditActivity.chatReactions = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            chatReactionsEditActivity.startFromType = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            chatReactionsEditActivity.startFromType = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                                if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                    chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                                }
                                            }
                                            chatReactionsEditActivity.startFromType = 1;
                                        }
                                    }
                                    chatEditActivity24.presentFragment(chatReactionsEditActivity);
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity25 = this.f$0;
                                chatEditActivity25.getClass();
                                Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                                bundleM.putLong("chat_id", chatEditActivity25.chatId);
                                bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                                chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                                break;
                        }
                    }
                });
                chatEditActivity.checkWelcomeMessagesValue();
            }
            TextCell textCell13 = new TextCell(context2);
            chatEditActivity.adminCell = textCell13;
            textCell13.setBackground(Theme.getSelectorDrawable(r13));
            chatEditActivity.adminCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j4 = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                if (user2 == null) {
                                    TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                        int i110 = chatPhoto2.dc_id;
                                        if (i110 != 0) {
                                            chatPhoto2.photo_big.dc_id = i110;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i111 = userProfilePhoto2.dc_id;
                                        if (i111 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i111;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j5 = chatEditActivity19.chatId;
                            TextCell textCell14 = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell14 != null && textCell14.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                            if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
            TextCell textCell14 = new TextCell(context2);
            chatEditActivity.membersCell = textCell14;
            textCell14.setBackgroundDrawable(Theme.getSelectorDrawable(r13));
            final int i26 = 3;
            chatEditActivity.membersCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i26) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j4 = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                if (user2 == null) {
                                    TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                        int i110 = chatPhoto2.dc_id;
                                        if (i110 != 0) {
                                            chatPhoto2.photo_big.dc_id = i110;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i111 = userProfilePhoto2.dc_id;
                                        if (i111 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i111;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j5 = chatEditActivity19.chatId;
                            TextCell textCell15 = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell15 != null && textCell15.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                            if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
            if (!ChatObject.isChannelAndNotMegaGroup(chatEditActivity.currentChat)) {
                TextCell textCell15 = new TextCell(context2);
                chatEditActivity.memberRequestsCell = textCell15;
                textCell15.setBackground(Theme.getSelectorDrawable(r13));
                final int i27 = 4;
                chatEditActivity.memberRequestsCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view) throws Throwable {
                        switch (i27) {
                            case 0:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                                groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                                groupColorActivity.bulletinFragment = chatEditActivity4;
                                chatEditActivity4.presentFragment(groupColorActivity);
                                break;
                            case 1:
                                ChatEditActivity chatEditActivity5 = this.f$0;
                                chatEditActivity5.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", chatEditActivity5.chatId);
                                bundle.putInt("type", 1);
                                ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                                chatUsersActivity.setInfo(chatEditActivity5.info);
                                chatEditActivity5.presentFragment(chatUsersActivity);
                                break;
                            case 2:
                                ChatEditActivity chatEditActivity6 = this.f$0;
                                if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                    long j4 = chatEditActivity6.userId;
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                    if (user2 == null) {
                                        TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                        TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                            int i110 = chatPhoto2.dc_id;
                                            if (i110 != 0) {
                                                chatPhoto2.photo_big.dc_id = i110;
                                            }
                                            TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                                }
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i111 = userProfilePhoto2.dc_id;
                                            if (i111 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i111;
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                ChatEditActivity chatEditActivity7 = this.f$0;
                                chatEditActivity7.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", chatEditActivity7.chatId);
                                bundle2.putInt("type", 2);
                                ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                                chatUsersActivity2.setInfo(chatEditActivity7.info);
                                chatEditActivity7.presentFragment(chatUsersActivity2);
                                break;
                            case 4:
                                ChatEditActivity chatEditActivity8 = this.f$0;
                                chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                                break;
                            case 5:
                                ChatEditActivity chatEditActivity9 = this.f$0;
                                chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                                break;
                            case 6:
                                ChatEditActivity chatEditActivity10 = this.f$0;
                                chatEditActivity10.getClass();
                                chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                                break;
                            case 7:
                                ChatEditActivity chatEditActivity11 = this.f$0;
                                chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                                break;
                            case 8:
                                ChatEditActivity chatEditActivity12 = this.f$0;
                                chatEditActivity12.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", chatEditActivity12.userId);
                                chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                                break;
                            case 9:
                                ChatEditActivity chatEditActivity13 = this.f$0;
                                chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                                break;
                            case 10:
                                ChatEditActivity chatEditActivity14 = this.f$0;
                                chatEditActivity14.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                                break;
                            case 11:
                                ChatEditActivity chatEditActivity15 = this.f$0;
                                chatEditActivity15.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                                break;
                            case 12:
                                ChatEditActivity chatEditActivity16 = this.f$0;
                                chatEditActivity16.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                                break;
                            case 13:
                                this.f$0.openSetPhotoAlert();
                                break;
                            case 14:
                                this.f$0.lambda$createView$43$1();
                                break;
                            case 15:
                                ChatEditActivity chatEditActivity17 = this.f$0;
                                AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                                break;
                            case 16:
                                ChatEditActivity chatEditActivity18 = this.f$0;
                                if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                    LocationActivity locationActivity = new LocationActivity(4);
                                    locationActivity.dialogId = -chatEditActivity18.chatId;
                                    TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                    chatEditActivity18.presentFragment(locationActivity);
                                    break;
                                }
                                break;
                            case 17:
                                ChatEditActivity chatEditActivity19 = this.f$0;
                                long j5 = chatEditActivity19.chatId;
                                TextCell textCell16 = chatEditActivity19.locationCell;
                                ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell16 != null && textCell16.getVisibility() == 0);
                                TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                                chatEditTypeActivity.info = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        chatEditTypeActivity.invite = tL_chatInviteExported;
                                    } else {
                                        chatEditTypeActivity.generateLink(false);
                                    }
                                }
                                chatEditActivity19.presentFragment(chatEditTypeActivity);
                                break;
                            case 18:
                                ChatEditActivity chatEditActivity20 = this.f$0;
                                ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                                chatLinkActivity.info = chatEditActivity20.info;
                                chatEditActivity20.presentFragment(chatLinkActivity);
                                break;
                            case 19:
                                ChatEditActivity chatEditActivity21 = this.f$0;
                                PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                                postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                                chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                                break;
                            case 20:
                                this.f$0.lambda$createView$12$2();
                                break;
                            case 21:
                                ChatEditActivity chatEditActivity22 = this.f$0;
                                chatEditActivity22.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", chatEditActivity22.chatId);
                                bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                                ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                                chatUsersActivity3.setInfo(chatEditActivity22.info);
                                chatEditActivity22.presentFragment(chatUsersActivity3);
                                break;
                            case 22:
                                ChatEditActivity chatEditActivity23 = this.f$0;
                                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                                TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                                manageLinksActivity.info = chatFull7;
                                manageLinksActivity.invite = tL_chatInviteExported2;
                                manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                                manageLinksActivity.loadLinks(true);
                                chatEditActivity23.presentFragment(manageLinksActivity);
                                break;
                            case 23:
                                ChatEditActivity chatEditActivity24 = this.f$0;
                                if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                    chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                    ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                    TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                    chatReactionsEditActivity.info = chatFull8;
                                    if (chatFull8 != null) {
                                        if (chatReactionsEditActivity.currentChat == null) {
                                            chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                        }
                                        chatReactionsEditActivity.chatReactions = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            chatReactionsEditActivity.startFromType = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            chatReactionsEditActivity.startFromType = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                                if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                    chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                                }
                                            }
                                            chatReactionsEditActivity.startFromType = 1;
                                        }
                                    }
                                    chatEditActivity24.presentFragment(chatReactionsEditActivity);
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity25 = this.f$0;
                                chatEditActivity25.getClass();
                                Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                                bundleM.putLong("chat_id", chatEditActivity25.chatId);
                                bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                                chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                                break;
                        }
                    }
                });
            }
            TextCell textCell16 = new TextCell(context2);
            chatEditActivity.channelAffiliateProgramsCell = textCell16;
            textCell16.setTextAndIcon(R.drawable.menu_feature_premium, applyNewSpan(LocaleController.getString(R.string.ChannelAffiliatePrograms)), (boolean) r13);
            chatEditActivity.channelAffiliateProgramsCell.setBackground(Theme.getSelectorDrawable(r13));
            chatEditActivity.channelAffiliateProgramsCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i2) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j4 = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                if (user2 == null) {
                                    TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                        int i110 = chatPhoto2.dc_id;
                                        if (i110 != 0) {
                                            chatPhoto2.photo_big.dc_id = i110;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i111 = userProfilePhoto2.dc_id;
                                        if (i111 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i111;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j5 = chatEditActivity19.chatId;
                            TextCell textCell17 = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell17 != null && textCell17.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                            if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
            chatEditActivity.channelAffiliateProgramsCell.setVisibility(8);
            if (ChatObject.isChannel(chatEditActivity.currentChat) || chatEditActivity.currentChat.gigagroup) {
                TextCell textCell17 = new TextCell(context2);
                chatEditActivity.logCell = textCell17;
                textCell17.setTextAndIcon(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), (boolean) r13);
                chatEditActivity.logCell.setBackground(Theme.getSelectorDrawable(r13));
                final int i28 = 6;
                chatEditActivity.logCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view) throws Throwable {
                        switch (i28) {
                            case 0:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                                groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                                groupColorActivity.bulletinFragment = chatEditActivity4;
                                chatEditActivity4.presentFragment(groupColorActivity);
                                break;
                            case 1:
                                ChatEditActivity chatEditActivity5 = this.f$0;
                                chatEditActivity5.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", chatEditActivity5.chatId);
                                bundle.putInt("type", 1);
                                ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                                chatUsersActivity.setInfo(chatEditActivity5.info);
                                chatEditActivity5.presentFragment(chatUsersActivity);
                                break;
                            case 2:
                                ChatEditActivity chatEditActivity6 = this.f$0;
                                if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                    long j4 = chatEditActivity6.userId;
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                    if (user2 == null) {
                                        TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                        TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                            int i110 = chatPhoto2.dc_id;
                                            if (i110 != 0) {
                                                chatPhoto2.photo_big.dc_id = i110;
                                            }
                                            TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                                }
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i111 = userProfilePhoto2.dc_id;
                                            if (i111 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i111;
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                ChatEditActivity chatEditActivity7 = this.f$0;
                                chatEditActivity7.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", chatEditActivity7.chatId);
                                bundle2.putInt("type", 2);
                                ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                                chatUsersActivity2.setInfo(chatEditActivity7.info);
                                chatEditActivity7.presentFragment(chatUsersActivity2);
                                break;
                            case 4:
                                ChatEditActivity chatEditActivity8 = this.f$0;
                                chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                                break;
                            case 5:
                                ChatEditActivity chatEditActivity9 = this.f$0;
                                chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                                break;
                            case 6:
                                ChatEditActivity chatEditActivity10 = this.f$0;
                                chatEditActivity10.getClass();
                                chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                                break;
                            case 7:
                                ChatEditActivity chatEditActivity11 = this.f$0;
                                chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                                break;
                            case 8:
                                ChatEditActivity chatEditActivity12 = this.f$0;
                                chatEditActivity12.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", chatEditActivity12.userId);
                                chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                                break;
                            case 9:
                                ChatEditActivity chatEditActivity13 = this.f$0;
                                chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                                break;
                            case 10:
                                ChatEditActivity chatEditActivity14 = this.f$0;
                                chatEditActivity14.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                                break;
                            case 11:
                                ChatEditActivity chatEditActivity15 = this.f$0;
                                chatEditActivity15.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                                break;
                            case 12:
                                ChatEditActivity chatEditActivity16 = this.f$0;
                                chatEditActivity16.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                                break;
                            case 13:
                                this.f$0.openSetPhotoAlert();
                                break;
                            case 14:
                                this.f$0.lambda$createView$43$1();
                                break;
                            case 15:
                                ChatEditActivity chatEditActivity17 = this.f$0;
                                AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                                break;
                            case 16:
                                ChatEditActivity chatEditActivity18 = this.f$0;
                                if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                    LocationActivity locationActivity = new LocationActivity(4);
                                    locationActivity.dialogId = -chatEditActivity18.chatId;
                                    TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                    chatEditActivity18.presentFragment(locationActivity);
                                    break;
                                }
                                break;
                            case 17:
                                ChatEditActivity chatEditActivity19 = this.f$0;
                                long j5 = chatEditActivity19.chatId;
                                TextCell textCell18 = chatEditActivity19.locationCell;
                                ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell18 != null && textCell18.getVisibility() == 0);
                                TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                                chatEditTypeActivity.info = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        chatEditTypeActivity.invite = tL_chatInviteExported;
                                    } else {
                                        chatEditTypeActivity.generateLink(false);
                                    }
                                }
                                chatEditActivity19.presentFragment(chatEditTypeActivity);
                                break;
                            case 18:
                                ChatEditActivity chatEditActivity20 = this.f$0;
                                ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                                chatLinkActivity.info = chatEditActivity20.info;
                                chatEditActivity20.presentFragment(chatLinkActivity);
                                break;
                            case 19:
                                ChatEditActivity chatEditActivity21 = this.f$0;
                                PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                                postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                                chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                                break;
                            case 20:
                                this.f$0.lambda$createView$12$2();
                                break;
                            case 21:
                                ChatEditActivity chatEditActivity22 = this.f$0;
                                chatEditActivity22.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", chatEditActivity22.chatId);
                                bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                                ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                                chatUsersActivity3.setInfo(chatEditActivity22.info);
                                chatEditActivity22.presentFragment(chatUsersActivity3);
                                break;
                            case 22:
                                ChatEditActivity chatEditActivity23 = this.f$0;
                                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                                TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                                manageLinksActivity.info = chatFull7;
                                manageLinksActivity.invite = tL_chatInviteExported2;
                                manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                                manageLinksActivity.loadLinks(true);
                                chatEditActivity23.presentFragment(manageLinksActivity);
                                break;
                            case 23:
                                ChatEditActivity chatEditActivity24 = this.f$0;
                                if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                    chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                    ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                    TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                    chatReactionsEditActivity.info = chatFull8;
                                    if (chatFull8 != null) {
                                        if (chatReactionsEditActivity.currentChat == null) {
                                            chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                        }
                                        chatReactionsEditActivity.chatReactions = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            chatReactionsEditActivity.startFromType = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            chatReactionsEditActivity.startFromType = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                                if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                    chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                                }
                                            }
                                            chatReactionsEditActivity.startFromType = 1;
                                        }
                                    }
                                    chatEditActivity24.presentFragment(chatReactionsEditActivity);
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity25 = this.f$0;
                                chatEditActivity25.getClass();
                                Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                                bundleM.putLong("chat_id", chatEditActivity25.chatId);
                                bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                                chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isBoostSupported(chatEditActivity.currentChat)) {
                TextCell textCell18 = new TextCell(context2);
                chatEditActivity.statsAndBoosts = textCell18;
                textCell18.setTextAndIcon(R.drawable.msg_stats, (CharSequence) LocaleController.getString(R.string.StatisticsAndBoosts), (boolean) i);
                chatEditActivity.statsAndBoosts.setBackground(Theme.getSelectorDrawable(r13));
                final int i29 = 7;
                chatEditActivity.statsAndBoosts.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view) throws Throwable {
                        switch (i29) {
                            case 0:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                                groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                                groupColorActivity.bulletinFragment = chatEditActivity4;
                                chatEditActivity4.presentFragment(groupColorActivity);
                                break;
                            case 1:
                                ChatEditActivity chatEditActivity5 = this.f$0;
                                chatEditActivity5.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", chatEditActivity5.chatId);
                                bundle.putInt("type", 1);
                                ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                                chatUsersActivity.setInfo(chatEditActivity5.info);
                                chatEditActivity5.presentFragment(chatUsersActivity);
                                break;
                            case 2:
                                ChatEditActivity chatEditActivity6 = this.f$0;
                                if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                    long j4 = chatEditActivity6.userId;
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                    if (user2 == null) {
                                        TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                        TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                            int i110 = chatPhoto2.dc_id;
                                            if (i110 != 0) {
                                                chatPhoto2.photo_big.dc_id = i110;
                                            }
                                            TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                                }
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i111 = userProfilePhoto2.dc_id;
                                            if (i111 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i111;
                                            }
                                            PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                ChatEditActivity chatEditActivity7 = this.f$0;
                                chatEditActivity7.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", chatEditActivity7.chatId);
                                bundle2.putInt("type", 2);
                                ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                                chatUsersActivity2.setInfo(chatEditActivity7.info);
                                chatEditActivity7.presentFragment(chatUsersActivity2);
                                break;
                            case 4:
                                ChatEditActivity chatEditActivity8 = this.f$0;
                                chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                                break;
                            case 5:
                                ChatEditActivity chatEditActivity9 = this.f$0;
                                chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                                break;
                            case 6:
                                ChatEditActivity chatEditActivity10 = this.f$0;
                                chatEditActivity10.getClass();
                                chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                                break;
                            case 7:
                                ChatEditActivity chatEditActivity11 = this.f$0;
                                chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                                break;
                            case 8:
                                ChatEditActivity chatEditActivity12 = this.f$0;
                                chatEditActivity12.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", chatEditActivity12.userId);
                                chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                                break;
                            case 9:
                                ChatEditActivity chatEditActivity13 = this.f$0;
                                chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                                break;
                            case 10:
                                ChatEditActivity chatEditActivity14 = this.f$0;
                                chatEditActivity14.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                                break;
                            case 11:
                                ChatEditActivity chatEditActivity15 = this.f$0;
                                chatEditActivity15.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                                break;
                            case 12:
                                ChatEditActivity chatEditActivity16 = this.f$0;
                                chatEditActivity16.getClass();
                                Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                                break;
                            case 13:
                                this.f$0.openSetPhotoAlert();
                                break;
                            case 14:
                                this.f$0.lambda$createView$43$1();
                                break;
                            case 15:
                                ChatEditActivity chatEditActivity17 = this.f$0;
                                AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                                break;
                            case 16:
                                ChatEditActivity chatEditActivity18 = this.f$0;
                                if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                    LocationActivity locationActivity = new LocationActivity(4);
                                    locationActivity.dialogId = -chatEditActivity18.chatId;
                                    TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                    chatEditActivity18.presentFragment(locationActivity);
                                    break;
                                }
                                break;
                            case 17:
                                ChatEditActivity chatEditActivity19 = this.f$0;
                                long j5 = chatEditActivity19.chatId;
                                TextCell textCell19 = chatEditActivity19.locationCell;
                                ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell19 != null && textCell19.getVisibility() == 0);
                                TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                                chatEditTypeActivity.info = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        chatEditTypeActivity.invite = tL_chatInviteExported;
                                    } else {
                                        chatEditTypeActivity.generateLink(false);
                                    }
                                }
                                chatEditActivity19.presentFragment(chatEditTypeActivity);
                                break;
                            case 18:
                                ChatEditActivity chatEditActivity20 = this.f$0;
                                ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                                chatLinkActivity.info = chatEditActivity20.info;
                                chatEditActivity20.presentFragment(chatLinkActivity);
                                break;
                            case 19:
                                ChatEditActivity chatEditActivity21 = this.f$0;
                                PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                                postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                                chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                                break;
                            case 20:
                                this.f$0.lambda$createView$12$2();
                                break;
                            case 21:
                                ChatEditActivity chatEditActivity22 = this.f$0;
                                chatEditActivity22.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", chatEditActivity22.chatId);
                                bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                                ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                                chatUsersActivity3.setInfo(chatEditActivity22.info);
                                chatEditActivity22.presentFragment(chatUsersActivity3);
                                break;
                            case 22:
                                ChatEditActivity chatEditActivity23 = this.f$0;
                                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                                TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                                manageLinksActivity.info = chatFull7;
                                manageLinksActivity.invite = tL_chatInviteExported2;
                                manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                                manageLinksActivity.loadLinks(true);
                                chatEditActivity23.presentFragment(manageLinksActivity);
                                break;
                            case 23:
                                ChatEditActivity chatEditActivity24 = this.f$0;
                                if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                    chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                    ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                    TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                    chatReactionsEditActivity.info = chatFull8;
                                    if (chatFull8 != null) {
                                        if (chatReactionsEditActivity.currentChat == null) {
                                            chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                        }
                                        chatReactionsEditActivity.chatReactions = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            chatReactionsEditActivity.startFromType = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            chatReactionsEditActivity.startFromType = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                                if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                    chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                                }
                                            }
                                            chatReactionsEditActivity.startFromType = 1;
                                        }
                                    }
                                    chatEditActivity24.presentFragment(chatReactionsEditActivity);
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity25 = this.f$0;
                                chatEditActivity25.getClass();
                                Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                                bundleM.putLong("chat_id", chatEditActivity25.chatId);
                                bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                                chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                                break;
                        }
                    }
                });
            }
            chatEditActivity.infoContainer.addView(chatEditActivity.reactionsCell, LayoutHelper.createLinear(-1, -2));
            TextCell textCell19 = chatEditActivity.welcomeMessagesCell;
            if (textCell19 != null) {
                chatEditActivity.infoContainer.addView(textCell19, LayoutHelper.createLinear(-1, -2));
            }
            if (!chatEditActivity.isChannel && !chatEditActivity.currentChat.gigagroup) {
                chatEditActivity.infoContainer.addView(chatEditActivity.blockCell, LayoutHelper.createLinear(-1, -2));
            }
            if (!chatEditActivity.isChannel) {
                chatEditActivity.infoContainer.addView(chatEditActivity.inviteLinksCell, LayoutHelper.createLinear(-1, -2));
            }
            chatEditActivity.infoContainer.addView(chatEditActivity.adminCell, LayoutHelper.createLinear(-1, -2));
            chatEditActivity.infoContainer.addView(chatEditActivity.membersCell, LayoutHelper.createLinear(-1, -2));
            TextCell textCell20 = chatEditActivity.memberRequestsCell;
            if (textCell20 != null && (chatFull = chatEditActivity.info) != null && chatFull.requests_pending > 0) {
                chatEditActivity.infoContainer.addView(textCell20, LayoutHelper.createLinear(-1, -2));
            }
            if (chatEditActivity.isChannel) {
                chatEditActivity.infoContainer.addView(chatEditActivity.inviteLinksCell, LayoutHelper.createLinear(-1, -2));
            }
            if (chatEditActivity.isChannel || chatEditActivity.currentChat.gigagroup) {
                chatEditActivity.infoContainer.addView(chatEditActivity.blockCell, LayoutHelper.createLinear(-1, -2));
            }
            TextCell textCell21 = chatEditActivity.statsAndBoosts;
            if (textCell21 != null) {
                chatEditActivity.infoContainer.addView(textCell21, LayoutHelper.createLinear(-1, -2));
            }
            TextCell textCell22 = chatEditActivity.logCell;
            if (textCell22 != null) {
                chatEditActivity.infoContainer.addView(textCell22, LayoutHelper.createLinear(-1, -2));
            }
            TextCell textCell23 = chatEditActivity.channelAffiliateProgramsCell;
            if (textCell23 != null) {
                chatEditActivity.infoContainer.addView(textCell23, LayoutHelper.createLinear(-1, -2));
            }
            if (chatEditActivity.channelAffiliateProgramsCell != null && chatEditActivity.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(chatEditActivity.currentChat)) {
                chatEditActivity.channelAffiliateProgramsCell.setVisibility(r13);
            }
            TextCell textCell24 = chatEditActivity.logCell;
            if (textCell24 != null) {
                TextCell textCell25 = chatEditActivity.channelAffiliateProgramsCell;
                textCell24.setNeedDivider(textCell25 != null && textCell25.getVisibility() == 0);
            }
        }
        if (chatEditActivity.currentUser != null) {
            TextCell textCell26 = new TextCell(context2);
            chatEditActivity.publicLinkCell = textCell26;
            textCell26.setBackground(Theme.getSelectorDrawable(r13));
            chatEditActivity.publicLinkCell.setPrioritizeTitleOverValue(i);
            chatEditActivity.infoContainer.addView(chatEditActivity.publicLinkCell, LayoutHelper.createLinear(-1, -2));
            final int i30 = 8;
            chatEditActivity.publicLinkCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i30) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j4 = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                if (user2 == null) {
                                    TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                        int i110 = chatPhoto2.dc_id;
                                        if (i110 != 0) {
                                            chatPhoto2.photo_big.dc_id = i110;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i111 = userProfilePhoto2.dc_id;
                                        if (i111 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i111;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j5 = chatEditActivity19.chatId;
                            TextCell textCell110 = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell110 != null && textCell110.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                            if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
            chatEditActivity.updatePublicLinksCount();
            TextCell textCell27 = new TextCell(context2);
            chatEditActivity.botAffiliateProgramCell = textCell27;
            textCell27.setBackground(Theme.getSelectorDrawable(r13));
            chatEditActivity.botAffiliateProgramCell.setTextAndValueAndIcon(R.drawable.msg_shareout, (CharSequence) applyNewSpan(LocaleController.getString(R.string.AffiliateProgramBot)), (CharSequence) "", (boolean) i);
            chatEditActivity.infoContainer.addView(chatEditActivity.botAffiliateProgramCell, LayoutHelper.createLinear(-1, -2));
            final int i31 = 9;
            chatEditActivity.botAffiliateProgramCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i31) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j4 = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                if (user2 == null) {
                                    TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                        int i110 = chatPhoto2.dc_id;
                                        if (i110 != 0) {
                                            chatPhoto2.photo_big.dc_id = i110;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i111 = userProfilePhoto2.dc_id;
                                        if (i111 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i111;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j5 = chatEditActivity19.chatId;
                            TextCell textCell110 = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell110 != null && textCell110.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                            if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
            chatEditActivity.botAffiliateProgramCell.setDrawLoading(45, chatEditActivity.userInfo == null, r13);
            TLRPC.UserFull userFull = chatEditActivity.userInfo;
            if (userFull != null) {
                TextCell textCell28 = chatEditActivity.botAffiliateProgramCell;
                TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                if (starrefprogram == null) {
                    string = LocaleController.getString(R.string.AffiliateProgramBotOff);
                } else {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[i];
                    objArr[r13] = Float.valueOf(starrefprogram.commission_permille / 10.0f);
                    string = String.format(locale, "%.1f%%", objArr);
                }
                textCell28.setValue(string, r13);
            }
            if (!chatEditActivity.getMessagesController().starrefProgramAllowed) {
                chatEditActivity.botAffiliateProgramCell.setVisibility(8);
            }
            TextCell textCell29 = new TextCell(context2);
            chatEditActivity.editIntroCell = textCell29;
            textCell29.setBackground(Theme.getSelectorDrawable(r13));
            chatEditActivity.editIntroCell.setTextAndIcon(R.drawable.msg_log, (CharSequence) LocaleController.getString(R.string.BotEditIntro), (boolean) i);
            chatEditActivity.infoContainer.addView(chatEditActivity.editIntroCell, LayoutHelper.createLinear(-1, -2));
            final int i32 = 10;
            chatEditActivity.editIntroCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i32) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j4 = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                if (user2 == null) {
                                    TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                        int i110 = chatPhoto2.dc_id;
                                        if (i110 != 0) {
                                            chatPhoto2.photo_big.dc_id = i110;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i111 = userProfilePhoto2.dc_id;
                                        if (i111 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i111;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j5 = chatEditActivity19.chatId;
                            TextCell textCell110 = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell110 != null && textCell110.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                            if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
            TextCell textCell30 = new TextCell(context2);
            chatEditActivity.editCommandsCell = textCell30;
            textCell30.setBackground(Theme.getSelectorDrawable(r13));
            chatEditActivity.editCommandsCell.setTextAndIcon(R.drawable.msg_media, (CharSequence) LocaleController.getString(R.string.BotEditCommands), (boolean) i);
            chatEditActivity.infoContainer.addView(chatEditActivity.editCommandsCell, LayoutHelper.createLinear(-1, -2));
            final int i33 = 11;
            chatEditActivity.editCommandsCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i33) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j4 = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                if (user2 == null) {
                                    TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                        int i110 = chatPhoto2.dc_id;
                                        if (i110 != 0) {
                                            chatPhoto2.photo_big.dc_id = i110;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i111 = userProfilePhoto2.dc_id;
                                        if (i111 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i111;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j5 = chatEditActivity19.chatId;
                            TextCell textCell110 = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell110 != null && textCell110.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                            if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
            TextCell textCell31 = new TextCell(context2);
            chatEditActivity.changeBotSettingsCell = textCell31;
            textCell31.setBackground(Theme.getSelectorDrawable(r13));
            chatEditActivity.changeBotSettingsCell.setTextAndIcon(R.drawable.msg_bot, (CharSequence) LocaleController.getString(R.string.BotChangeSettings), (boolean) i);
            chatEditActivity.infoContainer.addView(chatEditActivity.changeBotSettingsCell, LayoutHelper.createLinear(-1, -2));
            final int i34 = 12;
            chatEditActivity.changeBotSettingsCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i34) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j4 = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                if (user2 == null) {
                                    TLRPC.Chat chat4 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                        int i110 = chatPhoto2.dc_id;
                                        if (i110 != 0) {
                                            chatPhoto2.photo_big.dc_id = i110;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i111 = userProfilePhoto2.dc_id;
                                        if (i111 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i111;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j5 = chatEditActivity19.chatId;
                            TextCell textCell110 = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell110 != null && textCell110.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                            if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat4 = chatEditActivity.currentChat;
        if (chat4 != null) {
            if (!ChatObject.hasAdminRights(chat4)) {
                chatEditActivity.infoContainer.setVisibility(8);
                chatEditActivity.settingsTopSectionCell.setVisibility(8);
            }
            viewGroup2.addView(new ShadowSectionCell(context2), LayoutHelper.createLinear(-1, -2));
        } else if (chatEditActivity.currentUser != null) {
            chatEditActivity.botInfoCell = new TextInfoPrivacyCell(context2, 12, chatEditActivity.resourceProvider);
            String string2 = LocaleController.getString(R.string.BotManageInfo);
            SpannableString spannableStringValueOf = SpannableString.valueOf(string2);
            int iIndexOf = string2.indexOf("@BotFather");
            if (iIndexOf != -1) {
                spannableStringValueOf.setSpan(new AnonymousClass9(r13), iIndexOf, iIndexOf + 10, 33);
            }
            chatEditActivity.botInfoCell.setText(spannableStringValueOf);
            viewGroup2.addView(chatEditActivity.botInfoCell, LayoutHelper.createLinear(-1, -2));
            TextCell textCell32 = new TextCell(context2);
            chatEditActivity.verifyCell = textCell32;
            textCell32.setBackground(Theme.getSelectorDrawable(i));
            chatEditActivity.verifyCell.setTextAndIcon(R.drawable.menu_factcheck, LocaleController.getString(R.string.BotVerifyAccounts), (boolean) r13);
            TextCell textCell33 = chatEditActivity.verifyCell;
            int i35 = Theme.key_windowBackgroundWhiteBlueText4;
            textCell33.setColors(i35, i35);
            viewGroup2.addView(chatEditActivity.verifyCell, LayoutHelper.createLinear(-1, -2));
            final int i36 = 14;
            chatEditActivity.verifyCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i36) {
                        case 0:
                            ChatEditActivity chatEditActivity4 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity4.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity4.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity4;
                            chatEditActivity4.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity5 = this.f$0;
                            chatEditActivity5.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity5.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity5.info);
                            chatEditActivity5.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            if (!chatEditActivity6.imageUpdater.isUploadingImage()) {
                                long j4 = chatEditActivity6.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user2 = j4 == 0 ? null : chatEditActivity6.getMessagesController().getUser(Long.valueOf(j4));
                                if (user2 == null) {
                                    TLRPC.Chat chat5 = chatEditActivity6.getMessagesController().getChat(Long.valueOf(chatEditActivity6.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat5.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat5.photo;
                                        int i110 = chatPhoto2.dc_id;
                                        if (i110 != 0) {
                                            chatPhoto2.photo_big.dc_id = i110;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity6.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity6.info.chat_photo.video_sizes.get(0), chatEditActivity6.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat5.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity6, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i111 = userProfilePhoto2.dc_id;
                                        if (i111 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i111;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user2.photo.photo_big, null, null, null, null, null, 0, chatEditActivity6.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity7.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            chatEditActivity8.presentFragment(new MemberRequestsActivity(chatEditActivity8.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity9.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.getClass();
                            chatEditActivity10.presentFragment(new ChannelAdminLogActivity(chatEditActivity10.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(StatisticActivity.create(chatEditActivity11.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity12.userId);
                            chatEditActivity12.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(new AffiliateProgramFragment(chatEditActivity13.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity14.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity15.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity17, false, chatEditActivity17.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity17, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity18)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity18.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity18.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity18, 7);
                                chatEditActivity18.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            long j5 = chatEditActivity19.chatId;
                            TextCell textCell110 = chatEditActivity19.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j5, textCell110 != null && textCell110.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity19.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity19.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                            if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context2, 12, chatEditActivity.resourceProvider);
            chatEditActivity.verifyInfoCell = textInfoPrivacyCell2;
            textInfoPrivacyCell2.setFixedSize(12);
            viewGroup2.addView(chatEditActivity.verifyInfoCell, LayoutHelper.createLinear(-1, -2));
            TextCell textCell34 = chatEditActivity.verifyCell;
            TLRPC.UserFull userFull2 = chatEditActivity.userInfo;
            textCell34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            TextInfoPrivacyCell textInfoPrivacyCell3 = chatEditActivity.verifyInfoCell;
            TLRPC.UserFull userFull3 = chatEditActivity.userInfo;
            textInfoPrivacyCell3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = chatEditActivity.currentUser;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout5 = new LinearLayout(context2);
                chatEditActivity.balanceContainer = linearLayout5;
                linearLayout5.setOrientation(i);
                viewGroup2.addView(chatEditActivity.balanceContainer, LayoutHelper.createLinear(-1, -2));
                HeaderCell headerCell = new HeaderCell(context2);
                headerCell.setText(LocaleController.getString(R.string.BotBalance));
                chatEditActivity.balanceContainer.addView(headerCell, LayoutHelper.createLinear(-1, -2));
                TextCell textCell35 = new TextCell(context2);
                chatEditActivity.tonBalanceCell = textCell35;
                textCell35.setBackground(Theme.getSelectorDrawable(r13));
                chatEditActivity.tonBalanceCell.setPrioritizeTitleOverValue(i);
                chatEditActivity.balanceContainer.addView(chatEditActivity.tonBalanceCell, LayoutHelper.createLinear(-1, -2));
                final BotStarsController botStarsController = BotStarsController.getInstance(chatEditActivity.currentAccount);
                chatEditActivity.tonBalanceCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r13) {
                            case 0:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                long j4 = chatEditActivity4.userId;
                                if (botStarsController.getStarsRevenueStats(j4, false) != null) {
                                    chatEditActivity4.presentFragment(new BotStarsActivity(1, j4));
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity5 = this.f$0;
                                long j5 = chatEditActivity5.userId;
                                if (botStarsController.getStarsRevenueStats(j5, false) != null) {
                                    chatEditActivity5.presentFragment(new BotStarsActivity(0, j5));
                                }
                                break;
                        }
                    }
                });
                ViewGroup viewGroup4 = viewGroup2;
                long j4 = j;
                if (botStarsController.isTONBalanceAvailable(j4)) {
                    long tONBalance = botStarsController.getTONBalance(j4);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (tONBalance > 0) {
                        double d = tONBalance / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, r13));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(r13);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                        }
                    }
                    chatEditActivity.tonBalanceCell.setTextAndValueAndIcon(R.drawable.outline_gram_24, (CharSequence) LocaleController.getString(R.string.BotBalanceTON), (CharSequence) spannableStringBuilder, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new LoadingSpan(AndroidUtilities.dp(f), chatEditActivity.tonBalanceCell.valueTextView), r13, spannableStringBuilder2.length(), 33);
                    chatEditActivity.tonBalanceCell.setTextAndValueAndIcon(R.drawable.outline_gram_24, LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder2, (boolean) r13);
                }
                chatEditActivity.tonBalanceCell.setVisibility(botStarsController.botHasTON(j4) ? 0 : 8);
                TextCell textCell36 = new TextCell(context2);
                chatEditActivity.starsBalanceCell = textCell36;
                textCell36.setBackground(Theme.getSelectorDrawable(r13));
                final int i37 = 1;
                chatEditActivity.starsBalanceCell.setPrioritizeTitleOverValue(true);
                chatEditActivity.balanceContainer.addView(chatEditActivity.starsBalanceCell, LayoutHelper.createLinear(-1, -2));
                chatEditActivity.starsBalanceCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i37) {
                            case 0:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                long j5 = chatEditActivity4.userId;
                                if (botStarsController.getStarsRevenueStats(j5, false) != null) {
                                    chatEditActivity4.presentFragment(new BotStarsActivity(1, j5));
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity5 = this.f$0;
                                long j6 = chatEditActivity5.userId;
                                if (botStarsController.getStarsRevenueStats(j6, false) != null) {
                                    chatEditActivity5.presentFragment(new BotStarsActivity(0, j6));
                                }
                                break;
                        }
                    }
                });
                if (botStarsController.getStarsRevenueStats(j4, r13) != null) {
                    TextCell textCell37 = chatEditActivity.starsBalanceCell;
                    String string3 = LocaleController.getString(R.string.BotBalanceStars);
                    if (botStarsController.getBotStarsBalance(j4).amount > 0) {
                        SpannableStringBuilder starsAmountShort = StarsIntroActivity.formatStarsAmountShort(botStarsController.getBotStarsBalance(j4), 0.85f, ' ');
                        CharSequence[] charSequenceArr = new CharSequence[2];
                        charSequenceArr[r13] = "XTR";
                        charSequenceArr[1] = starsAmountShort;
                        charSequenceReplaceStarsWithPlain = StarsIntroActivity.replaceStarsWithPlain(r13, TextUtils.concat(charSequenceArr), 0.85f, null);
                    }
                    textCell37.setTextAndValueAndIcon(R.drawable.menu_premium_main, string3, charSequenceReplaceStarsWithPlain, (boolean) r13);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new LoadingSpan(AndroidUtilities.dp(f), chatEditActivity.starsBalanceCell.valueTextView), r13, spannableStringBuilder3.length(), 33);
                    chatEditActivity.starsBalanceCell.setTextAndValueAndIcon(R.drawable.menu_premium_main, LocaleController.getString(R.string.BotBalanceStars), spannableStringBuilder3, (boolean) r13);
                }
                chatEditActivity.starsBalanceCell.setVisibility(botStarsController.botHasStars(j4) ? 0 : 8);
                TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context2, 12, chatEditActivity.getResourceProvider());
                textInfoPrivacyCell4.setFixedSize(12);
                textInfoPrivacyCell4.setTag(R.id.fit_width_tag, 1);
                viewGroup2 = viewGroup4;
                viewGroup2.addView(textInfoPrivacyCell4, LayoutHelper.createLinear(-1, 12));
                chatEditActivity.balanceContainer.setVisibility((chatEditActivity.starsBalanceCell.getVisibility() == 0 || chatEditActivity.tonBalanceCell.getVisibility() == 0) ? 0 : 8);
            }
        }
        TLRPC.Chat chat5 = chatEditActivity.currentChat;
        if ((chat5 == null || !chat5.creator) && !((user = chatEditActivity.currentUser) != null && user.bot && user.bot_can_edit)) {
            viewGroup3 = viewGroup2;
            chatEditActivity2 = chatEditActivity;
        } else {
            final long j5 = chat5 != null ? chat5.linked_community_id : chatEditActivity.currentUser.linked_community_id;
            long j6 = chat5 != null ? -chat5.id : chatEditActivity.currentUser.id;
            boolean z7 = chatEditActivity.currentUser != null;
            if (j5 != 0) {
                CommunityLinkView2 communityLinkView2 = new CommunityLinkView2(context2, chatEditActivity.resourceProvider);
                chatEditActivity.communityLinkView = communityLinkView2;
                communityLinkView2.setChat(chatEditActivity.currentAccount, chatEditActivity.getMessagesController().getChat(Long.valueOf(j5)));
                chatEditActivity.communityLinkView.setBackground(Theme.getSelectorDrawable(r13));
                chatEditActivity.communityLinkView.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r13) {
                            case 0:
                                ChatEditActivity chatEditActivity4 = this.f$0;
                                MessagesController messagesController = chatEditActivity4.getMessagesController();
                                long j7 = j5;
                                if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j7)))) {
                                    chatEditActivity4.showDialog(new CommunitySheet(chatEditActivity4, j7, null, null));
                                } else {
                                    chatEditActivity4.presentFragment(new CommunityEditActivity(FBool.m(j7, "community_id")));
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity5 = this.f$0;
                                chatEditActivity5.getClass();
                                chatEditActivity5.presentFragment(new CommunityCreateActivity(FBool.m(j5, "dialog_id")));
                                break;
                        }
                    }
                });
                viewGroup2.addView(chatEditActivity.communityLinkView, LayoutHelper.createLinear(-1, -2));
                TextCell textCell38 = new TextCell(context2);
                chatEditActivity.communityUnlinkCell = textCell38;
                if (z7) {
                    i5 = R.string.CommunityRemoveBotFromCommunity;
                } else {
                    i5 = chatEditActivity.isChannel ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity;
                }
                textCell38.setTextAndIcon(R.drawable.outline_community_remove_24, LocaleController.getString(i5), (boolean) r13);
                TextCell textCell39 = chatEditActivity.communityUnlinkCell;
                int i38 = Theme.key_text_RedRegular;
                textCell39.setColors(i38, i38);
                chatEditActivity.communityUnlinkCell.setBackground(Theme.getSelectorDrawable(r13));
                ViewGroup viewGroup5 = viewGroup2;
                final boolean z8 = z7;
                final long j7 = j5;
                final long j8 = j6;
                final ChatEditActivity chatEditActivity4 = this;
                viewGroup3 = viewGroup5;
                chatEditActivity.communityUnlinkCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i39;
                        ChatEditActivity chatEditActivity5 = this.f$0;
                        String string4 = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                        if (z8) {
                            i39 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                        } else {
                            i39 = chatEditActivity5.isChannel ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                        }
                        AlertsCreator.showSimpleConfirmAlert(chatEditActivity5, string4, LocaleController.getString(i39), LocaleController.getString(R.string.Remove), true, new ChatEditActivity$$ExternalSyntheticLambda58(chatEditActivity5, j8, j7, 0));
                    }
                });
                viewGroup3.addView(chatEditActivity4.communityUnlinkCell, LayoutHelper.createLinear(-1, -2));
                TextInfoPrivacyCell textInfoPrivacyCell5 = new TextInfoPrivacyCell(context2, 12, chatEditActivity4.getResourceProvider());
                chatEditActivity4.communityGapView = textInfoPrivacyCell5;
                textInfoPrivacyCell5.setFixedSize(14);
                chatEditActivity4.communityGapView.setTag(R.id.fit_width_tag, 1);
                viewGroup3.addView(chatEditActivity4.communityGapView, LayoutHelper.createLinear(-1, 14));
                chatEditActivity2 = chatEditActivity4;
            } else {
                final long j9 = j6;
                viewGroup3 = viewGroup2;
                boolean z9 = z7;
                final ChatEditActivity chatEditActivity5 = chatEditActivity;
                TextCell textCell40 = new TextCell(context2);
                chatEditActivity5.communityCell = textCell40;
                textCell40.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                chatEditActivity5.communityCell.setTextColor(Theme.getColor(Theme.key_telegram_color_text));
                chatEditActivity5.communityCell.setBackground(Theme.getSelectorDrawable(r13));
                TextCell textCell41 = chatEditActivity5.communityCell;
                if (z9) {
                    i3 = R.string.CommunityAddBotToCommunity;
                } else {
                    i3 = chatEditActivity5.isChannel ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity;
                }
                textCell41.setTextAndIcon(R.drawable.msg_groups, LocaleController.getString(i3), (boolean) r13);
                final int i39 = 1;
                chatEditActivity5.communityCell.setOnClickListener(new View.OnClickListener(chatEditActivity5) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity5;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i39) {
                            case 0:
                                ChatEditActivity chatEditActivity6 = this.f$0;
                                MessagesController messagesController = chatEditActivity6.getMessagesController();
                                long j10 = j9;
                                if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j10)))) {
                                    chatEditActivity6.showDialog(new CommunitySheet(chatEditActivity6, j10, null, null));
                                } else {
                                    chatEditActivity6.presentFragment(new CommunityEditActivity(FBool.m(j10, "community_id")));
                                }
                                break;
                            default:
                                ChatEditActivity chatEditActivity7 = this.f$0;
                                chatEditActivity7.getClass();
                                chatEditActivity7.presentFragment(new CommunityCreateActivity(FBool.m(j9, "dialog_id")));
                                break;
                        }
                    }
                });
                TextInfoPrivacyCell textInfoPrivacyCell6 = new TextInfoPrivacyCell(context2, 12, chatEditActivity5.resourceProvider);
                chatEditActivity5.communityInfoCell = textInfoPrivacyCell6;
                if (z9) {
                    i4 = R.string.CommunityAddBotToCommunityInfo;
                } else {
                    i4 = chatEditActivity5.isChannel ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo;
                }
                textInfoPrivacyCell6.setText(LocaleController.getString(i4));
                viewGroup3.addView(chatEditActivity5.communityCell, LayoutHelper.createLinear(-1, -2));
                viewGroup3.addView(chatEditActivity5.communityInfoCell, LayoutHelper.createLinear(-1, -2));
                chatEditActivity2 = chatEditActivity5;
            }
        }
        TLRPC.Chat chat6 = chatEditActivity2.currentChat;
        if (chat6 != null && chat6.creator) {
            FrameLayout frameLayout2 = new FrameLayout(context2);
            chatEditActivity2.deleteContainer = frameLayout2;
            viewGroup3.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
            TextSettingsCell textSettingsCell = new TextSettingsCell(context2);
            chatEditActivity2.deleteCell = textSettingsCell;
            textSettingsCell.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
            chatEditActivity2.deleteCell.setBackgroundDrawable(Theme.getSelectorDrawable(r13));
            if (chatEditActivity2.currentUser != null) {
                chatEditActivity2.deleteCell.setText(LocaleController.getString(R.string.DeleteBot), r13);
            } else if (chatEditActivity2.isChannel) {
                chatEditActivity2.deleteCell.setText(LocaleController.getString(R.string.ChannelDelete), r13);
            } else {
                chatEditActivity2.deleteCell.setText(LocaleController.getString(R.string.DeleteAndExitButton), r13);
            }
            chatEditActivity2.deleteContainer.addView(chatEditActivity2.deleteCell, LayoutHelper.createFrame(-2.0f, -1));
            final int i40 = 15;
            chatEditActivity2.deleteCell.setOnClickListener(new View.OnClickListener(chatEditActivity2) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity2;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i40) {
                        case 0:
                            ChatEditActivity chatEditActivity6 = this.f$0;
                            GroupColorActivity groupColorActivity = new GroupColorActivity(-chatEditActivity6.currentChat.id);
                            groupColorActivity.boostsStatus = chatEditActivity6.boostsStatus;
                            groupColorActivity.bulletinFragment = chatEditActivity6;
                            chatEditActivity6.presentFragment(groupColorActivity);
                            break;
                        case 1:
                            ChatEditActivity chatEditActivity7 = this.f$0;
                            chatEditActivity7.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatEditActivity7.chatId);
                            bundle.putInt("type", 1);
                            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                            chatUsersActivity.setInfo(chatEditActivity7.info);
                            chatEditActivity7.presentFragment(chatUsersActivity);
                            break;
                        case 2:
                            ChatEditActivity chatEditActivity8 = this.f$0;
                            if (!chatEditActivity8.imageUpdater.isUploadingImage()) {
                                long j10 = chatEditActivity8.userId;
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j10 == 0 ? null : chatEditActivity8.getMessagesController().getUser(Long.valueOf(j10));
                                if (user3 == null) {
                                    TLRPC.Chat chat7 = chatEditActivity8.getMessagesController().getChat(Long.valueOf(chatEditActivity8.chatId));
                                    TLRPC.ChatPhoto chatPhoto = chat7.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity8, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat7.photo;
                                        int i110 = chatPhoto2.dc_id;
                                        if (i110 != 0) {
                                            chatPhoto2.photo_big.dc_id = i110;
                                        }
                                        TLRPC.ChatFull chatFull4 = chatEditActivity8.info;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(chatEditActivity8.info.chat_photo.video_sizes.get(0), chatEditActivity8.info.chat_photo);
                                            }
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, chat7.photo.photo_big, null, forPhoto, null, null, null, 0, chatEditActivity8.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.getInstance().setParentActivity(null, chatEditActivity8, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i111 = userProfilePhoto2.dc_id;
                                        if (i111 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i111;
                                        }
                                        PhotoViewer.getInstance().openPhoto(null, user3.photo.photo_big, null, null, null, null, null, 0, chatEditActivity8.provider, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            ChatEditActivity chatEditActivity9 = this.f$0;
                            chatEditActivity9.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chatEditActivity9.chatId);
                            bundle2.putInt("type", 2);
                            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                            chatUsersActivity2.setInfo(chatEditActivity9.info);
                            chatEditActivity9.presentFragment(chatUsersActivity2);
                            break;
                        case 4:
                            ChatEditActivity chatEditActivity10 = this.f$0;
                            chatEditActivity10.presentFragment(new MemberRequestsActivity(chatEditActivity10.chatId));
                            break;
                        case 5:
                            ChatEditActivity chatEditActivity11 = this.f$0;
                            chatEditActivity11.presentFragment(new ChannelAffiliateProgramsFragment(-chatEditActivity11.chatId));
                            break;
                        case 6:
                            ChatEditActivity chatEditActivity12 = this.f$0;
                            chatEditActivity12.getClass();
                            chatEditActivity12.presentFragment(new ChannelAdminLogActivity(chatEditActivity12.currentChat));
                            break;
                        case 7:
                            ChatEditActivity chatEditActivity13 = this.f$0;
                            chatEditActivity13.presentFragment(StatisticActivity.create(chatEditActivity13.currentChat, false));
                            break;
                        case 8:
                            ChatEditActivity chatEditActivity14 = this.f$0;
                            chatEditActivity14.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", chatEditActivity14.userId);
                            chatEditActivity14.presentFragment(new ChangeUsernameActivity(bundle3));
                            break;
                        case 9:
                            ChatEditActivity chatEditActivity15 = this.f$0;
                            chatEditActivity15.presentFragment(new AffiliateProgramFragment(chatEditActivity15.userId));
                            break;
                        case 10:
                            ChatEditActivity chatEditActivity16 = this.f$0;
                            chatEditActivity16.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity16.currentUser) + "-intro");
                            break;
                        case 11:
                            ChatEditActivity chatEditActivity17 = this.f$0;
                            chatEditActivity17.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity17.currentUser) + "-commands");
                            break;
                        case 12:
                            ChatEditActivity chatEditActivity18 = this.f$0;
                            chatEditActivity18.getClass();
                            Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + ChatEditActivity.getActiveUsername(chatEditActivity18.currentUser));
                            break;
                        case 13:
                            this.f$0.openSetPhotoAlert();
                            break;
                        case 14:
                            this.f$0.lambda$createView$43$1();
                            break;
                        case 15:
                            ChatEditActivity chatEditActivity19 = this.f$0;
                            AlertsCreator.createClearOrDeleteDialogAlert(chatEditActivity19, false, chatEditActivity19.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity19, 6));
                            break;
                        case 16:
                            ChatEditActivity chatEditActivity110 = this.f$0;
                            if (AndroidUtilities.isMapsInstalled(chatEditActivity110)) {
                                LocationActivity locationActivity = new LocationActivity(4);
                                locationActivity.dialogId = -chatEditActivity110.chatId;
                                TLRPC.ChatFull chatFull5 = chatEditActivity110.info;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        locationActivity.initialLocation = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                locationActivity.delegate = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity110, 7);
                                chatEditActivity110.presentFragment(locationActivity);
                                break;
                            }
                            break;
                        case 17:
                            ChatEditActivity chatEditActivity111 = this.f$0;
                            long j11 = chatEditActivity111.chatId;
                            TextCell textCell110 = chatEditActivity111.locationCell;
                            ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j11, textCell110 != null && textCell110.getVisibility() == 0);
                            TLRPC.ChatFull chatFull6 = chatEditActivity111.info;
                            chatEditTypeActivity.info = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    chatEditTypeActivity.invite = tL_chatInviteExported;
                                } else {
                                    chatEditTypeActivity.generateLink(false);
                                }
                            }
                            chatEditActivity111.presentFragment(chatEditTypeActivity);
                            break;
                        case 18:
                            ChatEditActivity chatEditActivity20 = this.f$0;
                            ChatLinkActivity chatLinkActivity = new ChatLinkActivity(chatEditActivity20.chatId);
                            chatLinkActivity.info = chatEditActivity20.info;
                            chatEditActivity20.presentFragment(chatLinkActivity);
                            break;
                        case 19:
                            ChatEditActivity chatEditActivity21 = this.f$0;
                            PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(chatEditActivity21.chatId);
                            postSuggestionsEditActivity.starsCallback = new ChatEditActivity$$ExternalSyntheticLambda41(chatEditActivity21, 4);
                            chatEditActivity21.presentFragment(postSuggestionsEditActivity);
                            break;
                        case 20:
                            this.f$0.lambda$createView$12$2();
                            break;
                        case 21:
                            ChatEditActivity chatEditActivity22 = this.f$0;
                            chatEditActivity22.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", chatEditActivity22.chatId);
                            bundle4.putInt("type", ((chatEditActivity22.isChannel || chatEditActivity22.currentChat.gigagroup) && !ChatObject.isCommunity(chatEditActivity22.currentChat)) ? 0 : 3);
                            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                            chatUsersActivity3.setInfo(chatEditActivity22.info);
                            chatEditActivity22.presentFragment(chatUsersActivity3);
                            break;
                        case 22:
                            ChatEditActivity chatEditActivity23 = this.f$0;
                            ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditActivity23.chatId, 0L, 0);
                            TLRPC.ChatFull chatFull7 = chatEditActivity23.info;
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = chatFull7.exported_invite;
                            manageLinksActivity.info = chatFull7;
                            manageLinksActivity.invite = tL_chatInviteExported2;
                            manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                            manageLinksActivity.loadLinks(true);
                            chatEditActivity23.presentFragment(manageLinksActivity);
                            break;
                        case 23:
                            ChatEditActivity chatEditActivity24 = this.f$0;
                            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity24.currentChat)) {
                                chatEditActivity24.presentFragment(new ChatCustomReactionsEditActivity(chatEditActivity24.chatId, chatEditActivity24.info));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", chatEditActivity24.chatId);
                                ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle5);
                                TLRPC.ChatFull chatFull8 = chatEditActivity24.info;
                                chatReactionsEditActivity.info = chatFull8;
                                if (chatFull8 != null) {
                                    if (chatReactionsEditActivity.currentChat == null) {
                                        chatReactionsEditActivity.currentChat = chatReactionsEditActivity.getMessagesController().getChat(Long.valueOf(chatReactionsEditActivity.chatId));
                                    }
                                    chatReactionsEditActivity.chatReactions = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        chatReactionsEditActivity.startFromType = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        chatReactionsEditActivity.startFromType = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i112 = 0; i112 < tL_chatReactionsSome.reactions.size(); i112++) {
                                            if (tL_chatReactionsSome.reactions.get(i112) instanceof TLRPC.TL_reactionEmoji) {
                                                chatReactionsEditActivity.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i112)).emoticon);
                                            }
                                        }
                                        chatReactionsEditActivity.startFromType = 1;
                                    }
                                }
                                chatEditActivity24.presentFragment(chatReactionsEditActivity);
                            }
                            break;
                        default:
                            ChatEditActivity chatEditActivity25 = this.f$0;
                            chatEditActivity25.getClass();
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
                            bundleM.putLong("chat_id", chatEditActivity25.chatId);
                            bundleM.putLong("welcome_messages_chat_id", chatEditActivity25.chatId);
                            chatEditActivity25.presentFragment(new ChatActivity(bundleM));
                            break;
                    }
                }
            });
            ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context2);
            chatEditActivity2.deleteInfoCell = shadowSectionCell2;
            viewGroup3.addView(shadowSectionCell2, LayoutHelper.createLinear(-1, -2));
        }
        UndoView undoView = new UndoView(context2);
        chatEditActivity2.undoView = undoView;
        viewGroup.addView(undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
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
        chatEditActivity2.updateFields(true, r13);
        return chatEditActivity2.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        boolean z;
        EditTextBoldCursor editTextBoldCursor;
        int i3 = NotificationCenter.chatInfoDidLoad;
        boolean z2 = true;
        long j = this.userId;
        int i4 = 0;
        if (i == i3) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            if (chatFull2.id == this.chatId) {
                if (this.info == null && (editTextBoldCursor = this.descriptionTextView) != null) {
                    editTextBoldCursor.setText(chatFull2.about);
                }
                boolean z3 = this.info == null;
                this.info = chatFull2;
                checkWelcomeMessagesValue();
                if (j != 0) {
                    this.canForum = false;
                } else {
                    if (this.forum) {
                        chatFull = this.info;
                        if (chatFull != null || chatFull.linked_chat_id == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        TLRPC.ChatFull chatFull3 = this.info;
                        if (Math.max(chatFull3 == null ? 0 : chatFull3.participants_count, this.currentChat.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) {
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
                if (ChatObject.isChannel(this.currentChat) && !this.info.hidden_prehistory) {
                    z2 = false;
                }
                this.historyHidden = z2;
                updateFields(false, false);
                if (z3) {
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
            TextCell textCell2 = this.forumsCell;
            if (textCell2 != null) {
                textCell2.setChecked(zBooleanValue);
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
            if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i == NotificationCenter.chatAvailableReactionsUpdated) {
            long jLongValue2 = ((Long) objArr[0]).longValue();
            if (jLongValue2 == this.chatId) {
                TLRPC.ChatFull chatFull4 = getMessagesController().getChatFull(jLongValue2);
                this.info = chatFull4;
                if (chatFull4 != null) {
                    this.availableReactions = chatFull4.available_reactions;
                }
                updateReactionsCell(true);
                return;
            }
            return;
        }
        if (i != NotificationCenter.botStarsUpdated) {
            if (i == NotificationCenter.userInfoDidLoad) {
                if (((Long) objArr[0]).longValue() == j) {
                    setInfo(getMessagesController().getUserFull(j));
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
                    if (iNavigationLayout2 == null || ((ActionBarLayout) iNavigationLayout2).getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                return;
            }
        }
        if (((Long) objArr[0]).longValue() == j) {
            if (this.starsBalanceCell != null) {
                BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
                this.starsBalanceCell.setVisibility(botStarsController.botHasStars(j) ? 0 : 8);
                this.starsBalanceCell.setValue(StarsIntroActivity.replaceStarsWithPlain(false, TextUtils.concat("XTR", StarsIntroActivity.formatStarsAmount(botStarsController.getBotStarsBalance(j), 0.8f, ' ')), 0.85f, null), true);
                TextCell textCell3 = this.publicLinkCell;
                if (textCell3 != null) {
                    textCell3.setNeedDivider(botStarsController.botHasStars(j) || botStarsController.botHasTON(j));
                }
                this.balanceContainer.setVisibility((this.starsBalanceCell.getVisibility() == 0 || this.tonBalanceCell.getVisibility() == 0) ? 0 : 8);
            }
            if (this.tonBalanceCell != null) {
                BotStarsController botStarsController2 = BotStarsController.getInstance(this.currentAccount);
                this.tonBalanceCell.setVisibility(botStarsController2.botHasTON(j) ? 0 : 8);
                long tONBalance = botStarsController2.getTONBalance(j);
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
                TextCell textCell4 = this.publicLinkCell;
                if (textCell4 != null) {
                    if (!botStarsController2.botHasStars(j) && !botStarsController2.botHasTON(j)) {
                        z2 = false;
                    }
                    textCell4.setNeedDivider(z2);
                }
                LinearLayout linearLayout = this.balanceContainer;
                if (this.starsBalanceCell.getVisibility() != 0 && this.tonBalanceCell.getVisibility() != 0) {
                    i4 = 8;
                }
                linearLayout.setVisibility(i4);
            }
        }
    }

    @Override
    public final void didStartUpload(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void didUploadFailed() {
    }

    @Override
    public final void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda76(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.imageUpdater.dismissCurrentDialog(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.imageUpdater.chatAttachAlert && super.dismissDialogOnPause(dialog);
    }

    @Override
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.nameTextView.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 6);
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        AnonymousClass7 anonymousClass7 = this.setAvatarCell;
        int i = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(anonymousClass7, 4096, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.setAvatarCell, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.setAvatarCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueIcon));
        arrayList.add(new ThemeDescription(this.membersCell, 4096, null, null, null, null, i));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.membersCell, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        int i3 = Theme.key_windowBackgroundWhiteGrayIcon;
        arrayList.add(new ThemeDescription(this.membersCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.adminCell, 4096, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.adminCell, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.adminCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.inviteLinksCell, 4096, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.inviteLinksCell, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.inviteLinksCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i3));
        TextCell textCell = this.memberRequestsCell;
        if (textCell != null) {
            arrayList.add(new ThemeDescription(textCell, 4096, null, null, null, null, i));
            arrayList.add(new ThemeDescription(this.memberRequestsCell, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
            arrayList.add(new ThemeDescription(this.memberRequestsCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i3));
        }
        arrayList.add(new ThemeDescription(this.blockCell, 4096, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.blockCell, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.blockCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.logCell, 4096, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.logCell, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.logCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.typeCell, 4096, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.typeCell, 0, new Class[]{TextDetailCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        int i4 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.typeCell, 0, new Class[]{TextDetailCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.historyCell, 4096, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.historyCell, 0, new Class[]{TextDetailCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.historyCell, 0, new Class[]{TextDetailCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.locationCell, 4096, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.locationCell, 0, new Class[]{TextDetailCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.locationCell, 0, new Class[]{TextDetailCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.nameTextView, 4, null, null, null, null, i2));
        EditTextEmoji editTextEmoji = this.nameTextView;
        int i5 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(editTextEmoji, 8388608, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.nameTextView, 32, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
        arrayList.add(new ThemeDescription(this.nameTextView, 65568, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
        arrayList.add(new ThemeDescription(this.descriptionTextView, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.descriptionTextView, 8388608, null, null, null, null, i5));
        LinearLayout linearLayout = this.avatarContainer;
        int i6 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(linearLayout, 1, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.settingsContainer, 1, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.typeEditContainer, 1, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.deleteContainer, 1, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(null, 1, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.infoContainer, 1, null, null, null, null, i6));
        int i7 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.settingsTopSectionCell, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.settingsSectionCell, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.deleteInfoCell, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.deleteCell, 4096, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.deleteCell, 4, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_text_RedRegular));
        arrayList.add(new ThemeDescription(null, 4096, null, null, null, null, i));
        arrayList.add(new ThemeDescription(null, 4, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(null, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(null, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.undoView, 32, null, null, null, null, Theme.key_undo_background));
        int i8 = Theme.key_undo_cancelColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i8));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i8));
        int i9 = Theme.key_undo_infoColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i9));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i9));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i9));
        arrayList.add(new ThemeDescription(this.undoView, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i9));
        arrayList.add(new ThemeDescription(this.reactionsCell, 4096, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.reactionsCell, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.reactionsCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i3));
        TextCell textCell2 = this.suggestedCell;
        if (textCell2 != null) {
            arrayList.add(new ThemeDescription(textCell2, 4096, null, null, null, null, i));
            arrayList.add(new ThemeDescription(this.suggestedCell, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
            arrayList.add(new ThemeDescription(this.suggestedCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i3));
        }
        TextCell textCell3 = this.statsAndBoosts;
        if (textCell3 != null) {
            arrayList.add(new ThemeDescription(textCell3, 4096, null, null, null, null, i));
            arrayList.add(new ThemeDescription(this.statsAndBoosts, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
            arrayList.add(new ThemeDescription(this.statsAndBoosts, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i3));
        }
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$12$2() {
        ChannelColorActivity channelColorActivity = new ChannelColorActivity(-this.currentChat.id);
        channelColorActivity.bulletinFragment = this;
        presentFragment(channelColorActivity);
        AiTonesController$$ExternalSyntheticOutline0.m(this.currentAccount).putInt("boostingappearance", MessagesController.getInstance(this.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public final void lambda$createView$15(AlertDialog alertDialog, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        alertDialog.dismiss();
        if (getParentActivity() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(35, this.currentAccount, getParentActivity(), this, getResourceProvider());
        limitReachedBottomSheet.canApplyBoost = canApplyBoost;
        limitReachedBottomSheet.updateButton$2();
        limitReachedBottomSheet.updatePremiumButtonText();
        limitReachedBottomSheet.boostsStatus = tL_premium_boostsStatus;
        limitReachedBottomSheet.isCurrentChat = true;
        limitReachedBottomSheet.updateRows$7();
        limitReachedBottomSheet.dialogId = j;
        limitReachedBottomSheet.updateRows$7();
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j));
        if (chat != null) {
            limitReachedBottomSheet.statisticClickRunnable = new ChatLinkActivity$$ExternalSyntheticLambda9(4, this, chat);
        }
        showDialog(limitReachedBottomSheet);
    }

    public final void lambda$createView$27(FrameLayout frameLayout, View view) {
        if (!this.canForum) {
            TLRPC.ChatFull chatFull = this.info;
            BulletinFactory.of(this).createSimpleBulletinWithIconSize(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).show();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        EnableTopicsActivity enableTopicsActivity = new EnableTopicsActivity(-this.chatId);
        enableTopicsActivity.setResourceProvider(this.resourceProvider);
        boolean z = this.forum;
        boolean z2 = this.forumTabs;
        OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = new OAuthSheet$$ExternalSyntheticLambda18(6, this, view);
        enableTopicsActivity.forum = z;
        enableTopicsActivity.isTabs = z2;
        enableTopicsActivity.onForumChanged = oAuthSheet$$ExternalSyntheticLambda18;
        presentFragment(enableTopicsActivity);
    }

    public final void lambda$createView$43$1() {
        int i = this.currentAccount;
        TL_bots.botVerifierSettings botverifiersettings = this.userInfo.bot_info.verifier_settings;
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        Bundle bundleM = TelegramMediaSession$$ExternalSyntheticOutline0.m(16, "onlySelect", "dialogsType", true);
        bundleM.putBoolean("resetDelegate", false);
        DialogsActivity dialogsActivity = new DialogsActivity(bundleM);
        dialogsActivity.setCurrentAccount(i);
        dialogsActivity.delegate = new BotVerifySheet$$ExternalSyntheticLambda0(dialogsActivity, i, this.userId, botverifiersettings);
        safeLastFragment.presentFragment(dialogsActivity);
    }

    public final void lambda$createView$48(long j, long j2) {
        MessagesController.getInstance(this.currentAccount).unlinkCommunity(j, j2, new CallLogActivity$$ExternalSyntheticLambda3(this, 14));
    }

    public final void lambda$didUploadPhoto$57() {
        this.hasUploadedPhoto = true;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public final void lambda$openSetPhotoAlert$55() {
        this.avatar = null;
        long j = this.userId;
        if (j == 0) {
            MessagesController.getInstance(this.currentAccount).changeChatAvatar(this.chatId, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = getMessagesController().getInputUser(j);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ChatEditActivity$$ExternalSyntheticLambda40(this, 2));
        }
        showAvatarProgress$1(false, true);
        UserCell.AnonymousClass2 anonymousClass2 = this.avatarImage;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        Object obj = this.currentUser;
        if (obj == null) {
            obj = this.currentChat;
        }
        anonymousClass2.setImage(null, null, avatarDrawable, obj);
        this.cameraDrawable.setCurrentFrame(0, true, false);
        this.setAvatarCell.imageView.playAnimation();
    }

    public final void loadLinksCount() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.chatId);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ChatEditActivity$$ExternalSyntheticLambda40(this, 0));
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.imageUpdater.onActivityResult(i, i2, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji == null || !editTextEmoji.emojiViewVisible) {
            return checkDiscard(z);
        }
        if (!z) {
            return false;
        }
        editTextEmoji.hidePopup(true);
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditActivity.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.clear$1();
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
    public final void onInsets(int i, int i2, int i3, int i4) {
        GLIconSettingsView gLIconSettingsView = this.linearLayout;
        if (gLIconSettingsView != null) {
            gLIconSettingsView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i4);
        }
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.setTranslationY(-i4);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.preloadedReactions;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AnimatedEmojiDrawable) obj).removeView((AnimatedEmojiSpan.InvalidateHolder) null);
        }
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onPause();
        }
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(0, true);
        }
        ChatAttachAlert chatAttachAlert = this.imageUpdater.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.onPause();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.imageUpdater.onRequestPermissionsResultFragment(i, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onResume();
            this.nameTextView.getEditText().requestFocus();
        }
        updateColorCell();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        updateFields(true, true);
        ChatAttachAlert chatAttachAlert = this.imageUpdater.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.onResume();
        }
    }

    @Override
    public final void onUploadProgressChanged(float f) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    public final void openSetPhotoAlert() {
        this.imageUpdater.openMenu(this.avatar != null, new ChatEditActivity$$ExternalSyntheticLambda49(this, 0), new OAuthSheet$$ExternalSyntheticLambda11(this, 9), 0);
        this.cameraDrawable.setCurrentFrame(0, true, false);
        this.cameraDrawable.setCustomEndFrame(43);
        this.setAvatarCell.imageView.playAnimation();
    }

    public final void processDone$5() {
        EditTextEmoji editTextEmoji;
        String str;
        String str2;
        int i = 0;
        if (this.donePressed || (editTextEmoji = this.nameTextView) == null) {
            return;
        }
        if (editTextEmoji.editText.length() == 0) {
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
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
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
            this.progressDialog = new AlertDialog(getParentActivity(), 3, null);
            this.progressDialog.setOnCancelListener(new ChatEditActivity$$ExternalSyntheticLambda52(this, getConnectionsManager().sendRequest(setbotinfo, new ChatActivity$$ExternalSyntheticLambda208(20, this, setbotinfo)), i));
            this.progressDialog.show();
            return;
        }
        if (!ChatObject.isChannel(this.currentChat) && (!this.historyHidden || this.forum)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new ChatEditActivity$$ExternalSyntheticLambda41(this, 5));
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
            AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
            this.progressDialog = alertDialog;
            alertDialog.setOnCancelListener(new LinkManager$$ExternalSyntheticLambda17(this, 2));
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
                List<BaseFragment> fragmentStack = ((ActionBarLayout) getParentLayout()).getFragmentStack();
                while (i < fragmentStack.size()) {
                    if ((fragmentStack.get(i) instanceof ChatActivity) && ((ChatActivity) fragmentStack.get(i)).getArguments().getLong("chat_id") == this.chatId) {
                        ((ActionBarLayout) getParentLayout()).removeFragmentFromStack(i);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.chatId);
                        INavigationLayout parentLayout = getParentLayout();
                        HashSet hashSet = TopicsFragment.settingsPreloaded;
                        ((ActionBarLayout) parentLayout).addFragmentToStack(i, TopicsFragment.getTopicsOrChat(getMessagesController(), getMessagesStorage(), bundle));
                    }
                    i++;
                }
            }
            if (z4) {
                updatePastFragmentsOnTabs();
            }
        }
        finishFragment();
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.currentPicturePath = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
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

    public final void setAvatar() {
        boolean z;
        if (this.avatarImage == null || this.hasUploadedPhoto) {
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        long j = this.userId;
        TLRPC.User user = j == 0 ? null : getMessagesController().getUser(Long.valueOf(j));
        if (chat == null && user == null) {
            return;
        }
        this.currentUser = user;
        this.currentChat = chat;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        if (user == null ? chat.photo != null : user.photo != null) {
            TLRPC.User user2 = user != null ? user : chat;
            this.avatar = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, user2, 1);
            UserCell.AnonymousClass2 anonymousClass2 = this.avatarImage;
            anonymousClass2.imageReceiver.setForUserOrChat(user2, avatarDrawable);
            anonymousClass2.onNewImageSet();
            z = forUserOrChat != null;
            if (this.setAvatarCell != null) {
                if (!z || this.imageUpdater.isUploadingImage()) {
                    setTextAndIcon(R.drawable.msg_addphoto, (CharSequence) LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                } else {
                    setTextAndIcon(R.drawable.msg_addphoto, (CharSequence) LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                }
                if (this.cameraDrawable == null) {
                    int i = R.raw.camera_outline;
                    this.cameraDrawable = new RLottieDrawable(i, SurfaceContainer$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
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
        this.avatarImage.setImageDrawable(avatarDrawable);
        if (this.setAvatarCell != null) {
            if (z) {
                setTextAndIcon(R.drawable.msg_addphoto, (CharSequence) LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
            } else {
                setTextAndIcon(R.drawable.msg_addphoto, (CharSequence) LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
            }
            if (this.cameraDrawable == null) {
                int i2 = R.raw.camera_outline;
                this.cameraDrawable = new RLottieDrawable(i2, SurfaceContainer$$ExternalSyntheticOutline0.m(i2, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
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

    public final void setInfo(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.userInfo = userFull;
        if (userFull != null) {
            if (this.currentUser == null) {
                long j = this.userId;
                this.currentUser = j == 0 ? null : getMessagesController().getUser(Long.valueOf(j));
            }
            TextCell textCell = this.botAffiliateProgramCell;
            if (textCell != null) {
                textCell.setDrawLoading(45, this.userInfo == null, true);
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

    public final void showAvatarProgress$1(boolean z, boolean z2) {
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<ChatActivity.AnonymousClass27, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.avatarProgressView;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<ChatActivity.AnonymousClass27, Float>) property2, 0.0f));
        }
        this.avatarAnimation.setDuration(180L);
        this.avatarAnimation.addListener(new ChatActivity.AnonymousClass77(12, this, z));
        this.avatarAnimation.start();
    }

    @Override
    public final boolean supportsBulletin() {
        return false;
    }

    public final void updateColorCell() {
        TextCell textCell;
        TextCell textCell2;
        PeerColorActivity.PeerColorDrawable peerColorDrawableFrom;
        int color;
        ArrayList<Integer> arrayList;
        PeerColorActivity.ChangeNameColorCell changeNameColorCell = this.colorCell;
        if (changeNameColorCell != null) {
            TLRPC.Chat chat = this.currentChat;
            TextCell textCell3 = this.historyCell;
            boolean z = (textCell3 != null && textCell3.getVisibility() == 0) || ((textCell = this.forumsCell) != null && textCell.getVisibility() == 0) || ((ChatObject.isMegagroup(this.currentChat) && ChatObject.hasAdminRights(this.currentChat)) || ((textCell2 = this.autoTranslationCell) != null && textCell2.getVisibility() == 0));
            if (chat == null) {
                return;
            }
            changeNameColorCell.needDivider = z;
            changeNameColorCell.userText = new Text(Emoji.replaceEmoji(chat.title, Theme.chat_msgTextPaint.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            PeerColorActivity.PeerColorDrawable peerColorDrawable = changeNameColorCell.color1Drawable;
            if (peerColorDrawable != null) {
                peerColorDrawable.setView(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            boolean z2 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
            int i = changeNameColorCell.currentAccount;
            if (z2) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i2 = PeerColorActivity.PeerColorDrawable.$r8$clinit;
                int i3 = tL_emojiStatusCollectible.center_color | (-16777216);
                changeNameColorCell.color1Drawable = new PeerColorActivity.PeerColorDrawable(tL_emojiStatusCollectible.document_id, i3, i3, i3);
            } else {
                if (ChatObject.getProfileColorId(chat) >= 0) {
                    int profileColorId = ChatObject.getProfileColorId(chat);
                    int i4 = PeerColorActivity.PeerColorDrawable.$r8$clinit;
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(i).profilePeerColors;
                    peerColorDrawableFrom = PeerColorActivity.PeerColorDrawable.from(peerColors == null ? null : peerColors.getColor(profileColorId), true);
                    peerColorDrawableFrom.radius = AndroidUtilities.dp(11.0f);
                    peerColorDrawableFrom.initPath();
                } else {
                    peerColorDrawableFrom = null;
                }
                changeNameColorCell.color1Drawable = peerColorDrawableFrom;
            }
            PeerColorActivity.PeerColorDrawable peerColorDrawable2 = changeNameColorCell.color1Drawable;
            if (peerColorDrawable2 != null) {
                peerColorDrawable2.setView(changeNameColorCell);
            }
            TLRPC.PeerColor peerColor = chat.color;
            boolean z3 = peerColor instanceof TLRPC.TL_peerColorCollectible;
            Paint paint = changeNameColorCell.userTextBackgroundPaint;
            Theme.ResourcesProvider resourcesProvider = changeNameColorCell.resourcesProvider;
            if (z3) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
                int i5 = (!zIsDark || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!zIsDark || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int iIntValue = arrayList.get(0).intValue() | (-16777216);
                int iIntValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : iIntValue;
                int iIntValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : iIntValue;
                changeNameColorCell.userText.paint.setColor(i5);
                paint.setColor(Theme.multAlpha(0.1f, i5));
                PeerColorActivity.PeerColorDrawable peerColorDrawable3 = new PeerColorActivity.PeerColorDrawable(tL_peerColorCollectible.gift_emoji_id, iIntValue, iIntValue2, iIntValue3);
                peerColorDrawable3.radius = AndroidUtilities.dp(11.0f);
                peerColorDrawable3.initPath();
                changeNameColorCell.color2Drawable = peerColorDrawable3;
                peerColorDrawable3.setView(changeNameColorCell);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i6 = Theme.keys_avatar_nameInMessage[colorId];
                changeNameColorCell.userTextColorKey = i6;
                color = Theme.getColor(i6, resourcesProvider);
            } else {
                MessagesController.PeerColors peerColors2 = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(colorId) : null;
                if (color2 != null) {
                    changeNameColorCell.userTextColorKey = -1;
                    color = color2.getColor1();
                } else {
                    int i7 = Theme.keys_avatar_nameInMessage[0];
                    changeNameColorCell.userTextColorKey = i7;
                    color = Theme.getColor(i7, resourcesProvider);
                }
            }
            changeNameColorCell.userText.paint.setColor(color);
            paint.setColor(Theme.multAlpha(0.1f, color));
            PeerColorActivity.PeerColorDrawable peerColorDrawableFrom2 = PeerColorActivity.PeerColorDrawable.from(i, colorId);
            peerColorDrawableFrom2.radius = AndroidUtilities.dp(11.0f);
            peerColorDrawableFrom2.initPath();
            changeNameColorCell.color2Drawable = peerColorDrawableFrom2;
            peerColorDrawableFrom2.setView(changeNameColorCell);
        }
    }

    public final void updateFields(boolean z, boolean z2) {
        boolean z3;
        int sendMediaSelectedCount;
        int i;
        int i2;
        int i3;
        String str;
        TLRPC.ChatFull chatFull;
        int i4;
        String str2;
        String string;
        TextCell textCell;
        TextCell textCell2;
        TextCell textCell3;
        TextCell textCell4;
        int i5;
        String str3;
        TextCell textCell5;
        TextCell textCell6;
        TextCell textCell7;
        TextCell textCell8;
        TextCell textCell9;
        TLRPC.Chat chat;
        int i6 = 3;
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
                    this.linkedCell.setTextAndValueAndIcon(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.info.linked_chat_id));
                    if (chat2 == null) {
                        this.linkedCell.setVisibility(8);
                    } else if (this.isChannel) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.linkedCell.setTextAndValueAndIcon(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.linkedCell.setTextAndValueAndIcon(LocaleController.getString("Discussion", R.string.Discussion), zzil.m("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            TextCell textCell12 = this.linkedCell;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i7 = R.drawable.msg_channel;
                            TextCell textCell13 = this.forumsCell;
                            textCell12.setTextAndValueAndIcon(string2, str4, false, i7, textCell13 != null && textCell13.getVisibility() == 0);
                        } else {
                            TextCell textCell14 = this.linkedCell;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String strM = zzil.m("@", publicUsername2);
                            int i8 = R.drawable.msg_channel;
                            TextCell textCell15 = this.forumsCell;
                            textCell14.setTextAndValueAndIcon(string3, strM, false, i8, textCell15 != null && textCell15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        TextCell textCell16 = this.locationCell;
        if (textCell16 != null) {
            TLRPC.ChatFull chatFull3 = this.info;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                textCell16.setVisibility(8);
            } else {
                textCell16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.info.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.locationCell.setTextAndValue(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC.TL_channelLocation) channelLocation).address, z2, true);
                } else {
                    this.locationCell.setTextAndValue(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z2, true);
                }
            }
        }
        if (this.typeCell != null) {
            TLRPC.ChatFull chatFull4 = this.info;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z4 = this.currentChat.noforwards;
                if (this.isChannel) {
                    if (zIsPublic) {
                        i5 = R.string.TypePublic;
                        str3 = "TypePublic";
                    } else if (z4) {
                        i5 = R.string.TypePrivateRestrictedForwards;
                        str3 = "TypePrivateRestrictedForwards";
                    } else {
                        i5 = R.string.TypePrivate;
                        str3 = "TypePrivate";
                    }
                    string = LocaleController.getString(str3, i5);
                } else {
                    if (zIsPublic) {
                        i4 = R.string.TypePublicGroup;
                        str2 = "TypePublicGroup";
                    } else if (z4) {
                        i4 = R.string.TypePrivateGroupRestrictedForwards;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i4 = R.string.TypePrivateGroup;
                        str2 = "TypePrivateGroup";
                    }
                    string = LocaleController.getString(str2, i4);
                }
                String str5 = string;
                if (this.isChannel) {
                    TextCell textCell17 = this.typeCell;
                    String string4 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i9 = R.drawable.msg_channel;
                    TextCell textCell18 = this.historyCell;
                    textCell17.setTextAndValueAndIcon(string4, str5, false, i9, (textCell18 != null && textCell18.getVisibility() == 0) || ((textCell3 = this.linkedCell) != null && textCell3.getVisibility() == 0) || ((textCell4 = this.forumsCell) != null && textCell4.getVisibility() == 0));
                } else {
                    TextCell textCell19 = this.typeCell;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i10 = R.drawable.msg_groups;
                    TextCell textCell20 = this.historyCell;
                    textCell19.setTextAndValueAndIcon(string5, str5, false, i10, (textCell20 != null && textCell20.getVisibility() == 0) || ((textCell = this.linkedCell) != null && textCell.getVisibility() == 0) || ((textCell2 = this.forumsCell) != null && textCell2.getVisibility() == 0));
                }
            } else {
                String string6 = !zIsPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.currentChat));
                TextCell textCell21 = this.typeCell;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i11 = R.drawable.msg_channel;
                TextCell textCell22 = this.historyCell;
                textCell21.setTextAndValueAndIcon(string7, string6, false, i11, (textCell22 != null && textCell22.getVisibility() == 0) || ((textCell5 = this.linkedCell) != null && textCell5.getVisibility() == 0) || ((textCell6 = this.forumsCell) != null && textCell6.getVisibility() == 0));
            }
        }
        if (this.historyCell != null) {
            if (!this.historyHidden || this.forum) {
                i3 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            } else {
                i3 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            }
            this.historyCell.setTextAndValueAndIcon(LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort), LocaleController.getString(str, i3), z2, R.drawable.msg_discuss, this.forumsCell != null);
            this.historyCell.setEnabled(!this.forum);
            boolean z5 = (this.forum || zIsPublic || ((chatFull = this.info) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true;
            ValueAnimator valueAnimator = this.updateHistoryShowAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.historyCell.getAlpha() <= 0.0f && !z5) {
                this.historyCell.setVisibility(8);
                updateColorCell();
            } else if (this.historyCell.getVisibility() != 0 || this.historyCell.getAlpha() < 1.0f || !z5) {
                ArrayList arrayList = new ArrayList();
                boolean z6 = false;
                for (int i12 = 0; i12 < this.typeEditContainer.getChildCount(); i12++) {
                    if (!z6 && this.typeEditContainer.getChildAt(i12) == this.historyCell) {
                        z6 = true;
                    } else if (z6) {
                        arrayList.add(this.typeEditContainer.getChildAt(i12));
                    }
                }
                boolean z7 = false;
                for (int i13 = 0; i13 < this.linearLayout.getChildCount(); i13++) {
                    if (!z7 && this.linearLayout.getChildAt(i13) == this.typeEditContainer) {
                        z7 = true;
                    } else if (z7) {
                        arrayList.add(this.linearLayout.getChildAt(i13));
                    }
                }
                if (this.historyCell.getVisibility() != 0) {
                    this.historyCell.setAlpha(0.0f);
                    TextCell textCell23 = this.historyCell;
                    textCell23.setTranslationY((-textCell23.getHeight()) / 2.0f);
                }
                this.historyCell.setVisibility(0);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((View) arrayList.get(i14)).setTranslationY((1.0f - this.historyCell.getAlpha()) * (-this.historyCell.getHeight()));
                }
                if (z2) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.historyCell.getAlpha(), z5 ? 1.0f : 0.0f);
                    this.updateHistoryShowAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(7, this, arrayList));
                    this.updateHistoryShowAnimator.addListener(new ChatActivity.AnonymousClass63(this, z5, arrayList, i6));
                    this.updateHistoryShowAnimator.setDuration(320L);
                    this.updateHistoryShowAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.updateHistoryShowAnimator.start();
                } else {
                    this.historyCell.setAlpha(z5 ? 1.0f : 0.0f);
                    TextCell textCell24 = this.historyCell;
                    textCell24.setTranslationY(((-textCell24.getHeight()) / 2.0f) * (z5 ? 0.0f : 1.0f));
                    this.historyCell.setScaleY(((z5 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.historyCell.setVisibility(z5 ? 0 : 8);
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        ((View) arrayList.get(i15)).setTranslationY(0.0f);
                    }
                    this.updateHistoryShowAnimator = null;
                }
            }
        }
        if (this.membersCell != null) {
            if (this.info != null) {
                TextCell textCell25 = this.memberRequestsCell;
                if (textCell25 != null) {
                    if (textCell25.getParent() == null) {
                        this.infoContainer.addView(this.memberRequestsCell, this.infoContainer.indexOfChild(this.membersCell) + 1, LayoutHelper.createLinear(-1, -2));
                    }
                    this.memberRequestsCell.setVisibility(this.info.requests_pending > 0 ? 0 : 8);
                }
                if (!this.isChannel || ChatObject.isCommunity(this.currentChat)) {
                    if (ChatObject.isChannel(this.currentChat)) {
                        this.membersCell.setTextAndValueAndIcon(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.info.participants_count)), false, R.drawable.msg_groups, true);
                    } else {
                        this.membersCell.setTextAndValueAndIcon(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.info.participants.participants.size())), false, R.drawable.msg_groups, this.memberRequestsCell.getVisibility() == 0);
                    }
                    TLRPC.Chat chat3 = this.currentChat;
                    if (!chat3.gigagroup || ChatObject.isCommunity(chat3)) {
                        int i16 = this.forum ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.currentChat.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i17 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i17++;
                            }
                            sendMediaSelectedCount = ChatUsersActivity.getSendMediaSelectedCount(tL_chatBannedRights) + i17;
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
                            i = i16;
                        } else {
                            sendMediaSelectedCount = i16;
                            i = sendMediaSelectedCount;
                        }
                        z3 = z2;
                        this.blockCell.setTextAndValueAndIcon(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(sendMediaSelectedCount), Integer.valueOf(i)), z3, R.drawable.msg_permissions, true);
                    } else {
                        TextCell textCell26 = this.blockCell;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.info;
                        String str6 = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i18 = R.drawable.msg_user_remove;
                        TextCell textCell27 = this.logCell;
                        textCell26.setTextAndValueAndIcon(string8, str6, false, i18, textCell27 != null && textCell27.getVisibility() == 0);
                        z3 = z2;
                    }
                    TextCell textCell28 = this.memberRequestsCell;
                    if (textCell28 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String str7 = String.format("%d", Integer.valueOf(this.info.requests_pending));
                        int i19 = R.drawable.msg_requests;
                        TextCell textCell29 = this.logCell;
                        textCell28.setTextAndValueAndIcon(string9, str7, false, i19, textCell29 != null && textCell29.getVisibility() == 0);
                    }
                } else {
                    this.membersCell.setTextAndValueAndIcon(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.info.participants_count)), false, R.drawable.msg_groups, true);
                    TextCell textCell30 = this.blockCell;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.info;
                    String str8 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i20 = R.drawable.msg_user_remove;
                    TextCell textCell31 = this.logCell;
                    textCell30.setTextAndValueAndIcon(string10, str8, false, i20, textCell31 != null && textCell31.getVisibility() == 0);
                    z3 = z2;
                }
                TextCell textCell32 = this.adminCell;
                String string11 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.currentChat)) {
                    i2 = this.info.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.info;
                    if (chatFull7 == null) {
                        i2 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i21 = 0;
                        for (int i22 = 0; i22 < size; i22++) {
                            TLRPC.ChatParticipant chatParticipant = this.info.participants.participants.get(i22);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i21++;
                            }
                        }
                        i2 = i21;
                    }
                }
                textCell32.setTextAndValueAndIcon(string11, String.format("%d", Integer.valueOf(i2)), false, R.drawable.msg_admins, true);
            } else {
                z3 = z2;
                if (!this.isChannel || ChatObject.isCommunity(this.currentChat)) {
                    TextCell textCell33 = this.membersCell;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i23 = R.drawable.msg_groups;
                    TextCell textCell34 = this.logCell;
                    textCell33.setTextAndIcon(i23, string12, textCell34 != null && textCell34.getVisibility() == 0);
                    if (this.currentChat.gigagroup) {
                        TextCell textCell35 = this.blockCell;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i24 = R.drawable.msg_chats_remove;
                        TextCell textCell36 = this.logCell;
                        textCell35.setTextAndIcon(i24, string13, textCell36 != null && textCell36.getVisibility() == 0);
                    } else {
                        this.blockCell.setTextAndIcon(R.drawable.msg_permissions, (CharSequence) LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                } else {
                    this.membersCell.setTextAndIcon(R.drawable.msg_groups, (CharSequence) LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    TextCell textCell37 = this.blockCell;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i25 = R.drawable.msg_chats_remove;
                    TextCell textCell38 = this.logCell;
                    textCell37.setTextAndIcon(i25, string14, textCell38 != null && textCell38.getVisibility() == 0);
                }
                this.adminCell.setTextAndIcon(R.drawable.msg_admins, (CharSequence) LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            this.reactionsCell.setVisibility(ChatObject.canChangeChatInfo(this.currentChat) ? 0 : 8);
            updateReactionsCell(z3);
            if (this.info == null || !ChatObject.canUserDoAdminAction(this.currentChat, 3) || (zIsPublic && this.currentChat.creator)) {
                this.inviteLinksCell.setVisibility(8);
            } else if (this.info.invitesCount > 0) {
                this.inviteLinksCell.setTextAndValueAndIcon(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.info.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.inviteLinksCell.setTextAndValueAndIcon(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.suggestedCell != null) {
            updateSuggestedCell(null);
        }
    }

    public final void updatePastFragmentsOnTabs() {
        DialogsActivity dialogsActivity;
        DialogsActivity.AnonymousClass27 anonymousClass27;
        if (getParentLayout() == null) {
            return;
        }
        List<BaseFragment> fragmentStack = ((ActionBarLayout) getParentLayout()).getFragmentStack();
        int i = 0;
        while (i < fragmentStack.size()) {
            if (fragmentStack.get(i) instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) fragmentStack.get(i);
                if (chatActivity.getArguments().getLong("chat_id") == this.chatId) {
                    INavigationLayout parentLayout = getParentLayout();
                    parentLayout.getClass();
                    ((ActionBarLayout) parentLayout).removeFragmentFromStack(chatActivity, false);
                    chatActivity.clearViews();
                    ((ActionBarLayout) getParentLayout()).addFragmentToStack(i, chatActivity);
                    if (!this.forumTabs) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.chatId);
                        ((ActionBarLayout) getParentLayout()).addFragmentToStack(i, new TopicsFragment(bundle));
                        i++;
                    }
                }
            } else if (this.forumTabs && (fragmentStack.get(i) instanceof TopicsFragment)) {
                TopicsFragment topicsFragment = (TopicsFragment) fragmentStack.get(i);
                MessagesController messagesController = topicsFragment.getMessagesController();
                long j = topicsFragment.chatId;
                if (messagesController.getChat(Long.valueOf(j)) != null && topicsFragment.getMessagesController().getChat(Long.valueOf(j)).id == this.chatId) {
                    INavigationLayout parentLayout2 = getParentLayout();
                    parentLayout2.getClass();
                    ((ActionBarLayout) parentLayout2).removeFragmentFromStack(topicsFragment, false);
                    i--;
                }
            } else if (this.forumTabs && (fragmentStack.get(i) instanceof DialogsActivity) && (dialogsActivity = (DialogsActivity) fragmentStack.get(i)) != null && (anonymousClass27 = dialogsActivity.rightSlidingDialogContainer) != null && anonymousClass27.hasFragment()) {
                dialogsActivity.rightSlidingDialogContainer.finishPreview();
            }
            i++;
        }
    }

    public final void updatePublicLinksCount() {
        if (this.publicLinkCell == null) {
            return;
        }
        if (this.currentUser.usernames.size() <= 1) {
            this.publicLinkCell.setTextAndValueAndIcon(LocaleController.getString(R.string.BotPublicLink), "t.me/" + this.currentUser.username, false, R.drawable.msg_link2, true);
            return;
        }
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
        this.publicLinkCell.setTextAndValueAndIcon(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i2), Integer.valueOf(this.currentUser.usernames.size())), false, R.drawable.msg_link2, true);
    }

    public final void updateReactionsCell(boolean z) {
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

    public final void updateSuggestedCell(Long l) {
        boolean z;
        TLRPC.Chat chat = this.currentChat;
        if (chat == null || this.suggestedCell == null) {
            return;
        }
        long jLongValue = 0;
        if (l != null) {
            z = l.longValue() >= 0;
        } else {
            z = chat.broadcast_messages_allowed;
        }
        if (!z) {
            this.suggestedCell.setTextAndValueAndIcon(LocaleController.getString(R.string.PostSuggestions), LocaleController.getString(R.string.PostSuggestionsOff), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.currentChat.linked_monoforum_id));
        if (l != null) {
            jLongValue = l.longValue();
        } else if (chat2 != null) {
            jLongValue = chat2.send_paid_messages_stars;
        }
        this.suggestedCell.setTextAndValueAndIcon(LocaleController.getString(R.string.PostSuggestions), StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(jLongValue)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    public final void setInfo(TLRPC.ChatFull chatFull) {
        AnimatedEmojiDrawable animatedEmojiDrawableMake;
        this.info = chatFull;
        if (chatFull != null) {
            if (this.currentChat == null) {
                this.currentChat = getMessagesController().getChat(Long.valueOf(this.chatId));
            }
            this.historyHidden = !ChatObject.isChannel(this.currentChat) || this.info.hidden_prehistory;
            this.availableReactions = this.info.available_reactions;
            ArrayList arrayList = this.preloadedReactions;
            arrayList.clear();
            TLRPC.Chat chat = this.currentChat;
            TLRPC.ChatFull chatFull2 = this.info;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i);
                        i++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, AnimatedEmojiDrawable.getCacheTypeForEnterView(), tL_availableReaction.activate_animation);
                            }
                        } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, AnimatedEmojiDrawable.getCacheTypeForEnterView());
                        } else {
                            animatedEmojiDrawableMake = null;
                        }
                        if (animatedEmojiDrawableMake != null) {
                            arrayList2.add(animatedEmojiDrawableMake);
                            animatedEmojiDrawableMake.addView((AnimatedEmojiSpan.InvalidateHolder) null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            AnimatedEmojiDrawable animatedEmojiDrawableMake2 = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, AnimatedEmojiDrawable.getCacheTypeForEnterView(), tL_availableReaction2.activate_animation);
                            arrayList2.add(animatedEmojiDrawableMake2);
                            animatedEmojiDrawableMake2.addView((AnimatedEmojiSpan.InvalidateHolder) null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.channelAffiliateProgramsCell != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.currentChat)) {
                this.channelAffiliateProgramsCell.setVisibility(0);
            }
        }
        checkWelcomeMessagesValue();
    }

    public final class AnonymousClass8 implements TextWatcher {
        public final int $r8$classId;

        public AnonymousClass8(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            int i = this.$r8$classId;
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
        }

        private final void afterTextChanged$org$telegram$ui$ChannelCreateActivity$7(Editable editable) {
        }

        private final void afterTextChanged$org$telegram$ui$ChatEditActivity$8(Editable editable) {
        }

        private final void beforeTextChanged$org$telegram$ui$ChannelCreateActivity$7(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$ChatEditActivity$8(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$ChannelCreateActivity$7(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$ChatEditActivity$8(int i, int i2, int i3, CharSequence charSequence) {
        }
    }

    public final class AnonymousClass9 extends ClickableSpan {
        public final int $r8$classId;

        public AnonymousClass9(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final void onClick(View view) {
            switch (this.$r8$classId) {
                case 0:
                    Browser.openUrl(view.getContext(), "https://t.me/BotFather");
                    break;
            }
        }

        @Override
        public final void updateDrawState(TextPaint textPaint) {
            switch (this.$r8$classId) {
                case 0:
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    break;
                default:
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(-1);
                    break;
            }
        }

        private final void onClick$org$telegram$ui$Stars$StarGiftSheet$14(View view) {
        }
    }
}
