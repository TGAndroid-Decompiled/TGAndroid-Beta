package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class VoIPHelper$$ExternalSyntheticLambda6 implements DialogInterface.OnClickListener {
    public static final VoIPHelper$$ExternalSyntheticLambda6 INSTANCE = new VoIPHelper$$ExternalSyntheticLambda6();

    private VoIPHelper$$ExternalSyntheticLambda6() {
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        VoIPHelper.lambda$showRateAlert$11(dialogInterface, i);
    }
}
