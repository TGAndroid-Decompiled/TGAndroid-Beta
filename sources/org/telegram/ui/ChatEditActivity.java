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
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
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
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
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
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
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
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
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
    private static final int done_button = 1;
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
    private final List<AnimatedEmojiDrawable> preloadedReactions;
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

    public class AnonymousClass1 extends PhotoViewer.EmptyPhotoViewerProvider {
        public AnonymousClass1() {
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
                chatEditActivity.cameraDrawable = new RLottieDrawable(i, Fragment$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            }
            ChatEditActivity.this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
            ChatEditActivity.this.setAvatarCell.imageView.setAnimation(ChatEditActivity.this.cameraDrawable);
        }

        public void lambda$onDeletePhoto$1(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new ChatActivity$21$$ExternalSyntheticLambda4(this, 15));
        }

        @Override
        public boolean canLoadMoreAvatars() {
            return false;
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
        public int getTotalImageCount() {
            return 1;
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
            ChatEditActivity.this.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new LinkManager$$ExternalSyntheticLambda10(this, 1));
            return false;
        }

        @Override
        public void openPhotoForEdit(String str, String str2, boolean z) {
            ChatEditActivity.this.imageUpdater.openPhotoForEdit(str, str2, 0, z);
        }

        @Override
        public void willHidePhotoViewer() {
            ChatEditActivity.this.avatarImage.getImageReceiver().setVisible(true, true);
        }
    }

    public ChatEditActivity(Bundle bundle) {
        super(bundle);
        this.preloadedReactions = new ArrayList();
        this.provider = new AnonymousClass1();
        this.avatarDrawable = new AvatarDrawable();
        this.chatId = bundle.getLong("chat_id", 0L);
        this.userId = bundle.getLong("user_id", 0L);
        if (this.chatId == 0) {
            this.imageUpdater = new ImageUpdater(false, 0, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            this.imageUpdater = new ImageUpdater(true, (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true);
        }
    }

    public static CharSequence applyNewSpan(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        FilterCreateActivity.NewSpan newSpan = new FilterCreateActivity.NewSpan(false, 10);
        newSpan.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        newSpan.setColor(Theme.getColor(null, Theme.key_premiumGradient1, false));
        spannableStringBuilder.setSpan(newSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
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
                showDialog(new AlertDialog.Builder(getParentActivity(), 0, null).setTitle(LocaleController.getString(R.string.UserRestrictionsApplyChanges)).setMessage(LocaleController.getString(R.string.BotSettingsChangedAlert)).setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new ChatEditActivity$$ExternalSyntheticLambda5(this, 2)).setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new ChatEditActivity$$ExternalSyntheticLambda5(this, 3)).create());
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
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                builder.setTitle(LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges));
                if (this.isChannel) {
                    builder.setMessage(LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert));
                } else {
                    builder.setMessage(LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert));
                }
                builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new ChatEditActivity$$ExternalSyntheticLambda5(this, 4));
                builder.setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new ChatEditActivity$$ExternalSyntheticLambda5(this, 5));
                showDialog(builder.create());
            }
        }
        return false;
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

    public void lambda$checkDiscard$60(AlertDialog alertDialog, int i) {
        processDone();
    }

    public void lambda$checkDiscard$61(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$62(AlertDialog alertDialog, int i) {
        processDone();
    }

    public void lambda$checkDiscard$63(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$createView$10(long j) {
        updateSuggestedCell(Long.valueOf(j), false);
    }

    public void lambda$createView$11(View view) {
        PostSuggestionsEditActivity postSuggestionsEditActivity = new PostSuggestionsEditActivity(this.chatId);
        postSuggestionsEditActivity.setOnApplied(new ChatEditActivity$$ExternalSyntheticLambda5(this, 0));
        presentFragment(postSuggestionsEditActivity);
    }

    public void lambda$createView$12(View view) {
        presentFragment(new ChannelColorActivity(-this.currentChat.id).setOnApplied(this));
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(this.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public void lambda$createView$13(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            this.autoTranslationCell.getCheckBox().setIcon(tL_premium_boostsStatus.level < getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
        }
    }

    public void lambda$createView$14(TLRPC.Chat chat) {
        presentFragment(StatisticActivity.create(chat));
    }

    public void lambda$createView$15(AlertDialog alertDialog, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        alertDialog.dismiss();
        if (getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(35, this, getContext(), this.currentAccount, getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j));
        if (chat != null) {
            limitReachedBottomSheet.showStatisticButtonInLink(new ChatActivity$$ExternalSyntheticLambda80(17, this, chat));
        }
        showDialog(limitReachedBottomSheet);
    }

    public void lambda$createView$16(boolean z) {
        this.currentChat.autotranslation = z;
        getMessagesController().putChat(this.currentChat, false);
    }

    public void lambda$createView$17() {
        this.autoTranslationCell.setChecked(this.currentChat.autotranslation);
    }

    public void lambda$createView$18(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.Updates)) {
            AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda1(this, 3));
        } else {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda0(this, z, 5));
        }
    }

    public void lambda$createView$19(boolean z, boolean[] zArr, final long j, final AlertDialog alertDialog, final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
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
                    ChatEditActivity chatEditActivity = this.f$0;
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = tL_premium_boostsStatus;
                    chatEditActivity.lambda$createView$15(alertDialog, tL_premium_boostsStatus2, j, (ChannelBoostsController.CanApplyBoost) obj);
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
        getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new CallLogActivity$$ExternalSyntheticLambda31(this, z, 3), 64);
    }

    public static boolean lambda$createView$2(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$createView$20(final boolean[] zArr, final long j, View view) {
        if (zArr[0]) {
            return;
        }
        final AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 400L);
        zArr[0] = true;
        final boolean z = !this.autoTranslationCell.isChecked();
        if (!this.autoTranslationCell.getCheckBox().hasIcon()) {
            this.autoTranslationCell.setChecked(z);
        }
        getMessagesController().getBoostsController().getBoostsStats(j, new Consumer() {
            @Override
            public final void accept(Object obj) {
                ChatEditActivity chatEditActivity = this.f$0;
                boolean[] zArr2 = zArr;
                long j2 = j;
                chatEditActivity.lambda$createView$19(z, zArr2, j2, alertDialog, (TL_stories.TL_premium_boostsStatus) obj);
            }
        });
    }

    public void lambda$createView$21(RadioButtonCell[] radioButtonCellArr, BottomSheet.Builder builder, View view) {
        Integer num = (Integer) view.getTag();
        radioButtonCellArr[0].radioButton.setChecked(num.intValue() == 0, true);
        radioButtonCellArr[1].radioButton.setChecked(num.intValue() == 1, true);
        this.historyHidden = num.intValue() == 1;
        builder.bottomSheet.dismissRunnable.run();
        updateFields(true, true);
    }

    public void lambda$createView$22(Context context, View view) {
        BottomSheet.Builder builder = new BottomSheet.Builder(context, null);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyTopPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        HeaderCell headerCell = new HeaderCell(context, Theme.key_dialogTextBlue2, 23, 15, false);
        headerCell.setHeight(47);
        headerCell.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
        linearLayout.addView(headerCell);
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        linearLayout.addView(linearLayoutM, LayoutHelper.createLinear(-1, -2));
        RadioButtonCell[] radioButtonCellArr = new RadioButtonCell[2];
        int i = 0;
        for (int i2 = 2; i < i2; i2 = 2) {
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
            linearLayoutM.addView(radioButtonCellArr[i], LayoutHelper.createLinear(-1, -2));
            radioButtonCellArr[i].setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda0(this, radioButtonCellArr, builder, 9));
            i++;
        }
        bottomSheet.customView = linearLayout;
        showDialog(bottomSheet);
    }

    public void lambda$createView$23(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.boostsStatus = tL_premium_boostsStatus;
    }

    public void lambda$createView$24(View view) {
        GroupColorActivity groupColorActivity = new GroupColorActivity(-this.currentChat.id);
        groupColorActivity.boostsStatus = this.boostsStatus;
        groupColorActivity.setOnApplied(this);
        presentFragment(groupColorActivity);
    }

    public void lambda$createView$25(AlertDialog alertDialog, long j) {
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

    public void lambda$createView$26(View view, Boolean bool, Boolean bool2) {
        this.forum = bool.booleanValue();
        this.forumTabs = bool2.booleanValue();
        this.avatarImage.animateToRoundRadius(AndroidUtilities.dp(this.forum ? 16.0f : 32.0f));
        ((TextCell) view).setChecked(this.forum);
        updateFields(false, true);
        if (!this.donePressed) {
            TLRPC.Chat chat = this.currentChat;
            if (chat.forum != this.forum || chat.forum_tabs != this.forumTabs) {
                if (ChatObject.isChannel(chat) || !this.forum) {
                    boolean z = this.currentChat.forum_tabs != this.forumTabs;
                    getMessagesController().toggleChannelForum(this.chatId, this.forum, this.forumTabs);
                    TLRPC.Chat chat2 = this.currentChat;
                    chat2.forum = this.forum;
                    chat2.forum_tabs = this.forumTabs;
                    if (z) {
                        updatePastFragmentsOnTabs();
                        return;
                    }
                    return;
                }
                Context context = getContext();
                if (context == null) {
                    context = LaunchActivity.instance;
                }
                if (context == null) {
                    context = ApplicationLoader.applicationContext;
                }
                if (context != null) {
                    AlertDialog alertDialog = new AlertDialog(context, 3, null);
                    this.donePressed = true;
                    AndroidUtilities.cancelRunOnUIThread(alertDialog.showRunnable);
                    AndroidUtilities.runOnUIThread(alertDialog.showRunnable, 250L);
                    getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new WearAuthSheet$$ExternalSyntheticLambda3(29, this, alertDialog));
                }
            }
        }
    }

    public void lambda$createView$27(FrameLayout frameLayout, View view) {
        if (this.canForum) {
            EnableTopicsActivity enableTopicsActivity = new EnableTopicsActivity(-this.chatId);
            enableTopicsActivity.setResourceProvider(this.resourceProvider);
            enableTopicsActivity.setOnForumChanged(this.forum, this.forumTabs, new OAuthSheet$$ExternalSyntheticLambda19(5, this, view));
            presentFragment(enableTopicsActivity);
            return;
        }
        TLRPC.ChatFull chatFull = this.info;
        BulletinFactory.of(this).createSimpleBulletin(R.raw.topics, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).show();
        try {
            frameLayout.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    public void lambda$createView$28(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("type", ((this.isChannel || this.currentChat.gigagroup) && !ChatObject.isCommunity(this.currentChat)) ? 0 : 3);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(this.info);
        presentFragment(chatUsersActivity);
    }

    public void lambda$createView$29(View view) {
        ManageLinksActivity manageLinksActivity = new ManageLinksActivity(this.chatId, 0L, 0);
        TLRPC.ChatFull chatFull = this.info;
        manageLinksActivity.setInfo(chatFull, chatFull.exported_invite);
        presentFragment(manageLinksActivity);
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

    public void lambda$createView$30(View view) {
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

    public void lambda$createView$31(View view) {
        Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(9, "chatMode");
        bundleM.putLong("chat_id", this.chatId);
        bundleM.putLong("welcome_messages_chat_id", this.chatId);
        presentFragment(new ChatActivity(bundleM));
    }

    public void lambda$createView$32(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("type", 1);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(this.info);
        presentFragment(chatUsersActivity);
    }

    public void lambda$createView$33(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("type", 2);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(this.info);
        presentFragment(chatUsersActivity);
    }

    public void lambda$createView$34(View view) {
        presentFragment(new MemberRequestsActivity(this.chatId));
    }

    public void lambda$createView$35(View view) {
        presentFragment(new ChannelAffiliateProgramsFragment(-this.chatId));
    }

    public void lambda$createView$36(View view) {
        presentFragment(new ChannelAdminLogActivity(this.currentChat));
    }

    public void lambda$createView$37(View view) {
        presentFragment(StatisticActivity.create(this.currentChat, false));
    }

    public void lambda$createView$38(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("bot_id", this.userId);
        presentFragment(new ChangeUsernameActivity(bundle));
    }

    public void lambda$createView$39(View view) {
        presentFragment(new AffiliateProgramFragment(this.userId));
    }

    public void lambda$createView$4(View view) {
        openSetPhotoAlert();
    }

    public void lambda$createView$40(View view) {
        Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + getActiveUsername(this.currentUser) + "-intro");
    }

    public void lambda$createView$41(View view) {
        Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + getActiveUsername(this.currentUser) + "-commands");
    }

    public void lambda$createView$42(View view) {
        Browser.openUrl(view.getContext(), "https://t.me/BotFather?start=" + getActiveUsername(this.currentUser));
    }

    public void lambda$createView$43(View view) {
        int i = this.currentAccount;
        long j = this.userId;
        TL_bots.botVerifierSettings botverifiersettings = this.userInfo.bot_info.verifier_settings;
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        Bundle bundleM = TelegramMediaSession$$ExternalSyntheticOutline0.m("onlySelect", "dialogsType", 16, true);
        bundleM.putBoolean("resetDelegate", false);
        DialogsActivity dialogsActivity = new DialogsActivity(bundleM);
        dialogsActivity.setCurrentAccount(i);
        dialogsActivity.setDelegate(new BotVerifySheet$$ExternalSyntheticLambda0(dialogsActivity, i, j, botverifiersettings));
        safeLastFragment.presentFragment(dialogsActivity);
    }

    public void lambda$createView$44(BotStarsController botStarsController, View view) {
        if (botStarsController.getStarsRevenueStats(this.userId, false) != null) {
            presentFragment(new BotStarsActivity(1, this.userId));
        }
    }

    public void lambda$createView$45(BotStarsController botStarsController, View view) {
        if (botStarsController.getStarsRevenueStats(this.userId, false) != null) {
            presentFragment(new BotStarsActivity(0, this.userId));
        }
    }

    public void lambda$createView$46(long j, View view) {
        if (ChatObject.hasAdminRights(getMessagesController().getChat(Long.valueOf(j)))) {
            presentFragment(new CommunityEditActivity(FBool.m(j, "community_id")));
        } else {
            showDialog(new CommunitySheet(this, j, null, null));
        }
    }

    public void lambda$createView$47(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            BulletinFactory.of(this).showForError(tL_error);
        }
        AndroidUtilities.removeFromParent(this.communityGapView);
        AndroidUtilities.removeFromParent(this.communityLinkView);
        AndroidUtilities.removeFromParent(this.communityUnlinkCell);
    }

    public void lambda$createView$48(long j, long j2) {
        MessagesController.getInstance(this.currentAccount).unlinkCommunity(j, j2, new LinkManager$$ExternalSyntheticLambda6(this, 9));
    }

    public void lambda$createView$49(boolean z, long j, long j2, View view) {
        int i;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z) {
            i = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else {
            i = this.isChannel ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        AlertsCreator.showSimpleConfirmAlert(this, string, LocaleController.getString(i), LocaleController.getString(R.string.Remove), true, new ChatActivity$$ExternalSyntheticLambda140(this, j, j2, 2));
    }

    public boolean lambda$createView$5(TextView textView, int i, KeyEvent keyEvent) {
        View view;
        if (i != 6 || (view = this.doneButton) == null) {
            return false;
        }
        view.performClick();
        return true;
    }

    public void lambda$createView$50(long j, View view) {
        presentFragment(new CommunityCreateActivity(FBool.m(j, "dialog_id")));
    }

    public void lambda$createView$51(boolean z) {
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-this.chatId));
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        finishFragment();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-this.currentChat.id), null, this.currentChat, Boolean.valueOf(z));
    }

    public void lambda$createView$52(View view) {
        AlertsCreator.createClearOrDeleteDialogAlert(this, false, this.currentChat, null, false, true, true, false, new ChatEditActivity$$ExternalSyntheticLambda5(this, 6));
    }

    public void lambda$createView$6(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        TLRPC.ChatFull chatFull = this.info;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        updateFields(false, true);
        getMessagesController().loadFullChat(this.chatId, 0, true);
    }

    public void lambda$createView$7(View view) {
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
            locationActivity.setDelegate(new PhotoViewer$$ExternalSyntheticLambda96(this, 3));
            presentFragment(locationActivity);
        }
    }

    public void lambda$createView$8(View view) {
        long j = this.chatId;
        TextCell textCell = this.locationCell;
        ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j, textCell != null && textCell.getVisibility() == 0);
        chatEditTypeActivity.setInfo(this.info);
        presentFragment(chatEditTypeActivity);
    }

    public void lambda$createView$9(View view) {
        ChatLinkActivity chatLinkActivity = new ChatLinkActivity(this.chatId);
        chatLinkActivity.setInfo(this.info);
        presentFragment(chatLinkActivity);
    }

    public void lambda$didUploadPhoto$57() {
        this.hasUploadedPhoto = true;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public void lambda$didUploadPhoto$58(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda1(this, 0));
    }

    public void lambda$didUploadPhoto$59(TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        TLRPC.FileLocation fileLocation = photoSize.location;
        this.avatar = fileLocation;
        if (inputFile == null && inputFile2 == null && videoSize == null) {
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
                int i = R.raw.camera_outline;
                this.cameraDrawable = new RLottieDrawable(i, Fragment$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            }
            this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.setAvatarCell.imageView.setAnimation(this.cameraDrawable);
            showAvatarProgress(true, false);
            return;
        }
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
                int i2 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i2 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            tL_photos_uploadProfilePhoto.bot = getMessagesController().getInputUser(this.currentUser);
            tL_photos_uploadProfilePhoto.flags |= 32;
            getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ChatEditActivity$$ExternalSyntheticLambda3(this, 1));
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
    }

    public void lambda$getThemeDescriptions$70() {
        BackupImageView backupImageView = this.avatarImage;
        if (backupImageView != null) {
            backupImageView.invalidate();
        }
    }

    public void lambda$loadLinksCount$0(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            this.info.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject).count;
            getMessagesStorage().saveChatLinksCount(this.chatId, this.info.invitesCount);
            updateFields(false, false);
        }
    }

    public void lambda$loadLinksCount$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda30(this, tL_error, tLObject, 13));
    }

    public void lambda$openSetPhotoAlert$53() {
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
            this.cameraDrawable = new RLottieDrawable(i, Fragment$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
        }
        this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
        this.setAvatarCell.imageView.setAnimation(this.cameraDrawable);
    }

    public void lambda$openSetPhotoAlert$54(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda1(this, 1));
    }

    public void lambda$openSetPhotoAlert$55() {
        this.avatar = null;
        if (this.userId == 0) {
            MessagesController.getInstance(this.currentAccount).changeChatAvatar(this.chatId, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = getMessagesController().getInputUser(this.userId);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ChatEditActivity$$ExternalSyntheticLambda3(this, 0));
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

    public void lambda$openSetPhotoAlert$56(DialogInterface dialogInterface) {
        if (this.imageUpdater.isUploadingImage()) {
            this.cameraDrawable.setCurrentFrame(0, false);
        } else {
            this.cameraDrawable.setCustomEndFrame(86);
            this.setAvatarCell.imageView.playAnimation();
        }
    }

    public void lambda$processDone$64() {
        this.progressDialog.dismiss();
        finishFragment();
    }

    public void lambda$processDone$65(TL_bots.setBotInfo setbotinfo, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.UserFull userFull = this.userInfo;
        if (userFull != null) {
            userFull.about = setbotinfo.about;
            getMessagesStorage().updateUserInfo(this.userInfo, false);
        }
        AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda1(this, 2));
    }

    public void lambda$processDone$66(int i, DialogInterface dialogInterface) {
        this.donePressed = false;
        this.progressDialog = null;
        getConnectionsManager().cancelRequest(i, true);
    }

    public void lambda$processDone$67(long j) {
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

    public void lambda$processDone$68(DialogInterface dialogInterface) {
        this.createAfterUpload = false;
        this.progressDialog = null;
        this.donePressed = false;
    }

    public void lambda$updateHistoryShow$69(ArrayList arrayList, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.historyCell.setAlpha(fFloatValue);
        TextCell textCell = this.historyCell;
        float f = 1.0f - fFloatValue;
        textCell.setTranslationY(((-textCell.getHeight()) / 2.0f) * f);
        this.historyCell.setScaleY((fFloatValue * 0.8f) + 0.2f);
        for (int i = 0; i < arrayList.size(); i++) {
            ((View) arrayList.get(i)).setTranslationY((-this.historyCell.getHeight()) * f);
        }
    }

    private void loadLinksCount() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.chatId);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ChatEditActivity$$ExternalSyntheticLambda3(this, 2));
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
            this.progressDialog.setOnCancelListener(new ChangeBioActivity$$ExternalSyntheticLambda5(this, getConnectionsManager().sendRequest(setbotinfo, new IntroActivity$$ExternalSyntheticLambda6(22, this, setbotinfo)), 3));
            this.progressDialog.show();
            return;
        }
        if (!ChatObject.isChannel(this.currentChat) && (!this.historyHidden || this.forum)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new ChatEditActivity$$ExternalSyntheticLambda5(this, 1));
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
            alertDialog.setOnCancelListener(new LinkManager$$ExternalSyntheticLambda4(this, 2));
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
                for (int i = 0; i < fragmentStack.size(); i++) {
                    if ((fragmentStack.get(i) instanceof ChatActivity) && ((ChatActivity) fragmentStack.get(i)).getArguments().getLong("chat_id") == this.chatId) {
                        ((ActionBarLayout) getParentLayout()).removeFragmentFromStack(i);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.chatId);
                        ((ActionBarLayout) getParentLayout()).addFragmentToStack(i, TopicsFragment.getTopicsOrChat(this, bundle));
                    }
                }
            }
            if (z4) {
                updatePastFragmentsOnTabs();
            }
        }
        finishFragment();
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
                    this.cameraDrawable = new RLottieDrawable(i, Fragment$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
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
            if (z) {
                this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), R.drawable.msg_addphoto, true);
            } else {
                this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), R.drawable.msg_addphoto, true);
            }
            if (this.cameraDrawable == null) {
                int i2 = R.raw.camera_outline;
                this.cameraDrawable = new RLottieDrawable(i2, Fragment$$ExternalSyntheticOutline0.m(i2, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
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
            public void onAnimationCancel(Animator animator) {
                ChatEditActivity.this.avatarAnimation = null;
            }

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
        });
        this.avatarAnimation.start();
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

    private void updateFields(boolean z, boolean z2) {
        int sendMediaSelectedCount;
        int i;
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
                            this.linkedCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("Discussion", R.string.Discussion), (CharSequence) zzii.m("@", publicUsername), R.drawable.msg_discuss, true);
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
                            String strM = zzii.m("@", publicUsername2);
                            int i6 = R.drawable.msg_channel;
                            TextCell textCell15 = this.forumsCell;
                            textCell14.setTextAndValueAndIcon(string3, strM, i6, textCell15 != null && textCell15.getVisibility() == 0);
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
                    TextCell textCell17 = this.typeCell;
                    String string4 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i7 = R.drawable.msg_channel;
                    TextCell textCell18 = this.historyCell;
                    textCell17.setTextAndValueAndIcon(string4, string, i7, (textCell18 != null && textCell18.getVisibility() == 0) || ((textCell3 = this.linkedCell) != null && textCell3.getVisibility() == 0) || ((textCell4 = this.forumsCell) != null && textCell4.getVisibility() == 0));
                } else {
                    TextCell textCell19 = this.typeCell;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i8 = R.drawable.msg_groups;
                    TextCell textCell20 = this.historyCell;
                    textCell19.setTextAndValueAndIcon(string5, string, i8, (textCell20 != null && textCell20.getVisibility() == 0) || ((textCell = this.linkedCell) != null && textCell.getVisibility() == 0) || ((textCell2 = this.forumsCell) != null && textCell2.getVisibility() == 0));
                }
            } else {
                String string6 = !zIsPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.currentChat));
                TextCell textCell21 = this.typeCell;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i9 = R.drawable.msg_channel;
                TextCell textCell22 = this.historyCell;
                textCell21.setTextAndValueAndIcon(string7, string6, i9, (textCell22 != null && textCell22.getVisibility() == 0) || ((textCell5 = this.linkedCell) != null && textCell5.getVisibility() == 0) || ((textCell6 = this.forumsCell) != null && textCell6.getVisibility() == 0));
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
                if (!this.isChannel || ChatObject.isCommunity(this.currentChat)) {
                    if (ChatObject.isChannel(this.currentChat)) {
                        this.membersCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("ChannelMembers", R.string.ChannelMembers), (CharSequence) String.format("%d", Integer.valueOf(this.info.participants_count)), R.drawable.msg_groups, true);
                    } else {
                        this.membersCell.setTextAndValueAndIcon(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.info.participants.participants.size())), R.drawable.msg_groups, this.memberRequestsCell.getVisibility() == 0);
                    }
                    TLRPC.Chat chat3 = this.currentChat;
                    if (!chat3.gigagroup || ChatObject.isCommunity(chat3)) {
                        int i10 = this.forum ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.currentChat.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i11 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i11++;
                            }
                            sendMediaSelectedCount = ChatUsersActivity.getSendMediaSelectedCount(tL_chatBannedRights) + i11;
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
                            i = i10;
                        } else {
                            sendMediaSelectedCount = i10;
                            i = sendMediaSelectedCount;
                        }
                        this.blockCell.setTextAndValueAndIcon(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(sendMediaSelectedCount), Integer.valueOf(i)), z2, R.drawable.msg_permissions, true);
                    } else {
                        TextCell textCell24 = this.blockCell;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.info;
                        String str5 = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i12 = R.drawable.msg_user_remove;
                        TextCell textCell25 = this.logCell;
                        textCell24.setTextAndValueAndIcon(string8, str5, i12, textCell25 != null && textCell25.getVisibility() == 0);
                    }
                    TextCell textCell26 = this.memberRequestsCell;
                    if (textCell26 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String str6 = String.format("%d", Integer.valueOf(this.info.requests_pending));
                        int i13 = R.drawable.msg_requests;
                        TextCell textCell27 = this.logCell;
                        textCell26.setTextAndValueAndIcon(string9, str6, i13, textCell27 != null && textCell27.getVisibility() == 0);
                    }
                } else {
                    this.membersCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), (CharSequence) String.format("%d", Integer.valueOf(this.info.participants_count)), R.drawable.msg_groups, true);
                    TextCell textCell28 = this.blockCell;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.info;
                    String str7 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i14 = R.drawable.msg_user_remove;
                    TextCell textCell29 = this.logCell;
                    textCell28.setTextAndValueAndIcon(string10, str7, i14, textCell29 != null && textCell29.getVisibility() == 0);
                }
                this.adminCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), (CharSequence) String.format("%d", Integer.valueOf(ChatObject.isChannel(this.currentChat) ? this.info.admins_count : getAdminCount())), R.drawable.msg_admins, true);
            } else {
                if (!this.isChannel || ChatObject.isCommunity(this.currentChat)) {
                    TextCell textCell30 = this.membersCell;
                    String string11 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i15 = R.drawable.msg_groups;
                    TextCell textCell31 = this.logCell;
                    textCell30.setTextAndIcon(string11, i15, textCell31 != null && textCell31.getVisibility() == 0);
                    if (this.currentChat.gigagroup) {
                        TextCell textCell32 = this.blockCell;
                        String string12 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i16 = R.drawable.msg_chats_remove;
                        TextCell textCell33 = this.logCell;
                        textCell32.setTextAndIcon(string12, i16, textCell33 != null && textCell33.getVisibility() == 0);
                    } else {
                        this.blockCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.ChannelPermissions), R.drawable.msg_permissions, true);
                    }
                } else {
                    this.membersCell.setTextAndIcon((CharSequence) LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), R.drawable.msg_groups, true);
                    TextCell textCell34 = this.blockCell;
                    String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i17 = R.drawable.msg_chats_remove;
                    TextCell textCell35 = this.logCell;
                    textCell34.setTextAndIcon(string13, i17, textCell35 != null && textCell35.getVisibility() == 0);
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
            ((View) arrayList.get(i3)).setTranslationY((1.0f - this.historyCell.getAlpha()) * (-this.historyCell.getHeight()));
        }
        if (z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.historyCell.getAlpha(), z ? 1.0f : 0.0f);
            this.updateHistoryShowAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda2(3, this, arrayList));
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

    private void updatePastFragmentsOnTabs() {
        DialogsActivity dialogsActivity;
        RightSlidingDialogContainer rightSlidingDialogContainer;
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
                if (topicsFragment.getCurrentChat() != null && topicsFragment.getCurrentChat().id == this.chatId) {
                    INavigationLayout parentLayout2 = getParentLayout();
                    parentLayout2.getClass();
                    ((ActionBarLayout) parentLayout2).removeFragmentFromStack(topicsFragment, false);
                    i--;
                }
            } else if (this.forumTabs && (fragmentStack.get(i) instanceof DialogsActivity) && (dialogsActivity = (DialogsActivity) fragmentStack.get(i)) != null && (rightSlidingDialogContainer = dialogsActivity.rightSlidingDialogContainer) != null && rightSlidingDialogContainer.hasFragment()) {
                dialogsActivity.rightSlidingDialogContainer.lambda$presentFragment$1();
            }
            i++;
        }
    }

    private void updatePublicLinksCount() {
        if (this.publicLinkCell == null) {
            return;
        }
        if (this.currentUser.usernames.size() <= 1) {
            this.publicLinkCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotPublicLink), (CharSequence) ("t.me/" + this.currentUser.username), R.drawable.msg_link2, true);
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
        this.publicLinkCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotPublicLinks), (CharSequence) LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i2), Integer.valueOf(this.currentUser.usernames.size())), R.drawable.msg_link2, true);
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
    public final boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public View createView(Context context) {
        float f;
        final ChatEditActivity chatEditActivity;
        ViewGroup viewGroup;
        Context context2;
        String str;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.User user;
        final ChatEditActivity chatEditActivity2;
        int i;
        int i2;
        int i3;
        int i4;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        final int i5 = 20;
        final int i6 = 6;
        int i7 = 13;
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i8) {
                if (i8 == -1) {
                    if (ChatEditActivity.this.checkDiscard(true)) {
                        ChatEditActivity.this.finishFragment();
                    }
                } else if (i8 == 1) {
                    ChatEditActivity.this.processDone();
                }
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            private boolean ignoreLayout;

            @Override
            public void onLayout(boolean z, int i8, int i9, int i10, int i11) {
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int paddingTop;
                int measuredHeight;
                int measuredHeight2;
                int childCount = getChildCount();
                int iMeasureKeyboardHeight = measureKeyboardHeight();
                int emojiPadding = (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : ChatEditActivity.this.nameTextView.getEmojiPadding();
                setBottomClip(emojiPadding);
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = getChildAt(i17);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        int i18 = layoutParams.gravity;
                        if (i18 == -1) {
                            i18 = 51;
                        }
                        int i19 = i18 & 112;
                        int i20 = i18 & 7;
                        if (i20 != 1) {
                            if (i20 != 5) {
                                i14 = layoutParams.leftMargin;
                            } else {
                                i12 = i10 - measuredWidth;
                                i13 = layoutParams.rightMargin;
                            }
                            if (i19 != 16) {
                                if (i19 != 48) {
                                    paddingTop = layoutParams.topMargin + getPaddingTop();
                                } else if (i19 != 80) {
                                    paddingTop = layoutParams.topMargin;
                                } else {
                                    i15 = ((i11 - emojiPadding) - i9) - measuredHeight3;
                                    i16 = layoutParams.bottomMargin;
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
                                childAt.layout(i14, paddingTop, measuredWidth + i14, measuredHeight3 + paddingTop);
                            } else {
                                i15 = ((((i11 - emojiPadding) - i9) - measuredHeight3) / 2) + layoutParams.topMargin;
                                i16 = layoutParams.bottomMargin;
                            }
                            paddingTop = i15 - i16;
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
                            childAt.layout(i14, paddingTop, measuredWidth + i14, measuredHeight3 + paddingTop);
                        } else {
                            i12 = (((i10 - i8) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i13 = layoutParams.rightMargin;
                        }
                        i14 = i12 - i13;
                        if (i19 != 16) {
                            if (i19 != 48) {
                                paddingTop = layoutParams.topMargin + getPaddingTop();
                            } else if (i19 != 80) {
                                paddingTop = layoutParams.topMargin;
                            } else {
                                i15 = ((i11 - emojiPadding) - i9) - measuredHeight3;
                                i16 = layoutParams.bottomMargin;
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
                            childAt.layout(i14, paddingTop, measuredWidth + i14, measuredHeight3 + paddingTop);
                        } else {
                            i15 = ((((i11 - emojiPadding) - i9) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i16 = layoutParams.bottomMargin;
                        }
                        paddingTop = i15 - i16;
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
                        childAt.layout(i14, paddingTop, measuredWidth + i14, measuredHeight3 + paddingTop);
                    }
                }
                notifyHeightChanged();
            }

            @Override
            public void onMeasure(int i8, int i9) {
                int size = View.MeasureSpec.getSize(i8);
                int size2 = View.MeasureSpec.getSize(i9);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                measureChildWithMargins(((BaseFragment) ChatEditActivity.this).actionBar, i8, 0, i9, 0);
                if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                    this.ignoreLayout = true;
                    ChatEditActivity.this.nameTextView.hideEmojiView();
                    this.ignoreLayout = false;
                }
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) ChatEditActivity.this).actionBar) {
                        if (ChatEditActivity.this.nameTextView == null || !ChatEditActivity.this.nameTextView.isPopupView(childAt)) {
                            measureChildWithMargins(childAt, i8, 0, i9, 0);
                        } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight)), 1073741824));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight), 1073741824));
                        }
                    }
                }
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        sizeNotifierFrameLayout.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(i7));
        this.fragmentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        SectionsScrollView.SectionsLinearLayout sectionsLinearLayout = new SectionsScrollView.SectionsLinearLayout(context);
        this.linearLayout = sectionsLinearLayout;
        SectionsScrollView sectionsScrollView = new SectionsScrollView(context, this.linearLayout, this.resourceProvider, false);
        this.scrollView = sectionsScrollView;
        sectionsScrollView.setFillViewport(true);
        sizeNotifierFrameLayout.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.scrollView);
        this.scrollView.addView(sectionsLinearLayout, new FrameLayout.LayoutParams(-1, -2));
        sectionsLinearLayout.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.avatarContainer = linearLayout;
        linearLayout.setOrientation(1);
        this.avatarContainer.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        sectionsLinearLayout.addView(this.avatarContainer, LayoutHelper.createLinear(-1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
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
            public void invalidate(int i8, int i9, int i10, int i11) {
                if (ChatEditActivity.this.avatarOverlay != null) {
                    ChatEditActivity.this.avatarOverlay.invalidate();
                }
                super.invalidate(i8, i9, i10, i11);
            }
        };
        this.avatarImage = backupImageView;
        backupImageView.setRoundRadius(this.forum ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        if (this.currentUser != null || ChatObject.canChangeChatInfo(this.currentChat)) {
            f = 30.0f;
            BackupImageView backupImageView2 = this.avatarImage;
            boolean z = LocaleController.isRTL;
            frameLayout.addView(backupImageView2, LayoutHelper.createFrame(64, 64.0f, (z ? 5 : 3) | 48, z ? 0.0f : 16.0f, 12.0f, z ? 16.0f : 0.0f, 8.0f));
            final Paint paint = new Paint(1);
            paint.setColor(1426063360);
            View view = new View(context) {
                @Override
                public void onDraw(Canvas canvas) {
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
            this.avatarContainer.setOnClickListener(new View.OnClickListener(this) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i6) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
                }
            });
        } else {
            BackupImageView backupImageView3 = this.avatarImage;
            boolean z4 = LocaleController.isRTL;
            int i8 = (z4 ? 5 : 3) | 48;
            float f2 = z4 ? 0.0f : 16.0f;
            float f3 = z4 ? 16.0f : 0.0f;
            f = 30.0f;
            frameLayout.addView(backupImageView3, LayoutHelper.createFrame(64, 64.0f, i8, f2, 12.0f, f3, 12.0f));
        }
        final int i9 = 1;
        int i10 = 3;
        final int i11 = 0;
        EditTextEmoji editTextEmoji2 = new EditTextEmoji(context, sizeNotifierFrameLayout, this, 0, false);
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
            public void afterTextChanged(Editable editable) {
                ChatEditActivity.this.avatarDrawable.setInfo(5L, ChatEditActivity.this.nameTextView.getText().toString(), null);
                if (ChatEditActivity.this.avatarImage != null) {
                    ChatEditActivity.this.avatarImage.invalidate();
                }
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
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
                public void onDraw(Canvas canvas) {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                }
            };
            this.setAvatarCell = textCell;
            textCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            this.setAvatarCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
            final int i12 = 17;
            this.setAvatarCell.setOnClickListener(new View.OnClickListener(this) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
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
        int i13 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor2.setTextColor(Theme.getColor(i13));
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
        this.descriptionTextView.setCursorColor(Theme.getColor(i13));
        this.descriptionTextView.setCursorSize(AndroidUtilities.dp(20.0f));
        this.descriptionTextView.setCursorWidth(1.5f);
        if (this.descriptionTextView.isEnabled()) {
            this.settingsContainer.addView(this.descriptionTextView, LayoutHelper.createLinear(-1, -2, 23.0f, 15.0f, 23.0f, 9.0f));
        } else {
            this.settingsContainer.addView(this.descriptionTextView, LayoutHelper.createLinear(-1, -2, 23.0f, 12.0f, 23.0f, 6.0f));
        }
        this.descriptionTextView.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda350(this, i10));
        this.descriptionTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
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
        String str2 = "";
        if (chat2 != null) {
            if (chat2.megagroup && ((chatFull3 = this.info) == null || chatFull3.can_set_location)) {
                TextCell textCell2 = new TextCell(context);
                this.locationCell = textCell2;
                textCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.locationCell, LayoutHelper.createLinear(-1, -2));
                this.locationCell.setOnClickListener(new View.OnClickListener(this) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i5) {
                            case 0:
                                this.f$0.lambda$createView$24(view2);
                                break;
                            case 1:
                                this.f$0.lambda$createView$28(view2);
                                break;
                            case 2:
                                this.f$0.lambda$createView$29(view2);
                                break;
                            case 3:
                                this.f$0.lambda$createView$30(view2);
                                break;
                            case 4:
                                this.f$0.lambda$createView$31(view2);
                                break;
                            case 5:
                                this.f$0.lambda$createView$32(view2);
                                break;
                            case 6:
                                this.f$0.lambda$createView$3(view2);
                                break;
                            case 7:
                                this.f$0.lambda$createView$33(view2);
                                break;
                            case 8:
                                this.f$0.lambda$createView$34(view2);
                                break;
                            case 9:
                                this.f$0.lambda$createView$35(view2);
                                break;
                            case 10:
                                this.f$0.lambda$createView$36(view2);
                                break;
                            case 11:
                                this.f$0.lambda$createView$37(view2);
                                break;
                            case 12:
                                this.f$0.lambda$createView$38(view2);
                                break;
                            case 13:
                                this.f$0.lambda$createView$39(view2);
                                break;
                            case 14:
                                this.f$0.lambda$createView$40(view2);
                                break;
                            case 15:
                                this.f$0.lambda$createView$41(view2);
                                break;
                            case 16:
                                this.f$0.lambda$createView$42(view2);
                                break;
                            case 17:
                                this.f$0.lambda$createView$4(view2);
                                break;
                            case 18:
                                this.f$0.lambda$createView$43(view2);
                                break;
                            case 19:
                                this.f$0.lambda$createView$52(view2);
                                break;
                            case 20:
                                this.f$0.lambda$createView$7(view2);
                                break;
                            case 21:
                                this.f$0.lambda$createView$8(view2);
                                break;
                            case 22:
                                this.f$0.lambda$createView$9(view2);
                                break;
                            case 23:
                                this.f$0.lambda$createView$11(view2);
                                break;
                            default:
                                this.f$0.lambda$createView$12(view2);
                                break;
                        }
                    }
                });
            }
            if (this.currentChat.creator && ((chatFull2 = this.info) == null || chatFull2.can_set_username)) {
                TextCell textCell3 = new TextCell(context);
                this.typeCell = textCell3;
                textCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.typeCell, LayoutHelper.createLinear(-1, -2));
                final int i14 = 21;
                this.typeCell.setOnClickListener(new View.OnClickListener(this) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                this.f$0.lambda$createView$24(view2);
                                break;
                            case 1:
                                this.f$0.lambda$createView$28(view2);
                                break;
                            case 2:
                                this.f$0.lambda$createView$29(view2);
                                break;
                            case 3:
                                this.f$0.lambda$createView$30(view2);
                                break;
                            case 4:
                                this.f$0.lambda$createView$31(view2);
                                break;
                            case 5:
                                this.f$0.lambda$createView$32(view2);
                                break;
                            case 6:
                                this.f$0.lambda$createView$3(view2);
                                break;
                            case 7:
                                this.f$0.lambda$createView$33(view2);
                                break;
                            case 8:
                                this.f$0.lambda$createView$34(view2);
                                break;
                            case 9:
                                this.f$0.lambda$createView$35(view2);
                                break;
                            case 10:
                                this.f$0.lambda$createView$36(view2);
                                break;
                            case 11:
                                this.f$0.lambda$createView$37(view2);
                                break;
                            case 12:
                                this.f$0.lambda$createView$38(view2);
                                break;
                            case 13:
                                this.f$0.lambda$createView$39(view2);
                                break;
                            case 14:
                                this.f$0.lambda$createView$40(view2);
                                break;
                            case 15:
                                this.f$0.lambda$createView$41(view2);
                                break;
                            case 16:
                                this.f$0.lambda$createView$42(view2);
                                break;
                            case 17:
                                this.f$0.lambda$createView$4(view2);
                                break;
                            case 18:
                                this.f$0.lambda$createView$43(view2);
                                break;
                            case 19:
                                this.f$0.lambda$createView$52(view2);
                                break;
                            case 20:
                                this.f$0.lambda$createView$7(view2);
                                break;
                            case 21:
                                this.f$0.lambda$createView$8(view2);
                                break;
                            case 22:
                                this.f$0.lambda$createView$9(view2);
                                break;
                            case 23:
                                this.f$0.lambda$createView$11(view2);
                                break;
                            default:
                                this.f$0.lambda$createView$12(view2);
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.currentChat) && ((this.isChannel && ChatObject.canUserDoAdminAction(this.currentChat, 1)) || (!this.isChannel && ChatObject.canUserDoAdminAction(this.currentChat, 0)))) {
                TextCell textCell4 = new TextCell(context);
                this.linkedCell = textCell4;
                textCell4.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.linkedCell, LayoutHelper.createLinear(-1, -2));
                final int i15 = 22;
                this.linkedCell.setOnClickListener(new View.OnClickListener(this) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i15) {
                            case 0:
                                this.f$0.lambda$createView$24(view2);
                                break;
                            case 1:
                                this.f$0.lambda$createView$28(view2);
                                break;
                            case 2:
                                this.f$0.lambda$createView$29(view2);
                                break;
                            case 3:
                                this.f$0.lambda$createView$30(view2);
                                break;
                            case 4:
                                this.f$0.lambda$createView$31(view2);
                                break;
                            case 5:
                                this.f$0.lambda$createView$32(view2);
                                break;
                            case 6:
                                this.f$0.lambda$createView$3(view2);
                                break;
                            case 7:
                                this.f$0.lambda$createView$33(view2);
                                break;
                            case 8:
                                this.f$0.lambda$createView$34(view2);
                                break;
                            case 9:
                                this.f$0.lambda$createView$35(view2);
                                break;
                            case 10:
                                this.f$0.lambda$createView$36(view2);
                                break;
                            case 11:
                                this.f$0.lambda$createView$37(view2);
                                break;
                            case 12:
                                this.f$0.lambda$createView$38(view2);
                                break;
                            case 13:
                                this.f$0.lambda$createView$39(view2);
                                break;
                            case 14:
                                this.f$0.lambda$createView$40(view2);
                                break;
                            case 15:
                                this.f$0.lambda$createView$41(view2);
                                break;
                            case 16:
                                this.f$0.lambda$createView$42(view2);
                                break;
                            case 17:
                                this.f$0.lambda$createView$4(view2);
                                break;
                            case 18:
                                this.f$0.lambda$createView$43(view2);
                                break;
                            case 19:
                                this.f$0.lambda$createView$52(view2);
                                break;
                            case 20:
                                this.f$0.lambda$createView$7(view2);
                                break;
                            case 21:
                                this.f$0.lambda$createView$8(view2);
                                break;
                            case 22:
                                this.f$0.lambda$createView$9(view2);
                                break;
                            case 23:
                                this.f$0.lambda$createView$11(view2);
                                break;
                            default:
                                this.f$0.lambda$createView$12(view2);
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.currentChat) && this.isChannel && ChatObject.canUserDoAdminAction(this.currentChat, 1)) {
                TextCell textCell5 = new TextCell(context);
                this.suggestedCell = textCell5;
                textCell5.setBackground(Theme.getSelectorDrawable(true));
                this.suggestedCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.PostSuggestions), (CharSequence) "", R.drawable.msg_markunread, true);
                this.typeEditContainer.addView(this.suggestedCell, LayoutHelper.createLinear(-1, -2));
                final int i16 = 23;
                this.suggestedCell.setOnClickListener(new View.OnClickListener(this) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i16) {
                            case 0:
                                this.f$0.lambda$createView$24(view2);
                                break;
                            case 1:
                                this.f$0.lambda$createView$28(view2);
                                break;
                            case 2:
                                this.f$0.lambda$createView$29(view2);
                                break;
                            case 3:
                                this.f$0.lambda$createView$30(view2);
                                break;
                            case 4:
                                this.f$0.lambda$createView$31(view2);
                                break;
                            case 5:
                                this.f$0.lambda$createView$32(view2);
                                break;
                            case 6:
                                this.f$0.lambda$createView$3(view2);
                                break;
                            case 7:
                                this.f$0.lambda$createView$33(view2);
                                break;
                            case 8:
                                this.f$0.lambda$createView$34(view2);
                                break;
                            case 9:
                                this.f$0.lambda$createView$35(view2);
                                break;
                            case 10:
                                this.f$0.lambda$createView$36(view2);
                                break;
                            case 11:
                                this.f$0.lambda$createView$37(view2);
                                break;
                            case 12:
                                this.f$0.lambda$createView$38(view2);
                                break;
                            case 13:
                                this.f$0.lambda$createView$39(view2);
                                break;
                            case 14:
                                this.f$0.lambda$createView$40(view2);
                                break;
                            case 15:
                                this.f$0.lambda$createView$41(view2);
                                break;
                            case 16:
                                this.f$0.lambda$createView$42(view2);
                                break;
                            case 17:
                                this.f$0.lambda$createView$4(view2);
                                break;
                            case 18:
                                this.f$0.lambda$createView$43(view2);
                                break;
                            case 19:
                                this.f$0.lambda$createView$52(view2);
                                break;
                            case 20:
                                this.f$0.lambda$createView$7(view2);
                                break;
                            case 21:
                                this.f$0.lambda$createView$8(view2);
                                break;
                            case 22:
                                this.f$0.lambda$createView$9(view2);
                                break;
                            case 23:
                                this.f$0.lambda$createView$11(view2);
                                break;
                            default:
                                this.f$0.lambda$createView$12(view2);
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.currentChat) && ChatObject.canChangeChatInfo(this.currentChat)) {
                viewGroup = sizeNotifierFrameLayout;
                chatEditActivity = this;
                PeerColorActivity.ChangeNameColorCell changeNameColorCell = new PeerColorActivity.ChangeNameColorCell(this.currentAccount, -this.currentChat.id, context, getResourceProvider());
                chatEditActivity.colorCell = changeNameColorCell;
                changeNameColorCell.setBackground(Theme.getSelectorDrawable(true));
                chatEditActivity.typeEditContainer.addView(chatEditActivity.colorCell, LayoutHelper.createLinear(-1, -2));
                final int i17 = 24;
                chatEditActivity.colorCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i17) {
                            case 0:
                                this.f$0.lambda$createView$24(view2);
                                break;
                            case 1:
                                this.f$0.lambda$createView$28(view2);
                                break;
                            case 2:
                                this.f$0.lambda$createView$29(view2);
                                break;
                            case 3:
                                this.f$0.lambda$createView$30(view2);
                                break;
                            case 4:
                                this.f$0.lambda$createView$31(view2);
                                break;
                            case 5:
                                this.f$0.lambda$createView$32(view2);
                                break;
                            case 6:
                                this.f$0.lambda$createView$3(view2);
                                break;
                            case 7:
                                this.f$0.lambda$createView$33(view2);
                                break;
                            case 8:
                                this.f$0.lambda$createView$34(view2);
                                break;
                            case 9:
                                this.f$0.lambda$createView$35(view2);
                                break;
                            case 10:
                                this.f$0.lambda$createView$36(view2);
                                break;
                            case 11:
                                this.f$0.lambda$createView$37(view2);
                                break;
                            case 12:
                                this.f$0.lambda$createView$38(view2);
                                break;
                            case 13:
                                this.f$0.lambda$createView$39(view2);
                                break;
                            case 14:
                                this.f$0.lambda$createView$40(view2);
                                break;
                            case 15:
                                this.f$0.lambda$createView$41(view2);
                                break;
                            case 16:
                                this.f$0.lambda$createView$42(view2);
                                break;
                            case 17:
                                this.f$0.lambda$createView$4(view2);
                                break;
                            case 18:
                                this.f$0.lambda$createView$43(view2);
                                break;
                            case 19:
                                this.f$0.lambda$createView$52(view2);
                                break;
                            case 20:
                                this.f$0.lambda$createView$7(view2);
                                break;
                            case 21:
                                this.f$0.lambda$createView$8(view2);
                                break;
                            case 22:
                                this.f$0.lambda$createView$9(view2);
                                break;
                            case 23:
                                this.f$0.lambda$createView$11(view2);
                                break;
                            default:
                                this.f$0.lambda$createView$12(view2);
                                break;
                        }
                    }
                });
            } else {
                chatEditActivity = this;
                viewGroup = sizeNotifierFrameLayout;
            }
            if (ChatObject.isChannelAndNotMegaGroup(chatEditActivity.currentChat) && !ChatObject.isCommunity(chatEditActivity.currentChat)) {
                long j = -chatEditActivity.currentChat.id;
                TextCell textCell6 = new TextCell(23, context, chatEditActivity.resourceProvider, false, true);
                chatEditActivity.autoTranslationCell = textCell6;
                textCell6.setBackground(Theme.getSelectorDrawable(true));
                chatEditActivity.autoTranslationCell.setTextAndCheckAndIcon((CharSequence) LocaleController.getString(R.string.ChannelAutotranslation), chatEditActivity.currentChat.autotranslation, R.drawable.msg_translate, false);
                chatEditActivity.getMessagesController().getBoostsController().getBoostsStats(j, new Consumer(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void accept(Object obj) {
                        switch (i9) {
                            case 0:
                                this.f$0.lambda$createView$23((TL_stories.TL_premium_boostsStatus) obj);
                                break;
                            default:
                                this.f$0.lambda$createView$13((TL_stories.TL_premium_boostsStatus) obj);
                                break;
                        }
                    }
                });
                chatEditActivity.typeEditContainer.addView(chatEditActivity.autoTranslationCell, LayoutHelper.createLinear(-1, -2));
                chatEditActivity.autoTranslationCell.setOnClickListener(new ChatEditActivity$$ExternalSyntheticLambda11(chatEditActivity, new boolean[]{false}, j, 0));
            }
            if (!chatEditActivity.isChannel && ChatObject.canBlockUsers(chatEditActivity.currentChat) && (ChatObject.isChannel(chatEditActivity.currentChat) || chatEditActivity.currentChat.creator)) {
                TextCell textCell7 = new TextCell(context);
                chatEditActivity.historyCell = textCell7;
                textCell7.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                chatEditActivity.typeEditContainer.addView(chatEditActivity.historyCell, LayoutHelper.createLinear(-1, -2));
                chatEditActivity.historyCell.setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda53(20, chatEditActivity, context));
            }
            if (ChatObject.isMegagroup(chatEditActivity.currentChat) && ChatObject.hasAdminRights(chatEditActivity.currentChat) && !ChatObject.isCommunity(chatEditActivity.currentChat)) {
                MessagesController.getInstance(chatEditActivity.currentAccount).getBoostsController().getBoostsStats(-chatEditActivity.currentChat.id, new Consumer(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void accept(Object obj) {
                        switch (i11) {
                            case 0:
                                this.f$0.lambda$createView$23((TL_stories.TL_premium_boostsStatus) obj);
                                break;
                            default:
                                this.f$0.lambda$createView$13((TL_stories.TL_premium_boostsStatus) obj);
                                break;
                        }
                    }
                });
                PeerColorActivity.ChangeNameColorCell changeNameColorCell2 = new PeerColorActivity.ChangeNameColorCell(chatEditActivity.currentAccount, -chatEditActivity.currentChat.id, context, chatEditActivity.getResourceProvider());
                chatEditActivity.colorCell = changeNameColorCell2;
                changeNameColorCell2.setBackground(Theme.getSelectorDrawable(true));
                chatEditActivity.typeEditContainer.addView(chatEditActivity.colorCell, LayoutHelper.createLinear(-1, -2));
                chatEditActivity.colorCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                this.f$0.lambda$createView$24(view2);
                                break;
                            case 1:
                                this.f$0.lambda$createView$28(view2);
                                break;
                            case 2:
                                this.f$0.lambda$createView$29(view2);
                                break;
                            case 3:
                                this.f$0.lambda$createView$30(view2);
                                break;
                            case 4:
                                this.f$0.lambda$createView$31(view2);
                                break;
                            case 5:
                                this.f$0.lambda$createView$32(view2);
                                break;
                            case 6:
                                this.f$0.lambda$createView$3(view2);
                                break;
                            case 7:
                                this.f$0.lambda$createView$33(view2);
                                break;
                            case 8:
                                this.f$0.lambda$createView$34(view2);
                                break;
                            case 9:
                                this.f$0.lambda$createView$35(view2);
                                break;
                            case 10:
                                this.f$0.lambda$createView$36(view2);
                                break;
                            case 11:
                                this.f$0.lambda$createView$37(view2);
                                break;
                            case 12:
                                this.f$0.lambda$createView$38(view2);
                                break;
                            case 13:
                                this.f$0.lambda$createView$39(view2);
                                break;
                            case 14:
                                this.f$0.lambda$createView$40(view2);
                                break;
                            case 15:
                                this.f$0.lambda$createView$41(view2);
                                break;
                            case 16:
                                this.f$0.lambda$createView$42(view2);
                                break;
                            case 17:
                                this.f$0.lambda$createView$4(view2);
                                break;
                            case 18:
                                this.f$0.lambda$createView$43(view2);
                                break;
                            case 19:
                                this.f$0.lambda$createView$52(view2);
                                break;
                            case 20:
                                this.f$0.lambda$createView$7(view2);
                                break;
                            case 21:
                                this.f$0.lambda$createView$8(view2);
                                break;
                            case 22:
                                this.f$0.lambda$createView$9(view2);
                                break;
                            case 23:
                                this.f$0.lambda$createView$11(view2);
                                break;
                            default:
                                this.f$0.lambda$createView$12(view2);
                                break;
                        }
                    }
                });
            }
            if (!chatEditActivity.isChannel && chatEditActivity.currentChat.creator) {
                TextCell textCell8 = new TextCell(23, context, null, false, true);
                context2 = context;
                chatEditActivity.forumsCell = textCell8;
                textCell8.setBackground(Theme.getSelectorDrawable(true));
                chatEditActivity.forumsCell.setTextAndCheckAndIcon((CharSequence) LocaleController.getString(R.string.ChannelTopics), chatEditActivity.forum, R.drawable.msg_topics, false);
                chatEditActivity.forumsCell.getCheckBox().setIcon(chatEditActivity.canForum ? 0 : R.drawable.permission_locked);
                chatEditActivity.typeEditContainer.addView(chatEditActivity.forumsCell, LayoutHelper.createFrame(-1, -2.0f));
                chatEditActivity.forumsCell.setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda53(21, chatEditActivity, frameLayout));
            } else {
                context2 = context;
            }
            chatEditActivity.updateColorCell();
        } else {
            chatEditActivity = this;
            viewGroup = sizeNotifierFrameLayout;
            context2 = context;
            str2 = "";
        }
        ActionBarMenu actionBarMenuCreateMenu = chatEditActivity.actionBar.createMenu();
        if (chatEditActivity.currentUser != null || ChatObject.canChangeChatInfo(chatEditActivity.currentChat) || chatEditActivity.historyCell != null) {
            ActionBarMenuItem actionBarMenuItemAddItemWithWidth = actionBarMenuCreateMenu.addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            chatEditActivity.doneButton = actionBarMenuItemAddItemWithWidth;
            actionBarMenuItemAddItemWithWidth.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (chatEditActivity.locationCell != null || chatEditActivity.historyCell != null || chatEditActivity.typeCell != null || chatEditActivity.linkedCell != null || chatEditActivity.forumsCell != null) {
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context2, 12, chatEditActivity.resourceProvider);
            chatEditActivity.settingsSectionCell = textInfoPrivacyCell;
            if (chatEditActivity.forumsCell != null) {
                textInfoPrivacyCell.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                textInfoPrivacyCell.setFixedSize(12);
            }
            sectionsLinearLayout.addView(chatEditActivity.settingsSectionCell, LayoutHelper.createLinear(-1, -2));
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        chatEditActivity.infoContainer = linearLayout4;
        linearLayout4.setOrientation(1);
        sectionsLinearLayout.addView(chatEditActivity.infoContainer, LayoutHelper.createLinear(-1, -2));
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
            chatEditActivity.blockCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i9) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
                }
            });
            TextCell textCell11 = new TextCell(context2);
            chatEditActivity.inviteLinksCell = textCell11;
            textCell11.setBackground(Theme.getSelectorDrawable(false));
            final int i18 = 2;
            chatEditActivity.inviteLinksCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
                }
            });
            TextCell textCell12 = new TextCell(context2);
            chatEditActivity.reactionsCell = textCell12;
            textCell12.setBackground(Theme.getSelectorDrawable(false));
            final int i19 = 3;
            chatEditActivity.reactionsCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i19) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(chatEditActivity.currentChat, 28)) {
                TextCell textCell13 = new TextCell(context2);
                chatEditActivity.welcomeMessagesCell = textCell13;
                textCell13.setBackground(Theme.getSelectorDrawable(false));
                final int i20 = 4;
                chatEditActivity.welcomeMessagesCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i20) {
                            case 0:
                                this.f$0.lambda$createView$24(view2);
                                break;
                            case 1:
                                this.f$0.lambda$createView$28(view2);
                                break;
                            case 2:
                                this.f$0.lambda$createView$29(view2);
                                break;
                            case 3:
                                this.f$0.lambda$createView$30(view2);
                                break;
                            case 4:
                                this.f$0.lambda$createView$31(view2);
                                break;
                            case 5:
                                this.f$0.lambda$createView$32(view2);
                                break;
                            case 6:
                                this.f$0.lambda$createView$3(view2);
                                break;
                            case 7:
                                this.f$0.lambda$createView$33(view2);
                                break;
                            case 8:
                                this.f$0.lambda$createView$34(view2);
                                break;
                            case 9:
                                this.f$0.lambda$createView$35(view2);
                                break;
                            case 10:
                                this.f$0.lambda$createView$36(view2);
                                break;
                            case 11:
                                this.f$0.lambda$createView$37(view2);
                                break;
                            case 12:
                                this.f$0.lambda$createView$38(view2);
                                break;
                            case 13:
                                this.f$0.lambda$createView$39(view2);
                                break;
                            case 14:
                                this.f$0.lambda$createView$40(view2);
                                break;
                            case 15:
                                this.f$0.lambda$createView$41(view2);
                                break;
                            case 16:
                                this.f$0.lambda$createView$42(view2);
                                break;
                            case 17:
                                this.f$0.lambda$createView$4(view2);
                                break;
                            case 18:
                                this.f$0.lambda$createView$43(view2);
                                break;
                            case 19:
                                this.f$0.lambda$createView$52(view2);
                                break;
                            case 20:
                                this.f$0.lambda$createView$7(view2);
                                break;
                            case 21:
                                this.f$0.lambda$createView$8(view2);
                                break;
                            case 22:
                                this.f$0.lambda$createView$9(view2);
                                break;
                            case 23:
                                this.f$0.lambda$createView$11(view2);
                                break;
                            default:
                                this.f$0.lambda$createView$12(view2);
                                break;
                        }
                    }
                });
                chatEditActivity.checkWelcomeMessagesValue();
            }
            TextCell textCell14 = new TextCell(context2);
            chatEditActivity.adminCell = textCell14;
            textCell14.setBackground(Theme.getSelectorDrawable(false));
            final int i21 = 5;
            chatEditActivity.adminCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i21) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
                }
            });
            TextCell textCell15 = new TextCell(context2);
            chatEditActivity.membersCell = textCell15;
            textCell15.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            final int i22 = 7;
            chatEditActivity.membersCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i22) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
                }
            });
            if (!ChatObject.isChannelAndNotMegaGroup(chatEditActivity.currentChat)) {
                TextCell textCell16 = new TextCell(context2);
                chatEditActivity.memberRequestsCell = textCell16;
                textCell16.setBackground(Theme.getSelectorDrawable(false));
                final int i23 = 8;
                chatEditActivity.memberRequestsCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i23) {
                            case 0:
                                this.f$0.lambda$createView$24(view2);
                                break;
                            case 1:
                                this.f$0.lambda$createView$28(view2);
                                break;
                            case 2:
                                this.f$0.lambda$createView$29(view2);
                                break;
                            case 3:
                                this.f$0.lambda$createView$30(view2);
                                break;
                            case 4:
                                this.f$0.lambda$createView$31(view2);
                                break;
                            case 5:
                                this.f$0.lambda$createView$32(view2);
                                break;
                            case 6:
                                this.f$0.lambda$createView$3(view2);
                                break;
                            case 7:
                                this.f$0.lambda$createView$33(view2);
                                break;
                            case 8:
                                this.f$0.lambda$createView$34(view2);
                                break;
                            case 9:
                                this.f$0.lambda$createView$35(view2);
                                break;
                            case 10:
                                this.f$0.lambda$createView$36(view2);
                                break;
                            case 11:
                                this.f$0.lambda$createView$37(view2);
                                break;
                            case 12:
                                this.f$0.lambda$createView$38(view2);
                                break;
                            case 13:
                                this.f$0.lambda$createView$39(view2);
                                break;
                            case 14:
                                this.f$0.lambda$createView$40(view2);
                                break;
                            case 15:
                                this.f$0.lambda$createView$41(view2);
                                break;
                            case 16:
                                this.f$0.lambda$createView$42(view2);
                                break;
                            case 17:
                                this.f$0.lambda$createView$4(view2);
                                break;
                            case 18:
                                this.f$0.lambda$createView$43(view2);
                                break;
                            case 19:
                                this.f$0.lambda$createView$52(view2);
                                break;
                            case 20:
                                this.f$0.lambda$createView$7(view2);
                                break;
                            case 21:
                                this.f$0.lambda$createView$8(view2);
                                break;
                            case 22:
                                this.f$0.lambda$createView$9(view2);
                                break;
                            case 23:
                                this.f$0.lambda$createView$11(view2);
                                break;
                            default:
                                this.f$0.lambda$createView$12(view2);
                                break;
                        }
                    }
                });
            }
            TextCell textCell17 = new TextCell(context2);
            chatEditActivity.channelAffiliateProgramsCell = textCell17;
            textCell17.setTextAndIcon(applyNewSpan(LocaleController.getString(R.string.ChannelAffiliatePrograms)), R.drawable.menu_feature_premium, false);
            chatEditActivity.channelAffiliateProgramsCell.setBackground(Theme.getSelectorDrawable(false));
            final int i24 = 9;
            chatEditActivity.channelAffiliateProgramsCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i24) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
                }
            });
            chatEditActivity.channelAffiliateProgramsCell.setVisibility(8);
            if (ChatObject.isChannel(chatEditActivity.currentChat) || chatEditActivity.currentChat.gigagroup) {
                TextCell textCell18 = new TextCell(context2);
                chatEditActivity.logCell = textCell18;
                textCell18.setTextAndIcon((CharSequence) LocaleController.getString(R.string.EventLog), R.drawable.msg_log, false);
                chatEditActivity.logCell.setBackground(Theme.getSelectorDrawable(false));
                final int i25 = 10;
                chatEditActivity.logCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i25) {
                            case 0:
                                this.f$0.lambda$createView$24(view2);
                                break;
                            case 1:
                                this.f$0.lambda$createView$28(view2);
                                break;
                            case 2:
                                this.f$0.lambda$createView$29(view2);
                                break;
                            case 3:
                                this.f$0.lambda$createView$30(view2);
                                break;
                            case 4:
                                this.f$0.lambda$createView$31(view2);
                                break;
                            case 5:
                                this.f$0.lambda$createView$32(view2);
                                break;
                            case 6:
                                this.f$0.lambda$createView$3(view2);
                                break;
                            case 7:
                                this.f$0.lambda$createView$33(view2);
                                break;
                            case 8:
                                this.f$0.lambda$createView$34(view2);
                                break;
                            case 9:
                                this.f$0.lambda$createView$35(view2);
                                break;
                            case 10:
                                this.f$0.lambda$createView$36(view2);
                                break;
                            case 11:
                                this.f$0.lambda$createView$37(view2);
                                break;
                            case 12:
                                this.f$0.lambda$createView$38(view2);
                                break;
                            case 13:
                                this.f$0.lambda$createView$39(view2);
                                break;
                            case 14:
                                this.f$0.lambda$createView$40(view2);
                                break;
                            case 15:
                                this.f$0.lambda$createView$41(view2);
                                break;
                            case 16:
                                this.f$0.lambda$createView$42(view2);
                                break;
                            case 17:
                                this.f$0.lambda$createView$4(view2);
                                break;
                            case 18:
                                this.f$0.lambda$createView$43(view2);
                                break;
                            case 19:
                                this.f$0.lambda$createView$52(view2);
                                break;
                            case 20:
                                this.f$0.lambda$createView$7(view2);
                                break;
                            case 21:
                                this.f$0.lambda$createView$8(view2);
                                break;
                            case 22:
                                this.f$0.lambda$createView$9(view2);
                                break;
                            case 23:
                                this.f$0.lambda$createView$11(view2);
                                break;
                            default:
                                this.f$0.lambda$createView$12(view2);
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isBoostSupported(chatEditActivity.currentChat)) {
                TextCell textCell19 = new TextCell(context2);
                chatEditActivity.statsAndBoosts = textCell19;
                textCell19.setTextAndIcon((CharSequence) LocaleController.getString(R.string.StatisticsAndBoosts), R.drawable.msg_stats, true);
                chatEditActivity.statsAndBoosts.setBackground(Theme.getSelectorDrawable(false));
                final int i26 = 11;
                chatEditActivity.statsAndBoosts.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i26) {
                            case 0:
                                this.f$0.lambda$createView$24(view2);
                                break;
                            case 1:
                                this.f$0.lambda$createView$28(view2);
                                break;
                            case 2:
                                this.f$0.lambda$createView$29(view2);
                                break;
                            case 3:
                                this.f$0.lambda$createView$30(view2);
                                break;
                            case 4:
                                this.f$0.lambda$createView$31(view2);
                                break;
                            case 5:
                                this.f$0.lambda$createView$32(view2);
                                break;
                            case 6:
                                this.f$0.lambda$createView$3(view2);
                                break;
                            case 7:
                                this.f$0.lambda$createView$33(view2);
                                break;
                            case 8:
                                this.f$0.lambda$createView$34(view2);
                                break;
                            case 9:
                                this.f$0.lambda$createView$35(view2);
                                break;
                            case 10:
                                this.f$0.lambda$createView$36(view2);
                                break;
                            case 11:
                                this.f$0.lambda$createView$37(view2);
                                break;
                            case 12:
                                this.f$0.lambda$createView$38(view2);
                                break;
                            case 13:
                                this.f$0.lambda$createView$39(view2);
                                break;
                            case 14:
                                this.f$0.lambda$createView$40(view2);
                                break;
                            case 15:
                                this.f$0.lambda$createView$41(view2);
                                break;
                            case 16:
                                this.f$0.lambda$createView$42(view2);
                                break;
                            case 17:
                                this.f$0.lambda$createView$4(view2);
                                break;
                            case 18:
                                this.f$0.lambda$createView$43(view2);
                                break;
                            case 19:
                                this.f$0.lambda$createView$52(view2);
                                break;
                            case 20:
                                this.f$0.lambda$createView$7(view2);
                                break;
                            case 21:
                                this.f$0.lambda$createView$8(view2);
                                break;
                            case 22:
                                this.f$0.lambda$createView$9(view2);
                                break;
                            case 23:
                                this.f$0.lambda$createView$11(view2);
                                break;
                            default:
                                this.f$0.lambda$createView$12(view2);
                                break;
                        }
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
            final int i27 = 12;
            chatEditActivity.publicLinkCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i27) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
                }
            });
            chatEditActivity.updatePublicLinksCount();
            TextCell textCell28 = new TextCell(context2);
            chatEditActivity.botAffiliateProgramCell = textCell28;
            textCell28.setBackground(Theme.getSelectorDrawable(false));
            str = str2;
            chatEditActivity.botAffiliateProgramCell.setTextAndValueAndIcon(applyNewSpan(LocaleController.getString(R.string.AffiliateProgramBot)), (CharSequence) str, R.drawable.msg_shareout, true);
            chatEditActivity.infoContainer.addView(chatEditActivity.botAffiliateProgramCell, LayoutHelper.createLinear(-1, -2));
            final int i28 = 13;
            chatEditActivity.botAffiliateProgramCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i28) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
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
            final int i29 = 14;
            chatEditActivity.editIntroCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i29) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
                }
            });
            TextCell textCell31 = new TextCell(context2);
            chatEditActivity.editCommandsCell = textCell31;
            textCell31.setBackground(Theme.getSelectorDrawable(false));
            chatEditActivity.editCommandsCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.BotEditCommands), R.drawable.msg_media, true);
            chatEditActivity.infoContainer.addView(chatEditActivity.editCommandsCell, LayoutHelper.createLinear(-1, -2));
            final int i30 = 15;
            chatEditActivity.editCommandsCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i30) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
                }
            });
            TextCell textCell32 = new TextCell(context2);
            chatEditActivity.changeBotSettingsCell = textCell32;
            textCell32.setBackground(Theme.getSelectorDrawable(false));
            chatEditActivity.changeBotSettingsCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.BotChangeSettings), R.drawable.msg_bot, true);
            chatEditActivity.infoContainer.addView(chatEditActivity.changeBotSettingsCell, LayoutHelper.createLinear(-1, -2));
            final int i31 = 16;
            chatEditActivity.changeBotSettingsCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i31) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
                }
            });
        } else {
            str = str2;
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
                sectionsLinearLayout.addView(shadowSectionCell2, LayoutHelper.createLinear(-1, -2));
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
            sectionsLinearLayout.addView(chatEditActivity.botInfoCell, LayoutHelper.createLinear(-1, -2));
            TextCell textCell33 = new TextCell(context2);
            chatEditActivity.verifyCell = textCell33;
            textCell33.setBackground(Theme.getSelectorDrawable(true));
            chatEditActivity.verifyCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.BotVerifyAccounts), R.drawable.menu_factcheck, false);
            TextCell textCell34 = chatEditActivity.verifyCell;
            int i32 = Theme.key_windowBackgroundWhiteBlueText4;
            textCell34.setColors(i32, i32);
            sectionsLinearLayout.addView(chatEditActivity.verifyCell, LayoutHelper.createLinear(-1, -2));
            final int i33 = 18;
            chatEditActivity.verifyCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i33) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
                }
            });
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context2, 12, chatEditActivity.resourceProvider);
            chatEditActivity.verifyInfoCell = textInfoPrivacyCell2;
            textInfoPrivacyCell2.setFixedSize(12);
            sectionsLinearLayout.addView(chatEditActivity.verifyInfoCell, LayoutHelper.createLinear(-1, -2));
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
                sectionsLinearLayout.addView(chatEditActivity.balanceContainer, LayoutHelper.createLinear(-1, -2));
                HeaderCell headerCell = new HeaderCell(context2);
                headerCell.setText(LocaleController.getString(R.string.BotBalance));
                chatEditActivity.balanceContainer.addView(headerCell, LayoutHelper.createLinear(-1, -2));
                TextCell textCell36 = new TextCell(context2);
                chatEditActivity.tonBalanceCell = textCell36;
                textCell36.setBackground(Theme.getSelectorDrawable(false));
                chatEditActivity.tonBalanceCell.setPrioritizeTitleOverValue(true);
                chatEditActivity.balanceContainer.addView(chatEditActivity.tonBalanceCell, LayoutHelper.createLinear(-1, -2));
                final BotStarsController botStarsController = BotStarsController.getInstance(chatEditActivity.currentAccount);
                chatEditActivity.tonBalanceCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                this.f$0.lambda$createView$44(botStarsController, view2);
                                break;
                            default:
                                this.f$0.lambda$createView$45(botStarsController, view2);
                                break;
                        }
                    }
                });
                if (botStarsController.isTONBalanceAvailable(chatEditActivity.userId)) {
                    long tONBalance = botStarsController.getTONBalance(chatEditActivity.userId);
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
                    chatEditActivity.tonBalanceCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotBalanceTON), (CharSequence) spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new LoadingSpan(chatEditActivity.tonBalanceCell.valueTextView, AndroidUtilities.dp(f)), 0, spannableStringBuilder2.length(), 33);
                    chatEditActivity.tonBalanceCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotBalanceTON), (CharSequence) spannableStringBuilder2, R.drawable.outline_gram_24, false);
                }
                chatEditActivity.tonBalanceCell.setVisibility(botStarsController.botHasTON(chatEditActivity.userId) ? 0 : 8);
                TextCell textCell37 = new TextCell(context2);
                chatEditActivity.starsBalanceCell = textCell37;
                textCell37.setBackground(Theme.getSelectorDrawable(false));
                chatEditActivity.starsBalanceCell.setPrioritizeTitleOverValue(true);
                chatEditActivity.balanceContainer.addView(chatEditActivity.starsBalanceCell, LayoutHelper.createLinear(-1, -2));
                chatEditActivity.starsBalanceCell.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i9) {
                            case 0:
                                this.f$0.lambda$createView$44(botStarsController, view2);
                                break;
                            default:
                                this.f$0.lambda$createView$45(botStarsController, view2);
                                break;
                        }
                    }
                });
                if (botStarsController.getStarsRevenueStats(chatEditActivity.userId, false) != null) {
                    chatEditActivity.starsBalanceCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotBalanceStars), botStarsController.getBotStarsBalance(chatEditActivity.userId).amount <= 0 ? str : StarsIntroActivity.replaceStarsWithPlain(false, TextUtils.concat("XTR", StarsIntroActivity.formatStarsAmountShort(botStarsController.getBotStarsBalance(chatEditActivity.userId), 0.85f, ' ')), 0.85f, null), R.drawable.menu_premium_main, false);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new LoadingSpan(chatEditActivity.starsBalanceCell.valueTextView, AndroidUtilities.dp(f)), 0, spannableStringBuilder3.length(), 33);
                    chatEditActivity.starsBalanceCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.BotBalanceStars), (CharSequence) spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                chatEditActivity.starsBalanceCell.setVisibility(botStarsController.botHasStars(chatEditActivity.userId) ? 0 : 8);
                TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context2, 12, chatEditActivity.getResourceProvider());
                textInfoPrivacyCell4.setFixedSize(12);
                textInfoPrivacyCell4.setTag(R.id.fit_width_tag, 1);
                sectionsLinearLayout.addView(textInfoPrivacyCell4, LayoutHelper.createLinear(-1, 12));
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
                chatEditActivity.communityLinkView.setOnClickListener(new View.OnClickListener(chatEditActivity) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                this.f$0.lambda$createView$46(j2, view2);
                                break;
                            default:
                                this.f$0.lambda$createView$50(j2, view2);
                                break;
                        }
                    }
                });
                sectionsLinearLayout.addView(chatEditActivity.communityLinkView, LayoutHelper.createLinear(-1, -2));
                TextCell textCell38 = new TextCell(context2);
                chatEditActivity.communityUnlinkCell = textCell38;
                if (z6) {
                    i3 = R.string.CommunityRemoveBotFromCommunity;
                } else {
                    i3 = chatEditActivity.isChannel ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity;
                }
                textCell38.setTextAndIcon((CharSequence) LocaleController.getString(i3), R.drawable.outline_community_remove_24, false);
                TextCell textCell39 = chatEditActivity.communityUnlinkCell;
                int i34 = Theme.key_text_RedRegular;
                textCell39.setColors(i34, i34);
                chatEditActivity.communityUnlinkCell.setBackground(Theme.getSelectorDrawable(false));
                chatEditActivity2 = chatEditActivity;
                chatEditActivity.communityUnlinkCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        this.f$0.lambda$createView$49(z6, j3, j2, view2);
                    }
                });
                sectionsLinearLayout.addView(chatEditActivity2.communityUnlinkCell, LayoutHelper.createLinear(-1, -2));
                TextInfoPrivacyCell textInfoPrivacyCell5 = new TextInfoPrivacyCell(context2, 12, chatEditActivity2.getResourceProvider());
                chatEditActivity2.communityGapView = textInfoPrivacyCell5;
                textInfoPrivacyCell5.setFixedSize(14);
                chatEditActivity2.communityGapView.setTag(R.id.fit_width_tag, 1);
                sectionsLinearLayout.addView(chatEditActivity2.communityGapView, LayoutHelper.createLinear(-1, 14));
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
                } else {
                    i = chatEditActivity2.isChannel ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity;
                }
                textCell41.setTextAndIcon((CharSequence) LocaleController.getString(i), R.drawable.msg_groups, false);
                chatEditActivity2.communityCell.setOnClickListener(new View.OnClickListener(chatEditActivity2) {
                    public final ChatEditActivity f$0;

                    {
                        this.f$0 = chatEditActivity2;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i9) {
                            case 0:
                                this.f$0.lambda$createView$46(j3, view2);
                                break;
                            default:
                                this.f$0.lambda$createView$50(j3, view2);
                                break;
                        }
                    }
                });
                TextInfoPrivacyCell textInfoPrivacyCell6 = new TextInfoPrivacyCell(context2, 12, chatEditActivity2.resourceProvider);
                chatEditActivity2.communityInfoCell = textInfoPrivacyCell6;
                if (z6) {
                    i2 = R.string.CommunityAddBotToCommunityInfo;
                } else {
                    i2 = chatEditActivity2.isChannel ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo;
                }
                textInfoPrivacyCell6.setText(LocaleController.getString(i2));
                sectionsLinearLayout.addView(chatEditActivity2.communityCell, LayoutHelper.createLinear(-1, -2));
                sectionsLinearLayout.addView(chatEditActivity2.communityInfoCell, LayoutHelper.createLinear(-1, -2));
            }
        }
        TLRPC.Chat chat6 = chatEditActivity2.currentChat;
        if (chat6 != null && chat6.creator) {
            FrameLayout frameLayout2 = new FrameLayout(context2);
            chatEditActivity2.deleteContainer = frameLayout2;
            sectionsLinearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
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
            final int i35 = 19;
            chatEditActivity2.deleteCell.setOnClickListener(new View.OnClickListener(chatEditActivity2) {
                public final ChatEditActivity f$0;

                {
                    this.f$0 = chatEditActivity2;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i35) {
                        case 0:
                            this.f$0.lambda$createView$24(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$28(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$29(view2);
                            break;
                        case 3:
                            this.f$0.lambda$createView$30(view2);
                            break;
                        case 4:
                            this.f$0.lambda$createView$31(view2);
                            break;
                        case 5:
                            this.f$0.lambda$createView$32(view2);
                            break;
                        case 6:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 7:
                            this.f$0.lambda$createView$33(view2);
                            break;
                        case 8:
                            this.f$0.lambda$createView$34(view2);
                            break;
                        case 9:
                            this.f$0.lambda$createView$35(view2);
                            break;
                        case 10:
                            this.f$0.lambda$createView$36(view2);
                            break;
                        case 11:
                            this.f$0.lambda$createView$37(view2);
                            break;
                        case 12:
                            this.f$0.lambda$createView$38(view2);
                            break;
                        case 13:
                            this.f$0.lambda$createView$39(view2);
                            break;
                        case 14:
                            this.f$0.lambda$createView$40(view2);
                            break;
                        case 15:
                            this.f$0.lambda$createView$41(view2);
                            break;
                        case 16:
                            this.f$0.lambda$createView$42(view2);
                            break;
                        case 17:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        case 18:
                            this.f$0.lambda$createView$43(view2);
                            break;
                        case 19:
                            this.f$0.lambda$createView$52(view2);
                            break;
                        case 20:
                            this.f$0.lambda$createView$7(view2);
                            break;
                        case 21:
                            this.f$0.lambda$createView$8(view2);
                            break;
                        case 22:
                            this.f$0.lambda$createView$9(view2);
                            break;
                        case 23:
                            this.f$0.lambda$createView$11(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$12(view2);
                            break;
                    }
                }
            });
            ShadowSectionCell shadowSectionCell3 = new ShadowSectionCell(context2);
            chatEditActivity2.deleteInfoCell = shadowSectionCell3;
            sectionsLinearLayout.addView(shadowSectionCell3, LayoutHelper.createLinear(-1, -2));
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
        chatEditActivity2.updateFields(true, false);
        return chatEditActivity2.fragmentView;
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
        if (((Long) objArr[0]).longValue() == this.userId) {
            if (this.starsBalanceCell != null) {
                BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
                this.starsBalanceCell.setVisibility(botStarsController.botHasStars(this.userId) ? 0 : 8);
                this.starsBalanceCell.setValue(StarsIntroActivity.replaceStarsWithPlain(false, TextUtils.concat("XTR", StarsIntroActivity.formatStarsAmount(botStarsController.getBotStarsBalance(this.userId), 0.8f, ' ')), 0.85f, null), true);
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
    public void didStartUpload(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    @Override
    public void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda50(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
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
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public String getInitialSearchString() {
        return this.nameTextView.getText().toString();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 6);
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        TextCell textCell = this.setAvatarCell;
        int i = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(textCell, 4096, null, null, null, null, i));
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
        TextCell textCell2 = this.memberRequestsCell;
        if (textCell2 != null) {
            arrayList.add(new ThemeDescription(textCell2, 4096, null, null, null, null, i));
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
        arrayList.add(new ThemeDescription(this.stickersContainer, 1, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.infoContainer, 1, null, null, null, null, i6));
        int i7 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.settingsTopSectionCell, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.settingsSectionCell, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.deleteInfoCell, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.deleteCell, 4096, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.deleteCell, 4, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_text_RedRegular));
        arrayList.add(new ThemeDescription(this.stickersCell, 4096, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.stickersCell, 4, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.stickersInfoCell, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.stickersInfoCell, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundPink));
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
        TextCell textCell3 = this.suggestedCell;
        if (textCell3 != null) {
            arrayList.add(new ThemeDescription(textCell3, 4096, null, null, null, null, i));
            arrayList.add(new ThemeDescription(this.suggestedCell, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
            arrayList.add(new ThemeDescription(this.suggestedCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i3));
        }
        TextCell textCell4 = this.statsAndBoosts;
        if (textCell4 != null) {
            arrayList.add(new ThemeDescription(textCell4, 4096, null, null, null, null, i));
            arrayList.add(new ThemeDescription(this.statsAndBoosts, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
            arrayList.add(new ThemeDescription(this.statsAndBoosts, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i3));
        }
        return arrayList;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        this.imageUpdater.onActivityResult(i, i2, intent);
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
    public void onBecomeFullyHidden() {
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
    }

    @Override
    public boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditActivity.onFragmentCreate():boolean");
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

    @Override
    public void onPause() {
        super.onPause();
        Iterator<AnimatedEmojiDrawable> it = this.preloadedReactions.iterator();
        while (it.hasNext()) {
            it.next().removeView((AnimatedEmojiSpan.InvalidateHolder) null);
        }
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
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.imageUpdater.onRequestPermissionsResultFragment(i, strArr, iArr);
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
    public void onUploadProgressChanged(float f) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    public void openSetPhotoAlert() {
        this.imageUpdater.openMenu(this.avatar != null, new ChatEditActivity$$ExternalSyntheticLambda1(this, 4), new OAuthSheet$$ExternalSyntheticLambda18(this, 6), 0);
        this.cameraDrawable.setCurrentFrame(0);
        this.cameraDrawable.setCustomEndFrame(43);
        this.setAvatarCell.imageView.playAnimation();
    }

    @Override
    public void restoreSelfArgs(Bundle bundle) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.currentPicturePath = bundle.getString("path");
        }
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

    public void showConvertTooltip() {
        this.undoView.showWithAction(0L, 76, (Runnable) null);
    }

    @Override
    public final boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
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
        if (!z2) {
            this.suggestedCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.PostSuggestions), (CharSequence) LocaleController.getString(R.string.PostSuggestionsOff), R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.currentChat.linked_monoforum_id));
        if (l != null) {
            jLongValue = l.longValue();
        } else if (chat2 != null) {
            jLongValue = chat2.send_paid_messages_stars;
        }
        this.suggestedCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.PostSuggestions), (CharSequence) StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(jLongValue)), 0.66f, null), R.drawable.msg_markunread, true);
    }

    public void setInfo(TLRPC.ChatFull chatFull) {
        AnimatedEmojiDrawable animatedEmojiDrawableMake;
        this.info = chatFull;
        if (chatFull != null) {
            if (this.currentChat == null) {
                this.currentChat = getMessagesController().getChat(Long.valueOf(this.chatId));
            }
            this.historyHidden = !ChatObject.isChannel(this.currentChat) || this.info.hidden_prehistory;
            this.availableReactions = this.info.available_reactions;
            this.preloadedReactions.clear();
            List<AnimatedEmojiDrawable> list = this.preloadedReactions;
            TLRPC.Chat chat = this.currentChat;
            TLRPC.ChatFull chatFull2 = this.info;
            ArrayList arrayList = new ArrayList();
            if (chatFull2 != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList2 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        TLRPC.Reaction reaction = arrayList2.get(i);
                        i++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, AnimatedEmojiDrawable.getCacheTypeForEnterView(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            animatedEmojiDrawableMake = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? AnimatedEmojiDrawable.make(UserConfig.selectedAccount, AnimatedEmojiDrawable.getCacheTypeForEnterView(), ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id) : null;
                        }
                        if (animatedEmojiDrawableMake != null) {
                            arrayList.add(animatedEmojiDrawableMake);
                            animatedEmojiDrawableMake.addView((AnimatedEmojiSpan.InvalidateHolder) null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            AnimatedEmojiDrawable animatedEmojiDrawableMake2 = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, AnimatedEmojiDrawable.getCacheTypeForEnterView(), tL_availableReaction2.activate_animation);
                            arrayList.add(animatedEmojiDrawableMake2);
                            animatedEmojiDrawableMake2.addView((AnimatedEmojiSpan.InvalidateHolder) null);
                        }
                    }
                }
            }
            list.addAll(arrayList);
            if (this.channelAffiliateProgramsCell != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.currentChat)) {
                this.channelAffiliateProgramsCell.setVisibility(0);
            }
        }
        checkWelcomeMessagesValue();
    }
}
