package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class me implements org.telegram.messenger.v10 {
    public final int f47791a;
    public final an f47792b;

    public me(an anVar, int i7) {
        this.f47791a = i7;
        this.f47792b = anVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f47791a) {
            case 0:
                an.g1(this.f47792b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                an.t1(this.f47792b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                an anVar = this.f47792b;
                ri.b bVar = anVar.N8;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, anVar.fragmentView);
                anVar.O8.d();
                return;
            default:
                an anVar2 = this.f47792b;
                anVar2.P8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                anVar2.R8 = paint;
                Bitmap bitmap2 = anVar2.P8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                anVar2.Q8 = bitmapShader;
                paint.setShader(bitmapShader);
                anVar2.S8 = new Matrix();
                ri.b bVar2 = anVar2.N8;
                bVar2.a((Bitmap) obj2);
                ih.d.c(bVar2, anVar2.fragmentView);
                anVar2.O8.d();
                return;
        }
    }
}
