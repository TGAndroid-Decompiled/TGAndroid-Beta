package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.Shader;
public final class y5 {
    public final Path f35127a;
    public final LinearGradient f35128b;
    public final float f35129c;
    public final float d;
    public final float e;
    public final float f35130f;

    public y5(float f7, float f10, float f11, float f12, float f13, int i10, int i11) {
        Path path = new Path();
        this.f35127a = path;
        float f14 = 0.14999998f * f11;
        path.rewind();
        float f15 = f7 - f11;
        path.moveTo(f15, f10);
        float f16 = f7 - f14;
        float f17 = f10 - f14;
        path.lineTo(f16, f17);
        float f18 = f10 - f11;
        path.lineTo(f7, f18);
        float f19 = f7 + f14;
        path.lineTo(f19, f17);
        float f20 = f7 + f11;
        path.lineTo(f20, f10);
        float f21 = f14 + f10;
        path.lineTo(f19, f21);
        float f22 = f11 + f10;
        path.lineTo(f7, f22);
        path.lineTo(f16, f21);
        path.close();
        this.f35129c = f15 - 1.0f;
        this.d = f18 - 1.0f;
        this.e = f20 + 1.0f;
        this.f35130f = f22 + 1.0f;
        this.f35128b = new LinearGradient(f7 - f12, f10 - f13, f7 + f12, f10 + f13, i10, i11, Shader.TileMode.CLAMP);
    }
}
