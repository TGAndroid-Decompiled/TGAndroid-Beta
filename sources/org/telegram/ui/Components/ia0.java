package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ia0 extends nz {
    public final jv0 X;
    public final pa0 Y;

    public ia0(pa0 pa0Var) {
        super(100, false);
        this.Y = pa0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        pa0 pa0Var = this.Y;
        if (pa0Var.f27803f.I() == null && pa0Var.f27803f.R == null) {
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
        jv0Var.f26054c = false;
        pa0 pa0Var = this.Y;
        if (i10 == 0) {
            jv0Var.f26052a = this.f5856m;
            jv0Var.f26053b = pa0Var.e.h;
            jv0Var.f26054c = true;
            return jv0Var;
        }
        int i12 = i10 - 1;
        if (pa0Var.f27803f.I() == null && pa0Var.f27803f.R == null) {
            i10 = i12;
        }
        jv0Var.f26052a = 0.0f;
        jv0Var.f26053b = 0.0f;
        Object J = pa0Var.f27803f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f11 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.f19209w;
                } else {
                    f10 = 100.0f;
                }
                jv0Var.f26052a = f10;
                if (closestPhotoSizeWithSize2 != null) {
                    f11 = closestPhotoSizeWithSize2.h;
                }
                jv0Var.f26053b = f11;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        jv0Var.f26052a = documentAttribute.f19191w;
                        jv0Var.f26053b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        jv0Var.f26052a = documentAttribute2.f19191w;
                        jv0Var.f26053b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        jv0Var.f26052a = documentAttribute3.f19191w;
                        jv0Var.f26053b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    jv0Var.f26052a = closestPhotoSizeWithSize.f19209w;
                    jv0Var.f26053b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return jv0Var;
    }
}
