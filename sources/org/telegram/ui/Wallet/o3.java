package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
public final class o3 extends View {
    public final p3 f42869a;

    public o3(p3 p3Var, Context context) {
        super(context);
        this.f42869a = p3Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        p3 p3Var = this.f42869a;
        Bitmap bitmap = p3Var.G;
        if (bitmap != null && !bitmap.isRecycled()) {
            p3Var.D.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(p3Var.G, (Rect) null, p3Var.D, p3Var.f42966y);
        }
    }
}
