package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class i41 {
    public final org.telegram.ui.Components.oz f47889a;
    public ng.f f47890b;
    public final int f47891c;
    public final j41 d;

    public i41(j41 j41Var, int i7) {
        this.d = j41Var;
        this.f47891c = i7;
        ?? view = new View(j41Var.getContext());
        view.f38121c = true;
        TextPaint textPaint = new TextPaint(1);
        view.f38122e = textPaint;
        view.f38123f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f38124n = paint2;
        view.f38128x = org.telegram.messenger.g0.L(35.0f);
        view.f38129y = org.telegram.messenger.g0.L(22.0f);
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
        this.f47889a = view;
        view.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        j41Var.h.addView(view);
        j41Var.f48205n.add(this);
    }
}
