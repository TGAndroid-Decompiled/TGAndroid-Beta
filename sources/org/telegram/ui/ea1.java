package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ea1 {
    public final org.telegram.ui.Components.v00 f35969a;
    public kg.f f35970b;
    public final int f35971c;
    public final fa1 d;

    public ea1(fa1 fa1Var, int i10) {
        this.d = fa1Var;
        this.f35971c = i10;
        ?? view = new View(fa1Var.getContext());
        view.f31479c = true;
        TextPaint textPaint = new TextPaint(1);
        view.f31480e = textPaint;
        view.f31481f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f31482n = paint2;
        view.f31485w = AndroidUtilities.dp(35.0f);
        view.f31486x = AndroidUtilities.dp(22.0f);
        view.f31487y = AndroidUtilities.dp(8.0f);
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
        this.f35969a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        fa1Var.h.addView(view);
        fa1Var.f36234n.add(this);
    }
}
