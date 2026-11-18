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
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.wz;
public class g7 extends FrameLayout implements org.telegram.messenger.y5, fs, org.telegram.ui.ActionBar.c6 {
    public int E;
    public org.telegram.ui.Components.t5 F;
    public float G;
    public float H;
    public StaticLayout I;
    public int J;
    public org.telegram.ui.Components.t5 K;
    public float L;
    public float M;
    public StaticLayout N;
    public fj O;
    public boolean P;
    public final int Q;
    public final int R;
    public int S;
    public int T;
    public final RadialProgress2 U;
    public final int V;
    public StaticLayout W;
    public final SpannableStringBuilder f30686a;
    public int f30687a0;
    public final mp f30688b;
    public final TextPaint f30689b0;
    public boolean f30690c;
    public final TextPaint f30691c0;
    public boolean d;
    public final org.telegram.ui.ActionBar.i6 f30692d0;
    public boolean f30693e;
    public boolean f30694e0;
    public int f30695f;
    public float f30696f0;
    public boolean f30697g0;
    public int h;
    public float f30698h0;
    public final TextPaint f30699i0;
    public y10 f30700j0;
    public float f30701k0;
    public wz f30702l0;
    public int f30703n;
    public final int f30704r;
    public StaticLayout f30705s;
    public float f30706w;
    public float f30707x;
    public org.telegram.ui.Components.t5 f30708y;

    public g7(Context context) {
        this(0, context, null);
    }

    private int getIconForCurrentState() {
        int i7 = this.S;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        if (i7 == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i7 = this.T;
        if (i7 < 0) {
            return 4;
        }
        if (i7 == 0) {
            return 2;
        }
        return 3;
    }

    @Override
    public final void C(boolean z10) {
        g(true, z10);
    }

    @Override
    public final void N(String str) {
        this.U.p(true, 1.0f);
        g(false, true);
    }

    public void a() {
        int i7 = this.S;
        int i10 = this.Q;
        RadialProgress2 radialProgress2 = this.U;
        if (i7 == 0) {
            if (this.T == 0) {
                this.O.P = true;
                org.telegram.messenger.w7.G(i10).W(this.O.F0(), this.O, 1, 0);
            }
            if (d(this.O)) {
                if (this.f30695f == 2 && this.T != 1) {
                    this.T = 1;
                    radialProgress2.p(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.S = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i7 == 1) {
            if (MediaController.B().R(this.O, true)) {
                this.S = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i7 == 2) {
            radialProgress2.p(false, 0.0f);
            this.O.P = true;
            org.telegram.messenger.w7.G(i10).W(this.O.F0(), this.O, 1, 0);
            this.S = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i7 == 4) {
            org.telegram.messenger.w7.G(i10).f(this.O.F0());
            this.S = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        int i7;
        float f10;
        float f11;
        float f12;
        float f13;
        StaticLayout staticLayout;
        float f14;
        float f15;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var = this.f30692d0;
        if (this.V == 1) {
            this.f30689b0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A6, i6Var));
        }
        StaticLayout staticLayout2 = this.W;
        int i11 = this.f30704r;
        int i12 = 0;
        float f16 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (gd.f24216a0) {
                f15 = 24.0f;
            } else {
                f15 = org.telegram.messenger.g0.C;
            }
            int L = org.telegram.messenger.g0.L(f15);
            if (gd.f24216a0) {
                i10 = 0;
            } else {
                i10 = this.f30687a0;
            }
            canvas.translate(L + i10, i11);
            this.W.draw(canvas);
            canvas.restore();
        }
        float f17 = 0.0f;
        if (this.f30705s != null) {
            int alpha = org.telegram.ui.ActionBar.n6.f29431f3.getAlpha();
            float f18 = this.f30698h0;
            if (f18 != 1.0f) {
                org.telegram.ui.ActionBar.n6.f29431f3.setAlpha((int) (alpha * f18));
            }
            canvas.save();
            if (gd.f24216a0) {
                f12 = 24.0f;
            } else {
                f12 = org.telegram.messenger.g0.C;
            }
            int L2 = org.telegram.messenger.g0.L(f12);
            if (gd.f24216a0 && (staticLayout = this.W) != null) {
                int width = staticLayout.getWidth();
                if (gd.f24216a0) {
                    f14 = 12.0f;
                } else {
                    f14 = 4.0f;
                }
                i12 = width + org.telegram.messenger.g0.L(f14);
            }
            float f19 = L2 + i12;
            if (gd.f24216a0) {
                f13 = this.f30705s.getWidth() - this.f30707x;
            } else {
                f13 = 0.0f;
            }
            canvas.translate((f19 + f13) - this.f30706w, i11);
            this.f30705s.draw(canvas);
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, this.f30705s, this.f30708y, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f30698h0 != 1.0f) {
                org.telegram.ui.ActionBar.n6.f29431f3.setAlpha(alpha);
            }
        }
        if (this.N != null) {
            this.f30691c0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
            canvas.save();
            if (gd.f24216a0) {
                f10 = 24.0f;
            } else {
                f10 = org.telegram.messenger.g0.C;
            }
            float L3 = org.telegram.messenger.g0.L(f10);
            if (gd.f24216a0) {
                f11 = this.N.getWidth() - this.M;
            } else {
                f11 = 0.0f;
            }
            canvas.translate((L3 + f11) - this.L, this.J);
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.I != null) {
            org.telegram.ui.ActionBar.n6.f29448g3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29807z6, i6Var));
            int alpha2 = org.telegram.ui.ActionBar.n6.f29448g3.getAlpha();
            float f20 = this.f30698h0;
            if (f20 != 1.0f) {
                org.telegram.ui.ActionBar.n6.f29448g3.setAlpha((int) (alpha2 * f20));
            }
            canvas.save();
            if (!gd.f24216a0) {
                f16 = org.telegram.messenger.g0.C;
            }
            float L4 = org.telegram.messenger.g0.L(f16);
            if (gd.f24216a0) {
                f17 = this.I.getWidth() - this.H;
            }
            canvas.translate((L4 + f17) - this.G, this.E);
            this.I.draw(canvas);
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, this.I, this.F, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f30698h0 != 1.0f) {
                org.telegram.ui.ActionBar.n6.f29448g3.setAlpha(alpha2);
            }
        }
        if (this.d) {
            i7 = org.telegram.ui.ActionBar.n6.f29346ae;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.Zd;
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        RadialProgress2 radialProgress2 = this.U;
        radialProgress2.d = w02;
        radialProgress2.H = this.f30698h0;
        radialProgress2.draw(canvas);
        if (this.f30690c) {
            if (gd.f24216a0) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - org.telegram.messenger.g0.L(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.n6.W0("paintDivider", i6Var));
            } else {
                canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.n6.W0("paintDivider", i6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z10 = this.f30694e0;
        if (!z10 && this.f30696f0 == 0.0f) {
            return;
        }
        if (z10) {
            float f10 = this.f30696f0;
            if (f10 != 1.0f) {
                this.f30696f0 = f10 + 0.10666667f;
                invalidate();
                this.f30696f0 = Utilities.i(this.f30696f0, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.n6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.n6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f11 = this.f30696f0;
                canvas.scale(f11, f11, (org.telegram.ui.ActionBar.n6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.n6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.n6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.n6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.n6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f12 = this.f30696f0;
            if (f12 != 0.0f) {
                this.f30696f0 = f12 - 0.10666667f;
                invalidate();
            }
        }
        this.f30696f0 = Utilities.i(this.f30696f0, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.n6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.n6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f112 = this.f30696f0;
        canvas.scale(f112, f112, (org.telegram.ui.ActionBar.n6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.n6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.n6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.n6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.n6.Z0.draw(canvas);
        canvas.restore();
    }

    public boolean d(fj fjVar) {
        y10 y10Var = this.f30700j0;
        if (y10Var != null && ((Boolean) y10Var.a(fjVar)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        g(false, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.f30697g0;
        if (z10) {
            float f10 = this.f30698h0;
            if (f10 != 1.0f) {
                this.f30698h0 = f10 + 0.10666667f;
                invalidate();
                this.f30698h0 = Utilities.i(this.f30698h0, 1.0f, 0.0f);
                if (this.f30701k0 == 1.0f && this.f30702l0 != null) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.f30701k0) * 255.0f), 31);
                    this.f30702l0.setViewType(4);
                    this.f30702l0.updateColors();
                    this.f30702l0.g();
                    this.f30702l0.draw(canvas);
                    canvas.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.f30701k0 * 255.0f), 31);
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
            float f11 = this.f30698h0;
            if (f11 != 0.0f) {
                this.f30698h0 = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.f30698h0 = Utilities.i(this.f30698h0, 1.0f, 0.0f);
        if (this.f30701k0 == 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        mp mpVar = this.f30688b;
        if (mpVar.getVisibility() != 0) {
            mpVar.setVisibility(0);
        }
        mpVar.a(z10, z11);
    }

    public final void f(fj fjVar, boolean z10) {
        TLRPC.PhotoSize photoSize;
        this.f30690c = z10;
        this.O = fjVar;
        TLRPC.Document F0 = fjVar.F0();
        if (F0 != null) {
            photoSize = org.telegram.messenger.w7.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        boolean z11 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.U;
        if (!z11 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = fjVar.J1;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.f33071w.v0(bitmap);
            } else {
                String u02 = fjVar.u0(true);
                if (!TextUtils.isEmpty(u02)) {
                    radialProgress2.h(u02);
                } else {
                    radialProgress2.i(null, null, null);
                }
            }
        } else {
            radialProgress2.i(photoSize, F0, fjVar);
        }
        g(false, false);
        requestLayout();
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        int i7;
        int i10;
        String S0 = this.O.S0();
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        fj fjVar = this.O;
        if (!fjVar.f24023y0 && !fjVar.f24027z0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (bz.B0 && fjVar.I3() && ((int) fj.B0(this.O.f23968k)) != 0) {
            if (z12) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f30695f = i10;
            z12 = true;
        } else {
            this.f30695f = 0;
            this.T = -1;
        }
        int i11 = this.f30695f;
        int i12 = this.Q;
        RadialProgress2 radialProgress2 = this.U;
        if (i11 != 0) {
            if (this.O.P3()) {
                i7 = org.telegram.ui.ActionBar.n6.Ec;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.Ze;
            }
            radialProgress2.m(org.telegram.ui.ActionBar.n6.w0(i7, this.f30692d0));
            boolean I = MediaController.B().I(this.O);
            if (I && (!I || !MediaController.B().H())) {
                this.S = 1;
            } else {
                this.S = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            if (this.f30695f == 1) {
                org.telegram.messenger.a6.q(i12).v(this);
                this.T = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            org.telegram.messenger.a6.q(i12).a(S0, this.O, this);
            if (!org.telegram.messenger.w7.G(i12).S(S0)) {
                this.T = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            this.T = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            Float w10 = ec.D().w(S0);
            if (w10 != null) {
                radialProgress2.p(z11, w10.floatValue());
            } else {
                radialProgress2.p(z11, 0.0f);
            }
        } else if (z12) {
            org.telegram.messenger.a6.q(i12).v(this);
            boolean I2 = MediaController.B().I(this.O);
            if (I2 && (!I2 || !MediaController.B().H())) {
                this.S = 1;
            } else {
                this.S = 0;
            }
            radialProgress2.p(z11, 1.0f);
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        } else {
            org.telegram.messenger.a6.q(i12).a(S0, this.O, this);
            if (!org.telegram.messenger.w7.G(i12).S(S0)) {
                this.S = 2;
                radialProgress2.p(z11, 0.0f);
            } else {
                this.S = 4;
                Float w11 = ec.D().w(S0);
                if (w11 != null) {
                    radialProgress2.p(z11, w11.floatValue());
                } else {
                    radialProgress2.p(z11, 0.0f);
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        }
    }

    public fj getMessage() {
        return this.O;
    }

    @Override
    public int getObserverTag() {
        return this.R;
    }

    @Override
    public final void i(long j3, long j10) {
        this.U.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.f30695f != 0) {
            if (this.T != 1) {
                g(false, true);
            }
        } else if (this.S != 4) {
            g(false, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.e();
        g(false, false);
        int i7 = this.Q;
        ks.f(i7).c(this, ks.f25114f2);
        ks.f(i7).c(this, ks.f25120g2);
        ks.f(i7).c(this, ks.f25126h2);
        this.f30708y = org.telegram.ui.Components.x5.update(0, this, this.f30708y, this.f30705s);
        this.F = org.telegram.ui.Components.x5.update(0, this, this.F, this.I);
        this.K = org.telegram.ui.Components.x5.update(0, this, this.K, this.N);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.Q;
        org.telegram.messenger.a6.q(i7).v(this);
        this.U.f();
        ks.f(i7).n(this, ks.f25114f2);
        ks.f(i7).n(this, ks.f25120g2);
        ks.f(i7).n(this, ks.f25126h2);
        org.telegram.ui.Components.x5.release(this, this.f30708y);
        org.telegram.ui.Components.x5.release(this, this.F);
        org.telegram.ui.Components.x5.release(this, this.K);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String M0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.O.I3()) {
            accessibilityNodeInfo.setText(gd.a0("AccDescrMusicInfo", null, 2131754832, this.O.w1(true), this.O.y1(true)));
        } else if (this.f30705s != null && this.I != null) {
            accessibilityNodeInfo.setText(((Object) this.f30705s.getText()) + ", " + ((Object) this.I.getText()));
        }
        if (this.f30688b.f37598a.f32838q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    M0 = gd.M0(2131754929, "AccActionPlay");
                } else {
                    M0 = gd.M0(2131754941, "AccActionCancelDownload");
                }
            } else {
                M0 = gd.M0(2131754938, "AccActionDownload");
            }
        } else {
            M0 = gd.M0(2131754930, "AccActionPause");
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, M0));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g7.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (i7 == 16) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i7, bundle);
    }

    public void setCheckForButtonPress(boolean z10) {
        this.P = z10;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.f30701k0 != f10) {
            this.f30701k0 = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(wz wzVar) {
        this.f30702l0 = wzVar;
    }

    public void setNeedPlayMessageListener(y10 y10Var) {
        this.f30700j0 = y10Var;
    }

    @Override
    public final void updateColors() {
        fj fjVar;
        int i7;
        try {
            TextPaint textPaint = this.f30699i0;
            org.telegram.ui.ActionBar.i6 i6Var = this.f30692d0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
            }
            RadialProgress2 radialProgress2 = this.U;
            if (radialProgress2 != null && this.f30695f != 0 && (fjVar = this.O) != null) {
                if (fjVar.P3()) {
                    i7 = org.telegram.ui.ActionBar.n6.Ec;
                } else {
                    i7 = org.telegram.ui.ActionBar.n6.Ze;
                }
                radialProgress2.m(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public g7(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f30704r = org.telegram.messenger.g0.L(9.0f);
        this.E = org.telegram.messenger.g0.L(29.0f);
        this.J = org.telegram.messenger.g0.L(29.0f);
        int i10 = j10.f24773t0;
        this.Q = i10;
        this.f30697g0 = true;
        this.f30698h0 = 0.0f;
        this.f30701k0 = 1.0f;
        this.f30692d0 = i6Var;
        this.V = i7;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, i6Var);
        this.U = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.n6.Ze, org.telegram.ui.ActionBar.n6.f29347af, org.telegram.ui.ActionBar.n6.f29550ld, org.telegram.ui.ActionBar.n6.f29566md);
        this.R = org.telegram.messenger.a6.q(i10).k();
        setWillNotDraw(false);
        mp mpVar = new mp(22, context, i6Var);
        this.f30688b = mpVar;
        mpVar.setVisibility(4);
        mpVar.b(-1, org.telegram.ui.ActionBar.n6.f29396d6, org.telegram.ui.ActionBar.n6.f29526k7);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(3);
        boolean z10 = gd.f24216a0;
        addView(mpVar, c8.ma.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i7 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.f30689b0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.f30686a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new ss(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.f30691c0 = textPaint2;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        if (i6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f30699i0 = textPaint3;
            textPaint3.setTypeface(org.telegram.messenger.g0.o());
            textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
