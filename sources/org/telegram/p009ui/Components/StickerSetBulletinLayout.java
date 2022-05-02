package org.telegram.p009ui.Components;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.C0890R;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.Bulletin;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;

@SuppressLint({"ViewConstructor"})
public class StickerSetBulletinLayout extends Bulletin.TwoLineLayout {
    public StickerSetBulletinLayout(Context context, TLObject tLObject, int i) {
        this(context, tLObject, i, null, null);
    }

    public StickerSetBulletinLayout(Context context, TLObject tLObject, int i, TLRPC$Document tLRPC$Document, Theme.ResourcesProvider resourcesProvider) {
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
            if ((z2 && MessageObject.isAnimatedStickerDocument(tLRPC$Document2, true)) || MessageObject.isVideoSticker(tLRPC$Document2)) {
                this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document2), "50_50", imageLocation, (String) null, 0, tLObject);
            } else if (imageLocation == null || imageLocation.imageType != 1) {
                this.imageView.setImage(imageLocation, "50_50", "webp", (Drawable) null, tLObject);
            } else {
                this.imageView.setImage(imageLocation, "50_50", "tgs", (Drawable) null, tLObject);
            }
        } else {
            this.imageView.setImage((ImageLocation) null, (String) null, "webp", (Drawable) null, tLObject);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.titleTextView.setText(LocaleController.getString("RemovedFromRecent", C0890R.string.RemovedFromRecent));
                        this.subtitleTextView.setVisibility(8);
                    } else if (i == 4) {
                        this.titleTextView.setText(LocaleController.getString("RemovedFromFavorites", C0890R.string.RemovedFromFavorites));
                        this.subtitleTextView.setVisibility(8);
                    } else if (i == 5) {
                        this.titleTextView.setText(LocaleController.getString("AddedToFavorites", C0890R.string.AddedToFavorites));
                        this.subtitleTextView.setVisibility(8);
                    }
                } else if (tLRPC$StickerSet.masks) {
                    this.titleTextView.setText(LocaleController.getString("AddMasksInstalled", C0890R.string.AddMasksInstalled));
                    this.subtitleTextView.setText(LocaleController.formatString("AddMasksInstalledInfo", C0890R.string.AddMasksInstalledInfo, tLRPC$StickerSet.title));
                } else {
                    this.titleTextView.setText(LocaleController.getString("AddStickersInstalled", C0890R.string.AddStickersInstalled));
                    this.subtitleTextView.setText(LocaleController.formatString("AddStickersInstalledInfo", C0890R.string.AddStickersInstalledInfo, tLRPC$StickerSet.title));
                }
            } else if (tLRPC$StickerSet.masks) {
                this.titleTextView.setText(LocaleController.getString("MasksArchived", C0890R.string.MasksArchived));
                this.subtitleTextView.setText(LocaleController.formatString("MasksArchivedInfo", C0890R.string.MasksArchivedInfo, tLRPC$StickerSet.title));
            } else {
                this.titleTextView.setText(LocaleController.getString("StickersArchived", C0890R.string.StickersArchived));
                this.subtitleTextView.setText(LocaleController.formatString("StickersArchivedInfo", C0890R.string.StickersArchivedInfo, tLRPC$StickerSet.title));
            }
        } else if (tLRPC$StickerSet.masks) {
            this.titleTextView.setText(LocaleController.getString("MasksRemoved", C0890R.string.MasksRemoved));
            this.subtitleTextView.setText(LocaleController.formatString("MasksRemovedInfo", C0890R.string.MasksRemovedInfo, tLRPC$StickerSet.title));
        } else {
            this.titleTextView.setText(LocaleController.getString("StickersRemoved", C0890R.string.StickersRemoved));
            this.subtitleTextView.setText(LocaleController.formatString("StickersRemovedInfo", C0890R.string.StickersRemovedInfo, tLRPC$StickerSet.title));
        }
    }
}
