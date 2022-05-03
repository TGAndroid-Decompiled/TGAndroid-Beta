package org.telegram.ui.Components;

import org.telegram.ui.Components.SimpleFloatPropertyCompat;

public final class PipVideoOverlay$$ExternalSyntheticLambda9 implements SimpleFloatPropertyCompat.Getter {
    public static final PipVideoOverlay$$ExternalSyntheticLambda9 INSTANCE = new PipVideoOverlay$$ExternalSyntheticLambda9();

    private PipVideoOverlay$$ExternalSyntheticLambda9() {
    }

    @Override
    public final float get(Object obj) {
        float f;
        f = ((PipVideoOverlay) obj).pipY;
        return f;
    }
}
