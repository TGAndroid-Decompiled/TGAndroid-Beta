package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class yu extends lu {
    public final TL_iv.pageBlockVideo f28281r0;
    public final TLRPC.Document f28282s0;
    public final TLRPC.PhotoSize f28283t0;
    public final TLRPC.TL_photoStrippedSize f28284u0;
    public final boolean f28285v0;
    public final boolean f28286w0;

    public yu(ev evVar, Rect rect, int i7, TL_iv.pageBlockVideo pageblockvideo, boolean z10) {
        super(evVar, rect, i7, z10);
        boolean z11;
        int i10;
        int i11;
        this.f28281r0 = pageblockvideo;
        TLRPC.Document s5 = evVar.s(pageblockvideo.video_id);
        this.f28282s0 = s5;
        boolean K4 = fj.K4(s5);
        this.f28286w0 = K4;
        int i12 = 0;
        if (!K4 && !fj.s3(s5, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f28285v0 = z11;
        if (s5 != null) {
            this.f28283t0 = w7.w(s5.thumbs, 320, false, null, true);
            this.f28284u0 = w7.Q(s5.thumbs);
        } else {
            this.f28283t0 = null;
            this.f28284u0 = null;
        }
        if (s5 != null) {
            while (true) {
                if (i12 < this.f28282s0.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = this.f28282s0.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        i11 = documentAttribute.f28499w;
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
                TLRPC.PhotoSize photoSize = this.f28283t0;
                if (photoSize != null) {
                    i11 = photoSize.f28517w;
                } else {
                    i11 = 100;
                }
                i10 = photoSize != null ? photoSize.h : 100;
            }
            r4 = i11;
        } else {
            i10 = 100;
        }
        int i13 = this.f28443c;
        int max = (int) ((i13 / Math.max(1, r4)) * i10);
        Point point = g0.f24226q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i13 = (int) ((max2 / Math.max(1, i10)) * r4);
            max = max2;
        }
        this.f25547c0 = i13;
        this.f25548d0 = max;
        m0();
    }

    @Override
    public final boolean i0() {
        if (this.f28286w0) {
            int i7 = bz.f23270a;
            return pc.e(1024);
        }
        int i10 = bz.f23270a;
        return pc.e(2048);
    }

    @Override
    public final void j0(boolean z10) {
        fc fcVar;
        TLRPC.Document document = this.f28282s0;
        if (document == null) {
            return;
        }
        fc fcVar2 = null;
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f28284u0;
        if (tL_photoStrippedSize != null) {
            fcVar = fc.c(tL_photoStrippedSize, document);
        } else {
            fcVar = null;
        }
        TLRPC.PhotoSize photoSize = this.f28283t0;
        if (photoSize != null) {
            fcVar2 = fc.c(photoSize, document);
        }
        fc fcVar3 = fcVar2;
        ev evVar = this.f28441a;
        ImageReceiver imageReceiver = this.Y;
        if (z10 && this.f28285v0 && (i0() || this.m0)) {
            imageReceiver.f22762u0 = true;
            imageReceiver.X(1);
            imageReceiver.v0(fc.b(document), "g", fcVar3, null, fcVar, "b1", null, document.size, "mp4", evVar.f23873b, 1);
            return;
        }
        imageReceiver.v0(null, null, fcVar3, null, fcVar, "b1", null, document.size, "mp4", evVar.f23873b, 1);
    }

    @Override
    public final boolean k0() {
        TLRPC.Document document = this.f28282s0;
        if (document == null) {
            return false;
        }
        if (!this.f28285v0) {
            return true;
        }
        if (!i0() || !a6.q(this.f28441a.f23872a).c(4, document.size)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean l0() {
        TLRPC.Document document = this.f28282s0;
        if (document != null) {
            ev evVar = this.f28441a;
            w7.G(evVar.f23872a);
            File I = w7.I(document);
            w7.G(evVar.f23872a);
            File J = w7.J(document, null, true, true);
            if ((I == null || !I.exists()) && (J == null || !J.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock n0() {
        return this.f28281r0;
    }

    @Override
    public final String o0() {
        return w7.r(null, this.f28282s0);
    }

    @Override
    public final boolean p0() {
        return this.f28285v0;
    }

    @Override
    public final boolean q0() {
        return this.f28286w0;
    }

    @Override
    public final boolean r0() {
        TL_iv.pageBlockVideo pageblockvideo = this.f28281r0;
        if (pageblockvideo != null && pageblockvideo.spoiler) {
            return true;
        }
        return false;
    }
}
