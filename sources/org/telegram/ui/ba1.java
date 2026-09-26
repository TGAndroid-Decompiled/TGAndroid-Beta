package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ba1 {
    public final org.telegram.ui.Components.t00 f32364a;
    public kg.f f32365b;
    public final int f32366c;
    public final ca1 d;

    public ba1(ca1 ca1Var, int i10) {
        this.d = ca1Var;
        this.f32366c = i10;
        ?? view = new View(ca1Var.getContext());
        view.f28353c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f28354f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f28355n = paint2;
        view.f28358w = AndroidUtilities.dp(35.0f);
        view.f28359x = AndroidUtilities.dp(22.0f);
        view.f28360y = AndroidUtilities.dp(8.0f);
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
        this.f32364a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ca1Var.h.addView(view);
        ca1Var.f32616n.add(this);
    }
}
