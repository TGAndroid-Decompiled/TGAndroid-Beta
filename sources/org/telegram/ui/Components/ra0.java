package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ra0 extends nz {
    public final wv0 X;
    public final ya0 Y;

    public ra0(ya0 ya0Var) {
        super(100, false);
        this.Y = ya0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        ya0 ya0Var = this.Y;
        if (ya0Var.f30618f.I() == null && ya0Var.f30618f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final wv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        wv0 wv0Var = this.X;
        int i11 = 0;
        wv0Var.f30163c = false;
        ya0 ya0Var = this.Y;
        if (i10 == 0) {
            wv0Var.f30161a = this.f43096m;
            wv0Var.f30162b = ya0Var.e.h;
            wv0Var.f30163c = true;
            return wv0Var;
        }
        int i12 = i10 - 1;
        if (ya0Var.f30618f.I() == null && ya0Var.f30618f.U == null) {
            i10 = i12;
        }
        wv0Var.f30161a = 0.0f;
        wv0Var.f30162b = 0.0f;
        Object J = ya0Var.f30618f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f18368w;
                } else {
                    f7 = 100.0f;
                }
                wv0Var.f30161a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                wv0Var.f30162b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        wv0Var.f30161a = documentAttribute.f18350w;
                        wv0Var.f30162b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        wv0Var.f30161a = documentAttribute2.f18350w;
                        wv0Var.f30162b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        wv0Var.f30161a = documentAttribute3.f18350w;
                        wv0Var.f30162b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    wv0Var.f30161a = closestPhotoSizeWithSize.f18368w;
                    wv0Var.f30162b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return wv0Var;
    }
}
