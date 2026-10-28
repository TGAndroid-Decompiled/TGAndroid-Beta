package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h91 {
    public final org.telegram.ui.Components.a10 f39831a;
    public mg.f f39832b;
    public final int f39833c;
    public final i91 d;

    public h91(i91 i91Var, int i10) {
        this.d = i91Var;
        this.f39833c = i10;
        ?? view = new View(i91Var.getContext());
        view.f26391c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f26392f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f26393n = paint2;
        view.f26396w = AndroidUtilities.dp(35.0f);
        view.f26397x = AndroidUtilities.dp(22.0f);
        view.f26398y = AndroidUtilities.dp(8.0f);
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
        this.f39831a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        i91Var.h.addView(view);
        i91Var.f40075n.add(this);
    }
}
