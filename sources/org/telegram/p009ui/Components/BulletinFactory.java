package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.Bulletin;
import org.telegram.p009ui.PremiumPreviewFragment;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$User;

public final class BulletinFactory {
    private final FrameLayout containerLayout;
    private final BaseFragment fragment;
    private final Theme.ResourcesProvider resourcesProvider;

    public static BulletinFactory m13of(BaseFragment baseFragment) {
        return new BulletinFactory(baseFragment);
    }

    public static BulletinFactory m14of(FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider) {
        return new BulletinFactory(frameLayout, resourcesProvider);
    }

    public static boolean canShowBulletin(BaseFragment baseFragment) {
        return (baseFragment == null || baseFragment.getParentActivity() == null || baseFragment.getLayoutContainer() == null) ? false : true;
    }

    public static final class FileType {
        private static final FileType[] $VALUES;
        public static final FileType AUDIO;
        public static final FileType AUDIOS;
        public static final FileType GIF;
        public static final FileType GIF_TO_DOWNLOADS;
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

        public static FileType valueOf(String str) {
            return (FileType) Enum.valueOf(FileType.class, str);
        }

        public static FileType[] values() {
            return (FileType[]) $VALUES.clone();
        }

        static {
            int i = C1072R.string.PhotoSavedHint;
            Icon icon = Icon.SAVED_TO_GALLERY;
            FileType fileType = new FileType("PHOTO", 0, "PhotoSavedHint", i, icon);
            PHOTO = fileType;
            FileType fileType2 = new FileType("PHOTOS", 1, "PhotosSavedHint", icon);
            PHOTOS = fileType2;
            FileType fileType3 = new FileType("VIDEO", 2, "VideoSavedHint", C1072R.string.VideoSavedHint, icon);
            VIDEO = fileType3;
            FileType fileType4 = new FileType("VIDEOS", 3, "VideosSavedHint", icon);
            VIDEOS = fileType4;
            FileType fileType5 = new FileType("MEDIA", 4, "MediaSavedHint", icon);
            MEDIA = fileType5;
            int i2 = C1072R.string.PhotoSavedToDownloadsHint;
            Icon icon2 = Icon.SAVED_TO_DOWNLOADS;
            FileType fileType6 = new FileType("PHOTO_TO_DOWNLOADS", 5, "PhotoSavedToDownloadsHint", i2, icon2);
            PHOTO_TO_DOWNLOADS = fileType6;
            FileType fileType7 = new FileType("VIDEO_TO_DOWNLOADS", 6, "VideoSavedToDownloadsHint", C1072R.string.VideoSavedToDownloadsHint, icon2);
            VIDEO_TO_DOWNLOADS = fileType7;
            FileType fileType8 = new FileType("GIF", 7, "GifSavedHint", C1072R.string.GifSavedHint, Icon.SAVED_TO_GIFS);
            GIF = fileType8;
            FileType fileType9 = new FileType("GIF_TO_DOWNLOADS", 8, "GifSavedToDownloadsHint", C1072R.string.GifSavedToDownloadsHint, icon2);
            GIF_TO_DOWNLOADS = fileType9;
            int i3 = C1072R.string.AudioSavedHint;
            Icon icon3 = Icon.SAVED_TO_MUSIC;
            FileType fileType10 = new FileType("AUDIO", 9, "AudioSavedHint", i3, icon3);
            AUDIO = fileType10;
            FileType fileType11 = new FileType("AUDIOS", 10, "AudiosSavedHint", icon3);
            AUDIOS = fileType11;
            FileType fileType12 = new FileType("UNKNOWN", 11, "FileSavedHint", C1072R.string.FileSavedHint, icon2);
            UNKNOWN = fileType12;
            FileType fileType13 = new FileType("UNKNOWNS", 12, "FilesSavedHint", icon2);
            UNKNOWNS = fileType13;
            $VALUES = new FileType[]{fileType, fileType2, fileType3, fileType4, fileType5, fileType6, fileType7, fileType8, fileType9, fileType10, fileType11, fileType12, fileType13};
        }

        private FileType(String str, int i, String str2, int i2, Icon icon) {
            this.localeKey = str2;
            this.localeRes = i2;
            this.icon = icon;
            this.plural = false;
        }

        private FileType(String str, int i, String str2, Icon icon) {
            this.localeKey = str2;
            this.icon = icon;
            this.localeRes = 0;
            this.plural = true;
        }

        public String getText(int i) {
            if (this.plural) {
                return LocaleController.formatPluralString(this.localeKey, i, new Object[0]);
            }
            return LocaleController.getString(this.localeKey, this.localeRes);
        }

        public enum Icon {
            SAVED_TO_DOWNLOADS(C1072R.raw.ic_download, 2, "Box", "Arrow"),
            SAVED_TO_GALLERY(C1072R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
            SAVED_TO_MUSIC(C1072R.raw.ic_save_to_music, 2, "Box", "Arrow"),
            SAVED_TO_GIFS(C1072R.raw.ic_save_to_gifs, 0, "gif");
            
            private final String[] layers;
            private final int paddingBottom;
            private final int resId;

            Icon(int i, int i2, String... strArr) {
                this.resId = i;
                this.paddingBottom = i2;
                this.layers = strArr;
            }
        }
    }

    private BulletinFactory(BaseFragment baseFragment) {
        this.fragment = baseFragment;
        this.containerLayout = null;
        this.resourcesProvider = baseFragment != null ? baseFragment.getResourceProvider() : null;
    }

    private BulletinFactory(FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider) {
        this.containerLayout = frameLayout;
        this.fragment = null;
        this.resourcesProvider = resourcesProvider;
    }

    public Bulletin createSimpleBulletin(int i, CharSequence charSequence) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setAnimation(i, 36, 36, new String[0]);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        return create(lottieLayout, charSequence.length() < 20 ? 1500 : 2750);
    }

    public Bulletin createSimpleBulletin(int i, CharSequence charSequence, CharSequence charSequence2) {
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), this.resourcesProvider);
        twoLineLottieLayout.setAnimation(i, 36, 36, new String[0]);
        twoLineLottieLayout.titleTextView.setText(charSequence);
        twoLineLottieLayout.subtitleTextView.setText(charSequence2);
        return create(twoLineLottieLayout, charSequence.length() + charSequence2.length() < 20 ? 1500 : 2750);
    }

    public Bulletin createSimpleBulletin(int i, CharSequence charSequence, CharSequence charSequence2, Runnable runnable) {
        return createSimpleBulletin(i, charSequence, charSequence2, charSequence.length() < 20 ? 1500 : 2750, runnable);
    }

    public Bulletin createSimpleBulletin(int i, CharSequence charSequence, CharSequence charSequence2, int i2, Runnable runnable) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setAnimation(i, 36, 36, new String[0]);
        lottieLayout.textView.setTextSize(1, 14.0f);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.setButton(new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(charSequence2).setUndoAction(runnable));
        return create(lottieLayout, i2);
    }

    public Bulletin createUndoBulletin(CharSequence charSequence, Runnable runnable, Runnable runnable2) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        lottieLayout.setTimer();
        lottieLayout.setButton(new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(LocaleController.getString("Undo", C1072R.string.Undo)).setUndoAction(runnable).setDelayedAction(runnable2));
        return create(lottieLayout, 5000);
    }

    public Bulletin createUsersBulletin(List<TLRPC$User> list, CharSequence charSequence) {
        return createUsersBulletin(list, charSequence, null);
    }

    public Bulletin createUsersBulletin(List<TLRPC$User> list, CharSequence charSequence, CharSequence charSequence2) {
        int i;
        Bulletin.UsersLayout usersLayout = new Bulletin.UsersLayout(getContext(), charSequence2 != null, this.resourcesProvider);
        if (list != null) {
            i = 0;
            for (int i2 = 0; i2 < list.size() && i < 3; i2++) {
                TLRPC$User tLRPC$User = list.get(i2);
                if (tLRPC$User != null) {
                    i++;
                    usersLayout.avatarsImageView.setCount(i);
                    usersLayout.avatarsImageView.setObject(i - 1, UserConfig.selectedAccount, tLRPC$User);
                }
            }
            if (list.size() == 1) {
                usersLayout.avatarsImageView.setTranslationX(AndroidUtilities.m35dp(4.0f));
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
                int m35dp = AndroidUtilities.m35dp(70 - ((3 - i) * 12));
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) usersLayout.linearLayout.getLayoutParams()).rightMargin = m35dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) usersLayout.linearLayout.getLayoutParams()).leftMargin = m35dp;
                }
            }
        } else {
            usersLayout.textView.setSingleLine(false);
            usersLayout.textView.setMaxLines(2);
            usersLayout.textView.setText(charSequence);
            if (usersLayout.textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int m35dp2 = AndroidUtilities.m35dp(70 - ((3 - i) * 12));
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) usersLayout.textView.getLayoutParams()).rightMargin = m35dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) usersLayout.textView.getLayoutParams()).leftMargin = m35dp2;
                }
            }
        }
        return create(usersLayout, 5000);
    }

    public Bulletin createUsersAddedBulletin(ArrayList<TLRPC$User> arrayList, TLRPC$Chat tLRPC$Chat) {
        SpannableStringBuilder spannableStringBuilder;
        if (arrayList == null || arrayList.size() == 0) {
            spannableStringBuilder = null;
        } else if (arrayList.size() == 1) {
            if (ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat)) {
                int i = C1072R.string.HasBeenAddedToChannel;
                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToChannel", i, "**" + UserObject.getFirstName(arrayList.get(0)) + "**"));
            } else {
                int i2 = C1072R.string.HasBeenAddedToGroup;
                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToGroup", i2, "**" + UserObject.getFirstName(arrayList.get(0)) + "**"));
            }
        } else if (ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat)) {
            spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedMembersToChannel", arrayList.size(), new Object[0]));
        } else {
            spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedMembersToGroup", arrayList.size(), new Object[0]));
        }
        return createUsersBulletin(arrayList, spannableStringBuilder);
    }

    public Bulletin createEmojiBulletin(TLRPC$Document tLRPC$Document, CharSequence charSequence, CharSequence charSequence2, Runnable runnable) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        if (MessageObject.isTextColorEmoji(tLRPC$Document)) {
            lottieLayout.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("undo_infoColor"), PorterDuff.Mode.SRC_IN));
        }
        lottieLayout.setAnimation(tLRPC$Document, 36, 36, new String[0]);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setTextSize(1, 14.0f);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        lottieLayout.setButton(new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(charSequence2).setUndoAction(runnable));
        return create(lottieLayout, 2750);
    }

    public Bulletin createEmojiLoadingBulletin(TLRPC$Document tLRPC$Document, CharSequence charSequence, CharSequence charSequence2, Runnable runnable) {
        Bulletin.LoadingLottieLayout loadingLottieLayout = new Bulletin.LoadingLottieLayout(getContext(), this.resourcesProvider);
        if (MessageObject.isTextColorEmoji(tLRPC$Document)) {
            loadingLottieLayout.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("undo_infoColor"), PorterDuff.Mode.SRC_IN));
        }
        loadingLottieLayout.setAnimation(tLRPC$Document, 36, 36, new String[0]);
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

    public Bulletin createContainsEmojiBulletin(TLRPC$Document tLRPC$Document, final boolean z, final Utilities.Callback<TLRPC$InputStickerSet> callback) {
        SpannableStringBuilder spannableStringBuilder;
        TLRPC$StickerSet tLRPC$StickerSet;
        final TLRPC$InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(tLRPC$Document);
        LoadingSpan loadingSpan = null;
        if (inputStickerSet == null) {
            return null;
        }
        TLRPC$TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        if (stickerSet == null || (tLRPC$StickerSet = stickerSet.set) == null) {
            if (z) {
                spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", C1072R.string.TopicContainsEmojiPackSingle, "<{LOADING}>")));
            } else {
                spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", C1072R.string.MessageContainsEmojiPackSingle, "<{LOADING}>")));
            }
            int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
            if (indexOf >= 0) {
                LoadingSpan loadingSpan2 = new LoadingSpan(null, AndroidUtilities.m35dp(100.0f));
                spannableStringBuilder.setSpan(loadingSpan2, indexOf, indexOf + 11, 33);
                loadingSpan2.setColors(ColorUtils.setAlphaComponent(Theme.getColor("undo_infoColor", this.resourcesProvider), 32), ColorUtils.setAlphaComponent(Theme.getColor("undo_infoColor", this.resourcesProvider), 72));
                loadingSpan = loadingSpan2;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            final Bulletin show = createEmojiLoadingBulletin(tLRPC$Document, spannableStringBuilder, LocaleController.getString("ViewAction", C1072R.string.ViewAction), new Runnable() {
                @Override
                public final void run() {
                    Utilities.Callback.this.run(inputStickerSet);
                }
            }).show();
            if (loadingSpan != null && (show.getLayout() instanceof Bulletin.LoadingLottieLayout)) {
                loadingSpan.setView(((Bulletin.LoadingLottieLayout) show.getLayout()).textLoadingView);
            }
            MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, false, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    BulletinFactory.lambda$createContainsEmojiBulletin$2(z, show, currentTimeMillis, (TLRPC$TL_messages_stickerSet) obj);
                }
            });
            return show;
        }
        return createEmojiBulletin(tLRPC$Document, z ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", C1072R.string.TopicContainsEmojiPackSingle, tLRPC$StickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", C1072R.string.MessageContainsEmojiPackSingle, tLRPC$StickerSet.title)), LocaleController.getString("ViewAction", C1072R.string.ViewAction), new Runnable() {
            @Override
            public final void run() {
                Utilities.Callback.this.run(inputStickerSet);
            }
        });
    }

    public static void lambda$createContainsEmojiBulletin$2(boolean z, final Bulletin bulletin, long j, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        final CharSequence string;
        TLRPC$StickerSet tLRPC$StickerSet;
        if (tLRPC$TL_messages_stickerSet == null || (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set) == null) {
            string = LocaleController.getString("AddEmojiNotFound", C1072R.string.AddEmojiNotFound);
        } else {
            string = z ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", C1072R.string.TopicContainsEmojiPackSingle, tLRPC$StickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", C1072R.string.MessageContainsEmojiPackSingle, tLRPC$StickerSet.title));
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Bulletin.this.onLoaded(string);
            }
        }, Math.max(1L, 750 - (System.currentTimeMillis() - j)));
    }

    public Bulletin createDownloadBulletin(FileType fileType) {
        return createDownloadBulletin(fileType, this.resourcesProvider);
    }

    public Bulletin createDownloadBulletin(FileType fileType, Theme.ResourcesProvider resourcesProvider) {
        return createDownloadBulletin(fileType, 1, resourcesProvider);
    }

    public Bulletin createDownloadBulletin(FileType fileType, int i, Theme.ResourcesProvider resourcesProvider) {
        return createDownloadBulletin(fileType, i, 0, 0, resourcesProvider);
    }

    public Bulletin createReportSent(Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
        lottieLayout.setAnimation(C1072R.raw.chats_infotip, new String[0]);
        lottieLayout.textView.setText(LocaleController.getString("ReportChatSent", C1072R.string.ReportChatSent));
        return create(lottieLayout, 1500);
    }

    public Bulletin createDownloadBulletin(FileType fileType, int i, int i2, int i3) {
        return createDownloadBulletin(fileType, i, i2, i3, null);
    }

    public Bulletin createDownloadBulletin(FileType fileType, int i, int i2, int i3, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout;
        if (i2 != 0 && i3 != 0) {
            lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider, i2, i3);
        } else {
            lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
        }
        lottieLayout.setAnimation(fileType.icon.resId, fileType.icon.layers);
        lottieLayout.textView.setText(fileType.getText(i));
        if (fileType.icon.paddingBottom != 0) {
            lottieLayout.setIconPaddingBottom(fileType.icon.paddingBottom);
        }
        return create(lottieLayout, 1500);
    }

    public Bulletin createErrorBulletin(CharSequence charSequence) {
        return createErrorBulletin(charSequence, null);
    }

    public Bulletin createErrorBulletin(CharSequence charSequence, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
        lottieLayout.setAnimation(C1072R.raw.chats_infotip, new String[0]);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        return create(lottieLayout, 1500);
    }

    public Bulletin createCaptionLimitBulletin(int i, final Runnable runnable) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), null);
        lottieLayout.setAnimation(C1072R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i2 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i2);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i2, indexOf2));
        valueOf.setSpan(new ClickableSpan(this) {
            @Override
            public void onClick(View view) {
                runnable.run();
            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        }, indexOf, indexOf2 - 1, 33);
        lottieLayout.textView.setText(valueOf);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        return create(lottieLayout, 5000);
    }

    public Bulletin createRestrictVoiceMessagesPremiumBulletin() {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), null);
        lottieLayout.setAnimation(C1072R.raw.voip_muted, new String[0]);
        String string = LocaleController.getString(C1072R.string.PrivacyVoiceMessagesPremiumOnly);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
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
        }, indexOf, lastIndexOf - 1, 33);
        lottieLayout.textView.setText(spannableStringBuilder);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        return create(lottieLayout, 2750);
    }

    public Bulletin createErrorBulletinSubtitle(CharSequence charSequence, CharSequence charSequence2, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), resourcesProvider);
        twoLineLottieLayout.setAnimation(C1072R.raw.chats_infotip, new String[0]);
        twoLineLottieLayout.titleTextView.setText(charSequence);
        twoLineLottieLayout.subtitleTextView.setText(charSequence2);
        return create(twoLineLottieLayout, 1500);
    }

    public Bulletin createCopyLinkBulletin() {
        return createCopyLinkBulletin(false, this.resourcesProvider);
    }

    public Bulletin createCopyBulletin(String str) {
        return createCopyBulletin(str, null);
    }

    public Bulletin createCopyBulletin(String str, Theme.ResourcesProvider resourcesProvider) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new Bulletin.EmptyBulletin();
        }
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), null);
        lottieLayout.setAnimation(C1072R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        lottieLayout.textView.setText(str);
        return create(lottieLayout, 1500);
    }

    public Bulletin createCopyLinkBulletin(boolean z, Theme.ResourcesProvider resourcesProvider) {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            if (z) {
                Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), resourcesProvider);
                twoLineLottieLayout.setAnimation(C1072R.raw.voip_invite, 36, 36, "Wibe", "Circle");
                twoLineLottieLayout.titleTextView.setText(LocaleController.getString("LinkCopied", C1072R.string.LinkCopied));
                twoLineLottieLayout.subtitleTextView.setText(LocaleController.getString("LinkCopiedPrivateInfo", C1072R.string.LinkCopiedPrivateInfo));
                return create(twoLineLottieLayout, 2750);
            }
            Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
            lottieLayout.setAnimation(C1072R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            lottieLayout.textView.setText(LocaleController.getString("LinkCopied", C1072R.string.LinkCopied));
            return create(lottieLayout, 1500);
        }
        return new Bulletin.EmptyBulletin();
    }

    public Bulletin createCopyLinkBulletin(String str, Theme.ResourcesProvider resourcesProvider) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new Bulletin.EmptyBulletin();
        }
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
        lottieLayout.setAnimation(C1072R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        lottieLayout.textView.setText(str);
        return create(lottieLayout, 1500);
    }

    private Bulletin create(Bulletin.Layout layout, int i) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment != null) {
            return Bulletin.make(baseFragment, layout, i);
        }
        return Bulletin.make(this.containerLayout, layout, i);
    }

    private Context getContext() {
        BaseFragment baseFragment = this.fragment;
        return baseFragment != null ? baseFragment.getParentActivity() : this.containerLayout.getContext();
    }

    public static Bulletin createMuteBulletin(BaseFragment baseFragment, int i) {
        return createMuteBulletin(baseFragment, i, 0, null);
    }

    public static org.telegram.p009ui.Components.Bulletin createMuteBulletin(org.telegram.p009ui.ActionBar.BaseFragment r6, int r7, int r8, org.telegram.p009ui.ActionBar.Theme.ResourcesProvider r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.BulletinFactory.createMuteBulletin(org.telegram.ui.ActionBar.BaseFragment, int, int, org.telegram.ui.ActionBar.Theme$ResourcesProvider):org.telegram.ui.Components.Bulletin");
    }

    public static Bulletin createMuteBulletin(BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        return createMuteBulletin(baseFragment, z ? 3 : 4, 0, resourcesProvider);
    }

    public static Bulletin createUnpinAllMessagesBulletin(BaseFragment baseFragment, int i, boolean z, Runnable runnable, Runnable runnable2, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout;
        if (baseFragment.getParentActivity() == null) {
            if (runnable2 != null) {
                runnable2.run();
                return null;
            }
            return null;
        }
        if (z) {
            Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(baseFragment.getParentActivity(), resourcesProvider);
            twoLineLottieLayout.setAnimation(C1072R.raw.ic_unpin, 28, 28, "Pin", "Line");
            twoLineLottieLayout.titleTextView.setText(LocaleController.getString("PinnedMessagesHidden", C1072R.string.PinnedMessagesHidden));
            twoLineLottieLayout.subtitleTextView.setText(LocaleController.getString("PinnedMessagesHiddenInfo", C1072R.string.PinnedMessagesHiddenInfo));
            lottieLayout = twoLineLottieLayout;
        } else {
            Bulletin.LottieLayout lottieLayout2 = new Bulletin.LottieLayout(baseFragment.getParentActivity(), resourcesProvider);
            lottieLayout2.setAnimation(C1072R.raw.ic_unpin, 28, 28, "Pin", "Line");
            lottieLayout2.textView.setText(LocaleController.formatPluralString("MessagesUnpinned", i, new Object[0]));
            lottieLayout = lottieLayout2;
        }
        lottieLayout.setButton(new Bulletin.UndoButton(baseFragment.getParentActivity(), true, resourcesProvider).setUndoAction(runnable).setDelayedAction(runnable2));
        return Bulletin.make(baseFragment, lottieLayout, 5000);
    }

    public static Bulletin createSaveToGalleryBulletin(BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        return m13of(baseFragment).createDownloadBulletin(z ? FileType.VIDEO : FileType.PHOTO, resourcesProvider);
    }

    public static Bulletin createSaveToGalleryBulletin(FrameLayout frameLayout, boolean z, int i, int i2) {
        return m14of(frameLayout, null).createDownloadBulletin(z ? FileType.VIDEO : FileType.PHOTO, 1, i, i2);
    }

    public static Bulletin createSaveToGalleryBulletin(FrameLayout frameLayout, int i, boolean z, int i2, int i3) {
        return m14of(frameLayout, null).createDownloadBulletin(z ? i > 1 ? FileType.VIDEOS : FileType.VIDEO : i > 1 ? FileType.PHOTOS : FileType.PHOTO, i, i2, i3);
    }

    public static Bulletin createPromoteToAdminBulletin(BaseFragment baseFragment, String str) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        lottieLayout.setAnimation(C1072R.raw.ic_admin, "Shield");
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", C1072R.string.UserSetAsAdminHint, str)));
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static Bulletin createAddedAsAdminBulletin(BaseFragment baseFragment, String str) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        lottieLayout.setAnimation(C1072R.raw.ic_admin, "Shield");
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", C1072R.string.UserAddedAsAdminHint, str)));
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static org.telegram.p009ui.Components.Bulletin createInviteSentBulletin(android.content.Context r3, android.widget.FrameLayout r4, int r5, long r6, int r8, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.BulletinFactory.createInviteSentBulletin(android.content.Context, android.widget.FrameLayout, int, long, int, int, int):org.telegram.ui.Components.Bulletin");
    }

    public static org.telegram.p009ui.Components.Bulletin createForwardedBulletin(android.content.Context r4, android.widget.FrameLayout r5, int r6, long r7, int r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.BulletinFactory.createForwardedBulletin(android.content.Context, android.widget.FrameLayout, int, long, int, int, int):org.telegram.ui.Components.Bulletin");
    }

    public static Bulletin createRemoveFromChatBulletin(BaseFragment baseFragment, TLRPC$User tLRPC$User, String str) {
        String str2;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        lottieLayout.setAnimation(C1072R.raw.ic_ban, "Hand");
        if (tLRPC$User.deleted) {
            str2 = LocaleController.formatString("HiddenName", C1072R.string.HiddenName, new Object[0]);
        } else {
            str2 = tLRPC$User.first_name;
        }
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", C1072R.string.UserRemovedFromChatHint, str2, str)));
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static Bulletin createBanBulletin(BaseFragment baseFragment, boolean z) {
        String string;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        if (z) {
            lottieLayout.setAnimation(C1072R.raw.ic_ban, "Hand");
            string = LocaleController.getString("UserBlocked", C1072R.string.UserBlocked);
        } else {
            lottieLayout.setAnimation(C1072R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString("UserUnblocked", C1072R.string.UserUnblocked);
        }
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(string));
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static Bulletin createCopyLinkBulletin(BaseFragment baseFragment) {
        return m13of(baseFragment).createCopyLinkBulletin();
    }

    public static Bulletin createCopyLinkBulletin(FrameLayout frameLayout) {
        return m14of(frameLayout, null).createCopyLinkBulletin();
    }

    public static Bulletin createPinMessageBulletin(BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        return createPinMessageBulletin(baseFragment, true, null, null, resourcesProvider);
    }

    public static Bulletin createUnpinMessageBulletin(BaseFragment baseFragment, Runnable runnable, Runnable runnable2, Theme.ResourcesProvider resourcesProvider) {
        return createPinMessageBulletin(baseFragment, false, runnable, runnable2, resourcesProvider);
    }

    private static Bulletin createPinMessageBulletin(BaseFragment baseFragment, boolean z, Runnable runnable, Runnable runnable2, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), resourcesProvider);
        lottieLayout.setAnimation(z ? C1072R.raw.ic_pin : C1072R.raw.ic_unpin, 28, 28, "Pin", "Line");
        lottieLayout.textView.setText(LocaleController.getString(z ? "MessagePinnedHint" : "MessageUnpinnedHint", z ? C1072R.string.MessagePinnedHint : C1072R.string.MessageUnpinnedHint));
        if (!z) {
            lottieLayout.setButton(new Bulletin.UndoButton(baseFragment.getParentActivity(), true, resourcesProvider).setUndoAction(runnable).setDelayedAction(runnable2));
        }
        return Bulletin.make(baseFragment, lottieLayout, z ? 1500 : 5000);
    }

    public static Bulletin createSoundEnabledBulletin(BaseFragment baseFragment, int i, Theme.ResourcesProvider resourcesProvider) {
        String string;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), resourcesProvider);
        boolean z = true;
        if (i == 0) {
            string = LocaleController.getString("SoundOnHint", C1072R.string.SoundOnHint);
        } else if (i == 1) {
            string = LocaleController.getString("SoundOffHint", C1072R.string.SoundOffHint);
            z = false;
        } else {
            throw new IllegalArgumentException();
        }
        if (z) {
            lottieLayout.setAnimation(C1072R.raw.sound_on, new String[0]);
        } else {
            lottieLayout.setAnimation(C1072R.raw.sound_off, new String[0]);
        }
        lottieLayout.textView.setText(string);
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }
}
