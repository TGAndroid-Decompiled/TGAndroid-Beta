package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
public final class y2 extends View {
    public final z2 f35141a;

    public y2(z2 z2Var, Context context) {
        super(context);
        this.f35141a = z2Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        z2 z2Var = this.f35141a;
        Bitmap bitmap = z2Var.G;
        if (bitmap != null && !bitmap.isRecycled()) {
            z2Var.f35182y.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(z2Var.G, (Rect) null, z2Var.f35182y, z2Var.f35181x);
        }
    }
}
