package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.z40;
public final class u2 extends ShapeDrawable.ShaderFactory {
    public final z40 f33472a;

    public u2(z40 z40Var) {
        this.f33472a = z40Var;
    }

    @Override
    public final Shader resize(int i10, int i11) {
        z40 z40Var = this.f33472a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, z40Var.f31455a, z40Var.f31456b, Shader.TileMode.CLAMP);
    }
}
