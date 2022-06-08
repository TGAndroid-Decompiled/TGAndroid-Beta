package org.telegram.ui.Components;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

@SuppressLint({"ViewConstructor"})
public class StickerSetBulletinLayout extends Bulletin.TwoLineLayout {
    public StickerSetBulletinLayout(Context context, TLObject tLObject, int i) {
        this(context, tLObject, i, null, null);
    }

    public StickerSetBulletinLayout(final Context context, TLObject tLObject, int i, TLRPC$Document tLRPC$Document, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        TLRPC$StickerSet tLRPC$StickerSet;
        TLRPC$Document tLRPC$Document2;
        int i2;
        ImageLocation forSticker;
        TLRPC$StickerSet tLRPC$StickerSet2;
        boolean z = tLObject instanceof TLRPC$TL_messages_stickerSet;
        TLRPC$PhotoSize tLRPC$PhotoSize = null;
        if (z) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
            tLRPC$StickerSet2 = tLRPC$TL_messages_stickerSet.set;
            ArrayList<TLRPC$Document> arrayList = tLRPC$TL_messages_stickerSet.documents;
            if (arrayList != null && !arrayList.isEmpty()) {
                tLRPC$Document2 = arrayList.get(0);
                tLRPC$StickerSet = tLRPC$StickerSet2;
            }
            tLRPC$Document2 = null;
            tLRPC$StickerSet = tLRPC$StickerSet2;
        } else if (tLObject instanceof TLRPC$StickerSetCovered) {
            TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) tLObject;
            tLRPC$StickerSet2 = tLRPC$StickerSetCovered.set;
            TLRPC$Document tLRPC$Document3 = tLRPC$StickerSetCovered.cover;
            if (tLRPC$Document3 != null) {
                tLRPC$Document2 = tLRPC$Document3;
            } else {
                if (!tLRPC$StickerSetCovered.covers.isEmpty()) {
                    tLRPC$Document2 = tLRPC$StickerSetCovered.covers.get(0);
                }
                tLRPC$Document2 = null;
            }
            tLRPC$StickerSet = tLRPC$StickerSet2;
        } else if (tLRPC$Document != null || tLObject == null || !BuildVars.DEBUG_VERSION) {
            tLRPC$Document2 = tLRPC$Document;
            tLRPC$StickerSet = null;
        } else {
            throw new IllegalArgumentException("Invalid type of the given setObject: " + tLObject.getClass());
        }
        if (tLRPC$Document2 != null) {
            tLRPC$PhotoSize = tLRPC$StickerSet != null ? FileLoader.getClosestPhotoSizeWithSize(tLRPC$StickerSet.thumbs, 90) : tLRPC$PhotoSize;
            tLRPC$PhotoSize = tLRPC$PhotoSize == null ? tLRPC$Document2 : tLRPC$PhotoSize;
            boolean z2 = tLRPC$PhotoSize instanceof TLRPC$Document;
            if (z2) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document2.thumbs, 90), tLRPC$Document2);
            } else {
                TLRPC$PhotoSize tLRPC$PhotoSize2 = tLRPC$PhotoSize;
                if (tLObject instanceof TLRPC$StickerSetCovered) {
                    i2 = ((TLRPC$StickerSetCovered) tLObject).set.thumb_version;
                } else {
                    i2 = z ? ((TLRPC$TL_messages_stickerSet) tLObject).set.thumb_version : 0;
                }
                forSticker = ImageLocation.getForSticker(tLRPC$PhotoSize2, tLRPC$Document2, i2);
            }
            ImageLocation imageLocation = forSticker;
            if ((z2 && MessageObject.isAnimatedStickerDocument(tLRPC$Document2, true)) || MessageObject.isVideoSticker(tLRPC$Document2) || MessageObject.isGifDocument(tLRPC$Document2)) {
                this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document2), "50_50", imageLocation, (String) null, 0, tLObject);
            } else if (imageLocation == null || imageLocation.imageType != 1) {
                this.imageView.setImage(imageLocation, "50_50", "webp", (Drawable) null, tLObject);
            } else {
                this.imageView.setImage(imageLocation, "50_50", "tgs", (Drawable) null, tLObject);
            }
        } else {
            this.imageView.setImage((ImageLocation) null, (String) null, "webp", (Drawable) null, tLObject);
        }
        switch (i) {
            case 0:
                if (tLRPC$StickerSet.masks) {
                    this.titleTextView.setText(LocaleController.getString("MasksRemoved", R.string.MasksRemoved));
                    this.subtitleTextView.setText(LocaleController.formatString("MasksRemovedInfo", R.string.MasksRemovedInfo, tLRPC$StickerSet.title));
                    return;
                }
                this.titleTextView.setText(LocaleController.getString("StickersRemoved", R.string.StickersRemoved));
                this.subtitleTextView.setText(LocaleController.formatString("StickersRemovedInfo", R.string.StickersRemovedInfo, tLRPC$StickerSet.title));
                return;
            case 1:
                if (tLRPC$StickerSet.masks) {
                    this.titleTextView.setText(LocaleController.getString("MasksArchived", R.string.MasksArchived));
                    this.subtitleTextView.setText(LocaleController.formatString("MasksArchivedInfo", R.string.MasksArchivedInfo, tLRPC$StickerSet.title));
                    return;
                }
                this.titleTextView.setText(LocaleController.getString("StickersArchived", R.string.StickersArchived));
                this.subtitleTextView.setText(LocaleController.formatString("StickersArchivedInfo", R.string.StickersArchivedInfo, tLRPC$StickerSet.title));
                return;
            case 2:
                if (tLRPC$StickerSet.masks) {
                    this.titleTextView.setText(LocaleController.getString("AddMasksInstalled", R.string.AddMasksInstalled));
                    this.subtitleTextView.setText(LocaleController.formatString("AddMasksInstalledInfo", R.string.AddMasksInstalledInfo, tLRPC$StickerSet.title));
                    return;
                }
                this.titleTextView.setText(LocaleController.getString("AddStickersInstalled", R.string.AddStickersInstalled));
                this.subtitleTextView.setText(LocaleController.formatString("AddStickersInstalledInfo", R.string.AddStickersInstalledInfo, tLRPC$StickerSet.title));
                return;
            case 3:
                this.titleTextView.setText(LocaleController.getString("RemovedFromRecent", R.string.RemovedFromRecent));
                this.subtitleTextView.setVisibility(8);
                return;
            case 4:
                this.titleTextView.setText(LocaleController.getString("RemovedFromFavorites", R.string.RemovedFromFavorites));
                this.subtitleTextView.setVisibility(8);
                return;
            case 5:
                this.titleTextView.setText(LocaleController.getString("AddedToFavorites", R.string.AddedToFavorites));
                this.subtitleTextView.setVisibility(8);
                return;
            case 6:
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || MessagesController.getInstance(UserConfig.selectedAccount).premiumLocked) {
                    this.titleTextView.setText(LocaleController.formatString("LimitReachedFavoriteStickers", R.string.LimitReachedFavoriteStickers, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitPremium)));
                    this.subtitleTextView.setText(LocaleController.formatString("LimitReachedFavoriteStickersSubtitlePremium", R.string.LimitReachedFavoriteStickersSubtitlePremium, new Object[0]));
                    return;
                }
                this.titleTextView.setText(LocaleController.formatString("LimitReachedFavoriteStickers", R.string.LimitReachedFavoriteStickers, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitDefault)));
                this.subtitleTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString("LimitReachedFavoriteStickersSubtitle", R.string.LimitReachedFavoriteStickersSubtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitPremium)), new Runnable() {
                    @Override
                    public final void run() {
                        StickerSetBulletinLayout.lambda$new$0(context);
                    }
                }));
                return;
            case 7:
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || MessagesController.getInstance(UserConfig.selectedAccount).premiumLocked) {
                    this.titleTextView.setText(LocaleController.formatString("LimitReachedFavoriteGifs", R.string.LimitReachedFavoriteGifs, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitPremium)));
                    this.subtitleTextView.setText(LocaleController.formatString("LimitReachedFavoriteGifsSubtitlePremium", R.string.LimitReachedFavoriteGifsSubtitlePremium, new Object[0]));
                    return;
                }
                this.titleTextView.setText(LocaleController.formatString("LimitReachedFavoriteGifs", R.string.LimitReachedFavoriteGifs, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitDefault)));
                this.subtitleTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString("LimitReachedFavoriteGifsSubtitle", R.string.LimitReachedFavoriteGifsSubtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitPremium)), new Runnable() {
                    @Override
                    public final void run() {
                        StickerSetBulletinLayout.lambda$new$1(context);
                    }
                }));
                return;
            default:
                return;
        }
    }

    public static void lambda$new$0(Context context) {
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity instanceof LaunchActivity) {
            ((LaunchActivity) findActivity).lambda$runLinkRequest$59(new PremiumPreviewFragment());
        }
    }

    public static void lambda$new$1(Context context) {
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity instanceof LaunchActivity) {
            ((LaunchActivity) findActivity).lambda$runLinkRequest$59(new PremiumPreviewFragment());
        }
    }
}
