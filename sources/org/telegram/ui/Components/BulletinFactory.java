package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.HintView2;

public final class BulletinFactory {
    public static final int CONTAINS_EMOJI_IN_MESSAGE = 0;
    public static final int CONTAINS_EMOJI_IN_STORY = 2;
    public static final int CONTAINS_EMOJI_IN_TOPIC = 1;
    public static final int ICON_TYPE_NOT_FOUND = 0;
    public static final int ICON_TYPE_WARNING = 1;
    private final FrameLayout containerLayout;
    private final BaseFragment fragment;
    private final Theme.ResourcesProvider resourcesProvider;

    public static final class FileType {
        private static final FileType[] $VALUES;
        public static final FileType AUDIO;
        public static final FileType AUDIOS;
        public static final FileType GIF;
        public static final FileType GIF_TO_DOWNLOADS;
        public static final FileType LIVEPHOTO;
        public static final FileType LIVEPHOTOS;
        public static final FileType MEDIA;
        public static final FileType PHOTO;
        public static final FileType PHOTOS;
        public static final FileType PHOTO_TO_DOWNLOADS;
        public static final FileType UNKNOWN;
        public static final FileType UNKNOWNS;
        public static final FileType VIDEO;
        public static final FileType VIDEOS;
        public static final FileType VIDEO_TO_DOWNLOADS;
        private final Icon icon;
        private final String localeKey;
        private final int localeRes;
        private final boolean plural;

        public enum Icon {
            SAVED_TO_DOWNLOADS(R.raw.ic_download, 2, "Box", "Arrow"),
            SAVED_TO_GALLERY(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
            SAVED_TO_MUSIC(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
            SAVED_TO_GIFS(R.raw.ic_save_to_gifs, 0, "gif");

            private final String[] layers;
            private final int paddingBottom;
            private final int resId;

            Icon(int i, int i2, String... strArr) {
                this.resId = i;
                this.paddingBottom = i2;
                this.layers = strArr;
            }
        }

        private static FileType[] $values() {
            return new FileType[]{PHOTO, PHOTOS, VIDEO, VIDEOS, LIVEPHOTO, LIVEPHOTOS, MEDIA, PHOTO_TO_DOWNLOADS, VIDEO_TO_DOWNLOADS, GIF, GIF_TO_DOWNLOADS, AUDIO, AUDIOS, UNKNOWN, UNKNOWNS};
        }

        static {
            int i = R.string.PhotoSavedHint;
            Icon icon = Icon.SAVED_TO_GALLERY;
            PHOTO = new FileType("PHOTO", 0, "PhotoSavedHint", i, icon);
            PHOTOS = new FileType("PHOTOS", 1, "PhotosSavedHint", icon);
            VIDEO = new FileType("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, icon);
            VIDEOS = new FileType("VIDEOS", 3, "VideosSavedHint", icon);
            LIVEPHOTO = new FileType("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, icon);
            LIVEPHOTOS = new FileType("LIVEPHOTOS", 5, "LivePhotosSavedHint", icon);
            MEDIA = new FileType("MEDIA", 6, "MediaSavedHint", icon);
            int i2 = R.string.PhotoSavedToDownloadsHintLinked;
            Icon icon2 = Icon.SAVED_TO_DOWNLOADS;
            PHOTO_TO_DOWNLOADS = new FileType("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i2, icon2);
            VIDEO_TO_DOWNLOADS = new FileType("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, icon2);
            GIF = new FileType("GIF", 9, "GifSavedHint", R.string.GifSavedHint, Icon.SAVED_TO_GIFS);
            GIF_TO_DOWNLOADS = new FileType("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, icon2);
            int i3 = R.string.AudioSavedHint;
            Icon icon3 = Icon.SAVED_TO_MUSIC;
            AUDIO = new FileType("AUDIO", 11, "AudioSavedHint", i3, icon3);
            AUDIOS = new FileType("AUDIOS", 12, "AudiosSavedHint", icon3);
            UNKNOWN = new FileType("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, icon2);
            UNKNOWNS = new FileType("UNKNOWNS", 14, "FilesSavedHintLinked", icon2);
            $VALUES = $values();
        }

        private FileType(String str, int i, String str2, int i2, Icon icon) {
            super(str, i);
            this.localeKey = str2;
            this.localeRes = i2;
            this.icon = icon;
            this.plural = false;
        }

        private String getText() {
            return getText(1);
        }

        public static FileType valueOf(String str) {
            return (FileType) Enum.valueOf(FileType.class, str);
        }

        public static FileType[] values() {
            return (FileType[]) $VALUES.clone();
        }

        public String getText(int i) {
            return this.plural ? LocaleController.formatPluralString(this.localeKey, i, new Object[0]) : LocaleController.getString(this.localeKey, this.localeRes);
        }

        private FileType(String str, int i, String str2, Icon icon) {
            super(str, i);
            this.localeKey = str2;
            this.icon = icon;
            this.localeRes = 0;
            this.plural = true;
        }
    }

    public static class UndoObject {
        public Runnable onAction;
        public Runnable onUndo;
        public CharSequence undoText;
    }

    private BulletinFactory(BaseFragment baseFragment) {
        if (baseFragment == null || baseFragment.getLastStoryViewer() == null || !baseFragment.getLastStoryViewer().attachedToParent()) {
            this.fragment = baseFragment;
            this.containerLayout = null;
            this.resourcesProvider = baseFragment != null ? baseFragment.getResourceProvider() : null;
        } else {
            this.fragment = null;
            PeerStoriesView currentPeerView = baseFragment.getLastStoryViewer().storiesViewPager.getCurrentPeerView();
            this.containerLayout = currentPeerView != null ? currentPeerView.storyContainer : null;
            this.resourcesProvider = baseFragment.getLastStoryViewer().resourcesProvider;
        }
    }

    public static boolean canShowBulletin(BaseFragment baseFragment) {
        return (baseFragment == null || baseFragment.getParentActivity() == null || baseFragment.getLayoutContainer() == null) ? false : true;
    }

    public static Bulletin createAddedAsAdminBulletin(BaseFragment baseFragment, String str) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        lottieLayout.setAnimation(R.raw.ic_admin, "Shield");
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static Bulletin createBanBulletin(BaseFragment baseFragment, boolean z) {
        String string;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        if (z) {
            lottieLayout.setAnimation(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            lottieLayout.setAnimation(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(string));
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static Bulletin createDeleteMessagesBulletin(BaseFragment baseFragment, int i, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), resourcesProvider);
        lottieLayout.setAnimation(R.raw.ic_delete, "Envelope", "Cover", "Bucket");
        lottieLayout.textView.setText(LocaleController.formatPluralString("MessagesDeletedHint", i, new Object[0]));
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static Bulletin createDissableSharingBulletin(BaseFragment baseFragment, String str, boolean z) {
        String string;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        if (str != null) {
            string = LocaleController.formatString(z ? R.string.DisableSharingToastDisabledPending : R.string.DisableSharingToastEnabledPending, str);
        } else {
            string = LocaleController.getString(z ? R.string.DisableSharingToastDisabled : R.string.DisableSharingToastEnabled);
        }
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(string));
        lottieLayout.setAnimation((z || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return Bulletin.make(baseFragment, lottieLayout, 5000);
    }

    public static Bulletin createForwardedBulletin(Context context, FrameLayout frameLayout, int i, long j, int i2, int i3, int i4) {
        return createForwardedBulletin(context, null, frameLayout, i, j, i2, i3, i4, 1500);
    }

    public static Bulletin createInviteSentBulletin(Context context, FrameLayout frameLayout, int i, long j, int i2, int i3, int i4) {
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(context, null, i3, i4);
        int i5 = 300;
        int i6 = 0;
        if (i > 1) {
            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i, new Object[0])));
            lottieLayout.setAnimation(R.raw.forward, 30, 30, new String[0]);
        } else if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages));
            lottieLayout.setAnimation(R.raw.saved_messages, 30, 30, new String[0]);
            i5 = -1;
        } else {
            if (DialogObject.isChatDialog(j)) {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j)).title));
            } else {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j)))));
            }
            lottieLayout.setAnimation(R.raw.forward, 30, 30, new String[0]);
        }
        lottieLayout.textView.setText(spannableStringBuilderReplaceTags);
        if (i5 > 0) {
            lottieLayout.postDelayed(new BulletinFactory$$ExternalSyntheticLambda1(lottieLayout, i6), i5);
        }
        return Bulletin.make(frameLayout, lottieLayout, 1500);
    }

    public static Bulletin createMuteBulletin(BaseFragment baseFragment, int i) {
        return createMuteBulletin(baseFragment, i, 0, (Theme.ResourcesProvider) null);
    }

    public static Bulletin createPinMessageBulletin(BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        return createPinMessageBulletin(baseFragment, true, null, null, resourcesProvider);
    }

    public static Bulletin createPromoteToAdminBulletin(BaseFragment baseFragment, String str) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        lottieLayout.setAnimation(R.raw.ic_admin, "Shield");
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static Bulletin createRemoveFromChatBulletin(BaseFragment baseFragment, TLRPC.User user, String str) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        lottieLayout.setAnimation(R.raw.ic_ban, "Hand");
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, user.deleted ? LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]) : user.first_name, str)));
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static Bulletin createSaveMediaToGalleryBulletin(FrameLayout frameLayout, int i, boolean z, boolean z2, boolean z3, int i2, int i3) {
        FileType fileType;
        if ((z2 ? 1 : 0) + (z ? 1 : 0) + (z3 ? 1 : 0) > 1) {
            fileType = FileType.MEDIA;
        } else if (z3) {
            fileType = i > 1 ? FileType.LIVEPHOTOS : FileType.LIVEPHOTO;
        } else if (z) {
            fileType = i > 1 ? FileType.VIDEOS : FileType.VIDEO;
        } else {
            fileType = i > 1 ? FileType.PHOTOS : FileType.PHOTO;
        }
        return of(frameLayout, null).createDownloadBulletin(fileType, i, i2, i3);
    }

    public static Bulletin createSaveToGalleryBulletin(BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        return of(baseFragment).createDownloadBulletin(z ? FileType.VIDEO : FileType.PHOTO, resourcesProvider);
    }

    public static Bulletin createSoundEnabledBulletin(BaseFragment baseFragment, int i, Theme.ResourcesProvider resourcesProvider) {
        String string;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), resourcesProvider);
        boolean z = true;
        if (i == 0) {
            string = LocaleController.getString(R.string.SoundOnHint);
        } else {
            if (i != 1) {
                throw new IllegalArgumentException();
            }
            string = LocaleController.getString(R.string.SoundOffHint);
            z = false;
        }
        if (z) {
            lottieLayout.setAnimation(R.raw.sound_on, new String[0]);
        } else {
            lottieLayout.setAnimation(R.raw.sound_off, new String[0]);
        }
        lottieLayout.textView.setText(string);
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static Bulletin createUnpinAllMessagesBulletin(BaseFragment baseFragment, int i, boolean z, Runnable runnable, Runnable runnable2, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.ButtonLayout buttonLayout;
        if (baseFragment.getParentActivity() == null) {
            if (runnable2 == null) {
                return null;
            }
            runnable2.run();
            return null;
        }
        if (z) {
            Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(baseFragment.getParentActivity(), resourcesProvider);
            twoLineLottieLayout.setAnimation(R.raw.ic_unpin, 28, 28, "Pin", "Line");
            twoLineLottieLayout.titleTextView.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
            twoLineLottieLayout.subtitleTextView.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
            buttonLayout = twoLineLottieLayout;
        } else {
            Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), resourcesProvider);
            lottieLayout.setAnimation(R.raw.ic_unpin, 28, 28, "Pin", "Line");
            lottieLayout.textView.setText(LocaleController.formatPluralString("MessagesUnpinned", i, new Object[0]));
            buttonLayout = lottieLayout;
        }
        buttonLayout.setButton(new Bulletin.UndoButton(baseFragment.getParentActivity(), true, resourcesProvider).setUndoAction(runnable).setDelayedAction(runnable2));
        return Bulletin.make(baseFragment, buttonLayout, 5000);
    }

    public static Bulletin createUnpinMessageBulletin(BaseFragment baseFragment, Runnable runnable, Runnable runnable2, Theme.ResourcesProvider resourcesProvider) {
        return createPinMessageBulletin(baseFragment, false, runnable, runnable2, resourcesProvider);
    }

    public static BulletinFactory global() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return of(Bulletin.BulletinWindow.make(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = safeLastFragment.visibleDialog;
        return dialog instanceof BottomSheet ? of(((BottomSheet) dialog).container, safeLastFragment.getResourceProvider()) : of(safeLastFragment);
    }

    public static void lambda$createContainsEmojiBulletin$2(int i, Bulletin bulletin, long j, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        Object string;
        TLRPC.StickerSet stickerSet;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            string = LocaleController.getString(R.string.AddEmojiNotFound);
        } else if (i == 1) {
            string = AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title));
        } else {
            string = i == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title));
        }
        AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda0(29, bulletin, string), Math.max(1L, 750 - (System.currentTimeMillis() - j)));
    }

    public static void lambda$createDownloadBulletin$4() {
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity == null || launchActivity.isFinishing()) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
        intent.setFlags(268468224);
        LaunchActivity.instance.startActivity(intent);
    }

    public static void lambda$createForwardedBulletin$6(boolean[] zArr, Runnable runnable) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        runnable.run();
    }

    public static void lambda$createForwardedBulletin$7(Runnable runnable, BaseFragment baseFragment, long j) {
        if (runnable != null) {
            runnable.run();
        }
        if (baseFragment != null) {
            baseFragment.presentFragment(ChatActivity.of(j));
        }
    }

    public static BulletinFactory of(BaseFragment baseFragment) {
        return baseFragment == null ? global() : new BulletinFactory(baseFragment);
    }

    public static void showError(TLRPC.TL_error tL_error) {
        if (LaunchActivity.isActive) {
            if (tL_error == null || tL_error.code != 406) {
                global().createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text)).show();
            }
        }
    }

    public Bulletin create(Bulletin.Layout layout, int i) {
        BaseFragment baseFragment = this.fragment;
        return baseFragment != null ? Bulletin.make(baseFragment, layout, i) : Bulletin.make(this.containerLayout, layout, i);
    }

    public Bulletin createAdReportedBulletin(CharSequence charSequence) {
        if (getContext() == null) {
            return new Bulletin.EmptyBulletin();
        }
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setAnimation(R.raw.ic_admin, "Shield");
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        lottieLayout.textView.setText(charSequence);
        return create(lottieLayout, 2750);
    }

    public Bulletin createCaptionLimitBulletin(int i, final Runnable runnable) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), null);
        lottieLayout.setAnimation(R.raw.caption_limit, new String[0]);
        String pluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i, new Object[0]);
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(pluralString));
        int iIndexOf = pluralString.indexOf(42);
        int i2 = iIndexOf + 1;
        int iIndexOf2 = pluralString.indexOf(42, i2);
        spannableStringBuilderValueOf.replace(iIndexOf, iIndexOf2 + 1, (CharSequence) pluralString.substring(i2, iIndexOf2));
        spannableStringBuilderValueOf.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View view) {
                runnable.run();
            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        }, iIndexOf, iIndexOf2 - 1, 33);
        lottieLayout.textView.setText(spannableStringBuilderValueOf);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        return create(lottieLayout, 5000);
    }

    public Bulletin createChatsBulletin(List<TLObject> list, CharSequence charSequence, CharSequence charSequence2) {
        int i;
        Bulletin.UsersLayout usersLayout = new Bulletin.UsersLayout(getContext(), charSequence2 != null, this.resourcesProvider);
        if (list != null) {
            i = 0;
            for (int i2 = 0; i2 < list.size() && i < 3; i2++) {
                TLObject tLObject = list.get(i2);
                if (tLObject != null) {
                    int i3 = i + 1;
                    usersLayout.avatarsImageView.setCount(i3);
                    usersLayout.avatarsImageView.setObject(i, UserConfig.selectedAccount, tLObject);
                    i = i3;
                }
            }
            if (list.size() == 1) {
                usersLayout.avatarsImageView.setTranslationX(AndroidUtilities.dp(4.0f));
                usersLayout.avatarsImageView.setScaleX(1.2f);
                usersLayout.avatarsImageView.setScaleY(1.2f);
            } else {
                usersLayout.avatarsImageView.setScaleX(1.0f);
                usersLayout.avatarsImageView.setScaleY(1.0f);
            }
        } else {
            i = 0;
        }
        usersLayout.avatarsImageView.commitTransition(false);
        if (charSequence2 != null) {
            usersLayout.textView.setSingleLine(true);
            usersLayout.textView.setMaxLines(1);
            usersLayout.textView.setText(charSequence);
            usersLayout.subtitleView.setText(charSequence2);
            usersLayout.subtitleView.setSingleLine(true);
            usersLayout.subtitleView.setMaxLines(1);
            if (usersLayout.linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int iDp = AndroidUtilities.dp(74 - ((3 - i) * 12));
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) usersLayout.linearLayout.getLayoutParams()).rightMargin = iDp;
                } else {
                    ((ViewGroup.MarginLayoutParams) usersLayout.linearLayout.getLayoutParams()).leftMargin = iDp;
                }
            }
        } else {
            usersLayout.textView.setSingleLine(false);
            usersLayout.textView.setMaxLines(2);
            usersLayout.textView.setText(charSequence);
            if (usersLayout.textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int iDp2 = AndroidUtilities.dp(74 - ((3 - i) * 12));
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) usersLayout.textView.getLayoutParams()).rightMargin = iDp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) usersLayout.textView.getLayoutParams()).leftMargin = iDp2;
                }
            }
        }
        if (LocaleController.isRTL) {
            usersLayout.avatarsImageView.setTranslationX(AndroidUtilities.dp(32 - ((i - 1) * 12)));
        }
        return create(usersLayout, 5000);
    }

    public Bulletin createContainsEmojiBulletin(TLRPC.Document document, int i, final Utilities.Callback<TLRPC.InputStickerSet> callback) {
        SpannableStringBuilder spannableStringBuilder;
        LoadingSpan loadingSpan;
        TLRPC.StickerSet stickerSet;
        CharSequence charSequenceReplaceTags;
        final int i2 = 0;
        final int i3 = 1;
        final TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(document);
        if (inputStickerSet == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        if (stickerSet2 != null && (stickerSet = stickerSet2.set) != null) {
            if (i == 1) {
                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title));
            } else {
                charSequenceReplaceTags = i == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title));
            }
            return createEmojiBulletin(document, charSequenceReplaceTags, LocaleController.getString(R.string.ViewAction), new Runnable() {
                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            callback.run(inputStickerSet);
                            break;
                        default:
                            callback.run(inputStickerSet);
                            break;
                    }
                }
            });
        }
        if (i == 1) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, "<{LOADING}>")));
        } else {
            spannableStringBuilder = i == 2 ? new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, "<{LOADING}>"))) : new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, "<{LOADING}>")));
        }
        int iIndexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        if (iIndexOf >= 0) {
            loadingSpan = new LoadingSpan(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), this.resourcesProvider);
            spannableStringBuilder.setSpan(loadingSpan, iIndexOf, iIndexOf + 11, 33);
            int i4 = Theme.key_undo_infoColor;
            loadingSpan.setColors(ColorUtils.setAlphaComponent(Theme.getColor(i4, this.resourcesProvider), 32), ColorUtils.setAlphaComponent(Theme.getColor(i4, this.resourcesProvider), 72));
        } else {
            loadingSpan = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Bulletin bulletinCreateEmojiLoadingBulletin = createEmojiLoadingBulletin(document, spannableStringBuilder, LocaleController.getString(R.string.ViewAction), new Runnable() {
            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        callback.run(inputStickerSet);
                        break;
                    default:
                        callback.run(inputStickerSet);
                        break;
                }
            }
        });
        if (loadingSpan != null && (bulletinCreateEmojiLoadingBulletin.getLayout() instanceof Bulletin.LoadingLottieLayout)) {
            loadingSpan.setView(((Bulletin.LoadingLottieLayout) bulletinCreateEmojiLoadingBulletin.getLayout()).textLoadingView);
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new BulletinFactory$$ExternalSyntheticLambda10(i, bulletinCreateEmojiLoadingBulletin, jCurrentTimeMillis));
        return bulletinCreateEmojiLoadingBulletin;
    }

    public Bulletin createCopyBulletin(String str) {
        return createCopyBulletin(str, null);
    }

    public Bulletin createCopyLinkBulletin() {
        return createCopyLinkBulletin(false);
    }

    public Bulletin createDownloadBulletin(FileType fileType) {
        return createDownloadBulletin(fileType, this.resourcesProvider);
    }

    public Bulletin createEmojiBulletin(long j, String str, String str2) {
        Bulletin.TwoLineBackupLayout twoLineBackupLayout = new Bulletin.TwoLineBackupLayout(getContext(), this.resourcesProvider);
        twoLineBackupLayout.imageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(1, UserConfig.selectedAccount, j));
        twoLineBackupLayout.imageView.setEmojiColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        twoLineBackupLayout.titleTextView.setText(str);
        twoLineBackupLayout.subtitleTextView.setText(str2);
        return create(twoLineBackupLayout, 2750);
    }

    public Bulletin createEmojiLoadingBulletin(TLRPC.Document document, CharSequence charSequence, CharSequence charSequence2, Runnable runnable) {
        Bulletin.LoadingLottieLayout loadingLottieLayout = new Bulletin.LoadingLottieLayout(getContext(), this.resourcesProvider);
        if (MessageObject.isTextColorEmoji(document)) {
            loadingLottieLayout.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
        }
        loadingLottieLayout.setAnimation(document, 36, 36, new String[0]);
        loadingLottieLayout.textView.setTextSize(1, 14.0f);
        loadingLottieLayout.textView.setSingleLine(false);
        loadingLottieLayout.textView.setMaxLines(3);
        loadingLottieLayout.textLoadingView.setText(charSequence);
        loadingLottieLayout.textLoadingView.setTextSize(1, 14.0f);
        loadingLottieLayout.textLoadingView.setSingleLine(false);
        loadingLottieLayout.textLoadingView.setMaxLines(3);
        loadingLottieLayout.setButton(new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(charSequence2).setUndoAction(runnable));
        return create(loadingLottieLayout, 2750);
    }

    public Bulletin createErrorBulletin(CharSequence charSequence) {
        return createErrorBulletin(charSequence, null);
    }

    public Bulletin createErrorBulletinSubtitle(CharSequence charSequence, CharSequence charSequence2, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), resourcesProvider);
        twoLineLottieLayout.setAnimation(R.raw.chats_infotip, new String[0]);
        twoLineLottieLayout.titleTextView.setText(charSequence);
        twoLineLottieLayout.subtitleTextView.setText(charSequence2);
        return create(twoLineLottieLayout, 1500);
    }

    public Bulletin createImageBulletin(int i, CharSequence charSequence) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setBackground(Theme.getColor(Theme.key_undo_background, this.resourcesProvider), 12);
        lottieLayout.imageView.setImageResource(i);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setLines(2);
        lottieLayout.textView.setMaxLines(4);
        TextView textView = lottieLayout.textView;
        textView.setMaxWidth(HintView2.cutInFancyHalf(textView.getText(), lottieLayout.textView.getPaint()));
        lottieLayout.textView.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) lottieLayout.textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        lottieLayout.setWrapWidth();
        return create(lottieLayout, 5000);
    }

    public Bulletin createMessagesTaggedBulletin(int i, TLRPC.Document document, Runnable runnable) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setAnimation(R.raw.tag_icon_3, 36, 36, new String[0]);
        lottieLayout.removeView(lottieLayout.textView);
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(lottieLayout.getContext());
        lottieLayout.textView = textViewEmojis;
        textViewEmojis.setTypeface(Typeface.SANS_SERIF);
        lottieLayout.textView.setTextSize(1, 15.0f);
        lottieLayout.textView.setEllipsize(TextUtils.TruncateAt.END);
        lottieLayout.textView.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new AnimatedEmojiSpan(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        lottieLayout.textView.setText(new SpannableStringBuilder(i > 1 ? LocaleController.formatPluralString("SavedTagMessagesTagged", i, new Object[0]) : LocaleController.getString(R.string.SavedTagMessageTagged)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (runnable != null) {
            lottieLayout.setButton(new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(LocaleController.getString(R.string.ViewAction)).setUndoAction(runnable));
        }
        lottieLayout.setTextColor(Theme.getColor(Theme.key_undo_infoColor, this.resourcesProvider));
        lottieLayout.addView(lottieLayout.textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return create(lottieLayout, 2750);
    }

    public Bulletin createReportSent(Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
        lottieLayout.setAnimation(R.raw.chats_infotip, new String[0]);
        lottieLayout.textView.setText(LocaleController.getString(R.string.ReportChatSent));
        return create(lottieLayout, 1500);
    }

    public Bulletin createRestrictVoiceMessagesPremiumBulletin() {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), null);
        lottieLayout.setAnimation(R.raw.voip_muted, new String[0]);
        String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iIndexOf = string.indexOf(42);
        int iLastIndexOf = string.lastIndexOf(42);
        if (iIndexOf >= 0) {
            spannableStringBuilder.replace(iIndexOf, iLastIndexOf + 1, (CharSequence) string.substring(iIndexOf + 1, iLastIndexOf));
            spannableStringBuilder.setSpan(new ClickableSpan() {
                @Override
                public void onClick(View view) {
                    BulletinFactory.this.fragment.presentFragment(new PremiumPreviewFragment("settings"));
                }

                @Override
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }
            }, iIndexOf, iLastIndexOf - 1, 33);
        }
        lottieLayout.textView.setText(spannableStringBuilder);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        return create(lottieLayout, 2750);
    }

    public Bulletin createSimpleBulletin(int i, CharSequence charSequence) {
        return createSimpleBulletinWithIconSize(i, charSequence, 36);
    }

    public Bulletin createSimpleBulletinDetail(int i, CharSequence charSequence) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setAnimation(i, 36, 36, new String[0]);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setTextSize(1, 14.0f);
        lottieLayout.textView.setMaxLines(4);
        return create(lottieLayout, charSequence.length() < 20 ? 1500 : 2750);
    }

    public Bulletin createSimpleBulletinWithIconSize(int i, CharSequence charSequence, int i2) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setAnimation(i, i2, i2, new String[0]);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        return create(lottieLayout, charSequence.length() < 20 ? 1500 : 2750);
    }

    public Bulletin createSimpleLargeBulletin(int i, CharSequence charSequence, CharSequence charSequence2) {
        Bulletin.TwoLineLayout twoLineLayout = new Bulletin.TwoLineLayout(getContext(), this.resourcesProvider);
        twoLineLayout.imageView.setImageResource(i);
        twoLineLayout.titleTextView.setText(charSequence);
        twoLineLayout.subtitleTextView.setText(charSequence2);
        twoLineLayout.subtitleTextView.setSingleLine(false);
        twoLineLayout.subtitleTextView.setMaxLines(5);
        return create(twoLineLayout, 5000);
    }

    public Bulletin createSimpleMultiBulletin(TLRPC.Document document, CharSequence charSequence) {
        if (document == null) {
            return new Bulletin.EmptyBulletin();
        }
        Bulletin.TwoLineLayout twoLineLayout = new Bulletin.TwoLineLayout(getContext(), this.resourcesProvider);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        twoLineLayout.imageView.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document), "28_28", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "28_28", (String) null, 0L, 0, (Object) null);
        twoLineLayout.imageView.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        twoLineLayout.titleTextView.setSingleLine(false);
        twoLineLayout.titleTextView.setText(charSequence);
        twoLineLayout.titleTextView.setTextSize(1, 14.0f);
        twoLineLayout.titleTextView.setMaxLines(3);
        twoLineLayout.titleTextView.setTypeface(null);
        twoLineLayout.subtitleTextView.setVisibility(8);
        return create(twoLineLayout, charSequence.length() < 20 ? 1500 : 2750);
    }

    public Bulletin createStaticEmojiBulletin(TLRPC.Document document, CharSequence charSequence) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        if (MessageObject.isTextColorEmoji(document)) {
            lottieLayout.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
        }
        lottieLayout.setAnimation(document, 36, 36, new String[0]);
        lottieLayout.imageView.stopAnimation();
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setTextSize(1, 14.0f);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        return create(lottieLayout, 2750);
    }

    public Bulletin createSuccessBulletin(CharSequence charSequence) {
        return createSuccessBulletin(charSequence, null);
    }

    public Bulletin createUndoBulletin(CharSequence charSequence, Runnable runnable, Runnable runnable2) {
        return createUndoBulletin(charSequence, false, runnable, runnable2);
    }

    public Bulletin createUsersAddedBulletin(ArrayList<TLRPC.User> arrayList, TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        if (arrayList == null || arrayList.size() == 0) {
            spannableStringBuilderReplaceTags = null;
        } else if (arrayList.size() != 1) {
            spannableStringBuilderReplaceTags = ChatObject.isChannelAndNotMegaGroup(chat) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedMembersToChannel", arrayList.size(), new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedSubscribersToChannel", arrayList.size(), new Object[0]));
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, "**" + UserObject.getFirstName(arrayList.get(0)) + "**"));
        } else {
            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, "**" + UserObject.getFirstName(arrayList.get(0)) + "**"));
        }
        return createUsersBulletin(arrayList, spannableStringBuilderReplaceTags);
    }

    public Bulletin createUsersBulletin(List<? extends TLObject> list, CharSequence charSequence) {
        return createUsersBulletin(list, charSequence, null, null);
    }

    public Context getContext() {
        Context context;
        BaseFragment baseFragment = this.fragment;
        if (baseFragment != null) {
            context = baseFragment.getParentActivity();
            if (context == null && this.fragment.getLayoutContainer() != null) {
                context = this.fragment.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.containerLayout;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? ApplicationLoader.applicationContext : context;
    }

    public Theme.ResourcesProvider getResourcesProvider() {
        return this.resourcesProvider;
    }

    public Bulletin makeForError(TLRPC.TL_error tL_error) {
        if (LaunchActivity.isActive) {
            return tL_error == null ? createErrorBulletin(LocaleController.formatString(R.string.UnknownError, new Object[0])) : createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text));
        }
        return new Bulletin.EmptyBulletin();
    }

    public void showForError(TLRPC.TL_error tL_error) {
        showForError(tL_error, false);
    }

    public boolean showForwardedBulletinWithTag(long j, int i) {
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && this.fragment != null) {
            Bulletin.LottieLayoutWithReactions lottieLayoutWithReactions = new Bulletin.LottieLayoutWithReactions(this.fragment, i);
            if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                SpannableStringBuilder spannableStringBuilderReplaceSingleTag = i <= 1 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new UndoView$$ExternalSyntheticLambda7(11)) : AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new UndoView$$ExternalSyntheticLambda7(11));
                lottieLayoutWithReactions.setAnimation(R.raw.saved_messages, 36, 36, new String[0]);
                lottieLayoutWithReactions.textView.setText(spannableStringBuilderReplaceSingleTag);
                lottieLayoutWithReactions.textView.setSingleLine(false);
                lottieLayoutWithReactions.textView.setMaxLines(2);
                Bulletin bulletinCreate = create(lottieLayoutWithReactions, 3500);
                lottieLayoutWithReactions.setBulletin(bulletinCreate);
                bulletinCreate.hideAfterBottomSheet(false);
                bulletinCreate.show(true);
                return true;
            }
        }
        return false;
    }

    public static Bulletin createForwardedBulletin(Context context, BaseFragment baseFragment, FrameLayout frameLayout, int i, long j, int i2, int i3, int i4, int i5) {
        return createForwardedBulletin(context, baseFragment, frameLayout, i, j, i2, i3, i4, i5, null, null);
    }

    public static Bulletin createMuteBulletin(BaseFragment baseFragment, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        String string;
        boolean z;
        boolean z2 = true;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), resourcesProvider);
        if (i == 0) {
            string = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Hours", 1, new Object[0]));
        } else if (i == 1) {
            string = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Hours", 8, new Object[0]));
        } else {
            if (i != 2) {
                if (i == 3) {
                    string = LocaleController.getString(R.string.NotificationsMutedHint);
                } else if (i == 4) {
                    string = LocaleController.getString(R.string.NotificationsUnmutedHint);
                    z = false;
                    z2 = false;
                } else {
                    if (i != 5) {
                        throw new IllegalArgumentException();
                    }
                    string = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i2));
                    z = true;
                }
                if (z2) {
                    lottieLayout.setAnimation(R.raw.mute_for, new String[0]);
                } else if (z) {
                    lottieLayout.setAnimation(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    lottieLayout.setAnimation(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                lottieLayout.textView.setText(string);
                return Bulletin.make(baseFragment, lottieLayout, 1500);
            }
            string = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Days", 2, new Object[0]));
        }
        z = true;
        z2 = false;
        if (z2) {
            lottieLayout.setAnimation(R.raw.mute_for, new String[0]);
        } else if (z) {
            lottieLayout.setAnimation(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
        } else {
            lottieLayout.setAnimation(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
        }
        lottieLayout.textView.setText(string);
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    private static Bulletin createPinMessageBulletin(BaseFragment baseFragment, boolean z, Runnable runnable, Runnable runnable2, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), resourcesProvider);
        lottieLayout.setAnimation(z ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        lottieLayout.textView.setText(LocaleController.getString(z ? "MessagePinnedHint" : "MessageUnpinnedHint", z ? R.string.MessagePinnedHint : R.string.MessageUnpinnedHint));
        if (!z) {
            lottieLayout.setButton(new Bulletin.UndoButton(baseFragment.getParentActivity(), true, resourcesProvider).setUndoAction(runnable).setDelayedAction(runnable2));
        }
        return Bulletin.make(baseFragment, lottieLayout, z ? 1500 : 5000);
    }

    public static Bulletin createSaveToGalleryBulletin(BaseFragment baseFragment, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        FileType fileType;
        BulletinFactory bulletinFactoryOf = of(baseFragment);
        if (z2) {
            fileType = FileType.LIVEPHOTO;
        } else {
            fileType = z ? FileType.VIDEO : FileType.PHOTO;
        }
        return bulletinFactoryOf.createDownloadBulletin(fileType, resourcesProvider);
    }

    public Bulletin createCopyBulletin(String str, Theme.ResourcesProvider resourcesProvider) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new Bulletin.EmptyBulletin();
        }
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), null);
        lottieLayout.setAnimation(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        lottieLayout.textView.setText(str);
        return create(lottieLayout, 1500);
    }

    public Bulletin createCopyLinkBulletin(boolean z) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new Bulletin.EmptyBulletin();
        }
        if (!z) {
            Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
            lottieLayout.setAnimation(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            lottieLayout.textView.setText(LocaleController.getString(R.string.LinkCopied));
            return create(lottieLayout, 1500);
        }
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), this.resourcesProvider);
        twoLineLottieLayout.setAnimation(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        twoLineLottieLayout.titleTextView.setText(LocaleController.getString(R.string.LinkCopied));
        twoLineLottieLayout.subtitleTextView.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
        return create(twoLineLottieLayout, 2750);
    }

    public Bulletin createDownloadBulletin(FileType fileType, Theme.ResourcesProvider resourcesProvider) {
        return createDownloadBulletin(fileType, 1, resourcesProvider);
    }

    public Bulletin createErrorBulletin(CharSequence charSequence, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
        lottieLayout.setAnimation(R.raw.chats_infotip, new String[0]);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        return create(lottieLayout, 1500);
    }

    public Bulletin createSimpleBulletin(TLRPC.MessageMedia messageMedia, CharSequence charSequence) {
        if (messageMedia == null) {
            return new Bulletin.EmptyBulletin();
        }
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            return createSimpleBulletin(document, charSequence);
        }
        TLRPC.Photo photo = messageMedia.photo;
        return photo != null ? createSimpleBulletin(photo, charSequence) : new Bulletin.EmptyBulletin();
    }

    public Bulletin createSuccessBulletin(CharSequence charSequence, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
        lottieLayout.setAnimation(R.raw.contact_check, new String[0]);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        return create(lottieLayout, 1500);
    }

    public Bulletin createUndoBulletin(CharSequence charSequence, boolean z, Runnable runnable, Runnable runnable2) {
        return createUndoBulletin(charSequence, null, z, runnable, runnable2);
    }

    public Bulletin createUsersBulletin(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2) {
        return createUsersBulletin(Arrays.asList(tLObject), charSequence, charSequence2, null);
    }

    public void showForError(TLRPC.TL_error tL_error, boolean z) {
        if (LaunchActivity.isActive) {
            if (tL_error == null) {
                Bulletin bulletinCreateErrorBulletin = createErrorBulletin(LocaleController.formatString(R.string.UnknownError, new Object[0]));
                bulletinCreateErrorBulletin.hideAfterBottomSheet = false;
                bulletinCreateErrorBulletin.show(z);
            } else if (tL_error.code != 406) {
                Bulletin bulletinCreateErrorBulletin2 = createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text));
                bulletinCreateErrorBulletin2.hideAfterBottomSheet = false;
                bulletinCreateErrorBulletin2.show(z);
            }
        }
    }

    public static Bulletin createForwardedBulletin(Context context, BaseFragment baseFragment, FrameLayout frameLayout, int i, long j, int i2, int i3, int i4, int i5, Runnable runnable, Runnable runnable2) {
        return createForwardedBulletin(context, baseFragment, frameLayout, i, j, i2, i3, i4, i5, false, runnable, runnable2);
    }

    public static Bulletin createSaveToGalleryBulletin(FrameLayout frameLayout, boolean z, Theme.ResourcesProvider resourcesProvider) {
        return of(frameLayout, resourcesProvider).createDownloadBulletin(z ? FileType.VIDEO : FileType.PHOTO, resourcesProvider);
    }

    public static BulletinFactory of(FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider) {
        return new BulletinFactory(frameLayout, resourcesProvider);
    }

    public Bulletin createDownloadBulletin(FileType fileType, int i, Theme.ResourcesProvider resourcesProvider) {
        return createDownloadBulletin(fileType, i, 0, 0, resourcesProvider);
    }

    public Bulletin createUndoBulletin(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, Runnable runnable2) {
        return createUndoBulletin(charSequence, charSequence2, true, runnable, runnable2);
    }

    public Bulletin createUsersBulletin(TLObject tLObject, CharSequence charSequence) {
        return createUsersBulletin(Arrays.asList(tLObject), charSequence, null, null);
    }

    public static Bulletin createForwardedBulletin(Context context, BaseFragment baseFragment, FrameLayout frameLayout, int i, long j, int i2, int i3, int i4, int i5, boolean z, Runnable runnable, Runnable runnable2) {
        Bulletin.LottieLayout lottieLayout;
        int i6;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        Bulletin bulletinMake;
        int i7;
        int i8 = 11;
        int i9 = 1;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && baseFragment != null && i <= 1 && j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !z) {
            lottieLayout = new Bulletin.LottieLayoutWithReactions(baseFragment, i2);
        } else {
            lottieLayout = new Bulletin.LottieLayout(context, baseFragment != null ? baseFragment.getResourceProvider() : null, i3, i4);
        }
        Bulletin.LottieLayout lottieLayout2 = lottieLayout;
        boolean z2 = (runnable2 == null && runnable == null) ? false : true;
        AlertsCreator$$ExternalSyntheticLambda145 alertsCreator$$ExternalSyntheticLambda145 = runnable2 != null ? new AlertsCreator$$ExternalSyntheticLambda145(i9, runnable2, new boolean[]{false}) : null;
        if (i > 1) {
            i6 = 2;
            if (i2 <= 1) {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i, new Object[0]));
            } else {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i, new Object[0]));
            }
            lottieLayout2.setAnimation(R.raw.forward, 30, 30, new String[0]);
        } else if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            if (i2 <= 1) {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, z ? new UndoView$$ExternalSyntheticLambda7(12) : new UndoView$$ExternalSyntheticLambda7(i8));
            } else {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new UndoView$$ExternalSyntheticLambda7(i8));
            }
            lottieLayout2.setAnimation(R.raw.saved_messages, 30, 30, new String[0]);
            i6 = 2;
        } else {
            i6 = 2;
            BulletinFactory$$ExternalSyntheticLambda5 bulletinFactory$$ExternalSyntheticLambda5 = new BulletinFactory$$ExternalSyntheticLambda5(alertsCreator$$ExternalSyntheticLambda145, baseFragment, j, 0);
            if (DialogObject.isChatDialog(j)) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j));
                if (i2 <= 1) {
                    spannableStringBuilderReplaceTags = baseFragment != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, bulletinFactory$$ExternalSyntheticLambda5) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title));
                } else {
                    spannableStringBuilderReplaceTags = baseFragment != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, bulletinFactory$$ExternalSyntheticLambda5) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
                if (i2 <= 1) {
                    int i10 = z2 ? R.string.FwdMessageToUserShort : R.string.FwdMessageToUser;
                    spannableStringBuilderReplaceTags = baseFragment != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i10, UserObject.getFirstName(user)), -1, 2, bulletinFactory$$ExternalSyntheticLambda5) : AndroidUtilities.replaceTags(LocaleController.formatString(i10, UserObject.getFirstName(user)));
                } else {
                    int i11 = z2 ? R.string.FwdMessagesToUserShort : R.string.FwdMessagesToUser;
                    if (baseFragment != null) {
                        i7 = 0;
                        spannableStringBuilderReplaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i11, UserObject.getFirstName(user)), -1, 2, bulletinFactory$$ExternalSyntheticLambda5);
                    } else {
                        i7 = 0;
                        spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, UserObject.getFirstName(user)));
                    }
                }
                lottieLayout2.setAnimation(R.raw.forward, 30, 30, new String[i7]);
            }
            i7 = 0;
            lottieLayout2.setAnimation(R.raw.forward, 30, 30, new String[i7]);
        }
        lottieLayout2.textView.setText(spannableStringBuilderReplaceTags);
        if (z2) {
            lottieLayout2.setButton(new Bulletin.UndoButton(lottieLayout2.getContext(), true, true, baseFragment != null ? baseFragment.getResourceProvider() : null).setUndoAction(runnable).setDelayedAction(alertsCreator$$ExternalSyntheticLambda145));
        }
        lottieLayout2.postDelayed(new BulletinFactory$$ExternalSyntheticLambda1(lottieLayout2, i9), 300);
        if (frameLayout != null) {
            bulletinMake = Bulletin.make(frameLayout, lottieLayout2, i5);
        } else if (baseFragment != null) {
            bulletinMake = Bulletin.make(baseFragment, lottieLayout2, i5);
        } else {
            throw new IllegalArgumentException();
        }
        if (lottieLayout2 instanceof Bulletin.LottieLayoutWithReactions) {
            lottieLayout2.textView.setSingleLine(false);
            lottieLayout2.textView.setMaxLines(i6);
            ((Bulletin.LottieLayoutWithReactions) lottieLayout2).setBulletin(bulletinMake);
            bulletinMake.hideAfterBottomSheet(false);
        }
        return bulletinMake;
    }

    public static Bulletin createSaveToGalleryBulletin(FrameLayout frameLayout, boolean z, int i, int i2) {
        return of(frameLayout, null).createDownloadBulletin(z ? FileType.VIDEO : FileType.PHOTO, 1, i, i2);
    }

    public Bulletin createDownloadBulletin(FileType fileType, int i, int i2, int i3) {
        return createDownloadBulletin(fileType, i, i2, i3, null);
    }

    public Bulletin createUndoBulletin(CharSequence charSequence, CharSequence charSequence2, boolean z, Runnable runnable, Runnable runnable2) {
        Bulletin.ButtonLayout buttonLayout;
        if (!TextUtils.isEmpty(charSequence2)) {
            Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), this.resourcesProvider);
            twoLineLottieLayout.titleTextView.setText(charSequence);
            twoLineLottieLayout.subtitleTextView.setText(charSequence2);
            buttonLayout = twoLineLottieLayout;
        } else {
            Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
            lottieLayout.textView.setText(charSequence);
            lottieLayout.textView.setSingleLine(false);
            lottieLayout.textView.setMaxLines(2);
            buttonLayout = lottieLayout;
        }
        buttonLayout.setTimer();
        buttonLayout.setButton(new Bulletin.UndoButton(getContext(), true, z, this.resourcesProvider).setText(LocaleController.getString(R.string.UndoNoCaps)).setUndoAction(runnable).setDelayedAction(runnable2));
        return create(buttonLayout, 5000);
    }

    public Bulletin createUsersBulletin(List<? extends TLObject> list, CharSequence charSequence, CharSequence charSequence2) {
        return createUsersBulletin(list, charSequence, charSequence2, null);
    }

    public static Bulletin createSaveToGalleryBulletin(FrameLayout frameLayout, boolean z, boolean z2, int i, int i2) {
        FileType fileType;
        BulletinFactory bulletinFactoryOf = of(frameLayout, null);
        if (z2) {
            fileType = FileType.LIVEPHOTO;
        } else {
            fileType = z ? FileType.VIDEO : FileType.PHOTO;
        }
        return bulletinFactoryOf.createDownloadBulletin(fileType, 1, i, i2);
    }

    public Bulletin createDownloadBulletin(FileType fileType, int i, int i2, int i3, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout;
        if (i2 != 0 && i3 != 0) {
            lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider, i2, i3);
        } else {
            lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
        }
        lottieLayout.setAnimation(fileType.icon.resId, fileType.icon.layers);
        lottieLayout.textView.setText(AndroidUtilities.replaceSingleTag(fileType.getText(i), new UndoView$$ExternalSyntheticLambda7(13)));
        if (fileType.icon.paddingBottom != 0) {
            lottieLayout.setIconPaddingBottom(fileType.icon.paddingBottom);
        }
        return create(lottieLayout, 1500);
    }

    public Bulletin createUsersBulletin(List<? extends TLObject> list, CharSequence charSequence, CharSequence charSequence2, UndoObject undoObject) {
        float f;
        int i;
        Bulletin.UsersLayout usersLayout = new Bulletin.UsersLayout(getContext(), charSequence2 != null, this.resourcesProvider);
        if (list != null) {
            i = 0;
            for (int i2 = 0; i2 < list.size() && i < 3; i2++) {
                TLObject tLObject = list.get(i2);
                if (tLObject != null) {
                    int i3 = i + 1;
                    usersLayout.avatarsImageView.setCount(i3);
                    usersLayout.avatarsImageView.setObject(i, UserConfig.selectedAccount, tLObject);
                    i = i3;
                }
            }
            f = 4.0f;
            if (list.size() == 1) {
                usersLayout.avatarsImageView.setTranslationX(AndroidUtilities.dp(4.0f));
                usersLayout.avatarsImageView.setScaleX(1.2f);
                usersLayout.avatarsImageView.setScaleY(1.2f);
            } else {
                usersLayout.avatarsImageView.setScaleX(1.0f);
                usersLayout.avatarsImageView.setScaleY(1.0f);
            }
        } else {
            f = 4.0f;
            i = 0;
        }
        usersLayout.avatarsImageView.commitTransition(false);
        if (charSequence2 != null) {
            usersLayout.textView.setSingleLine(true);
            usersLayout.textView.setMaxLines(1);
            usersLayout.textView.setText(charSequence);
            usersLayout.subtitleView.setText(charSequence2);
            usersLayout.subtitleView.setSingleLine(false);
            usersLayout.subtitleView.setMaxLines(3);
            if (usersLayout.linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int iDp = AndroidUtilities.dp(70 - ((3 - i) * 12));
                if (i == 1) {
                    iDp += AndroidUtilities.dp(f);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) usersLayout.linearLayout.getLayoutParams()).rightMargin = iDp;
                } else {
                    ((ViewGroup.MarginLayoutParams) usersLayout.linearLayout.getLayoutParams()).leftMargin = iDp;
                }
            }
        } else {
            usersLayout.textView.setSingleLine(false);
            usersLayout.textView.setMaxLines(4);
            usersLayout.textView.setText(charSequence);
            if (usersLayout.textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int iDp2 = AndroidUtilities.dp(70 - ((3 - i) * 12));
                if (i == 1) {
                    usersLayout.textView.setTranslationY(-AndroidUtilities.dp(1.0f));
                    iDp2 += AndroidUtilities.dp(f);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) usersLayout.textView.getLayoutParams()).rightMargin = iDp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) usersLayout.textView.getLayoutParams()).leftMargin = iDp2;
                }
            }
        }
        if (undoObject != null) {
            usersLayout.setButton(new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(LocaleController.getString(R.string.UndoNoCaps)).setUndoAction(undoObject.onUndo).setDelayedAction(undoObject.onAction));
        }
        return create(usersLayout, 5000);
    }

    public static Bulletin createSaveToGalleryBulletin(FrameLayout frameLayout, int i, boolean z, int i2, int i3) {
        FileType fileType;
        BulletinFactory bulletinFactoryOf = of(frameLayout, null);
        if (z) {
            fileType = i > 1 ? FileType.VIDEOS : FileType.VIDEO;
        } else {
            fileType = i > 1 ? FileType.PHOTOS : FileType.PHOTO;
        }
        return bulletinFactoryOf.createDownloadBulletin(fileType, i, i2, i3);
    }

    public static Bulletin createSaveToGalleryBulletin(FrameLayout frameLayout, int i, boolean z, boolean z2, int i2, int i3) {
        FileType fileType;
        if (z2) {
            fileType = i > 1 ? FileType.LIVEPHOTOS : FileType.LIVEPHOTO;
        } else if (z) {
            fileType = i > 1 ? FileType.VIDEOS : FileType.VIDEO;
        } else {
            fileType = i > 1 ? FileType.PHOTOS : FileType.PHOTO;
        }
        return of(frameLayout, null).createDownloadBulletin(fileType, i, i2, i3);
    }

    public Bulletin createEmojiBulletin(String str, String str2) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setAnimation(MediaDataController.getInstance(UserConfig.selectedAccount).getEmojiAnimatedSticker(str), 36, 36, new String[0]);
        lottieLayout.textView.setText(str2);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        return create(lottieLayout, 2750);
    }

    public Bulletin createBanBulletin(boolean z) {
        String string;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        if (z) {
            lottieLayout.setAnimation(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            lottieLayout.setAnimation(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(string));
        return create(lottieLayout, 1500);
    }

    public Bulletin createSimpleBulletin(TLRPC.Document document, CharSequence charSequence) {
        if (document == null) {
            return new Bulletin.EmptyBulletin();
        }
        Bulletin.TwoLineLayout twoLineLayout = new Bulletin.TwoLineLayout(getContext(), this.resourcesProvider);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        twoLineLayout.imageView.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document), "28_28", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "28_28", (String) null, 0L, 0, (Object) null);
        twoLineLayout.imageView.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        twoLineLayout.titleTextView.setText(charSequence);
        twoLineLayout.titleTextView.setSingleLine(true);
        twoLineLayout.titleTextView.setTextSize(1, 15.0f);
        twoLineLayout.titleTextView.setMaxLines(1);
        twoLineLayout.titleTextView.setTypeface(null);
        twoLineLayout.subtitleTextView.setVisibility(8);
        return create(twoLineLayout, charSequence.length() < 20 ? 1500 : 2750);
    }

    public void showForError(String str) {
        showForError(str, false);
    }

    public void showForError(String str, boolean z) {
        if (LaunchActivity.isActive) {
            if (TextUtils.isEmpty(str)) {
                Bulletin bulletinCreateErrorBulletin = createErrorBulletin(LocaleController.formatString(R.string.UnknownError, new Object[0]));
                bulletinCreateErrorBulletin.hideAfterBottomSheet = false;
                bulletinCreateErrorBulletin.show(z);
            } else {
                Bulletin bulletinCreateErrorBulletin2 = createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, str));
                bulletinCreateErrorBulletin2.hideAfterBottomSheet = false;
                bulletinCreateErrorBulletin2.show(z);
            }
        }
    }

    public Bulletin createCopyLinkBulletin(String str, Theme.ResourcesProvider resourcesProvider) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new Bulletin.EmptyBulletin();
        }
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
        lottieLayout.setAnimation(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        lottieLayout.textView.setText(str);
        return create(lottieLayout, 1500);
    }

    public Bulletin createEmojiBulletin(String str, String str2, String str3, Runnable runnable) {
        return createEmojiBulletin(MediaDataController.getInstance(UserConfig.selectedAccount).getEmojiAnimatedSticker(str), str2, str3, runnable);
    }

    public Bulletin createEmojiBulletin(TLRPC.Document document, CharSequence charSequence) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        if (MessageObject.isTextColorEmoji(document)) {
            lottieLayout.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
        }
        lottieLayout.setAnimation(document, 36, 36, new String[0]);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setTextSize(1, 14.0f);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        return create(lottieLayout, 2750);
    }

    private BulletinFactory(FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider) {
        this.containerLayout = frameLayout;
        this.fragment = null;
        this.resourcesProvider = resourcesProvider;
    }

    public static Bulletin createMuteBulletin(BaseFragment baseFragment, boolean z, int i, Theme.ResourcesProvider resourcesProvider) {
        String pluralString;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), resourcesProvider);
        TextView textView = lottieLayout.textView;
        if (z) {
            pluralString = LocaleController.formatPluralString("NotificationsMutedHintChats", i, new Object[0]);
        } else {
            pluralString = LocaleController.formatPluralString("NotificationsUnmutedHintChats", i, new Object[0]);
        }
        textView.setText(pluralString);
        if (z) {
            lottieLayout.setAnimation(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
        } else {
            lottieLayout.setAnimation(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
        }
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static Bulletin createCopyLinkBulletin(BaseFragment baseFragment) {
        return of(baseFragment).createCopyLinkBulletin();
    }

    public static Bulletin createCopyLinkBulletin(FrameLayout frameLayout) {
        return of(frameLayout, null).createCopyLinkBulletin();
    }

    public static Bulletin createMuteBulletin(BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        return createMuteBulletin(baseFragment, z ? 3 : 4, 0, resourcesProvider);
    }

    public Bulletin createSimpleBulletin(TLRPC.Document document, CharSequence charSequence, CharSequence charSequence2) {
        if (document == null) {
            return new Bulletin.EmptyBulletin();
        }
        Bulletin.TwoLineLayout twoLineLayout = new Bulletin.TwoLineLayout(getContext(), this.resourcesProvider);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        twoLineLayout.imageView.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document), "28_28", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "28_28", (String) null, 0L, 0, (Object) null);
        twoLineLayout.imageView.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        twoLineLayout.titleTextView.setText(charSequence);
        twoLineLayout.titleTextView.setSingleLine(true);
        twoLineLayout.titleTextView.setTextSize(1, 15.0f);
        twoLineLayout.titleTextView.setMaxLines(1);
        twoLineLayout.titleTextView.setTypeface(AndroidUtilities.bold());
        twoLineLayout.subtitleTextView.setText(charSequence2);
        twoLineLayout.subtitleTextView.setSingleLine(false);
        twoLineLayout.subtitleTextView.setMaxLines(5);
        return create(twoLineLayout, charSequence2.length() < 20 ? 1500 : 2750);
    }

    public Bulletin createEmojiBulletin(TLRPC.Document document, CharSequence charSequence, CharSequence charSequence2) {
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), this.resourcesProvider);
        if (MessageObject.isTextColorEmoji(document)) {
            twoLineLottieLayout.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
        }
        twoLineLottieLayout.setAnimation(document, 36, 36, new String[0]);
        twoLineLottieLayout.titleTextView.setText(charSequence);
        twoLineLottieLayout.subtitleTextView.setText(charSequence2);
        return create(twoLineLottieLayout, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public Bulletin createEmojiBulletin(TLRPC.Document document, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Runnable runnable) {
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), this.resourcesProvider);
        if (MessageObject.isTextColorEmoji(document)) {
            twoLineLottieLayout.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
        }
        twoLineLottieLayout.setAnimation(document, 36, 36, new String[0]);
        twoLineLottieLayout.titleTextView.setText(charSequence);
        twoLineLottieLayout.subtitleTextView.setText(charSequence2);
        twoLineLottieLayout.setButton(new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(charSequence3).setUndoAction(runnable));
        return create(twoLineLottieLayout, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public Bulletin createSimpleBulletin(TLRPC.Photo photo, CharSequence charSequence) {
        if (photo == null) {
            return new Bulletin.EmptyBulletin();
        }
        Bulletin.TwoLineLayout twoLineLayout = new Bulletin.TwoLineLayout(getContext(), this.resourcesProvider);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(28.0f), true, null, false);
        twoLineLayout.imageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), photo), "28_28", ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "28_28", (String) null, 0L, 0, (Object) null);
        twoLineLayout.imageView.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        twoLineLayout.titleTextView.setText(charSequence);
        twoLineLayout.titleTextView.setSingleLine(true);
        twoLineLayout.titleTextView.setTextSize(1, 15.0f);
        twoLineLayout.titleTextView.setMaxLines(1);
        twoLineLayout.subtitleTextView.setVisibility(8);
        return create(twoLineLayout, charSequence.length() < 20 ? 1500 : 2750);
    }

    public Bulletin createEmojiBulletin(TLRPC.Document document, CharSequence charSequence, CharSequence charSequence2, Runnable runnable) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        if (MessageObject.isTextColorEmoji(document)) {
            lottieLayout.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
        }
        lottieLayout.setAnimation(document, 36, 36, new String[0]);
        if (lottieLayout.imageView.getImageReceiver() != null) {
            lottieLayout.imageView.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setTextSize(1, 14.0f);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        lottieLayout.setButton(new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(charSequence2).setUndoAction(runnable));
        return create(lottieLayout, 2750);
    }

    public Bulletin createSimpleBulletin(int i, CharSequence charSequence, int i2) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setAnimation(i, 36, 36, new String[0]);
        if (charSequence != null) {
            String string = charSequence.toString();
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            int i3 = 0;
            for (int iIndexOf = string.indexOf(10); iIndexOf >= 0 && iIndexOf < charSequence.length(); iIndexOf = string.indexOf(10, iIndexOf + 1)) {
                if (i3 >= i2) {
                    spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) " ");
                }
                i3++;
            }
            charSequence = spannableStringBuilder;
        }
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(i2);
        lottieLayout.textView.setText(charSequence);
        return create(lottieLayout, charSequence.length() < 20 ? 1500 : 2750);
    }

    public Bulletin createSimpleBulletin(int i, CharSequence charSequence, int i2, int i3) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setAnimation(i, 36, 36, new String[0]);
        if (charSequence != null) {
            String string = charSequence.toString();
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            int i4 = 0;
            for (int iIndexOf = string.indexOf(10); iIndexOf >= 0 && iIndexOf < charSequence.length(); iIndexOf = string.indexOf(10, iIndexOf + 1)) {
                if (i4 >= i2) {
                    spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) " ");
                }
                i4++;
            }
            charSequence = spannableStringBuilder;
        }
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(i2);
        return create(lottieLayout, i3);
    }

    public Bulletin createSimpleBulletin(int i, CharSequence charSequence, CharSequence charSequence2) {
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), this.resourcesProvider);
        twoLineLottieLayout.setAnimation(i, 36, 36, new String[0]);
        twoLineLottieLayout.titleTextView.setText(charSequence);
        twoLineLottieLayout.subtitleTextView.setText(charSequence2);
        return create(twoLineLottieLayout, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public Bulletin createSimpleBulletin(int i, CharSequence charSequence, CharSequence charSequence2, Runnable runnable) {
        return createSimpleBulletin(i, charSequence, charSequence2, charSequence.length() < 20 ? 1500 : 2750, runnable);
    }

    public Bulletin createSimpleBulletin(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Runnable runnable) {
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), this.resourcesProvider);
        twoLineLottieLayout.setAnimation(i, 36, 36, new String[0]);
        twoLineLottieLayout.titleTextView.setText(charSequence);
        twoLineLottieLayout.subtitleTextView.setText(charSequence2);
        twoLineLottieLayout.setButton(new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(charSequence3).setUndoAction(runnable));
        return create(twoLineLottieLayout, 5000);
    }

    public Bulletin createSimpleBulletin(int i, CharSequence charSequence, CharSequence charSequence2, int i2, Runnable runnable) {
        return createSimpleBulletin(i, charSequence, charSequence2, i2, false, runnable);
    }

    public Bulletin createSimpleBulletin(int i, CharSequence charSequence, CharSequence charSequence2, int i2, boolean z, Runnable runnable) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        if (i != 0) {
            lottieLayout.setAnimation(i, 36, 36, new String[0]);
        } else {
            lottieLayout.imageView.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) lottieLayout.textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        lottieLayout.textView.setTextSize(1, 14.0f);
        lottieLayout.textView.setTextDirection(5);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.setButton(new Bulletin.UndoButton(getContext(), true, z, this.resourcesProvider).setText(charSequence2).setUndoAction(runnable));
        return create(lottieLayout, i2);
    }

    public Bulletin createSimpleBulletin(Drawable drawable, CharSequence charSequence, String str, Runnable runnable) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.imageView.setImageDrawable(drawable);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        lottieLayout.setButton(new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(str).setUndoAction(runnable));
        return create(lottieLayout, 2750);
    }

    public Bulletin createSimpleBulletin(Drawable drawable, CharSequence charSequence) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.imageView.setImageDrawable(drawable);
        if (drawable instanceof PeerColorActivity.PeerColorDrawable) {
            ((PeerColorActivity.PeerColorDrawable) drawable).setView(lottieLayout.imageView);
        }
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        return create(lottieLayout, 2750);
    }

    public Bulletin createSimpleBulletin(Drawable drawable, CharSequence charSequence, CharSequence charSequence2) {
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), this.resourcesProvider);
        twoLineLottieLayout.imageView.setImageDrawable(drawable);
        twoLineLottieLayout.titleTextView.setText(charSequence);
        twoLineLottieLayout.subtitleTextView.setText(charSequence2);
        return create(twoLineLottieLayout, 2750);
    }

    public Bulletin createSimpleBulletin(CharSequence charSequence, CharSequence charSequence2) {
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), this.resourcesProvider);
        twoLineLottieLayout.hideImage();
        twoLineLottieLayout.titleTextView.setText(charSequence);
        twoLineLottieLayout.subtitleTextView.setText(charSequence2);
        return create(twoLineLottieLayout, 5000);
    }

    public Bulletin createSimpleBulletin(Drawable drawable, CharSequence charSequence, CharSequence charSequence2, String str, Runnable runnable) {
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), this.resourcesProvider);
        twoLineLottieLayout.imageView.setImageDrawable(drawable);
        twoLineLottieLayout.titleTextView.setText(charSequence);
        twoLineLottieLayout.subtitleTextView.setText(charSequence2);
        twoLineLottieLayout.setButton(new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(str).setUndoAction(runnable));
        return create(twoLineLottieLayout, 2750);
    }

    public Bulletin createSimpleBulletin(CharSequence charSequence, CharSequence charSequence2, String str, Runnable runnable) {
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), this.resourcesProvider);
        twoLineLottieLayout.hideImage();
        twoLineLottieLayout.titleTextView.setText(charSequence);
        twoLineLottieLayout.subtitleTextView.setText(charSequence2);
        twoLineLottieLayout.setButton(new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(str).setUndoAction(runnable));
        return create(twoLineLottieLayout, 5000);
    }
}
