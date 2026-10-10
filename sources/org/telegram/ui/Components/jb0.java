package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class jb0 extends e00 {
    public final nw0 X;
    public final qb0 Y;

    public jb0(qb0 qb0Var) {
        super(100, false);
        this.Y = qb0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        qb0 qb0Var = this.Y;
        if (qb0Var.f30167f.I() == null && qb0Var.f30167f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final nw0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        nw0 nw0Var = this.X;
        int i11 = 0;
        nw0Var.f29262c = false;
        qb0 qb0Var = this.Y;
        if (i10 == 0) {
            nw0Var.f29260a = this.f47817m;
            nw0Var.f29261b = qb0Var.f30166e.h;
            nw0Var.f29262c = true;
            return nw0Var;
        }
        int i12 = i10 - 1;
        if (qb0Var.f30167f.I() == null && qb0Var.f30167f.U == null) {
            i10 = i12;
        }
        nw0Var.f29260a = 0.0f;
        nw0Var.f29261b = 0.0f;
        Object J = qb0Var.f30167f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f20067w;
                } else {
                    f7 = 100.0f;
                }
                nw0Var.f29260a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                nw0Var.f29261b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        nw0Var.f29260a = documentAttribute.f20049w;
                        nw0Var.f29261b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        nw0Var.f29260a = documentAttribute2.f20049w;
                        nw0Var.f29261b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        nw0Var.f29260a = documentAttribute3.f20049w;
                        nw0Var.f29261b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    nw0Var.f29260a = closestPhotoSizeWithSize.f20067w;
                    nw0Var.f29261b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return nw0Var;
    }
}
