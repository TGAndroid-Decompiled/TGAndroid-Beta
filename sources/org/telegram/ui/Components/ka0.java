package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ka0 extends pz {
    public final kv0 X;
    public final ra0 Y;

    public ka0(ra0 ra0Var) {
        super(100, false);
        this.Y = ra0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        ra0 ra0Var = this.Y;
        if (ra0Var.f30663f.I() == null && ra0Var.f30663f.R == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final kv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f10;
        kv0 kv0Var = this.X;
        int i11 = 0;
        kv0Var.f28465c = false;
        ra0 ra0Var = this.Y;
        if (i10 == 0) {
            kv0Var.f28463a = this.f5950m;
            kv0Var.f28464b = ra0Var.f30662e.h;
            kv0Var.f28465c = true;
            return kv0Var;
        }
        int i12 = i10 - 1;
        if (ra0Var.f30663f.I() == null && ra0Var.f30663f.R == null) {
            i10 = i12;
        }
        kv0Var.f28463a = 0.0f;
        kv0Var.f28464b = 0.0f;
        Object J = ra0Var.f30663f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f11 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.f20868w;
                } else {
                    f10 = 100.0f;
                }
                kv0Var.f28463a = f10;
                if (closestPhotoSizeWithSize2 != null) {
                    f11 = closestPhotoSizeWithSize2.h;
                }
                kv0Var.f28464b = f11;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        kv0Var.f28463a = documentAttribute.f20850w;
                        kv0Var.f28464b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        kv0Var.f28463a = documentAttribute2.f20850w;
                        kv0Var.f28464b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        kv0Var.f28463a = documentAttribute3.f20850w;
                        kv0Var.f28464b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    kv0Var.f28463a = closestPhotoSizeWithSize.f20868w;
                    kv0Var.f28464b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return kv0Var;
    }
}
