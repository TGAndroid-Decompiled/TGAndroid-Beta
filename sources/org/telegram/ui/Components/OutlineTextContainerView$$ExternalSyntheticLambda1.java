package org.telegram.ui.Components;

import org.telegram.ui.Components.SimpleFloatPropertyCompat;
public final class OutlineTextContainerView$$ExternalSyntheticLambda1 implements SimpleFloatPropertyCompat.Getter {
    public static final OutlineTextContainerView$$ExternalSyntheticLambda1 INSTANCE = new OutlineTextContainerView$$ExternalSyntheticLambda1();

    private OutlineTextContainerView$$ExternalSyntheticLambda1() {
    }

    @Override
    public final float get(Object obj) {
        float f;
        f = ((OutlineTextContainerView) obj).errorProgress;
        return f;
    }
}
