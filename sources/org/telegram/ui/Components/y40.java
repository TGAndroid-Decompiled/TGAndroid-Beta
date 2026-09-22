package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class y40 extends a50 {
    public final int f30152g;

    public y40() {
        super(R.raw.round_blur_stage_1_frag);
        this.f30152g = GLES20.glGetUniformLocation(this.f22307a, "texOffset");
    }
}
