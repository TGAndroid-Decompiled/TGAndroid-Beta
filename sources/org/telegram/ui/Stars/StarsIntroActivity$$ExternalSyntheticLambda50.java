package org.telegram.ui.Stars;

import android.view.View;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.LaunchActivity;

public final class StarsIntroActivity$$ExternalSyntheticLambda50 implements View.OnClickListener {
    public final int $r8$classId;
    public final StarsIntroActivity.StarsBalanceView f$0;

    public StarsIntroActivity$$ExternalSyntheticLambda50(StarsIntroActivity.StarsBalanceView starsBalanceView, int i) {
        this.$r8$classId = i;
        this.f$0 = starsBalanceView;
    }

    @Override
    public final void onClick(View view) {
        BaseFragment lastFragment;
        BaseFragment lastFragment2;
        switch (this.$r8$classId) {
            case 0:
                if (this.f$0.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
                }
                break;
            default:
                if (this.f$0.lastBalance > 0 && (lastFragment2 = LaunchActivity.getLastFragment()) != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams2 = new BaseFragment.BottomSheetParams();
                    bottomSheetParams2.transitionFromLeft = true;
                    lastFragment2.showAsSheet(new StarsIntroActivity(), bottomSheetParams2);
                }
                break;
        }
    }
}
