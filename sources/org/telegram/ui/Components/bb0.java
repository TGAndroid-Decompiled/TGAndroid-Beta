package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class bb0 extends wz {
    public final dw0 X;
    public final ib0 Y;

    public bb0(ib0 ib0Var) {
        super(100, false);
        this.Y = ib0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        ib0 ib0Var = this.Y;
        if (ib0Var.f27171f.I() == null && ib0Var.f27171f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final dw0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        dw0 dw0Var = this.X;
        int i11 = 0;
        dw0Var.f25722c = false;
        ib0 ib0Var = this.Y;
        if (i10 == 0) {
            dw0Var.f25720a = this.f46011m;
            dw0Var.f25721b = ib0Var.e.h;
            dw0Var.f25722c = true;
            return dw0Var;
        }
        int i12 = i10 - 1;
        if (ib0Var.f27171f.I() == null && ib0Var.f27171f.U == null) {
            i10 = i12;
        }
        dw0Var.f25720a = 0.0f;
        dw0Var.f25721b = 0.0f;
        Object J = ib0Var.f27171f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f20297w;
                } else {
                    f7 = 100.0f;
                }
                dw0Var.f25720a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                dw0Var.f25721b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        dw0Var.f25720a = documentAttribute.f20279w;
                        dw0Var.f25721b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        dw0Var.f25720a = documentAttribute2.f20279w;
                        dw0Var.f25721b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        dw0Var.f25720a = documentAttribute3.f20279w;
                        dw0Var.f25721b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    dw0Var.f25720a = closestPhotoSizeWithSize.f20297w;
                    dw0Var.f25721b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return dw0Var;
    }
}
