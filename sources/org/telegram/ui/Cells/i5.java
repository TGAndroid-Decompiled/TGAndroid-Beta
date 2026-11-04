package org.telegram.ui.Cells;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.ac;
import org.telegram.messenger.bf;
import org.telegram.messenger.zb;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.la0;
import org.telegram.ui.i71;
public final class i5 extends org.telegram.ui.Components.k9 implements org.telegram.messenger.x5 {
    public RectF H;
    public RadialProgress2 I;
    public TLRPC.TL_wallPaper J;
    public int K;
    public LinearGradient L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public Paint R;
    public la0 S;
    public int T;
    public i71 U;
    public int V;

    @Override
    public final void C(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.U.f46162a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f27155id == tL_wallPaper.f27155id)) {
            if (z10) {
                this.I.setIcon(4, false, true);
            } else {
                v(tL_wallPaper2, true, z10);
            }
        }
    }

    @Override
    public final void M(String str) {
        this.I.p(true, 1.0f);
        TLRPC.TL_wallPaper tL_wallPaper = this.U.f46162a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f27155id == tL_wallPaper.f27155id)) {
            v(tL_wallPaper2, false, true);
        }
    }

    @Override
    public int getObserverTag() {
        return this.T;
    }

    @Override
    public final void i(long j10, long j11) {
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        TLRPC.TL_wallPaper tL_wallPaper = this.U.f46162a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if (((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f27155id == tL_wallPaper.f27155id)) && radialProgress2.f31554i.f36083q != 10) {
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
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(100.0f));
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.J = tL_wallPaper;
        if (tL_wallPaper != null) {
            g(1, 0L, tL_wallPaper, "100_100", null, "png", ac.c(org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false), tL_wallPaper.document), null);
        } else {
            setImageDrawable(null);
        }
        w(false);
    }

    public final void v(Object obj, boolean z10, boolean z11) {
        File A;
        String name;
        int i3 = this.K;
        RadialProgress2 radialProgress2 = this.I;
        boolean z12 = obj instanceof TLRPC.TL_wallPaper;
        if (!z12 && !(obj instanceof bf)) {
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        if (z12) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            name = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
            if (!TextUtils.isEmpty(name)) {
                org.telegram.messenger.w7.G(i3);
                A = org.telegram.messenger.w7.K(tL_wallPaper.document, null, true, true);
            } else {
                return;
            }
        } else {
            bf bfVar = (bf) obj;
            TLRPC.Photo photo = bfVar.K;
            if (photo != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.V, true, null, false);
                org.telegram.messenger.w7.G(i3);
                File K = org.telegram.messenger.w7.K(w10, null, true, true);
                name = org.telegram.messenger.w7.r(null, w10);
                A = K;
            } else {
                A = zb.A(bfVar.C);
                name = A.getName();
            }
            if (TextUtils.isEmpty(name)) {
                return;
            }
        }
        if (A.exists()) {
            org.telegram.messenger.z5.q(i3).v(this);
            radialProgress2.p(z11, 1.0f);
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        org.telegram.messenger.z5.q(i3).a(name, null, this);
        org.telegram.messenger.w7.G(i3).T(name);
        Float w11 = zb.D().w(name);
        if (w11 != null) {
            radialProgress2.p(z11, w11.floatValue());
        } else {
            radialProgress2.p(z11, 0.0f);
        }
        radialProgress2.setIcon(10, z10, z11);
    }

    public final void w(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.U.f46162a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f27155id == tL_wallPaper.f27155id)) {
            v(tL_wallPaper, false, z10);
        } else {
            this.I.setIcon(4, false, z10);
        }
        super.invalidate();
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
