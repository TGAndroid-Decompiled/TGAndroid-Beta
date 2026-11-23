package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
public final class v3 extends View {
    public final w3 f45170a;

    public v3(w3 w3Var, Context context) {
        super(context);
        this.f45170a = w3Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        w3 w3Var = this.f45170a;
        Bitmap bitmap = w3Var.H;
        if (bitmap != null && !bitmap.isRecycled()) {
            w3Var.E.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(w3Var.H, (Rect) null, w3Var.E, w3Var.f45220y);
        }
    }
}
