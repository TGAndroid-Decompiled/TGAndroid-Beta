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
    public w5 O;
    public StaticLayout P;
    public w5 Q;
    public StaticLayout R;
    public w5 S;
    public StaticLayout T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ValueAnimator f29456a;
    public float f29457a0;
    public p00 f29458b;
    public int f29459b0;
    public int f29460c;
    public int f29461c0;
    public int d;
    public int f29462d0;
    public int e;
    public float f29463e0;
    public final RectF f29464f;
    public float f29465f0;
    public float f29466g0;
    public CharSequence h;
    public float f29467h0;
    public float f29468i0;
    public float f29469j0;
    public float f29470k0;
    public boolean f29471l0;
    public final s00 m0;
    public boolean f29472n;
    public w5 f29473r;
    public StaticLayout f29474s;
    public int v;
    public boolean f29475w;
    public float f29476x;
    public float f29477y;

    public q00(s00 s00Var, Context context) {
        super(context);
        this.m0 = s00Var;
        this.f29464f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f29475w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f29456a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f29477y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new k00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new ai.he(this, i10, f7, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f29458b.f29126a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f29471l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f29458b.f29130g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f29473r = a6.update(i10, this, this.f29473r, this.f29474s);
        if (this.f29458b.f29130g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = a6.update(i11, this, this.O, this.P);
        if (this.f29458b.f29130g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = a6.update(i12, this, this.Q, this.R);
        if (!this.f29458b.f29130g) {
            i13 = 0;
        }
        this.S = a6.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f29471l0 = false;
        super.onDetachedFromWindow();
        this.f29475w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f29456a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f29456a.removeAllUpdateListeners();
            this.f29456a.cancel();
            this.f29456a = null;
        }
        invalidate();
        a6.release(this, this.f29473r);
        a6.release(this, this.O);
        a6.release(this, this.Q);
        a6.release(this, this.S);
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
        p00 p00Var = this.f29458b;
        if (p00Var != null && (i11 = this.m0.L) != -1 && p00Var.f29126a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f29458b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29458b.f29127b);
            p00 p00Var2 = this.f29458b;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f29458b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
