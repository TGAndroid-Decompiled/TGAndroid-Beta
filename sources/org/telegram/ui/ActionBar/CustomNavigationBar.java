package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;

public class CustomNavigationBar extends View {
    private static final boolean USE_INSETS;
    private int height;
    private final Paint paint;

    static {
        USE_INSETS = Build.VERSION.SDK_INT >= 35;
    }

    public CustomNavigationBar(Context context) {
        super(context);
        this.paint = new Paint();
        if (USE_INSETS) {
            ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    WindowInsetsCompat onApplyWindowInsets;
                    onApplyWindowInsets = CustomNavigationBar.this.onApplyWindowInsets(view, windowInsetsCompat);
                    return onApplyWindowInsets;
                }
            });
        }
    }

    public void setColor(int i) {
        if (this.paint.getColor() != i) {
            this.paint.setColor(i);
            invalidate();
        }
    }

    public int getColor() {
        return this.paint.getColor();
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
        if (this.height != i) {
            this.height = i;
            requestLayout();
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (!USE_INSETS) {
            this.height = AndroidUtilities.navigationBarHeight;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.height, 1073741824));
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
    }
}
