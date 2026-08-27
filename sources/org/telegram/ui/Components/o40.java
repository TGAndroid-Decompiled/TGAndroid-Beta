package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;

public final class o40 extends p40 {

    public final int f31153g;
    public final int h;

    public o40() {
        super(R.raw.round_blur_stage_2_frag);
        this.f31153g = GLES20.glGetUniformLocation(this.f31497a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f31497a, "center");
    }
}
