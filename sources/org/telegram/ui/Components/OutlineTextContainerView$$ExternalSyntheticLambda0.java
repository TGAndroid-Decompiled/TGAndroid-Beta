package org.telegram.ui.Components;

import org.telegram.ui.Components.SimpleFloatPropertyCompat;

public final class OutlineTextContainerView$$ExternalSyntheticLambda0 implements SimpleFloatPropertyCompat.Getter {
    public static final OutlineTextContainerView$$ExternalSyntheticLambda0 INSTANCE = new OutlineTextContainerView$$ExternalSyntheticLambda0();

    private OutlineTextContainerView$$ExternalSyntheticLambda0() {
    }

    @Override
    public final float get(Object obj) {
        float f;
        f = ((OutlineTextContainerView) obj).selectionProgress;
        return f;
    }
}
