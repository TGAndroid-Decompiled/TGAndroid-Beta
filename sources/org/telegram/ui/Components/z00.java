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
public final class z00 extends View {
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
    public ValueAnimator f33359a;
    public float f33360a0;
    public x00 f33361b;
    public int f33362b0;
    public int f33363c;
    public int f33364c0;
    public int d;
    public int f33365d0;
    public int f33366e;
    public float f33367e0;
    public final RectF f33368f;
    public float f33369f0;
    public float f33370g0;
    public CharSequence h;
    public float f33371h0;
    public float f33372i0;
    public float f33373j0;
    public float f33374k0;
    public boolean f33375l0;
    public final b10 m0;
    public boolean f33376n;
    public x5 f33377r;
    public StaticLayout f33378s;
    public int v;
    public boolean f33379w;
    public float f33380x;
    public float f33381y;

    public z00(b10 b10Var, Context context) {
        super(context);
        this.m0 = b10Var;
        this.f33368f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f33379w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f33359a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f33381y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new s00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new y00(this, i10, f7, 0));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f33361b.f32784a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f33375l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f33361b.f32789g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f33377r = b6.update(i10, this, this.f33377r, this.f33378s);
        if (this.f33361b.f32789g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = b6.update(i11, this, this.O, this.P);
        if (this.f33361b.f32789g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = b6.update(i12, this, this.Q, this.R);
        if (!this.f33361b.f32789g) {
            i13 = 0;
        }
        this.S = b6.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f33375l0 = false;
        super.onDetachedFromWindow();
        this.f33379w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f33359a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f33359a.removeAllUpdateListeners();
            this.f33359a.cancel();
            this.f33359a = null;
        }
        invalidate();
        b6.release(this, this.f33377r);
        b6.release(this, this.O);
        b6.release(this, this.Q);
        b6.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        x00 x00Var = this.f33361b;
        if (x00Var != null && (i11 = this.m0.L) != -1 && x00Var.f32784a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f33361b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f33361b.f32785b);
            x00 x00Var2 = this.f33361b;
            if (x00Var2 != null) {
                i10 = x00Var2.d;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f33361b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
