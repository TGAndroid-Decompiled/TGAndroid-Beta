package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ka0 extends pz {
    public final jv0 X;
    public final ra0 Y;

    public ka0(ra0 ra0Var) {
        super(100, false);
        this.Y = ra0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        ra0 ra0Var = this.Y;
        if (ra0Var.f30710f.I() == null && ra0Var.f30710f.R == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final jv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f10;
        jv0 jv0Var = this.X;
        int i11 = 0;
        jv0Var.f28203c = false;
        ra0 ra0Var = this.Y;
        if (i10 == 0) {
            jv0Var.f28201a = this.f5950m;
            jv0Var.f28202b = ra0Var.f30709e.h;
            jv0Var.f28203c = true;
            return jv0Var;
        }
        int i12 = i10 - 1;
        if (ra0Var.f30710f.I() == null && ra0Var.f30710f.R == null) {
            i10 = i12;
        }
        jv0Var.f28201a = 0.0f;
        jv0Var.f28202b = 0.0f;
        Object J = ra0Var.f30710f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f11 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.f20870w;
                } else {
                    f10 = 100.0f;
                }
                jv0Var.f28201a = f10;
                if (closestPhotoSizeWithSize2 != null) {
                    f11 = closestPhotoSizeWithSize2.h;
                }
                jv0Var.f28202b = f11;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        jv0Var.f28201a = documentAttribute.f20852w;
                        jv0Var.f28202b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        jv0Var.f28201a = documentAttribute2.f20852w;
                        jv0Var.f28202b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        jv0Var.f28201a = documentAttribute3.f20852w;
                        jv0Var.f28202b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    jv0Var.f28201a = closestPhotoSizeWithSize.f20870w;
                    jv0Var.f28202b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return jv0Var;
    }
}
