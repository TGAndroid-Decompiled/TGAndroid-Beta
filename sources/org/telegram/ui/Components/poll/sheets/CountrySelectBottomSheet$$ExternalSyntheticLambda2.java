package org.telegram.ui.Components.poll.sheets;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.FragmentSpansContainer;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda9;

public final class CountrySelectBottomSheet$$ExternalSyntheticLambda2 implements FragmentSpansContainer.Delegate, OnApplyWindowInsetsListener {
    public final CountrySelectBottomSheet f$0;

    public CountrySelectBottomSheet$$ExternalSyntheticLambda2(CountrySelectBottomSheet countrySelectBottomSheet) {
        this.f$0 = countrySelectBottomSheet;
    }

    @Override
    public void onAfterMeasure(int i) {
        CountrySelectBottomSheet countrySelectBottomSheet = this.f$0;
        countrySelectBottomSheet.getClass();
        int iMin = Math.min(i, AndroidUtilities.dp(144.0f));
        if (i > 0) {
            iMin -= AndroidUtilities.dp(8.0f);
        }
        if (countrySelectBottomSheet.selectedCountriesHeight != iMin) {
            countrySelectBottomSheet.selectedCountriesHeight = iMin;
            countrySelectBottomSheet.animatorSelectorContainerHeight.animateTo(iMin);
            countrySelectBottomSheet.spansContainer.postOnAnimation(new GiftSheet$$ExternalSyntheticLambda9(countrySelectBottomSheet, 15));
        }
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        CountrySelectBottomSheet countrySelectBottomSheet = this.f$0;
        countrySelectBottomSheet.getClass();
        countrySelectBottomSheet.processLegacyContainerInsets(windowInsetsCompat.toWindowInsets());
        countrySelectBottomSheet.animatorTopSaveButtonVisibility.setValue(windowInsetsCompat.mImpl.getInsets(8).bottom > 0, true);
        return WindowInsetsCompat.CONSUMED;
    }
}
