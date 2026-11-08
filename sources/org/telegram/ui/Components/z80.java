package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class z80 extends ky {
    public final mt0 X;
    public final g90 Y;

    public z80(g90 g90Var) {
        super(100, false);
        this.Y = g90Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        g90 g90Var = this.Y;
        if (g90Var.f33897f.I() == null && g90Var.f33897f.U == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final mt0 D1(int i7) {
        TLRPC.PhotoSize w10;
        float f10;
        mt0 mt0Var = this.X;
        int i10 = 0;
        mt0Var.f36116c = false;
        g90 g90Var = this.Y;
        if (i7 == 0) {
            mt0Var.f36114a = this.f57140m;
            mt0Var.f36115b = g90Var.f33896e.h;
            mt0Var.f36116c = true;
            return mt0Var;
        }
        int i11 = i7 - 1;
        if (g90Var.f33897f.I() == null && g90Var.f33897f.U == null) {
            i7 = i11;
        }
        mt0Var.f36114a = 0.0f;
        mt0Var.f36115b = 0.0f;
        Object J = g90Var.f33897f.J(i7);
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
                mt0Var.f36114a = f10;
                if (w11 != null) {
                    f11 = w11.h;
                }
                mt0Var.f36115b = f11;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        mt0Var.f36114a = documentAttribute.f26963w;
                        mt0Var.f36115b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        mt0Var.f36114a = documentAttribute2.f26963w;
                        mt0Var.f36115b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        mt0Var.f36114a = documentAttribute3.f26963w;
                        mt0Var.f36115b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    mt0Var.f36114a = w10.f26981w;
                    mt0Var.f36115b = w10.h;
                }
            }
        }
        return mt0Var;
    }
}
