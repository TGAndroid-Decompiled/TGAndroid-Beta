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
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.v10;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.wo;
public class f7 extends FrameLayout implements org.telegram.messenger.x5, cs, org.telegram.ui.ActionBar.z5 {
    public int E;
    public org.telegram.ui.Components.l5 F;
    public float G;
    public float H;
    public StaticLayout I;
    public int J;
    public org.telegram.ui.Components.l5 K;
    public float L;
    public float M;
    public StaticLayout N;
    public zi O;
    public boolean P;
    public final int Q;
    public final int R;
    public int S;
    public int T;
    public final RadialProgress2 U;
    public final int V;
    public StaticLayout W;
    public final SpannableStringBuilder f29212a;
    public int f29213a0;
    public final wo f29214b;
    public final TextPaint f29215b0;
    public boolean f29216c;
    public final TextPaint f29217c0;
    public boolean d;
    public final org.telegram.ui.ActionBar.e6 f29218d0;
    public boolean f29219e;
    public boolean f29220e0;
    public int f29221f;
    public float f29222f0;
    public boolean f29223g0;
    public int h;
    public float f29224h0;
    public final TextPaint f29225i0;
    public v10 f29226j0;
    public float f29227k0;
    public iz f29228l0;
    public int f29229n;
    public final int f29230r;
    public StaticLayout f29231s;
    public float f29232w;
    public float f29233x;
    public org.telegram.ui.Components.l5 f29234y;

    public f7(Context context) {
        this(0, context, null);
    }

    private int getIconForCurrentState() {
        int i3 = this.S;
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 2) {
            return 2;
        }
        if (i3 == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i3 = this.T;
        if (i3 < 0) {
            return 4;
        }
        if (i3 == 0) {
            return 2;
        }
        return 3;
    }

    @Override
    public final void C(boolean z10) {
        g(true, z10);
    }

    @Override
    public final void M(String str) {
        this.U.p(true, 1.0f);
        g(false, true);
    }

    public void a() {
        int i3 = this.S;
        int i10 = this.Q;
        RadialProgress2 radialProgress2 = this.U;
        if (i3 == 0) {
            if (this.T == 0) {
                this.O.P = true;
                org.telegram.messenger.w7.G(i10).X(this.O.F0(), this.O, 1, 0);
            }
            if (d(this.O)) {
                if (this.f29221f == 2 && this.T != 1) {
                    this.T = 1;
                    radialProgress2.p(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.S = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i3 == 1) {
            if (MediaController.B().R(this.O, true)) {
                this.S = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i3 == 2) {
            radialProgress2.p(false, 0.0f);
            this.O.P = true;
            org.telegram.messenger.w7.G(i10).X(this.O.F0(), this.O, 1, 0);
            this.S = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i3 == 4) {
            org.telegram.messenger.w7.G(i10).f(this.O.F0());
            this.S = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        int i3;
        float f10;
        float f11;
        float f12;
        float f13;
        StaticLayout staticLayout;
        float f14;
        float f15;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var = this.f29218d0;
        if (this.V == 1) {
            this.f29215b0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A6, e6Var));
        }
        StaticLayout staticLayout2 = this.W;
        int i11 = this.f29230r;
        int i12 = 0;
        float f16 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (bd.f21784a0) {
                f15 = 24.0f;
            } else {
                f15 = org.telegram.messenger.g0.C;
            }
            int L = org.telegram.messenger.g0.L(f15);
            if (bd.f21784a0) {
                i10 = 0;
            } else {
                i10 = this.f29213a0;
            }
            canvas.translate(L + i10, i11);
            this.W.draw(canvas);
            canvas.restore();
        }
        float f17 = 0.0f;
        if (this.f29231s != null) {
            int alpha = org.telegram.ui.ActionBar.k6.f27914f3.getAlpha();
            float f18 = this.f29224h0;
            if (f18 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f27914f3.setAlpha((int) (alpha * f18));
            }
            canvas.save();
            if (bd.f21784a0) {
                f12 = 24.0f;
            } else {
                f12 = org.telegram.messenger.g0.C;
            }
            int L2 = org.telegram.messenger.g0.L(f12);
            if (bd.f21784a0 && (staticLayout = this.W) != null) {
                int width = staticLayout.getWidth();
                if (bd.f21784a0) {
                    f14 = 12.0f;
                } else {
                    f14 = 4.0f;
                }
                i12 = width + org.telegram.messenger.g0.L(f14);
            }
            float f19 = L2 + i12;
            if (bd.f21784a0) {
                f13 = this.f29231s.getWidth() - this.f29233x;
            } else {
                f13 = 0.0f;
            }
            canvas.translate((f19 + f13) - this.f29232w, i11);
            this.f29231s.draw(canvas);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.f29231s, this.f29234y, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f29224h0 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f27914f3.setAlpha(alpha);
            }
        }
        if (this.N != null) {
            this.f29217c0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            canvas.save();
            if (bd.f21784a0) {
                f10 = 24.0f;
            } else {
                f10 = org.telegram.messenger.g0.C;
            }
            float L3 = org.telegram.messenger.g0.L(f10);
            if (bd.f21784a0) {
                f11 = this.N.getWidth() - this.M;
            } else {
                f11 = 0.0f;
            }
            canvas.translate((L3 + f11) - this.L, this.J);
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.I != null) {
            org.telegram.ui.ActionBar.k6.f27934g3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, e6Var));
            int alpha2 = org.telegram.ui.ActionBar.k6.f27934g3.getAlpha();
            float f20 = this.f29224h0;
            if (f20 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f27934g3.setAlpha((int) (alpha2 * f20));
            }
            canvas.save();
            if (!bd.f21784a0) {
                f16 = org.telegram.messenger.g0.C;
            }
            float L4 = org.telegram.messenger.g0.L(f16);
            if (bd.f21784a0) {
                f17 = this.I.getWidth() - this.H;
            }
            canvas.translate((L4 + f17) - this.G, this.E);
            this.I.draw(canvas);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.I, this.F, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f29224h0 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f27934g3.setAlpha(alpha2);
            }
        }
        if (this.d) {
            i3 = org.telegram.ui.ActionBar.k6.Xd;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.Wd;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        RadialProgress2 radialProgress2 = this.U;
        radialProgress2.d = w02;
        radialProgress2.H = this.f29224h0;
        radialProgress2.draw(canvas);
        if (this.f29216c) {
            if (bd.f21784a0) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - org.telegram.messenger.g0.L(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var));
            } else {
                canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z10 = this.f29220e0;
        if (!z10 && this.f29222f0 == 0.0f) {
            return;
        }
        if (z10) {
            float f10 = this.f29222f0;
            if (f10 != 1.0f) {
                this.f29222f0 = f10 + 0.10666667f;
                invalidate();
                this.f29222f0 = Utilities.i(this.f29222f0, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f11 = this.f29222f0;
                canvas.scale(f11, f11, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.k6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f12 = this.f29222f0;
            if (f12 != 0.0f) {
                this.f29222f0 = f12 - 0.10666667f;
                invalidate();
            }
        }
        this.f29222f0 = Utilities.i(this.f29222f0, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f112 = this.f29222f0;
        canvas.scale(f112, f112, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.k6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
        canvas.restore();
    }

    public boolean d(zi ziVar) {
        v10 v10Var = this.f29226j0;
        if (v10Var != null && ((Boolean) v10Var.a(ziVar)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        g(false, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.f29223g0;
        if (z10) {
            float f10 = this.f29224h0;
            if (f10 != 1.0f) {
                this.f29224h0 = f10 + 0.10666667f;
                invalidate();
                this.f29224h0 = Utilities.i(this.f29224h0, 1.0f, 0.0f);
                if (this.f29227k0 == 1.0f && this.f29228l0 != null) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.f29227k0) * 255.0f), 31);
                    this.f29228l0.setViewType(4);
                    this.f29228l0.updateColors();
                    this.f29228l0.f();
                    this.f29228l0.draw(canvas);
                    canvas.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.f29227k0 * 255.0f), 31);
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
            float f11 = this.f29224h0;
            if (f11 != 0.0f) {
                this.f29224h0 = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.f29224h0 = Utilities.i(this.f29224h0, 1.0f, 0.0f);
        if (this.f29227k0 == 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        wo woVar = this.f29214b;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z10, z11);
    }

    public final void f(zi ziVar, boolean z10) {
        TLRPC.PhotoSize photoSize;
        this.f29216c = z10;
        this.O = ziVar;
        TLRPC.Document F0 = ziVar.F0();
        if (F0 != null) {
            photoSize = org.telegram.messenger.w7.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        boolean z11 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.U;
        if (!z11 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = ziVar.H1;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.f31567w.v0(bitmap);
            } else {
                String u02 = ziVar.u0(true);
                if (!TextUtils.isEmpty(u02)) {
                    radialProgress2.h(u02);
                } else {
                    radialProgress2.i(null, null, null);
                }
            }
        } else {
            radialProgress2.i(photoSize, F0, ziVar);
        }
        g(false, false);
        requestLayout();
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        int i3;
        int i10;
        String S0 = this.O.S0();
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        zi ziVar = this.O;
        if (!ziVar.f26913w0 && !ziVar.f26917x0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (az.B0 && ziVar.J3() && ((int) zi.B0(this.O.f26868k)) != 0) {
            if (z12) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f29221f = i10;
            z12 = true;
        } else {
            this.f29221f = 0;
            this.T = -1;
        }
        int i11 = this.f29221f;
        int i12 = this.Q;
        RadialProgress2 radialProgress2 = this.U;
        if (i11 != 0) {
            if (this.O.Q3()) {
                i3 = org.telegram.ui.ActionBar.k6.Bc;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.We;
            }
            radialProgress2.m(org.telegram.ui.ActionBar.k6.w0(i3, this.f29218d0));
            boolean I = MediaController.B().I(this.O);
            if (I && (!I || !MediaController.B().H())) {
                this.S = 1;
            } else {
                this.S = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            if (this.f29221f == 1) {
                org.telegram.messenger.z5.q(i12).v(this);
                this.T = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            org.telegram.messenger.z5.q(i12).a(S0, this.O, this);
            if (!org.telegram.messenger.w7.G(i12).T(S0)) {
                this.T = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            this.T = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            Float w10 = zb.D().w(S0);
            if (w10 != null) {
                radialProgress2.p(z11, w10.floatValue());
            } else {
                radialProgress2.p(z11, 0.0f);
            }
        } else if (z12) {
            org.telegram.messenger.z5.q(i12).v(this);
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
            org.telegram.messenger.z5.q(i12).a(S0, this.O, this);
            if (!org.telegram.messenger.w7.G(i12).T(S0)) {
                this.S = 2;
                radialProgress2.p(z11, 0.0f);
            } else {
                this.S = 4;
                Float w11 = zb.D().w(S0);
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

    public zi getMessage() {
        return this.O;
    }

    @Override
    public int getObserverTag() {
        return this.R;
    }

    @Override
    public final void i(long j10, long j11) {
        this.U.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.f29221f != 0) {
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
        int i3 = this.Q;
        hs.f(i3).c(this, hs.f23227f2);
        hs.f(i3).c(this, hs.f23233g2);
        hs.f(i3).c(this, hs.f23239h2);
        this.f29234y = org.telegram.ui.Components.p5.update(0, this, this.f29234y, this.f29231s);
        this.F = org.telegram.ui.Components.p5.update(0, this, this.F, this.I);
        this.K = org.telegram.ui.Components.p5.update(0, this, this.K, this.N);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.Q;
        org.telegram.messenger.z5.q(i3).v(this);
        this.U.f();
        hs.f(i3).n(this, hs.f23227f2);
        hs.f(i3).n(this, hs.f23233g2);
        hs.f(i3).n(this, hs.f23239h2);
        org.telegram.ui.Components.p5.release(this, this.f29234y);
        org.telegram.ui.Components.p5.release(this, this.F);
        org.telegram.ui.Components.p5.release(this, this.K);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String M0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.O.J3()) {
            accessibilityNodeInfo.setText(bd.a0("AccDescrMusicInfo", null, 2131754832, this.O.x1(true), this.O.z1(true)));
        } else if (this.f29231s != null && this.I != null) {
            accessibilityNodeInfo.setText(((Object) this.f29231s.getText()) + ", " + ((Object) this.I.getText()));
        }
        if (this.f29214b.f40035a.f31334q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    M0 = bd.M0(2131754929, "AccActionPlay");
                } else {
                    M0 = bd.M0(2131754941, "AccActionCancelDownload");
                }
            } else {
                M0 = bd.M0(2131754938, "AccActionDownload");
            }
        } else {
            M0 = bd.M0(2131754930, "AccActionPause");
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, M0));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f7.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        if (i3 == 16) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i3, bundle);
    }

    public void setCheckForButtonPress(boolean z10) {
        this.P = z10;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.f29227k0 != f10) {
            this.f29227k0 = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(iz izVar) {
        this.f29228l0 = izVar;
    }

    public void setNeedPlayMessageListener(v10 v10Var) {
        this.f29226j0 = v10Var;
    }

    @Override
    public final void updateColors() {
        zi ziVar;
        int i3;
        try {
            TextPaint textPaint = this.f29225i0;
            org.telegram.ui.ActionBar.e6 e6Var = this.f29218d0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            }
            RadialProgress2 radialProgress2 = this.U;
            if (radialProgress2 != null && this.f29221f != 0 && (ziVar = this.O) != null) {
                if (ziVar.Q3()) {
                    i3 = org.telegram.ui.ActionBar.k6.Bc;
                } else {
                    i3 = org.telegram.ui.ActionBar.k6.We;
                }
                radialProgress2.m(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public f7(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f29230r = org.telegram.messenger.g0.L(9.0f);
        this.E = org.telegram.messenger.g0.L(29.0f);
        this.J = org.telegram.messenger.g0.L(29.0f);
        int i10 = h10.f22829t0;
        this.Q = i10;
        this.f29223g0 = true;
        this.f29224h0 = 0.0f;
        this.f29227k0 = 1.0f;
        this.f29218d0 = e6Var;
        this.V = i3;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.U = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.k6.We, org.telegram.ui.ActionBar.k6.Xe, org.telegram.ui.ActionBar.k6.f27979id, org.telegram.ui.ActionBar.k6.f27995jd);
        this.R = org.telegram.messenger.z5.q(i10).k();
        setWillNotDraw(false);
        wo woVar = new wo(22, context, e6Var);
        this.f29214b = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        boolean z10 = bd.f21784a0;
        addView(woVar, mf.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i3 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.f29215b0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.f29212a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new fs(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.f29217c0 = textPaint2;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        if (e6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f29225i0 = textPaint3;
            textPaint3.setTypeface(org.telegram.messenger.g0.o());
            textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
