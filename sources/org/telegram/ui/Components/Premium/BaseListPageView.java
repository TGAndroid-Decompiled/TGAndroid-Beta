package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

public abstract class BaseListPageView extends FrameLayout implements PagerHeaderView {
    RecyclerView.Adapter adapter;
    final LinearLayoutManager layoutManager;
    final RecyclerListView recyclerListView;
    final Theme.ResourcesProvider resourcesProvider;

    public abstract RecyclerView.Adapter createAdapter();

    public BaseListPageView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider);
        this.recyclerListView = recyclerListView;
        recyclerListView.setNestedScrollingEnabled(true);
        RecyclerView.Adapter createAdapter = createAdapter();
        this.adapter = createAdapter;
        recyclerListView.setAdapter(createAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        recyclerListView.setClipToPadding(false);
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
        if (themePaint == null) {
            themePaint = Theme.dividerPaint;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, themePaint);
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
