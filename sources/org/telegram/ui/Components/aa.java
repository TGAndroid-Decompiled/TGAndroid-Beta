package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
public abstract class aa {
    public static Paint a(Bitmap bitmap) {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        Paint paint = new Paint(1);
        paint.setShader(bitmapShader);
        paint.setFilterBitmap(true);
        return paint;
    }

    public static void b(Canvas canvas, e0.e0 e0Var, int i10, Paint paint) {
        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i10 * 8, (float[]) e0Var.f9529c, 0, (float[]) e0Var.d, 0, (int[]) e0Var.f9530f, 0, (short[]) e0Var.e, 0, i10 * 6, paint);
    }
}
