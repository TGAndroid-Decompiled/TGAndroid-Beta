package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class pa0 extends nz {
    public final vv0 X;
    public final wa0 Y;

    public pa0(wa0 wa0Var) {
        super(100, false);
        this.Y = wa0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        wa0 wa0Var = this.Y;
        if (wa0Var.f30006f.I() == null && wa0Var.f30006f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final vv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        vv0 vv0Var = this.X;
        int i11 = 0;
        vv0Var.f29778c = false;
        wa0 wa0Var = this.Y;
        if (i10 == 0) {
            vv0Var.f29776a = this.f43030m;
            vv0Var.f29777b = wa0Var.e.h;
            vv0Var.f29778c = true;
            return vv0Var;
        }
        int i12 = i10 - 1;
        if (wa0Var.f30006f.I() == null && wa0Var.f30006f.U == null) {
            i10 = i12;
        }
        vv0Var.f29776a = 0.0f;
        vv0Var.f29777b = 0.0f;
        Object J = wa0Var.f30006f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f18321w;
                } else {
                    f7 = 100.0f;
                }
                vv0Var.f29776a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                vv0Var.f29777b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        vv0Var.f29776a = documentAttribute.f18303w;
                        vv0Var.f29777b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        vv0Var.f29776a = documentAttribute2.f18303w;
                        vv0Var.f29777b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        vv0Var.f29776a = documentAttribute3.f18303w;
                        vv0Var.f29777b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    vv0Var.f29776a = closestPhotoSizeWithSize.f18321w;
                    vv0Var.f29777b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return vv0Var;
    }
}
