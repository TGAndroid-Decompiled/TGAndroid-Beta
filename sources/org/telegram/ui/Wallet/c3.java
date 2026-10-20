package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.v40;
public final class c3 extends ShapeDrawable.ShaderFactory {
    public final v40 f34070a;

    public c3(v40 v40Var) {
        this.f34070a = v40Var;
    }

    @Override
    public final Shader resize(int i10, int i11) {
        v40 v40Var = this.f34070a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, v40Var.f31146a, v40Var.f31147b, Shader.TileMode.CLAMP);
    }
}
