package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yc;
public final class w3 {
    public final RectF f19883a = new RectF();
    public final x3 f19884b;
    public final n3 f19885c;
    public final l3 d;
    public final Paint e;
    public final Matrix f19886f;
    public final float[] f19887g;
    public final float[] h;
    public float f19888i;
    public ValueAnimator f19889j;
    public final yc f19890k;
    public final Paint f19891l;
    public final RectF f19892m;
    public final Path f19893n;
    public final Paint f19894o;
    public final RadialGradient f19895p;
    public final Matrix f19896q;
    public final Paint f19897r;

    public w3(x3 x3Var, n3 n3Var, l3 l3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f19886f = new Matrix();
        this.f19887g = new float[8];
        this.h = new float[8];
        this.f19888i = 0.0f;
        this.f19891l = new Paint(1);
        this.f19892m = new RectF();
        this.f19893n = new Path();
        this.f19894o = new Paint(3);
        this.f19895p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f19896q = new Matrix();
        this.f19897r = new Paint(1);
        this.f19884b = x3Var;
        this.f19885c = n3Var;
        this.d = l3Var;
        this.f19890k = new yc(x3Var);
        paint.setColor(n3Var.f19675r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f19889j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19888i, f7);
        this.f19889j = ofFloat;
        ofFloat.addUpdateListener(new w0(this, 5));
        this.f19889j.addListener(new z0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            AndroidUtilities.applySpring(this.f19889j, 285.0d, 20.0d);
        } else {
            this.f19889j.setInterpolator(qr.h);
        }
        this.f19889j.start();
    }
}
