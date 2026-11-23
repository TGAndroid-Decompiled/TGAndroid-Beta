package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class zu extends mu {
    public final TL_iv.pageBlockVideo f28377r0;
    public final TLRPC.Document f28378s0;
    public final TLRPC.PhotoSize f28379t0;
    public final TLRPC.TL_photoStrippedSize f28380u0;
    public final boolean f28381v0;
    public final boolean f28382w0;

    public zu(fv fvVar, Rect rect, int i7, TL_iv.pageBlockVideo pageblockvideo, boolean z10) {
        super(fvVar, rect, i7, z10);
        boolean z11;
        int i10;
        int i11;
        this.f28377r0 = pageblockvideo;
        TLRPC.Document s5 = fvVar.s(pageblockvideo.video_id);
        this.f28378s0 = s5;
        boolean K4 = gj.K4(s5);
        this.f28382w0 = K4;
        int i12 = 0;
        if (!K4 && !gj.s3(s5, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f28381v0 = z11;
        if (s5 != null) {
            this.f28379t0 = w7.w(s5.thumbs, 320, false, null, true);
            this.f28380u0 = w7.Q(s5.thumbs);
        } else {
            this.f28379t0 = null;
            this.f28380u0 = null;
        }
        if (s5 != null) {
            while (true) {
                if (i12 < this.f28378s0.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = this.f28378s0.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        i11 = documentAttribute.f28441w;
                        i10 = documentAttribute.h;
                        break;
                    }
                    i12++;
                } else {
                    i10 = 100;
                    i11 = 100;
                    break;
                }
            }
            if (i11 <= 0 || i10 <= 0) {
                TLRPC.PhotoSize photoSize = this.f28379t0;
                if (photoSize != null) {
                    i11 = photoSize.f28459w;
                } else {
                    i11 = 100;
                }
                i10 = photoSize != null ? photoSize.h : 100;
            }
            r4 = i11;
        } else {
            i10 = 100;
        }
        int i13 = this.f22970c;
        int max = (int) ((i13 / Math.max(1, r4)) * i10);
        Point point = g0.f24046q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i13 = (int) ((max2 / Math.max(1, i10)) * r4);
            max = max2;
        }
        this.f25634c0 = i13;
        this.f25635d0 = max;
        m0();
    }

    @Override
    public final boolean i0() {
        if (this.f28382w0) {
            int i7 = cz.f23390a;
            return qc.e(1024);
        }
        int i10 = cz.f23390a;
        return qc.e(2048);
    }

    @Override
    public final void j0(boolean z10) {
        gc gcVar;
        TLRPC.Document document = this.f28378s0;
        if (document == null) {
            return;
        }
        gc gcVar2 = null;
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f28380u0;
        if (tL_photoStrippedSize != null) {
            gcVar = gc.c(tL_photoStrippedSize, document);
        } else {
            gcVar = null;
        }
        TLRPC.PhotoSize photoSize = this.f28379t0;
        if (photoSize != null) {
            gcVar2 = gc.c(photoSize, document);
        }
        gc gcVar3 = gcVar2;
        fv fvVar = this.f22968a;
        ImageReceiver imageReceiver = this.Y;
        if (z10 && this.f28381v0 && (i0() || this.m0)) {
            imageReceiver.f22695u0 = true;
            imageReceiver.W(1);
            imageReceiver.u0(gc.b(document), "g", gcVar3, null, gcVar, "b1", null, document.size, "mp4", fvVar.f23977b, 1);
            return;
        }
        imageReceiver.u0(null, null, gcVar3, null, gcVar, "b1", null, document.size, "mp4", fvVar.f23977b, 1);
    }

    @Override
    public final boolean k0() {
        TLRPC.Document document = this.f28378s0;
        if (document == null) {
            return false;
        }
        if (!this.f28381v0) {
            return true;
        }
        if (!i0() || !a6.q(this.f22968a.f23976a).c(4, document.size)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean l0() {
        TLRPC.Document document = this.f28378s0;
        if (document != null) {
            fv fvVar = this.f22968a;
            w7.G(fvVar.f23976a);
            File I = w7.I(document);
            w7.G(fvVar.f23976a);
            File J = w7.J(document, null, true, true);
            if ((I == null || !I.exists()) && (J == null || !J.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock n0() {
        return this.f28377r0;
    }

    @Override
    public final String o0() {
        return w7.r(null, this.f28378s0);
    }

    @Override
    public final boolean p0() {
        return this.f28381v0;
    }

    @Override
    public final boolean q0() {
        return this.f28382w0;
    }

    @Override
    public final boolean r0() {
        TL_iv.pageBlockVideo pageblockvideo = this.f28377r0;
        if (pageblockvideo != null && pageblockvideo.spoiler) {
            return true;
        }
        return false;
    }
}
