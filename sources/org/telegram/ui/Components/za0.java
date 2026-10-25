package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class za0 extends vz {
    public final qw0 X;
    public final gb0 Y;

    public za0(gb0 gb0Var) {
        super(100, false);
        this.Y = gb0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        gb0 gb0Var = this.Y;
        if (gb0Var.f28520f.I() == null && gb0Var.f28520f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final qw0 E1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        qw0 qw0Var = this.X;
        int i11 = 0;
        qw0Var.f32054c = false;
        gb0 gb0Var = this.Y;
        if (i10 == 0) {
            qw0Var.f32052a = this.f47824m;
            qw0Var.f32053b = gb0Var.e.h;
            qw0Var.f32054c = true;
            return qw0Var;
        }
        int i12 = i10 - 1;
        if (gb0Var.f28520f.I() == null && gb0Var.f28520f.U == null) {
            i10 = i12;
        }
        qw0Var.f32052a = 0.0f;
        qw0Var.f32053b = 0.0f;
        Object J = gb0Var.f28520f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f22052w;
                } else {
                    f7 = 100.0f;
                }
                qw0Var.f32052a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                qw0Var.f32053b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        qw0Var.f32052a = documentAttribute.f22034w;
                        qw0Var.f32053b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        qw0Var.f32052a = documentAttribute2.f22034w;
                        qw0Var.f32053b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        qw0Var.f32052a = documentAttribute3.f22034w;
                        qw0Var.f32053b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    qw0Var.f32052a = closestPhotoSizeWithSize.f22052w;
                    qw0Var.f32053b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return qw0Var;
    }
}
