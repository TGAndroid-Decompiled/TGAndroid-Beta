package org.telegram.ui.Components.poll.sheets;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

public final class CountrySelectBottomSheet$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final CountrySelectBottomSheet f$0;

    public CountrySelectBottomSheet$$ExternalSyntheticLambda0(CountrySelectBottomSheet countrySelectBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = countrySelectBottomSheet;
    }

    @Override
    public final void onClick(View view) {
        CountrySelectBottomSheet countrySelectBottomSheet = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                CountrySelectBottomSheet.Listener listener = countrySelectBottomSheet.listener;
                if (listener != null) {
                    listener.onCountrySelected(new ArrayList(countrySelectBottomSheet.selectedCountries.keySet()));
                }
                countrySelectBottomSheet.lambda$showGiftOfferSheet$15();
                break;
            case 1:
                CountrySelectBottomSheet.Listener listener2 = countrySelectBottomSheet.listener;
                if (listener2 != null) {
                    listener2.onCountrySelected(new ArrayList(countrySelectBottomSheet.selectedCountries.keySet()));
                }
                countrySelectBottomSheet.lambda$showGiftOfferSheet$15();
                break;
            case 2:
                HashMap map = countrySelectBottomSheet.selectedCountries;
                map.clear();
                countrySelectBottomSheet.spansContainer.removeAllSpans(true);
                countrySelectBottomSheet.adapter.update(true);
                countrySelectBottomSheet.button.setCount(map.size(), true);
                break;
            case 3:
                countrySelectBottomSheet.onSpanClick(view);
                break;
            default:
                int i = CountrySelectBottomSheet.$r8$clinit;
                countrySelectBottomSheet.onSpanClick(view);
                break;
        }
    }
}
