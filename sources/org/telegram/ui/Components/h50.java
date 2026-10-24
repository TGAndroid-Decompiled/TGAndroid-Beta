package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class h50 extends i50 {
    public final int f26873g;
    public final int h;

    public h50() {
        super(R.raw.round_blur_stage_2_frag);
        this.f26873g = GLES20.glGetUniformLocation(this.f27294a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f27294a, "center");
    }
}
