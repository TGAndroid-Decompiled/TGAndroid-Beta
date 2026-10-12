package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class hf implements Utilities.Callback2 {
    public final int f36776a;
    public final fo f36777b;

    public hf(fo foVar, int i10) {
        this.f36776a = i10;
        this.f36777b = foVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f36776a) {
            case 0:
                fo.z1(this.f36777b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                fo.p1(this.f36777b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                fo foVar = this.f36777b;
                gh.b bVar = foVar.f36193z8;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, foVar.fragmentView);
                foVar.A8.d();
                return;
            default:
                fo foVar2 = this.f36777b;
                foVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                foVar2.D8 = paint;
                Bitmap bitmap2 = foVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                foVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                foVar2.E8 = new Matrix();
                gh.b bVar2 = foVar2.f36193z8;
                bVar2.a((Bitmap) obj2);
                hh.d.c(bVar2, foVar2.fragmentView);
                foVar2.A8.d();
                return;
        }
    }
}
