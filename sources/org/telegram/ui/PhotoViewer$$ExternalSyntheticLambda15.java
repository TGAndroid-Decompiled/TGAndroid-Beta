package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.Paint.Views.MaskPaintView;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public final class PhotoViewer$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PhotoViewer$$ExternalSyntheticLambda15(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer) this.f$0).lambda$closePhoto$144((MaskPaintView) this.f$1);
                break;
            case 1:
                ((LoginActivity.LoginActivityPasswordView) this.f$0).lambda$onNextPressed$12((String) this.f$1);
                break;
            case 2:
                ((LoginActivity.LoginActivityPasswordView) this.f$0).lambda$onNextPressed$9((TLRPC.TL_auth_authorization) this.f$1);
                break;
            case 3:
                ((LoginActivity.LoginActivityRegisterView) this.f$0).lambda$onNextPressed$16((TLRPC.FileLocation) this.f$1);
                break;
            case 4:
                ((LoginActivity.LoginActivityRegisterView) this.f$0).lambda$onNextPressed$17((TLRPC.TL_auth_authorization) this.f$1);
                break;
            case 5:
                ((LoginActivity.LoginActivityResetWaitView) this.f$0).lambda$new$0((TLRPC.TL_error) this.f$1);
                break;
            case 6:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$onNextPressed$27((Activity) this.f$1);
                break;
            case 7:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$new$3((TLRPC.TL_error) this.f$1);
                break;
            case 8:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$onNextPressed$31((TLObject) this.f$1);
                break;
            case 9:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$animateSuccess$39((Runnable) this.f$1);
                break;
            case 10:
                ((Utilities.Callback) this.f$0).run((String) this.f$1);
                break;
            case 11:
                ((LoginActivity.PhoneView) this.f$0).lambda$fillNumber$24((ArrayList) this.f$1);
                break;
            case 12:
                ((ManageLinksActivity) this.f$0).lambda$createView$6((TLRPC.TL_error) this.f$1);
                break;
            case 13:
                ((MessageSendPreview) this.f$0).lambda$new$1((View) this.f$1);
                break;
            case 14:
                ((MessageSendPreview) this.f$0).lambda$new$2((EditText) this.f$1);
                break;
            case 15:
                ((MessageStatisticActivity) this.f$0).lambda$loadStat$8((TL_stats.TL_statsGraphError) this.f$1);
                break;
            case 16:
                ((NewContactBottomSheet) this.f$0).lambda$updatedPhone$14((String) this.f$1);
                break;
            case 17:
                ((NewContactBottomSheet) this.f$0).lambda$updatedPhone$15((TLRPC.User) this.f$1);
                break;
            case 18:
                ((NotificationsCustomSettingsActivity) this.f$0).lambda$loadExceptions$20((ArrayList) this.f$1);
                break;
            case 19:
                ((PasscodeActivity) this.f$0).lambda$animateSuccessAnimation$15((Runnable) this.f$1);
                break;
            case 20:
                ((PasskeysActivity) this.f$0).added((TL_account.Passkey) this.f$1);
                break;
            case 21:
                ((PassportActivity) this.f$0).lambda$createRequestInterface$14((TLRPC.TL_error) this.f$1);
                break;
            case 22:
                ((PassportActivity) this.f$0).lambda$processSelectedFiles$71((MrzRecognizer.Result) this.f$1);
                break;
            case 23:
                ((PassportActivity) this.f$0).lambda$loadPasswordInfo$3((TLObject) this.f$1);
                break;
            case 24:
                ((PaymentFormActivity) this.f$0).lambda$sendForm$53((TLRPC.TL_payments_validatedRequestedInfo) this.f$1);
                break;
            case 25:
                ((PaymentFormActivity) this.f$0).lambda$sendData$60((TLRPC.Message[]) this.f$1);
                break;
            case 26:
                ((PaymentFormActivity) this.f$0).lambda$sendSavePassword$41((TLRPC.TL_error) this.f$1);
                break;
            case 27:
                ((PaymentFormActivity) this.f$0).lambda$createView$21((View) this.f$1);
                break;
            case 28:
                ((PhotoViewer) this.f$0).lambda$openAdsMenu$165((DarkThemeResourceProvider) this.f$1);
                break;
            default:
                ((PhotoViewer$$ExternalSyntheticLambda183) this.f$0).run((Bitmap) this.f$1);
                break;
        }
    }
}
