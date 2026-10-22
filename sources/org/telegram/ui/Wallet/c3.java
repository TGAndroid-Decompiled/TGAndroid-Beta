package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.v40;
public final class c3 extends ShapeDrawable.ShaderFactory {
    public final v40 f34074a;

    public c3(v40 v40Var) {
        this.f34074a = v40Var;
    }

    @Override
    public final Shader resize(int i10, int i11) {
        v40 v40Var = this.f34074a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, v40Var.f31150a, v40Var.f31151b, Shader.TileMode.CLAMP);
    }
}
