package org.telegram.ui;

import android.view.View;

public final class SecretVoicePlayer$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final SecretVoicePlayer f$0;

    public SecretVoicePlayer$$ExternalSyntheticLambda1(SecretVoicePlayer secretVoicePlayer, int i) {
        this.$r8$classId = i;
        this.f$0 = secretVoicePlayer;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$0(view);
                break;
            default:
                this.f$0.lambda$setCell$3(view);
                break;
        }
    }
}
