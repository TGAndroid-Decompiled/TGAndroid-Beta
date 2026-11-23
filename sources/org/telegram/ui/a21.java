package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class a21 extends View {
    public final Paint f45484a;
    public int f45485b;
    public LinearGradient f45486c;
    public final c21 d;

    public a21(c21 c21Var, Context context) {
        super(context);
        this.d = c21Var;
        this.f45484a = new Paint(1);
        this.f45485b = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, c21Var.J0);
        this.f45486c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, this.f45485b), this.f45485b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.d.J0);
        if (w02 != this.f45485b) {
            this.f45485b = w02;
            this.f45486c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, w02), w02}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.f45486c;
        Paint paint = this.f45484a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
