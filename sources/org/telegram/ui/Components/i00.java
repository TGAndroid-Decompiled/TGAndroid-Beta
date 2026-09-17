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
    public v5 O;
    public StaticLayout P;
    public v5 Q;
    public StaticLayout R;
    public v5 S;
    public StaticLayout T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ValueAnimator f26926a;
    public float f26927a0;
    public g00 f26928b;
    public int f26929b0;
    public int f26930c;
    public int f26931c0;
    public int d;
    public int f26932d0;
    public int f26933e;
    public float f26934e0;
    public final RectF f26935f;
    public float f26936f0;
    public float f26937g0;
    public CharSequence h;
    public float f26938h0;
    public float f26939i0;
    public float f26940j0;
    public float f26941k0;
    public boolean f26942l0;
    public final k00 m0;
    public boolean f26943n;
    public v5 f26944r;
    public StaticLayout f26945s;
    public int v;
    public boolean f26946w;
    public float f26947x;
    public float f26948y;

    public i00(k00 k00Var, Context context) {
        super(context);
        this.m0 = k00Var;
        this.f26935f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f26946w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f26926a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f26948y = 0.0f;
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
        return this.f26928b.f26245a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f26942l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f26928b.f26250g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f26944r = z5.update(i10, this, this.f26944r, this.f26945s);
        if (this.f26928b.f26250g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = z5.update(i11, this, this.O, this.P);
        if (this.f26928b.f26250g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = z5.update(i12, this, this.Q, this.R);
        if (!this.f26928b.f26250g) {
            i13 = 0;
        }
        this.S = z5.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f26942l0 = false;
        super.onDetachedFromWindow();
        this.f26946w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f26926a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f26926a.removeAllUpdateListeners();
            this.f26926a.cancel();
            this.f26926a = null;
        }
        invalidate();
        z5.release(this, this.f26944r);
        z5.release(this, this.O);
        z5.release(this, this.Q);
        z5.release(this, this.S);
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
        g00 g00Var = this.f26928b;
        if (g00Var != null && (i11 = this.m0.L) != -1 && g00Var.f26245a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f26928b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f26928b.f26246b);
            g00 g00Var2 = this.f26928b;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f26928b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
