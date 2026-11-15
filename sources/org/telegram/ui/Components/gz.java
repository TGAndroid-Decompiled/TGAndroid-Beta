package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class gz extends View {
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
    public ValueAnimator f35103a;
    public boolean f35104a0;
    public fz f35105b;
    public float f35106b0;
    public int f35107c;
    public int f35108c0;
    public int d;
    public int f35109d0;
    public int f35110e;
    public int f35111e0;
    public final RectF f35112f;
    public float f35113f0;
    public float f35114g0;
    public CharSequence h;
    public float f35115h0;
    public float f35116i0;
    public float f35117j0;
    public float f35118k0;
    public float f35119l0;
    public boolean m0;
    public boolean f35120n;
    public final iz f35121n0;
    public l5 f35122r;
    public StaticLayout f35123s;
    public int f35124w;
    public boolean f35125x;
    public float f35126y;

    public gz(iz izVar, Context context) {
        super(context);
        this.f35121n0 = izVar;
        this.f35112f = new RectF();
        this.J = -1;
    }

    public final void a() {
        this.f35125x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.f35104a0 = false;
        this.f35103a = null;
        invalidate();
    }

    public final void b(float f10, int i7) {
        if (i7 == 6) {
            this.E = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, org.telegram.messenger.g0.L(f10));
        ofFloat.addUpdateListener(new bz(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new di.fc(this, i7, f10, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f35105b.f34748a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        int i10;
        int i11;
        this.m0 = true;
        super.onAttachedToWindow();
        int i12 = 26;
        if (this.f35105b.f34753g) {
            i7 = 26;
        } else {
            i7 = 0;
        }
        this.f35122r = p5.update(i7, this, this.f35122r, this.f35123s);
        if (this.f35105b.f34753g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.P = p5.update(i10, this, this.P, this.Q);
        if (this.f35105b.f34753g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.R = p5.update(i11, this, this.R, this.S);
        if (!this.f35105b.f34753g) {
            i12 = 0;
        }
        this.T = p5.update(i12, this, this.T, this.U);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.m0 = false;
        super.onDetachedFromWindow();
        this.f35125x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.f35104a0 = false;
        ValueAnimator valueAnimator = this.f35103a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35103a.removeAllUpdateListeners();
            this.f35103a.cancel();
            this.f35103a = null;
        }
        invalidate();
        p5.release(this, this.f35122r);
        p5.release(this, this.P);
        p5.release(this, this.R);
        p5.release(this, this.T);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gz.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i7;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        fz fzVar = this.f35105b;
        if (fzVar != null && (i10 = this.f35121n0.M) != -1 && fzVar.f34748a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.hd.M0(2131754816, null)));
        if (this.f35105b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f35105b.f34749b);
            fz fzVar2 = this.f35105b;
            if (fzVar2 != null) {
                i7 = fzVar2.d;
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
        setMeasuredDimension(org.telegram.messenger.g0.L(24.0f) + this.f35105b.a(false) + this.f35121n0.O, View.MeasureSpec.getSize(i10));
    }
}
