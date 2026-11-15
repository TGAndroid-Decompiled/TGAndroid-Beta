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
import org.telegram.messenger.a20;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.pz;
public class f7 extends FrameLayout implements org.telegram.messenger.x5, is, org.telegram.ui.ActionBar.z5 {
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
    public gj O;
    public boolean P;
    public final int Q;
    public final int R;
    public int S;
    public int T;
    public final RadialProgress2 U;
    public final int V;
    public StaticLayout W;
    public final SpannableStringBuilder f30271a;
    public int f30272a0;
    public final fp f30273b;
    public final TextPaint f30274b0;
    public boolean f30275c;
    public final TextPaint f30276c0;
    public boolean d;
    public final org.telegram.ui.ActionBar.e6 f30277d0;
    public boolean f30278e;
    public boolean f30279e0;
    public int f30280f;
    public float f30281f0;
    public boolean f30282g0;
    public int h;
    public float f30283h0;
    public final TextPaint f30284i0;
    public a20 f30285j0;
    public float f30286k0;
    public pz f30287l0;
    public int f30288n;
    public final int f30289r;
    public StaticLayout f30290s;
    public float f30291w;
    public float f30292x;
    public org.telegram.ui.Components.l5 f30293y;

    public f7(Context context) {
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
                if (this.f30280f == 2 && this.T != 1) {
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f30277d0;
        if (this.V == 1) {
            this.f30274b0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A6, e6Var));
        }
        StaticLayout staticLayout2 = this.W;
        int i11 = this.f30289r;
        int i12 = 0;
        float f16 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (hd.f24101a0) {
                f15 = 24.0f;
            } else {
                f15 = org.telegram.messenger.g0.C;
            }
            int L = org.telegram.messenger.g0.L(f15);
            if (hd.f24101a0) {
                i10 = 0;
            } else {
                i10 = this.f30272a0;
            }
            canvas.translate(L + i10, i11);
            this.W.draw(canvas);
            canvas.restore();
        }
        float f17 = 0.0f;
        if (this.f30290s != null) {
            int alpha = org.telegram.ui.ActionBar.j6.f28884f3.getAlpha();
            float f18 = this.f30283h0;
            if (f18 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f28884f3.setAlpha((int) (alpha * f18));
            }
            canvas.save();
            if (hd.f24101a0) {
                f12 = 24.0f;
            } else {
                f12 = org.telegram.messenger.g0.C;
            }
            int L2 = org.telegram.messenger.g0.L(f12);
            if (hd.f24101a0 && (staticLayout = this.W) != null) {
                int width = staticLayout.getWidth();
                if (hd.f24101a0) {
                    f14 = 12.0f;
                } else {
                    f14 = 4.0f;
                }
                i12 = width + org.telegram.messenger.g0.L(f14);
            }
            float f19 = L2 + i12;
            if (hd.f24101a0) {
                f13 = this.f30290s.getWidth() - this.f30292x;
            } else {
                f13 = 0.0f;
            }
            canvas.translate((f19 + f13) - this.f30291w, i11);
            this.f30290s.draw(canvas);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.f30290s, this.f30293y, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f30283h0 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f28884f3.setAlpha(alpha);
            }
        }
        if (this.N != null) {
            this.f30276c0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var));
            canvas.save();
            if (hd.f24101a0) {
                f10 = 24.0f;
            } else {
                f10 = org.telegram.messenger.g0.C;
            }
            float L3 = org.telegram.messenger.g0.L(f10);
            if (hd.f24101a0) {
                f11 = this.N.getWidth() - this.M;
            } else {
                f11 = 0.0f;
            }
            canvas.translate((L3 + f11) - this.L, this.J);
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.I != null) {
            org.telegram.ui.ActionBar.j6.f28901g3.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29260z6, e6Var));
            int alpha2 = org.telegram.ui.ActionBar.j6.f28901g3.getAlpha();
            float f20 = this.f30283h0;
            if (f20 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f28901g3.setAlpha((int) (alpha2 * f20));
            }
            canvas.save();
            if (!hd.f24101a0) {
                f16 = org.telegram.messenger.g0.C;
            }
            float L4 = org.telegram.messenger.g0.L(f16);
            if (hd.f24101a0) {
                f17 = this.I.getWidth() - this.H;
            }
            canvas.translate((L4 + f17) - this.G, this.E);
            this.I.draw(canvas);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.I, this.F, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f30283h0 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f28901g3.setAlpha(alpha2);
            }
        }
        if (this.d) {
            i7 = org.telegram.ui.ActionBar.j6.f28799ae;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.Zd;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        RadialProgress2 radialProgress2 = this.U;
        radialProgress2.d = w02;
        radialProgress2.H = this.f30283h0;
        radialProgress2.draw(canvas);
        if (this.f30275c) {
            if (hd.f24101a0) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - org.telegram.messenger.g0.L(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.W0("paintDivider", e6Var));
            } else {
                canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.W0("paintDivider", e6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z10 = this.f30279e0;
        if (!z10 && this.f30281f0 == 0.0f) {
            return;
        }
        if (z10) {
            float f10 = this.f30281f0;
            if (f10 != 1.0f) {
                this.f30281f0 = f10 + 0.10666667f;
                invalidate();
                this.f30281f0 = Utilities.i(this.f30281f0, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f11 = this.f30281f0;
                canvas.scale(f11, f11, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.j6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.j6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f12 = this.f30281f0;
            if (f12 != 0.0f) {
                this.f30281f0 = f12 - 0.10666667f;
                invalidate();
            }
        }
        this.f30281f0 = Utilities.i(this.f30281f0, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f112 = this.f30281f0;
        canvas.scale(f112, f112, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.j6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.j6.Z0.draw(canvas);
        canvas.restore();
    }

    public boolean d(gj gjVar) {
        a20 a20Var = this.f30285j0;
        if (a20Var != null && ((Boolean) a20Var.a(gjVar)).booleanValue()) {
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
        boolean z10 = this.f30282g0;
        if (z10) {
            float f10 = this.f30283h0;
            if (f10 != 1.0f) {
                this.f30283h0 = f10 + 0.10666667f;
                invalidate();
                this.f30283h0 = Utilities.i(this.f30283h0, 1.0f, 0.0f);
                if (this.f30286k0 == 1.0f && this.f30287l0 != null) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.f30286k0) * 255.0f), 31);
                    this.f30287l0.setViewType(4);
                    this.f30287l0.updateColors();
                    this.f30287l0.g();
                    this.f30287l0.draw(canvas);
                    canvas.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.f30286k0 * 255.0f), 31);
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
            float f11 = this.f30283h0;
            if (f11 != 0.0f) {
                this.f30283h0 = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.f30283h0 = Utilities.i(this.f30283h0, 1.0f, 0.0f);
        if (this.f30286k0 == 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        fp fpVar = this.f30273b;
        if (fpVar.getVisibility() != 0) {
            fpVar.setVisibility(0);
        }
        fpVar.a(z10, z11);
    }

    public final void f(gj gjVar, boolean z10) {
        TLRPC.PhotoSize photoSize;
        this.f30275c = z10;
        this.O = gjVar;
        TLRPC.Document F0 = gjVar.F0();
        if (F0 != null) {
            photoSize = org.telegram.messenger.w7.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        boolean z11 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.U;
        if (!z11 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = gjVar.J1;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.f32674w.v0(bitmap);
            } else {
                String u02 = gjVar.u0(true);
                if (!TextUtils.isEmpty(u02)) {
                    radialProgress2.h(u02);
                } else {
                    radialProgress2.i(null, null, null);
                }
            }
        } else {
            radialProgress2.i(photoSize, F0, gjVar);
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
        gj gjVar = this.O;
        if (!gjVar.f23872y0 && !gjVar.f23876z0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (gz.B0 && gjVar.I3() && ((int) gj.B0(this.O.f23817k)) != 0) {
            if (z12) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f30280f = i10;
            z12 = true;
        } else {
            this.f30280f = 0;
            this.T = -1;
        }
        int i11 = this.f30280f;
        int i12 = this.Q;
        RadialProgress2 radialProgress2 = this.U;
        if (i11 != 0) {
            if (this.O.P3()) {
                i7 = org.telegram.ui.ActionBar.j6.Ec;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.Ze;
            }
            radialProgress2.m(org.telegram.ui.ActionBar.j6.w0(i7, this.f30277d0));
            boolean I = MediaController.B().I(this.O);
            if (I && (!I || !MediaController.B().H())) {
                this.S = 1;
            } else {
                this.S = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            if (this.f30280f == 1) {
                org.telegram.messenger.z5.q(i12).v(this);
                this.T = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            org.telegram.messenger.z5.q(i12).a(S0, this.O, this);
            if (!org.telegram.messenger.w7.G(i12).S(S0)) {
                this.T = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            this.T = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            Float w10 = fc.D().w(S0);
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
            if (!org.telegram.messenger.w7.G(i12).S(S0)) {
                this.S = 2;
                radialProgress2.p(z11, 0.0f);
            } else {
                this.S = 4;
                Float w11 = fc.D().w(S0);
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

    public gj getMessage() {
        return this.O;
    }

    @Override
    public int getObserverTag() {
        return this.R;
    }

    @Override
    public final void i(long j3, long j10) {
        this.U.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.f30280f != 0) {
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
        ns.f(i7).c(this, ns.f25494f2);
        ns.f(i7).c(this, ns.f25500g2);
        ns.f(i7).c(this, ns.f25506h2);
        this.f30293y = org.telegram.ui.Components.p5.update(0, this, this.f30293y, this.f30290s);
        this.F = org.telegram.ui.Components.p5.update(0, this, this.F, this.I);
        this.K = org.telegram.ui.Components.p5.update(0, this, this.K, this.N);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.Q;
        org.telegram.messenger.z5.q(i7).v(this);
        this.U.f();
        ns.f(i7).n(this, ns.f25494f2);
        ns.f(i7).n(this, ns.f25500g2);
        ns.f(i7).n(this, ns.f25506h2);
        org.telegram.ui.Components.p5.release(this, this.f30293y);
        org.telegram.ui.Components.p5.release(this, this.F);
        org.telegram.ui.Components.p5.release(this, this.K);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String M0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.O.I3()) {
            accessibilityNodeInfo.setText(hd.a0("AccDescrMusicInfo", null, 2131754832, this.O.w1(true), this.O.y1(true)));
        } else if (this.f30290s != null && this.I != null) {
            accessibilityNodeInfo.setText(((Object) this.f30290s.getText()) + ", " + ((Object) this.I.getText()));
        }
        if (this.f30273b.f34663a.f32441q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    M0 = hd.M0(2131754929, "AccActionPlay");
                } else {
                    M0 = hd.M0(2131754941, "AccActionCancelDownload");
                }
            } else {
                M0 = hd.M0(2131754938, "AccActionDownload");
            }
        } else {
            M0 = hd.M0(2131754930, "AccActionPause");
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
        if (this.f30286k0 != f10) {
            this.f30286k0 = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(pz pzVar) {
        this.f30287l0 = pzVar;
    }

    public void setNeedPlayMessageListener(a20 a20Var) {
        this.f30285j0 = a20Var;
    }

    @Override
    public final void updateColors() {
        gj gjVar;
        int i7;
        try {
            TextPaint textPaint = this.f30284i0;
            org.telegram.ui.ActionBar.e6 e6Var = this.f30277d0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var));
            }
            RadialProgress2 radialProgress2 = this.U;
            if (radialProgress2 != null && this.f30280f != 0 && (gjVar = this.O) != null) {
                if (gjVar.P3()) {
                    i7 = org.telegram.ui.ActionBar.j6.Ec;
                } else {
                    i7 = org.telegram.ui.ActionBar.j6.Ze;
                }
                radialProgress2.m(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public f7(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f30289r = org.telegram.messenger.g0.L(9.0f);
        this.E = org.telegram.messenger.g0.L(29.0f);
        this.J = org.telegram.messenger.g0.L(29.0f);
        int i10 = m10.f24934t0;
        this.Q = i10;
        this.f30282g0 = true;
        this.f30283h0 = 0.0f;
        this.f30286k0 = 1.0f;
        this.f30277d0 = e6Var;
        this.V = i7;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.U = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.j6.Ze, org.telegram.ui.ActionBar.j6.f28800af, org.telegram.ui.ActionBar.j6.f29003ld, org.telegram.ui.ActionBar.j6.f29019md);
        this.R = org.telegram.messenger.z5.q(i10).k();
        setWillNotDraw(false);
        fp fpVar = new fp(22, context, e6Var);
        this.f30273b = fpVar;
        fpVar.setVisibility(4);
        fpVar.b(-1, org.telegram.ui.ActionBar.j6.f28849d6, org.telegram.ui.ActionBar.j6.f28979k7);
        fpVar.setDrawUnchecked(false);
        fpVar.setDrawBackgroundAsArc(3);
        boolean z10 = hd.f24101a0;
        addView(fpVar, c8.ja.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i7 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.f30274b0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.f30271a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new ls(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.f30276c0 = textPaint2;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        if (e6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f30284i0 = textPaint3;
            textPaint3.setTypeface(org.telegram.messenger.g0.o());
            textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint3.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
