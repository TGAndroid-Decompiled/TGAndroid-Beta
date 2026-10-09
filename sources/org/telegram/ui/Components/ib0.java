package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ib0 extends d00 {
    public final mw0 X;
    public final pb0 Y;

    public ib0(pb0 pb0Var) {
        super(100, false);
        this.Y = pb0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        pb0 pb0Var = this.Y;
        if (pb0Var.f29830f.I() == null && pb0Var.f29830f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final mw0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        mw0 mw0Var = this.X;
        int i11 = 0;
        mw0Var.f28965c = false;
        pb0 pb0Var = this.Y;
        if (i10 == 0) {
            mw0Var.f28963a = this.f47773m;
            mw0Var.f28964b = pb0Var.f29829e.h;
            mw0Var.f28965c = true;
            return mw0Var;
        }
        int i12 = i10 - 1;
        if (pb0Var.f29830f.I() == null && pb0Var.f29830f.U == null) {
            i10 = i12;
        }
        mw0Var.f28963a = 0.0f;
        mw0Var.f28964b = 0.0f;
        Object J = pb0Var.f29830f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f20063w;
                } else {
                    f7 = 100.0f;
                }
                mw0Var.f28963a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                mw0Var.f28964b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        mw0Var.f28963a = documentAttribute.f20045w;
                        mw0Var.f28964b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        mw0Var.f28963a = documentAttribute2.f20045w;
                        mw0Var.f28964b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        mw0Var.f28963a = documentAttribute3.f20045w;
                        mw0Var.f28964b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    mw0Var.f28963a = closestPhotoSizeWithSize.f20063w;
                    mw0Var.f28964b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return mw0Var;
    }
}
