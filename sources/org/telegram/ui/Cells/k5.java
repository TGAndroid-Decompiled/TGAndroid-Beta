package org.telegram.ui.Cells;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.hf;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.u71;
public final class k5 extends org.telegram.ui.Components.q9 implements org.telegram.messenger.y5 {
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
    public bb0 S;
    public int T;
    public u71 U;
    public int V;

    @Override
    public final void C(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.U.f52459a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f28557id == tL_wallPaper.f28557id)) {
            if (z10) {
                this.I.setIcon(4, false, true);
            } else {
                v(tL_wallPaper2, true, z10);
            }
        }
    }

    @Override
    public final void N(String str) {
        this.I.p(true, 1.0f);
        TLRPC.TL_wallPaper tL_wallPaper = this.U.f52459a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f28557id == tL_wallPaper.f28557id)) {
            v(tL_wallPaper2, false, true);
        }
    }

    @Override
    public int getObserverTag() {
        return this.T;
    }

    @Override
    public final void i(long j3, long j10) {
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        TLRPC.TL_wallPaper tL_wallPaper = this.U.f52459a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if (((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f28557id == tL_wallPaper.f28557id)) && radialProgress2.f33058i.f34340q != 10) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(100.0f));
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.J = tL_wallPaper;
        if (tL_wallPaper != null) {
            g(1, 0L, tL_wallPaper, "100_100", null, "png", fc.c(org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false), tL_wallPaper.document), null);
        } else {
            setImageDrawable(null);
        }
        w(false);
    }

    public final void v(Object obj, boolean z10, boolean z11) {
        File A;
        String name;
        int i7 = this.K;
        RadialProgress2 radialProgress2 = this.I;
        boolean z12 = obj instanceof TLRPC.TL_wallPaper;
        if (!z12 && !(obj instanceof hf)) {
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        if (z12) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            name = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
            if (!TextUtils.isEmpty(name)) {
                org.telegram.messenger.w7.G(i7);
                A = org.telegram.messenger.w7.J(tL_wallPaper.document, null, true, true);
            } else {
                return;
            }
        } else {
            hf hfVar = (hf) obj;
            TLRPC.Photo photo = hfVar.K;
            if (photo != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.V, true, null, false);
                org.telegram.messenger.w7.G(i7);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                name = org.telegram.messenger.w7.r(null, w10);
                A = J;
            } else {
                A = ec.A(hfVar.C);
                name = A.getName();
            }
            if (TextUtils.isEmpty(name)) {
                return;
            }
        }
        if (A.exists()) {
            org.telegram.messenger.a6.q(i7).v(this);
            radialProgress2.p(z11, 1.0f);
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        org.telegram.messenger.a6.q(i7).a(name, null, this);
        org.telegram.messenger.w7.G(i7).S(name);
        Float w11 = ec.D().w(name);
        if (w11 != null) {
            radialProgress2.p(z11, w11.floatValue());
        } else {
            radialProgress2.p(z11, 0.0f);
        }
        radialProgress2.setIcon(10, z10, z11);
    }

    public final void w(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.U.f52459a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.f28557id == tL_wallPaper.f28557id)) {
            v(tL_wallPaper, false, z10);
        } else {
            this.I.setIcon(4, false, z10);
        }
        super.invalidate();
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
