package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public class VoIpBitmapTextView extends View {
    private volatile Bitmap bitmap;
    private final Paint paint;
    private final String text;
    private final TextPaint textPaint;
    private final float textWidth;

    public VoIpBitmapTextView(Context context, String str) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.paint = new Paint(1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        this.textWidth = textPaint.measureText(str);
        this.text = str;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) this.textWidth) + getPaddingLeft() + getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    VoIpBitmapTextView.$r8$lambda$d44ajallhzPC3tUlRT0vfZT9nWs(this.f$0);
                }
            });
        }
    }

    public static void $r8$lambda$d44ajallhzPC3tUlRT0vfZT9nWs(VoIpBitmapTextView voIpBitmapTextView) {
        voIpBitmapTextView.bitmap = Bitmap.createBitmap(voIpBitmapTextView.getMeasuredWidth(), voIpBitmapTextView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(voIpBitmapTextView.bitmap).drawText(voIpBitmapTextView.text, voIpBitmapTextView.getMeasuredWidth() / 2, (int) ((voIpBitmapTextView.getMeasuredHeight() / 2) - ((voIpBitmapTextView.textPaint.descent() + voIpBitmapTextView.textPaint.ascent()) / 2.0f)), voIpBitmapTextView.textPaint);
        voIpBitmapTextView.postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.bitmap != null) {
            canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, this.paint);
        }
    }
}
