package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.GenericProvider;
public final class CheckBoxBase$$ExternalSyntheticLambda0 implements GenericProvider {
    public static final CheckBoxBase$$ExternalSyntheticLambda0 INSTANCE = new CheckBoxBase$$ExternalSyntheticLambda0();

    private CheckBoxBase$$ExternalSyntheticLambda0() {
    }

    @Override
    public final Object provide(Object obj) {
        Paint paint;
        Void r1 = (Void) obj;
        paint = CheckBoxBase.paint;
        return paint;
    }
}
