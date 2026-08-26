package org.telegram.ui.Components;

import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda57;

public final class EditTextCaption$$ExternalSyntheticLambda2 implements AlertDialog.OnButtonClickListener {
    public final Object f$0;
    public final int f$1;
    public final int f$2;

    public EditTextCaption$$ExternalSyntheticLambda2(int i, int i2, BaseFragment baseFragment) {
        this.f$1 = i;
        this.f$2 = i2;
        this.f$0 = baseFragment;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(-1, true, true);
        progressMakeButtonLoading.init();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f$1;
        int i2 = this.f$2;
        ConnectionsManager.getInstance(i2).sendRequestTyped(tL_resolveStarGiftOffer, new ArticleViewer$$ExternalSyntheticLambda57(i2, (BaseFragment) this.f$0, progressMakeButtonLoading, alertDialog));
    }

    public EditTextCaption$$ExternalSyntheticLambda2(EditTextCaption editTextCaption, int i, int i2) {
        this.f$0 = editTextCaption;
        this.f$1 = i;
        this.f$2 = i2;
    }
}
