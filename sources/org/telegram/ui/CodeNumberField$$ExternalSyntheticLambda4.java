package org.telegram.ui;

import org.telegram.ui.Components.SimpleFloatPropertyCompat;
public final class CodeNumberField$$ExternalSyntheticLambda4 implements SimpleFloatPropertyCompat.Getter {
    public static final CodeNumberField$$ExternalSyntheticLambda4 INSTANCE = new CodeNumberField$$ExternalSyntheticLambda4();

    private CodeNumberField$$ExternalSyntheticLambda4() {
    }

    @Override
    public final float get(Object obj) {
        float f;
        f = ((CodeNumberField) obj).focusedProgress;
        return f;
    }
}
