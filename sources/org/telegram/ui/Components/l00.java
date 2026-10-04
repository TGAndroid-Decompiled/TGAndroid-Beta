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
public final class l00 extends View {
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
    public v5 O;
    public StaticLayout P;
    public v5 Q;
    public StaticLayout R;
    public v5 S;
    public StaticLayout T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ValueAnimator f28222a;
    public float f28223a0;
    public j00 f28224b;
    public int f28225b0;
    public int f28226c;
    public int f28227c0;
    public int d;
    public int f28228d0;
    public int f28229e;
    public float f28230e0;
    public final RectF f28231f;
    public float f28232f0;
    public float f28233g0;
    public CharSequence h;
    public float f28234h0;
    public float f28235i0;
    public float f28236j0;
    public float f28237k0;
    public boolean f28238l0;
    public final n00 m0;
    public boolean f28239n;
    public v5 f28240r;
    public StaticLayout f28241s;
    public int v;
    public boolean f28242w;
    public float f28243x;
    public float f28244y;

    public l00(n00 n00Var, Context context) {
        super(context);
        this.m0 = n00Var;
        this.f28231f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f28242w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f28222a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f28244y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new e00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new k00(this, i10, f7, 0));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f28224b.f27549a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f28238l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f28224b.f27554g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f28240r = z5.update(i10, this, this.f28240r, this.f28241s);
        if (this.f28224b.f27554g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = z5.update(i11, this, this.O, this.P);
        if (this.f28224b.f27554g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = z5.update(i12, this, this.Q, this.R);
        if (!this.f28224b.f27554g) {
            i13 = 0;
        }
        this.S = z5.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f28238l0 = false;
        super.onDetachedFromWindow();
        this.f28242w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f28222a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f28222a.removeAllUpdateListeners();
            this.f28222a.cancel();
            this.f28222a = null;
        }
        invalidate();
        z5.release(this, this.f28240r);
        z5.release(this, this.O);
        z5.release(this, this.Q);
        z5.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j00 j00Var = this.f28224b;
        if (j00Var != null && (i11 = this.m0.L) != -1 && j00Var.f27549a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f28224b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f28224b.f27550b);
            j00 j00Var2 = this.f28224b;
            if (j00Var2 != null) {
                i10 = j00Var2.d;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f28224b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
