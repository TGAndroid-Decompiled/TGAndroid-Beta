package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class b21 extends View {
    public final Paint f43903a;
    public int f43904b;
    public LinearGradient f43905c;
    public final d21 d;

    public b21(d21 d21Var, Context context) {
        super(context);
        this.d = d21Var;
        this.f43903a = new Paint(1);
        this.f43904b = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, d21Var.I0);
        this.f43905c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, this.f43904b), this.f43904b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.d.I0);
        if (w02 != this.f43904b) {
            this.f43904b = w02;
            this.f43905c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, w02), w02}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.f43905c;
        Paint paint = this.f43903a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
