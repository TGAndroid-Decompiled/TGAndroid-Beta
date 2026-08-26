package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public final class DrawerLayoutContainer extends FrameLayout {
    public ActionBarLayout actionBarLayout;
    public boolean inLayout;
    public final Paint internalNavbarPaint;
    public WindowInsetsCompat lastWindowInsetsCompat;
    public INavigationLayout parentActionBarLayout;
    public Insets systemAndCutoutAndImeInsets;
    public Insets systemAndCutoutInsets;

    public DrawerLayoutContainer(Activity activity) {
        super(activity);
        this.internalNavbarPaint = new Paint(1);
        Insets insets = Insets.NONE;
        this.systemAndCutoutInsets = insets;
        this.systemAndCutoutAndImeInsets = insets;
        AlertDialog$$ExternalSyntheticLambda13 alertDialog$$ExternalSyntheticLambda13 = new AlertDialog$$ExternalSyntheticLambda13(this, 7);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(this, alertDialog$$ExternalSyntheticLambda13);
        setSystemUiVisibility(1280);
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        WindowInsetsCompat windowInsetsCompat = this.lastWindowInsetsCompat;
        if (windowInsetsCompat != null) {
            if ((view instanceof ActionBarLayout) || view.getTag() == null) {
                ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompat);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.actionBarLayout;
        if (actionBarLayout != null && actionBarLayout.getParent() == this) {
            this.actionBarLayout.parentDraw(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    public Paint getInternalNavbarPaint() {
        return this.internalNavbarPaint;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final WindowInsetsCompat onApplyWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        this.lastWindowInsetsCompat = windowInsetsCompat;
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        Insets defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, true);
        if (!this.systemAndCutoutInsets.equals(defaultWindowInsets) || !this.systemAndCutoutAndImeInsets.equals(defaultWindowInsets2)) {
            AndroidUtilities.statusBarHeight = defaultWindowInsets.top;
            AndroidUtilities.navigationBarHeight = defaultWindowInsets.bottom;
            this.systemAndCutoutInsets = defaultWindowInsets;
            this.systemAndCutoutAndImeInsets = defaultWindowInsets2;
            if (!this.inLayout) {
                super.requestLayout();
            }
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                ViewCompat.dispatchApplyWindowInsets(childAt, windowInsetsCompat);
            }
        }
        invalidate();
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return ((ActionBarLayout) this.parentActionBarLayout).checkTransitionAnimation();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Exception {
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
    public final void onMeasure(int i, int i2) {
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
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824);
                int i6 = layoutParams.height;
                int iMakeMeasureSpec2 = i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824);
                if ((childAt instanceof ActionBarLayout) && ((ActionBarLayout) childAt).storyViewerAttached()) {
                    childAt.forceLayout();
                }
                childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.inLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setActionBarLayout(ActionBarLayout actionBarLayout) {
        this.actionBarLayout = actionBarLayout;
    }

    public void setInternalNavigationBarColor(int i) {
        Paint paint = this.internalNavbarPaint;
        if (paint.getColor() != i) {
            paint.setColor(i);
            invalidate();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).invalidate();
            }
        }
    }

    public void setParentActionBarLayout(INavigationLayout iNavigationLayout) {
        this.parentActionBarLayout = iNavigationLayout;
    }
}
