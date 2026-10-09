package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class q50 extends s50 {
    public final int f30053g;

    public q50() {
        super(R.raw.round_blur_stage_1_frag);
        this.f30053g = GLES20.glGetUniformLocation(this.f30660a, "texOffset");
    }
}
