package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d91 {
    public final org.telegram.ui.Components.a10 f36573a;
    public lg.f f36574b;
    public final int f36575c;
    public final e91 d;

    public d91(e91 e91Var, int i10) {
        this.d = e91Var;
        this.f36575c = i10;
        ?? view = new View(e91Var.getContext());
        view.f24586c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f24587f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f24588n = paint2;
        view.f24591w = AndroidUtilities.dp(35.0f);
        view.f24592x = AndroidUtilities.dp(22.0f);
        view.f24593y = AndroidUtilities.dp(8.0f);
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
        this.f36573a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        e91Var.h.addView(view);
        e91Var.f36882n.add(this);
    }
}
