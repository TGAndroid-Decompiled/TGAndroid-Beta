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
public final class xl0 extends Drawable {
    public final RectF f32633a = new RectF();
    public final Paint f32634b;
    public final TextPaint f32635c;
    public int d;
    public String f32636e;
    public final int f32637f;
    public int f32638g;
    public final int h;

    public xl0(int i10) {
        Paint paint = new Paint(1);
        this.f32634b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f32635c = textPaint;
        this.f32638g = 255;
        this.h = 255;
        this.f32637f = i10;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i10 == 0) {
            this.f32636e = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.f32636e = LocaleController.getString(R.string.FakeMessage);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f32636e));
    }

    public final void a() {
        String string;
        if (this.f32637f == 0) {
            string = LocaleController.getString(R.string.ScamMessage);
        } else {
            string = LocaleController.getString(R.string.FakeMessage);
        }
        if (!string.equals(this.f32636e)) {
            this.f32636e = string;
            this.d = (int) Math.ceil(this.f32635c.measureText(string));
        }
    }

    public final void b(int i10) {
        this.f32635c.setColor(i10);
        this.f32634b.setColor(i10);
        this.f32638g = Color.alpha(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f32633a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.f32634b);
        canvas.drawText(this.f32636e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.f32635c);
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
            int i11 = (int) ((i10 / 255.0f) * this.f32638g);
            this.f32634b.setAlpha(i11);
            this.f32635c.setAlpha(i11);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
