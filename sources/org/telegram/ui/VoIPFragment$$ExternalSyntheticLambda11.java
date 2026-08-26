package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

public final class VoIPFragment$$ExternalSyntheticLambda11 implements View.OnClickListener {
    public final int $r8$classId;
    public final VoIPFragment f$0;
    public final VoIPService f$1;

    public VoIPFragment$$ExternalSyntheticLambda11(VoIPFragment voIPFragment, VoIPService voIPService, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPFragment;
        this.f$1 = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                VoIPFragment voIPFragment = this.f$0;
                AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda2(voIPFragment, 8));
                int i = voIPFragment.selectedRating;
                if (i > 0) {
                    this.f$1.sendCallRating(i);
                }
                break;
            default:
                VoIPFragment voIPFragment2 = this.f$0;
                AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda2(voIPFragment2, 11));
                int i2 = voIPFragment2.selectedRating;
                if (i2 > 0) {
                    this.f$1.sendCallRating(i2);
                }
                break;
        }
    }
}
