package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class DividerCell extends View {
    private boolean forceDarkTheme;
    private Paint paint = new Paint();

    public DividerCell(Context context) {
        super(context);
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), getPaddingTop() + getPaddingBottom() + 1);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.forceDarkTheme) {
            this.paint.setColor(ColorUtils.blendARGB(-16777216, Theme.getColor("voipgroup_dialogBackground"), 0.2f));
        } else {
            this.paint.setColor(Theme.getColor("divider"));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), this.paint);
    }

    public void setForceDarkTheme(boolean z) {
        this.forceDarkTheme = z;
    }
}
