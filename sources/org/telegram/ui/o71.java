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
    public org.telegram.ui.Components.my0 f48456a;
    public org.telegram.ui.Components.my0 f48457b;
    public boolean f48458c;
    public final org.telegram.ui.Components.v5 d;
    public final org.telegram.ui.Cells.y f48459e;
    public final ColorMatrixColorFilter f48460f;
    public final Paint h;
    public final Paint f48461n;
    public final x71 f48462r;

    public o71(Context context, x71 x71Var) {
        super(context);
        this.f48462r = x71Var;
        this.d = new org.telegram.ui.Components.v5(this, 0L, 350L, org.telegram.ui.Components.wq.h);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(285212671, 8, 8);
        this.f48459e = a02;
        this.h = new Paint(1);
        this.f48461n = new Paint(1);
        a02.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.35f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
        this.f48460f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.my0 my0Var = this.f48456a;
        if (my0Var != null) {
            return my0Var.j();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z9) {
        boolean z10;
        if (spannableStringBuilder != null) {
            this.f48457b = new org.telegram.ui.Components.my0(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48458c = z10;
        if (!z9) {
            this.d.f(z10, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f48456a = new org.telegram.ui.Components.my0(charSequence, 14.0f, org.telegram.messenger.g0.o());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        x71 x71Var = this.f48462r;
        n71 n71Var = x71Var.f51627y0;
        y61 y61Var = x71Var.f51561a;
        org.telegram.ui.ActionBar.m6.t(this, n71Var, y61Var);
        Paint d = y61Var.d("paintChatActionBackground");
        ColorFilter colorFilter = d.getColorFilter();
        d.setColorFilter(this.f48460f);
        canvas.drawRoundRect(rectF, height, height, d);
        d.setColorFilter(colorFilter);
        if (x71Var.N1) {
            float f10 = x71Var.f51603o1;
            if (f10 > 0.0f) {
                int o4 = i0.a.o(-16777216, (int) (f10 * 255.0f * x71Var.f51605p1));
                Paint paint = this.f48461n;
                paint.setColor(o4);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float d2 = this.d.d(this.f48458c);
        org.telegram.ui.Components.my0 my0Var = this.f48456a;
        if (my0Var != null) {
            my0Var.f36144p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            my0Var.c((getWidth() - this.f48456a.k()) / 2.0f, ((org.telegram.messenger.g0.L(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (org.telegram.messenger.g0.L(7.0f) * d2), 1.0f, -1, canvas);
        }
        if (this.f48457b != null) {
            canvas.save();
            canvas.scale(d2, d2, getWidth() / 2.0f, (getHeight() / 2.0f) + org.telegram.messenger.g0.L(11.0f));
            org.telegram.ui.Components.my0 my0Var2 = this.f48457b;
            my0Var2.f36144p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            float L = 0.0f * org.telegram.messenger.g0.L(24.0f);
            my0Var2.c((getWidth() - this.f48457b.k()) / 2.0f, org.telegram.messenger.g0.L(11.0f) + L + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.m6.r1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.y yVar = this.f48459e;
        yVar.setBounds(0, 0, width, height2);
        yVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.f48459e;
        if (action == 0) {
            yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            yVar.setState(new int[]{16842910, 16842919});
            z9 = true;
        } else {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                yVar.setState(StateSet.NOTHING);
            }
            z9 = false;
        }
        if (super.onTouchEvent(motionEvent) || z9) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f48459e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
