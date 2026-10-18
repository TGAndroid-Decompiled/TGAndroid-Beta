package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
public final class x2 extends View {
    public final y2 f35063a;

    public x2(y2 y2Var, Context context) {
        super(context);
        this.f35063a = y2Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y2 y2Var = this.f35063a;
        Bitmap bitmap = y2Var.G;
        if (bitmap != null && !bitmap.isRecycled()) {
            y2Var.f35122y.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(y2Var.G, (Rect) null, y2Var.f35122y, y2Var.f35121x);
        }
    }
}
