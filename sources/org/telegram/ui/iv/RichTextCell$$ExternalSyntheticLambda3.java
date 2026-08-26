package org.telegram.ui.iv;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.MessageSuggestionOfferSheet;
import org.telegram.ui.Stars.SellGiftEnterPriceSheet;
import org.telegram.ui.ThemeSetUrlActivity;
import org.telegram.ui.TwoStepVerificationActivity;

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
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) this.f$0;
                channelMonetizationLayout.getClass();
                float f = z ? 1.0f : 0.0f;
                channelMonetizationLayout.starsBalanceEditTextContainer.animateSelection(f, f, true);
                break;
            case 2:
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
            case 3:
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
            case 4:
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
            case 5:
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
                if (!z) {
                    dialogsActivity.getClass();
                } else {
                    dialogsActivity.fragmentSearchFieldWatcher.toggleSearch(true);
                }
                break;
            case 6:
                LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView = (LoginActivity.LoginActivityEmailCodeView) this.f$0;
                if (!z) {
                    loginActivityEmailCodeView.getClass();
                } else {
                    LoginActivity loginActivity = LoginActivity.this;
                    loginActivity.keyboardView.setEditText((EditText) view);
                    loginActivity.keyboardView.setDispatchBackWhenEmpty(true);
                }
                break;
            case 7:
                float f2 = z ? 1.0f : 0.0f;
                ((OutlineTextContainerView) this.f$0).animateSelection(f2, f2, true);
                break;
            case 8:
                OutlineTextContainerView outlineTextContainerView = ((LoginActivity.LoginActivityPasswordView) this.f$0).outlineCodeField;
                float f3 = z ? 1.0f : 0.0f;
                outlineTextContainerView.animateSelection(f3, f3, true);
                break;
            case 9:
                OutlineTextContainerView outlineTextContainerView2 = ((LoginActivity.LoginActivityPhraseView) this.f$0).outlineField;
                float f4 = z ? 1.0f : 0.0f;
                outlineTextContainerView2.animateSelection(f4, f4, true);
                break;
            case 10:
                LoginActivity.LoginActivityRecoverView loginActivityRecoverView = (LoginActivity.LoginActivityRecoverView) this.f$0;
                if (!z) {
                    loginActivityRecoverView.getClass();
                } else {
                    LoginActivity loginActivity2 = LoginActivity.this;
                    loginActivity2.keyboardView.setEditText((EditText) view);
                    loginActivity2.keyboardView.setDispatchBackWhenEmpty(true);
                }
                break;
            case 11:
                OutlineTextContainerView outlineTextContainerView3 = ((LoginActivity.LoginActivitySetupEmail) this.f$0).emailOutlineView;
                float f5 = z ? 1.0f : 0.0f;
                outlineTextContainerView3.animateSelection(f5, f5, true);
                break;
            case 12:
                LoginActivity.LoginActivitySmsView loginActivitySmsView = (LoginActivity.LoginActivitySmsView) this.f$0;
                if (!z) {
                    loginActivitySmsView.getClass();
                } else {
                    LoginActivity loginActivity3 = LoginActivity.this;
                    loginActivity3.keyboardView.setEditText((EditText) view);
                    loginActivity3.keyboardView.setDispatchBackWhenEmpty(true);
                }
                break;
            case 13:
                OutlineTextContainerView outlineTextContainerView4 = ((LoginActivity.PhoneView) this.f$0).countryOutlineView;
                float f6 = z ? 1.0f : 0.0f;
                outlineTextContainerView4.animateSelection(f6, f6, true);
                break;
            case 14:
                OutlineTextContainerView outlineTextContainerView5 = ((PasscodeActivity) this.f$0).outlinePasswordView;
                float f7 = z ? 1.0f : 0.0f;
                outlineTextContainerView5.animateSelection(f7, f7, true);
                break;
            case 15:
                BotStarsActivity.AnonymousClass3 anonymousClass4 = ((BotStarsActivity) this.f$0).balanceEditTextContainer;
                float f8 = z ? 1.0f : 0.0f;
                anonymousClass4.animateSelection(f8, f8, true);
                break;
            case 16:
                GiftOfferSheet giftOfferSheet = (GiftOfferSheet) this.f$0;
                giftOfferSheet.starsCountEditOutline.animateSelection(z, !TextUtils.isEmpty(giftOfferSheet.starsCountEditField.getText()));
                break;
            case 17:
                MessageSuggestionOfferSheet messageSuggestionOfferSheet = (MessageSuggestionOfferSheet) this.f$0;
                messageSuggestionOfferSheet.starsCountEditOutline.animateSelection(z, !TextUtils.isEmpty(messageSuggestionOfferSheet.starsCountEditField.getText()));
                break;
            case 18:
                SellGiftEnterPriceSheet sellGiftEnterPriceSheet = (SellGiftEnterPriceSheet) this.f$0;
                sellGiftEnterPriceSheet.starsCountEditOutline.animateSelection(z, !TextUtils.isEmpty(sellGiftEnterPriceSheet.starsCountEditField.getText()));
                break;
            case 19:
                ThemeSetUrlActivity themeSetUrlActivity = (ThemeSetUrlActivity) this.f$0;
                if (!z) {
                    themeSetUrlActivity.helpInfoCell.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                } else {
                    themeSetUrlActivity.helpInfoCell.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                }
                break;
            default:
                OutlineTextContainerView outlineTextContainerView6 = ((TwoStepVerificationActivity) this.f$0).passwordOutlineView;
                float f9 = z ? 1.0f : 0.0f;
                outlineTextContainerView6.animateSelection(f9, f9, true);
                break;
        }
    }
}
