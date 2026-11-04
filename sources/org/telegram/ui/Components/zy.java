package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class zy extends View {
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
    public l5 P;
    public StaticLayout Q;
    public l5 R;
    public StaticLayout S;
    public l5 T;
    public StaticLayout U;
    public boolean V;
    public boolean W;
    public ValueAnimator f41146a;
    public boolean f41147a0;
    public yy f41148b;
    public float f41149b0;
    public int f41150c;
    public int f41151c0;
    public int d;
    public int f41152d0;
    public int f41153e;
    public int f41154e0;
    public final RectF f41155f;
    public float f41156f0;
    public float f41157g0;
    public CharSequence h;
    public float f41158h0;
    public float f41159i0;
    public float f41160j0;
    public float f41161k0;
    public float f41162l0;
    public boolean m0;
    public boolean f41163n;
    public final bz f41164n0;
    public l5 f41165r;
    public StaticLayout f41166s;
    public int f41167w;
    public boolean f41168x;
    public float f41169y;

    public zy(bz bzVar, Context context) {
        super(context);
        this.f41164n0 = bzVar;
        this.f41155f = new RectF();
        this.J = -1;
    }

    public final void a() {
        this.f41168x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.f41147a0 = false;
        this.f41146a = null;
        invalidate();
    }

    public final void b(float f10, int i3) {
        if (i3 == 6) {
            this.E = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, org.telegram.messenger.g0.L(f10));
        ofFloat.addUpdateListener(new uy(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new ci.pc(this, i3, f10, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f41148b.f40853a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i3;
        int i10;
        int i11;
        this.m0 = true;
        super.onAttachedToWindow();
        int i12 = 26;
        if (this.f41148b.f40858g) {
            i3 = 26;
        } else {
            i3 = 0;
        }
        this.f41165r = p5.update(i3, this, this.f41165r, this.f41166s);
        if (this.f41148b.f40858g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.P = p5.update(i10, this, this.P, this.Q);
        if (this.f41148b.f40858g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.R = p5.update(i11, this, this.R, this.S);
        if (!this.f41148b.f40858g) {
            i12 = 0;
        }
        this.T = p5.update(i12, this, this.T, this.U);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.m0 = false;
        super.onDetachedFromWindow();
        this.f41168x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.f41147a0 = false;
        ValueAnimator valueAnimator = this.f41146a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f41146a.removeAllUpdateListeners();
            this.f41146a.cancel();
            this.f41146a = null;
        }
        invalidate();
        p5.release(this, this.f41165r);
        p5.release(this, this.P);
        p5.release(this, this.R);
        p5.release(this, this.T);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zy.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i3;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        yy yyVar = this.f41148b;
        if (yyVar != null && (i10 = this.f41164n0.M) != -1 && yyVar.f40853a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.bd.M0(2131754816, null)));
        if (this.f41148b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f41148b.f40854b);
            yy yyVar2 = this.f41148b;
            if (yyVar2 != null) {
                i3 = yyVar2.d;
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                sb2.append("\n");
                sb2.append(org.telegram.messenger.bd.G(i3, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(24.0f) + this.f41148b.a(false) + this.f41164n0.O, View.MeasureSpec.getSize(i10));
    }
}
