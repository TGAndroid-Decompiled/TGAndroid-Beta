package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class w10 {
    public float f32091c;
    public float d;
    public float f32092e;
    public float f32093f;
    public RadialGradient f32094g;
    public final int f32095i;
    public int f32096j;
    public int f32097k;
    public int f32098l;
    public float f32089a = -1.0f;
    public float f32090b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f32099m = org.telegram.ui.ActionBar.j6.Xg;
    public final int f32100n = org.telegram.ui.ActionBar.j6.Yg;
    public final int f32101o = org.telegram.ui.ActionBar.j6.Zg;
    public final int f32102p = org.telegram.ui.ActionBar.j6.f20645ah;
    public final int f32103q = org.telegram.ui.ActionBar.j6.f20791ih;
    public final int f32104r = org.telegram.ui.ActionBar.j6.f20810jh;
    public final int f32105s = org.telegram.ui.ActionBar.j6.f20830kh;

    public w10(int i10) {
        this.f32095i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f32095i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f32099m, false);
            this.f32096j = w02;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, this.f32100n, false);
            this.f32097k = w03;
            this.f32094g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, this.f32101o, false);
            this.f32096j = w04;
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, this.f32102p, false);
            this.f32097k = w05;
            this.f32094g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.j6.w0(null, this.f32103q, false);
            this.f32096j = w06;
            int w07 = org.telegram.ui.ActionBar.j6.w0(null, this.f32105s, false);
            this.f32098l = w07;
            int w08 = org.telegram.ui.ActionBar.j6.w0(null, this.f32104r, false);
            this.f32097k = w08;
            this.f32094g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f32095i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f32096j, this.f32097k), this.f32098l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f32096j, this.f32097k));
            }
        } else {
            paint.setShader(this.f32094g);
        }
    }
}
