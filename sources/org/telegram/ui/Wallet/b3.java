package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.x40;
public final class b3 extends ShapeDrawable.ShaderFactory {
    public final x40 f36387a;

    public b3(x40 x40Var) {
        this.f36387a = x40Var;
    }

    @Override
    public final Shader resize(int i10, int i11) {
        x40 x40Var = this.f36387a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, x40Var.f34618a, x40Var.f34619b, Shader.TileMode.CLAMP);
    }
}
