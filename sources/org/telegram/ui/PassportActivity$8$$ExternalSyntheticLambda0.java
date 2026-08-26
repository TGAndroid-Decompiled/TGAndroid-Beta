package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;

public final class PassportActivity$8$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final PassportActivity.AnonymousClass8 f$0;

    public PassportActivity$8$$ExternalSyntheticLambda0(PassportActivity.AnonymousClass8 anonymousClass8, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass8;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final PassportActivity.AnonymousClass8 anonymousClass8 = this.f$0;
                anonymousClass8.getClass();
                final int i = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                PassportActivity.AnonymousClass8 anonymousClass9 = anonymousClass8;
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    anonymousClass9.getClass();
                                    if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                        ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new PassportActivity$8$$ExternalSyntheticLambda0(anonymousClass9, 3), 8);
                                    }
                                }
                                anonymousClass9.getClass();
                                Utilities.globalQueue.postRunnable(new LinkManager$$ExternalSyntheticLambda21(anonymousClass9, anonymousClass9.val$x_bytes, anonymousClass9.val$textPassword, 28));
                                break;
                            default:
                                PassportActivity.AnonymousClass8 anonymousClass10 = anonymousClass8;
                                PassportActivity passportActivity = PassportActivity.this;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    ConnectionsManager.getInstance(((BaseFragment) passportActivity).currentAccount).sendRequest(new TL_account.getPassword(), new PassportActivity$8$$ExternalSyntheticLambda0(anonymousClass10, 4), 8);
                                } else {
                                    if (passportActivity.currentForm == null) {
                                        passportActivity.currentForm = new TL_account.authorizationForm();
                                    }
                                    anonymousClass10.openRequestInterface();
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new PassportActivity$8$$ExternalSyntheticLambda4(this.f$0, tLObject, tL_error));
                break;
            case 2:
                final PassportActivity.AnonymousClass8 anonymousClass9 = this.f$0;
                anonymousClass9.getClass();
                final int i2 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                PassportActivity.AnonymousClass8 anonymousClass10 = anonymousClass9;
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    anonymousClass10.getClass();
                                    if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                        ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new PassportActivity$8$$ExternalSyntheticLambda0(anonymousClass10, 3), 8);
                                    }
                                }
                                anonymousClass10.getClass();
                                Utilities.globalQueue.postRunnable(new LinkManager$$ExternalSyntheticLambda21(anonymousClass10, anonymousClass10.val$x_bytes, anonymousClass10.val$textPassword, 28));
                                break;
                            default:
                                PassportActivity.AnonymousClass8 anonymousClass11 = anonymousClass9;
                                PassportActivity passportActivity = PassportActivity.this;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    ConnectionsManager.getInstance(((BaseFragment) passportActivity).currentAccount).sendRequest(new TL_account.getPassword(), new PassportActivity$8$$ExternalSyntheticLambda0(anonymousClass11, 4), 8);
                                } else {
                                    if (passportActivity.currentForm == null) {
                                        passportActivity.currentForm = new TL_account.authorizationForm();
                                    }
                                    anonymousClass11.openRequestInterface();
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                PassportActivity.AnonymousClass8 anonymousClass10 = this.f$0;
                anonymousClass10.getClass();
                AndroidUtilities.runOnUIThread(new PassportActivity$8$$ExternalSyntheticLambda4(anonymousClass10, tL_error, tLObject, 0));
                break;
            default:
                PassportActivity.AnonymousClass8 anonymousClass11 = this.f$0;
                anonymousClass11.getClass();
                AndroidUtilities.runOnUIThread(new PassportActivity$8$$ExternalSyntheticLambda4(anonymousClass11, tL_error, tLObject, 2));
                break;
        }
    }
}
