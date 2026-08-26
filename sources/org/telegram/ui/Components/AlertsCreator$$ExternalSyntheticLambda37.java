package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda65;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda8;
import org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda2;

public final class AlertsCreator$$ExternalSyntheticLambda37 implements NumberPicker.OnValueChangeListener, OnFailureListener, MediaDataController.KeywordResultCallback, Utilities.Callback2Return, AlertDialog.OnButtonClickListener {
    public final int f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public AlertsCreator$$ExternalSyntheticLambda37(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f$1 = obj;
        this.f$0 = i;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        StarGiftSheet.ResaleBuyTransferAlert resaleBuyTransferAlert = (StarGiftSheet.ResaleBuyTransferAlert) this.f$1;
        StarGiftSheet.PaymentFormState paymentFormState = (StarGiftSheet.PaymentFormState) resaleBuyTransferAlert.forms.get(resaleBuyTransferAlert.selectedCurrency);
        if (paymentFormState == null) {
            return;
        }
        StarsController starsController = StarsController.getInstance(this.f$0, resaleBuyTransferAlert.selectedCurrency);
        AmountUtils$Amount amountUtils$AmountOf = starsController.balanceLoaded ? AmountUtils$Amount.of(starsController.getBalance()) : null;
        if (amountUtils$AmountOf != null) {
            AmountUtils$Amount amountUtils$Amount = paymentFormState.amount;
            if (amountUtils$Amount.nanos > amountUtils$AmountOf.nanos) {
                AmountUtils$Currency amountUtils$Currency = resaleBuyTransferAlert.selectedCurrency;
                AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
                Context context = (Context) this.f$2;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$3;
                if (amountUtils$Currency == amountUtils$Currency2) {
                    new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, amountUtils$Amount.nanos / 1000000000, 14, null, null, 0L).show();
                    return;
                } else {
                    if (amountUtils$Currency == AmountUtils$Currency.TON) {
                        new TONIntroActivity.StarsNeededSheet(context, resourcesProvider, paymentFormState.amount, true, null).show();
                        return;
                    }
                    return;
                }
            }
        }
        Browser.Progress progress = resaleBuyTransferAlert.lastPositiveButtonProgress;
        if (progress != null) {
            progress.cancel();
            resaleBuyTransferAlert.lastPositiveButtonProgress = null;
        }
        ((Utilities.Callback2) this.f$4).run(paymentFormState, alertDialog.makeButtonLoading(i, true, true));
    }

    @Override
    public void onFailure(Exception exc) {
        StickerMakerView stickerMakerView = (StickerMakerView) this.f$1;
        Bitmap bitmap = (Bitmap) this.f$2;
        int i = this.f$0;
        PhotoViewer$$ExternalSyntheticLambda65 photoViewer$$ExternalSyntheticLambda65 = (PhotoViewer$$ExternalSyntheticLambda65) this.f$3;
        CommunityUtils$$ExternalSyntheticLambda2 communityUtils$$ExternalSyntheticLambda2 = (CommunityUtils$$ExternalSyntheticLambda2) this.f$4;
        stickerMakerView.segmentingLoading = false;
        FileLog.e(exc);
        if ((exc instanceof MlKitException) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && stickerMakerView.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new BotBiometry$$ExternalSyntheticLambda8(stickerMakerView, bitmap, i, photoViewer$$ExternalSyntheticLambda65, 8), 2000L);
        } else {
            communityUtils$$ExternalSyntheticLambda2.run(new ArrayList());
        }
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i2) {
        NumberPicker numberPicker2 = (NumberPicker) this.f$3;
        TextView textView = (TextView) this.f$4;
        AlertsCreator.lambda$createPollCloseDatePickerDialog$166(this.f$0, (NumberPicker) this.f$1, (NumberPicker) this.f$2, numberPicker2, textView, numberPicker, i, i2);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        return ((ProfileGiftsContainer) this.f$1).lambda$new$7(this.f$0, (BaseFragment) this.f$2, (Context) this.f$3, (Theme.ResourcesProvider) this.f$4, (Integer) obj, (View) obj2);
    }

    public AlertsCreator$$ExternalSyntheticLambda37(int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, TextView textView) {
        this.f$0 = i;
        this.f$1 = numberPicker;
        this.f$2 = numberPicker2;
        this.f$3 = numberPicker3;
        this.f$4 = textView;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((SuggestEmojiView) this.f$1).lambda$searchKeywords$3(this.f$0, (String) this.f$2, (HashSet) this.f$3, (ArrayList) this.f$4, arrayList, str);
    }

    public AlertsCreator$$ExternalSyntheticLambda37(StickerMakerView stickerMakerView, Bitmap bitmap, int i, PhotoViewer$$ExternalSyntheticLambda65 photoViewer$$ExternalSyntheticLambda65, CommunityUtils$$ExternalSyntheticLambda2 communityUtils$$ExternalSyntheticLambda2) {
        this.f$1 = stickerMakerView;
        this.f$2 = bitmap;
        this.f$0 = i;
        this.f$3 = photoViewer$$ExternalSyntheticLambda65;
        this.f$4 = communityUtils$$ExternalSyntheticLambda2;
    }
}
