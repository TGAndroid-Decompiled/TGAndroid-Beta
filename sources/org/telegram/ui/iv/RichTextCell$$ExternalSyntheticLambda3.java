package org.telegram.ui.iv;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.MessageSuggestionOfferSheet;
import org.telegram.ui.Stars.SellGiftEnterPriceSheet;

public final class RichTextCell$$ExternalSyntheticLambda3 implements View.OnFocusChangeListener {
    public final int $r8$classId;
    public final Object f$0;

    public RichTextCell$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                ((RichTextCell) this.f$0).lambda$new$2$1(z);
                break;
            case 1:
                ColorPickerBottomSheet.SliderCell sliderCell = (ColorPickerBottomSheet.SliderCell) this.f$0;
                if (!z) {
                    EditTextBoldCursor editTextBoldCursor = sliderCell.valueView;
                    if (TextUtils.isEmpty(editTextBoldCursor.getText())) {
                        editTextBoldCursor.setText("0");
                    }
                } else {
                    sliderCell.getClass();
                }
                break;
            case 2:
                ColorPickerBottomSheet.SlidersPickerView slidersPickerView = (ColorPickerBottomSheet.SlidersPickerView) this.f$0;
                if (!z) {
                    EditTextBoldCursor editTextBoldCursor2 = slidersPickerView.hexEdit;
                    if (TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                        editTextBoldCursor2.setText("0");
                    }
                } else {
                    slidersPickerView.getClass();
                }
                break;
            case 3:
                ChatCustomReactionsEditActivity.AnonymousClass3 anonymousClass3 = (ChatCustomReactionsEditActivity.AnonymousClass3) this.f$0;
                if (!z) {
                    anonymousClass3.addReactionsSpan();
                } else {
                    anonymousClass3.removeReactionsSpan(true);
                    Runnable runnable = anonymousClass3.onFocused;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                break;
            case 4:
                ((BotStarsActivity) this.f$0).balanceEditTextContainer.animateSelection(z ? 1.0f : 0.0f);
                break;
            case 5:
                GiftOfferSheet giftOfferSheet = (GiftOfferSheet) this.f$0;
                giftOfferSheet.starsCountEditOutline.animateSelection(z, !TextUtils.isEmpty(giftOfferSheet.starsCountEditField.getText()));
                break;
            case 6:
                MessageSuggestionOfferSheet messageSuggestionOfferSheet = (MessageSuggestionOfferSheet) this.f$0;
                messageSuggestionOfferSheet.starsCountEditOutline.animateSelection(z, !TextUtils.isEmpty(messageSuggestionOfferSheet.starsCountEditField.getText()));
                break;
            default:
                SellGiftEnterPriceSheet sellGiftEnterPriceSheet = (SellGiftEnterPriceSheet) this.f$0;
                sellGiftEnterPriceSheet.starsCountEditOutline.animateSelection(z, !TextUtils.isEmpty(sellGiftEnterPriceSheet.starsCountEditField.getText()));
                break;
        }
    }
}
