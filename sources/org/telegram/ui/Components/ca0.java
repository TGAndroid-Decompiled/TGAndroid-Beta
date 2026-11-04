package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class ca0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final g6 f32640a;
    public final org.telegram.ui.ActionBar.e6 f32641b;
    public final y90 f32642c;
    public boolean d;
    public boolean f32643e;
    public final String f32644f;
    public final String h;
    public final int f32645n;

    public ca0(Context context, int i3, String str, int i10, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = true;
        this.f32644f = str;
        this.h = str2;
        this.f32641b = e6Var;
        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 2, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(this, h02, null, N, e6Var);
        g6 g6Var = new g6(true, true, true);
        this.f32640a = g6Var;
        g6Var.n(0.35f, 300L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(16.0f));
        g6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var));
        g6Var.setCallback(this);
        g6Var.q(!org.telegram.messenger.bd.f21784a0);
        if (org.telegram.messenger.bd.f21784a0) {
            g6Var.f33983b = 5;
        }
        TextPaint textPaint = g6Var.f33981a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + org.telegram.messenger.g0.L(77.0f));
        this.f32645n = max;
        g6Var.M = max;
        y90 y90Var = new y90(0);
        ch0 ch0Var = new ch0(i3, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        y90Var.f40669c = ch0Var;
        ch0Var.R(this);
        ch0Var.J(true);
        ch0Var.h = true;
        ch0Var.K(0);
        ch0 ch0Var2 = new ch0(i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        y90Var.d = ch0Var2;
        ch0Var2.R(this);
        ch0Var2.J(true);
        ch0Var2.h = true;
        ch0Var2.K(0);
        y90Var.f40670e = ch0Var;
        this.f32642c = y90Var;
        org.telegram.ui.ActionBar.r6.y(this, y90Var, org.telegram.ui.ActionBar.k6.F8, e6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        ch0 ch0Var;
        if (!this.d && z10 == this.f32643e) {
            return;
        }
        this.f32643e = z10;
        if (z10) {
            str = this.f32644f;
        } else {
            str = this.h;
        }
        if (z11 && !org.telegram.messenger.bd.f21784a0) {
            z12 = true;
        } else {
            z12 = false;
        }
        g6 g6Var = this.f32640a;
        g6Var.t(str, z12, true);
        y90 y90Var = this.f32642c;
        ch0 ch0Var2 = (ch0) y90Var.d;
        ch0 ch0Var3 = (ch0) y90Var.f40669c;
        y90Var.f40668b = z10;
        if (z11) {
            if (z10) {
                ch0Var = ch0Var3;
            } else {
                ch0Var = ch0Var2;
            }
            y90Var.f40670e = ch0Var;
            ch0Var3.M(0);
            ch0Var2.M(0);
            ((ch0) y90Var.f40670e).start();
        } else {
            if (z10) {
                ch0Var2 = ch0Var3;
            }
            y90Var.f40670e = ch0Var2;
            ch0Var2.M(ch0Var2.f32725e[0] - 1);
        }
        this.d = false;
        setContentDescription(g6Var.f33989i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        g6 g6Var = this.f32640a;
        y90 y90Var = this.f32642c;
        if (z10) {
            y90Var.setBounds(getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f), org.telegram.messenger.camera.q.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - org.telegram.messenger.g0.L(17.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            g6Var.setBounds(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(59.0f), getMeasuredHeight());
        } else {
            y90Var.setBounds(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.camera.q.y(24.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(41.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            g6Var.setBounds(org.telegram.messenger.g0.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        g6Var.draw(canvas);
        y90Var.draw(canvas);
    }

    public boolean getState() {
        return this.f32643e;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int min;
        int mode = View.MeasureSpec.getMode(i3);
        int i11 = this.f32645n;
        if (mode == 1073741824) {
            min = Math.max(View.MeasureSpec.getSize(i3), i11);
        } else {
            min = Math.min(View.MeasureSpec.getSize(i3), i11);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, mode), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() == 0 && getAlpha() >= 0.5f) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            g6 g6Var = this.f32640a;
            if (g6Var != null) {
                g6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.f32641b));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f32640a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
