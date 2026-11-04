package org.telegram.ui;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
public final class e30 extends org.telegram.ui.ActionBar.k5 {
    public LinearGradient N0;
    public int O0;
    public final Matrix P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public float U0;
    public long V0;
    public final x30 W0;

    public e30(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.W0 = x30Var;
        this.P0 = new Matrix();
        this.Q0 = -1.0f;
    }

    @Override
    public final void d(int i3) {
        super.d(i3);
        int textWidth = getTextWidth();
        if (textWidth != this.O0) {
            float f10 = textWidth;
            this.U0 = 1.3f * f10;
            float f11 = f10 * 2.0f;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wh, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false);
            int i10 = org.telegram.ui.ActionBar.k6.Xh;
            this.N0 = new LinearGradient(0.0f, getTextHeight(), f11, 0.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.N0);
            this.O0 = textWidth;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e30.onDraw(android.graphics.Canvas):void");
    }
}
