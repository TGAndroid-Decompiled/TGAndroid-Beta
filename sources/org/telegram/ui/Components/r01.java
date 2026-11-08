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
public final class r01 extends FrameLayout implements j60 {
    public final l9 f37467a;
    public final Paint f37468b;
    public boolean f37469c;
    public StaticLayout d;
    public StaticLayout f37470e;
    public StaticLayout f37471f;
    public String h;
    public boolean f37472n;
    public boolean f37473r;
    public boolean f37474s;
    public Drawable f37475w;
    public Drawable f37476x;
    public final s01 f37477y;

    public r01(s01 s01Var, Context context) {
        super(context);
        this.f37477y = s01Var;
        this.f37468b = new Paint(1);
        setWillNotDraw(false);
        l9 l9Var = new l9(context);
        this.f37467a = l9Var;
        addView(l9Var, c8.ha.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void g(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, this.f37477y.f37836e);
        Paint paint = this.f37468b;
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
        Paint paint = this.f37468b;
        s01 s01Var = this.f37477y;
        if (i10 != 0) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, s01Var.f37836e));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f37474s) {
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, s01Var.f37836e)));
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
        if (this.f37471f != null) {
            float width2 = f13 - staticLayout.getWidth();
            canvas2.save();
            canvas2.translate(width2, ((org.telegram.messenger.g0.L(20.0f) - this.f37471f.getHeight()) / 2.0f) + org.telegram.messenger.g0.L(10.0f));
            this.f37471f.draw(canvas2);
            canvas2.restore();
            f10 = width2 - org.telegram.messenger.g0.L(6.0f);
        } else {
            f10 = f13;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28244y6, s01Var.f37836e);
        if (this.f37473r && (drawable2 = this.f37476x) != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L2 = org.telegram.messenger.g0.L(13.0f);
            int i11 = (int) f10;
            f11 = 12.0f;
            f12 = 2.0f;
            this.f37476x.setBounds(i11 - L2, org.telegram.messenger.g0.L(14.0f), i11, org.telegram.messenger.g0.L(14.0f) + L2);
            this.f37476x.draw(canvas2);
            f10 -= org.telegram.messenger.g0.L(6.0f) + L2;
        } else {
            f11 = 12.0f;
            f12 = 2.0f;
        }
        if (this.f37472n && (drawable = this.f37475w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L3 = org.telegram.messenger.g0.L(f11);
            int i12 = (int) f10;
            this.f37475w.setBounds(i12 - L3, org.telegram.messenger.g0.L(14.0f), i12, org.telegram.messenger.g0.L(14.0f) + L3);
            this.f37475w.draw(canvas2);
        }
        if (this.f37470e != null) {
            canvas2.save();
            canvas2.translate(L, org.telegram.messenger.g0.L(34.0f));
            this.f37470e.draw(canvas2);
            canvas2.restore();
        }
        if (this.h != null) {
            float max = Math.max(org.telegram.messenger.g0.L(23.0f), s01Var.f37845l0.measureText(this.h) + org.telegram.messenger.g0.L(14.0f));
            if (this.f37472n) {
                i7 = org.telegram.ui.ActionBar.k6.V8;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.U8;
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(i7, s01Var.f37836e));
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f13 - max, org.telegram.messenger.g0.L(34.0f), f13, org.telegram.messenger.g0.L(57.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
            s01Var.f37845l0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W8, s01Var.f37836e));
            canvas2.drawText(this.h, rectF2.centerX() - (s01Var.f37845l0.measureText(this.h) / f12), rectF2.centerY() - ((s01Var.f37845l0.ascent() + s01Var.f37845l0.descent()) / f12), s01Var.f37845l0);
        }
        if (this.f37469c && !this.f37474s) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27853d7, s01Var.f37836e));
            canvas2.drawRect(L, getHeight() - 1, f13, getHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        StaticLayout staticLayout = this.f37470e;
        if (staticLayout != null && staticLayout.getText().length() > 0) {
            i11 = this.f37470e.getHeight();
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
    public final void setTranslationY(float f10) {
        boolean z9;
        boolean z10 = false;
        if (getTranslationY() != 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (f10 != 0.0f) {
            z10 = true;
        }
        if (z9 != z10) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
