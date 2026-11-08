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
public final class m71 extends View {
    public org.telegram.ui.Components.my0 f47713a;
    public org.telegram.ui.Components.my0 f47714b;
    public boolean f47715c;
    public final org.telegram.ui.Components.w5 d;
    public final org.telegram.ui.Cells.y f47716e;
    public final ColorMatrixColorFilter f47717f;
    public final Paint h;
    public final Paint f47718n;
    public final v71 f47719r;

    public m71(Context context, v71 v71Var) {
        super(context);
        this.f47719r = v71Var;
        this.d = new org.telegram.ui.Components.w5(this, 0L, 350L, org.telegram.ui.Components.xq.h);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(285212671, 8, 8);
        this.f47716e = a02;
        this.h = new Paint(1);
        this.f47718n = new Paint(1);
        a02.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.35f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
        this.f47717f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.my0 my0Var = this.f47713a;
        if (my0Var != null) {
            return my0Var.j();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z9) {
        boolean z10;
        if (spannableStringBuilder != null) {
            this.f47714b = new org.telegram.ui.Components.my0(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47715c = z10;
        if (!z9) {
            this.d.f(z10, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f47713a = new org.telegram.ui.Components.my0(charSequence, 14.0f, org.telegram.messenger.g0.o());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        v71 v71Var = this.f47719r;
        l71 l71Var = v71Var.f50586y0;
        w61 w61Var = v71Var.f50520a;
        org.telegram.ui.ActionBar.k6.t(this, l71Var, w61Var);
        Paint d = w61Var.d("paintChatActionBackground");
        ColorFilter colorFilter = d.getColorFilter();
        d.setColorFilter(this.f47717f);
        canvas.drawRoundRect(rectF, height, height, d);
        d.setColorFilter(colorFilter);
        if (v71Var.N1) {
            float f10 = v71Var.f50562o1;
            if (f10 > 0.0f) {
                int o4 = i0.a.o(-16777216, (int) (f10 * 255.0f * v71Var.f50564p1));
                Paint paint = this.f47718n;
                paint.setColor(o4);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float d2 = this.d.d(this.f47715c);
        org.telegram.ui.Components.my0 my0Var = this.f47713a;
        if (my0Var != null) {
            my0Var.f36158p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            my0Var.c((getWidth() - this.f47713a.k()) / 2.0f, ((org.telegram.messenger.g0.L(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (org.telegram.messenger.g0.L(7.0f) * d2), 1.0f, -1, canvas);
        }
        if (this.f47714b != null) {
            canvas.save();
            canvas.scale(d2, d2, getWidth() / 2.0f, (getHeight() / 2.0f) + org.telegram.messenger.g0.L(11.0f));
            org.telegram.ui.Components.my0 my0Var2 = this.f47714b;
            my0Var2.f36158p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            float L = 0.0f * org.telegram.messenger.g0.L(24.0f);
            my0Var2.c((getWidth() - this.f47714b.k()) / 2.0f, org.telegram.messenger.g0.L(11.0f) + L + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.k6.r1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.y yVar = this.f47716e;
        yVar.setBounds(0, 0, width, height2);
        yVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.f47716e;
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
        if (drawable != this.f47716e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
