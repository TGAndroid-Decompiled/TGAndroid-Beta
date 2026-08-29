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
public final class d00 extends View {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public StaticLayout G;
    public StaticLayout H;
    public StaticLayout I;
    public CharSequence J;
    public u5 K;
    public StaticLayout L;
    public u5 M;
    public StaticLayout N;
    public u5 O;
    public StaticLayout P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public ValueAnimator f27606a;
    public float f27607a0;
    public c00 f27608b;
    public float f27609b0;
    public int f27610c;
    public float f27611c0;
    public int d;
    public float f27612d0;
    public int f27613e;
    public float f27614e0;
    public final RectF f27615f;
    public float f27616f0;
    public float f27617g0;
    public CharSequence h;
    public boolean f27618h0;
    public final f00 f27619i0;
    public boolean f27620n;
    public u5 f27621r;
    public StaticLayout f27622s;
    public int v;
    public boolean f27623w;
    public float f27624x;
    public float f27625y;

    public d00(f00 f00Var, Context context) {
        super(context);
        this.f27619i0 = f00Var;
        this.f27615f = new RectF();
        this.E = -1;
    }

    public final void a() {
        this.f27623w = false;
        this.D = false;
        this.Q = false;
        this.C = false;
        this.S = false;
        this.f27606a = null;
        invalidate();
    }

    public final void b(float f9, int i10) {
        if (i10 == 6) {
            this.f27625y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f9));
        ofFloat.addUpdateListener(new wz(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new jh.za(this, i10, f9, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f27608b.f27251a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f27618h0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f27608b.f27256g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f27621r = y5.update(i10, this, this.f27621r, this.f27622s);
        if (this.f27608b.f27256g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.K = y5.update(i11, this, this.K, this.L);
        if (this.f27608b.f27256g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.M = y5.update(i12, this, this.M, this.N);
        if (!this.f27608b.f27256g) {
            i13 = 0;
        }
        this.O = y5.update(i13, this, this.O, this.P);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f27618h0 = false;
        super.onDetachedFromWindow();
        this.f27623w = false;
        this.D = false;
        this.Q = false;
        this.C = false;
        this.S = false;
        ValueAnimator valueAnimator = this.f27606a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f27606a.removeAllUpdateListeners();
            this.f27606a.cancel();
            this.f27606a = null;
        }
        invalidate();
        y5.release(this, this.f27621r);
        y5.release(this, this.K);
        y5.release(this, this.M);
        y5.release(this, this.O);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c00 c00Var = this.f27608b;
        if (c00Var != null && (i11 = this.f27619i0.H) != -1 && c00Var.f27251a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f27608b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f27608b.f27252b);
            c00 c00Var2 = this.f27608b;
            if (c00Var2 != null) {
                i10 = c00Var2.d;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f27608b.a(false) + this.f27619i0.J, View.MeasureSpec.getSize(i11));
    }
}
