package org.telegram.ui.Cells;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.kf;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.r71;
public final class i5 extends org.telegram.ui.Components.l9 implements org.telegram.messenger.x5 {
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
    public qa0 R;
    public int S;
    public r71 T;
    public int U;

    @Override
    public final void C(boolean z9) {
        TLRPC.TL_wallPaper tL_wallPaper = this.T.f49386a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f27106id == tL_wallPaper.f27106id)) {
            if (z9) {
                this.H.setIcon(4, false, true);
            } else {
                v(tL_wallPaper2, true, z9);
            }
        }
    }

    @Override
    public final void M(String str) {
        this.H.p(true, 1.0f);
        TLRPC.TL_wallPaper tL_wallPaper = this.T.f49386a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f27106id == tL_wallPaper.f27106id)) {
            v(tL_wallPaper2, false, true);
        }
    }

    @Override
    public int getObserverTag() {
        return this.S;
    }

    @Override
    public final void i(long j3, long j10) {
        RadialProgress2 radialProgress2 = this.H;
        radialProgress2.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        TLRPC.TL_wallPaper tL_wallPaper = this.T.f49386a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if (((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f27106id == tL_wallPaper.f27106id)) && radialProgress2.f31477i.f36935q != 10) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(100.0f));
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.I = tL_wallPaper;
        if (tL_wallPaper != null) {
            g(1, 0L, tL_wallPaper, "100_100", null, "png", hc.c(org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false), tL_wallPaper.document), null);
        } else {
            setImageDrawable(null);
        }
        w(false);
    }

    public final void v(Object obj, boolean z9, boolean z10) {
        File A;
        String name;
        int i7 = this.J;
        RadialProgress2 radialProgress2 = this.H;
        boolean z11 = obj instanceof TLRPC.TL_wallPaper;
        if (!z11 && !(obj instanceof kf)) {
            radialProgress2.setIcon(6, z9, z10);
            return;
        }
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            name = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
            if (!TextUtils.isEmpty(name)) {
                org.telegram.messenger.w7.G(i7);
                A = org.telegram.messenger.w7.K(tL_wallPaper.document, null, true, true);
            } else {
                return;
            }
        } else {
            kf kfVar = (kf) obj;
            TLRPC.Photo photo = kfVar.K;
            if (photo != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.U, true, null, false);
                org.telegram.messenger.w7.G(i7);
                File K = org.telegram.messenger.w7.K(w10, null, true, true);
                name = org.telegram.messenger.w7.r(null, w10);
                A = K;
            } else {
                A = gc.A(kfVar.C);
                name = A.getName();
            }
            if (TextUtils.isEmpty(name)) {
                return;
            }
        }
        if (A.exists()) {
            org.telegram.messenger.z5.q(i7).v(this);
            radialProgress2.p(z10, 1.0f);
            radialProgress2.setIcon(6, z9, z10);
            return;
        }
        org.telegram.messenger.z5.q(i7).a(name, null, this);
        org.telegram.messenger.w7.G(i7).T(name);
        Float w11 = gc.D().w(name);
        if (w11 != null) {
            radialProgress2.p(z10, w11.floatValue());
        } else {
            radialProgress2.p(z10, 0.0f);
        }
        radialProgress2.setIcon(10, z9, z10);
    }

    public final void w(boolean z9) {
        TLRPC.TL_wallPaper tL_wallPaper = this.T.f49386a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f27106id == tL_wallPaper.f27106id)) {
            v(tL_wallPaper, false, z9);
        } else {
            this.H.setIcon(4, false, z9);
        }
        super.invalidate();
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
