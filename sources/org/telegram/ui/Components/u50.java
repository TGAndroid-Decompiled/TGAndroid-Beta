package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class u50 extends v50 {
    public final int f31055g;
    public final int h;

    public u50() {
        super(R.raw.round_blur_stage_2_frag);
        this.f31055g = GLES20.glGetUniformLocation(this.f31399a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f31399a, "center");
    }
}
