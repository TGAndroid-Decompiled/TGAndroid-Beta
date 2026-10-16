package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
public final class l4 extends ShapeDrawable.ShaderFactory {
    @Override
    public final Shader resize(int i10, int i11) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, -765355, -2148011, Shader.TileMode.CLAMP);
    }
}
