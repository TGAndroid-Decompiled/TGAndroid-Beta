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
public final class t11 extends FrameLayout implements y60 {
    public final g9 f30488a;
    public final Paint f30489b;
    public boolean f30490c;
    public StaticLayout d;
    public StaticLayout e;
    public StaticLayout f30491f;
    public String h;
    public boolean f30492n;
    public boolean f30493r;
    public boolean f30494s;
    public Drawable f30495w;
    public Drawable f30496x;
    public final u11 f30497y;

    public t11(u11 u11Var, Context context) {
        super(context);
        this.f30497y = u11Var;
        this.f30489b = new Paint(1);
        setWillNotDraw(false);
        g9 g9Var = new g9(context);
        this.f30488a = g9Var;
        addView(g9Var, w7.b6.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.f30497y.e);
        Paint paint = this.f30489b;
        paint.setColor(w02);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint);
        draw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout;
        float f7;
        float f10;
        float f11;
        int i10;
        Drawable drawable;
        Drawable drawable2;
        int i11 = (getTranslationY() > 0.0f ? 1 : (getTranslationY() == 0.0f ? 0 : -1));
        Paint paint = this.f30489b;
        u11 u11Var = this.f30497y;
        if (i11 != 0) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, u11Var.e));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f30494s) {
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, u11Var.e)));
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint);
        }
        int L = org.telegram.messenger.i0.L(12.0f);
        int width = getWidth() - org.telegram.messenger.i0.L(12.0f);
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.i0.L(26.0f) + L, ((org.telegram.messenger.i0.L(20.0f) - this.d.getHeight()) / 2.0f) + org.telegram.messenger.i0.L(10.0f));
            this.d.draw(canvas2);
            canvas2.restore();
        }
        float f12 = width;
        if (this.f30491f != null) {
            float width2 = f12 - staticLayout.getWidth();
            canvas2.save();
            canvas2.translate(width2, ((org.telegram.messenger.i0.L(20.0f) - this.f30491f.getHeight()) / 2.0f) + org.telegram.messenger.i0.L(10.0f));
            this.f30491f.draw(canvas2);
            canvas2.restore();
            f7 = width2 - org.telegram.messenger.i0.L(6.0f);
        } else {
            f7 = f12;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, u11Var.e);
        if (this.f30493r && (drawable2 = this.f30496x) != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L2 = org.telegram.messenger.i0.L(13.0f);
            int i12 = (int) f7;
            f10 = 12.0f;
            f11 = 2.0f;
            this.f30496x.setBounds(i12 - L2, org.telegram.messenger.i0.L(14.0f), i12, org.telegram.messenger.i0.L(14.0f) + L2);
            this.f30496x.draw(canvas2);
            f7 -= org.telegram.messenger.i0.L(6.0f) + L2;
        } else {
            f10 = 12.0f;
            f11 = 2.0f;
        }
        if (this.f30492n && (drawable = this.f30495w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L3 = org.telegram.messenger.i0.L(f10);
            int i13 = (int) f7;
            this.f30495w.setBounds(i13 - L3, org.telegram.messenger.i0.L(14.0f), i13, org.telegram.messenger.i0.L(14.0f) + L3);
            this.f30495w.draw(canvas2);
        }
        if (this.e != null) {
            canvas2.save();
            canvas2.translate(L, org.telegram.messenger.i0.L(34.0f));
            this.e.draw(canvas2);
            canvas2.restore();
        }
        if (this.h != null) {
            float max = Math.max(org.telegram.messenger.i0.L(23.0f), u11Var.f30823d0.measureText(this.h) + org.telegram.messenger.i0.L(14.0f));
            if (this.f30492n) {
                i10 = org.telegram.ui.ActionBar.t6.V8;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.U8;
            }
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, u11Var.e));
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(f12 - max, org.telegram.messenger.i0.L(34.0f), f12, org.telegram.messenger.i0.L(57.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(11.5f), paint);
            u11Var.f30823d0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W8, u11Var.e));
            canvas2.drawText(this.h, rectF2.centerX() - (u11Var.f30823d0.measureText(this.h) / f11), rectF2.centerY() - ((u11Var.f30823d0.ascent() + u11Var.f30823d0.descent()) / f11), u11Var.f30823d0);
        }
        if (this.f30490c && !this.f30494s) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20931d7, u11Var.e));
            canvas2.drawRect(L, getHeight() - 1, f12, getHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        StaticLayout staticLayout = this.e;
        if (staticLayout != null && staticLayout.getText().length() > 0) {
            i12 = this.e.getHeight();
        } else {
            i12 = 0;
        }
        int L = org.telegram.messenger.i0.L(34.0f) + i12;
        if (i12 > org.telegram.messenger.i0.L(24.0f)) {
            f7 = 6.0f;
        } else {
            f7 = 10.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(f7) + L), 1073741824));
    }

    @Override
    public final void setTranslationY(float f7) {
        boolean z10;
        boolean z11 = false;
        if (getTranslationY() != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (f7 != 0.0f) {
            z11 = true;
        }
        if (z10 != z11) {
            invalidate();
        }
        super.setTranslationY(f7);
    }
}
