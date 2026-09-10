package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oa1 {
    public final org.telegram.ui.Components.z00 f35448a;
    public jg.f f35449b;
    public final int f35450c;
    public final pa1 d;

    public oa1(pa1 pa1Var, int i10) {
        this.d = pa1Var;
        this.f35450c = i10;
        ?? view = new View(pa1Var.getContext());
        view.f29553c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f29554f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f29555n = paint2;
        view.f29558w = AndroidUtilities.dp(35.0f);
        view.f29559x = AndroidUtilities.dp(22.0f);
        view.f29560y = AndroidUtilities.dp(8.0f);
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
        this.f35448a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        pa1Var.h.addView(view);
        pa1Var.f35756n.add(this);
    }
}
