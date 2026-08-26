package org.telegram.ui.Components.Premium.boosts;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class BoostDialogs$$ExternalSyntheticLambda10 implements AlertDialog.OnButtonClickListener, RecyclerListView.OnItemLongClickListener {
    public final int $r8$classId;
    public final LimitReachedBottomSheet f$0;

    public BoostDialogs$$ExternalSyntheticLambda10(LimitReachedBottomSheet limitReachedBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = limitReachedBottomSheet;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showGiftOfferSheet$15();
                UserSelectorBottomSheet.open(0, null);
                break;
            case 1:
                LimitReachedBottomSheet limitReachedBottomSheet = this.f$0;
                limitReachedBottomSheet.getClass();
                limitReachedBottomSheet.parentFragment.presentFragment(new PremiumPreviewFragment(0, null));
                limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                alertDialog.dismiss();
                break;
            default:
                LimitReachedBottomSheet limitReachedBottomSheet2 = this.f$0;
                limitReachedBottomSheet2.getClass();
                alertDialog.dismiss();
                if (!limitReachedBottomSheet2.boostMiniBtn.isAttachedToWindow()) {
                    ButtonWithCounterView buttonWithCounterView = limitReachedBottomSheet2.boostToUnlockGroupBtn;
                    if (buttonWithCounterView != null && buttonWithCounterView.isAttachedToWindow()) {
                        limitReachedBottomSheet2.boostChannel(buttonWithCounterView, false);
                    } else {
                        limitReachedBottomSheet2.boostChannel(limitReachedBottomSheet2.premiumButtonView, false);
                    }
                } else {
                    limitReachedBottomSheet2.boostChannel(limitReachedBottomSheet2.boostMiniBtn, false);
                }
                break;
        }
    }

    @Override
    public boolean onItemClick(int i, View view) {
        LimitReachedBottomSheet limitReachedBottomSheet = this.f$0;
        limitReachedBottomSheet.recyclerListView.getOnItemClickListener().onItemClick(i, view);
        if (limitReachedBottomSheet.type != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
