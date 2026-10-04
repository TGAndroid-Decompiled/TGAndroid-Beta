package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class cf implements Utilities.Callback2 {
    public final int f35451a;
    public final yn f35452b;

    public cf(yn ynVar, int i10) {
        this.f35451a = i10;
        this.f35452b = ynVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f35451a) {
            case 0:
                yn.U(this.f35452b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                yn.i1(this.f35452b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                yn ynVar = this.f35452b;
                fh.b bVar = ynVar.f43560x8;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, ynVar.fragmentView);
                ynVar.f43572y8.d();
                return;
            default:
                yn ynVar2 = this.f35452b;
                ynVar2.f43585z8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                ynVar2.B8 = paint;
                Bitmap bitmap2 = ynVar2.f43585z8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                ynVar2.A8 = bitmapShader;
                paint.setShader(bitmapShader);
                ynVar2.C8 = new Matrix();
                fh.b bVar2 = ynVar2.f43560x8;
                bVar2.a((Bitmap) obj2);
                gh.d.c(bVar2, ynVar2.fragmentView);
                ynVar2.f43572y8.d();
                return;
        }
    }
}
