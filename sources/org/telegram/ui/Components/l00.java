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
public final class l00 extends View {
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
    public ValueAnimator f28312a;
    public float f28313a0;
    public j00 f28314b;
    public int f28315b0;
    public int f28316c;
    public int f28317c0;
    public int d;
    public int f28318d0;
    public int f28319e;
    public float f28320e0;
    public final RectF f28321f;
    public float f28322f0;
    public float f28323g0;
    public CharSequence h;
    public float f28324h0;
    public float f28325i0;
    public float f28326j0;
    public float f28327k0;
    public boolean f28328l0;
    public final n00 m0;
    public boolean f28329n;
    public v5 f28330r;
    public StaticLayout f28331s;
    public int v;
    public boolean f28332w;
    public float f28333x;
    public float f28334y;

    public l00(n00 n00Var, Context context) {
        super(context);
        this.m0 = n00Var;
        this.f28321f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f28332w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f28312a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f28334y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new e00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new k00(this, i10, f7, 0));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f28314b.f27637a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f28328l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f28314b.f27642g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f28330r = z5.update(i10, this, this.f28330r, this.f28331s);
        if (this.f28314b.f27642g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = z5.update(i11, this, this.O, this.P);
        if (this.f28314b.f27642g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = z5.update(i12, this, this.Q, this.R);
        if (!this.f28314b.f27642g) {
            i13 = 0;
        }
        this.S = z5.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f28328l0 = false;
        super.onDetachedFromWindow();
        this.f28332w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f28312a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f28312a.removeAllUpdateListeners();
            this.f28312a.cancel();
            this.f28312a = null;
        }
        invalidate();
        z5.release(this, this.f28330r);
        z5.release(this, this.O);
        z5.release(this, this.Q);
        z5.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j00 j00Var = this.f28314b;
        if (j00Var != null && (i11 = this.m0.L) != -1 && j00Var.f27637a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f28314b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f28314b.f27638b);
            j00 j00Var2 = this.f28314b;
            if (j00Var2 != null) {
                i10 = j00Var2.d;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f28314b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
