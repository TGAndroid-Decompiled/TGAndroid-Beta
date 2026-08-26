package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class PassportActivity$PhoneConfirmationView$$ExternalSyntheticLambda2 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final PassportActivity.PhoneConfirmationView f$0;

    public PassportActivity$PhoneConfirmationView$$ExternalSyntheticLambda2(PassportActivity.PhoneConfirmationView phoneConfirmationView, int i) {
        this.$r8$classId = i;
        this.f$0 = phoneConfirmationView;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                PassportActivity.PhoneConfirmationView phoneConfirmationView = this.f$0;
                phoneConfirmationView.onBackPressed(true);
                PassportActivity.this.setPage(0, true, null);
                break;
            default:
                PassportActivity.PhoneConfirmationView phoneConfirmationView2 = this.f$0;
                phoneConfirmationView2.onBackPressed(true);
                PassportActivity.this.finishFragment();
                break;
        }
    }
}
