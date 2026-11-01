package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class o31 extends View {
    public final Paint f40037a;
    public int f40038b;
    public LinearGradient f40039c;
    public final q31 d;

    public o31(q31 q31Var, Context context) {
        super(context);
        this.d = q31Var;
        this.f40037a = new Paint(1);
        this.f40038b = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, q31Var.I0);
        this.f40039c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(68.0f), new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, this.f40038b), this.f40038b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, this.d.I0);
        if (w02 != this.f40038b) {
            this.f40038b = w02;
            this.f40039c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(68.0f), new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, w02), w02}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.f40039c;
        Paint paint = this.f40037a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
