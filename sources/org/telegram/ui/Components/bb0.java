package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class bb0 extends wz {
    public final fw0 X;
    public final ib0 Y;

    public bb0(ib0 ib0Var) {
        super(100, false);
        this.Y = ib0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        ib0 ib0Var = this.Y;
        if (ib0Var.f27227f.I() == null && ib0Var.f27227f.U == null) {
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
        fw0Var.f26434c = false;
        ib0 ib0Var = this.Y;
        if (i10 == 0) {
            fw0Var.f26432a = this.f46022m;
            fw0Var.f26433b = ib0Var.e.h;
            fw0Var.f26434c = true;
            return fw0Var;
        }
        int i12 = i10 - 1;
        if (ib0Var.f27227f.I() == null && ib0Var.f27227f.U == null) {
            i10 = i12;
        }
        fw0Var.f26432a = 0.0f;
        fw0Var.f26433b = 0.0f;
        Object J = ib0Var.f27227f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f20305w;
                } else {
                    f7 = 100.0f;
                }
                fw0Var.f26432a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                fw0Var.f26433b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        fw0Var.f26432a = documentAttribute.f20287w;
                        fw0Var.f26433b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        fw0Var.f26432a = documentAttribute2.f20287w;
                        fw0Var.f26433b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        fw0Var.f26432a = documentAttribute3.f20287w;
                        fw0Var.f26433b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    fw0Var.f26432a = closestPhotoSizeWithSize.f20305w;
                    fw0Var.f26433b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return fw0Var;
    }
}
