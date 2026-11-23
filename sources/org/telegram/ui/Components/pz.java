package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class pz extends View {
    public float E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public StaticLayout L;
    public StaticLayout M;
    public StaticLayout N;
    public CharSequence O;
    public u5 P;
    public StaticLayout Q;
    public u5 R;
    public StaticLayout S;
    public u5 T;
    public StaticLayout U;
    public boolean V;
    public boolean W;
    public ValueAnimator f38689a;
    public boolean f38690a0;
    public oz f38691b;
    public float f38692b0;
    public int f38693c;
    public int f38694c0;
    public int d;
    public int f38695d0;
    public int f38696e;
    public int f38697e0;
    public final RectF f38698f;
    public float f38699f0;
    public float f38700g0;
    public CharSequence h;
    public float f38701h0;
    public float f38702i0;
    public float f38703j0;
    public float f38704k0;
    public float f38705l0;
    public boolean m0;
    public boolean f38706n;
    public final rz f38707n0;
    public u5 f38708r;
    public StaticLayout f38709s;
    public int f38710w;
    public boolean f38711x;
    public float f38712y;

    public pz(rz rzVar, Context context) {
        super(context);
        this.f38707n0 = rzVar;
        this.f38698f = new RectF();
        this.J = -1;
    }

    public final void a() {
        this.f38711x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.f38690a0 = false;
        this.f38689a = null;
        invalidate();
    }

    public final void b(float f10, int i7) {
        if (i7 == 6) {
            this.E = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, org.telegram.messenger.g0.L(f10));
        ofFloat.addUpdateListener(new jz(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new di.ic(this, i7, f10, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f38691b.f38415a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        int i10;
        int i11;
        this.m0 = true;
        super.onAttachedToWindow();
        int i12 = 26;
        if (this.f38691b.f38420g) {
            i7 = 26;
        } else {
            i7 = 0;
        }
        this.f38708r = y5.update(i7, this, this.f38708r, this.f38709s);
        if (this.f38691b.f38420g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.P = y5.update(i10, this, this.P, this.Q);
        if (this.f38691b.f38420g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.R = y5.update(i11, this, this.R, this.S);
        if (!this.f38691b.f38420g) {
            i12 = 0;
        }
        this.T = y5.update(i12, this, this.T, this.U);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.m0 = false;
        super.onDetachedFromWindow();
        this.f38711x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.f38690a0 = false;
        ValueAnimator valueAnimator = this.f38689a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f38689a.removeAllUpdateListeners();
            this.f38689a.cancel();
            this.f38689a = null;
        }
        invalidate();
        y5.release(this, this.f38708r);
        y5.release(this, this.P);
        y5.release(this, this.R);
        y5.release(this, this.T);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pz.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i7;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        oz ozVar = this.f38691b;
        if (ozVar != null && (i10 = this.f38707n0.M) != -1 && ozVar.f38415a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.hd.N0(2131754815, null)));
        if (this.f38691b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f38691b.f38416b);
            oz ozVar2 = this.f38691b;
            if (ozVar2 != null) {
                i7 = ozVar2.d;
            } else {
                i7 = 0;
            }
            if (i7 > 0) {
                sb2.append("\n");
                sb2.append(org.telegram.messenger.hd.G(i7, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(24.0f) + this.f38691b.a(false) + this.f38707n0.O, View.MeasureSpec.getSize(i10));
    }
}
