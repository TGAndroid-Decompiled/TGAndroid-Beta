package org.telegram.ui.Components.Premium;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RecyclerListView;

public final class LimitReachedBottomSheet$$ExternalSyntheticLambda24 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public LimitReachedBottomSheet$$ExternalSyntheticLambda24(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((LimitReachedBottomSheet) this.f$0).lambda$onViewCreated$5(view, i);
                break;
            default:
                PremiumFeatureBottomSheet.AnonymousClass11 anonymousClass11 = (PremiumFeatureBottomSheet.AnonymousClass11) this.f$0;
                if (view != null) {
                    anonymousClass11.drawEffectForView(view, true);
                    anonymousClass11.haptic = false;
                    anonymousClass11.smoothScrollBy(0, view.getTop() - ((anonymousClass11.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                }
                break;
        }
    }
}
