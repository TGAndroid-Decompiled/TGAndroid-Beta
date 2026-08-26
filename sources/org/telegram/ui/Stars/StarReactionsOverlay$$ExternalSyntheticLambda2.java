package org.telegram.ui.Stars;

import java.util.ArrayList;
import org.telegram.ui.Components.RLottieDrawable;

public final class StarReactionsOverlay$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final StarReactionsOverlay f$0;

    public StarReactionsOverlay$$ExternalSyntheticLambda2(StarReactionsOverlay starReactionsOverlay, int i) {
        this.$r8$classId = i;
        this.f$0 = starReactionsOverlay;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StarReactionsOverlay starReactionsOverlay = this.f$0;
                starReactionsOverlay.counterShown = false;
                starReactionsOverlay.invalidate();
                starReactionsOverlay.checkBalance();
                starReactionsOverlay.hide();
                break;
            case 1:
                this.f$0.invalidate();
                break;
            default:
                StarReactionsOverlay starReactionsOverlay2 = this.f$0;
                starReactionsOverlay2.setMessageCell(null);
                ArrayList arrayList = starReactionsOverlay2.effects;
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
