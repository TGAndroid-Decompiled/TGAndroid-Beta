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
public final class b10 extends View {
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
    public ValueAnimator f24525a;
    public float f24526a0;
    public z00 f24527b;
    public int f24528b0;
    public int f24529c;
    public int f24530c0;
    public int d;
    public int f24531d0;
    public int f24532e;
    public float f24533e0;
    public final RectF f24534f;
    public float f24535f0;
    public float f24536g0;
    public CharSequence h;
    public float f24537h0;
    public float f24538i0;
    public float f24539j0;
    public float f24540k0;
    public boolean f24541l0;
    public final d10 m0;
    public boolean f24542n;
    public x5 f24543r;
    public StaticLayout f24544s;
    public int v;
    public boolean f24545w;
    public float f24546x;
    public float f24547y;

    public b10(d10 d10Var, Context context) {
        super(context);
        this.m0 = d10Var;
        this.f24534f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f24545w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f24525a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f24547y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new u00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new a10(this, i10, f7, 0));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f24527b.f33234a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f24541l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f24527b.f33239g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f24543r = b6.update(i10, this, this.f24543r, this.f24544s);
        if (this.f24527b.f33239g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = b6.update(i11, this, this.O, this.P);
        if (this.f24527b.f33239g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = b6.update(i12, this, this.Q, this.R);
        if (!this.f24527b.f33239g) {
            i13 = 0;
        }
        this.S = b6.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f24541l0 = false;
        super.onDetachedFromWindow();
        this.f24545w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f24525a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f24525a.removeAllUpdateListeners();
            this.f24525a.cancel();
            this.f24525a = null;
        }
        invalidate();
        b6.release(this, this.f24543r);
        b6.release(this, this.O);
        b6.release(this, this.Q);
        b6.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b10.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z00 z00Var = this.f24527b;
        if (z00Var != null && (i11 = this.m0.L) != -1 && z00Var.f33234a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f24527b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f24527b.f33235b);
            z00 z00Var2 = this.f24527b;
            if (z00Var2 != null) {
                i10 = z00Var2.d;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f24527b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
