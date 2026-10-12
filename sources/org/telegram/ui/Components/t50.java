package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class t50 extends v50 {
    public final int f30768g;

    public t50() {
        super(R.raw.round_blur_stage_1_frag);
        this.f30768g = GLES20.glGetUniformLocation(this.f31399a, "texOffset");
    }
}
