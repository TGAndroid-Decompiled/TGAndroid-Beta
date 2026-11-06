package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class k41 {
    public final org.telegram.ui.Components.kz f47081a;
    public ng.f f47082b;
    public final int f47083c;
    public final l41 d;

    public k41(l41 l41Var, int i7) {
        this.d = l41Var;
        this.f47083c = i7;
        ?? view = new View(l41Var.getContext());
        view.f35443c = true;
        TextPaint textPaint = new TextPaint(1);
        view.f35444e = textPaint;
        view.f35445f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f35446n = paint2;
        view.f35450x = org.telegram.messenger.g0.L(35.0f);
        view.f35451y = org.telegram.messenger.g0.L(22.0f);
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
        this.f47081a = view;
        view.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        l41Var.h.addView(view);
        l41Var.f47387n.add(this);
    }
}
