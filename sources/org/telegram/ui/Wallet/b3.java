package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.t40;
public final class b3 extends ShapeDrawable.ShaderFactory {
    public final t40 f34329a;

    public b3(t40 t40Var) {
        this.f34329a = t40Var;
    }

    @Override
    public final Shader resize(int i10, int i11) {
        t40 t40Var = this.f34329a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, t40Var.f30720a, t40Var.f30721b, Shader.TileMode.CLAMP);
    }
}
