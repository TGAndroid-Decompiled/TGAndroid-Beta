package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.GroupCreateSectionCell;

public class GroupCreateDividerItemDecoration extends RecyclerView.ItemDecoration {
    private boolean single;
    private int skipRows;

    public void setSearching(boolean z) {
    }

    public void setSingle(boolean z) {
        this.single = z;
    }

    @Override
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int width = recyclerView.getWidth();
        int childCount = recyclerView.getChildCount() - (!this.single ? 1 : 0);
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            View childAt2 = i < childCount + (-1) ? recyclerView.getChildAt(i + 1) : null;
            if (recyclerView.getChildAdapterPosition(childAt) >= this.skipRows && !(childAt instanceof GroupCreateSectionCell) && !(childAt2 instanceof GroupCreateSectionCell)) {
                float bottom = childAt.getBottom();
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.m36dp(72.0f), bottom, width - (LocaleController.isRTL ? AndroidUtilities.m36dp(72.0f) : 0), bottom, Theme.dividerPaint);
            }
            i++;
        }
    }

    @Override
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        rect.top = 1;
    }
}
