package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ja1 {
    public final org.telegram.ui.Components.j10 f38962a;
    public kg.f f38963b;
    public final int f38964c;
    public final ka1 d;

    public ja1(ka1 ka1Var, int i10) {
        this.d = ka1Var;
        this.f38964c = i10;
        ?? view = new View(ka1Var.getContext());
        view.f27512c = true;
        TextPaint textPaint = new TextPaint(1);
        view.f27513e = textPaint;
        view.f27514f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f27515n = paint2;
        view.f27518w = AndroidUtilities.dp(35.0f);
        view.f27519x = AndroidUtilities.dp(22.0f);
        view.f27520y = AndroidUtilities.dp(8.0f);
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
        this.f38962a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ka1Var.h.addView(view);
        ka1Var.f39253n.add(this);
    }
}
