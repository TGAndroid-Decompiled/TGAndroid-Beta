package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class rz extends View {
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
    public k5 O;
    public StaticLayout P;
    public k5 Q;
    public StaticLayout R;
    public k5 S;
    public StaticLayout T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ValueAnimator f30047a;
    public float f30048a0;
    public pz f30049b;
    public int f30050b0;
    public int f30051c;
    public int f30052c0;
    public int d;
    public int f30053d0;
    public int e;
    public float f30054e0;
    public final RectF f30055f;
    public float f30056f0;
    public float f30057g0;
    public CharSequence h;
    public float f30058h0;
    public float f30059i0;
    public float f30060j0;
    public float f30061k0;
    public boolean f30062l0;
    public final tz m0;
    public boolean f30063n;
    public k5 f30064r;
    public StaticLayout f30065s;
    public int f30066w;
    public boolean f30067x;
    public float f30068y;

    public rz(tz tzVar, Context context) {
        super(context);
        this.m0 = tzVar;
        this.f30055f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f30067x = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f30047a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.D = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, org.telegram.messenger.i0.L(f7));
        ofFloat.addUpdateListener(new lz(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new qz(this, i10, f7, 0));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f30049b.f29471a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f30062l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f30049b.f29475g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f30064r = o5.update(i10, this, this.f30064r, this.f30065s);
        if (this.f30049b.f29475g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = o5.update(i11, this, this.O, this.P);
        if (this.f30049b.f29475g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = o5.update(i12, this, this.Q, this.R);
        if (!this.f30049b.f29475g) {
            i13 = 0;
        }
        this.S = o5.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f30062l0 = false;
        super.onDetachedFromWindow();
        this.f30067x = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f30047a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f30047a.removeAllUpdateListeners();
            this.f30047a.cancel();
            this.f30047a = null;
        }
        invalidate();
        o5.release(this, this.f30064r);
        o5.release(this, this.O);
        o5.release(this, this.Q);
        o5.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rz.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        pz pzVar = this.f30049b;
        if (pzVar != null && (i11 = this.m0.L) != -1 && pzVar.f29471a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.cd.L0(2131754816, null)));
        if (this.f30049b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f30049b.f29472b);
            pz pzVar2 = this.f30049b;
            if (pzVar2 != null) {
                i10 = pzVar2.d;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                sb2.append("\n");
                sb2.append(org.telegram.messenger.cd.G(i10, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(24.0f) + this.f30049b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
