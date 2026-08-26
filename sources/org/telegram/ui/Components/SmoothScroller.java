package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public class SmoothScroller extends LinearSmoothScroller {
    public float durationScale;
    public final CubicBezierInterpolator interpolator;
    public int offset;

    public SmoothScroller(Context context) {
        super(context);
        this.interpolator = CubicBezierInterpolator.DEFAULT;
        this.durationScale = 1.0f;
    }

    @Override
    public final int calculateDyToMakeVisible(int i, View view) {
        return super.calculateDyToMakeVisible(i, view) - this.offset;
    }

    @Override
    public final int calculateTimeForDeceleration(int i) {
        return Math.round(Math.min(super.calculateTimeForDeceleration(i), 500) * this.durationScale);
    }

    @Override
    public final int calculateTimeForScrolling(int i) {
        return Math.round(Math.min(super.calculateTimeForScrolling(i), 150) * this.durationScale);
    }

    @Override
    public final void onTargetFound(View view, RecyclerView.SmoothScroller.Action action) {
        int iCalculateDxToMakeVisible = calculateDxToMakeVisible(getHorizontalSnapPreference(), view);
        int iCalculateDyToMakeVisible = super.calculateDyToMakeVisible(getVerticalSnapPreference(), view) - this.offset;
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iCalculateDyToMakeVisible * iCalculateDyToMakeVisible) + (iCalculateDxToMakeVisible * iCalculateDxToMakeVisible)));
        if (iCalculateTimeForDeceleration > 0) {
            action.update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iCalculateTimeForDeceleration, this.interpolator);
        }
        AndroidUtilities.runOnUIThread(new SeekBarView$$ExternalSyntheticLambda1(this, 23), Math.max(0, iCalculateTimeForDeceleration));
    }

    @Override
    public final void updateActionForInterimTarget(RecyclerView.SmoothScroller.Action action) {
        PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition);
        if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
            action.mJumpToPosition = this.mTargetPosition;
            stop();
            return;
        }
        RecyclerView.SmoothScroller.normalize(pointFComputeScrollVectorForPosition);
        this.mTargetVector = pointFComputeScrollVectorForPosition;
        this.mInterimTargetDx = (int) (pointFComputeScrollVectorForPosition.x * 10000.0f);
        this.mInterimTargetDy = (int) (pointFComputeScrollVectorForPosition.y * 10000.0f);
        action.update((int) (this.mInterimTargetDx * 1.2f), (int) (this.mInterimTargetDy * 1.2f), (int) (calculateTimeForScrolling(10000) * 1.2f), this.interpolator);
    }
}
