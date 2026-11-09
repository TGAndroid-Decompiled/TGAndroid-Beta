package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class ia0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final i6 f34656a;
    public final org.telegram.ui.ActionBar.g6 f34657b;
    public final ea0 f34658c;
    public boolean d;
    public boolean f34659e;
    public final String f34660f;
    public final String h;
    public final int f34661n;

    public ia0(Context context, int i7, String str, int i10, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = true;
        this.f34660f = str;
        this.h = str2;
        this.f34657b = g6Var;
        int i11 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i11, g6Var), 2, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
        setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(this, h02, null, M, g6Var);
        i6 i6Var = new i6(true, true, true);
        this.f34656a = i6Var;
        i6Var.n(0.35f, 300L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(16.0f));
        i6Var.u(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var));
        i6Var.setCallback(this);
        i6Var.q(!org.telegram.messenger.id.f23157a0);
        if (org.telegram.messenger.id.f23157a0) {
            i6Var.f34587b = 5;
        }
        TextPaint textPaint = i6Var.f34585a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + org.telegram.messenger.g0.L(77.0f));
        this.f34661n = max;
        i6Var.M = max;
        ea0 ea0Var = new ea0(0);
        ah0 ah0Var = new ah0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        ea0Var.f33354c = ah0Var;
        ah0Var.R(this);
        ah0Var.J(true);
        ah0Var.h = true;
        ah0Var.K(0);
        ah0 ah0Var2 = new ah0(i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        ea0Var.d = ah0Var2;
        ah0Var2.R(this);
        ah0Var2.J(true);
        ah0Var2.h = true;
        ah0Var2.K(0);
        ea0Var.f33355e = ah0Var;
        this.f34658c = ea0Var;
        org.telegram.ui.ActionBar.s6.x(this, ea0Var, org.telegram.ui.ActionBar.l6.F8, g6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z9, boolean z10) {
        String str;
        boolean z11;
        ah0 ah0Var;
        if (!this.d && z9 == this.f34659e) {
            return;
        }
        this.f34659e = z9;
        if (z9) {
            str = this.f34660f;
        } else {
            str = this.h;
        }
        if (z10 && !org.telegram.messenger.id.f23157a0) {
            z11 = true;
        } else {
            z11 = false;
        }
        i6 i6Var = this.f34656a;
        i6Var.t(str, z11, true);
        ea0 ea0Var = this.f34658c;
        ah0 ah0Var2 = (ah0) ea0Var.d;
        ah0 ah0Var3 = (ah0) ea0Var.f33354c;
        ea0Var.f33353b = z9;
        if (z10) {
            if (z9) {
                ah0Var = ah0Var3;
            } else {
                ah0Var = ah0Var2;
            }
            ea0Var.f33355e = ah0Var;
            ah0Var3.M(0);
            ah0Var2.M(0);
            ((ah0) ea0Var.f33355e).start();
        } else {
            if (z9) {
                ah0Var2 = ah0Var3;
            }
            ea0Var.f33355e = ah0Var2;
            ah0Var2.M(ah0Var2.f31826e[0] - 1);
        }
        this.d = false;
        setContentDescription(i6Var.f34593i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.E8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9 = org.telegram.messenger.id.f23157a0;
        i6 i6Var = this.f34656a;
        ea0 ea0Var = this.f34658c;
        if (z9) {
            ea0Var.setBounds(getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f), org.telegram.messenger.camera.q.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - org.telegram.messenger.g0.L(17.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            i6Var.setBounds(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(59.0f), getMeasuredHeight());
        } else {
            ea0Var.setBounds(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.camera.q.y(24.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(41.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            i6Var.setBounds(org.telegram.messenger.g0.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        i6Var.draw(canvas);
        ea0Var.draw(canvas);
    }

    public boolean getState() {
        return this.f34659e;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min;
        int mode = View.MeasureSpec.getMode(i7);
        int i11 = this.f34661n;
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
            i6 i6Var = this.f34656a;
            if (i6Var != null) {
                i6Var.u(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, this.f34657b));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f34656a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
