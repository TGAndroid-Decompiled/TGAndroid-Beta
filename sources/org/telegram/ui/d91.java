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
public final class d91 extends View {
    public org.telegram.ui.Components.qz0 f36712a;
    public org.telegram.ui.Components.qz0 f36713b;
    public boolean f36714c;
    public final org.telegram.ui.Components.t5 d;
    public final org.telegram.ui.Cells.y e;
    public final ColorMatrixColorFilter f36715f;
    public final Paint h;
    public final Paint f36716n;
    public final m91 f36717r;

    public d91(Context context, m91 m91Var) {
        super(context);
        this.f36717r = m91Var;
        this.d = new org.telegram.ui.Components.t5(this, 0L, 350L, org.telegram.ui.Components.gr.h);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(285212671, 8, 8);
        this.e = a02;
        this.h = new Paint(1);
        this.f36716n = new Paint(1);
        a02.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.i0.i(colorMatrix, 0.35f);
        org.telegram.messenger.i0.n2(colorMatrix, 0.9f);
        this.f36715f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.qz0 qz0Var = this.f36712a;
        if (qz0Var != null) {
            return qz0Var.j();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f36713b = new org.telegram.ui.Components.qz0(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f36714c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f36712a = new org.telegram.ui.Components.qz0(charSequence, 14.0f, org.telegram.messenger.i0.o());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        m91 m91Var = this.f36717r;
        c91 c91Var = m91Var.f39603y0;
        n81 n81Var = m91Var.f39537a;
        org.telegram.ui.ActionBar.t6.t(this, c91Var, n81Var);
        Paint d = n81Var.d("paintChatActionBackground");
        ColorFilter colorFilter = d.getColorFilter();
        d.setColorFilter(this.f36715f);
        canvas.drawRoundRect(rectF, height, height, d);
        d.setColorFilter(colorFilter);
        if (m91Var.N1) {
            float f7 = m91Var.f39579o1;
            if (f7 > 0.0f) {
                int o10 = i0.b.o(-16777216, (int) (f7 * 255.0f * m91Var.f39581p1));
                Paint paint = this.f36716n;
                paint.setColor(o10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float d10 = this.d.d(this.f36714c);
        org.telegram.ui.Components.qz0 qz0Var = this.f36712a;
        if (qz0Var != null) {
            qz0Var.f29784p = getWidth() - org.telegram.messenger.i0.L(14.0f);
            qz0Var.c((getWidth() - this.f36712a.k()) / 2.0f, ((org.telegram.messenger.i0.L(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (org.telegram.messenger.i0.L(7.0f) * d10), 1.0f, -1, canvas);
        }
        if (this.f36713b != null) {
            canvas.save();
            canvas.scale(d10, d10, getWidth() / 2.0f, (getHeight() / 2.0f) + org.telegram.messenger.i0.L(11.0f));
            org.telegram.ui.Components.qz0 qz0Var2 = this.f36713b;
            qz0Var2.f29784p = getWidth() - org.telegram.messenger.i0.L(14.0f);
            float L = 0.0f * org.telegram.messenger.i0.L(24.0f);
            qz0Var2.c((getWidth() - this.f36713b.k()) / 2.0f, org.telegram.messenger.i0.L(11.0f) + L + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.t6.r1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.y yVar = this.e;
        yVar.setBounds(0, 0, width, height2);
        yVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.e;
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
        if (drawable != this.e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
