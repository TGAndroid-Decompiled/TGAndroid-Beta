package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class y70 extends View {
    public final Drawable f40572a;
    public final Paint f40573b;
    public final Paint f40574c;
    public final w5 d;
    public boolean f40575e;

    public y70(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f40573b = paint;
        Paint paint2 = new Paint(1);
        this.f40574c = paint2;
        this.d = new w5(this, 0L, 320L, xq.h);
        c8.ka.a(this);
        this.f40572a = context.getResources().getDrawable(2131231747).mutate();
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(-65536);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(style);
        paint.setColor(-1);
    }

    public final void a(boolean z9, boolean z10) {
        if (this.f40575e == z9) {
            return;
        }
        this.f40575e = z9;
        if (!z10) {
            this.d.a(z9);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.d.d(!this.f40575e);
        int width = getWidth();
        Drawable drawable = this.f40572a;
        drawable.setBounds((width - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        Rect bounds = drawable.getBounds();
        float width2 = (bounds.width() * 0.325f) + bounds.left;
        float height = (bounds.height() * 0.152f) + bounds.top;
        float height2 = bounds.bottom - (bounds.height() * 0.152f);
        float width3 = bounds.right - (bounds.width() * 0.101f);
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i7 > 0) {
            Paint paint = this.f40574c;
            paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            drawable.draw(canvas);
            if (this.f40575e) {
                canvas.drawLine(width3 - org.telegram.messenger.g0.L(4.0f), height2 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.T1(width3 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + width2, d), org.telegram.messenger.g0.T1(height2 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + height, d), paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(width2 + org.telegram.messenger.g0.L(4.0f), height + org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(4.0f) + width2, width3 - org.telegram.messenger.g0.L(4.0f), d), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(4.0f) + height, height2 - org.telegram.messenger.g0.L(4.0f), d), paint);
            }
            canvas2.restore();
        } else {
            canvas2 = canvas;
            drawable.draw(canvas2);
        }
        if (i7 > 0) {
            Paint paint2 = this.f40573b;
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            if (this.f40575e) {
                canvas2.drawLine(width3, height2, org.telegram.messenger.g0.T1(width3, width2, d), org.telegram.messenger.g0.T1(height2, height, d), paint2);
            } else {
                canvas.drawLine(width2, height, org.telegram.messenger.g0.T1(width2, width3, d), org.telegram.messenger.g0.T1(height, height2, d), paint2);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(45.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(45.0f), 1073741824));
    }
}
