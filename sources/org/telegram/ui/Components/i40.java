package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class i40 extends k40 {
    public final int f29311g;

    public i40() {
        super(R.raw.round_blur_stage_1_frag);
        this.f29311g = GLES20.glGetUniformLocation(this.f29932a, "texOffset");
    }
}
