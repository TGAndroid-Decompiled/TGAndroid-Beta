package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class bf implements Utilities.Callback2 {
    public final int f36293a;
    public final zn f36294b;

    public bf(zn znVar, int i10) {
        this.f36293a = i10;
        this.f36294b = znVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f36293a) {
            case 0:
                zn.z1(this.f36294b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                zn.p1(this.f36294b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                zn znVar = this.f36294b;
                fh.b bVar = znVar.f45022z8;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, znVar.fragmentView);
                znVar.A8.d();
                return;
            default:
                zn znVar2 = this.f36294b;
                znVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                znVar2.D8 = paint;
                Bitmap bitmap2 = znVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                znVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                znVar2.E8 = new Matrix();
                fh.b bVar2 = znVar2.f45022z8;
                bVar2.a((Bitmap) obj2);
                gh.d.c(bVar2, znVar2.fragmentView);
                znVar2.A8.d();
                return;
        }
    }
}
