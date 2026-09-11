package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class af implements Utilities.Callback2 {
    public final int f34397a;
    public final co f34398b;

    public af(co coVar, int i10) {
        this.f34397a = i10;
        this.f34398b = coVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f34397a) {
            case 0:
                co.g1(this.f34398b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                co.O0(this.f34398b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                co coVar = this.f34398b;
                gh.b bVar = coVar.f35506z8;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, coVar.fragmentView);
                coVar.A8.d();
                return;
            default:
                co coVar2 = this.f34398b;
                coVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                coVar2.D8 = paint;
                Bitmap bitmap2 = coVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                coVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                coVar2.E8 = new Matrix();
                gh.b bVar2 = coVar2.f35506z8;
                bVar2.a((Bitmap) obj2);
                hh.d.c(bVar2, coVar2.fragmentView);
                coVar2.A8.d();
                return;
        }
    }
}
