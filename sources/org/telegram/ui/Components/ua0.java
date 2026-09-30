package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ua0 extends pz {
    public final wv0 X;
    public final bb0 Y;

    public ua0(bb0 bb0Var) {
        super(100, false);
        this.Y = bb0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        bb0 bb0Var = this.Y;
        if (bb0Var.f22924f.I() == null && bb0Var.f22924f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final wv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        wv0 wv0Var = this.X;
        int i11 = 0;
        wv0Var.f30184c = false;
        bb0 bb0Var = this.Y;
        if (i10 == 0) {
            wv0Var.f30182a = this.f43063m;
            wv0Var.f30183b = bb0Var.e.h;
            wv0Var.f30184c = true;
            return wv0Var;
        }
        int i12 = i10 - 1;
        if (bb0Var.f22924f.I() == null && bb0Var.f22924f.U == null) {
            i10 = i12;
        }
        wv0Var.f30182a = 0.0f;
        wv0Var.f30183b = 0.0f;
        Object J = bb0Var.f22924f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f18362w;
                } else {
                    f7 = 100.0f;
                }
                wv0Var.f30182a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                wv0Var.f30183b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        wv0Var.f30182a = documentAttribute.f18344w;
                        wv0Var.f30183b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        wv0Var.f30182a = documentAttribute2.f18344w;
                        wv0Var.f30183b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        wv0Var.f30182a = documentAttribute3.f18344w;
                        wv0Var.f30183b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    wv0Var.f30182a = closestPhotoSizeWithSize.f18362w;
                    wv0Var.f30183b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return wv0Var;
    }
}
