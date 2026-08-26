package org.telegram.ui.Components.Premium.boosts.cells.selector;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.RecyclerListView;

public final class SelectorBtnCell extends LinearLayout {
    public final AnimatedFloat alpha;
    public final Paint dividerPaint;
    public final RecyclerListView listView;
    public final Theme.ResourcesProvider resourcesProvider;

    public SelectorBtnCell(Context context, Theme.ResourcesProvider resourcesProvider, RecyclerListView recyclerListView) {
        super(context);
        this.dividerPaint = new Paint(1);
        this.alpha = new AnimatedFloat(this);
        this.resourcesProvider = resourcesProvider;
        this.listView = recyclerListView;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint paint = this.dividerPaint;
        paint.setColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
        AnimatedFloat animatedFloat = this.alpha;
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            paint.setAlpha((int) (animatedFloat.set(recyclerListView.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
        } else {
            paint.setAlpha((int) (animatedFloat.set(1.0f) * 255.0f));
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
    }
}
