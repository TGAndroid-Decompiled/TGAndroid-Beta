package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class bf implements Utilities.Callback2 {
    public final int f32111a;
    public final bo f32112b;

    public bf(bo boVar, int i10) {
        this.f32111a = i10;
        this.f32112b = boVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f32111a) {
            case 0:
                bo.g1(this.f32112b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                bo.O0(this.f32112b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                bo boVar = this.f32112b;
                fh.b bVar = boVar.f32535z8;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, boVar.fragmentView);
                boVar.A8.d();
                return;
            default:
                bo boVar2 = this.f32112b;
                boVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                boVar2.D8 = paint;
                Bitmap bitmap2 = boVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                boVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                boVar2.E8 = new Matrix();
                fh.b bVar2 = boVar2.f32535z8;
                bVar2.a((Bitmap) obj2);
                gh.d.c(bVar2, boVar2.fragmentView);
                boVar2.A8.d();
                return;
        }
    }
}
