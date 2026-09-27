package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class cf implements Utilities.Callback2 {
    public final int f32700a;
    public final xn f32701b;

    public cf(xn xnVar, int i10) {
        this.f32700a = i10;
        this.f32701b = xnVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f32700a) {
            case 0:
                xn.k1(this.f32701b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                xn.N0(this.f32701b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                xn xnVar = this.f32701b;
                fh.b bVar = xnVar.f40010z8;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, xnVar.fragmentView);
                xnVar.A8.d();
                return;
            default:
                xn xnVar2 = this.f32701b;
                xnVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                xnVar2.D8 = paint;
                Bitmap bitmap2 = xnVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                xnVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                xnVar2.E8 = new Matrix();
                fh.b bVar2 = xnVar2.f40010z8;
                bVar2.a((Bitmap) obj2);
                gh.d.c(bVar2, xnVar2.fragmentView);
                xnVar2.A8.d();
                return;
        }
    }
}
