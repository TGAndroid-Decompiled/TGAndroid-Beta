package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class o90 extends wy {
    public final yt0 X;
    public final v90 Y;

    public o90(v90 v90Var) {
        super(100, false);
        this.Y = v90Var;
        this.X = new Object();
    }

    @Override
    public final int A() {
        v90 v90Var = this.Y;
        if (v90Var.f40698f.I() == null && v90Var.f40698f.V == null) {
            return B();
        }
        return B() - 1;
    }

    @Override
    public final yt0 D1(int i7) {
        TLRPC.PhotoSize w10;
        float f10;
        yt0 yt0Var = this.X;
        int i10 = 0;
        yt0Var.f42508c = false;
        v90 v90Var = this.Y;
        if (i7 == 0) {
            yt0Var.f42506a = this.f59206m;
            yt0Var.f42507b = v90Var.f40697e.h;
            yt0Var.f42508c = true;
            return yt0Var;
        }
        int i11 = i7 - 1;
        if (v90Var.f40698f.I() == null && v90Var.f40698f.V == null) {
            i7 = i11;
        }
        yt0Var.f42506a = 0.0f;
        yt0Var.f42507b = 0.0f;
        Object J = v90Var.f40698f.J(i7);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                float f11 = 100.0f;
                if (w11 != null) {
                    f10 = w11.f28423w;
                } else {
                    f10 = 100.0f;
                }
                yt0Var.f42506a = f10;
                if (w11 != null) {
                    f11 = w11.h;
                }
                yt0Var.f42507b = f11;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        yt0Var.f42506a = documentAttribute.f28405w;
                        yt0Var.f42507b = documentAttribute.h;
                        break;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        yt0Var.f42506a = documentAttribute2.f28405w;
                        yt0Var.f42507b = documentAttribute2.h;
                        break;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10++;
                    } else {
                        yt0Var.f42506a = documentAttribute3.f28405w;
                        yt0Var.f42507b = documentAttribute3.h;
                        break;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    yt0Var.f42506a = w10.f28423w;
                    yt0Var.f42507b = w10.h;
                }
            }
        }
        return yt0Var;
    }
}
