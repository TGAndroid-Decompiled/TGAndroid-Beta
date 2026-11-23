package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l90 extends ty {
    public final xt0 X;
    public final s90 Y;

    public l90(s90 s90Var) {
        super(100, false);
        this.Y = s90Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        s90 s90Var = this.Y;
        if (s90Var.f39538f.I() == null && s90Var.f39538f.V == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final xt0 D1(int i7) {
        TLRPC.PhotoSize w10;
        float f10;
        xt0 xt0Var = this.X;
        int i10 = 0;
        xt0Var.f42191c = false;
        s90 s90Var = this.Y;
        if (i7 == 0) {
            xt0Var.f42189a = this.f59341m;
            xt0Var.f42190b = s90Var.f39537e.h;
            xt0Var.f42191c = true;
            return xt0Var;
        }
        int i11 = i7 - 1;
        if (s90Var.f39538f.I() == null && s90Var.f39538f.V == null) {
            i7 = i11;
        }
        xt0Var.f42189a = 0.0f;
        xt0Var.f42190b = 0.0f;
        Object J = s90Var.f39538f.J(i7);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                float f11 = 100.0f;
                if (w11 != null) {
                    f10 = w11.f28517w;
                } else {
                    f10 = 100.0f;
                }
                xt0Var.f42189a = f10;
                if (w11 != null) {
                    f11 = w11.h;
                }
                xt0Var.f42190b = f11;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        xt0Var.f42189a = documentAttribute.f28499w;
                        xt0Var.f42190b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        xt0Var.f42189a = documentAttribute2.f28499w;
                        xt0Var.f42190b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        xt0Var.f42189a = documentAttribute3.f28499w;
                        xt0Var.f42190b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    xt0Var.f42189a = w10.f28517w;
                    xt0Var.f42190b = w10.h;
                }
            }
        }
        return xt0Var;
    }
}
