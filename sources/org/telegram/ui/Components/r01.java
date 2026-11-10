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
    public final k9 f37451a;
    public final Paint f37452b;
    public boolean f37453c;
    public StaticLayout d;
    public StaticLayout f37454e;
    public StaticLayout f37455f;
    public String h;
    public boolean f37456n;
    public boolean f37457r;
    public boolean f37458s;
    public Drawable f37459w;
    public Drawable f37460x;
    public final s01 f37461y;

    public r01(s01 s01Var, Context context) {
        super(context);
        this.f37461y = s01Var;
        this.f37452b = new Paint(1);
        setWillNotDraw(false);
        k9 k9Var = new k9(context);
        this.f37451a = k9Var;
        addView(k9Var, c8.ha.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void g(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, this.f37461y.f37798e);
        Paint paint = this.f37452b;
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
        Paint paint = this.f37452b;
        s01 s01Var = this.f37461y;
        if (i10 != 0) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, s01Var.f37798e));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f37458s) {
            paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, s01Var.f37798e)));
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
        if (this.f37455f != null) {
            float width2 = f13 - staticLayout.getWidth();
            canvas2.save();
            canvas2.translate(width2, ((org.telegram.messenger.g0.L(20.0f) - this.f37455f.getHeight()) / 2.0f) + org.telegram.messenger.g0.L(10.0f));
            this.f37455f.draw(canvas2);
            canvas2.restore();
            f10 = width2 - org.telegram.messenger.g0.L(6.0f);
        } else {
            f10 = f13;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28282y6, s01Var.f37798e);
        if (this.f37457r && (drawable2 = this.f37460x) != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L2 = org.telegram.messenger.g0.L(13.0f);
            int i11 = (int) f10;
            f11 = 12.0f;
            f12 = 2.0f;
            this.f37460x.setBounds(i11 - L2, org.telegram.messenger.g0.L(14.0f), i11, org.telegram.messenger.g0.L(14.0f) + L2);
            this.f37460x.draw(canvas2);
            f10 -= org.telegram.messenger.g0.L(6.0f) + L2;
        } else {
            f11 = 12.0f;
            f12 = 2.0f;
        }
        if (this.f37456n && (drawable = this.f37459w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L3 = org.telegram.messenger.g0.L(f11);
            int i12 = (int) f10;
            this.f37459w.setBounds(i12 - L3, org.telegram.messenger.g0.L(14.0f), i12, org.telegram.messenger.g0.L(14.0f) + L3);
            this.f37459w.draw(canvas2);
        }
        if (this.f37454e != null) {
            canvas2.save();
            canvas2.translate(L, org.telegram.messenger.g0.L(34.0f));
            this.f37454e.draw(canvas2);
            canvas2.restore();
        }
        if (this.h != null) {
            float max = Math.max(org.telegram.messenger.g0.L(23.0f), s01Var.f37807l0.measureText(this.h) + org.telegram.messenger.g0.L(14.0f));
            if (this.f37456n) {
                i7 = org.telegram.ui.ActionBar.m6.V8;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.U8;
            }
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(i7, s01Var.f37798e));
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f13 - max, org.telegram.messenger.g0.L(34.0f), f13, org.telegram.messenger.g0.L(57.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
            s01Var.f37807l0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W8, s01Var.f37798e));
            canvas2.drawText(this.h, rectF2.centerX() - (s01Var.f37807l0.measureText(this.h) / f12), rectF2.centerY() - ((s01Var.f37807l0.ascent() + s01Var.f37807l0.descent()) / f12), s01Var.f37807l0);
        }
        if (this.f37453c && !this.f37458s) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27891d7, s01Var.f37798e));
            canvas2.drawRect(L, getHeight() - 1, f13, getHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        StaticLayout staticLayout = this.f37454e;
        if (staticLayout != null && staticLayout.getText().length() > 0) {
            i11 = this.f37454e.getHeight();
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
