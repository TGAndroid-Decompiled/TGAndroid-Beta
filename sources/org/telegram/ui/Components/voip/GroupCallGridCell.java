package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.GroupCallTabletGridAdapter;

public abstract class GroupCallGridCell extends FrameLayout {
    public static final int CELL_HEIGHT = 165;
    public boolean attached;
    public GroupCallTabletGridAdapter gridAdapter;
    private final boolean isTabletGrid;
    ChatObject.VideoParticipant participant;
    public int position;
    GroupCallMiniTextureView renderer;
    public int spanCount;

    public GroupCallGridCell(Context context, boolean z) {
        super(context);
        this.isTabletGrid = z;
    }

    public float getItemHeight() {
        GroupCallTabletGridAdapter groupCallTabletGridAdapter = this.gridAdapter;
        return groupCallTabletGridAdapter != null ? groupCallTabletGridAdapter.getItemHeight(this.position) : getMeasuredHeight();
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.participant;
    }

    public GroupCallMiniTextureView getRenderer() {
        return this.renderer;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (this.isTabletGrid) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.gridAdapter.getItemHeight(this.position), 1073741824));
        } else {
            float f = GroupCallActivity.isLandscapeMode ? 3.0f : 2.0f;
            float fM$3 = OKLCH.m$3(14.0f, 2, AndroidUtilities.displaySize.x) + (GroupCallActivity.isLandscapeMode ? -AndroidUtilities.dp(90.0f) : 0);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) ((GroupCallActivity.isTabletMode ? fM$3 / 2.0f : fM$3 / f) + AndroidUtilities.dp(4.0f)), 1073741824));
        }
    }

    public void setData(AccountInstance accountInstance, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, long j) {
        this.participant = videoParticipant;
    }

    public void setRenderer(GroupCallMiniTextureView groupCallMiniTextureView) {
        this.renderer = groupCallMiniTextureView;
    }
}
