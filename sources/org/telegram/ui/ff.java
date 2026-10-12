package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class ff implements Utilities.Callback2 {
    public final int f37761a;
    public final eo f37762b;

    public ff(eo eoVar, int i10) {
        this.f37761a = i10;
        this.f37762b = eoVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f37761a) {
            case 0:
                eo.z1(this.f37762b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                eo.p1(this.f37762b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                eo eoVar = this.f37762b;
                fh.b bVar = eoVar.f37510z8;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, eoVar.fragmentView);
                eoVar.A8.d();
                return;
            default:
                eo eoVar2 = this.f37762b;
                eoVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                eoVar2.D8 = paint;
                Bitmap bitmap2 = eoVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                eoVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                eoVar2.E8 = new Matrix();
                fh.b bVar2 = eoVar2.f37510z8;
                bVar2.a((Bitmap) obj2);
                gh.d.c(bVar2, eoVar2.fragmentView);
                eoVar2.A8.d();
                return;
        }
    }
}
