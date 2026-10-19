package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class i50 extends k50 {
    public final int f27079g;

    public i50() {
        super(R.raw.round_blur_stage_1_frag);
        this.f27079g = GLES20.glGetUniformLocation(this.f27713a, "texOffset");
    }
}
