package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class a3 extends VideoPlayerHolderBase {
    public final b3 f32435a;

    public a3(b3 b3Var) {
        this.f32435a = b3Var;
    }

    @Override
    public final boolean needRepeat() {
        return true;
    }

    @Override
    public final void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
        if (!this.firstFrameRendered) {
            this.firstFrameRendered = true;
            b3 b3Var = this.f32435a;
            b3Var.f32713n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = b3Var.I;
            if (pageblockvideo != null) {
                p70 p70Var = b3Var.f32709a;
                a0.h hVar = p70Var.f36989y;
                long j10 = pageblockvideo.video_id;
                c3 a2 = c3.a(p70Var.f36987w, b3Var);
                b3Var.c(a2);
                hVar.k(a2, j10);
            }
        }
    }
}
