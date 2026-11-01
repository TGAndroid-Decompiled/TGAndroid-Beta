package org.telegram.ui.Cells;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.ic;
import org.telegram.messenger.jc;
import org.telegram.messenger.jf;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.h91;
public final class n5 extends org.telegram.ui.Components.g9 implements org.telegram.messenger.z5 {
    public RectF G;
    public RadialProgress2 H;
    public TLRPC.TL_wallPaper I;
    public int J;
    public LinearGradient K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public Paint Q;
    public jb0 R;
    public int S;
    public h91 T;
    public int U;

    @Override
    public final void D(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.T.f37764a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f19948id == tL_wallPaper.f19948id)) {
            if (z10) {
                this.H.setIcon(4, false, true);
            } else {
                v(tL_wallPaper2, true, z10);
            }
        }
    }

    @Override
    public final void N(String str) {
        this.H.p(true, 1.0f);
        TLRPC.TL_wallPaper tL_wallPaper = this.T.f37764a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f19948id == tL_wallPaper.f19948id)) {
            v(tL_wallPaper2, false, true);
        }
    }

    @Override
    public int getObserverTag() {
        return this.S;
    }

    @Override
    public final void i(long j10, long j11) {
        RadialProgress2 radialProgress2 = this.H;
        radialProgress2.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        TLRPC.TL_wallPaper tL_wallPaper = this.T.f37764a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if (((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f19948id == tL_wallPaper.f19948id)) && radialProgress2.f24129i.f27048q != 10) {
            v(tL_wallPaper2, false, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w(false);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(100.0f), org.telegram.messenger.i0.L(100.0f));
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.I = tL_wallPaper;
        if (tL_wallPaper != null) {
            g(1, 0L, tL_wallPaper, "100_100", null, "png", jc.c(org.telegram.messenger.b8.w(tL_wallPaper.document.thumbs, org.telegram.messenger.i0.L(100.0f), false, null, false), tL_wallPaper.document), null);
        } else {
            setImageDrawable(null);
        }
        w(false);
    }

    public final void v(Object obj, boolean z10, boolean z11) {
        File A;
        String name;
        int i10 = this.J;
        RadialProgress2 radialProgress2 = this.H;
        boolean z12 = obj instanceof TLRPC.TL_wallPaper;
        if (!z12 && !(obj instanceof jf)) {
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        if (z12) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            name = org.telegram.messenger.b8.r(null, tL_wallPaper.document);
            if (!TextUtils.isEmpty(name)) {
                org.telegram.messenger.b8.G(i10);
                A = org.telegram.messenger.b8.K(tL_wallPaper.document, null, true, true);
            } else {
                return;
            }
        } else {
            jf jfVar = (jf) obj;
            TLRPC.Photo photo = jfVar.K;
            if (photo != null) {
                TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, this.U, true, null, false);
                org.telegram.messenger.b8.G(i10);
                File K = org.telegram.messenger.b8.K(w9, null, true, true);
                name = org.telegram.messenger.b8.r(null, w9);
                A = K;
            } else {
                A = ic.A(jfVar.C);
                name = A.getName();
            }
            if (TextUtils.isEmpty(name)) {
                return;
            }
        }
        if (A.exists()) {
            org.telegram.messenger.b6.q(i10).v(this);
            radialProgress2.p(z11, 1.0f);
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        org.telegram.messenger.b6.q(i10).a(name, null, this);
        org.telegram.messenger.b8.G(i10).T(name);
        Float w10 = ic.D().w(name);
        if (w10 != null) {
            radialProgress2.p(z11, w10.floatValue());
        } else {
            radialProgress2.p(z11, 0.0f);
        }
        radialProgress2.setIcon(10, z10, z11);
    }

    public final void w(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.T.f37764a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f19948id == tL_wallPaper.f19948id)) {
            v(tL_wallPaper, false, z10);
        } else {
            this.H.setIcon(4, false, z10);
        }
        super.invalidate();
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
