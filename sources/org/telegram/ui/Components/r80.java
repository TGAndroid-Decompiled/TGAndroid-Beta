package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class r80 extends View {
    public final Drawable f29881a;
    public final Paint f29882b;
    public final Paint f29883c;
    public final t5 d;
    public boolean e;

    public r80(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f29882b = paint;
        Paint paint2 = new Paint(1);
        this.f29883c = paint2;
        this.d = new t5(this, 0L, 320L, gr.h);
        w7.e6.a(this);
        this.f29881a = context.getResources().getDrawable(2131231746).mutate();
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(-65536);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(style);
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        if (!z11) {
            this.d.a(z10);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.d.d(!this.e);
        int width = getWidth();
        Drawable drawable = this.f29881a;
        drawable.setBounds((width - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        Rect bounds = drawable.getBounds();
        float width2 = (bounds.width() * 0.325f) + bounds.left;
        float height = (bounds.height() * 0.152f) + bounds.top;
        float height2 = bounds.bottom - (bounds.height() * 0.152f);
        float width3 = bounds.right - (bounds.width() * 0.101f);
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint = this.f29883c;
            paint.setStrokeWidth(org.telegram.messenger.i0.L(4.0f));
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            drawable.draw(canvas);
            if (this.e) {
                canvas.drawLine(width3 - org.telegram.messenger.i0.L(4.0f), height2 - org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.T1(width3 - org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f) + width2, d), org.telegram.messenger.i0.T1(height2 - org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f) + height, d), paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(width2 + org.telegram.messenger.i0.L(4.0f), height + org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(4.0f) + width2, width3 - org.telegram.messenger.i0.L(4.0f), d), org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(4.0f) + height, height2 - org.telegram.messenger.i0.L(4.0f), d), paint);
            }
            canvas2.restore();
        } else {
            canvas2 = canvas;
            drawable.draw(canvas2);
        }
        if (i10 > 0) {
            Paint paint2 = this.f29882b;
            paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            if (this.e) {
                canvas2.drawLine(width3, height2, org.telegram.messenger.i0.T1(width3, width2, d), org.telegram.messenger.i0.T1(height2, height, d), paint2);
            } else {
                canvas.drawLine(width2, height, org.telegram.messenger.i0.T1(width2, width3, d), org.telegram.messenger.i0.T1(height, height2, d), paint2);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(45.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(45.0f), 1073741824));
    }
}
