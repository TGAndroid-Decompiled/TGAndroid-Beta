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
public final class o00 extends View {
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
    public ValueAnimator f29090a;
    public float f29091a0;
    public n00 f29092b;
    public int f29093b0;
    public int f29094c;
    public int f29095c0;
    public int d;
    public int f29096d0;
    public int e;
    public float f29097e0;
    public final RectF f29098f;
    public float f29099f0;
    public float f29100g0;
    public CharSequence h;
    public float f29101h0;
    public float f29102i0;
    public float f29103j0;
    public float f29104k0;
    public boolean f29105l0;
    public final q00 m0;
    public boolean f29106n;
    public u5 f29107r;
    public StaticLayout f29108s;
    public int v;
    public boolean f29109w;
    public float f29110x;
    public float f29111y;

    public o00(q00 q00Var, Context context) {
        super(context);
        this.m0 = q00Var;
        this.f29098f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f29109w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f29090a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f29111y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new i00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new ai.ie(this, i10, f7, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f29092b.f28740a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f29105l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f29092b.f28744g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f29107r = y5.update(i10, this, this.f29107r, this.f29108s);
        if (this.f29092b.f28744g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = y5.update(i11, this, this.O, this.P);
        if (this.f29092b.f28744g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = y5.update(i12, this, this.Q, this.R);
        if (!this.f29092b.f28744g) {
            i13 = 0;
        }
        this.S = y5.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f29105l0 = false;
        super.onDetachedFromWindow();
        this.f29109w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f29090a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f29090a.removeAllUpdateListeners();
            this.f29090a.cancel();
            this.f29090a = null;
        }
        invalidate();
        y5.release(this, this.f29107r);
        y5.release(this, this.O);
        y5.release(this, this.Q);
        y5.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        n00 n00Var = this.f29092b;
        if (n00Var != null && (i11 = this.m0.L) != -1 && n00Var.f28740a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f29092b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29092b.f28741b);
            n00 n00Var2 = this.f29092b;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f29092b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
