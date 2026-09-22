package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ga0 extends nz {
    public final jv0 X;
    public final na0 Y;

    public ga0(na0 na0Var) {
        super(100, false);
        this.Y = na0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        na0 na0Var = this.Y;
        if (na0Var.f26424f.I() == null && na0Var.f26424f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final jv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        jv0 jv0Var = this.X;
        int i11 = 0;
        jv0Var.f25442c = false;
        na0 na0Var = this.Y;
        if (i10 == 0) {
            jv0Var.f25440a = this.f42772m;
            jv0Var.f25441b = na0Var.e.h;
            jv0Var.f25442c = true;
            return jv0Var;
        }
        int i12 = i10 - 1;
        if (na0Var.f26424f.I() == null && na0Var.f26424f.U == null) {
            i10 = i12;
        }
        jv0Var.f25440a = 0.0f;
        jv0Var.f25441b = 0.0f;
        Object J = na0Var.f26424f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f18134w;
                } else {
                    f7 = 100.0f;
                }
                jv0Var.f25440a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                jv0Var.f25441b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        jv0Var.f25440a = documentAttribute.f18116w;
                        jv0Var.f25441b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        jv0Var.f25440a = documentAttribute2.f18116w;
                        jv0Var.f25441b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        jv0Var.f25440a = documentAttribute3.f18116w;
                        jv0Var.f25441b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    jv0Var.f25440a = closestPhotoSizeWithSize.f18134w;
                    jv0Var.f25441b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return jv0Var;
    }
}
