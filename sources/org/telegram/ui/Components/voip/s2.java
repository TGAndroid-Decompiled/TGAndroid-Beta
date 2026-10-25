package org.telegram.ui.Components.voip;

import android.content.Context;
import org.webrtc.TextureViewRenderer;
public final class s2 extends TextureViewRenderer {
    public final t2 f34070a;

    public s2(t2 t2Var, Context context) {
        super(context);
        this.f34070a = t2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.f34070a.b();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }
}
