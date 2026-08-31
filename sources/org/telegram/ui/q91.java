package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q91 {
    public final org.telegram.ui.Components.t00 f40414a;
    public yf.f f40415b;
    public final int f40416c;
    public final r91 d;

    public q91(r91 r91Var, int i10) {
        this.d = r91Var;
        this.f40416c = i10;
        ?? view = new View(r91Var.getContext());
        view.f31216c = true;
        TextPaint textPaint = new TextPaint(1);
        view.f31217e = textPaint;
        view.f31218f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f31219n = paint2;
        view.f31222w = AndroidUtilities.dp(35.0f);
        view.f31223x = AndroidUtilities.dp(22.0f);
        view.f31224y = AndroidUtilities.dp(8.0f);
        view.B = AndroidUtilities.dp(3.5f);
        view.C = new RectF();
        view.D = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f40414a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r91Var.h.addView(view);
        r91Var.f40872n.add(this);
    }
}
