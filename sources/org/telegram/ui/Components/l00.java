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
    public ValueAnimator f28217a;
    public float f28218a0;
    public j00 f28219b;
    public int f28220b0;
    public int f28221c;
    public int f28222c0;
    public int d;
    public int f28223d0;
    public int f28224e;
    public float f28225e0;
    public final RectF f28226f;
    public float f28227f0;
    public float f28228g0;
    public CharSequence h;
    public float f28229h0;
    public float f28230i0;
    public float f28231j0;
    public float f28232k0;
    public boolean f28233l0;
    public final n00 m0;
    public boolean f28234n;
    public v5 f28235r;
    public StaticLayout f28236s;
    public int v;
    public boolean f28237w;
    public float f28238x;
    public float f28239y;

    public l00(n00 n00Var, Context context) {
        super(context);
        this.m0 = n00Var;
        this.f28226f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f28237w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f28217a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f28239y = 0.0f;
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
        return this.f28219b.f27544a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f28233l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f28219b.f27549g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f28235r = z5.update(i10, this, this.f28235r, this.f28236s);
        if (this.f28219b.f27549g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = z5.update(i11, this, this.O, this.P);
        if (this.f28219b.f27549g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = z5.update(i12, this, this.Q, this.R);
        if (!this.f28219b.f27549g) {
            i13 = 0;
        }
        this.S = z5.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f28233l0 = false;
        super.onDetachedFromWindow();
        this.f28237w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f28217a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f28217a.removeAllUpdateListeners();
            this.f28217a.cancel();
            this.f28217a = null;
        }
        invalidate();
        z5.release(this, this.f28235r);
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
        j00 j00Var = this.f28219b;
        if (j00Var != null && (i11 = this.m0.L) != -1 && j00Var.f27544a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f28219b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f28219b.f27545b);
            j00 j00Var2 = this.f28219b;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f28219b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
