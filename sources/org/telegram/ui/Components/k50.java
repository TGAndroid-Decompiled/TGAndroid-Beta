package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class k50 extends m50 {
    public final int f29809g;

    public k50() {
        super(R.raw.round_blur_stage_1_frag);
        this.f29809g = GLES20.glGetUniformLocation(this.f30393a, "texOffset");
    }
}
