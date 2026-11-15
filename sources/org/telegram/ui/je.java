package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class je implements org.telegram.messenger.s10 {
    public final int f48297a;
    public final an f48298b;

    public je(an anVar, int i7) {
        this.f48297a = i7;
        this.f48298b = anVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f48297a) {
            case 0:
                an.l1(this.f48298b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                an.x1(this.f48298b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                an anVar = this.f48298b;
                ui.b bVar = anVar.O8;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, anVar.fragmentView);
                anVar.P8.d();
                return;
            default:
                an anVar2 = this.f48298b;
                anVar2.Q8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                anVar2.S8 = paint;
                Bitmap bitmap2 = anVar2.Q8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                anVar2.R8 = bitmapShader;
                paint.setShader(bitmapShader);
                anVar2.T8 = new Matrix();
                ui.b bVar2 = anVar2.O8;
                bVar2.a((Bitmap) obj2);
                ih.d.c(bVar2, anVar2.fragmentView);
                anVar2.P8.d();
                return;
        }
    }
}
