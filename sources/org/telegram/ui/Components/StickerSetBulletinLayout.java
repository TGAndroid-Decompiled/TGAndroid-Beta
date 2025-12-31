package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

public class StickerSetBulletinLayout extends Bulletin.TwoLineLayout {
    public StickerSetBulletinLayout(Context context, TLObject tLObject, int i, TLRPC.Document document, Theme.ResourcesProvider resourcesProvider) {
        this(context, tLObject, 1, i, document, resourcesProvider);
    }

    public StickerSetBulletinLayout(final Context context, TLObject tLObject, int i, int i2, TLRPC.Document document, Theme.ResourcesProvider resourcesProvider) {
        TLRPC.Document document2;
        TLRPC.StickerSet stickerSet;
        TLRPC.Document document3;
        int i3;
        ImageLocation forSticker;
        TLRPC.TL_messages_stickerSet stickerSet2;
        super(context, resourcesProvider);
        boolean z = tLObject instanceof TLRPC.TL_messages_stickerSet;
        if (z) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            stickerSet = tL_messages_stickerSet.set;
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList == null || arrayList.isEmpty()) {
                document2 = null;
            } else {
                document3 = arrayList.get(0);
                document2 = document3;
            }
        } else if (tLObject instanceof TLRPC.StickerSetCovered) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) tLObject;
            stickerSet = stickerSetCovered.set;
            TLRPC.Document document4 = stickerSetCovered.cover;
            if (document4 != null) {
                document3 = document4;
            } else {
                document3 = !stickerSetCovered.covers.isEmpty() ? stickerSetCovered.covers.get(0) : null;
            }
            document2 = document3;
        } else {
            if (document == null && tLObject != null && BuildVars.DEBUG_VERSION) {
                throw new IllegalArgumentException("Invalid type of the given setObject: " + tLObject.getClass());
            }
            document2 = document;
            stickerSet = null;
        }
        if (stickerSet == null && document2 != null && (stickerSet2 = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(MessageObject.getInputStickerSet(document2), true)) != null) {
            stickerSet = stickerSet2.set;
        }
        TLRPC.StickerSet stickerSet3 = stickerSet;
        if (document2 != null) {
            TLObject closestPhotoSizeWithSize = stickerSet3 != null ? FileLoader.getClosestPhotoSizeWithSize(stickerSet3.thumbs, 90) : null;
            closestPhotoSizeWithSize = closestPhotoSizeWithSize == null ? document2 : closestPhotoSizeWithSize;
            boolean z2 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            if (z2) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 90), document2);
            } else {
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) closestPhotoSizeWithSize;
                if (tLObject instanceof TLRPC.StickerSetCovered) {
                    i3 = ((TLRPC.StickerSetCovered) tLObject).set.thumb_version;
                } else {
                    i3 = z ? ((TLRPC.TL_messages_stickerSet) tLObject).set.thumb_version : 0;
                }
                forSticker = ImageLocation.getForSticker(photoSize, document2, i3);
            }
            ImageLocation imageLocation = forSticker;
            if (z2 && (MessageObject.isAnimatedStickerDocument(document2, true) || MessageObject.isVideoSticker(document2) || MessageObject.isGifDocument(document2))) {
                this.imageView.setImage(ImageLocation.getForDocument(document2), "50_50", imageLocation, (String) null, 0, tLObject);
            } else if (imageLocation != null && imageLocation.imageType == 1) {
                this.imageView.setImage(imageLocation, "50_50", "tgs", (Drawable) null, tLObject);
            } else {
                this.imageView.setImage(imageLocation, "50_50", "webp", (Drawable) null, tLObject);
            }
        } else {
            this.imageView.setImage((ImageLocation) null, (String) null, "webp", (Drawable) null, tLObject);
        }
        if (MessageObject.isTextColorEmoji(document2)) {
            this.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        switch (i2) {
            case 0:
                if (stickerSet3 != null) {
                    if (stickerSet3.masks) {
                        this.titleTextView.setText(LocaleController.getString(R.string.MasksRemoved));
                        this.subtitleTextView.setText(LocaleController.formatString("MasksRemovedInfo", R.string.MasksRemovedInfo, stickerSet3.title));
                        return;
                    } else {
                        if (stickerSet3.emojis) {
                            this.titleTextView.setText(LocaleController.getString(R.string.EmojiRemoved));
                            if (i > 1) {
                                this.subtitleTextView.setText(LocaleController.formatPluralString("EmojiRemovedMultipleInfo", i, new Object[0]));
                                return;
                            } else {
                                this.subtitleTextView.setText(LocaleController.formatString("EmojiRemovedInfo", R.string.EmojiRemovedInfo, stickerSet3.title));
                                return;
                            }
                        }
                        this.titleTextView.setText(LocaleController.getString(R.string.StickersRemoved));
                        this.subtitleTextView.setText(LocaleController.formatString("StickersRemovedInfo", R.string.StickersRemovedInfo, stickerSet3.title));
                        return;
                    }
                }
                return;
            case 1:
                if (stickerSet3 != null) {
                    if (stickerSet3.masks) {
                        this.titleTextView.setText(LocaleController.getString(R.string.MasksArchived));
                        this.subtitleTextView.setText(LocaleController.formatString("MasksArchivedInfo", R.string.MasksArchivedInfo, stickerSet3.title));
                        return;
                    } else if (stickerSet3.emojis) {
                        this.titleTextView.setText(LocaleController.getString(R.string.EmojiArchived));
                        this.subtitleTextView.setText(LocaleController.formatString("EmojiArchivedInfo", R.string.EmojiArchivedInfo, stickerSet3.title));
                        return;
                    } else {
                        this.titleTextView.setText(LocaleController.getString(R.string.StickersArchived));
                        this.subtitleTextView.setText(LocaleController.formatString("StickersArchivedInfo", R.string.StickersArchivedInfo, stickerSet3.title));
                        return;
                    }
                }
                return;
            case 2:
                if (stickerSet3 != null) {
                    if (stickerSet3.masks) {
                        this.titleTextView.setText(LocaleController.getString(R.string.AddMasksInstalled));
                        this.subtitleTextView.setText(LocaleController.formatString("AddMasksInstalledInfo", R.string.AddMasksInstalledInfo, stickerSet3.title));
                        return;
                    } else {
                        if (stickerSet3.emojis) {
                            this.titleTextView.setText(LocaleController.getString(R.string.AddEmojiInstalled));
                            if (i > 1) {
                                this.subtitleTextView.setText(LocaleController.formatPluralString("AddEmojiMultipleInstalledInfo", i, new Object[0]));
                                return;
                            } else {
                                this.subtitleTextView.setText(LocaleController.formatString("AddEmojiInstalledInfo", R.string.AddEmojiInstalledInfo, stickerSet3.title));
                                return;
                            }
                        }
                        this.titleTextView.setText(LocaleController.getString(R.string.AddStickersInstalled));
                        this.subtitleTextView.setText(LocaleController.formatString("AddStickersInstalledInfo", R.string.AddStickersInstalledInfo, stickerSet3.title));
                        return;
                    }
                }
                return;
            case 3:
                this.titleTextView.setText(LocaleController.getString(R.string.RemovedFromRecent));
                this.subtitleTextView.setVisibility(8);
                return;
            case 4:
                this.titleTextView.setText(LocaleController.getString(R.string.RemovedFromFavorites));
                this.subtitleTextView.setVisibility(8);
                return;
            case 5:
                this.titleTextView.setText(LocaleController.getString(R.string.AddedToFavorites));
                this.subtitleTextView.setVisibility(8);
                return;
            case 6:
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && !MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
                    this.titleTextView.setText(LocaleController.formatString("LimitReachedFavoriteStickers", R.string.LimitReachedFavoriteStickers, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitDefault)));
                    this.subtitleTextView.setText(AndroidUtilities.premiumText(LocaleController.formatString("LimitReachedFavoriteStickersSubtitle", R.string.LimitReachedFavoriteStickersSubtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitPremium)), new Runnable() {
                        @Override
                        public final void run() {
                            StickerSetBulletinLayout.lambda$new$0(context);
                        }
                    }));
                    return;
                } else {
                    this.titleTextView.setText(LocaleController.formatString("LimitReachedFavoriteStickers", R.string.LimitReachedFavoriteStickers, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitPremium)));
                    this.subtitleTextView.setText(LocaleController.formatString("LimitReachedFavoriteStickersSubtitlePremium", R.string.LimitReachedFavoriteStickersSubtitlePremium, new Object[0]));
                    return;
                }
            case 7:
                boolean zIsPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
                if (!MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && !zIsPremium) {
                    this.titleTextView.setText(LocaleController.formatString(R.string.LimitReachedFavoriteGifs, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitDefault)));
                    this.subtitleTextView.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.LimitReachedFavoriteGifsSubtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitPremium)), new Runnable() {
                        @Override
                        public final void run() {
                            StickerSetBulletinLayout.lambda$new$1(context);
                        }
                    }));
                    return;
                } else {
                    this.titleTextView.setText(LocaleController.formatString(R.string.LimitReachedFavoriteGifs, Integer.valueOf(zIsPremium ? MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitPremium : MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitDefault)));
                    this.subtitleTextView.setText(LocaleController.getString(R.string.LimitReachedFavoriteGifsSubtitlePremium));
                    return;
                }
            default:
                return;
        }
    }

    public static void lambda$new$0(Context context) {
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        if (activityFindActivity instanceof LaunchActivity) {
            ((LaunchActivity) activityFindActivity).lambda$runLinkRequest$98(new PremiumPreviewFragment(LimitReachedBottomSheet.limitTypeToServerString(10)));
        }
    }

    public static void lambda$new$1(Context context) {
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        if (activityFindActivity instanceof LaunchActivity) {
            ((LaunchActivity) activityFindActivity).lambda$runLinkRequest$98(new PremiumPreviewFragment(LimitReachedBottomSheet.limitTypeToServerString(9)));
        }
    }
}
