package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class cz extends View {
    public float D;
    public float E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public StaticLayout K;
    public StaticLayout L;
    public StaticLayout M;
    public CharSequence N;
    public n5 O;
    public StaticLayout P;
    public n5 Q;
    public StaticLayout R;
    public n5 S;
    public StaticLayout T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ValueAnimator f32698a;
    public float f32699a0;
    public bz f32700b;
    public int f32701b0;
    public int f32702c;
    public int f32703c0;
    public int d;
    public int f32704d0;
    public int f32705e;
    public float f32706e0;
    public final RectF f32707f;
    public float f32708f0;
    public float f32709g0;
    public CharSequence h;
    public float f32710h0;
    public float f32711i0;
    public float f32712j0;
    public float f32713k0;
    public boolean f32714l0;
    public final ez m0;
    public boolean f32715n;
    public n5 f32716r;
    public StaticLayout f32717s;
    public int f32718w;
    public boolean f32719x;
    public float f32720y;

    public cz(ez ezVar, Context context) {
        super(context);
        this.m0 = ezVar;
        this.f32707f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f32719x = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f32698a = null;
        invalidate();
    }

    public final void b(float f10, int i7) {
        if (i7 == 6) {
            this.D = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, org.telegram.messenger.g0.L(f10));
        ofFloat.addUpdateListener(new xy(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new bi.yd(this, i7, f10, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f32700b.f32333a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        int i10;
        int i11;
        this.f32714l0 = true;
        super.onAttachedToWindow();
        int i12 = 26;
        if (this.f32700b.f32338g) {
            i7 = 26;
        } else {
            i7 = 0;
        }
        this.f32716r = r5.update(i7, this, this.f32716r, this.f32717s);
        if (this.f32700b.f32338g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.O = r5.update(i10, this, this.O, this.P);
        if (this.f32700b.f32338g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.Q = r5.update(i11, this, this.Q, this.R);
        if (!this.f32700b.f32338g) {
            i12 = 0;
        }
        this.S = r5.update(i12, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f32714l0 = false;
        super.onDetachedFromWindow();
        this.f32719x = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f32698a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f32698a.removeAllUpdateListeners();
            this.f32698a.cancel();
            this.f32698a = null;
        }
        invalidate();
        r5.release(this, this.f32716r);
        r5.release(this, this.O);
        r5.release(this, this.Q);
        r5.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cz.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        int i7;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        bz bzVar = this.f32700b;
        if (bzVar != null && (i10 = this.m0.L) != -1 && bzVar.f32333a == i10) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setSelected(z9);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.hd.M0(2131754816, null)));
        if (this.f32700b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f32700b.f32334b);
            bz bzVar2 = this.f32700b;
            if (bzVar2 != null) {
                i7 = bzVar2.d;
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
        setMeasuredDimension(org.telegram.messenger.g0.L(24.0f) + this.f32700b.a(false) + this.m0.N, View.MeasureSpec.getSize(i10));
    }
}
