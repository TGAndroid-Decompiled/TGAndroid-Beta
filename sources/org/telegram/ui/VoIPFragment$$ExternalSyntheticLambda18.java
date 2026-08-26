package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

public final class VoIPFragment$$ExternalSyntheticLambda18 implements View.OnClickListener {
    public final int $r8$classId;
    public final VoIPFragment f$0;
    public final VoIPService f$1;

    public VoIPFragment$$ExternalSyntheticLambda18(VoIPFragment voIPFragment, VoIPService voIPService, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPFragment;
        this.f$1 = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateViewState$25(this.f$1, view);
                break;
            default:
                this.f$0.lambda$updateViewState$22(this.f$1, view);
                break;
        }
    }
}
