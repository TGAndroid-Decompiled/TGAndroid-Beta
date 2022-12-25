package org.telegram.p009ui.Components;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.Bulletin;
import org.telegram.p009ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.p009ui.LaunchActivity;
import org.telegram.p009ui.PremiumPreviewFragment;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;

@SuppressLint({"ViewConstructor"})
public class StickerSetBulletinLayout extends Bulletin.TwoLineLayout {
    public StickerSetBulletinLayout(Context context, TLObject tLObject, int i) {
        this(context, tLObject, 1, i, null, null);
    }

    public StickerSetBulletinLayout(Context context, TLObject tLObject, int i, TLRPC$Document tLRPC$Document, Theme.ResourcesProvider resourcesProvider) {
        this(context, tLObject, 1, i, tLRPC$Document, resourcesProvider);
    }

    public StickerSetBulletinLayout(final Context context, TLObject tLObject, int i, int i2, TLRPC$Document tLRPC$Document, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        TLRPC$Document tLRPC$Document2;
        TLRPC$StickerSet tLRPC$StickerSet;
        int i3;
        ImageLocation forSticker;
        TLRPC$TL_messages_stickerSet stickerSet;
        boolean z = tLObject instanceof TLRPC$TL_messages_stickerSet;
        if (z) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
            tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set;
            ArrayList<TLRPC$Document> arrayList = tLRPC$TL_messages_stickerSet.documents;
            if (arrayList != null && !arrayList.isEmpty()) {
                tLRPC$Document2 = arrayList.get(0);
            }
            tLRPC$Document2 = null;
        } else if (tLObject instanceof TLRPC$StickerSetCovered) {
            TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) tLObject;
            tLRPC$StickerSet = tLRPC$StickerSetCovered.set;
            TLRPC$Document tLRPC$Document3 = tLRPC$StickerSetCovered.cover;
            if (tLRPC$Document3 != null) {
                tLRPC$Document2 = tLRPC$Document3;
            } else {
                if (!tLRPC$StickerSetCovered.covers.isEmpty()) {
                    tLRPC$Document2 = tLRPC$StickerSetCovered.covers.get(0);
                }
                tLRPC$Document2 = null;
            }
        } else if (tLRPC$Document == null && tLObject != null && BuildVars.DEBUG_VERSION) {
            throw new IllegalArgumentException("Invalid type of the given setObject: " + tLObject.getClass());
        } else {
            tLRPC$Document2 = tLRPC$Document;
            tLRPC$StickerSet = null;
        }
        if (tLRPC$StickerSet == null && tLRPC$Document2 != null && (stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(MessageObject.getInputStickerSet(tLRPC$Document2), true)) != null) {
            tLRPC$StickerSet = stickerSet.set;
        }
        TLRPC$StickerSet tLRPC$StickerSet2 = tLRPC$StickerSet;
        if (tLRPC$Document2 != null) {
            TLRPC$PhotoSize closestPhotoSizeWithSize = tLRPC$StickerSet2 != null ? FileLoader.getClosestPhotoSizeWithSize(tLRPC$StickerSet2.thumbs, 90) : null;
            closestPhotoSizeWithSize = closestPhotoSizeWithSize == null ? tLRPC$Document2 : closestPhotoSizeWithSize;
            boolean z2 = closestPhotoSizeWithSize instanceof TLRPC$Document;
            if (z2) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document2.thumbs, 90), tLRPC$Document2);
            } else {
                TLRPC$PhotoSize tLRPC$PhotoSize = closestPhotoSizeWithSize;
                if (tLObject instanceof TLRPC$StickerSetCovered) {
                    i3 = ((TLRPC$StickerSetCovered) tLObject).set.thumb_version;
                } else {
                    i3 = z ? ((TLRPC$TL_messages_stickerSet) tLObject).set.thumb_version : 0;
                }
                forSticker = ImageLocation.getForSticker(tLRPC$PhotoSize, tLRPC$Document2, i3);
            }
            ImageLocation imageLocation = forSticker;
            if ((z2 && MessageObject.isAnimatedStickerDocument(tLRPC$Document2, true)) || MessageObject.isVideoSticker(tLRPC$Document2) || MessageObject.isGifDocument(tLRPC$Document2)) {
                this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document2), "50_50", imageLocation, (String) null, 0, tLObject);
            } else if (imageLocation != null && imageLocation.imageType == 1) {
                this.imageView.setImage(imageLocation, "50_50", "tgs", (Drawable) null, tLObject);
            } else {
                this.imageView.setImage(imageLocation, "50_50", "webp", (Drawable) null, tLObject);
            }
        } else {
            this.imageView.setImage((ImageLocation) null, (String) null, "webp", (Drawable) null, tLObject);
        }
        switch (i2) {
            case 0:
                if (tLRPC$StickerSet2 != null) {
                    if (tLRPC$StickerSet2.masks) {
                        this.titleTextView.setText(LocaleController.getString("MasksRemoved", C1010R.string.MasksRemoved));
                        this.subtitleTextView.setText(LocaleController.formatString("MasksRemovedInfo", C1010R.string.MasksRemovedInfo, tLRPC$StickerSet2.title));
                        return;
                    } else if (tLRPC$StickerSet2.emojis) {
                        this.titleTextView.setText(LocaleController.getString("EmojiRemoved", C1010R.string.EmojiRemoved));
                        if (i > 1) {
                            this.subtitleTextView.setText(LocaleController.formatPluralString("EmojiRemovedMultipleInfo", i, new Object[0]));
                            return;
                        } else {
                            this.subtitleTextView.setText(LocaleController.formatString("EmojiRemovedInfo", C1010R.string.EmojiRemovedInfo, tLRPC$StickerSet2.title));
                            return;
                        }
                    } else {
                        this.titleTextView.setText(LocaleController.getString("StickersRemoved", C1010R.string.StickersRemoved));
                        this.subtitleTextView.setText(LocaleController.formatString("StickersRemovedInfo", C1010R.string.StickersRemovedInfo, tLRPC$StickerSet2.title));
                        return;
                    }
                }
                return;
            case 1:
                if (tLRPC$StickerSet2 != null) {
                    if (tLRPC$StickerSet2.masks) {
                        this.titleTextView.setText(LocaleController.getString("MasksArchived", C1010R.string.MasksArchived));
                        this.subtitleTextView.setText(LocaleController.formatString("MasksArchivedInfo", C1010R.string.MasksArchivedInfo, tLRPC$StickerSet2.title));
                        return;
                    }
                    this.titleTextView.setText(LocaleController.getString("StickersArchived", C1010R.string.StickersArchived));
                    this.subtitleTextView.setText(LocaleController.formatString("StickersArchivedInfo", C1010R.string.StickersArchivedInfo, tLRPC$StickerSet2.title));
                    return;
                }
                return;
            case 2:
                if (tLRPC$StickerSet2 != null) {
                    if (tLRPC$StickerSet2.masks) {
                        this.titleTextView.setText(LocaleController.getString("AddMasksInstalled", C1010R.string.AddMasksInstalled));
                        this.subtitleTextView.setText(LocaleController.formatString("AddMasksInstalledInfo", C1010R.string.AddMasksInstalledInfo, tLRPC$StickerSet2.title));
                        return;
                    } else if (tLRPC$StickerSet2.emojis) {
                        this.titleTextView.setText(LocaleController.getString("AddEmojiInstalled", C1010R.string.AddEmojiInstalled));
                        if (i > 1) {
                            this.subtitleTextView.setText(LocaleController.formatPluralString("AddEmojiMultipleInstalledInfo", i, new Object[0]));
                            return;
                        } else {
                            this.subtitleTextView.setText(LocaleController.formatString("AddEmojiInstalledInfo", C1010R.string.AddEmojiInstalledInfo, tLRPC$StickerSet2.title));
                            return;
                        }
                    } else {
                        this.titleTextView.setText(LocaleController.getString("AddStickersInstalled", C1010R.string.AddStickersInstalled));
                        this.subtitleTextView.setText(LocaleController.formatString("AddStickersInstalledInfo", C1010R.string.AddStickersInstalledInfo, tLRPC$StickerSet2.title));
                        return;
                    }
                }
                return;
            case 3:
                this.titleTextView.setText(LocaleController.getString("RemovedFromRecent", C1010R.string.RemovedFromRecent));
                this.subtitleTextView.setVisibility(8);
                return;
            case 4:
                this.titleTextView.setText(LocaleController.getString("RemovedFromFavorites", C1010R.string.RemovedFromFavorites));
                this.subtitleTextView.setVisibility(8);
                return;
            case 5:
                this.titleTextView.setText(LocaleController.getString("AddedToFavorites", C1010R.string.AddedToFavorites));
                this.subtitleTextView.setVisibility(8);
                return;
            case 6:
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && !MessagesController.getInstance(UserConfig.selectedAccount).premiumLocked) {
                    this.titleTextView.setText(LocaleController.formatString("LimitReachedFavoriteStickers", C1010R.string.LimitReachedFavoriteStickers, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitDefault)));
                    this.subtitleTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString("LimitReachedFavoriteStickersSubtitle", C1010R.string.LimitReachedFavoriteStickersSubtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitPremium)), new Runnable() {
                        @Override
                        public final void run() {
                            StickerSetBulletinLayout.lambda$new$0(context);
                        }
                    }));
                    return;
                }
                this.titleTextView.setText(LocaleController.formatString("LimitReachedFavoriteStickers", C1010R.string.LimitReachedFavoriteStickers, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitPremium)));
                this.subtitleTextView.setText(LocaleController.formatString("LimitReachedFavoriteStickersSubtitlePremium", C1010R.string.LimitReachedFavoriteStickersSubtitlePremium, new Object[0]));
                return;
            case 7:
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && !MessagesController.getInstance(UserConfig.selectedAccount).premiumLocked) {
                    this.titleTextView.setText(LocaleController.formatString("LimitReachedFavoriteGifs", C1010R.string.LimitReachedFavoriteGifs, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitDefault)));
                    this.subtitleTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString("LimitReachedFavoriteGifsSubtitle", C1010R.string.LimitReachedFavoriteGifsSubtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitPremium)), new Runnable() {
                        @Override
                        public final void run() {
                            StickerSetBulletinLayout.lambda$new$1(context);
                        }
                    }));
                    return;
                }
                this.titleTextView.setText(LocaleController.formatString("LimitReachedFavoriteGifs", C1010R.string.LimitReachedFavoriteGifs, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitPremium)));
                this.subtitleTextView.setText(LocaleController.formatString("LimitReachedFavoriteGifsSubtitlePremium", C1010R.string.LimitReachedFavoriteGifsSubtitlePremium, new Object[0]));
                return;
            default:
                return;
        }
    }

    public static void lambda$new$0(Context context) {
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity instanceof LaunchActivity) {
            ((LaunchActivity) findActivity).lambda$runLinkRequest$67(new PremiumPreviewFragment(LimitReachedBottomSheet.limitTypeToServerString(10)));
        }
    }

    public static void lambda$new$1(Context context) {
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity instanceof LaunchActivity) {
            ((LaunchActivity) findActivity).lambda$runLinkRequest$67(new PremiumPreviewFragment(LimitReachedBottomSheet.limitTypeToServerString(9)));
        }
    }
}
