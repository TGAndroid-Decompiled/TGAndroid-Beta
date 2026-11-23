package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
public final class w3 extends View {
    public final x3 f45332a;

    public w3(x3 x3Var, Context context) {
        super(context);
        this.f45332a = x3Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x3 x3Var = this.f45332a;
        Bitmap bitmap = x3Var.H;
        if (bitmap != null && !bitmap.isRecycled()) {
            x3Var.E.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(x3Var.H, (Rect) null, x3Var.E, x3Var.f45382y);
        }
    }
}
