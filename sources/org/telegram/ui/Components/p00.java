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
public final class p00 extends View {
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
    public u5 O;
    public StaticLayout P;
    public u5 Q;
    public StaticLayout R;
    public u5 S;
    public StaticLayout T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ValueAnimator f25948a;
    public float f25949a0;
    public n00 f25950b;
    public int f25951b0;
    public int f25952c;
    public int f25953c0;
    public int d;
    public int f25954d0;
    public int e;
    public float f25955e0;
    public final RectF f25956f;
    public float f25957f0;
    public float f25958g0;
    public CharSequence h;
    public float f25959h0;
    public float f25960i0;
    public float f25961j0;
    public float f25962k0;
    public boolean f25963l0;
    public final r00 m0;
    public boolean f25964n;
    public u5 f25965r;
    public StaticLayout f25966s;
    public int v;
    public boolean f25967w;
    public float f25968x;
    public float f25969y;

    public p00(r00 r00Var, Context context) {
        super(context);
        this.m0 = r00Var;
        this.f25956f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f25967w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f25948a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f25969y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new i00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new o00(this, i10, f7, 0));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f25950b.f25349a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f25963l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f25950b.f25353g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f25965r = y5.update(i10, this, this.f25965r, this.f25966s);
        if (this.f25950b.f25353g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = y5.update(i11, this, this.O, this.P);
        if (this.f25950b.f25353g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = y5.update(i12, this, this.Q, this.R);
        if (!this.f25950b.f25353g) {
            i13 = 0;
        }
        this.S = y5.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f25963l0 = false;
        super.onDetachedFromWindow();
        this.f25967w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f25948a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f25948a.removeAllUpdateListeners();
            this.f25948a.cancel();
            this.f25948a = null;
        }
        invalidate();
        y5.release(this, this.f25965r);
        y5.release(this, this.O);
        y5.release(this, this.Q);
        y5.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        n00 n00Var = this.f25950b;
        if (n00Var != null && (i11 = this.m0.L) != -1 && n00Var.f25349a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f25950b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f25950b.f25350b);
            n00 n00Var2 = this.f25950b;
            if (n00Var2 != null) {
                i10 = n00Var2.d;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f25950b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
