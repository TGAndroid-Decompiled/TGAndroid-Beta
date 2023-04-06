package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
public class DoubleLimitsPageView extends FrameLayout implements PagerHeaderView {
    DoubledLimitsBottomSheet$Adapter adapter;
    final LinearLayoutManager layoutManager;
    final RecyclerListView recyclerListView;

    public DoubleLimitsPageView(Context context) {
        super(context);
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.recyclerListView = recyclerListView;
        DoubledLimitsBottomSheet$Adapter doubledLimitsBottomSheet$Adapter = new DoubledLimitsBottomSheet$Adapter(UserConfig.selectedAccount, true);
        this.adapter = doubledLimitsBottomSheet$Adapter;
        recyclerListView.setAdapter(doubledLimitsBottomSheet$Adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        recyclerListView.setClipToPadding(false);
        this.adapter.containerView = this;
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.adapter.measureGradient(getContext(), getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
    }

    @Override
    public void setOffset(float f) {
        if (Math.abs(f / getMeasuredWidth()) == 1.0f) {
            if (this.recyclerListView.findViewHolderForAdapterPosition(0) == null || this.recyclerListView.findViewHolderForAdapterPosition(0).itemView.getTop() != this.recyclerListView.getPaddingTop()) {
                this.recyclerListView.scrollToPosition(0);
            }
        }
    }

    public void setTopOffset(int i) {
        this.recyclerListView.setPadding(0, i, 0, 0);
    }
}
