package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class aa1 {
    public final org.telegram.ui.Components.t00 f31719a;
    public kg.f f31720b;
    public final int f31721c;
    public final ba1 d;

    public aa1(ba1 ba1Var, int i10) {
        this.d = ba1Var;
        this.f31721c = i10;
        ?? view = new View(ba1Var.getContext());
        view.f28025c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f28026f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f28027n = paint2;
        view.f28030w = AndroidUtilities.dp(35.0f);
        view.f28031x = AndroidUtilities.dp(22.0f);
        view.f28032y = AndroidUtilities.dp(8.0f);
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
        this.f31719a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ba1Var.h.addView(view);
        ba1Var.f32038n.add(this);
    }
}
