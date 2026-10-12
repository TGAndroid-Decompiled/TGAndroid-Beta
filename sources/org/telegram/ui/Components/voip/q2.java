package org.telegram.ui.Components.voip;

import android.content.Context;
import org.webrtc.TextureViewRenderer;
public final class q2 extends TextureViewRenderer {
    public final r2 f30413a;

    public q2(r2 r2Var, Context context) {
        super(context);
        this.f30413a = r2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.f30413a.b();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }
}
