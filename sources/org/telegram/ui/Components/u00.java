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
public final class u00 extends View {
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
    public ValueAnimator f29211a;
    public float f29212a0;
    public s00 f29213b;
    public int f29214b0;
    public int f29215c;
    public int f29216c0;
    public int d;
    public int f29217d0;
    public int e;
    public float f29218e0;
    public final RectF f29219f;
    public float f29220f0;
    public float f29221g0;
    public CharSequence h;
    public float f29222h0;
    public float f29223i0;
    public float f29224j0;
    public float f29225k0;
    public boolean f29226l0;
    public final w00 m0;
    public boolean f29227n;
    public x5 f29228r;
    public StaticLayout f29229s;
    public int v;
    public boolean f29230w;
    public float f29231x;
    public float f29232y;

    public u00(w00 w00Var, Context context) {
        super(context);
        this.m0 = w00Var;
        this.f29219f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f29230w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f29211a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f29232y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new n00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new t00(this, i10, f7, 0));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f29213b.f28686a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f29226l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f29213b.f28690g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f29228r = b6.update(i10, this, this.f29228r, this.f29229s);
        if (this.f29213b.f28690g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = b6.update(i11, this, this.O, this.P);
        if (this.f29213b.f28690g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = b6.update(i12, this, this.Q, this.R);
        if (!this.f29213b.f28690g) {
            i13 = 0;
        }
        this.S = b6.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f29226l0 = false;
        super.onDetachedFromWindow();
        this.f29230w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f29211a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f29211a.removeAllUpdateListeners();
            this.f29211a.cancel();
            this.f29211a = null;
        }
        invalidate();
        b6.release(this, this.f29228r);
        b6.release(this, this.O);
        b6.release(this, this.Q);
        b6.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s00 s00Var = this.f29213b;
        if (s00Var != null && (i11 = this.m0.L) != -1 && s00Var.f28686a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f29213b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29213b.f28687b);
            s00 s00Var2 = this.f29213b;
            if (s00Var2 != null) {
                i10 = s00Var2.d;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f29213b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
