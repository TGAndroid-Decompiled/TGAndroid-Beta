package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class a90 extends ky {
    public final ot0 X;
    public final h90 Y;

    public a90(h90 h90Var) {
        super(100, false);
        this.Y = h90Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        h90 h90Var = this.Y;
        if (h90Var.f34250f.I() == null && h90Var.f34250f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final ot0 D1(int i7) {
        TLRPC.PhotoSize w10;
        float f10;
        ot0 ot0Var = this.X;
        int i10 = 0;
        ot0Var.f36803c = false;
        h90 h90Var = this.Y;
        if (i7 == 0) {
            ot0Var.f36801a = this.f57153m;
            ot0Var.f36802b = h90Var.f34249e.h;
            ot0Var.f36803c = true;
            return ot0Var;
        }
        int i11 = i7 - 1;
        if (h90Var.f34250f.I() == null && h90Var.f34250f.U == null) {
            i7 = i11;
        }
        ot0Var.f36801a = 0.0f;
        ot0Var.f36802b = 0.0f;
        Object J = h90Var.f34250f.J(i7);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                float f11 = 100.0f;
                if (w11 != null) {
                    f10 = w11.f26981w;
                } else {
                    f10 = 100.0f;
                }
                ot0Var.f36801a = f10;
                if (w11 != null) {
                    f11 = w11.h;
                }
                ot0Var.f36802b = f11;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        ot0Var.f36801a = documentAttribute.f26963w;
                        ot0Var.f36802b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        ot0Var.f36801a = documentAttribute2.f26963w;
                        ot0Var.f36802b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        ot0Var.f36801a = documentAttribute3.f26963w;
                        ot0Var.f36802b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    ot0Var.f36801a = w10.f26981w;
                    ot0Var.f36802b = w10.h;
                }
            }
        }
        return ot0Var;
    }
}
