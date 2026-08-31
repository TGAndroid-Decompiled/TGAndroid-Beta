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
public final class j00 extends View {
    public float B;
    public float C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public StaticLayout H;
    public StaticLayout I;
    public StaticLayout J;
    public CharSequence K;
    public q5 L;
    public StaticLayout M;
    public q5 N;
    public StaticLayout O;
    public q5 P;
    public StaticLayout Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public float U;
    public int V;
    public int W;
    public ValueAnimator f27942a;
    public int f27943a0;
    public i00 f27944b;
    public float f27945b0;
    public int f27946c;
    public float f27947c0;
    public int d;
    public float f27948d0;
    public int f27949e;
    public float f27950e0;
    public final RectF f27951f;
    public float f27952f0;
    public float f27953g0;
    public CharSequence h;
    public float f27954h0;
    public boolean f27955i0;
    public final l00 f27956j0;
    public boolean f27957n;
    public q5 f27958r;
    public StaticLayout f27959s;
    public int v;
    public boolean f27960w;
    public float f27961x;
    public float f27962y;

    public j00(l00 l00Var, Context context) {
        super(context);
        this.f27956j0 = l00Var;
        this.f27951f = new RectF();
        this.F = -1;
    }

    public final void a() {
        this.f27960w = false;
        this.E = false;
        this.R = false;
        this.D = false;
        this.T = false;
        this.f27942a = null;
        invalidate();
    }

    public final void b(float f10, int i10) {
        if (i10 == 6) {
            this.f27962y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f10));
        ofFloat.addUpdateListener(new d00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new mh.ab(this, i10, f10, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f27944b.f27634a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f27955i0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f27944b.f27639g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f27958r = u5.update(i10, this, this.f27958r, this.f27959s);
        if (this.f27944b.f27639g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.L = u5.update(i11, this, this.L, this.M);
        if (this.f27944b.f27639g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.N = u5.update(i12, this, this.N, this.O);
        if (!this.f27944b.f27639g) {
            i13 = 0;
        }
        this.P = u5.update(i13, this, this.P, this.Q);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f27955i0 = false;
        super.onDetachedFromWindow();
        this.f27960w = false;
        this.E = false;
        this.R = false;
        this.D = false;
        this.T = false;
        ValueAnimator valueAnimator = this.f27942a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f27942a.removeAllUpdateListeners();
            this.f27942a.cancel();
            this.f27942a = null;
        }
        invalidate();
        u5.release(this, this.f27958r);
        u5.release(this, this.L);
        u5.release(this, this.N);
        u5.release(this, this.P);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z4;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        i00 i00Var = this.f27944b;
        if (i00Var != null && (i11 = this.f27956j0.I) != -1 && i00Var.f27634a == i11) {
            z4 = true;
        } else {
            z4 = false;
        }
        accessibilityNodeInfo.setSelected(z4);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f27944b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27944b.f27635b);
            i00 i00Var2 = this.f27944b;
            if (i00Var2 != null) {
                i10 = i00Var2.d;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                sb.append("\n");
                sb.append(LocaleController.formatPluralString("AccDescrUnreadCount", i10, new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f27944b.a(false) + this.f27956j0.K, View.MeasureSpec.getSize(i11));
    }
}
