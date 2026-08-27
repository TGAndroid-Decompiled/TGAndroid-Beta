package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

public final class a3 extends VideoPlayerHolderBase {

    public final b3 f36357a;

    public a3(b3 b3Var) {
        this.f36357a = b3Var;
    }

    @Override
    public final boolean needRepeat() {
        return true;
    }

    @Override
    public final void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
        if (this.firstFrameRendered) {
            return;
        }
        this.firstFrameRendered = true;
        b3 b3Var = this.f36357a;
        b3Var.f36687n.setAlpha(1.0f);
        TL_iv.pageBlockVideo pageblockvideo = b3Var.H;
        if (pageblockvideo != null) {
            d70 d70Var = b3Var.f36682a;
            a0.h hVar = d70Var.f37294y;
            long j10 = pageblockvideo.video_id;
            c3 c3VarA = c3.a(d70Var.f37292w, b3Var);
            b3Var.c(c3VarA);
            hVar.k(c3VarA, j10);
        }
    }
}
