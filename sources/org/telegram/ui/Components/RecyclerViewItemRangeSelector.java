package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.LaunchActivity;

public final class RecyclerViewItemRangeSelector implements RecyclerView.OnItemTouchListener {
    public int autoScrollVelocity;
    public final RecyclerViewItemRangeSelectorDelegate delegate;
    public boolean dragSelectActive;
    public int hotspotBottomBoundEnd;
    public int hotspotBottomBoundStart;
    public int hotspotTopBoundEnd;
    public boolean inBottomHotspot;
    public boolean inTopHotspot;
    public RecyclerView recyclerView;
    public int lastDraggedIndex = -1;
    public final int hotspotHeight = AndroidUtilities.dp(80.0f);
    public final LaunchActivity.AnonymousClass18 autoScrollRunnable = new LaunchActivity.AnonymousClass18(this, 2);

    public interface RecyclerViewItemRangeSelectorDelegate {
        boolean isIndexSelectable(int i);

        boolean isSelected(int i);

        void onStartStopSelection(boolean z);

        void setSelected(View view, boolean z);
    }

    public RecyclerViewItemRangeSelector(RecyclerViewItemRangeSelectorDelegate recyclerViewItemRangeSelectorDelegate) {
        this.delegate = recyclerViewItemRangeSelectorDelegate;
    }

    @Override
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z = this.dragSelectActive && !(recyclerView.getAdapter() == null || recyclerView.getAdapter().getItemCount() == 0);
        if (z) {
            this.recyclerView = recyclerView;
            int i = this.hotspotHeight;
            if (i > -1) {
                this.hotspotTopBoundEnd = i;
                this.hotspotBottomBoundStart = recyclerView.getMeasuredHeight() - i;
                this.hotspotBottomBoundEnd = recyclerView.getMeasuredHeight();
            }
        }
        if (z && motionEvent.getAction() == 1) {
            this.dragSelectActive = false;
            this.inTopHotspot = false;
            this.inBottomHotspot = false;
            AndroidUtilities.cancelRunOnUIThread(this.autoScrollRunnable);
            this.delegate.onStartStopSelection(false);
        }
        return z;
    }

    @Override
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override
    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        View viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        int childAdapterPosition = viewFindChildViewUnder != null ? RecyclerView.getChildAdapterPosition(viewFindChildViewUnder) : -1;
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        RecyclerViewItemRangeSelectorDelegate recyclerViewItemRangeSelectorDelegate = this.delegate;
        LaunchActivity.AnonymousClass18 anonymousClass18 = this.autoScrollRunnable;
        if (action == 1) {
            this.dragSelectActive = false;
            this.inTopHotspot = false;
            this.inBottomHotspot = false;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
            recyclerViewItemRangeSelectorDelegate.onStartStopSelection(false);
            return;
        }
        if (action != 2) {
            return;
        }
        if (this.hotspotHeight > -1) {
            float f = 0;
            if (y >= f && y <= this.hotspotTopBoundEnd) {
                this.inBottomHotspot = false;
                if (!this.inTopHotspot) {
                    this.inTopHotspot = true;
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
                    AndroidUtilities.runOnUIThread(anonymousClass18);
                }
                this.autoScrollVelocity = ((int) (this.hotspotTopBoundEnd - (y - f))) / 2;
            } else if (y >= this.hotspotBottomBoundStart && y <= this.hotspotBottomBoundEnd) {
                this.inTopHotspot = false;
                if (!this.inBottomHotspot) {
                    this.inBottomHotspot = true;
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
                    AndroidUtilities.runOnUIThread(anonymousClass18);
                }
                int i = this.hotspotBottomBoundEnd;
                this.autoScrollVelocity = ((int) ((y + i) - (this.hotspotBottomBoundStart + i))) / 2;
            } else if (this.inTopHotspot || this.inBottomHotspot) {
                AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
                this.inTopHotspot = false;
                this.inBottomHotspot = false;
            }
        }
        if (childAdapterPosition == -1 || this.lastDraggedIndex == childAdapterPosition) {
            return;
        }
        this.lastDraggedIndex = childAdapterPosition;
        recyclerViewItemRangeSelectorDelegate.setSelected(viewFindChildViewUnder, !recyclerViewItemRangeSelectorDelegate.isSelected(childAdapterPosition));
    }

    public final void setIsActive(PhotoAttachPhotoCell photoAttachPhotoCell, int i, boolean z) {
        if (this.dragSelectActive) {
            return;
        }
        this.lastDraggedIndex = -1;
        AndroidUtilities.cancelRunOnUIThread(this.autoScrollRunnable);
        this.inTopHotspot = false;
        this.inBottomHotspot = false;
        RecyclerViewItemRangeSelectorDelegate recyclerViewItemRangeSelectorDelegate = this.delegate;
        if (!recyclerViewItemRangeSelectorDelegate.isIndexSelectable(i)) {
            this.dragSelectActive = false;
            return;
        }
        recyclerViewItemRangeSelectorDelegate.onStartStopSelection(true);
        recyclerViewItemRangeSelectorDelegate.setSelected(photoAttachPhotoCell, z);
        this.dragSelectActive = true;
        this.lastDraggedIndex = i;
    }
}
