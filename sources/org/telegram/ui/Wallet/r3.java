package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.f30;
public final class r3 extends ShapeDrawable.ShaderFactory {
    public final f30 f44435a;

    public r3(f30 f30Var) {
        this.f44435a = f30Var;
    }

    @Override
    public final Shader resize(int i7, int i10) {
        f30 f30Var = this.f44435a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, f30Var.f34500a, f30Var.f34501b, Shader.TileMode.CLAMP);
    }
}
