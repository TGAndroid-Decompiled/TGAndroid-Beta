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
    public ValueAnimator f30102a;
    public float f30103a0;
    public pz f30104b;
    public int f30105b0;
    public int f30106c;
    public int f30107c0;
    public int d;
    public int f30108d0;
    public int e;
    public float f30109e0;
    public final RectF f30110f;
    public float f30111f0;
    public float f30112g0;
    public CharSequence h;
    public float f30113h0;
    public float f30114i0;
    public float f30115j0;
    public float f30116k0;
    public boolean f30117l0;
    public final tz m0;
    public boolean f30118n;
    public k5 f30119r;
    public StaticLayout f30120s;
    public int f30121w;
    public boolean f30122x;
    public float f30123y;

    public rz(tz tzVar, Context context) {
        super(context);
        this.m0 = tzVar;
        this.f30110f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f30122x = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f30102a = null;
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
        return this.f30104b.f29572a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f30117l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f30104b.f29576g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f30119r = o5.update(i10, this, this.f30119r, this.f30120s);
        if (this.f30104b.f29576g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = o5.update(i11, this, this.O, this.P);
        if (this.f30104b.f29576g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = o5.update(i12, this, this.Q, this.R);
        if (!this.f30104b.f29576g) {
            i13 = 0;
        }
        this.S = o5.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f30117l0 = false;
        super.onDetachedFromWindow();
        this.f30122x = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f30102a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f30102a.removeAllUpdateListeners();
            this.f30102a.cancel();
            this.f30102a = null;
        }
        invalidate();
        o5.release(this, this.f30119r);
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
        pz pzVar = this.f30104b;
        if (pzVar != null && (i11 = this.m0.L) != -1 && pzVar.f29572a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.dd.L0(2131754816, null)));
        if (this.f30104b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f30104b.f29573b);
            pz pzVar2 = this.f30104b;
            if (pzVar2 != null) {
                i10 = pzVar2.d;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                sb2.append("\n");
                sb2.append(org.telegram.messenger.dd.G(i10, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(24.0f) + this.f30104b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
