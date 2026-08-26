package org.telegram.ui.Stories;

import java.util.ArrayList;
import org.telegram.ui.Components.RLottieDrawable;

public final class PaidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final PaidReactionButton.PaidReactionButtonEffectsView f$0;

    public PaidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0(PaidReactionButton.PaidReactionButtonEffectsView paidReactionButtonEffectsView, int i) {
        this.$r8$classId = i;
        this.f$0 = paidReactionButtonEffectsView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PaidReactionButton.PaidReactionButtonEffectsView paidReactionButtonEffectsView = this.f$0;
                paidReactionButtonEffectsView.invalidate();
                paidReactionButtonEffectsView.hide();
                break;
            default:
                ArrayList arrayList = this.f$0.effects;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((RLottieDrawable) obj).recycle(true);
                }
                arrayList.clear();
                break;
        }
    }
}
