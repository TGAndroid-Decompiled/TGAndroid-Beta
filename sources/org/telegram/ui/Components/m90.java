package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class m90 extends uy {
    public final vt0 X;
    public final t90 Y;

    public m90(t90 t90Var) {
        super(100, false);
        this.Y = t90Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        t90 t90Var = this.Y;
        if (t90Var.f39949f.I() == null && t90Var.f39949f.V == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final vt0 D1(int i7) {
        TLRPC.PhotoSize w10;
        float f10;
        vt0 vt0Var = this.X;
        int i10 = 0;
        vt0Var.f41435c = false;
        t90 t90Var = this.Y;
        if (i7 == 0) {
            vt0Var.f41433a = this.f59217m;
            vt0Var.f41434b = t90Var.f39948e.h;
            vt0Var.f41435c = true;
            return vt0Var;
        }
        int i11 = i7 - 1;
        if (t90Var.f39949f.I() == null && t90Var.f39949f.V == null) {
            i7 = i11;
        }
        vt0Var.f41433a = 0.0f;
        vt0Var.f41434b = 0.0f;
        Object J = t90Var.f39949f.J(i7);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                float f11 = 100.0f;
                if (w11 != null) {
                    f10 = w11.f28428w;
                } else {
                    f10 = 100.0f;
                }
                vt0Var.f41433a = f10;
                if (w11 != null) {
                    f11 = w11.h;
                }
                vt0Var.f41434b = f11;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        vt0Var.f41433a = documentAttribute.f28410w;
                        vt0Var.f41434b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        vt0Var.f41433a = documentAttribute2.f28410w;
                        vt0Var.f41434b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        vt0Var.f41433a = documentAttribute3.f28410w;
                        vt0Var.f41434b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    vt0Var.f41433a = w10.f28428w;
                    vt0Var.f41434b = w10.h;
                }
            }
        }
        return vt0Var;
    }
}
