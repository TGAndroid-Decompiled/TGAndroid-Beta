package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uy extends vk0 {
    public final boolean f33169c;
    public final wy d;

    public uy(wy wyVar, boolean z10) {
        this.d = wyVar;
        this.f33169c = z10;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z10 = this.f33169c;
        wy wyVar = this.d;
        if (z10) {
            arrayList = wyVar.f34415j1;
        } else {
            arrayList = wyVar.f34412i1;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i9) {
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        ArrayList arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        ImageLocation forSticker;
        int i10;
        String str;
        o9 o9Var = (o9) q1Var.f5501a;
        wy wyVar = this.d;
        boolean z10 = this.f33169c;
        if (z10) {
            arrayList = wyVar.f34415j1;
        } else {
            arrayList = wyVar.f34412i1;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i9);
        o9Var.setTag(stickerSetCovered);
        ColorFilter colorFilter = null;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(wyVar.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
            if (stickerSet == null) {
                arrayList2 = null;
            } else {
                arrayList2 = stickerSet.documents;
            }
        } else {
            arrayList2 = stickerSetCovered.covers;
        }
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                if (stickerSetCovered.set != null) {
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        if (arrayList2.get(i11).f22386id == stickerSetCovered.set.thumb_document_id) {
                            document = arrayList2.get(i11);
                            break;
                        }
                    }
                }
                document = null;
                if (document == null) {
                    document = arrayList2.get(0);
                }
            } else {
                document = null;
            }
        }
        if (document != null) {
            if (z10) {
                if (MessageObject.isTextColorEmoji(document)) {
                    colorFilter = org.telegram.ui.ActionBar.f6.n0(wyVar.V1);
                }
                o9Var.setColorFilter(colorFilter);
            }
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.f6.f22984c7, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            if (closestPhotoSizeWithSize == null || MessageObject.isVideoSticker(document)) {
                closestPhotoSizeWithSize = document;
            }
            boolean z11 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            if (z11) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
            } else if (closestPhotoSizeWithSize instanceof TLRPC.PhotoSize) {
                forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
            } else {
                return;
            }
            if (forSticker != null) {
                if (z10) {
                    i10 = 16388;
                } else {
                    i10 = 1;
                }
                if (!LiteMode.isEnabled(i10)) {
                    str = "30_30_firstframe";
                } else {
                    str = "30_30";
                }
                if (!z11 || (!MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isVideoSticker(document))) {
                    String str2 = str;
                    ImageLocation imageLocation = forSticker;
                    if (imageLocation.imageType == 1) {
                        o9Var.i(imageLocation, str2, "tgs", svgThumb, stickerSetCovered);
                    } else {
                        o9Var.i(imageLocation, null, "webp", svgThumb, stickerSetCovered);
                    }
                } else if (svgThumb != null) {
                    o9Var.n(ImageLocation.getForDocument(document), str, svgThumb, stickerSetCovered);
                } else {
                    o9Var.j(ImageLocation.getForDocument(document), str, forSticker, null, 0, stickerSetCovered);
                }
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        ty tyVar = new ty(this, this.d.getContext());
        tyVar.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        tyVar.setLayerNum(1);
        tyVar.setAspectFit(true);
        tyVar.setLayoutParams(new f2.a1(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f)));
        return new f2.q1(tyVar);
    }
}
