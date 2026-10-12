package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.g50;
public final class v2 extends ShapeDrawable.ShaderFactory {
    public final g50 f35441a;

    public v2(g50 g50Var) {
        this.f35441a = g50Var;
    }

    @Override
    public final Shader resize(int i10, int i11) {
        g50 g50Var = this.f35441a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, g50Var.f26289a, g50Var.f26290b, Shader.TileMode.CLAMP);
    }
}
