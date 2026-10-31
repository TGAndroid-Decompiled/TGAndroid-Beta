package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class r90 extends yy {
    public final pu0 X;
    public final y90 Y;

    public r90(y90 y90Var) {
        super(100, false);
        this.Y = y90Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        y90 y90Var = this.Y;
        if (y90Var.f32667f.I() == null && y90Var.f32667f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final pu0 D1(int i10) {
        TLRPC.PhotoSize w9;
        float f7;
        pu0 pu0Var = this.X;
        int i11 = 0;
        pu0Var.f29437c = false;
        y90 y90Var = this.Y;
        if (i10 == 0) {
            pu0Var.f29435a = this.f47987m;
            pu0Var.f29436b = y90Var.e.h;
            pu0Var.f29437c = true;
            return pu0Var;
        }
        int i12 = i10 - 1;
        if (y90Var.f32667f.I() == null && y90Var.f32667f.U == null) {
            i10 = i12;
        }
        pu0Var.f29435a = 0.0f;
        pu0Var.f29436b = 0.0f;
        Object J = y90Var.f32667f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                float f10 = 100.0f;
                if (w10 != null) {
                    f7 = w10.f19818w;
                } else {
                    f7 = 100.0f;
                }
                pu0Var.f29435a = f7;
                if (w10 != null) {
                    f10 = w10.h;
                }
                pu0Var.f29436b = f10;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        pu0Var.f29435a = documentAttribute.f19800w;
                        pu0Var.f29436b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        pu0Var.f29435a = documentAttribute2.f19800w;
                        pu0Var.f29436b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11++;
                    } else {
                        pu0Var.f29435a = documentAttribute3.f19800w;
                        pu0Var.f29436b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false)) != null) {
                    pu0Var.f29435a = w9.f19818w;
                    pu0Var.f29436b = w9.h;
                }
            }
        }
        return pu0Var;
    }
}
