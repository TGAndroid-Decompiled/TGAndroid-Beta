package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class b61 {
    public final org.telegram.ui.Components.yz f35963a;
    public dg.g f35964b;
    public final int f35965c;
    public final c61 d;

    public b61(c61 c61Var, int i10) {
        this.d = c61Var;
        this.f35965c = i10;
        ?? view = new View(c61Var.getContext());
        view.f32930c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f32931f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f32932n = paint2;
        view.f32936x = org.telegram.messenger.i0.L(35.0f);
        view.f32937y = org.telegram.messenger.i0.L(22.0f);
        view.D = org.telegram.messenger.i0.L(8.0f);
        view.E = org.telegram.messenger.i0.L(3.5f);
        view.F = new RectF();
        view.G = 0.0f;
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        this.f35963a = view;
        view.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        c61Var.h.addView(view);
        c61Var.f36209n.add(this);
    }
}
