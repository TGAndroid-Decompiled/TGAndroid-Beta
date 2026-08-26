package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class UpdateLayoutWrapper extends ViewGroup {
    public boolean lastUpdateLayoutVisible;
    public final Paint paint;
    public View updateLayout;

    public UpdateLayoutWrapper(Context context) {
        super(context);
        this.paint = new Paint(1);
        setClipToPadding(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int paddingBottom = getPaddingBottom();
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(0.1f, 0.75f, paddingBottom);
        int color = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        int iCompositeColors = ColorUtils.compositeColors(Theme.multAlpha(navigationBarThirdButtonsFactor, Theme.getColor(null, Theme.key_windowBackgroundWhite, false)), color);
        Paint paint = this.paint;
        paint.setColor(color);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - paddingBottom, paint);
        paint.setColor(iCompositeColors);
        canvas.drawRect(0.0f, getMeasuredHeight() - paddingBottom, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        View view = this.updateLayout;
        boolean z = view != null && view.getVisibility() == 0;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = z ? getPaddingBottom() + AndroidUtilities.dp(44.0f) : 0;
        setMeasuredDimension(size, paddingBottom);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        if (this.lastUpdateLayoutVisible != z) {
            this.lastUpdateLayoutVisible = z;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api20Impl.requestApplyInsets(this);
        }
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.updateLayout = view;
    }

    @Override
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).setPadding(i, i2, i3, i4);
        }
    }
}
