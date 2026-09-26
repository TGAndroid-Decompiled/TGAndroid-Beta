package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class z40 extends b50 {
    public final int f30781g;

    public z40() {
        super(R.raw.round_blur_stage_1_frag);
        this.f30781g = GLES20.glGetUniformLocation(this.f22866a, "texOffset");
    }
}
