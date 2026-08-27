package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ll0 extends Drawable {

    public final RectF f30406a = new RectF();

    public final Paint f30407b;

    public final TextPaint f30408c;
    public int d;

    public String f30409e;

    public final int f30410f;

    public int f30411g;
    public final int h;

    public ll0(int i10) {
        Paint paint = new Paint(1);
        this.f30407b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f30408c = textPaint;
        this.f30411g = 255;
        this.h = 255;
        this.f30410f = i10;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i10 == 0) {
            this.f30409e = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.f30409e = LocaleController.getString(R.string.FakeMessage);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f30409e));
    }

    public final void a() {
        String string = this.f30410f == 0 ? LocaleController.getString(R.string.ScamMessage) : LocaleController.getString(R.string.FakeMessage);
        if (string.equals(this.f30409e)) {
            return;
        }
        this.f30409e = string;
        this.d = (int) Math.ceil(this.f30408c.measureText(string));
    }

    public final void b(int i10) {
        this.f30408c.setColor(i10);
        this.f30407b.setColor(i10);
        this.f30411g = Color.alpha(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f30406a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.f30407b);
        canvas.drawText(this.f30409e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.f30408c);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(16.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(10.0f) + this.d;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.h != i10) {
            int i11 = (int) ((i10 / 255.0f) * this.f30411g);
            this.f30407b.setAlpha(i11);
            this.f30408c.setAlpha(i11);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
