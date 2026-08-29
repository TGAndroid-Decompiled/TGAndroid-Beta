package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c91 {
    public final org.telegram.ui.Components.o00 f37056a;
    public vf.f f37057b;
    public final int f37058c;
    public final d91 d;

    public c91(d91 d91Var, int i10) {
        this.d = d91Var;
        this.f37058c = i10;
        ?? view = new View(d91Var.getContext());
        view.f31207c = true;
        TextPaint textPaint = new TextPaint(1);
        view.f31208e = textPaint;
        view.f31209f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f31210n = paint2;
        view.f31213w = AndroidUtilities.dp(35.0f);
        view.f31214x = AndroidUtilities.dp(22.0f);
        view.f31215y = AndroidUtilities.dp(8.0f);
        view.A = AndroidUtilities.dp(3.5f);
        view.B = new RectF();
        view.C = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f37056a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        d91Var.h.addView(view);
        d91Var.f37429n.add(this);
    }
}
