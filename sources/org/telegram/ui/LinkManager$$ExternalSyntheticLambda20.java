package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class LinkManager$$ExternalSyntheticLambda20 implements MessagesController.ErrorDelegate, AlertDialog.OnButtonClickListener, PaymentFormActivity.PaymentFormCallback {
    public final int $r8$classId;
    public final Runnable f$0;

    public LinkManager$$ExternalSyntheticLambda20(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 4:
                this.f$0.run();
                break;
            case 5:
                this.f$0.run();
                break;
            case 6:
                DialogsActivity.lambda$showSendToBotAlert$140(this.f$0, alertDialog, i);
                break;
            case 7:
                this.f$0.run();
                break;
            case 8:
                DialogsActivity.lambda$showSendToBotAlert$138(this.f$0, alertDialog, i);
                break;
            default:
                this.f$0.run();
                break;
        }
    }

    @Override
    public void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
        switch (this.$r8$classId) {
            case 0:
                LinkManager.lambda$handleInvoiceSlug$15(this.f$0, invoiceStatus);
                break;
            default:
                LaunchActivity.lambda$runLinkRequest$57(this.f$0, invoiceStatus);
                break;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 1:
                return DialogsActivity.AnonymousClass30.lambda$didFinishChatCreation$6(this.f$0, tL_error);
            case 2:
                return DialogsActivity.AnonymousClass30.lambda$didFinishChatCreation$8(this.f$0, tL_error);
            case 3:
                return DialogsActivity.AnonymousClass30.lambda$didFinishChatCreation$4(this.f$0, tL_error);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return DialogsActivity.lambda$createGroupForThis$72(this.f$0, tL_error);
            case 9:
                return DialogsActivity.lambda$didSelectResult$135(this.f$0, tL_error);
            case 10:
                return DialogsActivity.lambda$createGroupForThis$70(this.f$0, tL_error);
            case 11:
                return DialogsActivity.lambda$createGroupForThis$68(this.f$0, tL_error);
        }
    }
}
