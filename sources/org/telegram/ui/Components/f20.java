package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.LiteMode;
public final class f20 {
    public float f22811c;
    public float d;
    public float e;
    public float f22812f;
    public RadialGradient f22813g;
    public final int f22814i;
    public int f22815j;
    public int f22816k;
    public int f22817l;
    public float f22809a = -1.0f;
    public float f22810b = -1.0f;
    public final Matrix h = new Matrix();
    public final int f22818m = org.telegram.ui.ActionBar.j6.Xg;
    public final int f22819n = org.telegram.ui.ActionBar.j6.Yg;
    public final int f22820o = org.telegram.ui.ActionBar.j6.Zg;
    public final int f22821p = org.telegram.ui.ActionBar.j6.f17882ah;
    public final int f22822q = org.telegram.ui.ActionBar.j6.f18027ih;
    public final int f22823r = org.telegram.ui.ActionBar.j6.f18046jh;
    public final int f22824s = org.telegram.ui.ActionBar.j6.f18066kh;

    public f20(int i10) {
        this.f22814i = i10;
        a();
    }

    public final void a() {
        int i10 = this.f22814i;
        if (i10 == 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f22818m, false);
            this.f22815j = w02;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, this.f22819n, false);
            this.f22816k = w03;
            this.f22813g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w02, w03}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 1) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, this.f22820o, false);
            this.f22815j = w04;
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, this.f22821p, false);
            this.f22816k = w05;
            this.f22813g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w04, w05}, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i10 == 3) {
            int w06 = org.telegram.ui.ActionBar.j6.w0(null, this.f22822q, false);
            this.f22815j = w06;
            int w07 = org.telegram.ui.ActionBar.j6.w0(null, this.f22824s, false);
            this.f22817l = w07;
            int w08 = org.telegram.ui.ActionBar.j6.w0(null, this.f22823r, false);
            this.f22816k = w08;
            this.f22813g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w06, w07, w08}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i10 = this.f22814i;
        if (i10 != 0 && i10 != 1 && i10 != 3) {
            paint.setShader(null);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17901bh, false));
        } else if (!LiteMode.isEnabled(512)) {
            paint.setShader(null);
            if (i10 == 3) {
                paint.setColor(i0.a.d(0.5f, i0.a.d(0.5f, this.f22815j, this.f22816k), this.f22817l));
            } else {
                paint.setColor(i0.a.d(0.5f, this.f22815j, this.f22816k));
            }
        } else {
            paint.setShader(this.f22813g);
        }
    }
}
