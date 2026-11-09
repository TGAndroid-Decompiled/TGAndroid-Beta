package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.d30;
public final class q3 extends ShapeDrawable.ShaderFactory {
    public final d30 f43010a;

    public q3(d30 d30Var) {
        this.f43010a = d30Var;
    }

    @Override
    public final Shader resize(int i7, int i10) {
        d30 d30Var = this.f43010a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, d30Var.f32856a, d30Var.f32857b, Shader.TileMode.CLAMP);
    }
}
