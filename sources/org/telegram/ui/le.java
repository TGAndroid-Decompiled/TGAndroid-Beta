package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class le implements org.telegram.messenger.r10 {
    public final int f49578a;
    public final bn f49579b;

    public le(bn bnVar, int i7) {
        this.f49578a = i7;
        this.f49579b = bnVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f49578a) {
            case 0:
                bn.l1(this.f49579b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                bn.x1(this.f49579b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                bn bnVar = this.f49579b;
                ui.b bVar = bnVar.P8;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, bnVar.fragmentView);
                bnVar.Q8.d();
                return;
            default:
                bn bnVar2 = this.f49579b;
                bnVar2.R8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                bnVar2.T8 = paint;
                Bitmap bitmap2 = bnVar2.R8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                bnVar2.S8 = bitmapShader;
                paint.setShader(bitmapShader);
                bnVar2.U8 = new Matrix();
                ui.b bVar2 = bnVar2.P8;
                bVar2.a((Bitmap) obj2);
                ih.d.c(bVar2, bnVar2.fragmentView);
                bnVar2.Q8.d();
                return;
        }
    }
}
