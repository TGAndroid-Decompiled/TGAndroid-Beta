package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class v80 extends hy {
    public final lt0 X;
    public final c90 Y;

    public v80(c90 c90Var) {
        super(100, false);
        this.Y = c90Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        c90 c90Var = this.Y;
        if (c90Var.f32614f.I() == null && c90Var.f32614f.V == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final lt0 D1(int i3) {
        TLRPC.PhotoSize w10;
        float f10;
        lt0 lt0Var = this.X;
        int i10 = 0;
        lt0Var.f35879c = false;
        c90 c90Var = this.Y;
        if (i3 == 0) {
            lt0Var.f35877a = this.f55639m;
            lt0Var.f35878b = c90Var.f32613e.h;
            lt0Var.f35879c = true;
            return lt0Var;
        }
        int i11 = i3 - 1;
        if (c90Var.f32614f.I() == null && c90Var.f32614f.V == null) {
            i3 = i11;
        }
        lt0Var.f35877a = 0.0f;
        lt0Var.f35878b = 0.0f;
        Object J = c90Var.f32614f.J(i3);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                float f11 = 100.0f;
                if (w11 != null) {
                    f10 = w11.f27026w;
                } else {
                    f10 = 100.0f;
                }
                lt0Var.f35877a = f10;
                if (w11 != null) {
                    f11 = w11.h;
                }
                lt0Var.f35878b = f11;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        lt0Var.f35877a = documentAttribute.f27008w;
                        lt0Var.f35878b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        lt0Var.f35877a = documentAttribute2.f27008w;
                        lt0Var.f35878b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        lt0Var.f35877a = documentAttribute3.f27008w;
                        lt0Var.f35878b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    lt0Var.f35877a = w10.f27026w;
                    lt0Var.f35878b = w10.h;
                }
            }
        }
        return lt0Var;
    }
}
