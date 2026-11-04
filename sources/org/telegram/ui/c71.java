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
public final class c71 extends View {
    public org.telegram.ui.Components.ly0 f44263a;
    public org.telegram.ui.Components.ly0 f44264b;
    public boolean f44265c;
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Cells.y f44266e;
    public final ColorMatrixColorFilter f44267f;
    public final Paint h;
    public final Paint f44268n;
    public final l71 f44269r;

    public c71(Context context, l71 l71Var) {
        super(context);
        this.f44269r = l71Var;
        this.d = new org.telegram.ui.Components.u5(this, 0L, 350L, org.telegram.ui.Components.xq.h);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(285212671, 8, 8);
        this.f44266e = a02;
        this.h = new Paint(1);
        this.f44268n = new Paint(1);
        a02.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.35f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
        this.f44267f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.ly0 ly0Var = this.f44263a;
        if (ly0Var != null) {
            return ly0Var.j();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f44264b = new org.telegram.ui.Components.ly0(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44265c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f44263a = new org.telegram.ui.Components.ly0(charSequence, 14.0f, org.telegram.messenger.g0.o());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        l71 l71Var = this.f44269r;
        b71 b71Var = l71Var.f47210z0;
        l61 l61Var = l71Var.f47141a;
        org.telegram.ui.ActionBar.k6.t(this, b71Var, l61Var);
        Paint d = l61Var.d("paintChatActionBackground");
        ColorFilter colorFilter = d.getColorFilter();
        d.setColorFilter(this.f44267f);
        canvas.drawRoundRect(rectF, height, height, d);
        d.setColorFilter(colorFilter);
        if (l71Var.O1) {
            float f10 = l71Var.f47186p1;
            if (f10 > 0.0f) {
                int o10 = i0.a.o(-16777216, (int) (f10 * 255.0f * l71Var.f47188q1));
                Paint paint = this.f44268n;
                paint.setColor(o10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float d10 = this.d.d(this.f44265c);
        org.telegram.ui.Components.ly0 ly0Var = this.f44263a;
        if (ly0Var != null) {
            ly0Var.f35929p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            ly0Var.c((getWidth() - this.f44263a.k()) / 2.0f, ((org.telegram.messenger.g0.L(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (org.telegram.messenger.g0.L(7.0f) * d10), 1.0f, -1, canvas);
        }
        if (this.f44264b != null) {
            canvas.save();
            canvas.scale(d10, d10, getWidth() / 2.0f, (getHeight() / 2.0f) + org.telegram.messenger.g0.L(11.0f));
            org.telegram.ui.Components.ly0 ly0Var2 = this.f44264b;
            ly0Var2.f35929p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            float L = 0.0f * org.telegram.messenger.g0.L(24.0f);
            ly0Var2.c((getWidth() - this.f44264b.k()) / 2.0f, org.telegram.messenger.g0.L(11.0f) + L + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.k6.r1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.y yVar = this.f44266e;
        yVar.setBounds(0, 0, width, height2);
        yVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.f44266e;
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
        if (drawable != this.f44266e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
