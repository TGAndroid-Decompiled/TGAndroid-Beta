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
public final class s11 extends FrameLayout {
    public final g9 f30086a;
    public final Paint f30087b;
    public boolean f30088c;
    public StaticLayout d;
    public StaticLayout e;
    public StaticLayout f30089f;
    public String h;
    public boolean f30090n;
    public boolean f30091r;
    public boolean f30092s;
    public Drawable f30093w;
    public Drawable f30094x;
    public final t11 f30095y;

    public s11(t11 t11Var, Context context) {
        super(context);
        this.f30095y = t11Var;
        this.f30087b = new Paint(1);
        setWillNotDraw(false);
        g9 g9Var = new g9(context);
        this.f30086a = g9Var;
        addView(g9Var, w7.b6.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        float f7;
        float f10;
        float f11;
        int i10;
        Drawable drawable;
        Drawable drawable2;
        boolean z10 = this.f30092s;
        Paint paint = this.f30087b;
        t11 t11Var = this.f30095y;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, t11Var.e)));
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint);
        }
        int L = org.telegram.messenger.i0.L(12.0f);
        int width = getWidth() - org.telegram.messenger.i0.L(12.0f);
        if (this.d != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(26.0f) + L, ((org.telegram.messenger.i0.L(20.0f) - this.d.getHeight()) / 2.0f) + org.telegram.messenger.i0.L(10.0f));
            this.d.draw(canvas);
            canvas.restore();
        }
        float f12 = width;
        if (this.f30089f != null) {
            float width2 = f12 - staticLayout.getWidth();
            canvas.save();
            canvas.translate(width2, ((org.telegram.messenger.i0.L(20.0f) - this.f30089f.getHeight()) / 2.0f) + org.telegram.messenger.i0.L(10.0f));
            this.f30089f.draw(canvas);
            canvas.restore();
            f7 = width2 - org.telegram.messenger.i0.L(6.0f);
        } else {
            f7 = f12;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21311y6, t11Var.e);
        if (this.f30091r && (drawable2 = this.f30094x) != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L2 = org.telegram.messenger.i0.L(13.0f);
            int i11 = (int) f7;
            f10 = 12.0f;
            f11 = 2.0f;
            this.f30094x.setBounds(i11 - L2, org.telegram.messenger.i0.L(14.0f), i11, org.telegram.messenger.i0.L(14.0f) + L2);
            this.f30094x.draw(canvas);
            f7 -= org.telegram.messenger.i0.L(6.0f) + L2;
        } else {
            f10 = 12.0f;
            f11 = 2.0f;
        }
        if (this.f30090n && (drawable = this.f30093w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            int L3 = org.telegram.messenger.i0.L(f10);
            int i12 = (int) f7;
            this.f30093w.setBounds(i12 - L3, org.telegram.messenger.i0.L(14.0f), i12, org.telegram.messenger.i0.L(14.0f) + L3);
            this.f30093w.draw(canvas);
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(L, org.telegram.messenger.i0.L(34.0f));
            this.e.draw(canvas);
            canvas.restore();
        }
        if (this.h != null) {
            float max = Math.max(org.telegram.messenger.i0.L(23.0f), t11Var.W.measureText(this.h) + org.telegram.messenger.i0.L(14.0f));
            if (this.f30090n) {
                i10 = org.telegram.ui.ActionBar.t6.V8;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.U8;
            }
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, t11Var.e));
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(f12 - max, org.telegram.messenger.i0.L(34.0f), f12, org.telegram.messenger.i0.L(57.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(11.5f), paint);
            t11Var.W.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W8, t11Var.e));
            canvas.drawText(this.h, rectF2.centerX() - (t11Var.W.measureText(this.h) / f11), rectF2.centerY() - ((t11Var.W.ascent() + t11Var.W.descent()) / f11), t11Var.W);
        }
        if (this.f30088c && !this.f30092s) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d7, t11Var.e));
            canvas.drawRect(L, getHeight() - 1, f12, getHeight(), paint);
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
}
