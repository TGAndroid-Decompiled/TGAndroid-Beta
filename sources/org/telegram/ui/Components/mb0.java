package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class mb0 extends g00 {
    public final sw0 X;
    public final tb0 Y;

    public mb0(tb0 tb0Var) {
        super(100, false);
        this.Y = tb0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        tb0 tb0Var = this.Y;
        if (tb0Var.f30845f.I() == null && tb0Var.f30845f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final sw0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        sw0 sw0Var = this.X;
        int i11 = 0;
        sw0Var.f30701c = false;
        tb0 tb0Var = this.Y;
        if (i10 == 0) {
            sw0Var.f30699a = this.f48012m;
            sw0Var.f30700b = tb0Var.f30844e.h;
            sw0Var.f30701c = true;
            return sw0Var;
        }
        int i12 = i10 - 1;
        if (tb0Var.f30845f.I() == null && tb0Var.f30845f.U == null) {
            i10 = i12;
        }
        sw0Var.f30699a = 0.0f;
        sw0Var.f30700b = 0.0f;
        Object J = tb0Var.f30845f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f19828w;
                } else {
                    f7 = 100.0f;
                }
                sw0Var.f30699a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                sw0Var.f30700b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        sw0Var.f30699a = documentAttribute.f19810w;
                        sw0Var.f30700b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        sw0Var.f30699a = documentAttribute2.f19810w;
                        sw0Var.f30700b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        sw0Var.f30699a = documentAttribute3.f19810w;
                        sw0Var.f30700b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    sw0Var.f30699a = closestPhotoSizeWithSize.f19828w;
                    sw0Var.f30700b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return sw0Var;
    }
}
