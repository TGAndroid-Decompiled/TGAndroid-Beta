package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f91 {
    public final org.telegram.ui.Components.a10 f39314a;
    public mg.f f39315b;
    public final int f39316c;
    public final g91 d;

    public f91(g91 g91Var, int i10) {
        this.d = g91Var;
        this.f39316c = i10;
        ?? view = new View(g91Var.getContext());
        view.f26379c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f26380f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f26381n = paint2;
        view.f26384w = AndroidUtilities.dp(35.0f);
        view.f26385x = AndroidUtilities.dp(22.0f);
        view.f26386y = AndroidUtilities.dp(8.0f);
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
        this.f39314a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        g91Var.h.addView(view);
        g91Var.f39572n.add(this);
    }
}
