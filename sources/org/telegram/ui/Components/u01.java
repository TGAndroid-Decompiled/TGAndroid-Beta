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
public final class u01 extends FrameLayout implements l60 {
    public final i9 f39845a;
    public final Paint f39846b;
    public boolean f39847c;
    public StaticLayout d;
    public StaticLayout f39848e;
    public StaticLayout f39849f;
    public String h;
    public boolean f39850n;
    public boolean f39851r;
    public boolean f39852s;
    public Drawable f39853w;
    public Drawable f39854x;
    public final v01 f39855y;

    public u01(v01 v01Var, Context context) {
        super(context);
        this.f39855y = v01Var;
        this.f39846b = new Paint(1);
        setWillNotDraw(false);
        i9 i9Var = new i9(context);
        this.f39845a = i9Var;
        addView(i9Var, c8.ja.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void f(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.f39855y.f40215e);
        Paint paint = this.f39846b;
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
        Paint paint = this.f39846b;
        v01 v01Var = this.f39855y;
        if (i10 != 0) {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, v01Var.f40215e));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f39852s) {
            paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, v01Var.f40215e)));
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
        if (this.f39849f != null) {
            float width2 = f13 - staticLayout.getWidth();
            canvas2.save();
            canvas2.translate(width2, ((org.telegram.messenger.g0.L(20.0f) - this.f39849f.getHeight()) / 2.0f) + org.telegram.messenger.g0.L(10.0f));
            this.f39849f.draw(canvas2);
            canvas2.restore();
            f10 = width2 - org.telegram.messenger.g0.L(6.0f);
        } else {
            f10 = f13;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29241y6, v01Var.f40215e);
        if (this.f39851r && (drawable2 = this.f39854x) != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L2 = org.telegram.messenger.g0.L(13.0f);
            int i11 = (int) f10;
            f11 = 12.0f;
            f12 = 2.0f;
            this.f39854x.setBounds(i11 - L2, org.telegram.messenger.g0.L(14.0f), i11, org.telegram.messenger.g0.L(14.0f) + L2);
            this.f39854x.draw(canvas2);
            f10 -= org.telegram.messenger.g0.L(6.0f) + L2;
        } else {
            f11 = 12.0f;
            f12 = 2.0f;
        }
        if (this.f39850n && (drawable = this.f39853w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L3 = org.telegram.messenger.g0.L(f11);
            int i12 = (int) f10;
            this.f39853w.setBounds(i12 - L3, org.telegram.messenger.g0.L(14.0f), i12, org.telegram.messenger.g0.L(14.0f) + L3);
            this.f39853w.draw(canvas2);
        }
        if (this.f39848e != null) {
            canvas2.save();
            canvas2.translate(L, org.telegram.messenger.g0.L(34.0f));
            this.f39848e.draw(canvas2);
            canvas2.restore();
        }
        if (this.h != null) {
            float max = Math.max(org.telegram.messenger.g0.L(23.0f), v01Var.m0.measureText(this.h) + org.telegram.messenger.g0.L(14.0f));
            if (this.f39850n) {
                i7 = org.telegram.ui.ActionBar.j6.V8;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.U8;
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(i7, v01Var.f40215e));
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f13 - max, org.telegram.messenger.g0.L(34.0f), f13, org.telegram.messenger.g0.L(57.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
            v01Var.m0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.W8, v01Var.f40215e));
            canvas2.drawText(this.h, rectF2.centerX() - (v01Var.m0.measureText(this.h) / f12), rectF2.centerY() - ((v01Var.m0.ascent() + v01Var.m0.descent()) / f12), v01Var.m0);
        }
        if (this.f39847c && !this.f39852s) {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28850d7, v01Var.f40215e));
            canvas2.drawRect(L, getHeight() - 1, f13, getHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        StaticLayout staticLayout = this.f39848e;
        if (staticLayout != null && staticLayout.getText().length() > 0) {
            i11 = this.f39848e.getHeight();
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
