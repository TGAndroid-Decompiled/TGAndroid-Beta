package org.telegram.p009ui.Components;

import android.view.View;

public final class PipVideoOverlay$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public static final PipVideoOverlay$$ExternalSyntheticLambda3 INSTANCE = new PipVideoOverlay$$ExternalSyntheticLambda3();

    private PipVideoOverlay$$ExternalSyntheticLambda3() {
    }

    @Override
    public final void onClick(View view) {
        PipVideoOverlay.dimissAndDestroy();
    }
}
