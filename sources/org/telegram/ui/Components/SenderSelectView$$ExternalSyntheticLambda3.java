package org.telegram.ui.Components;

import org.telegram.ui.Components.SimpleFloatPropertyCompat;
public final class SenderSelectView$$ExternalSyntheticLambda3 implements SimpleFloatPropertyCompat.Getter {
    public static final SenderSelectView$$ExternalSyntheticLambda3 INSTANCE = new SenderSelectView$$ExternalSyntheticLambda3();

    private SenderSelectView$$ExternalSyntheticLambda3() {
    }

    @Override
    public final float get(Object obj) {
        float f;
        f = ((SenderSelectView) obj).menuProgress;
        return f;
    }
}
