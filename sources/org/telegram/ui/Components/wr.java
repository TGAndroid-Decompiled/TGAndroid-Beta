package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class wr extends View {
    public final TextPaint f32614a;
    public final TextPaint f32615b;
    public final String f32616c;
    public final String d;
    public final Rect f32617e;

    public wr(Context context, String str, String str2) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f32614a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f32615b = textPaint2;
        this.f32617e = new Rect();
        this.f32616c = str;
        this.d = str2;
        textPaint.setTextSize(AndroidUtilities.dp(24.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        textPaint2.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.H6, false));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.f32615b;
        String str = this.d;
        float measureText = textPaint.measureText(str);
        TextPaint textPaint2 = this.f32614a;
        String str2 = this.f32616c;
        float measureText2 = textPaint2.measureText(str2);
        int length = str2.length();
        Rect rect = this.f32617e;
        textPaint2.getTextBounds(str2, 0, length, rect);
        textPaint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str2, (getWidth() * 0.25f) - (measureText2 / 2.0f), (getHeight() / 2.0f) + (rect.height() / 2.0f), textPaint2);
        canvas.drawText(str, (getWidth() * 0.7f) - (measureText / 2.0f), (getHeight() / 2.0f) + (rect.height() / 2.0f), textPaint);
    }
}
