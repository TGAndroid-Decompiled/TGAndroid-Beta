package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class qa0 extends uz {
    public final tv0 X;
    public final xa0 Y;

    public qa0(xa0 xa0Var) {
        super(100, false);
        this.Y = xa0Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        xa0 xa0Var = this.Y;
        if (xa0Var.f28992f.I() == null && xa0Var.f28992f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final tv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f7;
        tv0 tv0Var = this.X;
        int i11 = 0;
        tv0Var.f27501c = false;
        xa0 xa0Var = this.Y;
        if (i10 == 0) {
            tv0Var.f27499a = this.f41711m;
            tv0Var.f27500b = xa0Var.e.h;
            tv0Var.f27501c = true;
            return tv0Var;
        }
        int i12 = i10 - 1;
        if (xa0Var.f28992f.I() == null && xa0Var.f28992f.U == null) {
            i10 = i12;
        }
        tv0Var.f27499a = 0.0f;
        tv0Var.f27500b = 0.0f;
        Object J = xa0Var.f28992f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                float f10 = 100.0f;
                if (closestPhotoSizeWithSize2 != null) {
                    f7 = closestPhotoSizeWithSize2.f17220w;
                } else {
                    f7 = 100.0f;
                }
                tv0Var.f27499a = f7;
                if (closestPhotoSizeWithSize2 != null) {
                    f10 = closestPhotoSizeWithSize2.h;
                }
                tv0Var.f27500b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        tv0Var.f27499a = documentAttribute.f17202w;
                        tv0Var.f27500b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        tv0Var.f27499a = documentAttribute2.f17202w;
                        tv0Var.f27500b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        tv0Var.f27499a = documentAttribute3.f17202w;
                        tv0Var.f27500b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    tv0Var.f27499a = closestPhotoSizeWithSize.f17220w;
                    tv0Var.f27500b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return tv0Var;
    }
}
