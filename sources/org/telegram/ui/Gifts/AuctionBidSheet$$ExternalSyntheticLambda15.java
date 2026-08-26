package org.telegram.ui.Gifts;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Components.AlertsCreator;

public final class AuctionBidSheet$$ExternalSyntheticLambda15 implements DialogInterface.OnShowListener {
    public final int $r8$classId;
    public final View f$0;

    public AuctionBidSheet$$ExternalSyntheticLambda15(int i, View view) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                AuctionBidSheet.AnonymousClass4 anonymousClass4 = (AuctionBidSheet.AnonymousClass4) this.f$0;
                anonymousClass4.requestFocus();
                AndroidUtilities.showKeyboard(anonymousClass4);
                break;
            case 1:
                BusinessLinksActivity.AnonymousClass1 anonymousClass1 = (BusinessLinksActivity.AnonymousClass1) this.f$0;
                anonymousClass1.requestFocus();
                AndroidUtilities.showKeyboard(anonymousClass1);
                break;
            case 2:
                DatePicker datePicker = (DatePicker) this.f$0;
                int childCount = datePicker.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = datePicker.getChildAt(i);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                break;
            case 3:
                AlertsCreator.AnonymousClass3 anonymousClass3 = (AlertsCreator.AnonymousClass3) this.f$0;
                anonymousClass3.requestFocus();
                AndroidUtilities.showKeyboard(anonymousClass3);
                break;
            default:
                ProfileGiftsContainer.AnonymousClass5 anonymousClass5 = (ProfileGiftsContainer.AnonymousClass5) this.f$0;
                anonymousClass5.requestFocus();
                AndroidUtilities.showKeyboard(anonymousClass5);
                break;
        }
    }
}
