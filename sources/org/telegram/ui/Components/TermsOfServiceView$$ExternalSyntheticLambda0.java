package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.AlertDialog;

public final class TermsOfServiceView$$ExternalSyntheticLambda0 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final TermsOfServiceView f$0;

    public TermsOfServiceView$$ExternalSyntheticLambda0(TermsOfServiceView termsOfServiceView, int i) {
        this.$r8$classId = i;
        this.f$0 = termsOfServiceView;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$5(alertDialog, i);
                break;
            case 1:
                this.f$0.lambda$new$3(alertDialog, i);
                break;
            default:
                this.f$0.lambda$new$2(alertDialog, i);
                break;
        }
    }
}
