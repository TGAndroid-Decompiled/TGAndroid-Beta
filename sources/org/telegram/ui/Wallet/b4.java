package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.n30;
public final class b4 extends ShapeDrawable.ShaderFactory {
    public final n30 f44098a;

    public b4(n30 n30Var) {
        this.f44098a = n30Var;
    }

    @Override
    public final Shader resize(int i7, int i10) {
        n30 n30Var = this.f44098a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, n30Var.f37639a, n30Var.f37640b, Shader.TileMode.CLAMP);
    }
}
