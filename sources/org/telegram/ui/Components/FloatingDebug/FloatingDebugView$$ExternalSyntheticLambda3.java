package org.telegram.ui.Components.FloatingDebug;

import android.view.View;
import com.google.android.exoplayer2.util.Consumer;

public final class FloatingDebugView$$ExternalSyntheticLambda3 implements Consumer {
    public static final FloatingDebugView$$ExternalSyntheticLambda3 INSTANCE = new FloatingDebugView$$ExternalSyntheticLambda3();

    private FloatingDebugView$$ExternalSyntheticLambda3() {
    }

    @Override
    public final void accept(Object obj) {
        ((View) obj).invalidate();
    }
}
