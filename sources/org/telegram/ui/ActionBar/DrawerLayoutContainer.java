package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public class DrawerLayoutContainer extends FrameLayout {
    private ActionBarLayout actionBarLayout;
    private boolean inLayout;
    private final Paint internalNavbarPaint;
    private WindowInsetsCompat lastWindowInsetsCompat;
    private INavigationLayout parentActionBarLayout;
    private Insets systemAndCutoutAndImeInsets;
    private Insets systemAndCutoutInsets;

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean isDrawCurrentPreviewFragmentAbove() {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public DrawerLayoutContainer(Context context) {
        super(context);
        this.internalNavbarPaint = new Paint(1);
        Insets insets = Insets.NONE;
        this.systemAndCutoutInsets = insets;
        this.systemAndCutoutAndImeInsets = insets;
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
            }
        });
        setSystemUiVisibility(1280);
    }

    public void setParentActionBarLayout(INavigationLayout iNavigationLayout) {
        this.parentActionBarLayout = iNavigationLayout;
    }

    public void setActionBarLayout(ActionBarLayout actionBarLayout) {
        this.actionBarLayout = actionBarLayout;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.parentActionBarLayout.checkTransitionAnimation();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) throws Exception {
        this.inLayout = true;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                try {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin + getPaddingTop(), layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight() + getPaddingTop());
                } catch (Exception e) {
                    FileLog.e(e);
                    if (BuildVars.DEBUG_VERSION) {
                        throw e;
                    }
                }
            }
        }
        this.inLayout = false;
    }

    @Override
    public void requestLayout() {
        if (this.inLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        Insets insets = this.systemAndCutoutInsets;
        int i3 = (size - insets.left) - insets.right;
        int i4 = (size2 - insets.top) - insets.bottom;
        Point point = AndroidUtilities.displaySize;
        point.x = i3;
        point.y = i4;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824);
                int i6 = layoutParams.height;
                if (i6 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824);
                }
                if ((childAt instanceof ActionBarLayout) && ((ActionBarLayout) childAt).storyViewerAttached()) {
                    childAt.forceLayout();
                }
                childAt.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
            }
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.actionBarLayout;
        if (actionBarLayout != null && actionBarLayout.getParent() == this) {
            this.actionBarLayout.parentDraw(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    public Paint getInternalNavbarPaint() {
        return this.internalNavbarPaint;
    }

    public void setInternalNavigationBarColor(int i) {
        if (this.internalNavbarPaint.getColor() != i) {
            this.internalNavbarPaint.setColor(i);
            invalidate();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).invalidate();
            }
        }
    }

    @Override
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        WindowInsetsCompat windowInsetsCompat = this.lastWindowInsetsCompat;
        if (windowInsetsCompat != null) {
            dispatchApplyWindowInsetsInternal(view, windowInsetsCompat);
        }
    }

    private void dispatchApplyWindowInsetsInternal(View view, WindowInsetsCompat windowInsetsCompat) {
        if ((view instanceof ActionBarLayout) || view.getTag() == null) {
            ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompat);
        }
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.lastWindowInsetsCompat = windowInsetsCompat;
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        Insets defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, true);
        if (!this.systemAndCutoutInsets.equals(defaultWindowInsets) || !this.systemAndCutoutAndImeInsets.equals(defaultWindowInsets2)) {
            AndroidUtilities.statusBarHeight = defaultWindowInsets.top;
            AndroidUtilities.navigationBarHeight = defaultWindowInsets.bottom;
            this.systemAndCutoutInsets = defaultWindowInsets;
            this.systemAndCutoutAndImeInsets = defaultWindowInsets2;
            requestLayout();
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            dispatchApplyWindowInsetsInternal(getChildAt(i), windowInsetsCompat);
        }
        invalidate();
        return WindowInsetsCompat.CONSUMED;
    }
}
