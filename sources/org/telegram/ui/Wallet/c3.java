package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.v40;
public final class c3 extends ShapeDrawable.ShaderFactory {
    public final v40 f34071a;

    public c3(v40 v40Var) {
        this.f34071a = v40Var;
    }

    @Override
    public final Shader resize(int i10, int i11) {
        v40 v40Var = this.f34071a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, v40Var.f31147a, v40Var.f31148b, Shader.TileMode.CLAMP);
    }
}
