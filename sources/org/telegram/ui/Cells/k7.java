package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.ic;
import org.telegram.messenger.kj;
import org.telegram.messenger.s20;
import org.telegram.messenger.uz;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.zz;
public class k7 extends FrameLayout implements org.telegram.messenger.z5, vs, org.telegram.ui.ActionBar.k6 {
    public int D;
    public org.telegram.ui.Components.k5 E;
    public float F;
    public float G;
    public StaticLayout H;
    public int I;
    public org.telegram.ui.Components.k5 J;
    public float K;
    public float L;
    public StaticLayout M;
    public kj N;
    public boolean O;
    public final int P;
    public final int Q;
    public int R;
    public int S;
    public final RadialProgress2 T;
    public final int U;
    public StaticLayout V;
    public int W;
    public final SpannableStringBuilder f22156a;
    public final TextPaint f22157a0;
    public final ep f22158b;
    public final TextPaint f22159b0;
    public boolean f22160c;
    public final org.telegram.ui.ActionBar.p6 f22161c0;
    public boolean d;
    public boolean f22162d0;
    public boolean e;
    public float f22163e0;
    public int f22164f;
    public boolean f22165f0;
    public float f22166g0;
    public int h;
    public final TextPaint f22167h0;
    public s20 f22168i0;
    public float f22169j0;
    public zz f22170k0;
    public int f22171n;
    public final int f22172r;
    public StaticLayout f22173s;
    public float f22174w;
    public float f22175x;
    public org.telegram.ui.Components.k5 f22176y;

    public k7(Context context) {
        this(0, context, null);
    }

    private int getIconForCurrentState() {
        int i10 = this.R;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i10 = this.S;
        if (i10 < 0) {
            return 4;
        }
        if (i10 == 0) {
            return 2;
        }
        return 3;
    }

    @Override
    public final void D(boolean z10) {
        g(true, z10);
    }

    @Override
    public final void N(String str) {
        this.T.p(true, 1.0f);
        g(false, true);
    }

    public void a() {
        int i10 = this.R;
        int i11 = this.P;
        RadialProgress2 radialProgress2 = this.T;
        if (i10 == 0) {
            if (this.S == 0) {
                this.N.P = true;
                org.telegram.messenger.b8.G(i11).X(this.N.F0(), this.N, 1, 0);
            }
            if (d(this.N)) {
                if (this.f22164f == 2 && this.S != 1) {
                    this.S = 1;
                    radialProgress2.p(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.R = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 1) {
            if (MediaController.B().R(this.N, true)) {
                this.R = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 2) {
            radialProgress2.p(false, 0.0f);
            this.N.P = true;
            org.telegram.messenger.b8.G(i11).X(this.N.F0(), this.N, 1, 0);
            this.R = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i10 == 4) {
            org.telegram.messenger.b8.G(i11).f(this.N.F0());
            this.R = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        float f13;
        float f14;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var = this.f22161c0;
        if (this.U == 1) {
            this.f22157a0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A6, p6Var));
        }
        StaticLayout staticLayout2 = this.V;
        int i12 = this.f22172r;
        int i13 = 0;
        float f15 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (dd.X) {
                f14 = 24.0f;
            } else {
                f14 = org.telegram.messenger.i0.C;
            }
            int L = org.telegram.messenger.i0.L(f14);
            if (dd.X) {
                i11 = 0;
            } else {
                i11 = this.W;
            }
            canvas.translate(L + i11, i12);
            this.V.draw(canvas);
            canvas.restore();
        }
        float f16 = 0.0f;
        if (this.f22173s != null) {
            int alpha = org.telegram.ui.ActionBar.t6.f20964f3.getAlpha();
            float f17 = this.f22166g0;
            if (f17 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f20964f3.setAlpha((int) (alpha * f17));
            }
            canvas.save();
            if (dd.X) {
                f11 = 24.0f;
            } else {
                f11 = org.telegram.messenger.i0.C;
            }
            int L2 = org.telegram.messenger.i0.L(f11);
            if (dd.X && (staticLayout = this.V) != null) {
                int width = staticLayout.getWidth();
                if (dd.X) {
                    f13 = 12.0f;
                } else {
                    f13 = 4.0f;
                }
                i13 = width + org.telegram.messenger.i0.L(f13);
            }
            float f18 = L2 + i13;
            if (dd.X) {
                f12 = this.f22173s.getWidth() - this.f22175x;
            } else {
                f12 = 0.0f;
            }
            canvas.translate((f18 + f12) - this.f22174w, i12);
            this.f22173s.draw(canvas);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.f22173s, this.f22176y, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f22166g0 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f20964f3.setAlpha(alpha);
            }
        }
        if (this.M != null) {
            this.f22159b0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            canvas.save();
            if (dd.X) {
                f7 = 24.0f;
            } else {
                f7 = org.telegram.messenger.i0.C;
            }
            float L3 = org.telegram.messenger.i0.L(f7);
            if (dd.X) {
                f10 = this.M.getWidth() - this.L;
            } else {
                f10 = 0.0f;
            }
            canvas.translate((L3 + f10) - this.K, this.I);
            this.M.draw(canvas);
            canvas.restore();
        }
        if (this.H != null) {
            org.telegram.ui.ActionBar.t6.f20983g3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21331z6, p6Var));
            int alpha2 = org.telegram.ui.ActionBar.t6.f20983g3.getAlpha();
            float f19 = this.f22166g0;
            if (f19 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f20983g3.setAlpha((int) (alpha2 * f19));
            }
            canvas.save();
            if (!dd.X) {
                f15 = org.telegram.messenger.i0.C;
            }
            float L4 = org.telegram.messenger.i0.L(f15);
            if (dd.X) {
                f16 = this.H.getWidth() - this.G;
            }
            canvas.translate((L4 + f16) - this.F, this.D);
            this.H.draw(canvas);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.H, this.E, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f22166g0 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f20983g3.setAlpha(alpha2);
            }
        }
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.t6.Xd;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.Wd;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        RadialProgress2 radialProgress2 = this.T;
        radialProgress2.d = w02;
        radialProgress2.H = this.f22166g0;
        radialProgress2.draw(canvas);
        if (this.f22160c) {
            if (dd.X) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - org.telegram.messenger.i0.L(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
            } else {
                canvas.drawLine(org.telegram.messenger.i0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z10 = this.f22162d0;
        if (!z10 && this.f22163e0 == 0.0f) {
            return;
        }
        if (z10) {
            float f7 = this.f22163e0;
            if (f7 != 1.0f) {
                this.f22163e0 = f7 + 0.10666667f;
                invalidate();
                this.f22163e0 = Utilities.i(this.f22163e0, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f)) - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f10 = this.f22163e0;
                canvas.scale(f10, f10, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.t6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.t6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f11 = this.f22163e0;
            if (f11 != 0.0f) {
                this.f22163e0 = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.f22163e0 = Utilities.i(this.f22163e0, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f)) - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f102 = this.f22163e0;
        canvas.scale(f102, f102, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.t6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.t6.Z0.draw(canvas);
        canvas.restore();
    }

    public boolean d(kj kjVar) {
        s20 s20Var = this.f22168i0;
        if (s20Var != null && ((Boolean) s20Var.a(kjVar)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g(false, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.f22165f0;
        if (z10) {
            float f7 = this.f22166g0;
            if (f7 != 1.0f) {
                this.f22166g0 = f7 + 0.10666667f;
                invalidate();
                this.f22166g0 = Utilities.i(this.f22166g0, 1.0f, 0.0f);
                if (this.f22169j0 == 1.0f && this.f22170k0 != null) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.f22169j0) * 255.0f), 31);
                    this.f22170k0.setViewType(4);
                    this.f22170k0.updateColors();
                    this.f22170k0.f();
                    this.f22170k0.draw(canvas);
                    canvas.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.f22169j0 * 255.0f), 31);
                    b(canvas);
                    super.dispatchDraw(canvas);
                    c(canvas);
                    canvas.restore();
                    return;
                }
                b(canvas);
                c(canvas);
                super.dispatchDraw(canvas);
            }
        }
        if (!z10) {
            float f10 = this.f22166g0;
            if (f10 != 0.0f) {
                this.f22166g0 = f10 - 0.10666667f;
                invalidate();
            }
        }
        this.f22166g0 = Utilities.i(this.f22166g0, 1.0f, 0.0f);
        if (this.f22169j0 == 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        ep epVar = this.f22158b;
        if (epVar.getVisibility() != 0) {
            epVar.setVisibility(0);
        }
        epVar.a(z10, z11);
    }

    public final void f(kj kjVar, boolean z10) {
        TLRPC.PhotoSize photoSize;
        this.f22160c = z10;
        this.N = kjVar;
        TLRPC.Document F0 = kjVar.F0();
        if (F0 != null) {
            photoSize = org.telegram.messenger.b8.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        boolean z11 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.T;
        if (!z11 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = kjVar.H1;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.f24142w.v0(bitmap);
            } else {
                String u02 = kjVar.u0(true);
                if (!TextUtils.isEmpty(u02)) {
                    radialProgress2.h(u02);
                } else {
                    radialProgress2.i(null, null, null);
                }
            }
        } else {
            radialProgress2.i(photoSize, F0, kjVar);
        }
        g(false, false);
        requestLayout();
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        String S0 = this.N.S0();
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        kj kjVar = this.N;
        if (!kjVar.f16736w0 && !kjVar.f16740x0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (uz.B0 && kjVar.I3() && ((int) kj.B0(this.N.f16690k)) != 0) {
            if (z12) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f22164f = i11;
            z12 = true;
        } else {
            this.f22164f = 0;
            this.S = -1;
        }
        int i12 = this.f22164f;
        int i13 = this.P;
        RadialProgress2 radialProgress2 = this.T;
        if (i12 != 0) {
            if (this.N.P3()) {
                i10 = org.telegram.ui.ActionBar.t6.Bc;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.We;
            }
            radialProgress2.m(org.telegram.ui.ActionBar.t6.w0(i10, this.f22161c0));
            boolean I = MediaController.B().I(this.N);
            if (I && (!I || !MediaController.B().H())) {
                this.R = 1;
            } else {
                this.R = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            if (this.f22164f == 1) {
                org.telegram.messenger.b6.q(i13).v(this);
                this.S = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            org.telegram.messenger.b6.q(i13).a(S0, this.N, this);
            if (!org.telegram.messenger.b8.G(i13).T(S0)) {
                this.S = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            this.S = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            Float w9 = ic.D().w(S0);
            if (w9 != null) {
                radialProgress2.p(z11, w9.floatValue());
            } else {
                radialProgress2.p(z11, 0.0f);
            }
        } else if (z12) {
            org.telegram.messenger.b6.q(i13).v(this);
            boolean I2 = MediaController.B().I(this.N);
            if (I2 && (!I2 || !MediaController.B().H())) {
                this.R = 1;
            } else {
                this.R = 0;
            }
            radialProgress2.p(z11, 1.0f);
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        } else {
            org.telegram.messenger.b6.q(i13).a(S0, this.N, this);
            if (!org.telegram.messenger.b8.G(i13).T(S0)) {
                this.R = 2;
                radialProgress2.p(z11, 0.0f);
            } else {
                this.R = 4;
                Float w10 = ic.D().w(S0);
                if (w10 != null) {
                    radialProgress2.p(z11, w10.floatValue());
                } else {
                    radialProgress2.p(z11, 0.0f);
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        }
    }

    public kj getMessage() {
        return this.N;
    }

    @Override
    public int getObserverTag() {
        return this.Q;
    }

    @Override
    public final void i(long j10, long j11) {
        this.T.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.f22164f != 0) {
            if (this.S != 1) {
                g(false, true);
            }
        } else if (this.R != 4) {
            g(false, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T.e();
        g(false, false);
        int i10 = this.P;
        at.f(i10).c(this, at.f14706f2);
        at.f(i10).c(this, at.f14712g2);
        at.f(i10).c(this, at.f14718h2);
        this.f22176y = org.telegram.ui.Components.o5.update(0, this, this.f22176y, this.f22173s);
        this.E = org.telegram.ui.Components.o5.update(0, this, this.E, this.H);
        this.J = org.telegram.ui.Components.o5.update(0, this, this.J, this.M);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.P;
        org.telegram.messenger.b6.q(i10).v(this);
        this.T.f();
        at.f(i10).n(this, at.f14706f2);
        at.f(i10).n(this, at.f14712g2);
        at.f(i10).n(this, at.f14718h2);
        org.telegram.ui.Components.o5.release(this, this.f22176y);
        org.telegram.ui.Components.o5.release(this, this.E);
        org.telegram.ui.Components.o5.release(this, this.J);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String L0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.N.I3()) {
            accessibilityNodeInfo.setText(dd.a0("AccDescrMusicInfo", null, 2131754832, this.N.x1(true), this.N.z1(true)));
        } else if (this.f22173s != null && this.H != null) {
            accessibilityNodeInfo.setText(((Object) this.f22173s.getText()) + ", " + ((Object) this.H.getText()));
        }
        if (this.f22158b.f25895a.f23920q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    L0 = dd.L0(2131754929, "AccActionPlay");
                } else {
                    L0 = dd.L0(2131754941, "AccActionCancelDownload");
                }
            } else {
                L0 = dd.L0(2131754938, "AccActionDownload");
            }
        } else {
            L0 = dd.L0(2131754930, "AccActionPause");
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, L0));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k7.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 == 16) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setCheckForButtonPress(boolean z10) {
        this.O = z10;
    }

    public void setEnterAnimationAlpha(float f7) {
        if (this.f22169j0 != f7) {
            this.f22169j0 = f7;
            invalidate();
        }
    }

    public void setGlobalGradientView(zz zzVar) {
        this.f22170k0 = zzVar;
    }

    public void setNeedPlayMessageListener(s20 s20Var) {
        this.f22168i0 = s20Var;
    }

    @Override
    public final void updateColors() {
        kj kjVar;
        int i10;
        try {
            TextPaint textPaint = this.f22167h0;
            org.telegram.ui.ActionBar.p6 p6Var = this.f22161c0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            }
            RadialProgress2 radialProgress2 = this.T;
            if (radialProgress2 != null && this.f22164f != 0 && (kjVar = this.N) != null) {
                if (kjVar.P3()) {
                    i10 = org.telegram.ui.ActionBar.t6.Bc;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.We;
                }
                radialProgress2.m(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public k7(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f22172r = org.telegram.messenger.i0.L(9.0f);
        this.D = org.telegram.messenger.i0.L(29.0f);
        this.I = org.telegram.messenger.i0.L(29.0f);
        int i11 = e20.f15506s0;
        this.P = i11;
        this.f22165f0 = true;
        this.f22166g0 = 0.0f;
        this.f22169j0 = 1.0f;
        this.f22161c0 = p6Var;
        this.U = i10;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, p6Var);
        this.T = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.t6.We, org.telegram.ui.ActionBar.t6.Xe, org.telegram.ui.ActionBar.t6.f21027id, org.telegram.ui.ActionBar.t6.f21046jd);
        this.Q = org.telegram.messenger.b6.q(i11).k();
        setWillNotDraw(false);
        ep epVar = new ep(22, context, p6Var);
        this.f22158b = epVar;
        epVar.setVisibility(4);
        epVar.b(-1, org.telegram.ui.ActionBar.t6.f20930d6, org.telegram.ui.ActionBar.t6.f21060k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(3);
        boolean z10 = dd.X;
        addView(epVar, w7.b6.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.f22157a0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.f22156a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new qs(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.f22159b0 = textPaint2;
        textPaint2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        if (p6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f22167h0 = textPaint3;
            textPaint3.setTypeface(org.telegram.messenger.i0.o());
            textPaint3.setTextSize(org.telegram.messenger.i0.L(15.0f));
            textPaint3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
