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
    public ValueAnimator f25844a;
    public float f25845a0;
    public j00 f25846b;
    public int f25847b0;
    public int f25848c;
    public int f25849c0;
    public int d;
    public int f25850d0;
    public int e;
    public float f25851e0;
    public final RectF f25852f;
    public float f25853f0;
    public float f25854g0;
    public CharSequence h;
    public float f25855h0;
    public float f25856i0;
    public float f25857j0;
    public float f25858k0;
    public boolean f25859l0;
    public final n00 m0;
    public boolean f25860n;
    public v5 f25861r;
    public StaticLayout f25862s;
    public int v;
    public boolean f25863w;
    public float f25864x;
    public float f25865y;

    public l00(n00 n00Var, Context context) {
        super(context);
        this.m0 = n00Var;
        this.f25852f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f25863w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f25844a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f25865y = 0.0f;
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
        return this.f25846b.f25251a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f25859l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f25846b.f25255g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f25861r = z5.update(i10, this, this.f25861r, this.f25862s);
        if (this.f25846b.f25255g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = z5.update(i11, this, this.O, this.P);
        if (this.f25846b.f25255g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = z5.update(i12, this, this.Q, this.R);
        if (!this.f25846b.f25255g) {
            i13 = 0;
        }
        this.S = z5.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f25859l0 = false;
        super.onDetachedFromWindow();
        this.f25863w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f25844a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f25844a.removeAllUpdateListeners();
            this.f25844a.cancel();
            this.f25844a = null;
        }
        invalidate();
        z5.release(this, this.f25861r);
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
        j00 j00Var = this.f25846b;
        if (j00Var != null && (i11 = this.m0.L) != -1 && j00Var.f25251a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f25846b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f25846b.f25252b);
            j00 j00Var2 = this.f25846b;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f25846b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
