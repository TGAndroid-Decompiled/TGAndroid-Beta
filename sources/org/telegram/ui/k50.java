package org.telegram.ui;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
public final class k50 extends org.telegram.ui.ActionBar.i5 {
    public LinearGradient M0;
    public int N0;
    public final Matrix O0;
    public float P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public long U0;
    public final f60 V0;

    public k50(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V0 = f60Var;
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
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18888ih, false);
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18927kh, false);
            int i11 = org.telegram.ui.ActionBar.h6.f18907jh;
            this.M0 = new LinearGradient(0.0f, getTextHeight(), f10, 0.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.h6.w0(null, i11, false), org.telegram.ui.ActionBar.h6.w0(null, i11, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.M0);
            this.N0 = textWidth;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k50.onDraw(android.graphics.Canvas):void");
    }
}
