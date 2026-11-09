package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class a21 extends View {
    public final Paint f43573a;
    public int f43574b;
    public LinearGradient f43575c;
    public final c21 d;

    public a21(c21 c21Var, Context context) {
        super(context);
        this.d = c21Var;
        this.f43573a = new Paint(1);
        this.f43574b = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, c21Var.I0);
        this.f43575c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.l6.r1(0.0f, this.f43574b), this.f43574b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, this.d.I0);
        if (w02 != this.f43574b) {
            this.f43574b = w02;
            this.f43575c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.l6.r1(0.0f, w02), w02}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.f43575c;
        Paint paint = this.f43573a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
