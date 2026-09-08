package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ka1 {
    public final org.telegram.ui.Components.s00 f38016a;
    public lg.f f38017b;
    public final int f38018c;
    public final la1 d;

    public ka1(la1 la1Var, int i10) {
        this.d = la1Var;
        this.f38018c = i10;
        ?? view = new View(la1Var.getContext());
        view.f30166c = true;
        TextPaint textPaint = new TextPaint(1);
        view.f30167e = textPaint;
        view.f30168f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f30169n = paint2;
        view.f30172w = AndroidUtilities.dp(35.0f);
        view.f30173x = AndroidUtilities.dp(22.0f);
        view.f30174y = AndroidUtilities.dp(8.0f);
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
        this.f38016a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        la1Var.h.addView(view);
        la1Var.f38283n.add(this);
    }
}
