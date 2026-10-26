package org.telegram.ui;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
public final class a50 extends org.telegram.ui.ActionBar.b6 {
    public LinearGradient M0;
    public int N0;
    public final Matrix O0;
    public float P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public long U0;
    public final v50 V0;

    public a50(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V0 = v50Var;
        this.O0 = new Matrix();
        this.P0 = -1.0f;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        int textWidth = getTextWidth();
        if (textWidth != this.N0) {
            float f7 = textWidth;
            this.T0 = 1.3f * f7;
            float f10 = f7 * 2.0f;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23456ih, false);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23495kh, false);
            int i11 = org.telegram.ui.ActionBar.y6.f23475jh;
            this.M0 = new LinearGradient(0.0f, getTextHeight(), f10, 0.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.y6.x0(null, i11, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.M0);
            this.N0 = textWidth;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a50.onDraw(android.graphics.Canvas):void");
    }
}
