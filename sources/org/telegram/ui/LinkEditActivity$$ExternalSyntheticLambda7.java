package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;

public final class LinkEditActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final LinkEditActivity f$0;

    public LinkEditActivity$$ExternalSyntheticLambda7(LinkEditActivity linkEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = linkEditActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Browser.openUrl(this.f$0.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
            case 1:
                LinkEditActivity linkEditActivity = this.f$0;
                linkEditActivity.subEditPriceCell.editText.requestFocus();
                AndroidUtilities.showKeyboard(linkEditActivity.subEditPriceCell.editText);
                break;
            default:
                LinkEditActivity linkEditActivity2 = this.f$0;
                linkEditActivity2.subEditPriceCell.editText.clearFocus();
                AndroidUtilities.hideKeyboard(linkEditActivity2.subEditPriceCell.editText);
                break;
        }
    }
}
