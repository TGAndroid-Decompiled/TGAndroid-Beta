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
public final class i00 extends View {
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
    public t5 O;
    public StaticLayout P;
    public t5 Q;
    public StaticLayout R;
    public t5 S;
    public StaticLayout T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ValueAnimator f24830a;
    public float f24831a0;
    public g00 f24832b;
    public int f24833b0;
    public int f24834c;
    public int f24835c0;
    public int d;
    public int f24836d0;
    public int e;
    public float f24837e0;
    public final RectF f24838f;
    public float f24839f0;
    public float f24840g0;
    public CharSequence h;
    public float f24841h0;
    public float f24842i0;
    public float f24843j0;
    public float f24844k0;
    public boolean f24845l0;
    public final k00 m0;
    public boolean f24846n;
    public t5 f24847r;
    public StaticLayout f24848s;
    public int v;
    public boolean f24849w;
    public float f24850x;
    public float f24851y;

    public i00(k00 k00Var, Context context) {
        super(context);
        this.m0 = k00Var;
        this.f24838f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f24849w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f24830a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f24851y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new b00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new h00(this, i10, f7, 0));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f24832b.f24142a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f24845l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f24832b.f24146g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f24847r = x5.update(i10, this, this.f24847r, this.f24848s);
        if (this.f24832b.f24146g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = x5.update(i11, this, this.O, this.P);
        if (this.f24832b.f24146g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = x5.update(i12, this, this.Q, this.R);
        if (!this.f24832b.f24146g) {
            i13 = 0;
        }
        this.S = x5.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f24845l0 = false;
        super.onDetachedFromWindow();
        this.f24849w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f24830a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f24830a.removeAllUpdateListeners();
            this.f24830a.cancel();
            this.f24830a = null;
        }
        invalidate();
        x5.release(this, this.f24847r);
        x5.release(this, this.O);
        x5.release(this, this.Q);
        x5.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g00 g00Var = this.f24832b;
        if (g00Var != null && (i11 = this.m0.L) != -1 && g00Var.f24142a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f24832b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f24832b.f24143b);
            g00 g00Var2 = this.f24832b;
            if (g00Var2 != null) {
                i10 = g00Var2.d;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f24832b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
