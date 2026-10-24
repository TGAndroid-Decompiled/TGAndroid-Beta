package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ab0 extends uz {
    public final hw0 X;
    public final hb0 Y;

    public ab0(hb0 hb0Var) {
        super(100, false);
        this.Y = hb0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        hb0 hb0Var = this.Y;
        if (hb0Var.f26995f.I() == null && hb0Var.f26995f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final hw0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        hw0 hw0Var = this.X;
        int i11 = 0;
        hw0Var.f27190c = false;
        hb0 hb0Var = this.Y;
        if (i10 == 0) {
            hw0Var.f27188a = this.f46443m;
            hw0Var.f27189b = hb0Var.e.h;
            hw0Var.f27190c = true;
            return hw0Var;
        }
        int i12 = i10 - 1;
        if (hb0Var.f26995f.I() == null && hb0Var.f26995f.U == null) {
            i10 = i12;
        }
        hw0Var.f27188a = 0.0f;
        hw0Var.f27189b = 0.0f;
        Object J = hb0Var.f26995f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f20369w;
                } else {
                    f7 = 100.0f;
                }
                hw0Var.f27188a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                hw0Var.f27189b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        hw0Var.f27188a = documentAttribute.f20351w;
                        hw0Var.f27189b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        hw0Var.f27188a = documentAttribute2.f20351w;
                        hw0Var.f27189b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        hw0Var.f27188a = documentAttribute3.f20351w;
                        hw0Var.f27189b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    hw0Var.f27188a = closestPhotoSizeWithSize.f20369w;
                    hw0Var.f27189b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return hw0Var;
    }
}
