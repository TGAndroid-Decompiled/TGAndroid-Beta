package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class DividerCell extends View {
    public boolean forceDarkTheme;
    public final Paint paint;
    public final Theme.ResourcesProvider resourcesProvider;

    public DividerCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.paint = new Paint();
        this.resourcesProvider = resourcesProvider;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z = this.forceDarkTheme;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = this.paint;
        if (z) {
            paint.setColor(ColorUtils.blendARGB(0.2f, -16777216, Theme.getColor(Theme.key_voipgroup_dialogBackground, resourcesProvider)));
        } else {
            paint.setColor(Theme.getColor(Theme.key_divider, resourcesProvider));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z) {
        this.forceDarkTheme = z;
    }
}
