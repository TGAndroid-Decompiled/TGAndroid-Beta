package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b91 {
    public final org.telegram.ui.Components.d00 f36795a;
    public sf.f f36796b;
    public final int f36797c;
    public final c91 d;

    public b91(c91 c91Var, int i9) {
        this.d = c91Var;
        this.f36797c = i9;
        ?? view = new View(c91Var.getContext());
        view.f27610c = true;
        TextPaint textPaint = new TextPaint(1);
        view.f27611e = textPaint;
        view.f27612f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f27613n = paint2;
        view.f27616w = AndroidUtilities.dp(35.0f);
        view.f27617x = AndroidUtilities.dp(22.0f);
        view.f27618y = AndroidUtilities.dp(8.0f);
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
        this.f36795a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        c91Var.h.addView(view);
        c91Var.f37132n.add(this);
    }
}
