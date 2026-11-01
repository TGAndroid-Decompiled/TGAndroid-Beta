package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class r90 extends yy {
    public final qu0 X;
    public final y90 Y;

    public r90(y90 y90Var) {
        super(100, false);
        this.Y = y90Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        y90 y90Var = this.Y;
        if (y90Var.f32783f.I() == null && y90Var.f32783f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final qu0 D1(int i10) {
        TLRPC.PhotoSize w9;
        float f7;
        qu0 qu0Var = this.X;
        int i11 = 0;
        qu0Var.f29810c = false;
        y90 y90Var = this.Y;
        if (i10 == 0) {
            qu0Var.f29808a = this.f47998m;
            qu0Var.f29809b = y90Var.e.h;
            qu0Var.f29810c = true;
            return qu0Var;
        }
        int i12 = i10 - 1;
        if (y90Var.f32783f.I() == null && y90Var.f32783f.U == null) {
            i10 = i12;
        }
        qu0Var.f29808a = 0.0f;
        qu0Var.f29809b = 0.0f;
        Object J = y90Var.f32783f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                float f10 = 100.0f;
                if (w10 != null) {
                    f7 = w10.f19819w;
                } else {
                    f7 = 100.0f;
                }
                qu0Var.f29808a = f7;
                if (w10 != null) {
                    f10 = w10.h;
                }
                qu0Var.f29809b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        qu0Var.f29808a = documentAttribute.f19801w;
                        qu0Var.f29809b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        qu0Var.f29808a = documentAttribute2.f19801w;
                        qu0Var.f29809b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        qu0Var.f29808a = documentAttribute3.f19801w;
                        qu0Var.f29809b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false)) != null) {
                    qu0Var.f29808a = w9.f19819w;
                    qu0Var.f29809b = w9.h;
                }
            }
        }
        return qu0Var;
    }
}
