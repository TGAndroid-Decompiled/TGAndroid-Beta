package org.telegram.ui.Components;

import android.view.View;

public final class PagerSlidingTabStrip$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final PagerSlidingTabStrip f$0;
    public final int f$1;

    public PagerSlidingTabStrip$$ExternalSyntheticLambda0(PagerSlidingTabStrip pagerSlidingTabStrip, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = pagerSlidingTabStrip;
        this.f$1 = i;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$addIconTab$0(this.f$1, view);
                break;
            default:
                this.f$0.lambda$addTab$1(this.f$1, view);
                break;
        }
    }
}
