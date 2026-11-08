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
import org.telegram.messenger.d20;
import org.telegram.messenger.gc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.wo;
public class g7 extends FrameLayout implements org.telegram.messenger.x5, ls, org.telegram.ui.ActionBar.a6 {
    public int D;
    public org.telegram.ui.Components.n5 E;
    public float F;
    public float G;
    public StaticLayout H;
    public int I;
    public org.telegram.ui.Components.n5 J;
    public float K;
    public float L;
    public StaticLayout M;
    public ij N;
    public boolean O;
    public final int P;
    public final int Q;
    public int R;
    public int S;
    public final RadialProgress2 T;
    public final int U;
    public StaticLayout V;
    public int W;
    public final SpannableStringBuilder f29179a;
    public final TextPaint f29180a0;
    public final wo f29181b;
    public final TextPaint f29182b0;
    public boolean f29183c;
    public final org.telegram.ui.ActionBar.f6 f29184c0;
    public boolean d;
    public boolean f29185d0;
    public boolean f29186e;
    public float f29187e0;
    public int f29188f;
    public boolean f29189f0;
    public float f29190g0;
    public int h;
    public final TextPaint f29191h0;
    public d20 f29192i0;
    public float f29193j0;
    public mz f29194k0;
    public int f29195n;
    public final int f29196r;
    public StaticLayout f29197s;
    public float f29198w;
    public float f29199x;
    public org.telegram.ui.Components.n5 f29200y;

    public g7(Context context) {
        this(0, context, null);
    }

    private int getIconForCurrentState() {
        int i7 = this.R;
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
        int i7 = this.S;
        if (i7 < 0) {
            return 4;
        }
        if (i7 == 0) {
            return 2;
        }
        return 3;
    }

    @Override
    public final void C(boolean z9) {
        g(true, z9);
    }

    @Override
    public final void M(String str) {
        this.T.p(true, 1.0f);
        g(false, true);
    }

    public void a() {
        int i7 = this.R;
        int i10 = this.P;
        RadialProgress2 radialProgress2 = this.T;
        if (i7 == 0) {
            if (this.S == 0) {
                this.N.P = true;
                org.telegram.messenger.w7.G(i10).W(this.N.F0(), this.N, 1, 0);
            }
            if (d(this.N)) {
                if (this.f29188f == 2 && this.S != 1) {
                    this.S = 1;
                    radialProgress2.p(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.R = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i7 == 1) {
            if (MediaController.B().R(this.N, true)) {
                this.R = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i7 == 2) {
            radialProgress2.p(false, 0.0f);
            this.N.P = true;
            org.telegram.messenger.w7.G(i10).W(this.N.F0(), this.N, 1, 0);
            this.R = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i7 == 4) {
            org.telegram.messenger.w7.G(i10).f(this.N.F0());
            this.R = 2;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f29184c0;
        if (this.U == 1) {
            this.f29180a0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A6, f6Var));
        }
        StaticLayout staticLayout2 = this.V;
        int i11 = this.f29196r;
        int i12 = 0;
        float f16 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (id.f23157a0) {
                f15 = 24.0f;
            } else {
                f15 = org.telegram.messenger.g0.C;
            }
            int L = org.telegram.messenger.g0.L(f15);
            if (id.f23157a0) {
                i10 = 0;
            } else {
                i10 = this.W;
            }
            canvas.translate(L + i10, i11);
            this.V.draw(canvas);
            canvas.restore();
        }
        float f17 = 0.0f;
        if (this.f29197s != null) {
            int alpha = org.telegram.ui.ActionBar.k6.f27887f3.getAlpha();
            float f18 = this.f29190g0;
            if (f18 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f27887f3.setAlpha((int) (alpha * f18));
            }
            canvas.save();
            if (id.f23157a0) {
                f12 = 24.0f;
            } else {
                f12 = org.telegram.messenger.g0.C;
            }
            int L2 = org.telegram.messenger.g0.L(f12);
            if (id.f23157a0 && (staticLayout = this.V) != null) {
                int width = staticLayout.getWidth();
                if (id.f23157a0) {
                    f14 = 12.0f;
                } else {
                    f14 = 4.0f;
                }
                i12 = width + org.telegram.messenger.g0.L(f14);
            }
            float f19 = L2 + i12;
            if (id.f23157a0) {
                f13 = this.f29197s.getWidth() - this.f29199x;
            } else {
                f13 = 0.0f;
            }
            canvas.translate((f19 + f13) - this.f29198w, i11);
            this.f29197s.draw(canvas);
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.f29197s, this.f29200y, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f29190g0 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f27887f3.setAlpha(alpha);
            }
        }
        if (this.M != null) {
            this.f29182b0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var));
            canvas.save();
            if (id.f23157a0) {
                f10 = 24.0f;
            } else {
                f10 = org.telegram.messenger.g0.C;
            }
            float L3 = org.telegram.messenger.g0.L(f10);
            if (id.f23157a0) {
                f11 = this.M.getWidth() - this.L;
            } else {
                f11 = 0.0f;
            }
            canvas.translate((L3 + f11) - this.K, this.I);
            this.M.draw(canvas);
            canvas.restore();
        }
        if (this.H != null) {
            org.telegram.ui.ActionBar.k6.f27904g3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28262z6, f6Var));
            int alpha2 = org.telegram.ui.ActionBar.k6.f27904g3.getAlpha();
            float f20 = this.f29190g0;
            if (f20 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f27904g3.setAlpha((int) (alpha2 * f20));
            }
            canvas.save();
            if (!id.f23157a0) {
                f16 = org.telegram.messenger.g0.C;
            }
            float L4 = org.telegram.messenger.g0.L(f16);
            if (id.f23157a0) {
                f17 = this.H.getWidth() - this.G;
            }
            canvas.translate((L4 + f17) - this.F, this.D);
            this.H.draw(canvas);
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.H, this.E, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f29190g0 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f27904g3.setAlpha(alpha2);
            }
        }
        if (this.d) {
            i7 = org.telegram.ui.ActionBar.k6.Xd;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.Wd;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        RadialProgress2 radialProgress2 = this.T;
        radialProgress2.d = w02;
        radialProgress2.H = this.f29190g0;
        radialProgress2.draw(canvas);
        if (this.f29183c) {
            if (id.f23157a0) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - org.telegram.messenger.g0.L(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", f6Var));
            } else {
                canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", f6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z9 = this.f29185d0;
        if (!z9 && this.f29187e0 == 0.0f) {
            return;
        }
        if (z9) {
            float f10 = this.f29187e0;
            if (f10 != 1.0f) {
                this.f29187e0 = f10 + 0.10666667f;
                invalidate();
                this.f29187e0 = Utilities.i(this.f29187e0, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f11 = this.f29187e0;
                canvas.scale(f11, f11, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.k6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z9) {
            float f12 = this.f29187e0;
            if (f12 != 0.0f) {
                this.f29187e0 = f12 - 0.10666667f;
                invalidate();
            }
        }
        this.f29187e0 = Utilities.i(this.f29187e0, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f112 = this.f29187e0;
        canvas.scale(f112, f112, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.k6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
        canvas.restore();
    }

    public boolean d(ij ijVar) {
        d20 d20Var = this.f29192i0;
        if (d20Var != null && ((Boolean) d20Var.a(ijVar)).booleanValue()) {
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
        boolean z9 = this.f29189f0;
        if (z9) {
            float f10 = this.f29190g0;
            if (f10 != 1.0f) {
                this.f29190g0 = f10 + 0.10666667f;
                invalidate();
                this.f29190g0 = Utilities.i(this.f29190g0, 1.0f, 0.0f);
                if (this.f29193j0 == 1.0f && this.f29194k0 != null) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.f29193j0) * 255.0f), 31);
                    this.f29194k0.setViewType(4);
                    this.f29194k0.updateColors();
                    this.f29194k0.f();
                    this.f29194k0.draw(canvas);
                    canvas.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.f29193j0 * 255.0f), 31);
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
        if (!z9) {
            float f11 = this.f29190g0;
            if (f11 != 0.0f) {
                this.f29190g0 = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.f29190g0 = Utilities.i(this.f29190g0, 1.0f, 0.0f);
        if (this.f29193j0 == 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z9, boolean z10) {
        wo woVar = this.f29181b;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z9, z10);
    }

    public final void f(ij ijVar, boolean z9) {
        TLRPC.PhotoSize photoSize;
        this.f29183c = z9;
        this.N = ijVar;
        TLRPC.Document F0 = ijVar.F0();
        if (F0 != null) {
            photoSize = org.telegram.messenger.w7.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        boolean z10 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.T;
        if (!z10 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = ijVar.H1;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.f31495w.v0(bitmap);
            } else {
                String u02 = ijVar.u0(true);
                if (!TextUtils.isEmpty(u02)) {
                    radialProgress2.h(u02);
                } else {
                    radialProgress2.i(null, null, null);
                }
            }
        } else {
            radialProgress2.i(photoSize, F0, ijVar);
        }
        g(false, false);
        requestLayout();
    }

    public final void g(boolean z9, boolean z10) {
        boolean z11;
        int i7;
        int i10;
        String S0 = this.N.S0();
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        ij ijVar = this.N;
        if (!ijVar.f23307w0 && !ijVar.f23311x0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (iz.B0 && ijVar.J3() && ((int) ij.B0(this.N.f23262k)) != 0) {
            if (z11) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f29188f = i10;
            z11 = true;
        } else {
            this.f29188f = 0;
            this.S = -1;
        }
        int i11 = this.f29188f;
        int i12 = this.P;
        RadialProgress2 radialProgress2 = this.T;
        if (i11 != 0) {
            if (this.N.Q3()) {
                i7 = org.telegram.ui.ActionBar.k6.Bc;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.We;
            }
            radialProgress2.m(org.telegram.ui.ActionBar.k6.w0(i7, this.f29184c0));
            boolean I = MediaController.B().I(this.N);
            if (I && (!I || !MediaController.B().H())) {
                this.R = 1;
            } else {
                this.R = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z9, z10);
            if (this.f29188f == 1) {
                org.telegram.messenger.z5.q(i12).v(this);
                this.S = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z9, z10);
                return;
            }
            org.telegram.messenger.z5.q(i12).a(S0, this.N, this);
            if (!org.telegram.messenger.w7.G(i12).S(S0)) {
                this.S = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z9, z10);
                return;
            }
            this.S = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z9, z10);
            Float w10 = gc.D().w(S0);
            if (w10 != null) {
                radialProgress2.p(z10, w10.floatValue());
            } else {
                radialProgress2.p(z10, 0.0f);
            }
        } else if (z11) {
            org.telegram.messenger.z5.q(i12).v(this);
            boolean I2 = MediaController.B().I(this.N);
            if (I2 && (!I2 || !MediaController.B().H())) {
                this.R = 1;
            } else {
                this.R = 0;
            }
            radialProgress2.p(z10, 1.0f);
            radialProgress2.setIcon(getIconForCurrentState(), z9, z10);
            invalidate();
        } else {
            org.telegram.messenger.z5.q(i12).a(S0, this.N, this);
            if (!org.telegram.messenger.w7.G(i12).S(S0)) {
                this.R = 2;
                radialProgress2.p(z10, 0.0f);
            } else {
                this.R = 4;
                Float w11 = gc.D().w(S0);
                if (w11 != null) {
                    radialProgress2.p(z10, w11.floatValue());
                } else {
                    radialProgress2.p(z10, 0.0f);
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), z9, z10);
            invalidate();
        }
    }

    public ij getMessage() {
        return this.N;
    }

    @Override
    public int getObserverTag() {
        return this.Q;
    }

    @Override
    public final void i(long j3, long j10) {
        this.T.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.f29188f != 0) {
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
        int i7 = this.P;
        qs.f(i7).c(this, qs.f24998f2);
        qs.f(i7).c(this, qs.f25004g2);
        qs.f(i7).c(this, qs.f25010h2);
        this.f29200y = org.telegram.ui.Components.r5.update(0, this, this.f29200y, this.f29197s);
        this.E = org.telegram.ui.Components.r5.update(0, this, this.E, this.H);
        this.J = org.telegram.ui.Components.r5.update(0, this, this.J, this.M);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.P;
        org.telegram.messenger.z5.q(i7).v(this);
        this.T.f();
        qs.f(i7).n(this, qs.f24998f2);
        qs.f(i7).n(this, qs.f25004g2);
        qs.f(i7).n(this, qs.f25010h2);
        org.telegram.ui.Components.r5.release(this, this.f29200y);
        org.telegram.ui.Components.r5.release(this, this.E);
        org.telegram.ui.Components.r5.release(this, this.J);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String M0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.N.J3()) {
            accessibilityNodeInfo.setText(id.a0("AccDescrMusicInfo", null, 2131754832, this.N.x1(true), this.N.z1(true)));
        } else if (this.f29197s != null && this.H != null) {
            accessibilityNodeInfo.setText(((Object) this.f29197s.getText()) + ", " + ((Object) this.H.getText()));
        }
        if (this.f29181b.f40008a.f31263q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    M0 = id.M0(2131754929, "AccActionPlay");
                } else {
                    M0 = id.M0(2131754941, "AccActionCancelDownload");
                }
            } else {
                M0 = id.M0(2131754938, "AccActionDownload");
            }
        } else {
            M0 = id.M0(2131754930, "AccActionPause");
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

    public void setCheckForButtonPress(boolean z9) {
        this.O = z9;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.f29193j0 != f10) {
            this.f29193j0 = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(mz mzVar) {
        this.f29194k0 = mzVar;
    }

    public void setNeedPlayMessageListener(d20 d20Var) {
        this.f29192i0 = d20Var;
    }

    @Override
    public final void updateColors() {
        ij ijVar;
        int i7;
        try {
            TextPaint textPaint = this.f29191h0;
            org.telegram.ui.ActionBar.f6 f6Var = this.f29184c0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var));
            }
            RadialProgress2 radialProgress2 = this.T;
            if (radialProgress2 != null && this.f29188f != 0 && (ijVar = this.N) != null) {
                if (ijVar.Q3()) {
                    i7 = org.telegram.ui.ActionBar.k6.Bc;
                } else {
                    i7 = org.telegram.ui.ActionBar.k6.We;
                }
                radialProgress2.m(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public g7(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f29196r = org.telegram.messenger.g0.L(9.0f);
        this.D = org.telegram.messenger.g0.L(29.0f);
        this.I = org.telegram.messenger.g0.L(29.0f);
        int i10 = p10.f24470s0;
        this.P = i10;
        this.f29189f0 = true;
        this.f29190g0 = 0.0f;
        this.f29193j0 = 1.0f;
        this.f29184c0 = f6Var;
        this.U = i7;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.T = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.k6.We, org.telegram.ui.ActionBar.k6.Xe, org.telegram.ui.ActionBar.k6.f27950id, org.telegram.ui.ActionBar.k6.f27968jd);
        this.Q = org.telegram.messenger.z5.q(i10).k();
        setWillNotDraw(false);
        wo woVar = new wo(22, context, f6Var);
        this.f29181b = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.k6.f27852d6, org.telegram.ui.ActionBar.k6.f27982k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        boolean z9 = id.f23157a0;
        addView(woVar, c8.ha.d(24, 24.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : 38.1f, 32.1f, z9 ? 6.0f : 0.0f, 0.0f));
        if (i7 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.f29180a0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.f29179a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new fs(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.f29182b0 = textPaint2;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        if (f6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f29191h0 = textPaint3;
            textPaint3.setTypeface(org.telegram.messenger.g0.o());
            textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
