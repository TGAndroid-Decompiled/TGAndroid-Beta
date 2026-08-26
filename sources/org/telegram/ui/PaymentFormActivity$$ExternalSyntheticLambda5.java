package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ExoplayerCuesDecoder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.internal.clearcut.zze;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.zzk;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.RadioCell;

public final class PaymentFormActivity$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final PaymentFormActivity f$0;

    public PaymentFormActivity$$ExternalSyntheticLambda5(PaymentFormActivity paymentFormActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = paymentFormActivity;
    }

    @Override
    public final void onClick(View view) {
        PaymentFormActivity paymentFormActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                paymentFormActivity.passwordOk = false;
                paymentFormActivity.goToNextStep();
                break;
            case 1:
                paymentFormActivity.inputFields[0].requestFocus();
                AndroidUtilities.showKeyboard(paymentFormActivity.inputFields[0]);
                break;
            case 2:
                if (paymentFormActivity.getParentActivity() != null) {
                    paymentFormActivity.showChoosePaymentMethod(null);
                    break;
                }
                break;
            case 3:
                paymentFormActivity.lambda$createView$17$1$2();
                break;
            case 4:
                paymentFormActivity.lambda$createView$18$4();
                break;
            case 5:
                paymentFormActivity.lambda$createView$19$1$1();
                break;
            case 6:
                paymentFormActivity.lambda$createView$20$1$2();
                break;
            case 7:
                if (!paymentFormActivity.donePressed) {
                    boolean z = !paymentFormActivity.recurrentAccepted;
                    paymentFormActivity.recurrentAccepted = z;
                    paymentFormActivity.recurrentAcceptCell.setChecked(z);
                    paymentFormActivity.bottomLayout.setChecked(paymentFormActivity.recurrentAccepted, true);
                    break;
                }
                break;
            case 8:
                boolean z2 = !paymentFormActivity.saveShippingInfo;
                paymentFormActivity.saveShippingInfo = z2;
                paymentFormActivity.checkCell1.setChecked(z2);
                break;
            case 9:
                boolean z3 = !paymentFormActivity.saveCardInfo;
                paymentFormActivity.saveCardInfo = z3;
                paymentFormActivity.checkCell1.setChecked(z3);
                break;
            case 10:
                boolean z4 = !paymentFormActivity.saveCardInfo;
                paymentFormActivity.saveCardInfo = z4;
                paymentFormActivity.checkCell1.setChecked(z4);
                break;
            case 11:
                paymentFormActivity.getClass();
                int iIntValue = ((Integer) view.getTag()).intValue();
                int i = 0;
                while (true) {
                    RadioCell[] radioCellArr = paymentFormActivity.radioCells;
                    if (i < radioCellArr.length) {
                        radioCellArr[i].radioButton.setChecked(iIntValue == i, true);
                        i++;
                    }
                    break;
                }
                break;
            case 12:
                paymentFormActivity.googlePayButton.setClickable(false);
                try {
                    JSONObject jSONObjectPut = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject baseCardPaymentMethod = PaymentFormActivity.getBaseCardPaymentMethod();
                    if (paymentFormActivity.googlePayPublicKey == null || paymentFormActivity.googlePayParameters != null) {
                        baseCardPaymentMethod.put("tokenizationSpecification", new PaymentFormActivity.AnonymousClass23(paymentFormActivity));
                    } else {
                        PaymentFormActivity.AnonymousClass23 anonymousClass23 = new PaymentFormActivity.AnonymousClass23();
                        anonymousClass23.put("type", "DIRECT");
                        PaymentFormActivity.AnonymousClass23 anonymousClass24 = new PaymentFormActivity.AnonymousClass23();
                        anonymousClass24.put("protocolVersion", "ECv2");
                        anonymousClass24.put("publicKey", paymentFormActivity.googlePayPublicKey);
                        anonymousClass23.put("parameters", anonymousClass24);
                        baseCardPaymentMethod.put("tokenizationSpecification", anonymousClass23);
                    }
                    jSONObjectPut.put("allowedPaymentMethods", new JSONArray().put(baseCardPaymentMethod));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(paymentFormActivity.paymentForm.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = paymentFormActivity.shippingOption;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j = 0;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        j += ((TLRPC.TL_labeledPrice) arrayList.get(i2)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j, paymentFormActivity.paymentForm.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(paymentFormActivity.googlePayCountryCode)) {
                        jSONObject.put("countryCode", paymentFormActivity.googlePayCountryCode);
                    }
                    jSONObject.put("currencyCode", paymentFormActivity.paymentForm.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    jSONObjectPut.put("transactionInfo", jSONObject);
                    jSONObjectPut.put("merchantInfo", new JSONObject().put("merchantName", paymentFormActivity.currentBotName));
                    String string = jSONObjectPut.toString();
                    PaymentDataRequest paymentDataRequest = new PaymentDataRequest();
                    paymentDataRequest.zzi = true;
                    zzah.checkNotNull(string, "paymentDataRequestJson cannot be null!");
                    paymentDataRequest.zzj = string;
                    zze zzeVar = paymentFormActivity.paymentsClient;
                    zzeVar.getClass();
                    ExoplayerCuesDecoder exoplayerCuesDecoderBuilder = TaskApiCall.builder();
                    exoplayerCuesDecoderBuilder.inputBuffer = new PhotoViewer.AnonymousClass18(paymentDataRequest, 3);
                    exoplayerCuesDecoderBuilder.availableOutputBuffers = new Feature[]{zzk.zzc};
                    exoplayerCuesDecoderBuilder.released = true;
                    exoplayerCuesDecoderBuilder.inputBufferState = 23707;
                    AutoResolveHelper.resolveTask(zzeVar.zae(1, exoplayerCuesDecoderBuilder.build()), paymentFormActivity.getParentActivity());
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 13:
                paymentFormActivity.lambda$createView$27$1();
                break;
            default:
                AlertDialog.Builder builder = new AlertDialog.Builder(paymentFormActivity.getParentActivity(), 0, null);
                String string2 = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (paymentFormActivity.currentPassword.has_secure_values) {
                    string2 = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(string2, "\n\n"), R.string.TurnPasswordOffPassport);
                }
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.message = string2;
                alertDialog.title = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                builder.setPositiveButton(LocaleController.getString(R.string.Disable), new PaymentFormActivity$$ExternalSyntheticLambda30(paymentFormActivity, 1));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                paymentFormActivity.showDialog(alertDialog);
                TextView textView = (TextView) alertDialog.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(paymentFormActivity.getThemedColor(Theme.key_text_RedBold));
                }
                break;
        }
    }
}
