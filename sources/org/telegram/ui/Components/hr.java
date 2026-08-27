package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class hr extends View {

    public final TextPaint f29088a;

    public final TextPaint f29089b;

    public final String f29090c;
    public final String d;

    public final Rect f29091e;

    public hr(Context context, String str, String str2) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f29088a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f29089b = textPaint2;
        this.f29091e = new Rect();
        this.f29090c = str;
        this.d = str2;
        textPaint.setTextSize(AndroidUtilities.dp(24.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        textPaint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.f29089b;
        String str = this.d;
        float fMeasureText = textPaint.measureText(str);
        TextPaint textPaint2 = this.f29088a;
        String str2 = this.f29090c;
        float fMeasureText2 = textPaint2.measureText(str2);
        int length = str2.length();
        Rect rect = this.f29091e;
        textPaint2.getTextBounds(str2, 0, length, rect);
        float fHeight = rect.height() / 2.0f;
        textPaint.getTextBounds(str, 0, str.length(), rect);
        float fHeight2 = rect.height() / 2.0f;
        canvas.drawText(str2, (getWidth() * 0.25f) - (fMeasureText2 / 2.0f), (getHeight() / 2.0f) + fHeight, textPaint2);
        canvas.drawText(str, (getWidth() * 0.7f) - (fMeasureText / 2.0f), (getHeight() / 2.0f) + fHeight2, textPaint);
    }
}
