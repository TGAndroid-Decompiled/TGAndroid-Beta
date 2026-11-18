package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class nz extends View {
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
    public t5 P;
    public StaticLayout Q;
    public t5 R;
    public StaticLayout S;
    public t5 T;
    public StaticLayout U;
    public boolean V;
    public boolean W;
    public ValueAnimator f37886a;
    public boolean f37887a0;
    public mz f37888b;
    public float f37889b0;
    public int f37890c;
    public int f37891c0;
    public int d;
    public int f37892d0;
    public int f37893e;
    public int f37894e0;
    public final RectF f37895f;
    public float f37896f0;
    public float f37897g0;
    public CharSequence h;
    public float f37898h0;
    public float f37899i0;
    public float f37900j0;
    public float f37901k0;
    public float f37902l0;
    public boolean m0;
    public boolean f37903n;
    public final pz f37904n0;
    public t5 f37905r;
    public StaticLayout f37906s;
    public int f37907w;
    public boolean f37908x;
    public float f37909y;

    public nz(pz pzVar, Context context) {
        super(context);
        this.f37904n0 = pzVar;
        this.f37895f = new RectF();
        this.J = -1;
    }

    public final void a() {
        this.f37908x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.f37887a0 = false;
        this.f37886a = null;
        invalidate();
    }

    public final void b(float f10, int i7) {
        if (i7 == 6) {
            this.E = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, org.telegram.messenger.g0.L(f10));
        ofFloat.addUpdateListener(new hz(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new di.ic(this, i7, f10, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f37888b.f37668a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        int i10;
        int i11;
        this.m0 = true;
        super.onAttachedToWindow();
        int i12 = 26;
        if (this.f37888b.f37673g) {
            i7 = 26;
        } else {
            i7 = 0;
        }
        this.f37905r = x5.update(i7, this, this.f37905r, this.f37906s);
        if (this.f37888b.f37673g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.P = x5.update(i10, this, this.P, this.Q);
        if (this.f37888b.f37673g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.R = x5.update(i11, this, this.R, this.S);
        if (!this.f37888b.f37673g) {
            i12 = 0;
        }
        this.T = x5.update(i12, this, this.T, this.U);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.m0 = false;
        super.onDetachedFromWindow();
        this.f37908x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.f37887a0 = false;
        ValueAnimator valueAnimator = this.f37886a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f37886a.removeAllUpdateListeners();
            this.f37886a.cancel();
            this.f37886a = null;
        }
        invalidate();
        x5.release(this, this.f37905r);
        x5.release(this, this.P);
        x5.release(this, this.R);
        x5.release(this, this.T);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nz.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i7;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        mz mzVar = this.f37888b;
        if (mzVar != null && (i10 = this.f37904n0.M) != -1 && mzVar.f37668a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.gd.M0(2131754816, null)));
        if (this.f37888b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f37888b.f37669b);
            mz mzVar2 = this.f37888b;
            if (mzVar2 != null) {
                i7 = mzVar2.d;
            } else {
                i7 = 0;
            }
            if (i7 > 0) {
                sb2.append("\n");
                sb2.append(org.telegram.messenger.gd.G(i7, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(24.0f) + this.f37888b.a(false) + this.f37904n0.O, View.MeasureSpec.getSize(i10));
    }
}
