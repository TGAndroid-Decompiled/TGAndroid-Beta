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
    public ValueAnimator f26898a;
    public float f26899a0;
    public g00 f26900b;
    public int f26901b0;
    public int f26902c;
    public int f26903c0;
    public int d;
    public int f26904d0;
    public int f26905e;
    public float f26906e0;
    public final RectF f26907f;
    public float f26908f0;
    public float f26909g0;
    public CharSequence h;
    public float f26910h0;
    public float f26911i0;
    public float f26912j0;
    public float f26913k0;
    public boolean f26914l0;
    public final k00 m0;
    public boolean f26915n;
    public v5 f26916r;
    public StaticLayout f26917s;
    public int v;
    public boolean f26918w;
    public float f26919x;
    public float f26920y;

    public i00(k00 k00Var, Context context) {
        super(context);
        this.m0 = k00Var;
        this.f26907f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f26918w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f26898a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f26920y = 0.0f;
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
        return this.f26900b.f26217a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f26914l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f26900b.f26222g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f26916r = z5.update(i10, this, this.f26916r, this.f26917s);
        if (this.f26900b.f26222g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = z5.update(i11, this, this.O, this.P);
        if (this.f26900b.f26222g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = z5.update(i12, this, this.Q, this.R);
        if (!this.f26900b.f26222g) {
            i13 = 0;
        }
        this.S = z5.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f26914l0 = false;
        super.onDetachedFromWindow();
        this.f26918w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f26898a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f26898a.removeAllUpdateListeners();
            this.f26898a.cancel();
            this.f26898a = null;
        }
        invalidate();
        z5.release(this, this.f26916r);
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
        g00 g00Var = this.f26900b;
        if (g00Var != null && (i11 = this.m0.L) != -1 && g00Var.f26217a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f26900b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f26900b.f26218b);
            g00 g00Var2 = this.f26900b;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f26900b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
