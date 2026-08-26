package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.AlertsCreator;

public final class PassportActivity$8$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final PassportActivity.AnonymousClass8 f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;

    public PassportActivity$8$$ExternalSyntheticLambda4(PassportActivity.AnonymousClass8 anonymousClass8, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.$r8$classId = 1;
        this.f$0 = anonymousClass8;
        this.f$2 = tLObject;
        this.f$1 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PassportActivity.AnonymousClass8 anonymousClass8 = this.f$0;
                anonymousClass8.getClass();
                if (this.f$1 == null) {
                    TL_account.Password password = (TL_account.Password) this.f$2;
                    PassportActivity.this.currentPassword = password;
                    TwoStepVerificationActivity.initPasswordNewAlgo(password);
                    anonymousClass8.resetSecret();
                }
                break;
            case 1:
                PassportActivity.AnonymousClass8 anonymousClass9 = this.f$0;
                anonymousClass9.getClass();
                TLObject tLObject = this.f$2;
                boolean z = tLObject instanceof Vector;
                PassportActivity passportActivity = PassportActivity.this;
                if (z) {
                    passportActivity.currentForm = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i = 0; i < size; i++) {
                        passportActivity.currentForm.values.add((TLRPC.TL_secureValue) vector.objects.get(i));
                    }
                    anonymousClass9.openRequestInterface();
                } else {
                    TLRPC.TL_error tL_error = this.f$1;
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        AlertsCreator.showUpdateAppAlert(passportActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        passportActivity.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
                    }
                    passportActivity.showEditDoneProgress$2(true, false);
                }
                break;
            default:
                PassportActivity.AnonymousClass8 anonymousClass10 = this.f$0;
                anonymousClass10.getClass();
                if (this.f$1 == null) {
                    TL_account.Password password2 = (TL_account.Password) this.f$2;
                    PassportActivity.this.currentPassword = password2;
                    TwoStepVerificationActivity.initPasswordNewAlgo(password2);
                    Utilities.globalQueue.postRunnable(new LinkManager$$ExternalSyntheticLambda21(anonymousClass10, anonymousClass10.val$x_bytes, anonymousClass10.val$textPassword, 28));
                }
                break;
        }
    }

    public PassportActivity$8$$ExternalSyntheticLambda4(PassportActivity.AnonymousClass8 anonymousClass8, TLRPC.TL_error tL_error, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass8;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
    }
}
