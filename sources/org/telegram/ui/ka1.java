package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ka1 {
    public final org.telegram.ui.Components.j10 f39244a;
    public kg.f f39245b;
    public final int f39246c;
    public final la1 d;

    public ka1(la1 la1Var, int i10) {
        this.d = la1Var;
        this.f39246c = i10;
        ?? view = new View(la1Var.getContext());
        view.f27499c = true;
        TextPaint textPaint = new TextPaint(1);
        view.f27500e = textPaint;
        view.f27501f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f27502n = paint2;
        view.f27505w = AndroidUtilities.dp(35.0f);
        view.f27506x = AndroidUtilities.dp(22.0f);
        view.f27507y = AndroidUtilities.dp(8.0f);
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
        this.f39244a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        la1Var.h.addView(view);
        la1Var.f39537n.add(this);
    }
}
