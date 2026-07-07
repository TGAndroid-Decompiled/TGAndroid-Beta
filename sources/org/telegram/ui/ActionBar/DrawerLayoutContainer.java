package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
        int i3 = (size2 - insets.top) - insets.bottom;
        if (i3 > 0 && i3 < 4096) {
            AndroidUtilities.displaySize.y = i3;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824);
                int i5 = layoutParams.height;
                if (i5 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
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
        int width = getWidth();
        int height = getHeight();
        Insets insets = this.systemAndCutoutInsets;
        int i = insets.left;
        int i2 = insets.right;
        if (i > 0) {
            canvas.drawRect(0.0f, 0.0f, i, height, Theme.fillingPaint(-16777216));
        }
        if (i2 > 0) {
            canvas.drawRect(width - i2, 0.0f, width, height, Theme.fillingPaint(-16777216));
        }
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
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime() | WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
            if (marginLayoutParams.topMargin != 0 || marginLayoutParams.bottomMargin != 0 || marginLayoutParams.leftMargin != insets.left || marginLayoutParams.rightMargin != insets.right) {
                marginLayoutParams.leftMargin = insets.left;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.rightMargin = insets.right;
                marginLayoutParams.bottomMargin = 0;
                view.requestLayout();
            }
            ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompat.inset(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin));
        }
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.lastWindowInsetsCompat = windowInsetsCompat;
        Insets insetsIgnoringVisibility = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        Insets insetsMax = Insets.max(insetsIgnoringVisibility, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()));
        if (!this.systemAndCutoutInsets.equals(insetsIgnoringVisibility) || !this.systemAndCutoutAndImeInsets.equals(insetsMax)) {
            AndroidUtilities.statusBarHeight = insetsIgnoringVisibility.top;
            AndroidUtilities.navigationBarHeight = insetsIgnoringVisibility.bottom;
            this.systemAndCutoutInsets = insetsIgnoringVisibility;
            this.systemAndCutoutAndImeInsets = insetsMax;
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
