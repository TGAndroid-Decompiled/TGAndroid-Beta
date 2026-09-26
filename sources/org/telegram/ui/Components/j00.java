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
    public ValueAnimator f25207a;
    public float f25208a0;
    public h00 f25209b;
    public int f25210b0;
    public int f25211c;
    public int f25212c0;
    public int d;
    public int f25213d0;
    public int e;
    public float f25214e0;
    public final RectF f25215f;
    public float f25216f0;
    public float f25217g0;
    public CharSequence h;
    public float f25218h0;
    public float f25219i0;
    public float f25220j0;
    public float f25221k0;
    public boolean f25222l0;
    public final l00 m0;
    public boolean f25223n;
    public v5 f25224r;
    public StaticLayout f25225s;
    public int v;
    public boolean f25226w;
    public float f25227x;
    public float f25228y;

    public j00(l00 l00Var, Context context) {
        super(context);
        this.m0 = l00Var;
        this.f25215f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.f25226w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.f25207a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.f25228y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new c00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new i00(this, i10, f7, 0));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f25209b.f24583a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f25222l0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f25209b.f24587g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f25224r = z5.update(i10, this, this.f25224r, this.f25225s);
        if (this.f25209b.f24587g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.O = z5.update(i11, this, this.O, this.P);
        if (this.f25209b.f24587g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.Q = z5.update(i12, this, this.Q, this.R);
        if (!this.f25209b.f24587g) {
            i13 = 0;
        }
        this.S = z5.update(i13, this, this.S, this.T);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f25222l0 = false;
        super.onDetachedFromWindow();
        this.f25226w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.f25207a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f25207a.removeAllUpdateListeners();
            this.f25207a.cancel();
            this.f25207a = null;
        }
        invalidate();
        z5.release(this, this.f25224r);
        z5.release(this, this.O);
        z5.release(this, this.Q);
        z5.release(this, this.S);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h00 h00Var = this.f25209b;
        if (h00Var != null && (i11 = this.m0.L) != -1 && h00Var.f24583a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f25209b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f25209b.f24584b);
            h00 h00Var2 = this.f25209b;
            if (h00Var2 != null) {
                i10 = h00Var2.d;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f25209b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
