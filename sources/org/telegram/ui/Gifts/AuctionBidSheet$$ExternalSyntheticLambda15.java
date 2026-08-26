package org.telegram.ui.Gifts;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class AuctionBidSheet$$ExternalSyntheticLambda15 implements DialogInterface.OnShowListener {
    public final int $r8$classId;
    public final EditTextBoldCursor f$0;

    public AuctionBidSheet$$ExternalSyntheticLambda15(int i, EditTextBoldCursor editTextBoldCursor) {
        this.$r8$classId = i;
        this.f$0 = editTextBoldCursor;
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
                ProfileGiftsContainer.lambda$openEnterNameAlert$18((ProfileGiftsContainer.AnonymousClass5) this.f$0, dialogInterface);
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f$0;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                break;
        }
    }
}
