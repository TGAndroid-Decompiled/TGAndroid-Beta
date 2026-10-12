package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u00 extends View {
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
    public x5 O;
    public StaticLayout P;
    public x5 Q;
    public StaticLayout R;
    public x5 S;
    public StaticLayout T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ValueAnimator f29535a;
    public float f29536a0;
    public s00 f29537b;
    public int f29538b0;
    public int f29539c;
    public int f29540c0;
    public int d;
    public int f29541d0;
    public int e;
    public float f29542e0;
    public final RectF f29543f;
    public float f29544f0;
    public float f29545g0;
    public CharSequence h;
    public float f29546h0;
    public float f29547i0;
    public float f29548j0;
    public float f29549k0;
    public boolean f29550l0;
    public final w00 m0;
    public boolean f29551n;
    public x5 f29552r;
    public StaticLayout f29553s;
    public int v;
    public boolean f29554w;
    public float f29555x;
    public float f29556y;

    public u00(w00 w00Var, Context context) {
        super(context);
        this.m0 = w00Var;
        this.f29543f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f29554w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f29535a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f29556y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new n00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new t00(this, i10, f7, 0));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f29537b.f28978a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f29550l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f29537b.f28982g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f29552r = b6.update(i10, this, this.f29552r, this.f29553s);
        if (this.f29537b.f28982g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = b6.update(i11, this, this.O, this.P);
        if (this.f29537b.f28982g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = b6.update(i12, this, this.Q, this.R);
        if (!this.f29537b.f28982g) {
            i13 = 0;
        }
        this.S = b6.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f29550l0 = false;
        super.onDetachedFromWindow();
        this.f29554w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f29535a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f29535a.removeAllUpdateListeners();
            this.f29535a.cancel();
            this.f29535a = null;
        }
        invalidate();
        b6.release(this, this.f29552r);
        b6.release(this, this.O);
        b6.release(this, this.Q);
        b6.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s00 s00Var = this.f29537b;
        if (s00Var != null && (i11 = this.m0.L) != -1 && s00Var.f28978a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f29537b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29537b.f28979b);
            s00 s00Var2 = this.f29537b;
            if (s00Var2 != null) {
                i10 = s00Var2.d;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                sb2.append("\n");
                sb2.append(LocaleController.formatPluralString("AccDescrUnreadCount", i10, new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f29537b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
