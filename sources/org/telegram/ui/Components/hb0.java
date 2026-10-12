package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class hb0 extends zz {
    public final iw0 X;
    public final ob0 Y;

    public hb0(ob0 ob0Var) {
        super(100, false);
        this.Y = ob0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        ob0 ob0Var = this.Y;
        if (ob0Var.f27929f.I() == null && ob0Var.f27929f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final iw0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        iw0 iw0Var = this.X;
        int i11 = 0;
        iw0Var.f26118c = false;
        ob0 ob0Var = this.Y;
        if (i10 == 0) {
            iw0Var.f26116a = this.f44939m;
            iw0Var.f26117b = ob0Var.e.h;
            iw0Var.f26118c = true;
            return iw0Var;
        }
        int i12 = i10 - 1;
        if (ob0Var.f27929f.I() == null && ob0Var.f27929f.U == null) {
            i10 = i12;
        }
        iw0Var.f26116a = 0.0f;
        iw0Var.f26117b = 0.0f;
        Object J = ob0Var.f27929f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f19241w;
                } else {
                    f7 = 100.0f;
                }
                iw0Var.f26116a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                iw0Var.f26117b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        iw0Var.f26116a = documentAttribute.f19223w;
                        iw0Var.f26117b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        iw0Var.f26116a = documentAttribute2.f19223w;
                        iw0Var.f26117b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        iw0Var.f26116a = documentAttribute3.f19223w;
                        iw0Var.f26117b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    iw0Var.f26116a = closestPhotoSizeWithSize.f19241w;
                    iw0Var.f26117b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return iw0Var;
    }
}
