package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pc;
public final class u3 {
    public final RectF f23816a = new RectF();
    public final v3 f23817b;
    public final l3 f23818c;
    public final j3 d;
    public final Paint f23819e;
    public final Matrix f23820f;
    public final float[] f23821g;
    public final float[] h;
    public float f23822i;
    public ValueAnimator f23823j;
    public final pc f23824k;
    public final Paint f23825l;
    public final RectF f23826m;
    public final Path f23827n;
    public final Paint f23828o;
    public final RadialGradient f23829p;
    public final Matrix f23830q;
    public final Paint f23831r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.f23819e = paint;
        this.f23820f = new Matrix();
        this.f23821g = new float[8];
        this.h = new float[8];
        this.f23822i = 0.0f;
        this.f23825l = new Paint(1);
        this.f23826m = new RectF();
        this.f23827n = new Path();
        this.f23828o = new Paint(3);
        this.f23829p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f23830q = new Matrix();
        this.f23831r = new Paint(1);
        this.f23817b = v3Var;
        this.f23818c = l3Var;
        this.d = j3Var;
        this.f23824k = new pc(v3Var);
        paint.setColor(l3Var.f23632p);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f23823j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f23822i, f10);
        this.f23823j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.f23823j.addListener(new a1(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            AndroidUtilities.applySpring(this.f23823j, 285.0d, 20.0d);
        } else {
            this.f23823j.setInterpolator(gr.h);
        }
        this.f23823j.start();
    }
}
