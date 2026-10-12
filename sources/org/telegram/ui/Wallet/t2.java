package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.z40;
public final class t2 extends ShapeDrawable.ShaderFactory {
    public final z40 f33698a;

    public t2(z40 z40Var) {
        this.f33698a = z40Var;
    }

    @Override
    public final Shader resize(int i10, int i11) {
        z40 z40Var = this.f33698a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, z40Var.f31762a, z40Var.f31763b, Shader.TileMode.CLAMP);
    }
}
