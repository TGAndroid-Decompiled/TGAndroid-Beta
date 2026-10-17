package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a91 {
    public final org.telegram.ui.Components.a10 f35343a;
    public lg.f f35344b;
    public final int f35345c;
    public final b91 d;

    public a91(b91 b91Var, int i10) {
        this.d = b91Var;
        this.f35345c = i10;
        ?? view = new View(b91Var.getContext());
        view.f24448c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f24449f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f24450n = paint2;
        view.f24453w = AndroidUtilities.dp(35.0f);
        view.f24454x = AndroidUtilities.dp(22.0f);
        view.f24455y = AndroidUtilities.dp(8.0f);
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
        this.f35343a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        b91Var.h.addView(view);
        b91Var.f35608n.add(this);
    }
}
