package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.e50;
public final class v2 extends ShapeDrawable.ShaderFactory {
    public final e50 f35631a;

    public v2(e50 e50Var) {
        this.f35631a = e50Var;
    }

    @Override
    public final Shader resize(int i10, int i11) {
        e50 e50Var = this.f35631a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, e50Var.f25870a, e50Var.f25871b, Shader.TileMode.CLAMP);
    }
}
