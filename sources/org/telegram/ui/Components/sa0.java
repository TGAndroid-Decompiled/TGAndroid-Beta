package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class sa0 extends oz {
    public final uv0 X;
    public final za0 Y;

    public sa0(za0 za0Var) {
        super(100, false);
        this.Y = za0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        za0 za0Var = this.Y;
        if (za0Var.f30826f.I() == null && za0Var.f30826f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final uv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        uv0 uv0Var = this.X;
        int i11 = 0;
        uv0Var.f28934c = false;
        za0 za0Var = this.Y;
        if (i10 == 0) {
            uv0Var.f28932a = this.f43061m;
            uv0Var.f28933b = za0Var.e.h;
            uv0Var.f28934c = true;
            return uv0Var;
        }
        int i12 = i10 - 1;
        if (za0Var.f30826f.I() == null && za0Var.f30826f.U == null) {
            i10 = i12;
        }
        uv0Var.f28932a = 0.0f;
        uv0Var.f28933b = 0.0f;
        Object J = za0Var.f30826f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f18360w;
                } else {
                    f7 = 100.0f;
                }
                uv0Var.f28932a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                uv0Var.f28933b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        uv0Var.f28932a = documentAttribute.f18342w;
                        uv0Var.f28933b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        uv0Var.f28932a = documentAttribute2.f18342w;
                        uv0Var.f28933b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        uv0Var.f28932a = documentAttribute3.f18342w;
                        uv0Var.f28933b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    uv0Var.f28932a = closestPhotoSizeWithSize.f18360w;
                    uv0Var.f28933b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return uv0Var;
    }
}
