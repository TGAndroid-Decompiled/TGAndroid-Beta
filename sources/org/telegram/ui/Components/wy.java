package org.telegram.ui.Components;

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

public final class wy extends yk0 {

    public final boolean f34374c;
    public final yy d;

    public wy(yy yyVar, boolean z10) {
        this.d = yyVar;
        this.f34374c = z10;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        boolean z10 = this.f34374c;
        yy yyVar = this.d;
        return (z10 ? yyVar.f35008j1 : yyVar.f35005i1).size();
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        ArrayList<TLRPC.Document> arrayList;
        ImageLocation forSticker;
        n9 n9Var = (n9) o1Var.f5789a;
        yy yyVar = this.d;
        boolean z10 = this.f34374c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z10 ? yyVar.f35008j1 : yyVar.f35005i1).get(i10);
        n9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(yyVar.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
            arrayList = stickerSet == null ? null : stickerSet.documents;
        } else {
            arrayList = stickerSetCovered.covers;
        }
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            if (arrayList == null || arrayList.isEmpty()) {
                document = null;
            } else {
                if (stickerSetCovered.set == null) {
                    document = null;
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        document = null;
                        break;
                    } else {
                        if (arrayList.get(i11).f22386id == stickerSetCovered.set.thumb_document_id) {
                            document = arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                }
                if (document == null) {
                    document = arrayList.get(0);
                }
            }
        }
        if (document == null) {
            return;
        }
        if (z10) {
            n9Var.setColorFilter(MessageObject.isTextColorEmoji(document) ? org.telegram.ui.ActionBar.g6.n0(yyVar.V1) : null);
        }
        TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.g6.f23037c7, 0.2f);
        if (svgThumb != null) {
            svgThumb.overrideWidthAndHeight(512, 512);
        }
        if (closestPhotoSizeWithSize == null || MessageObject.isVideoSticker(document)) {
            closestPhotoSizeWithSize = document;
        }
        boolean z11 = closestPhotoSizeWithSize instanceof TLRPC.Document;
        if (z11) {
            forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
        } else if (!(closestPhotoSizeWithSize instanceof TLRPC.PhotoSize)) {
            return;
        } else {
            forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
        }
        if (forSticker == null) {
            return;
        }
        String str = !LiteMode.isEnabled(z10 ? 16388 : 1) ? "30_30_firstframe" : "30_30";
        if (z11 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
            if (svgThumb != null) {
                n9Var.n(ImageLocation.getForDocument(document), str, svgThumb, stickerSetCovered);
                return;
            } else {
                n9Var.j(ImageLocation.getForDocument(document), str, forSticker, null, 0, stickerSetCovered);
                return;
            }
        }
        String str2 = str;
        ImageLocation imageLocation = forSticker;
        if (imageLocation.imageType == 1) {
            n9Var.i(imageLocation, str2, "tgs", svgThumb, stickerSetCovered);
        } else {
            n9Var.i(imageLocation, null, "webp", svgThumb, stickerSetCovered);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        vy vyVar = new vy(this, this.d.getContext());
        vyVar.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        vyVar.setLayerNum(1);
        vyVar.setAspectFit(true);
        vyVar.setLayoutParams(new f2.y0(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f)));
        return new lk0(vyVar);
    }
}
