package org.telegram.ui;

import android.view.View;

public final class VoIPFragment$$ExternalSyntheticLambda28 implements View.OnClickListener {
    public final int $r8$classId;
    public final VoIPFragment f$0;

    public VoIPFragment$$ExternalSyntheticLambda28(VoIPFragment voIPFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPFragment;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateButtons$35(view);
                break;
            case 1:
                this.f$0.lambda$createView$6(view);
                break;
            case 2:
                this.f$0.lambda$createView$7(view);
                break;
            case 3:
                this.f$0.lambda$createView$8(view);
                break;
            case 4:
                this.f$0.lambda$createView$9(view);
                break;
            case 5:
                this.f$0.lambda$createView$10(view);
                break;
            default:
                this.f$0.lambda$createView$11(view);
                break;
        }
    }
}
