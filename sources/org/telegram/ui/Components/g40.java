package org.telegram.ui.Components;

import android.opengl.GLES20;
public final class g40 extends b4.b {
    public final int f26249g;
    public final int h;

    public g40() {
        super(2131624180);
        this.f26249g = GLES20.glGetUniformLocation(this.f2450a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f2450a, "center");
    }
}
