package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.ui.LaunchActivity;

public final class kw0 extends ac {
    public kw0(LaunchActivity launchActivity, int i10, TLRPC.Document document) {
        this(launchActivity, null, 1, i10, document, null);
    }

    public kw0(Context context, TLObject tLObject, int i10, int i11, TLRPC.Document document, org.telegram.ui.ActionBar.c6 c6Var) {
        TLRPC.Document document2;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document3;
        ImageLocation forSticker;
        TLRPC.TL_messages_stickerSet stickerSet2;
        super(context, c6Var);
        boolean z10 = tLObject instanceof TLRPC.TL_messages_stickerSet;
        if (z10) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            stickerSet = tL_messages_stickerSet.set;
            ArrayList<TLRPC.Document> arrayList2 = tL_messages_stickerSet.documents;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                document3 = document;
            } else {
                document3 = arrayList2.get(0);
            }
            document2 = document3;
        } else if (tLObject instanceof TLRPC.StickerSetCovered) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) tLObject;
            stickerSet = stickerSetCovered.set;
            TLRPC.Document document4 = stickerSetCovered.cover;
            if (document4 != null) {
                document3 = document4;
            } else if (!stickerSetCovered.covers.isEmpty()) {
                document3 = stickerSetCovered.covers.get(0);
            } else if (!(stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) || (arrayList = (tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents) == null || arrayList.isEmpty()) {
                document3 = document;
            } else {
                document3 = tL_stickerSetFullCovered.documents.get(0);
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
            boolean z11 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            if (z11) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 90), document2);
            } else {
                forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document2, tLObject instanceof TLRPC.StickerSetCovered ? ((TLRPC.StickerSetCovered) tLObject).set.thumb_version : z10 ? ((TLRPC.TL_messages_stickerSet) tLObject).set.thumb_version : 0);
            }
            ImageLocation imageLocation = forSticker;
            if (z11 && (MessageObject.isAnimatedStickerDocument(document2, true) || MessageObject.isVideoSticker(document2) || MessageObject.isGifDocument(document2))) {
                this.f26723a.j(ImageLocation.getForDocument(document2), "50_50", imageLocation, null, 0, tLObject);
            } else if (imageLocation == null || imageLocation.imageType != 1) {
                this.f26723a.i(imageLocation, "50_50", "webp", null, tLObject);
            } else {
                this.f26723a.i(imageLocation, "50_50", "tgs", null, tLObject);
            }
        } else {
            this.f26723a.i(null, null, "webp", null, tLObject);
        }
        if (MessageObject.isTextColorEmoji(document2)) {
            this.f26723a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        switch (i11) {
            case 0:
                if (stickerSet3 != null) {
                    if (stickerSet3.masks) {
                        this.f26724b.setText(LocaleController.getString(R.string.MasksRemoved));
                        this.f26725c.setText(LocaleController.formatString("MasksRemovedInfo", R.string.MasksRemovedInfo, stickerSet3.title));
                        return;
                    } else {
                        if (!stickerSet3.emojis) {
                            this.f26724b.setText(LocaleController.getString(R.string.StickersRemoved));
                            this.f26725c.setText(LocaleController.formatString("StickersRemovedInfo", R.string.StickersRemovedInfo, stickerSet3.title));
                            return;
                        }
                        this.f26724b.setText(LocaleController.getString(R.string.EmojiRemoved));
                        if (i10 > 1) {
                            this.f26725c.setText(LocaleController.formatPluralString("EmojiRemovedMultipleInfo", i10, new Object[0]));
                            return;
                        } else {
                            this.f26725c.setText(LocaleController.formatString("EmojiRemovedInfo", R.string.EmojiRemovedInfo, stickerSet3.title));
                            return;
                        }
                    }
                }
                return;
            case 1:
                if (stickerSet3 != null) {
                    if (stickerSet3.masks) {
                        this.f26724b.setText(LocaleController.getString(R.string.MasksArchived));
                        this.f26725c.setText(LocaleController.formatString("MasksArchivedInfo", R.string.MasksArchivedInfo, stickerSet3.title));
                        return;
                    } else if (stickerSet3.emojis) {
                        this.f26724b.setText(LocaleController.getString(R.string.EmojiArchived));
                        this.f26725c.setText(LocaleController.formatString("EmojiArchivedInfo", R.string.EmojiArchivedInfo, stickerSet3.title));
                        return;
                    } else {
                        this.f26724b.setText(LocaleController.getString(R.string.StickersArchived));
                        this.f26725c.setText(LocaleController.formatString("StickersArchivedInfo", R.string.StickersArchivedInfo, stickerSet3.title));
                        return;
                    }
                }
                return;
            case 2:
                if (stickerSet3 != null) {
                    if (stickerSet3.masks) {
                        this.f26724b.setText(LocaleController.getString(R.string.AddMasksInstalled));
                        this.f26725c.setText(LocaleController.formatString("AddMasksInstalledInfo", R.string.AddMasksInstalledInfo, stickerSet3.title));
                        return;
                    } else {
                        if (!stickerSet3.emojis) {
                            this.f26724b.setText(LocaleController.getString(R.string.AddStickersInstalled));
                            this.f26725c.setText(LocaleController.formatString("AddStickersInstalledInfo", R.string.AddStickersInstalledInfo, stickerSet3.title));
                            return;
                        }
                        this.f26724b.setText(LocaleController.getString(R.string.AddEmojiInstalled));
                        if (i10 > 1) {
                            this.f26725c.setText(LocaleController.formatPluralString("AddEmojiMultipleInstalledInfo", i10, new Object[0]));
                            return;
                        } else {
                            this.f26725c.setText(LocaleController.formatString("AddEmojiInstalledInfo", R.string.AddEmojiInstalledInfo, stickerSet3.title));
                            return;
                        }
                    }
                }
                return;
            case 3:
                this.f26724b.setText(LocaleController.getString(R.string.RemovedFromRecent));
                this.f26725c.setVisibility(8);
                return;
            case 4:
                this.f26724b.setText(LocaleController.getString(R.string.RemovedFromFavorites));
                this.f26725c.setVisibility(8);
                return;
            case 5:
                this.f26724b.setText(LocaleController.getString(R.string.AddedToFavorites));
                this.f26725c.setVisibility(8);
                return;
            case 6:
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
                    this.f26724b.setText(LocaleController.formatString("LimitReachedFavoriteStickers", R.string.LimitReachedFavoriteStickers, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitPremium)));
                    this.f26725c.setText(LocaleController.formatString("LimitReachedFavoriteStickersSubtitlePremium", R.string.LimitReachedFavoriteStickersSubtitlePremium, new Object[0]));
                    return;
                } else {
                    this.f26724b.setText(LocaleController.formatString("LimitReachedFavoriteStickers", R.string.LimitReachedFavoriteStickers, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitDefault)));
                    this.f26725c.setText(AndroidUtilities.premiumText(LocaleController.formatString("LimitReachedFavoriteStickersSubtitle", R.string.LimitReachedFavoriteStickersSubtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitPremium)), new p20(context, 2)));
                    return;
                }
            case 7:
                boolean zIsPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
                if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() || zIsPremium) {
                    this.f26724b.setText(LocaleController.formatString(R.string.LimitReachedFavoriteGifs, Integer.valueOf(zIsPremium ? MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitPremium : MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitDefault)));
                    this.f26725c.setText(LocaleController.getString(R.string.LimitReachedFavoriteGifsSubtitlePremium));
                    return;
                } else {
                    this.f26724b.setText(LocaleController.formatString(R.string.LimitReachedFavoriteGifs, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitDefault)));
                    this.f26725c.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.LimitReachedFavoriteGifsSubtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitPremium)), new p20(context, 3)));
                    return;
                }
            default:
                return;
        }
    }
}
