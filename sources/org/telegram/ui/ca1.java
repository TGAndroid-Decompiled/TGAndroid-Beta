package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ca1 {
    public final org.telegram.ui.Components.v00 f35381a;
    public kg.f f35382b;
    public final int f35383c;
    public final da1 d;

    public ca1(da1 da1Var, int i10) {
        this.d = da1Var;
        this.f35383c = i10;
        ?? view = new View(da1Var.getContext());
        view.f31581c = true;
        TextPaint textPaint = new TextPaint(1);
        view.f31582e = textPaint;
        view.f31583f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f31584n = paint2;
        view.f31587w = AndroidUtilities.dp(35.0f);
        view.f31588x = AndroidUtilities.dp(22.0f);
        view.f31589y = AndroidUtilities.dp(8.0f);
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
        this.f35381a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        da1Var.h.addView(view);
        da1Var.f35737n.add(this);
    }
}
