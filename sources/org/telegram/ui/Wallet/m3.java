package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
public final class m3 extends View {
    public final n3 f42781a;

    public m3(n3 n3Var, Context context) {
        super(context);
        this.f42781a = n3Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n3 n3Var = this.f42781a;
        Bitmap bitmap = n3Var.G;
        if (bitmap != null && !bitmap.isRecycled()) {
            n3Var.D.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(n3Var.G, (Rect) null, n3Var.D, n3Var.f42870y);
        }
    }
}
