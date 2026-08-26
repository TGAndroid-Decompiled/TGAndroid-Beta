package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda8;

public final class TermsOfServiceView$$ExternalSyntheticLambda2 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final TermsOfServiceView f$0;

    public TermsOfServiceView$$ExternalSyntheticLambda2(TermsOfServiceView termsOfServiceView, int i) {
        this.$r8$classId = i;
        this.f$0 = termsOfServiceView;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.accept();
                break;
            case 1:
                TermsOfServiceView termsOfServiceView = this.f$0;
                AlertDialog.Builder builder = new AlertDialog.Builder(termsOfServiceView.getContext(), 0, null);
                String string = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                AlertDialog alertDialog2 = builder.alertDialog;
                alertDialog2.message = string;
                alertDialog2.title = LocaleController.getString(R.string.AppName);
                builder.setPositiveButton(LocaleController.getString(R.string.Deactivate), new TermsOfServiceView$$ExternalSyntheticLambda2(termsOfServiceView, 2));
                ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
                break;
            default:
                TermsOfServiceView termsOfServiceView2 = this.f$0;
                termsOfServiceView2.getClass();
                AlertDialog alertDialog3 = new AlertDialog(termsOfServiceView2.getContext(), 3, null);
                alertDialog3.canCacnel = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(termsOfServiceView2.currentAccount).sendRequest(deleteaccount, new LinkManager$$ExternalSyntheticLambda8(10, termsOfServiceView2, alertDialog3));
                alertDialog3.show();
                break;
        }
    }
}
