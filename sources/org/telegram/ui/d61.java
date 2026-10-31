package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class d61 {
    public final org.telegram.ui.Components.yz f36627a;
    public dg.g f36628b;
    public final int f36629c;
    public final e61 d;

    public d61(e61 e61Var, int i10) {
        this.d = e61Var;
        this.f36629c = i10;
        ?? view = new View(e61Var.getContext());
        view.f32842c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f32843f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f32844n = paint2;
        view.f32848x = org.telegram.messenger.i0.L(35.0f);
        view.f32849y = org.telegram.messenger.i0.L(22.0f);
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
        this.f36627a = view;
        view.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        e61Var.h.addView(view);
        e61Var.f36963n.add(this);
    }
}
