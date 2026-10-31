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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hc;
import org.telegram.messenger.jj;
import org.telegram.messenger.r20;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.zz;
public class k7 extends FrameLayout implements org.telegram.messenger.z5, us, org.telegram.ui.ActionBar.k6 {
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
    public jj N;
    public boolean O;
    public final int P;
    public final int Q;
    public int R;
    public int S;
    public final RadialProgress2 T;
    public final int U;
    public StaticLayout V;
    public int W;
    public final SpannableStringBuilder f22155a;
    public final TextPaint f22156a0;
    public final ep f22157b;
    public final TextPaint f22158b0;
    public boolean f22159c;
    public final org.telegram.ui.ActionBar.p6 f22160c0;
    public boolean d;
    public boolean f22161d0;
    public boolean e;
    public float f22162e0;
    public int f22163f;
    public boolean f22164f0;
    public float f22165g0;
    public int h;
    public final TextPaint f22166h0;
    public r20 f22167i0;
    public float f22168j0;
    public zz f22169k0;
    public int f22170n;
    public final int f22171r;
    public StaticLayout f22172s;
    public float f22173w;
    public float f22174x;
    public org.telegram.ui.Components.k5 f22175y;

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
    public final void C(boolean z10) {
        g(true, z10);
    }

    @Override
    public final void M(String str) {
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
                if (this.f22163f == 2 && this.S != 1) {
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
        org.telegram.ui.ActionBar.p6 p6Var = this.f22160c0;
        if (this.U == 1) {
            this.f22156a0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A6, p6Var));
        }
        StaticLayout staticLayout2 = this.V;
        int i12 = this.f22171r;
        int i13 = 0;
        float f15 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (cd.X) {
                f14 = 24.0f;
            } else {
                f14 = org.telegram.messenger.i0.C;
            }
            int L = org.telegram.messenger.i0.L(f14);
            if (cd.X) {
                i11 = 0;
            } else {
                i11 = this.W;
            }
            canvas.translate(L + i11, i12);
            this.V.draw(canvas);
            canvas.restore();
        }
        float f16 = 0.0f;
        if (this.f22172s != null) {
            int alpha = org.telegram.ui.ActionBar.t6.f20963f3.getAlpha();
            float f17 = this.f22165g0;
            if (f17 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f20963f3.setAlpha((int) (alpha * f17));
            }
            canvas.save();
            if (cd.X) {
                f11 = 24.0f;
            } else {
                f11 = org.telegram.messenger.i0.C;
            }
            int L2 = org.telegram.messenger.i0.L(f11);
            if (cd.X && (staticLayout = this.V) != null) {
                int width = staticLayout.getWidth();
                if (cd.X) {
                    f13 = 12.0f;
                } else {
                    f13 = 4.0f;
                }
                i13 = width + org.telegram.messenger.i0.L(f13);
            }
            float f18 = L2 + i13;
            if (cd.X) {
                f12 = this.f22172s.getWidth() - this.f22174x;
            } else {
                f12 = 0.0f;
            }
            canvas.translate((f18 + f12) - this.f22173w, i12);
            this.f22172s.draw(canvas);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.f22172s, this.f22175y, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f22165g0 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f20963f3.setAlpha(alpha);
            }
        }
        if (this.M != null) {
            this.f22158b0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            canvas.save();
            if (cd.X) {
                f7 = 24.0f;
            } else {
                f7 = org.telegram.messenger.i0.C;
            }
            float L3 = org.telegram.messenger.i0.L(f7);
            if (cd.X) {
                f10 = this.M.getWidth() - this.L;
            } else {
                f10 = 0.0f;
            }
            canvas.translate((L3 + f10) - this.K, this.I);
            this.M.draw(canvas);
            canvas.restore();
        }
        if (this.H != null) {
            org.telegram.ui.ActionBar.t6.f20982g3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21330z6, p6Var));
            int alpha2 = org.telegram.ui.ActionBar.t6.f20982g3.getAlpha();
            float f19 = this.f22165g0;
            if (f19 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f20982g3.setAlpha((int) (alpha2 * f19));
            }
            canvas.save();
            if (!cd.X) {
                f15 = org.telegram.messenger.i0.C;
            }
            float L4 = org.telegram.messenger.i0.L(f15);
            if (cd.X) {
                f16 = this.H.getWidth() - this.G;
            }
            canvas.translate((L4 + f16) - this.F, this.D);
            this.H.draw(canvas);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.H, this.E, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f22165g0 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f20982g3.setAlpha(alpha2);
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
        radialProgress2.H = this.f22165g0;
        radialProgress2.draw(canvas);
        if (this.f22159c) {
            if (cd.X) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - org.telegram.messenger.i0.L(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
            } else {
                canvas.drawLine(org.telegram.messenger.i0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z10 = this.f22161d0;
        if (!z10 && this.f22162e0 == 0.0f) {
            return;
        }
        if (z10) {
            float f7 = this.f22162e0;
            if (f7 != 1.0f) {
                this.f22162e0 = f7 + 0.10666667f;
                invalidate();
                this.f22162e0 = Utilities.i(this.f22162e0, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f)) - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f10 = this.f22162e0;
                canvas.scale(f10, f10, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.t6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.t6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f11 = this.f22162e0;
            if (f11 != 0.0f) {
                this.f22162e0 = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.f22162e0 = Utilities.i(this.f22162e0, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f)) - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f102 = this.f22162e0;
        canvas.scale(f102, f102, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.t6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.t6.Z0.draw(canvas);
        canvas.restore();
    }

    public boolean d(jj jjVar) {
        r20 r20Var = this.f22167i0;
        if (r20Var != null && ((Boolean) r20Var.a(jjVar)).booleanValue()) {
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
        boolean z10 = this.f22164f0;
        if (z10) {
            float f7 = this.f22165g0;
            if (f7 != 1.0f) {
                this.f22165g0 = f7 + 0.10666667f;
                invalidate();
                this.f22165g0 = Utilities.i(this.f22165g0, 1.0f, 0.0f);
                if (this.f22168j0 == 1.0f && this.f22169k0 != null) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.f22168j0) * 255.0f), 31);
                    this.f22169k0.setViewType(4);
                    this.f22169k0.updateColors();
                    this.f22169k0.f();
                    this.f22169k0.draw(canvas);
                    canvas.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.f22168j0 * 255.0f), 31);
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
            float f10 = this.f22165g0;
            if (f10 != 0.0f) {
                this.f22165g0 = f10 - 0.10666667f;
                invalidate();
            }
        }
        this.f22165g0 = Utilities.i(this.f22165g0, 1.0f, 0.0f);
        if (this.f22168j0 == 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        ep epVar = this.f22157b;
        if (epVar.getVisibility() != 0) {
            epVar.setVisibility(0);
        }
        epVar.a(z10, z11);
    }

    public final void f(jj jjVar, boolean z10) {
        TLRPC.PhotoSize photoSize;
        this.f22159c = z10;
        this.N = jjVar;
        TLRPC.Document F0 = jjVar.F0();
        if (F0 != null) {
            photoSize = org.telegram.messenger.b8.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        boolean z11 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.T;
        if (!z11 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = jjVar.H1;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.f24141w.v0(bitmap);
            } else {
                String u02 = jjVar.u0(true);
                if (!TextUtils.isEmpty(u02)) {
                    radialProgress2.h(u02);
                } else {
                    radialProgress2.i(null, null, null);
                }
            }
        } else {
            radialProgress2.i(photoSize, F0, jjVar);
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
        jj jjVar = this.N;
        if (!jjVar.f16383w0 && !jjVar.f16387x0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (tz.B0 && jjVar.I3() && ((int) jj.B0(this.N.f16337k)) != 0) {
            if (z12) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f22163f = i11;
            z12 = true;
        } else {
            this.f22163f = 0;
            this.S = -1;
        }
        int i12 = this.f22163f;
        int i13 = this.P;
        RadialProgress2 radialProgress2 = this.T;
        if (i12 != 0) {
            if (this.N.P3()) {
                i10 = org.telegram.ui.ActionBar.t6.Bc;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.We;
            }
            radialProgress2.m(org.telegram.ui.ActionBar.t6.w0(i10, this.f22160c0));
            boolean I = MediaController.B().I(this.N);
            if (I && (!I || !MediaController.B().H())) {
                this.R = 1;
            } else {
                this.R = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            if (this.f22163f == 1) {
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
            Float w9 = hc.D().w(S0);
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
                Float w10 = hc.D().w(S0);
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

    public jj getMessage() {
        return this.N;
    }

    @Override
    public int getObserverTag() {
        return this.Q;
    }

    @Override
    public final void i(long j10, long j11) {
        this.T.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.f22163f != 0) {
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
        zs.f(i10).c(this, zs.f19610f2);
        zs.f(i10).c(this, zs.f19616g2);
        zs.f(i10).c(this, zs.f19622h2);
        this.f22175y = org.telegram.ui.Components.o5.update(0, this, this.f22175y, this.f22172s);
        this.E = org.telegram.ui.Components.o5.update(0, this, this.E, this.H);
        this.J = org.telegram.ui.Components.o5.update(0, this, this.J, this.M);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.P;
        org.telegram.messenger.b6.q(i10).v(this);
        this.T.f();
        zs.f(i10).n(this, zs.f19610f2);
        zs.f(i10).n(this, zs.f19616g2);
        zs.f(i10).n(this, zs.f19622h2);
        org.telegram.ui.Components.o5.release(this, this.f22175y);
        org.telegram.ui.Components.o5.release(this, this.E);
        org.telegram.ui.Components.o5.release(this, this.J);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String L0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.N.I3()) {
            accessibilityNodeInfo.setText(cd.a0("AccDescrMusicInfo", null, 2131754832, this.N.x1(true), this.N.z1(true)));
        } else if (this.f22172s != null && this.H != null) {
            accessibilityNodeInfo.setText(((Object) this.f22172s.getText()) + ", " + ((Object) this.H.getText()));
        }
        if (this.f22157b.f25836a.f23919q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    L0 = cd.L0(2131754929, "AccActionPlay");
                } else {
                    L0 = cd.L0(2131754941, "AccActionCancelDownload");
                }
            } else {
                L0 = cd.L0(2131754938, "AccActionDownload");
            }
        } else {
            L0 = cd.L0(2131754930, "AccActionPause");
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
        if (this.f22168j0 != f7) {
            this.f22168j0 = f7;
            invalidate();
        }
    }

    public void setGlobalGradientView(zz zzVar) {
        this.f22169k0 = zzVar;
    }

    public void setNeedPlayMessageListener(r20 r20Var) {
        this.f22167i0 = r20Var;
    }

    @Override
    public final void updateColors() {
        jj jjVar;
        int i10;
        try {
            TextPaint textPaint = this.f22166h0;
            org.telegram.ui.ActionBar.p6 p6Var = this.f22160c0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            }
            RadialProgress2 radialProgress2 = this.T;
            if (radialProgress2 != null && this.f22163f != 0 && (jjVar = this.N) != null) {
                if (jjVar.P3()) {
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
        this.f22171r = org.telegram.messenger.i0.L(9.0f);
        this.D = org.telegram.messenger.i0.L(29.0f);
        this.I = org.telegram.messenger.i0.L(29.0f);
        int i11 = d20.f15147s0;
        this.P = i11;
        this.f22164f0 = true;
        this.f22165g0 = 0.0f;
        this.f22168j0 = 1.0f;
        this.f22160c0 = p6Var;
        this.U = i10;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, p6Var);
        this.T = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.t6.We, org.telegram.ui.ActionBar.t6.Xe, org.telegram.ui.ActionBar.t6.f21026id, org.telegram.ui.ActionBar.t6.f21045jd);
        this.Q = org.telegram.messenger.b6.q(i11).k();
        setWillNotDraw(false);
        ep epVar = new ep(22, context, p6Var);
        this.f22157b = epVar;
        epVar.setVisibility(4);
        epVar.b(-1, org.telegram.ui.ActionBar.t6.f20929d6, org.telegram.ui.ActionBar.t6.f21059k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(3);
        boolean z10 = cd.X;
        addView(epVar, w7.b6.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.f22156a0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.f22155a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new qs(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.f22158b0 = textPaint2;
        textPaint2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        if (p6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f22166h0 = textPaint3;
            textPaint3.setTypeface(org.telegram.messenger.i0.o());
            textPaint3.setTextSize(org.telegram.messenger.i0.L(15.0f));
            textPaint3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void n(long j10, long j11) {
    }
}
