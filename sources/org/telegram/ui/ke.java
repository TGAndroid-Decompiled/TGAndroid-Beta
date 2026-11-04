package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class ke implements org.telegram.messenger.n10 {
    public final int f46914a;
    public final wm f46915b;

    public ke(wm wmVar, int i3) {
        this.f46914a = i3;
        this.f46915b = wmVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f46914a) {
            case 0:
                wm.g1(this.f46915b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                wm.t1(this.f46915b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                wm wmVar = this.f46915b;
                si.b bVar = wmVar.O8;
                bVar.a((Bitmap) obj2);
                jh.d.c(bVar, wmVar.fragmentView);
                wmVar.P8.d();
                return;
            default:
                wm wmVar2 = this.f46915b;
                wmVar2.Q8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                wmVar2.S8 = paint;
                Bitmap bitmap2 = wmVar2.Q8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                wmVar2.R8 = bitmapShader;
                paint.setShader(bitmapShader);
                wmVar2.T8 = new Matrix();
                si.b bVar2 = wmVar2.O8;
                bVar2.a((Bitmap) obj2);
                jh.d.c(bVar2, wmVar2.fragmentView);
                wmVar2.P8.d();
                return;
        }
    }
}
