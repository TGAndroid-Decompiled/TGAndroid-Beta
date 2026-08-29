package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class pe implements Utilities.Callback2 {
    public final int f41383a;
    public final tn f41384b;

    public pe(tn tnVar, int i10) {
        this.f41383a = i10;
        this.f41384b = tnVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f41383a) {
            case 0:
                tn.g1(this.f41384b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                tn.O0(this.f41384b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                tn tnVar = this.f41384b;
                qg.b bVar = tnVar.f43007v8;
                bVar.a((Bitmap) obj2);
                rg.c.c(bVar, tnVar.fragmentView);
                tnVar.f43021w8.d();
                return;
            default:
                tn tnVar2 = this.f41384b;
                tnVar2.f43034x8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                tnVar2.f43058z8 = paint;
                Bitmap bitmap2 = tnVar2.f43034x8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                tnVar2.y8 = bitmapShader;
                paint.setShader(bitmapShader);
                tnVar2.A8 = new Matrix();
                qg.b bVar2 = tnVar2.f43007v8;
                bVar2.a((Bitmap) obj2);
                rg.c.c(bVar2, tnVar2.fragmentView);
                tnVar2.f43021w8.d();
                return;
        }
    }
}
