package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class p90 extends zy {
    public final qu0 X;
    public final w90 Y;

    public p90(w90 w90Var) {
        super(100, false);
        this.Y = w90Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        w90 w90Var = this.Y;
        if (w90Var.f34159f.I() == null && w90Var.f34159f.Q == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final qu0 D1(int i9) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f10;
        qu0 qu0Var = this.X;
        int i10 = 0;
        qu0Var.f32028c = false;
        w90 w90Var = this.Y;
        if (i9 == 0) {
            qu0Var.f32026a = this.f5572m;
            qu0Var.f32027b = w90Var.f34158e.h;
            qu0Var.f32028c = true;
            return qu0Var;
        }
        int i11 = i9 - 1;
        if (w90Var.f34159f.I() == null && w90Var.f34159f.Q == null) {
            i9 = i11;
        }
        qu0Var.f32026a = 0.0f;
        qu0Var.f32027b = 0.0f;
        Object J = w90Var.f34159f.J(i9);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f11 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.f22405w;
                } else {
                    f10 = 100.0f;
                }
                qu0Var.f32026a = f10;
                if (closestPhotoSizeWithSize2 != null) {
                    f11 = closestPhotoSizeWithSize2.h;
                }
                qu0Var.f32027b = f11;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        qu0Var.f32026a = documentAttribute.f22387w;
                        qu0Var.f32027b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        qu0Var.f32026a = documentAttribute2.f22387w;
                        qu0Var.f32027b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        qu0Var.f32026a = documentAttribute3.f22387w;
                        qu0Var.f32027b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    qu0Var.f32026a = closestPhotoSizeWithSize.f22405w;
                    qu0Var.f32027b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return qu0Var;
    }
}
