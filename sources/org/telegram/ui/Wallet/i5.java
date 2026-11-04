package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
public final class i5 extends ShapeDrawable.ShaderFactory {
    @Override
    public final Shader resize(int i3, int i10) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, -765355, -2148011, Shader.TileMode.CLAMP);
    }
}
