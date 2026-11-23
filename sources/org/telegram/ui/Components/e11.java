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
public final class e11 extends FrameLayout implements w60 {
    public final p9 f34528a;
    public final Paint f34529b;
    public boolean f34530c;
    public StaticLayout d;
    public StaticLayout f34531e;
    public StaticLayout f34532f;
    public String h;
    public boolean f34533n;
    public boolean f34534r;
    public boolean f34535s;
    public Drawable f34536w;
    public Drawable f34537x;
    public final f11 f34538y;

    public e11(f11 f11Var, Context context) {
        super(context);
        this.f34538y = f11Var;
        this.f34529b = new Paint(1);
        setWillNotDraw(false);
        p9 p9Var = new p9(context);
        this.f34528a = p9Var;
        addView(p9Var, c8.na.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void f(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void g(Canvas canvas, float f10) {
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.f34538y.f34953e);
        Paint paint = this.f34529b;
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
        Paint paint = this.f34529b;
        f11 f11Var = this.f34538y;
        if (i10 != 0) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, f11Var.f34953e));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f34535s) {
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, f11Var.f34953e)));
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
        if (this.f34532f != null) {
            float width2 = f13 - staticLayout.getWidth();
            canvas2.save();
            canvas2.translate(width2, ((org.telegram.messenger.g0.L(20.0f) - this.f34532f.getHeight()) / 2.0f) + org.telegram.messenger.g0.L(10.0f));
            this.f34532f.draw(canvas2);
            canvas2.restore();
            f10 = width2 - org.telegram.messenger.g0.L(6.0f);
        } else {
            f10 = f13;
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29843y6, f11Var.f34953e);
        if (this.f34534r && (drawable2 = this.f34537x) != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L2 = org.telegram.messenger.g0.L(13.0f);
            int i11 = (int) f10;
            f11 = 12.0f;
            f12 = 2.0f;
            this.f34537x.setBounds(i11 - L2, org.telegram.messenger.g0.L(14.0f), i11, org.telegram.messenger.g0.L(14.0f) + L2);
            this.f34537x.draw(canvas2);
            f10 -= org.telegram.messenger.g0.L(6.0f) + L2;
        } else {
            f11 = 12.0f;
            f12 = 2.0f;
        }
        if (this.f34533n && (drawable = this.f34536w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L3 = org.telegram.messenger.g0.L(f11);
            int i12 = (int) f10;
            this.f34536w.setBounds(i12 - L3, org.telegram.messenger.g0.L(14.0f), i12, org.telegram.messenger.g0.L(14.0f) + L3);
            this.f34536w.draw(canvas2);
        }
        if (this.f34531e != null) {
            canvas2.save();
            canvas2.translate(L, org.telegram.messenger.g0.L(34.0f));
            this.f34531e.draw(canvas2);
            canvas2.restore();
        }
        if (this.h != null) {
            float max = Math.max(org.telegram.messenger.g0.L(23.0f), f11Var.f34967q0.measureText(this.h) + org.telegram.messenger.g0.L(14.0f));
            if (this.f34533n) {
                i7 = org.telegram.ui.ActionBar.n6.V8;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.U8;
            }
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(i7, f11Var.f34953e));
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f13 - max, org.telegram.messenger.g0.L(34.0f), f13, org.telegram.messenger.g0.L(57.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
            f11Var.f34967q0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.W8, f11Var.f34953e));
            canvas2.drawText(this.h, rectF2.centerX() - (f11Var.f34967q0.measureText(this.h) / f12), rectF2.centerY() - ((f11Var.f34967q0.ascent() + f11Var.f34967q0.descent()) / f12), f11Var.f34967q0);
        }
        if (this.f34530c && !this.f34535s) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29452d7, f11Var.f34953e));
            canvas2.drawRect(L, getHeight() - 1, f13, getHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        StaticLayout staticLayout = this.f34531e;
        if (staticLayout != null && staticLayout.getText().length() > 0) {
            i11 = this.f34531e.getHeight();
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
