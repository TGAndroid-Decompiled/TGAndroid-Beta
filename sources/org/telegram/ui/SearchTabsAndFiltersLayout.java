package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;

public class SearchTabsAndFiltersLayout extends FrameLayout {
    private BlurredBackgroundDrawable blurredBackgroundDrawable;
    private final Path clipPath;

    public SearchTabsAndFiltersLayout(Context context) {
        super(context);
        this.clipPath = new Path();
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.clipPath.rewind();
        this.clipPath.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i - AndroidUtilities.dp(9.0f), i2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.clipPath);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void setBlurredBackground(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.blurredBackgroundDrawable = blurredBackgroundDrawable;
        setBackground(blurredBackgroundDrawable);
    }
}
