package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public class DrawerContainer extends FrameLayout {
    private int backgroundColor;
    private final Paint backgroundPaint;
    private int navbarInset;

    public DrawerContainer(Context context) {
        super(context);
        this.backgroundPaint = new Paint(1);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onApplyWindowInsets;
                onApplyWindowInsets = DrawerContainer.this.onApplyWindowInsets(view, windowInsetsCompat);
                return onApplyWindowInsets;
            }
        });
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int childCount = getChildCount();
        RecyclerView recyclerView = null;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof RecyclerView) {
                recyclerView = (RecyclerView) childAt;
            } else {
                ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin = this.navbarInset;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                i3 += childAt.getMeasuredHeight();
            }
        }
        if (recyclerView != null) {
            if (i3 == 0) {
                recyclerView.setPadding(0, 0, 0, this.navbarInset);
            } else {
                recyclerView.setPadding(0, 0, 0, 0);
                ((FrameLayout.LayoutParams) recyclerView.getLayoutParams()).bottomMargin = i3 + this.navbarInset;
            }
            measureChildWithMargins(recyclerView, i, 0, i2, 0);
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.backgroundPaint.getAlpha() > 0) {
            canvas.drawRect(0.0f, getMeasuredHeight() - this.navbarInset, getMeasuredWidth(), getMeasuredHeight(), this.backgroundPaint);
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        this.backgroundColor = i;
        checkBackgroundColorPaint();
    }

    private void checkBackgroundColorPaint() {
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.navbarInset);
        this.backgroundPaint.setColor(Theme.multAlpha(ColorUtils.compositeColors(536870912, this.backgroundColor), AndroidUtilities.lerp(0.0f, 0.75f, navigationBarThirdButtonsFactor)));
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
        if (this.navbarInset != i) {
            this.navbarInset = i;
            checkBackgroundColorPaint();
            requestLayout();
        }
        return WindowInsetsCompat.CONSUMED;
    }
}
