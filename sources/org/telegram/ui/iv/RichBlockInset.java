package org.telegram.ui.iv;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.CalendarActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Stars.SuperRipple$$ExternalSyntheticLambda7;

public final class RichBlockInset {
    public Object animator;
    public long boundRowId;
    public int currentPx;

    public RichBlockInset(int i, URL url, long j) {
        this.currentPx = i;
        this.animator = url;
        this.boundRowId = j;
    }

    public void apply(BlockRow blockRow, RichBlockCell$$ExternalSyntheticLambda0 richBlockCell$$ExternalSyntheticLambda0) {
        int iDp;
        int i;
        if (blockRow == null) {
            iDp = 0;
        } else {
            int size = blockRow.quoteIds.size();
            int iDp2 = size <= 0 ? 0 : AndroidUtilities.dp(CalendarActivity$$ExternalSyntheticOutline0.m(size, 1, 16, 12));
            int iMax = Math.max(0, blockRow.level);
            iDp = iDp2 + (iMax <= 0 ? 0 : AndroidUtilities.dp(CalendarActivity$$ExternalSyntheticOutline0.m(iMax, 1, 24, 28)));
        }
        long j = blockRow != null ? blockRow.id : Long.MIN_VALUE;
        boolean z = j == this.boundRowId && this.currentPx >= 0;
        this.boundRowId = j;
        ValueAnimator valueAnimator = (ValueAnimator) this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.animator = null;
        }
        if (!z || (i = this.currentPx) == iDp) {
            this.currentPx = iDp;
            richBlockCell$$ExternalSyntheticLambda0.apply(iDp);
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, iDp);
        valueAnimatorOfInt.addUpdateListener(new SuperRipple$$ExternalSyntheticLambda7(15, this, richBlockCell$$ExternalSyntheticLambda0));
        valueAnimatorOfInt.setInterpolator(CubicBezierInterpolator.DEFAULT);
        valueAnimatorOfInt.setDuration(200L);
        this.animator = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }
}
