package org.telegram.ui;

import org.telegram.ui.Components.SimpleFloatPropertyCompat;
public final class CodeNumberField$$ExternalSyntheticLambda2 implements SimpleFloatPropertyCompat.Getter {
    public static final CodeNumberField$$ExternalSyntheticLambda2 INSTANCE = new CodeNumberField$$ExternalSyntheticLambda2();

    private CodeNumberField$$ExternalSyntheticLambda2() {
    }

    @Override
    public final float get(Object obj) {
        float f;
        f = ((CodeNumberField) obj).successProgress;
        return f;
    }
}
