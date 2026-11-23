package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
public final class o71 extends View {
    public org.telegram.ui.Components.xy0 f50511a;
    public org.telegram.ui.Components.xy0 f50512b;
    public boolean f50513c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Cells.y f50514e;
    public final ColorMatrixColorFilter f50515f;
    public final Paint h;
    public final Paint f50516n;
    public final x71 f50517r;

    public o71(Context context, x71 x71Var) {
        super(context);
        this.f50517r = x71Var;
        this.d = new org.telegram.ui.Components.d6(this, 0L, 350L, org.telegram.ui.Components.nr.h);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(285212671, 8, 8);
        this.f50514e = a02;
        this.h = new Paint(1);
        this.f50516n = new Paint(1);
        a02.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.35f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
        this.f50515f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.xy0 xy0Var = this.f50511a;
        if (xy0Var != null) {
            return xy0Var.j();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f50512b = new org.telegram.ui.Components.xy0(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f50513c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f50511a = new org.telegram.ui.Components.xy0(charSequence, 14.0f, org.telegram.messenger.g0.o());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        x71 x71Var = this.f50517r;
        n71 n71Var = x71Var.f53784z0;
        w61 w61Var = x71Var.f53715a;
        org.telegram.ui.ActionBar.m6.t(this, n71Var, w61Var);
        Paint g10 = w61Var.g("paintChatActionBackground");
        ColorFilter colorFilter = g10.getColorFilter();
        g10.setColorFilter(this.f50515f);
        canvas.drawRoundRect(rectF, height, height, g10);
        g10.setColorFilter(colorFilter);
        if (x71Var.O1) {
            float f10 = x71Var.f53760p1;
            if (f10 > 0.0f) {
                int o4 = i0.a.o(-16777216, (int) (f10 * 255.0f * x71Var.f53762q1));
                Paint paint = this.f50516n;
                paint.setColor(o4);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float d = this.d.d(this.f50513c);
        org.telegram.ui.Components.xy0 xy0Var = this.f50511a;
        if (xy0Var != null) {
            xy0Var.f42258p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            xy0Var.c((getWidth() - this.f50511a.k()) / 2.0f, ((org.telegram.messenger.g0.L(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (org.telegram.messenger.g0.L(7.0f) * d), 1.0f, -1, canvas);
        }
        if (this.f50512b != null) {
            canvas.save();
            canvas.scale(d, d, getWidth() / 2.0f, (getHeight() / 2.0f) + org.telegram.messenger.g0.L(11.0f));
            org.telegram.ui.Components.xy0 xy0Var2 = this.f50512b;
            xy0Var2.f42258p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            float L = 0.0f * org.telegram.messenger.g0.L(24.0f);
            xy0Var2.c((getWidth() - this.f50512b.k()) / 2.0f, org.telegram.messenger.g0.L(11.0f) + L + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.m6.r1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.y yVar = this.f50514e;
        yVar.setBounds(0, 0, width, height2);
        yVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.f50514e;
        if (action == 0) {
            yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            yVar.setState(new int[]{16842910, 16842919});
            z10 = true;
        } else {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                yVar.setState(StateSet.NOTHING);
            }
            z10 = false;
        }
        if (super.onTouchEvent(motionEvent) || z10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f50514e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
