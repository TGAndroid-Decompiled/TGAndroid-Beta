package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
public final class n3 extends View {
    public final o3 f42863a;

    public n3(o3 o3Var, Context context) {
        super(context);
        this.f42863a = o3Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        o3 o3Var = this.f42863a;
        Bitmap bitmap = o3Var.G;
        if (bitmap != null && !bitmap.isRecycled()) {
            o3Var.D.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(o3Var.G, (Rect) null, o3Var.D, o3Var.f42952y);
        }
    }
}
