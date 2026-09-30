package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class b50 extends d50 {
    public final int f22851g;

    public b50() {
        super(R.raw.round_blur_stage_1_frag);
        this.f22851g = GLES20.glGetUniformLocation(this.f23487a, "texOffset");
    }
}
