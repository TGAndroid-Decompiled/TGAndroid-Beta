package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
public final class x2 extends View {
    public final y2 f35387a;

    public x2(y2 y2Var, Context context) {
        super(context);
        this.f35387a = y2Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y2 y2Var = this.f35387a;
        Bitmap bitmap = y2Var.G;
        if (bitmap != null && !bitmap.isRecycled()) {
            y2Var.f35440y.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(y2Var.G, (Rect) null, y2Var.f35440y, y2Var.f35439x);
        }
    }
}
