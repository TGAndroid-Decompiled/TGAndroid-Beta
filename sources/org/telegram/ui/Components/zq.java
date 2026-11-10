package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class zq extends View implements org.telegram.ui.ActionBar.c6 {
    public final TextPaint f41090a;
    public final TextPaint f41091b;
    public final String f41092c;
    public final String d;
    public final Rect f41093e;

    public zq(Context context, String str, String str2) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f41090a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f41091b = textPaint2;
        this.f41093e = new Rect();
        this.f41092c = str;
        this.d = str2;
        textPaint.setTextSize(org.telegram.messenger.g0.L(24.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        textPaint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.H6, false));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.f41091b;
        String str = this.d;
        float measureText = textPaint.measureText(str);
        TextPaint textPaint2 = this.f41090a;
        String str2 = this.f41092c;
        float measureText2 = textPaint2.measureText(str2);
        int length = str2.length();
        Rect rect = this.f41093e;
        textPaint2.getTextBounds(str2, 0, length, rect);
        textPaint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str2, (getWidth() * 0.25f) - (measureText2 / 2.0f), (getHeight() / 2.0f) + (rect.height() / 2.0f), textPaint2);
        canvas.drawText(str, (getWidth() * 0.7f) - (measureText / 2.0f), (getHeight() / 2.0f) + (rect.height() / 2.0f), textPaint);
    }

    @Override
    public final void updateColors() {
        this.f41090a.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        this.f41091b.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.H6, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
