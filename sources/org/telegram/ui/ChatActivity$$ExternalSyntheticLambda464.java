package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;

public final class ChatActivity$$ExternalSyntheticLambda464 implements View.OnClickListener {
    public final int $r8$classId;

    public ChatActivity$$ExternalSyntheticLambda464(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.lambda$updateGreetingLock$307(view);
                break;
            case 1:
                UserSelectorBottomSheet.open(0, null);
                break;
            case 2:
                ExternalActionActivity.lambda$onCreate$1(view);
                break;
            case 3:
                LaunchActivity.lambda$setupActionBarLayout$4(view);
                break;
            case 4:
                MainTabsActivity.lambda$createView$1(view);
                break;
            case 5:
                PremiumPreviewFragment.lambda$updateButtonText$18(view);
                break;
            default:
                ProfileActivity.lambda$processOnClickOrPress$77(view);
                break;
        }
    }
}
