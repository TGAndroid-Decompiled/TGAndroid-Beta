package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class ia0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final g6 f35536a;
    public final org.telegram.ui.ActionBar.e6 f35537b;
    public final ea0 f35538c;
    public boolean d;
    public boolean f35539e;
    public final String f35540f;
    public final String h;
    public final int f35541n;

    public ia0(Context context, int i7, String str, int i10, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = true;
        this.f35540f = str;
        this.h = str2;
        this.f35537b = e6Var;
        int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), 2, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(this, h02, null, M, e6Var);
        g6 g6Var = new g6(true, true, true);
        this.f35536a = g6Var;
        g6Var.n(0.35f, 300L, er.h);
        g6Var.w(org.telegram.messenger.g0.L(16.0f));
        g6Var.u(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var));
        g6Var.setCallback(this);
        g6Var.q(!org.telegram.messenger.hd.f24101a0);
        if (org.telegram.messenger.hd.f24101a0) {
            g6Var.f34829b = 5;
        }
        TextPaint textPaint = g6Var.f34827a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + org.telegram.messenger.g0.L(77.0f));
        this.f35541n = max;
        g6Var.N = max;
        ea0 ea0Var = new ea0(0);
        ch0 ch0Var = new ch0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        ea0Var.f34268c = ch0Var;
        ch0Var.R(this);
        ch0Var.J(true);
        ch0Var.h = true;
        ch0Var.K(0);
        ch0 ch0Var2 = new ch0(i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        ea0Var.d = ch0Var2;
        ch0Var2.R(this);
        ch0Var2.J(true);
        ch0Var2.h = true;
        ch0Var2.K(0);
        ea0Var.f34269e = ch0Var;
        this.f35538c = ea0Var;
        org.telegram.ui.ActionBar.q6.x(this, ea0Var, org.telegram.ui.ActionBar.j6.F8, e6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        ch0 ch0Var;
        if (!this.d && z10 == this.f35539e) {
            return;
        }
        this.f35539e = z10;
        if (z10) {
            str = this.f35540f;
        } else {
            str = this.h;
        }
        if (z11 && !org.telegram.messenger.hd.f24101a0) {
            z12 = true;
        } else {
            z12 = false;
        }
        g6 g6Var = this.f35536a;
        g6Var.t(str, z12, true);
        ea0 ea0Var = this.f35538c;
        ch0 ch0Var2 = (ch0) ea0Var.d;
        ch0 ch0Var3 = (ch0) ea0Var.f34268c;
        ea0Var.f34267b = z10;
        if (z11) {
            if (z10) {
                ch0Var = ch0Var3;
            } else {
                ch0Var = ch0Var2;
            }
            ea0Var.f34269e = ch0Var;
            ch0Var3.M(0);
            ch0Var2.M(0);
            ((ch0) ea0Var.f34269e).start();
        } else {
            if (z10) {
                ch0Var2 = ch0Var3;
            }
            ea0Var.f34269e = ch0Var2;
            ch0Var2.M(ch0Var2.f33577e[0] - 1);
        }
        this.d = false;
        setContentDescription(g6Var.f34836i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.E8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = org.telegram.messenger.hd.f24101a0;
        g6 g6Var = this.f35536a;
        ea0 ea0Var = this.f35538c;
        if (z10) {
            ea0Var.setBounds(getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f), org.telegram.messenger.i20.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - org.telegram.messenger.g0.L(17.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            g6Var.setBounds(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(59.0f), getMeasuredHeight());
        } else {
            ea0Var.setBounds(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.i20.y(24.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(41.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            g6Var.setBounds(org.telegram.messenger.g0.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        g6Var.draw(canvas);
        ea0Var.draw(canvas);
    }

    public boolean getState() {
        return this.f35539e;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min;
        int mode = View.MeasureSpec.getMode(i7);
        int i11 = this.f35541n;
        if (mode == 1073741824) {
            min = Math.max(View.MeasureSpec.getSize(i7), i11);
        } else {
            min = Math.min(View.MeasureSpec.getSize(i7), i11);
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
            g6 g6Var = this.f35536a;
            if (g6Var != null) {
                g6Var.u(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, this.f35537b));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f35536a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
