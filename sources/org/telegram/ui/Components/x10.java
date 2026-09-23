package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class x10 {
    public float f29856c;
    public float d;
    public float e;
    public float f29857f;
    public RadialGradient f29858g;
    public final int f29859i;
    public int f29860j;
    public int f29861k;
    public int f29862l;
    public float f29854a = -1.0f;
    public float f29855b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f29863m = org.telegram.ui.ActionBar.h6.Xg;
    public final int f29864n = org.telegram.ui.ActionBar.h6.Yg;
    public final int f29865o = org.telegram.ui.ActionBar.h6.Zg;
    public final int f29866p = org.telegram.ui.ActionBar.h6.f18743ah;
    public final int f29867q = org.telegram.ui.ActionBar.h6.f18888ih;
    public final int f29868r = org.telegram.ui.ActionBar.h6.f18907jh;
    public final int f29869s = org.telegram.ui.ActionBar.h6.f18927kh;

    public x10(int i10) {
        this.f29859i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f29859i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, this.f29863m, false);
            this.f29860j = w02;
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, this.f29864n, false);
            this.f29861k = w03;
            this.f29858g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.h6.w0(null, this.f29865o, false);
            this.f29860j = w04;
            int w05 = org.telegram.ui.ActionBar.h6.w0(null, this.f29866p, false);
            this.f29861k = w05;
            this.f29858g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.h6.w0(null, this.f29867q, false);
            this.f29860j = w06;
            int w07 = org.telegram.ui.ActionBar.h6.w0(null, this.f29869s, false);
            this.f29862l = w07;
            int w08 = org.telegram.ui.ActionBar.h6.w0(null, this.f29868r, false);
            this.f29861k = w08;
            this.f29858g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f29859i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18762bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f29860j, this.f29861k), this.f29862l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f29860j, this.f29861k));
            }
        } else {
            paint.setShader(this.f29858g);
        }
    }
}
