package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class cf implements Utilities.Callback2 {
    public final int f31653a;
    public final eo f31654b;

    public cf(eo eoVar, int i10) {
        this.f31653a = i10;
        this.f31654b = eoVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f31653a) {
            case 0:
                eo.g1(this.f31654b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                eo.O0(this.f31654b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                eo eoVar = this.f31654b;
                eh.b bVar = eoVar.f32575z8;
                bVar.a((Bitmap) obj2);
                fh.d.c(bVar, eoVar.fragmentView);
                eoVar.A8.d();
                return;
            default:
                eo eoVar2 = this.f31654b;
                eoVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                eoVar2.D8 = paint;
                Bitmap bitmap2 = eoVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                eoVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                eoVar2.E8 = new Matrix();
                eh.b bVar2 = eoVar2.f32575z8;
                bVar2.a((Bitmap) obj2);
                fh.d.c(bVar2, eoVar2.fragmentView);
                eoVar2.A8.d();
                return;
        }
    }
}
