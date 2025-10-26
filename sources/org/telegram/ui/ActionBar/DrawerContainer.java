package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class DrawerContainer extends FrameLayout {
    private int navbarInset;

    public DrawerContainer(Context context) {
        super(context);
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

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
        if (this.navbarInset != i) {
            this.navbarInset = i;
            requestLayout();
        }
        return WindowInsetsCompat.CONSUMED;
    }
}
