package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class b90 extends oy {
    public final nt0 X;
    public final i90 Y;

    public b90(i90 i90Var) {
        super(100, false);
        this.Y = i90Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        i90 i90Var = this.Y;
        if (i90Var.f35523f.I() == null && i90Var.f35523f.V == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final nt0 D1(int i7) {
        TLRPC.PhotoSize w10;
        float f10;
        nt0 nt0Var = this.X;
        int i10 = 0;
        nt0Var.f37715c = false;
        i90 i90Var = this.Y;
        if (i7 == 0) {
            nt0Var.f37713a = this.f58631m;
            nt0Var.f37714b = i90Var.f35522e.h;
            nt0Var.f37715c = true;
            return nt0Var;
        }
        int i11 = i7 - 1;
        if (i90Var.f35523f.I() == null && i90Var.f35523f.V == null) {
            i7 = i11;
        }
        nt0Var.f37713a = 0.0f;
        nt0Var.f37714b = 0.0f;
        Object J = i90Var.f35523f.J(i7);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                float f11 = 100.0f;
                if (w11 != null) {
                    f10 = w11.f28076w;
                } else {
                    f10 = 100.0f;
                }
                nt0Var.f37713a = f10;
                if (w11 != null) {
                    f11 = w11.h;
                }
                nt0Var.f37714b = f11;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        nt0Var.f37713a = documentAttribute.f28058w;
                        nt0Var.f37714b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        nt0Var.f37713a = documentAttribute2.f28058w;
                        nt0Var.f37714b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        nt0Var.f37713a = documentAttribute3.f28058w;
                        nt0Var.f37714b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    nt0Var.f37713a = w10.f28076w;
                    nt0Var.f37714b = w10.h;
                }
            }
        }
        return nt0Var;
    }
}
