package org.telegram.p009ui;

import org.telegram.p009ui.Components.SimpleFloatPropertyCompat;

public final class CodeNumberField$$ExternalSyntheticLambda5 implements SimpleFloatPropertyCompat.Getter {
    public static final CodeNumberField$$ExternalSyntheticLambda5 INSTANCE = new CodeNumberField$$ExternalSyntheticLambda5();

    private CodeNumberField$$ExternalSyntheticLambda5() {
    }

    @Override
    public final float get(Object obj) {
        float f;
        f = ((CodeNumberField) obj).successScaleProgress;
        return f;
    }
}
