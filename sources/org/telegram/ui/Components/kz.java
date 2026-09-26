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
public final class kz extends wl0 {
    public final boolean f25888c;
    public final mz d;

    public kz(mz mzVar, boolean z10) {
        this.d = mzVar;
        this.f25888c = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z10 = this.f25888c;
        mz mzVar = this.d;
        if (z10) {
            arrayList = mzVar.f26581n1;
        } else {
            arrayList = mzVar.f26577m1;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        ArrayList arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        ImageLocation forSticker;
        int i11;
        String str;
        w9 w9Var = (w9) c1Var.f42959a;
        mz mzVar = this.d;
        boolean z10 = this.f25888c;
        if (z10) {
            arrayList = mzVar.f26581n1;
        } else {
            arrayList = mzVar.f26577m1;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
        w9Var.setTag(stickerSetCovered);
        ColorFilter colorFilter = null;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(mzVar.f26548c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
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
                        if (arrayList2.get(i12).f18341id == stickerSetCovered.set.thumb_document_id) {
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
            if (z10) {
                if (MessageObject.isTextColorEmoji(document)) {
                    colorFilter = org.telegram.ui.ActionBar.h6.n0(mzVar.Z1);
                }
                w9Var.setColorFilter(colorFilter);
            }
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.h6.f19042c7, 0.2f);
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
                    i11 = 16388;
                } else {
                    i11 = 1;
                }
                if (!LiteMode.isEnabled(i11)) {
                    str = "30_30_firstframe";
                } else {
                    str = "30_30";
                }
                if (!z11 || (!MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isVideoSticker(document))) {
                    String str2 = str;
                    ImageLocation imageLocation = forSticker;
                    if (imageLocation.imageType == 1) {
                        w9Var.i(imageLocation, str2, "tgs", svgThumb, stickerSetCovered);
                    } else {
                        w9Var.i(imageLocation, null, "webp", svgThumb, stickerSetCovered);
                    }
                } else if (svgThumb != null) {
                    w9Var.n(ImageLocation.getForDocument(document), str, svgThumb, stickerSetCovered);
                } else {
                    w9Var.j(ImageLocation.getForDocument(document), str, forSticker, null, 0, stickerSetCovered);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        jz jzVar = new jz(this, this.d.getContext());
        jzVar.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        jzVar.setLayerNum(1);
        jzVar.setAspectFit(true);
        jzVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f)));
        return new s4.c1(jzVar);
    }
}
