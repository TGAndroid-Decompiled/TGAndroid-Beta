package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class oa0 extends nz {
    public final uv0 X;
    public final va0 Y;

    public oa0(va0 va0Var) {
        super(100, false);
        this.Y = va0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        va0 va0Var = this.Y;
        if (va0Var.f29048f.I() == null && va0Var.f29048f.U == null) {
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
        uv0Var.f28870c = false;
        va0 va0Var = this.Y;
        if (i10 == 0) {
            uv0Var.f28868a = this.f43075m;
            uv0Var.f28869b = va0Var.e.h;
            uv0Var.f28870c = true;
            return uv0Var;
        }
        int i12 = i10 - 1;
        if (va0Var.f29048f.I() == null && va0Var.f29048f.U == null) {
            i10 = i12;
        }
        uv0Var.f28868a = 0.0f;
        uv0Var.f28869b = 0.0f;
        Object J = va0Var.f29048f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f18353w;
                } else {
                    f7 = 100.0f;
                }
                uv0Var.f28868a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                uv0Var.f28869b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        uv0Var.f28868a = documentAttribute.f18335w;
                        uv0Var.f28869b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        uv0Var.f28868a = documentAttribute2.f18335w;
                        uv0Var.f28869b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        uv0Var.f28868a = documentAttribute3.f18335w;
                        uv0Var.f28869b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    uv0Var.f28868a = closestPhotoSizeWithSize.f18353w;
                    uv0Var.f28869b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return uv0Var;
    }
}
