package org.telegram.ui;

import org.telegram.ui.Components.SimpleFloatPropertyCompat;

public final class CodeNumberField$$ExternalSyntheticLambda3 implements SimpleFloatPropertyCompat.Getter {
    public static final CodeNumberField$$ExternalSyntheticLambda3 INSTANCE = new CodeNumberField$$ExternalSyntheticLambda3();

    private CodeNumberField$$ExternalSyntheticLambda3() {
    }

    @Override
    public final float get(Object obj) {
        float f;
        f = ((CodeNumberField) obj).errorProgress;
        return f;
    }
}
