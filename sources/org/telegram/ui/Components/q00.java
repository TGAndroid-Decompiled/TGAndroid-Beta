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
    public ValueAnimator f31743a;
    public float f31744a0;
    public p00 f31745b;
    public int f31746b0;
    public int f31747c;
    public int f31748c0;
    public int d;
    public int f31749d0;
    public int e;
    public float f31750e0;
    public final RectF f31751f;
    public float f31752f0;
    public float f31753g0;
    public CharSequence h;
    public float f31754h0;
    public float f31755i0;
    public float f31756j0;
    public float f31757k0;
    public boolean f31758l0;
    public final s00 m0;
    public boolean f31759n;
    public y5 f31760r;
    public StaticLayout f31761s;
    public int v;
    public boolean f31762w;
    public float f31763x;
    public float f31764y;

    public q00(s00 s00Var, Context context) {
        super(context);
        this.m0 = s00Var;
        this.f31751f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f31762w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f31743a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f31764y = 0.0f;
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
        return this.f31745b.f31417a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f31758l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f31745b.f31421g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f31760r = c6.update(i10, this, this.f31760r, this.f31761s);
        if (this.f31745b.f31421g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = c6.update(i11, this, this.O, this.P);
        if (this.f31745b.f31421g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = c6.update(i12, this, this.Q, this.R);
        if (!this.f31745b.f31421g) {
            i13 = 0;
        }
        this.S = c6.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f31758l0 = false;
        super.onDetachedFromWindow();
        this.f31762w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f31743a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f31743a.removeAllUpdateListeners();
            this.f31743a.cancel();
            this.f31743a = null;
        }
        invalidate();
        c6.release(this, this.f31760r);
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
        p00 p00Var = this.f31745b;
        if (p00Var != null && (i11 = this.m0.L) != -1 && p00Var.f31417a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f31745b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f31745b.f31418b);
            p00 p00Var2 = this.f31745b;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f31745b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
