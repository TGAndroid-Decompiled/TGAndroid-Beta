package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ua0 extends qz {
    public final fw0 X;
    public final bb0 Y;

    public ua0(bb0 bb0Var) {
        super(100, false);
        this.Y = bb0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        bb0 bb0Var = this.Y;
        if (bb0Var.f24909f.I() == null && bb0Var.f24909f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final fw0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        fw0 fw0Var = this.X;
        int i11 = 0;
        fw0Var.f26586c = false;
        bb0 bb0Var = this.Y;
        if (i10 == 0) {
            fw0Var.f26584a = this.f46636m;
            fw0Var.f26585b = bb0Var.f24908e.h;
            fw0Var.f26586c = true;
            return fw0Var;
        }
        int i12 = i10 - 1;
        if (bb0Var.f24909f.I() == null && bb0Var.f24909f.U == null) {
            i10 = i12;
        }
        fw0Var.f26584a = 0.0f;
        fw0Var.f26585b = 0.0f;
        Object J = bb0Var.f24909f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f20062w;
                } else {
                    f7 = 100.0f;
                }
                fw0Var.f26584a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                fw0Var.f26585b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        fw0Var.f26584a = documentAttribute.f20044w;
                        fw0Var.f26585b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        fw0Var.f26584a = documentAttribute2.f20044w;
                        fw0Var.f26585b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        fw0Var.f26584a = documentAttribute3.f20044w;
                        fw0Var.f26585b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    fw0Var.f26584a = closestPhotoSizeWithSize.f20062w;
                    fw0Var.f26585b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return fw0Var;
    }
}
