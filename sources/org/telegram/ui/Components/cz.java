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
    public ValueAnimator f32707a;
    public float f32708a0;
    public bz f32709b;
    public int f32710b0;
    public int f32711c;
    public int f32712c0;
    public int d;
    public int f32713d0;
    public int f32714e;
    public float f32715e0;
    public final RectF f32716f;
    public float f32717f0;
    public float f32718g0;
    public CharSequence h;
    public float f32719h0;
    public float f32720i0;
    public float f32721j0;
    public float f32722k0;
    public boolean f32723l0;
    public final ez m0;
    public boolean f32724n;
    public n5 f32725r;
    public StaticLayout f32726s;
    public int f32727w;
    public boolean f32728x;
    public float f32729y;

    public cz(ez ezVar, Context context) {
        super(context);
        this.m0 = ezVar;
        this.f32716f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f32728x = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f32707a = null;
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
        return this.f32709b.f32341a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        int i10;
        int i11;
        this.f32723l0 = true;
        super.onAttachedToWindow();
        int i12 = 26;
        if (this.f32709b.f32346g) {
            i7 = 26;
        } else {
            i7 = 0;
        }
        this.f32725r = r5.update(i7, this, this.f32725r, this.f32726s);
        if (this.f32709b.f32346g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.O = r5.update(i10, this, this.O, this.P);
        if (this.f32709b.f32346g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.Q = r5.update(i11, this, this.Q, this.R);
        if (!this.f32709b.f32346g) {
            i12 = 0;
        }
        this.S = r5.update(i12, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f32723l0 = false;
        super.onDetachedFromWindow();
        this.f32728x = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f32707a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f32707a.removeAllUpdateListeners();
            this.f32707a.cancel();
            this.f32707a = null;
        }
        invalidate();
        r5.release(this, this.f32725r);
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
        bz bzVar = this.f32709b;
        if (bzVar != null && (i10 = this.m0.L) != -1 && bzVar.f32341a == i10) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setSelected(z9);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.hd.M0(2131754816, null)));
        if (this.f32709b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f32709b.f32342b);
            bz bzVar2 = this.f32709b;
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
        setMeasuredDimension(org.telegram.messenger.g0.L(24.0f) + this.f32709b.a(false) + this.m0.N, View.MeasureSpec.getSize(i10));
    }
}
