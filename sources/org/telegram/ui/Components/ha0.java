package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ha0 extends nz {
    public final iv0 X;
    public final oa0 Y;

    public ha0(oa0 oa0Var) {
        super(100, false);
        this.Y = oa0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        oa0 oa0Var = this.Y;
        if (oa0Var.f29048f.I() == null && oa0Var.f29048f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final iv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        iv0 iv0Var = this.X;
        int i11 = 0;
        iv0Var.f27300c = false;
        oa0 oa0Var = this.Y;
        if (i10 == 0) {
            iv0Var.f27298a = this.f45879m;
            iv0Var.f27299b = oa0Var.f29047e.h;
            iv0Var.f27300c = true;
            return iv0Var;
        }
        int i12 = i10 - 1;
        if (oa0Var.f29048f.I() == null && oa0Var.f29048f.U == null) {
            i10 = i12;
        }
        iv0Var.f27298a = 0.0f;
        iv0Var.f27299b = 0.0f;
        Object J = oa0Var.f29048f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f19921w;
                } else {
                    f7 = 100.0f;
                }
                iv0Var.f27298a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                iv0Var.f27299b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        iv0Var.f27298a = documentAttribute.f19903w;
                        iv0Var.f27299b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        iv0Var.f27298a = documentAttribute2.f19903w;
                        iv0Var.f27299b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        iv0Var.f27298a = documentAttribute3.f19903w;
                        iv0Var.f27299b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    iv0Var.f27298a = closestPhotoSizeWithSize.f19921w;
                    iv0Var.f27299b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return iv0Var;
    }
}
