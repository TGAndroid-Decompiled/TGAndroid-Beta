package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class dz extends View {
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
    public ValueAnimator f33115a;
    public float f33116a0;
    public cz f33117b;
    public int f33118b0;
    public int f33119c;
    public int f33120c0;
    public int d;
    public int f33121d0;
    public int f33122e;
    public float f33123e0;
    public final RectF f33124f;
    public float f33125f0;
    public float f33126g0;
    public CharSequence h;
    public float f33127h0;
    public float f33128i0;
    public float f33129j0;
    public float f33130k0;
    public boolean f33131l0;
    public final fz m0;
    public boolean f33132n;
    public n5 f33133r;
    public StaticLayout f33134s;
    public int f33135w;
    public boolean f33136x;
    public float f33137y;

    public dz(fz fzVar, Context context) {
        super(context);
        this.m0 = fzVar;
        this.f33124f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f33136x = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f33115a = null;
        invalidate();
    }

    public final void b(float f10, int i7) {
        if (i7 == 6) {
            this.D = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, org.telegram.messenger.g0.L(f10));
        ofFloat.addUpdateListener(new yy(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new bi.yd(this, i7, f10, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f33117b.f32731a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        int i10;
        int i11;
        this.f33131l0 = true;
        super.onAttachedToWindow();
        int i12 = 26;
        if (this.f33117b.f32736g) {
            i7 = 26;
        } else {
            i7 = 0;
        }
        this.f33133r = r5.update(i7, this, this.f33133r, this.f33134s);
        if (this.f33117b.f32736g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.O = r5.update(i10, this, this.O, this.P);
        if (this.f33117b.f32736g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.Q = r5.update(i11, this, this.Q, this.R);
        if (!this.f33117b.f32736g) {
            i12 = 0;
        }
        this.S = r5.update(i12, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f33131l0 = false;
        super.onDetachedFromWindow();
        this.f33136x = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f33115a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f33115a.removeAllUpdateListeners();
            this.f33115a.cancel();
            this.f33115a = null;
        }
        invalidate();
        r5.release(this, this.f33133r);
        r5.release(this, this.O);
        r5.release(this, this.Q);
        r5.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dz.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        int i7;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        cz czVar = this.f33117b;
        if (czVar != null && (i10 = this.m0.L) != -1 && czVar.f32731a == i10) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setSelected(z9);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.id.M0(2131754816, null)));
        if (this.f33117b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f33117b.f32732b);
            cz czVar2 = this.f33117b;
            if (czVar2 != null) {
                i7 = czVar2.d;
            } else {
                i7 = 0;
            }
            if (i7 > 0) {
                sb2.append("\n");
                sb2.append(org.telegram.messenger.id.G(i7, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(24.0f) + this.f33117b.a(false) + this.m0.N, View.MeasureSpec.getSize(i10));
    }
}
