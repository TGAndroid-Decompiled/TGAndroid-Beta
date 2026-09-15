package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ha1 {
    public final org.telegram.ui.Components.s00 f34225a;
    public kg.f f34226b;
    public final int f34227c;
    public final ia1 d;

    public ha1(ia1 ia1Var, int i10) {
        this.d = ia1Var;
        this.f34227c = i10;
        ?? view = new View(ia1Var.getContext());
        view.f27726c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f27727f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f27728n = paint2;
        view.f27731w = AndroidUtilities.dp(35.0f);
        view.f27732x = AndroidUtilities.dp(22.0f);
        view.f27733y = AndroidUtilities.dp(8.0f);
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
        this.f34225a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ia1Var.h.addView(view);
        ia1Var.f34575n.add(this);
    }
}
