package org.telegram.ui;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
public final class i50 extends org.telegram.ui.ActionBar.k5 {
    public LinearGradient J0;
    public int K0;
    public final Matrix L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public float Q0;
    public long R0;
    public final c60 S0;

    public i50(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.S0 = c60Var;
        this.L0 = new Matrix();
        this.M0 = -1.0f;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        int textWidth = getTextWidth();
        if (textWidth != this.K0) {
            float f10 = textWidth;
            this.Q0 = 1.3f * f10;
            float f11 = f10 * 2.0f;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20005ih, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20042kh, false);
            int i11 = org.telegram.ui.ActionBar.j6.f20023jh;
            this.J0 = new LinearGradient(0.0f, getTextHeight(), f11, 0.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.J0);
            this.K0 = textWidth;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i50.onDraw(android.graphics.Canvas):void");
    }
}
