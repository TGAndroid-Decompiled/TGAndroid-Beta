package org.telegram.ui;

import android.text.TextUtils;
import com.android.billingclient.api.ProductDetails;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda51;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class LaunchActivity$$ExternalSyntheticLambda101 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;
    public final Object f$8;

    public LaunchActivity$$ExternalSyntheticLambda101(Object obj, TLObject tLObject, Object obj2, Object obj3, int i, Object obj4, Object obj5, Serializable serializable, Object obj6, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = tLObject;
        this.f$2 = obj2;
        this.f$4 = obj3;
        this.f$3 = i;
        this.f$5 = obj4;
        this.f$6 = obj5;
        this.f$8 = serializable;
        this.f$7 = obj6;
    }

    @Override
    public final void run() {
        int i = this.f$3;
        Object obj = this.f$2;
        Object obj2 = this.f$5;
        Object obj3 = this.f$4;
        Object obj4 = this.f$7;
        Object obj5 = this.f$8;
        Object obj6 = this.f$6;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                launchActivity.getClass();
                TLObject tLObject = (TLObject) obj7;
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = (LaunchActivity$$ExternalSyntheticLambda13) obj3;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.currentAccount).putChats(tL_messages_chats.chats, false);
                        ((int[]) obj)[0] = launchActivity.runCommentRequest(this.f$3, launchActivity$$ExternalSyntheticLambda13, (Integer) obj2, (Integer) obj6, (Long) obj4, (Integer) obj5, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                    }
                }
                try {
                    launchActivity$$ExternalSyntheticLambda13.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                launchActivity.showAlertDialog(AlertsCreator.createNoAccessAlert(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                break;
            case 1:
                ((MessagesController) obj8).lambda$processLoadedDialogFilters$23((TLRPC.messages_Dialogs) obj7, (ArrayList) obj, (TLRPC.messages_Dialogs) obj3, this.f$3, (ArrayList) obj2, (ArrayList) obj6, (ArrayList) obj5, (Runnable) obj4);
                break;
            case 2:
                final String str = ((Object) ((EditTextCell) obj8).getText()) + "bot";
                int[] iArr = (int[]) obj;
                final String[] strArr = (String[]) obj7;
                final String[] strArr2 = (String[]) obj3;
                final ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) obj2;
                final TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) obj6;
                final int[] iArr2 = (int[]) obj4;
                final Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) obj5;
                if (str.length() < 4) {
                    if (iArr[0] >= 0) {
                        ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                        iArr[0] = -1;
                    }
                    strArr2[0] = null;
                    strArr[0] = null;
                    buttonWithCounterView.setLoading(false);
                    buttonWithCounterView.setEnabled(false);
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    textInfoPrivacyCell.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
                    int i2 = -iArr2[0];
                    iArr2[0] = i2;
                    AndroidUtilities.shakeViewSpring(textInfoPrivacyCell, i2);
                    break;
                } else if (str.length() > 32) {
                    if (iArr[0] >= 0) {
                        ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                        iArr[0] = -1;
                    }
                    strArr2[0] = null;
                    strArr[0] = null;
                    buttonWithCounterView.setLoading(false);
                    buttonWithCounterView.setEnabled(false);
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    textInfoPrivacyCell.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
                    int i3 = -iArr2[0];
                    iArr2[0] = i3;
                    AndroidUtilities.shakeViewSpring(textInfoPrivacyCell, i3);
                    break;
                } else if (!TextUtils.equals(strArr2[0], str)) {
                    strArr2[0] = str;
                    strArr[0] = null;
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.UsernameChecking));
                    textInfoPrivacyCell.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
                    TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                    checkusername.username = str;
                    buttonWithCounterView.setLoading(true);
                    iArr[0] = ConnectionsManager.getInstance(i).sendRequestTyped(checkusername, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj9, Object obj10) {
                            ButtonWithCounterView buttonWithCounterView2 = buttonWithCounterView;
                            buttonWithCounterView2.setLoading(false);
                            strArr2[0] = null;
                            boolean z = ((TLRPC.Bool) obj9) instanceof TLRPC.TL_boolTrue;
                            String[] strArr3 = strArr;
                            TextInfoPrivacyCell textInfoPrivacyCell2 = textInfoPrivacyCell;
                            Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                            if (z) {
                                String str2 = str;
                                strArr3[0] = str2;
                                buttonWithCounterView2.setEnabled(true);
                                textInfoPrivacyCell2.setText(LocaleController.formatString(R.string.UsernameAvailable, zzil.m("@", str2)));
                                textInfoPrivacyCell2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGreenText, resourcesProvider2));
                                return;
                            }
                            strArr3[0] = null;
                            buttonWithCounterView2.setEnabled(false);
                            textInfoPrivacyCell2.setText(LocaleController.getString(R.string.UsernameInUse));
                            textInfoPrivacyCell2.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider2));
                            int[] iArr3 = iArr2;
                            int i4 = -iArr3[0];
                            iArr3[0] = i4;
                            AndroidUtilities.shakeViewSpring(textInfoPrivacyCell2, i4);
                        }
                    });
                    break;
                }
                break;
            case 3:
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda14 = (LaunchActivity$$ExternalSyntheticLambda13) obj3;
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                launchActivity2.getClass();
                try {
                    launchActivity$$ExternalSyntheticLambda14.run();
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                TLObject tLObject2 = (TLObject) obj7;
                if (tLObject2 != null) {
                    TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj;
                    MessagesController.getInstance(i).putUsers(authorizationform.users, false);
                    TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj2;
                    launchActivity2.presentFragment(new PassportActivity(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, (String) obj6, (String) obj5, (String) obj4, authorizationform, (TL_account.Password) tLObject2));
                }
                break;
            case 4:
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) obj8;
                loginPayView.getClass();
                StringBuilder sb = new StringBuilder("LoginBilling canPurchaseStore returned ");
                TLObject tLObject3 = (TLObject) obj7;
                sb.append(tLObject3);
                sb.append(" ");
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                sb.append(tL_error);
                FileLog.d(sb.toString());
                if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                    boolean z = tLObject3 instanceof TLRPC.TL_boolFalse;
                    LoginActivity loginActivity = LoginActivity.this;
                    if (z) {
                        loginPayView.lastError = "RESPONSE_FALSE";
                        new BulletinFactory(loginActivity.slideViewsContainer, null).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
                    } else if (tL_error != null) {
                        loginPayView.lastError = tL_error.text;
                        new BulletinFactory(loginActivity.slideViewsContainer, null).showForError(false, tL_error);
                    }
                } else {
                    ButtonWithCounterView buttonWithCounterView2 = loginPayView.button;
                    buttonWithCounterView2.setText(LocaleController.formatString(R.string.SMSFeePurchaseTitle, ((ProductDetails.OneTimePurchaseOfferDetails) obj3).zza), false, true);
                    buttonWithCounterView2.setSubText(i == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i), false);
                    buttonWithCounterView2.setLoading(false);
                    buttonWithCounterView2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6(loginPayView, (ProductDetails) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj6, (String) obj5, (TLRPC.TL_payments_canPurchaseStore) obj4, 10));
                }
                break;
            default:
                StarsController starsController = (StarsController) obj8;
                starsController.getClass();
                ((boolean[]) obj7)[0] = true;
                starsController.payAfterConfirmed((MessageObject) obj, (TLRPC.InputInvoice) obj3, (TLRPC.TL_payments_paymentFormStars) obj2, new StarsController$$ExternalSyntheticLambda51(starsController, (boolean[]) obj6, this.f$3, (Utilities.Callback) obj5, (Utilities.Callback) obj4));
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda101(EditTextCell editTextCell, int[] iArr, int i, String[] strArr, String[] strArr2, ButtonWithCounterView buttonWithCounterView, TextInfoPrivacyCell textInfoPrivacyCell, Theme.ResourcesProvider resourcesProvider, int[] iArr2) {
        this.$r8$classId = 2;
        this.f$0 = editTextCell;
        this.f$2 = iArr;
        this.f$3 = i;
        this.f$1 = strArr;
        this.f$4 = strArr2;
        this.f$5 = buttonWithCounterView;
        this.f$6 = textInfoPrivacyCell;
        this.f$8 = resourcesProvider;
        this.f$7 = iArr2;
    }

    public LaunchActivity$$ExternalSyntheticLambda101(LaunchActivity launchActivity, TLObject tLObject, int[] iArr, int i, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, Integer num, Integer num2, Long l, Integer num3) {
        this.$r8$classId = 0;
        this.f$0 = launchActivity;
        this.f$1 = tLObject;
        this.f$2 = iArr;
        this.f$3 = i;
        this.f$4 = launchActivity$$ExternalSyntheticLambda13;
        this.f$5 = num;
        this.f$6 = num2;
        this.f$7 = l;
        this.f$8 = num3;
    }

    public LaunchActivity$$ExternalSyntheticLambda101(LaunchActivity launchActivity, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, TLObject tLObject, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.$r8$classId = 3;
        this.f$0 = launchActivity;
        this.f$4 = launchActivity$$ExternalSyntheticLambda13;
        this.f$1 = tLObject;
        this.f$3 = i;
        this.f$2 = authorizationform;
        this.f$5 = getauthorizationform;
        this.f$6 = str;
        this.f$8 = str2;
        this.f$7 = str3;
    }

    public LaunchActivity$$ExternalSyntheticLambda101(StarsController starsController, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i, Utilities.Callback callback, Utilities.Callback callback2) {
        this.$r8$classId = 5;
        this.f$0 = starsController;
        this.f$1 = zArr;
        this.f$2 = messageObject;
        this.f$4 = inputInvoice;
        this.f$5 = tL_payments_paymentFormStars;
        this.f$6 = zArr2;
        this.f$3 = i;
        this.f$8 = callback;
        this.f$7 = callback2;
    }
}
