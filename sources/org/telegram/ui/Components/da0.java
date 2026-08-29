package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class da0 extends iz {
    public final bv0 X;
    public final ka0 Y;

    public da0(ka0 ka0Var) {
        super(100, false);
        this.Y = ka0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        ka0 ka0Var = this.Y;
        if (ka0Var.f29999f.I() == null && ka0Var.f29999f.Q == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final bv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f9;
        bv0 bv0Var = this.X;
        int i11 = 0;
        bv0Var.f27240c = false;
        ka0 ka0Var = this.Y;
        if (i10 == 0) {
            bv0Var.f27238a = this.f6506m;
            bv0Var.f27239b = ka0Var.f29998e.h;
            bv0Var.f27240c = true;
            return bv0Var;
        }
        int i12 = i10 - 1;
        if (ka0Var.f29999f.I() == null && ka0Var.f29999f.Q == null) {
            i10 = i12;
        }
        bv0Var.f27238a = 0.0f;
        bv0Var.f27239b = 0.0f;
        Object J = ka0Var.f29999f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f9 = closestPhotoSizeWithSize2.f22417w;
                } else {
                    f9 = 100.0f;
                }
                bv0Var.f27238a = f9;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                bv0Var.f27239b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        bv0Var.f27238a = documentAttribute.f22399w;
                        bv0Var.f27239b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        bv0Var.f27238a = documentAttribute2.f22399w;
                        bv0Var.f27239b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        bv0Var.f27238a = documentAttribute3.f22399w;
                        bv0Var.f27239b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    bv0Var.f27238a = closestPhotoSizeWithSize.f22417w;
                    bv0Var.f27239b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return bv0Var;
    }
}
