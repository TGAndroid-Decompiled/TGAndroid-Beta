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
public final class h00 extends View {
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
    public ValueAnimator f25284a;
    public int f25285a0;
    public g00 f25286b;
    public float f25287b0;
    public int f25288c;
    public float f25289c0;
    public int d;
    public float f25290d0;
    public int e;
    public float f25291e0;
    public final RectF f25292f;
    public float f25293f0;
    public float f25294g0;
    public CharSequence h;
    public float f25295h0;
    public boolean f25296i0;
    public final j00 f25297j0;
    public boolean f25298n;
    public q5 f25299r;
    public StaticLayout f25300s;
    public int v;
    public boolean f25301w;
    public float f25302x;
    public float f25303y;

    public h00(j00 j00Var, Context context) {
        super(context);
        this.f25297j0 = j00Var;
        this.f25292f = new RectF();
        this.F = -1;
    }

    public final void a() {
        this.f25301w = false;
        this.E = false;
        this.R = false;
        this.D = false;
        this.T = false;
        this.f25284a = null;
        invalidate();
    }

    public final void b(float f10, int i10) {
        if (i10 == 6) {
            this.f25303y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f10));
        ofFloat.addUpdateListener(new b00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new lh.ab(this, i10, f10, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f25286b.f25005a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        int i11;
        int i12;
        this.f25296i0 = true;
        super.onAttachedToWindow();
        int i13 = 26;
        if (this.f25286b.f25009g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.f25299r = u5.update(i10, this, this.f25299r, this.f25300s);
        if (this.f25286b.f25009g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.L = u5.update(i11, this, this.L, this.M);
        if (this.f25286b.f25009g) {
            i12 = 26;
        } else {
            i12 = 0;
        }
        this.N = u5.update(i12, this, this.N, this.O);
        if (!this.f25286b.f25009g) {
            i13 = 0;
        }
        this.P = u5.update(i13, this, this.P, this.Q);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f25296i0 = false;
        super.onDetachedFromWindow();
        this.f25301w = false;
        this.E = false;
        this.R = false;
        this.D = false;
        this.T = false;
        ValueAnimator valueAnimator = this.f25284a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f25284a.removeAllUpdateListeners();
            this.f25284a.cancel();
            this.f25284a = null;
        }
        invalidate();
        u5.release(this, this.f25299r);
        u5.release(this, this.L);
        u5.release(this, this.N);
        u5.release(this, this.P);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z4;
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g00 g00Var = this.f25286b;
        if (g00Var != null && (i11 = this.f25297j0.I) != -1 && g00Var.f25005a == i11) {
            z4 = true;
        } else {
            z4 = false;
        }
        accessibilityNodeInfo.setSelected(z4);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f25286b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f25286b.f25006b);
            g00 g00Var2 = this.f25286b;
            if (g00Var2 != null) {
                i10 = g00Var2.d;
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
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f25286b.a(false) + this.f25297j0.K, View.MeasureSpec.getSize(i11));
    }
}
