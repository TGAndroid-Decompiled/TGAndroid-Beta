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
public final class l71 extends View {
    public org.telegram.ui.Components.my0 f47460a;
    public org.telegram.ui.Components.my0 f47461b;
    public boolean f47462c;
    public final org.telegram.ui.Components.w5 d;
    public final org.telegram.ui.Cells.y f47463e;
    public final ColorMatrixColorFilter f47464f;
    public final Paint h;
    public final Paint f47465n;
    public final u71 f47466r;

    public l71(Context context, u71 u71Var) {
        super(context);
        this.f47466r = u71Var;
        this.d = new org.telegram.ui.Components.w5(this, 0L, 350L, org.telegram.ui.Components.xq.h);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(285212671, 8, 8);
        this.f47463e = a02;
        this.h = new Paint(1);
        this.f47465n = new Paint(1);
        a02.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.35f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
        this.f47464f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.my0 my0Var = this.f47460a;
        if (my0Var != null) {
            return my0Var.j();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z9) {
        boolean z10;
        if (spannableStringBuilder != null) {
            this.f47461b = new org.telegram.ui.Components.my0(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47462c = z10;
        if (!z9) {
            this.d.f(z10, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f47460a = new org.telegram.ui.Components.my0(charSequence, 14.0f, org.telegram.messenger.g0.o());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        u71 u71Var = this.f47466r;
        k71 k71Var = u71Var.f50331y0;
        v61 v61Var = u71Var.f50265a;
        org.telegram.ui.ActionBar.k6.t(this, k71Var, v61Var);
        Paint d = v61Var.d("paintChatActionBackground");
        ColorFilter colorFilter = d.getColorFilter();
        d.setColorFilter(this.f47464f);
        canvas.drawRoundRect(rectF, height, height, d);
        d.setColorFilter(colorFilter);
        if (u71Var.N1) {
            float f10 = u71Var.f50307o1;
            if (f10 > 0.0f) {
                int o4 = i0.a.o(-16777216, (int) (f10 * 255.0f * u71Var.f50309p1));
                Paint paint = this.f47465n;
                paint.setColor(o4);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float d2 = this.d.d(this.f47462c);
        org.telegram.ui.Components.my0 my0Var = this.f47460a;
        if (my0Var != null) {
            my0Var.f36136p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            my0Var.c((getWidth() - this.f47460a.k()) / 2.0f, ((org.telegram.messenger.g0.L(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (org.telegram.messenger.g0.L(7.0f) * d2), 1.0f, -1, canvas);
        }
        if (this.f47461b != null) {
            canvas.save();
            canvas.scale(d2, d2, getWidth() / 2.0f, (getHeight() / 2.0f) + org.telegram.messenger.g0.L(11.0f));
            org.telegram.ui.Components.my0 my0Var2 = this.f47461b;
            my0Var2.f36136p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            float L = 0.0f * org.telegram.messenger.g0.L(24.0f);
            my0Var2.c((getWidth() - this.f47461b.k()) / 2.0f, org.telegram.messenger.g0.L(11.0f) + L + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.k6.r1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.y yVar = this.f47463e;
        yVar.setBounds(0, 0, width, height2);
        yVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.f47463e;
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
        if (drawable != this.f47463e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
