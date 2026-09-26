package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ta0 extends pz {
    public final vv0 X;
    public final ab0 Y;

    public ta0(ab0 ab0Var) {
        super(100, false);
        this.Y = ab0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        ab0 ab0Var = this.Y;
        if (ab0Var.f22593f.I() == null && ab0Var.f22593f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final vv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        vv0 vv0Var = this.X;
        int i11 = 0;
        vv0Var.f29776c = false;
        ab0 ab0Var = this.Y;
        if (i10 == 0) {
            vv0Var.f29774a = this.f43060m;
            vv0Var.f29775b = ab0Var.e.h;
            vv0Var.f29776c = true;
            return vv0Var;
        }
        int i12 = i10 - 1;
        if (ab0Var.f22593f.I() == null && ab0Var.f22593f.U == null) {
            i10 = i12;
        }
        vv0Var.f29774a = 0.0f;
        vv0Var.f29775b = 0.0f;
        Object J = ab0Var.f22593f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f18360w;
                } else {
                    f7 = 100.0f;
                }
                vv0Var.f29774a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                vv0Var.f29775b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        vv0Var.f29774a = documentAttribute.f18342w;
                        vv0Var.f29775b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        vv0Var.f29774a = documentAttribute2.f18342w;
                        vv0Var.f29775b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        vv0Var.f29774a = documentAttribute3.f18342w;
                        vv0Var.f29775b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    vv0Var.f29774a = closestPhotoSizeWithSize.f18360w;
                    vv0Var.f29775b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return vv0Var;
    }
}
