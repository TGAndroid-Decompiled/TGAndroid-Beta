package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
public final class n3 extends View {
    public final o3 f44188a;

    public n3(o3 o3Var, Context context) {
        super(context);
        this.f44188a = o3Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        o3 o3Var = this.f44188a;
        Bitmap bitmap = o3Var.H;
        if (bitmap != null && !bitmap.isRecycled()) {
            o3Var.E.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(o3Var.H, (Rect) null, o3Var.E, o3Var.f44233y);
        }
    }
}
