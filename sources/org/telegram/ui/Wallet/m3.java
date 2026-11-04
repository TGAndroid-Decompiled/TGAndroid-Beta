package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
public final class m3 extends View {
    public final n3 f42830a;

    public m3(n3 n3Var, Context context) {
        super(context);
        this.f42830a = n3Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n3 n3Var = this.f42830a;
        Bitmap bitmap = n3Var.H;
        if (bitmap != null && !bitmap.isRecycled()) {
            n3Var.E.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(n3Var.H, (Rect) null, n3Var.E, n3Var.f42923y);
        }
    }
}
