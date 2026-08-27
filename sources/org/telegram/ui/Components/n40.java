package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;

public final class n40 extends p40 {

    public final int f30836g;

    public n40() {
        super(R.raw.round_blur_stage_1_frag);
        this.f30836g = GLES20.glGetUniformLocation(this.f31497a, "texOffset");
    }
}
