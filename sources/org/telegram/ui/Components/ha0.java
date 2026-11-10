package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class ha0 extends View implements org.telegram.ui.ActionBar.c6 {
    public final h6 f34256a;
    public final org.telegram.ui.ActionBar.h6 f34257b;
    public final da0 f34258c;
    public boolean d;
    public boolean f34259e;
    public final String f34260f;
    public final String h;
    public final int f34261n;

    public ha0(Context context, int i7, String str, int i10, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = true;
        this.f34260f = str;
        this.h = str2;
        this.f34257b = h6Var;
        int i11 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 2, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(this, h02, null, M, h6Var);
        h6 h6Var2 = new h6(true, true, true);
        this.f34256a = h6Var2;
        h6Var2.n(0.35f, 300L, wq.h);
        h6Var2.w(org.telegram.messenger.g0.L(16.0f));
        h6Var2.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var));
        h6Var2.setCallback(this);
        h6Var2.q(!org.telegram.messenger.id.f23161a0);
        if (org.telegram.messenger.id.f23161a0) {
            h6Var2.f34187b = 5;
        }
        TextPaint textPaint = h6Var2.f34185a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + org.telegram.messenger.g0.L(77.0f));
        this.f34261n = max;
        h6Var2.M = max;
        da0 da0Var = new da0(0);
        zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        da0Var.f32939c = zg0Var;
        zg0Var.R(this);
        zg0Var.J(true);
        zg0Var.h = true;
        zg0Var.K(0);
        zg0 zg0Var2 = new zg0(i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        da0Var.d = zg0Var2;
        zg0Var2.R(this);
        zg0Var2.J(true);
        zg0Var2.h = true;
        zg0Var2.K(0);
        da0Var.f32940e = zg0Var;
        this.f34258c = da0Var;
        org.telegram.ui.ActionBar.t6.x(this, da0Var, org.telegram.ui.ActionBar.m6.F8, h6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z9, boolean z10) {
        String str;
        boolean z11;
        zg0 zg0Var;
        if (!this.d && z9 == this.f34259e) {
            return;
        }
        this.f34259e = z9;
        if (z9) {
            str = this.f34260f;
        } else {
            str = this.h;
        }
        if (z10 && !org.telegram.messenger.id.f23161a0) {
            z11 = true;
        } else {
            z11 = false;
        }
        h6 h6Var = this.f34256a;
        h6Var.t(str, z11, true);
        da0 da0Var = this.f34258c;
        zg0 zg0Var2 = (zg0) da0Var.d;
        zg0 zg0Var3 = (zg0) da0Var.f32939c;
        da0Var.f32938b = z9;
        if (z10) {
            if (z9) {
                zg0Var = zg0Var3;
            } else {
                zg0Var = zg0Var2;
            }
            da0Var.f32940e = zg0Var;
            zg0Var3.M(0);
            zg0Var2.M(0);
            ((zg0) da0Var.f32940e).start();
        } else {
            if (z9) {
                zg0Var2 = zg0Var3;
            }
            da0Var.f32940e = zg0Var2;
            zg0Var2.M(zg0Var2.f40968e[0] - 1);
        }
        this.d = false;
        setContentDescription(h6Var.f34193i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9 = org.telegram.messenger.id.f23161a0;
        h6 h6Var = this.f34256a;
        da0 da0Var = this.f34258c;
        if (z9) {
            da0Var.setBounds(getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f), org.telegram.messenger.camera.q.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - org.telegram.messenger.g0.L(17.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            h6Var.setBounds(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(59.0f), getMeasuredHeight());
        } else {
            da0Var.setBounds(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.camera.q.y(24.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(41.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            h6Var.setBounds(org.telegram.messenger.g0.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        h6Var.draw(canvas);
        da0Var.draw(canvas);
    }

    public boolean getState() {
        return this.f34259e;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min;
        int mode = View.MeasureSpec.getMode(i7);
        int i11 = this.f34261n;
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
            h6 h6Var = this.f34256a;
            if (h6Var != null) {
                h6Var.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.f34257b));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f34256a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
