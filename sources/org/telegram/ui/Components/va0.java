package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class va0 extends qz {
    public final xv0 X;
    public final cb0 Y;

    public va0(cb0 cb0Var) {
        super(100, false);
        this.Y = cb0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        cb0 cb0Var = this.Y;
        if (cb0Var.f23250f.I() == null && cb0Var.f23250f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final xv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        xv0 xv0Var = this.X;
        int i11 = 0;
        xv0Var.f30523c = false;
        cb0 cb0Var = this.Y;
        if (i10 == 0) {
            xv0Var.f30521a = this.f43169m;
            xv0Var.f30522b = cb0Var.e.h;
            xv0Var.f30523c = true;
            return xv0Var;
        }
        int i12 = i10 - 1;
        if (cb0Var.f23250f.I() == null && cb0Var.f23250f.U == null) {
            i10 = i12;
        }
        xv0Var.f30521a = 0.0f;
        xv0Var.f30522b = 0.0f;
        Object J = cb0Var.f23250f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f18377w;
                } else {
                    f7 = 100.0f;
                }
                xv0Var.f30521a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                xv0Var.f30522b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        xv0Var.f30521a = documentAttribute.f18359w;
                        xv0Var.f30522b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        xv0Var.f30521a = documentAttribute2.f18359w;
                        xv0Var.f30522b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        xv0Var.f30521a = documentAttribute3.f18359w;
                        xv0Var.f30522b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    xv0Var.f30521a = closestPhotoSizeWithSize.f18377w;
                    xv0Var.f30522b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return xv0Var;
    }
}
