package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p91 {
    public final org.telegram.ui.Components.s00 f37248a;
    public xf.f f37249b;
    public final int f37250c;
    public final q91 d;

    public p91(q91 q91Var, int i10) {
        this.d = q91Var;
        this.f37250c = i10;
        ?? view = new View(q91Var.getContext());
        view.f28575c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f28576f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f28577n = paint2;
        view.f28580w = AndroidUtilities.dp(35.0f);
        view.f28581x = AndroidUtilities.dp(22.0f);
        view.f28582y = AndroidUtilities.dp(8.0f);
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
        this.f37248a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        q91Var.h.addView(view);
        q91Var.f37683n.add(this);
    }
}
