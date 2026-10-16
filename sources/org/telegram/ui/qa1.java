package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qa1 {
    public final org.telegram.ui.Components.e10 f39086a;
    public lg.f f39087b;
    public final int f39088c;
    public final ra1 d;

    public qa1(ra1 ra1Var, int i10) {
        this.d = ra1Var;
        this.f39088c = i10;
        ?? view = new View(ra1Var.getContext());
        view.f24248c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f24249f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f24250n = paint2;
        view.f24253w = AndroidUtilities.dp(35.0f);
        view.f24254x = AndroidUtilities.dp(22.0f);
        view.f24255y = AndroidUtilities.dp(8.0f);
        view.E = AndroidUtilities.dp(3.5f);
        view.F = new RectF();
        view.G = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f39086a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ra1Var.h.addView(view);
        ra1Var.f39441n.add(this);
    }
}
