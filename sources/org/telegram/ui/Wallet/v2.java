package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.g50;
public final class v2 extends ShapeDrawable.ShaderFactory {
    public final g50 f35443a;

    public v2(g50 g50Var) {
        this.f35443a = g50Var;
    }

    @Override
    public final Shader resize(int i10, int i11) {
        g50 g50Var = this.f35443a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, g50Var.f26287a, g50Var.f26288b, Shader.TileMode.CLAMP);
    }
}
