package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rc;
public final class v3 {
    public final RectF f20591a = new RectF();
    public final w3 f20592b;
    public final m3 f20593c;
    public final k3 d;
    public final Paint e;
    public final Matrix f20594f;
    public final float[] f20595g;
    public final float[] h;
    public float f20596i;
    public ValueAnimator f20597j;
    public final rc f20598k;
    public final Paint f20599l;
    public final RectF f20600m;
    public final Path f20601n;
    public final Paint f20602o;
    public final RadialGradient f20603p;
    public final Matrix f20604q;
    public final Paint f20605r;

    public v3(w3 w3Var, m3 m3Var, k3 k3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f20594f = new Matrix();
        this.f20595g = new float[8];
        this.h = new float[8];
        this.f20596i = 0.0f;
        this.f20599l = new Paint(1);
        this.f20600m = new RectF();
        this.f20601n = new Path();
        this.f20602o = new Paint(3);
        this.f20603p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f20604q = new Matrix();
        this.f20605r = new Paint(1);
        this.f20592b = w3Var;
        this.f20593c = m3Var;
        this.d = k3Var;
        this.f20598k = new rc(w3Var);
        paint.setColor(m3Var.f20437r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f20597j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f20596i, f10);
        this.f20597j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.f20597j.addListener(new a1(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            AndroidUtilities.applySpring(this.f20597j, 285.0d, 20.0d);
        } else {
            this.f20597j.setInterpolator(mr.h);
        }
        this.f20597j.start();
    }
}
