package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class m41 {
    public final org.telegram.ui.Components.kz f47789a;
    public ng.f f47790b;
    public final int f47791c;
    public final n41 d;

    public m41(n41 n41Var, int i7) {
        this.d = n41Var;
        this.f47791c = i7;
        ?? view = new View(n41Var.getContext());
        view.f35465c = true;
        TextPaint textPaint = new TextPaint(1);
        view.f35466e = textPaint;
        view.f35467f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f35468n = paint2;
        view.f35472x = org.telegram.messenger.g0.L(35.0f);
        view.f35473y = org.telegram.messenger.g0.L(22.0f);
        view.D = org.telegram.messenger.g0.L(8.0f);
        view.E = org.telegram.messenger.g0.L(3.5f);
        view.F = new RectF();
        view.G = 0.0f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.f47789a = view;
        view.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        n41Var.h.addView(view);
        n41Var.f48118n.add(this);
    }
}
