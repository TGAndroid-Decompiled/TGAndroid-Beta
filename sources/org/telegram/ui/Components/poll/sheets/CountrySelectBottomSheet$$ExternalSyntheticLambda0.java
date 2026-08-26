package org.telegram.ui.Components.poll.sheets;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;

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
                ChatActivity.AnonymousClass1 anonymousClass1 = countrySelectBottomSheet.listener;
                if (anonymousClass1 != null) {
                    ArrayList arrayList = new ArrayList(countrySelectBottomSheet.selectedCountries.keySet());
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) anonymousClass1.this$0;
                    chatAttachAlertPollLayout.countriesList.clear();
                    chatAttachAlertPollLayout.countriesList.addAll(arrayList);
                    int i = chatAttachAlertPollLayout.poll2vLimitByCountryListRow;
                    if (i >= 0) {
                        chatAttachAlertPollLayout.listAdapter.notifyItemChanged(i);
                    }
                }
                countrySelectBottomSheet.lambda$showGiftOfferSheet$15();
                break;
            case 1:
                ChatActivity.AnonymousClass1 anonymousClass2 = countrySelectBottomSheet.listener;
                if (anonymousClass2 != null) {
                    ArrayList arrayList2 = new ArrayList(countrySelectBottomSheet.selectedCountries.keySet());
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = (ChatAttachAlertPollLayout) anonymousClass2.this$0;
                    chatAttachAlertPollLayout2.countriesList.clear();
                    chatAttachAlertPollLayout2.countriesList.addAll(arrayList2);
                    int i2 = chatAttachAlertPollLayout2.poll2vLimitByCountryListRow;
                    if (i2 >= 0) {
                        chatAttachAlertPollLayout2.listAdapter.notifyItemChanged(i2);
                    }
                }
                countrySelectBottomSheet.lambda$showGiftOfferSheet$15();
                break;
            case 2:
                HashMap map = countrySelectBottomSheet.selectedCountries;
                map.clear();
                countrySelectBottomSheet.spansContainer.spansContainer.removeAllSpans();
                countrySelectBottomSheet.adapter.update(true);
                countrySelectBottomSheet.button.setCount(map.size(), true);
                break;
            case 3:
                countrySelectBottomSheet.onSpanClick(view);
                break;
            default:
                int i3 = CountrySelectBottomSheet.$r8$clinit;
                countrySelectBottomSheet.onSpanClick(view);
                break;
        }
    }
}
