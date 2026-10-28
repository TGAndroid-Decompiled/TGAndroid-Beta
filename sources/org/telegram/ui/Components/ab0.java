package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ab0 extends vz {
    public final rw0 X;
    public final hb0 Y;

    public ab0(hb0 hb0Var) {
        super(100, false);
        this.Y = hb0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        hb0 hb0Var = this.Y;
        if (hb0Var.f28943f.I() == null && hb0Var.f28943f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final rw0 E1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        rw0 rw0Var = this.X;
        int i11 = 0;
        rw0Var.f32394c = false;
        hb0 hb0Var = this.Y;
        if (i10 == 0) {
            rw0Var.f32392a = this.f47862m;
            rw0Var.f32393b = hb0Var.e.h;
            rw0Var.f32394c = true;
            return rw0Var;
        }
        int i12 = i10 - 1;
        if (hb0Var.f28943f.I() == null && hb0Var.f28943f.U == null) {
            i10 = i12;
        }
        rw0Var.f32392a = 0.0f;
        rw0Var.f32393b = 0.0f;
        Object J = hb0Var.f28943f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f22053w;
                } else {
                    f7 = 100.0f;
                }
                rw0Var.f32392a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                rw0Var.f32393b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        rw0Var.f32392a = documentAttribute.f22035w;
                        rw0Var.f32393b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        rw0Var.f32392a = documentAttribute2.f22035w;
                        rw0Var.f32393b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        rw0Var.f32392a = documentAttribute3.f22035w;
                        rw0Var.f32393b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    rw0Var.f32392a = closestPhotoSizeWithSize.f22053w;
                    rw0Var.f32393b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return rw0Var;
    }
}
