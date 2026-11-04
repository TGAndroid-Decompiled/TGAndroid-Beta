package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class a41 {
    public final org.telegram.ui.Components.hz f43593a;
    public og.f f43594b;
    public final int f43595c;
    public final b41 d;

    public a41(b41 b41Var, int i3) {
        this.d = b41Var;
        this.f43595c = i3;
        ?? view = new View(b41Var.getContext());
        view.f34541c = true;
        TextPaint textPaint = new TextPaint(1);
        view.f34542e = textPaint;
        view.f34543f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f34544n = paint2;
        view.f34548x = org.telegram.messenger.g0.L(35.0f);
        view.f34549y = org.telegram.messenger.g0.L(22.0f);
        view.E = org.telegram.messenger.g0.L(8.0f);
        view.F = org.telegram.messenger.g0.L(3.5f);
        view.G = new RectF();
        view.H = 0.0f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.f43593a = view;
        view.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        b41Var.h.addView(view);
        b41Var.f43922n.add(this);
    }
}
