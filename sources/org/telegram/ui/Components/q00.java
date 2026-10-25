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
public final class q00 extends View {
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
    public y5 O;
    public StaticLayout P;
    public y5 Q;
    public StaticLayout R;
    public y5 S;
    public StaticLayout T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ValueAnimator f31752a;
    public float f31753a0;
    public p00 f31754b;
    public int f31755b0;
    public int f31756c;
    public int f31757c0;
    public int d;
    public int f31758d0;
    public int e;
    public float f31759e0;
    public final RectF f31760f;
    public float f31761f0;
    public float f31762g0;
    public CharSequence h;
    public float f31763h0;
    public float f31764i0;
    public float f31765j0;
    public float f31766k0;
    public boolean f31767l0;
    public final s00 m0;
    public boolean f31768n;
    public y5 f31769r;
    public StaticLayout f31770s;
    public int v;
    public boolean f31771w;
    public float f31772x;
    public float f31773y;

    public q00(s00 s00Var, Context context) {
        super(context);
        this.m0 = s00Var;
        this.f31760f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f31771w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f31752a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f31773y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new k00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new bi.xd(this, i10, f7, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f31754b.f31399a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f31767l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f31754b.f31403g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f31769r = c6.update(i10, this, this.f31769r, this.f31770s);
        if (this.f31754b.f31403g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = c6.update(i11, this, this.O, this.P);
        if (this.f31754b.f31403g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = c6.update(i12, this, this.Q, this.R);
        if (!this.f31754b.f31403g) {
            i13 = 0;
        }
        this.S = c6.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f31767l0 = false;
        super.onDetachedFromWindow();
        this.f31771w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f31752a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f31752a.removeAllUpdateListeners();
            this.f31752a.cancel();
            this.f31752a = null;
        }
        invalidate();
        c6.release(this, this.f31769r);
        c6.release(this, this.O);
        c6.release(this, this.Q);
        c6.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p00 p00Var = this.f31754b;
        if (p00Var != null && (i11 = this.m0.L) != -1 && p00Var.f31399a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f31754b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f31754b.f31400b);
            p00 p00Var2 = this.f31754b;
            if (p00Var2 != null) {
                i10 = p00Var2.d;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f31754b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
