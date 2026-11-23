package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.xm0;
public final class yt extends au implements y5, gs {
    public final gj X;
    public final TLRPC.Document Y;
    public final RadialProgress2 Z;
    public final xm0 f28161a0;
    public final TextPaint f28162b0;
    public StaticLayout f28163c0;
    public StaticLayout f28164d0;
    public String f28165e0;
    public final int f28166f0;
    public final int f28167g0;
    public final int f28168h0;
    public int f28169i0;
    public int f28170j0;
    public int f28171k0;
    public int f28172l0;
    public boolean m0;
    public final RectF f28173n0;
    public int f28174o0;
    public boolean f28175p0;
    public boolean f28176q0;
    public final int f28177r0;

    public yt(fv fvVar, Rect rect, int i7, TL_iv.pageBlockAudio pageblockaudio) {
        super(fvVar, rect, i7);
        TLRPC.Document document;
        this.f28162b0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.f28166f0 = L;
        int L2 = g0.L(9.0f);
        this.f28167g0 = L2;
        int L3 = g0.L(44.0f);
        this.f28168h0 = L3;
        this.f28172l0 = -1;
        this.f28173n0 = new RectF();
        gj gjVar = (gj) fvVar.f23950m.get(pageblockaudio);
        this.X = gjVar;
        if (gjVar != null) {
            document = gjVar.F0();
        } else {
            document = null;
        }
        this.Y = document;
        this.f28177r0 = a6.q(fvVar.f23940a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Z = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(24.0f));
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        xm0 xm0Var = new xm0(null);
        this.f28161a0 = xm0Var;
        xm0Var.h = new j1(this, 16);
        k0();
        l0(false);
    }

    @Override
    public final void C(boolean z10) {
        l0(true);
    }

    @Override
    public final int I() {
        Rect rect = this.f22933b;
        return g0.L(62.0f) + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final void N(String str) {
        this.Z.p(true, 1.0f);
        l0(true);
    }

    @Override
    public final boolean Q() {
        return this.f28161a0.f42128e;
    }

    @Override
    public final void T() {
        View view = this.W;
        if (view != null) {
            this.Z.n(view);
            this.f28161a0.f42141s = this.W;
        }
        l0(false);
        fv fvVar = this.f22932a;
        int i7 = fvVar.f23940a;
        int i10 = fvVar.f23940a;
        ls.f(i7).c(this, ls.f25282h2);
        ls.f(i10).c(this, ls.f25270f2);
        ls.f(i10).c(this, ls.f25276g2);
        ls.f(i10).c(this, ls.f25264e2);
    }

    @Override
    public final void V() {
        fv fvVar = this.f22932a;
        a6.q(fvVar.f23940a).v(this);
        int i7 = fvVar.f23940a;
        ls.f(i7).n(this, ls.f25282h2);
        ls.f(i7).n(this, ls.f25270f2);
        ls.f(i7).n(this, ls.f25276g2);
        ls.f(i7).n(this, ls.f25264e2);
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Drawable drawable;
        if (this.X != null && this.Y != null) {
            int i19 = this.f28172l0;
            int i20 = this.f22934c;
            fv fvVar = this.f22932a;
            if (i19 != i20 + fvVar.S + fvVar.T || this.m0 != i0()) {
                k0();
            }
            canvas.save();
            canvas.translate(-fvVar.S, 0.0f);
            if (fvVar.E()) {
                i7 = org.telegram.ui.ActionBar.m6.Ec;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.Ze;
            }
            if (fvVar.E()) {
                i10 = org.telegram.ui.ActionBar.m6.Fc;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.f29298af;
            }
            if (fvVar.E()) {
                i11 = org.telegram.ui.ActionBar.m6.Gb;
            } else {
                i11 = org.telegram.ui.ActionBar.m6.f29501ld;
            }
            if (fvVar.E()) {
                i12 = org.telegram.ui.ActionBar.m6.Hb;
            } else {
                i12 = org.telegram.ui.ActionBar.m6.f29517md;
            }
            RadialProgress2 radialProgress2 = this.Z;
            radialProgress2.g(i7, i10, i11, i12);
            if (fvVar.E()) {
                i13 = org.telegram.ui.ActionBar.m6.f29669uc;
            } else {
                i13 = org.telegram.ui.ActionBar.m6.f29632se;
            }
            radialProgress2.d = org.telegram.ui.ActionBar.m6.w0(i13, fvVar.D);
            radialProgress2.draw(canvas);
            if (fvVar.E()) {
                i14 = org.telegram.ui.ActionBar.m6.f29535nc;
            } else {
                i14 = org.telegram.ui.ActionBar.m6.le;
            }
            int w02 = org.telegram.ui.ActionBar.m6.w0(i14, fvVar.D);
            if (fvVar.E()) {
                i15 = org.telegram.ui.ActionBar.m6.f29553oc;
            } else {
                i15 = org.telegram.ui.ActionBar.m6.f29518me;
            }
            int w03 = org.telegram.ui.ActionBar.m6.w0(i15, fvVar.D);
            if (fvVar.E()) {
                i16 = org.telegram.ui.ActionBar.m6.f29593qc;
            } else {
                i16 = org.telegram.ui.ActionBar.m6.f29555oe;
            }
            int w04 = org.telegram.ui.ActionBar.m6.w0(i16, fvVar.D);
            if (fvVar.E()) {
                i17 = org.telegram.ui.ActionBar.m6.f29593qc;
            } else {
                i17 = org.telegram.ui.ActionBar.m6.f29555oe;
            }
            int w05 = org.telegram.ui.ActionBar.m6.w0(i17, fvVar.D);
            if (fvVar.E()) {
                i18 = org.telegram.ui.ActionBar.m6.f29573pc;
            } else {
                i18 = org.telegram.ui.ActionBar.m6.ne;
            }
            int w06 = org.telegram.ui.ActionBar.m6.w0(i18, fvVar.D);
            xm0 xm0Var = this.f28161a0;
            xm0Var.g(w02, w03, w04, w05, w06);
            canvas.save();
            canvas.translate(this.f28169i0, this.f28170j0);
            xm0Var.b(canvas);
            canvas.restore();
            StaticLayout staticLayout = this.f28164d0;
            int i21 = this.f28166f0;
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(g0.L(54.0f) + i21, g0.L(6.0f) + this.f28170j0);
                this.f28164d0.draw(canvas);
                canvas.restore();
            }
            if (this.f28163c0 != null) {
                canvas.save();
                canvas.translate(g0.L(54.0f) + i21, this.f28170j0 - g0.L(16.0f));
                this.f28163c0.draw(canvas);
                canvas.restore();
            }
            boolean z10 = this.m0;
            RectF rectF = this.f28173n0;
            if (z10) {
                if (fvVar.E()) {
                    org.telegram.ui.ActionBar.h6 h6Var = fvVar.D;
                    if (h6Var != null) {
                        drawable = h6Var.getDrawable("drawableMsgOutMenu");
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        drawable = org.telegram.ui.ActionBar.m6.R0("drawableMsgOutMenu");
                    }
                } else {
                    drawable = org.telegram.ui.ActionBar.m6.f29327c4;
                }
                int L = (this.f28172l0 + this.f22933b.right) - g0.L(32.0f);
                int L2 = g0.L(7.0f);
                drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L, drawable.getIntrinsicHeight() + L2);
                drawable.draw(canvas);
                rectF.set(L - g0.L(8.0f), 0.0f, g0.L(8.0f) + drawable.getIntrinsicWidth() + L, g0.L(54.0f));
            } else {
                rectF.setEmpty();
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        int i10;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        fv fvVar = this.f22932a;
        float f10 = x10 + fvVar.S;
        float y10 = motionEvent.getY();
        boolean contains = this.f28173n0.contains(f10, y10);
        if (actionMasked == 0 && contains) {
            this.f28176q0 = true;
            return true;
        }
        boolean z11 = this.f28176q0;
        TLRPC.Document document = this.Y;
        if (z11) {
            if (actionMasked == 2 && !contains) {
                this.f28176q0 = false;
                return true;
            } else if (actionMasked == 1 || actionMasked == 3) {
                if (actionMasked == 1 && contains) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f28176q0 = false;
                if (z10 && i0()) {
                    View view = this.W;
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    fvVar.F.N(fvVar.E, document, F());
                    return true;
                }
                return true;
            }
        }
        if (this.f28161a0.e(f10 - this.f28169i0, y10 - this.f28170j0, actionMasked)) {
            if (actionMasked == 0) {
                a0(true);
            }
            if (actionMasked == 1 || actionMasked == 3) {
                a0(false);
            }
            View view2 = this.W;
            if (view2 != null) {
                view2.invalidate();
                return true;
            }
        } else if (actionMasked == 0) {
            if (this.f28174o0 != -1) {
                if (f10 >= this.f28166f0 && f10 <= g0.L(48.0f) + i7) {
                    if (y10 >= this.f28167g0 && y10 <= g0.L(48.0f) + i10) {
                        this.f28175p0 = true;
                        View view3 = this.W;
                        if (view3 != null) {
                            view3.invalidate();
                            return true;
                        }
                    }
                }
            }
            return this.f28175p0;
        } else {
            if (actionMasked == 1) {
                if (this.f28175p0) {
                    this.f28175p0 = false;
                    View view4 = this.W;
                    if (view4 != null) {
                        view4.playSoundEffect(0);
                    }
                    int i11 = fvVar.f23940a;
                    int i12 = this.f28174o0;
                    RadialProgress2 radialProgress2 = this.Z;
                    if (i12 == 0) {
                        if (MediaController.B().o0(fvVar.f23949l, this.X, 0L, false, null, 0L)) {
                            this.f28174o0 = 1;
                            radialProgress2.setIcon(j0(), false, true);
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                            }
                        }
                    } else if (i12 == 1) {
                        if (MediaController.B().R(this.X, true)) {
                            this.f28174o0 = 0;
                            radialProgress2.setIcon(j0(), false, true);
                            View view6 = this.W;
                            if (view6 != null) {
                                view6.invalidate();
                            }
                        }
                    } else if (i12 == 2) {
                        radialProgress2.p(false, 0.0f);
                        w7.G(i11).W(document, fvVar.f23941b, 1, 1);
                        this.f28174o0 = 3;
                        radialProgress2.setIcon(j0(), true, true);
                        View view7 = this.W;
                        if (view7 != null) {
                            view7.invalidate();
                        }
                    } else if (i12 == 3) {
                        w7.G(i11).f(document);
                        this.f28174o0 = 2;
                        radialProgress2.setIcon(j0(), false, true);
                        View view8 = this.W;
                        if (view8 != null) {
                            view8.invalidate();
                        }
                    }
                    View view9 = this.W;
                    if (view9 != null) {
                        view9.invalidate();
                    }
                }
            } else if (actionMasked == 3) {
                this.f28175p0 = false;
            }
            return this.f28175p0;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        gj gjVar;
        gj gjVar2 = this.X;
        if (gjVar2 != null) {
            if (i7 == ls.f25282h2) {
                l0(true);
            } else if (i7 != ls.f25270f2 && i7 != ls.f25276g2) {
                if (i7 == ls.f25264e2 && gjVar2.e1() == ((Integer) objArr[0]).intValue() && (gjVar = MediaController.B().f22735v0) != null) {
                    gjVar2.f24137b0 = gjVar.f24137b0;
                    gjVar2.f24169i0 = gjVar.f24169i0;
                    gjVar2.f24174j0 = gjVar.f24174j0;
                    m0();
                }
            } else {
                l0(true);
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.f28177r0;
    }

    @Override
    public final void i(long j3, long j10) {
        float f10;
        if (j10 <= 0) {
            f10 = 0.0f;
        } else {
            f10 = ((float) j3) / ((float) j10);
        }
        this.Z.p(true, Math.min(1.0f, f10));
        if (this.f28174o0 != 3) {
            l0(true);
        }
    }

    public final boolean i0() {
        fv fvVar;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Cells.m1 m1Var;
        if (this.Y != null && (r1Var = (fvVar = this.f22932a).E) != null && (m1Var = fvVar.F) != null && m1Var.d0(r1Var)) {
            return true;
        }
        return false;
    }

    public final int j0() {
        int i7 = this.f28174o0;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        if (i7 == 3) {
            return 3;
        }
        return 0;
    }

    public final void k0() {
        float f10;
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        fv fvVar = this.f22932a;
        this.f28172l0 = this.f22934c + fvVar.S + fvVar.T;
        this.m0 = i0();
        int L = g0.L(50.0f) + this.f28166f0;
        int i7 = this.f28168h0;
        int i10 = L + i7;
        this.f28169i0 = i10;
        int i11 = this.f28172l0 - i10;
        if (this.m0) {
            f10 = 42.0f;
        } else {
            f10 = 18.0f;
        }
        this.f28171k0 = i5.c.d(f10, i11, 0);
        gj gjVar = this.X;
        if (gjVar != null) {
            str = gjVar.w1(false);
        } else {
            str = null;
        }
        if (gjVar != null) {
            str2 = gjVar.y1(false);
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i12 = this.f28167g0;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.f28163c0 = null;
            this.f28170j0 = ((i7 - g0.L(30.0f)) / 2) + i12;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(a8.p0.E(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new l41(g0.o()), 0, str.length(), 18);
            }
            this.f28162b0.setTextSize(g0.L(16.0f));
            int L2 = g0.L(50.0f) + this.f28171k0;
            this.f28163c0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.m6.O2, L2, TextUtils.TruncateAt.END), this.f28162b0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f28170j0 = g0.L(11.0f) + ((i7 - g0.L(30.0f)) / 2) + i12;
        }
        this.f28161a0.i(this.f28171k0, g0.L(30.0f));
    }

    public final void l0(boolean z10) {
        File J;
        boolean z11;
        int i7 = this.f22932a.f23940a;
        TLRPC.Document document = this.Y;
        String r10 = w7.r(null, document);
        int i10 = 1;
        if (document == null) {
            J = null;
        } else {
            w7.G(i7);
            J = w7.J(document, null, true, true);
        }
        if (J != null && J.exists()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.Z;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        gj gjVar = this.X;
        if (z11) {
            a6.q(i7).v(this);
            if (MediaController.B().I(gjVar) && !MediaController.B().H()) {
                this.f28174o0 = 1;
            } else {
                this.f28174o0 = 0;
            }
            radialProgress2.setIcon(j0(), false, z10);
        } else {
            a6.q(i7).a(r10, null, this);
            if (cz.B0 && gjVar != null && gjVar.I3() && !gj.R5(gjVar.f24177k) && !n5.C(gj.B0(gjVar.f24177k))) {
                if (!MediaController.B().I(gjVar) || MediaController.B().H()) {
                    i10 = 0;
                }
                this.f28174o0 = i10;
                radialProgress2.setIcon(j0(), false, z10);
            } else {
                float f10 = 0.0f;
                if (!w7.G(i7).S(r10)) {
                    this.f28174o0 = 2;
                    radialProgress2.p(z10, 0.0f);
                    radialProgress2.setIcon(j0(), false, z10);
                } else {
                    this.f28174o0 = 3;
                    Float w10 = fc.D().w(r10);
                    if (w10 != null) {
                        f10 = w10.floatValue();
                    }
                    radialProgress2.p(z10, f10);
                    radialProgress2.setIcon(j0(), true, z10);
                }
            }
        }
        m0();
    }

    public final void m0() {
        gj gjVar;
        int i7;
        int i10;
        TLRPC.Document document = this.Y;
        if (document != null && (gjVar = this.X) != null) {
            xm0 xm0Var = this.f28161a0;
            if (!xm0Var.f42128e) {
                xm0Var.h(gjVar.f24137b0);
            }
            if (MediaController.B().I(gjVar)) {
                i7 = gjVar.f24169i0;
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 < document.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            i7 = (int) documentAttribute.duration;
                            break;
                        }
                        i11++;
                    } else {
                        i7 = 0;
                        break;
                    }
                }
            }
            String g02 = g0.g0(i7, false, false);
            String str = this.f28165e0;
            TextPaint textPaint = this.f28162b0;
            if (str == null || !str.equals(g02)) {
                this.f28165e0 = g02;
                textPaint.setTextSize(g0.L(16.0f));
                this.f28164d0 = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            fv fvVar = this.f22932a;
            if (fvVar.E()) {
                i10 = org.telegram.ui.ActionBar.m6.Wc;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.Vc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, fvVar.D));
            View view = this.W;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
