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
public final class y00 extends View {
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
    public ValueAnimator f33065a;
    public float f33066a0;
    public w00 f33067b;
    public int f33068b0;
    public int f33069c;
    public int f33070c0;
    public int d;
    public int f33071d0;
    public int f33072e;
    public float f33073e0;
    public final RectF f33074f;
    public float f33075f0;
    public float f33076g0;
    public CharSequence h;
    public float f33077h0;
    public float f33078i0;
    public float f33079j0;
    public float f33080k0;
    public boolean f33081l0;
    public final a10 m0;
    public boolean f33082n;
    public x5 f33083r;
    public StaticLayout f33084s;
    public int v;
    public boolean f33085w;
    public float f33086x;
    public float f33087y;

    public y00(a10 a10Var, Context context) {
        super(context);
        this.m0 = a10Var;
        this.f33074f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f33085w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f33065a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f33087y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new r00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new x00(this, i10, f7, 0));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f33067b.f32498a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f33081l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f33067b.f32503g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f33083r = b6.update(i10, this, this.f33083r, this.f33084s);
        if (this.f33067b.f32503g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = b6.update(i11, this, this.O, this.P);
        if (this.f33067b.f32503g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = b6.update(i12, this, this.Q, this.R);
        if (!this.f33067b.f32503g) {
            i13 = 0;
        }
        this.S = b6.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f33081l0 = false;
        super.onDetachedFromWindow();
        this.f33085w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f33065a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f33065a.removeAllUpdateListeners();
            this.f33065a.cancel();
            this.f33065a = null;
        }
        invalidate();
        b6.release(this, this.f33083r);
        b6.release(this, this.O);
        b6.release(this, this.Q);
        b6.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        w00 w00Var = this.f33067b;
        if (w00Var != null && (i11 = this.m0.L) != -1 && w00Var.f32498a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f33067b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f33067b.f32499b);
            w00 w00Var2 = this.f33067b;
            if (w00Var2 != null) {
                i10 = w00Var2.d;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f33067b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
