package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.e50;
public final class u2 extends ShapeDrawable.ShaderFactory {
    public final e50 f35601a;

    public u2(e50 e50Var) {
        this.f35601a = e50Var;
    }

    @Override
    public final Shader resize(int i10, int i11) {
        e50 e50Var = this.f35601a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, e50Var.f25919a, e50Var.f25920b, Shader.TileMode.CLAMP);
    }
}
