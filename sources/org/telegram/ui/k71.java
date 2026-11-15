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
public final class k71 extends View {
    public org.telegram.ui.Components.oy0 f48635a;
    public org.telegram.ui.Components.oy0 f48636b;
    public boolean f48637c;
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Cells.y f48638e;
    public final ColorMatrixColorFilter f48639f;
    public final Paint h;
    public final Paint f48640n;
    public final t71 f48641r;

    public k71(Context context, t71 t71Var) {
        super(context);
        this.f48641r = t71Var;
        this.d = new org.telegram.ui.Components.u5(this, 0L, 350L, org.telegram.ui.Components.er.h);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(285212671, 8, 8);
        this.f48638e = a02;
        this.h = new Paint(1);
        this.f48640n = new Paint(1);
        a02.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.35f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
        this.f48639f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.oy0 oy0Var = this.f48635a;
        if (oy0Var != null) {
            return oy0Var.j();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f48636b = new org.telegram.ui.Components.oy0(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f48637c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f48635a = new org.telegram.ui.Components.oy0(charSequence, 14.0f, org.telegram.messenger.g0.o());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        t71 t71Var = this.f48641r;
        j71 j71Var = t71Var.f51477z0;
        s61 s61Var = t71Var.f51408a;
        org.telegram.ui.ActionBar.j6.t(this, j71Var, s61Var);
        Paint d = s61Var.d("paintChatActionBackground");
        ColorFilter colorFilter = d.getColorFilter();
        d.setColorFilter(this.f48639f);
        canvas.drawRoundRect(rectF, height, height, d);
        d.setColorFilter(colorFilter);
        if (t71Var.O1) {
            float f10 = t71Var.f51453p1;
            if (f10 > 0.0f) {
                int o4 = i0.a.o(-16777216, (int) (f10 * 255.0f * t71Var.f51455q1));
                Paint paint = this.f48640n;
                paint.setColor(o4);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float d2 = this.d.d(this.f48637c);
        org.telegram.ui.Components.oy0 oy0Var = this.f48635a;
        if (oy0Var != null) {
            oy0Var.f38116p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            oy0Var.c((getWidth() - this.f48635a.k()) / 2.0f, ((org.telegram.messenger.g0.L(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (org.telegram.messenger.g0.L(7.0f) * d2), 1.0f, -1, canvas);
        }
        if (this.f48636b != null) {
            canvas.save();
            canvas.scale(d2, d2, getWidth() / 2.0f, (getHeight() / 2.0f) + org.telegram.messenger.g0.L(11.0f));
            org.telegram.ui.Components.oy0 oy0Var2 = this.f48636b;
            oy0Var2.f38116p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            float L = 0.0f * org.telegram.messenger.g0.L(24.0f);
            oy0Var2.c((getWidth() - this.f48636b.k()) / 2.0f, org.telegram.messenger.g0.L(11.0f) + L + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.j6.r1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.y yVar = this.f48638e;
        yVar.setBounds(0, 0, width, height2);
        yVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.f48638e;
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
        if (drawable != this.f48638e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
