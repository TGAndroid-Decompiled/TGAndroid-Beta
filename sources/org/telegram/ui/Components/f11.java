package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.View;
import android.widget.FrameLayout;
public final class f11 extends FrameLayout implements z60 {
    public final q9 f35027a;
    public final Paint f35028b;
    public boolean f35029c;
    public StaticLayout d;
    public StaticLayout f35030e;
    public StaticLayout f35031f;
    public String h;
    public boolean f35032n;
    public boolean f35033r;
    public boolean f35034s;
    public Drawable f35035w;
    public Drawable f35036x;
    public final g11 f35037y;

    public f11(g11 g11Var, Context context) {
        super(context);
        this.f35037y = g11Var;
        this.f35028b = new Paint(1);
        setWillNotDraw(false);
        q9 q9Var = new q9(context);
        this.f35027a = q9Var;
        addView(q9Var, c8.na.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void f(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, this.f35037y.f35334e);
        Paint paint = this.f35028b;
        paint.setColor(w02);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint);
        draw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout;
        float f10;
        float f11;
        float f12;
        int i7;
        Drawable drawable;
        Drawable drawable2;
        int i10 = (getTranslationY() > 0.0f ? 1 : (getTranslationY() == 0.0f ? 0 : -1));
        Paint paint = this.f35028b;
        g11 g11Var = this.f35037y;
        if (i10 != 0) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, g11Var.f35334e));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f35034s) {
            paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, g11Var.f35334e)));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint);
        }
        int L = org.telegram.messenger.g0.L(12.0f);
        int width = getWidth() - org.telegram.messenger.g0.L(12.0f);
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(26.0f) + L, ((org.telegram.messenger.g0.L(20.0f) - this.d.getHeight()) / 2.0f) + org.telegram.messenger.g0.L(10.0f));
            this.d.draw(canvas2);
            canvas2.restore();
        }
        float f13 = width;
        if (this.f35031f != null) {
            float width2 = f13 - staticLayout.getWidth();
            canvas2.save();
            canvas2.translate(width2, ((org.telegram.messenger.g0.L(20.0f) - this.f35031f.getHeight()) / 2.0f) + org.telegram.messenger.g0.L(10.0f));
            this.f35031f.draw(canvas2);
            canvas2.restore();
            f10 = width2 - org.telegram.messenger.g0.L(6.0f);
        } else {
            f10 = f13;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29739y6, g11Var.f35334e);
        if (this.f35033r && (drawable2 = this.f35036x) != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L2 = org.telegram.messenger.g0.L(13.0f);
            int i11 = (int) f10;
            f11 = 12.0f;
            f12 = 2.0f;
            this.f35036x.setBounds(i11 - L2, org.telegram.messenger.g0.L(14.0f), i11, org.telegram.messenger.g0.L(14.0f) + L2);
            this.f35036x.draw(canvas2);
            f10 -= org.telegram.messenger.g0.L(6.0f) + L2;
        } else {
            f11 = 12.0f;
            f12 = 2.0f;
        }
        if (this.f35032n && (drawable = this.f35035w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L3 = org.telegram.messenger.g0.L(f11);
            int i12 = (int) f10;
            this.f35035w.setBounds(i12 - L3, org.telegram.messenger.g0.L(14.0f), i12, org.telegram.messenger.g0.L(14.0f) + L3);
            this.f35035w.draw(canvas2);
        }
        if (this.f35030e != null) {
            canvas2.save();
            canvas2.translate(L, org.telegram.messenger.g0.L(34.0f));
            this.f35030e.draw(canvas2);
            canvas2.restore();
        }
        if (this.h != null) {
            float max = Math.max(org.telegram.messenger.g0.L(23.0f), g11Var.f35348q0.measureText(this.h) + org.telegram.messenger.g0.L(14.0f));
            if (this.f35032n) {
                i7 = org.telegram.ui.ActionBar.m6.V8;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.U8;
            }
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(i7, g11Var.f35334e));
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f13 - max, org.telegram.messenger.g0.L(34.0f), f13, org.telegram.messenger.g0.L(57.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
            g11Var.f35348q0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W8, g11Var.f35334e));
            canvas2.drawText(this.h, rectF2.centerX() - (g11Var.f35348q0.measureText(this.h) / f12), rectF2.centerY() - ((g11Var.f35348q0.ascent() + g11Var.f35348q0.descent()) / f12), g11Var.f35348q0);
        }
        if (this.f35029c && !this.f35034s) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29348d7, g11Var.f35334e));
            canvas2.drawRect(L, getHeight() - 1, f13, getHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        StaticLayout staticLayout = this.f35030e;
        if (staticLayout != null && staticLayout.getText().length() > 0) {
            i11 = this.f35030e.getHeight();
        } else {
            i11 = 0;
        }
        int L = org.telegram.messenger.g0.L(34.0f) + i11;
        if (i11 > org.telegram.messenger.g0.L(24.0f)) {
            f10 = 6.0f;
        } else {
            f10 = 10.0f;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(f10) + L), 1073741824));
    }

    @Override
    public final void setScrimHidden(boolean z10) {
        org.telegram.ui.Cells.c0.d(this, z10);
    }

    @Override
    public final void setTranslationY(float f10) {
        boolean z10;
        boolean z11 = false;
        if (getTranslationY() != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (f10 != 0.0f) {
            z11 = true;
        }
        if (z10 != z11) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
