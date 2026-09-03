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
public final class kz extends rl0 {
    public final boolean f28525c;
    public final mz d;

    public kz(mz mzVar, boolean z4) {
        this.d = mzVar;
        this.f28525c = z4;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z4 = this.f28525c;
        mz mzVar = this.d;
        if (z4) {
            arrayList = mzVar.f29300k1;
        } else {
            arrayList = mzVar.f29297j1;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        ArrayList arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        ImageLocation forSticker;
        int i11;
        String str;
        p9 p9Var = (p9) m1Var.f5875a;
        mz mzVar = this.d;
        boolean z4 = this.f28525c;
        if (z4) {
            arrayList = mzVar.f29300k1;
        } else {
            arrayList = mzVar.f29297j1;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
        p9Var.setTag(stickerSetCovered);
        ColorFilter colorFilter = null;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(mzVar.Z0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
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
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        if (arrayList2.get(i12).f20851id == stickerSetCovered.set.thumb_document_id) {
                            document = arrayList2.get(i12);
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
            if (z4) {
                if (MessageObject.isTextColorEmoji(document)) {
                    colorFilter = org.telegram.ui.ActionBar.k6.n0(mzVar.W1);
                }
                p9Var.setColorFilter(colorFilter);
            }
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.k6.f21644c7, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            if (closestPhotoSizeWithSize == null || MessageObject.isVideoSticker(document)) {
                closestPhotoSizeWithSize = document;
            }
            boolean z10 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            if (z10) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
            } else if (closestPhotoSizeWithSize instanceof TLRPC.PhotoSize) {
                forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
            } else {
                return;
            }
            if (forSticker != null) {
                if (z4) {
                    i11 = 16388;
                } else {
                    i11 = 1;
                }
                if (!LiteMode.isEnabled(i11)) {
                    str = "30_30_firstframe";
                } else {
                    str = "30_30";
                }
                if (!z10 || (!MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isVideoSticker(document))) {
                    String str2 = str;
                    ImageLocation imageLocation = forSticker;
                    if (imageLocation.imageType == 1) {
                        p9Var.i(imageLocation, str2, "tgs", svgThumb, stickerSetCovered);
                    } else {
                        p9Var.i(imageLocation, null, "webp", svgThumb, stickerSetCovered);
                    }
                } else if (svgThumb != null) {
                    p9Var.n(ImageLocation.getForDocument(document), str, svgThumb, stickerSetCovered);
                } else {
                    p9Var.j(ImageLocation.getForDocument(document), str, forSticker, null, 0, stickerSetCovered);
                }
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        jz jzVar = new jz(this, this.d.getContext());
        jzVar.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        jzVar.setLayerNum(1);
        jzVar.setAspectFit(true);
        jzVar.setLayoutParams(new f2.x0(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f)));
        return new f2.m1(jzVar);
    }
}
