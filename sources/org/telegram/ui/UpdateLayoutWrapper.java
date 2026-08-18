package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class UpdateLayoutWrapper extends ViewGroup {
    private boolean lastUpdateLayoutVisible;
    private final Paint paint;
    private View updateLayout;

    public UpdateLayoutWrapper(Context context) {
        super(context);
        this.paint = new Paint(1);
        setClipToPadding(false);
    }

    @Override
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        this.updateLayout = view;
    }

    public boolean isUpdateLayoutVisible() {
        View view = this.updateLayout;
        return view != null && view.getVisibility() == 0;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        boolean zIsUpdateLayoutVisible = isUpdateLayoutVisible();
        int size = View.MeasureSpec.getSize(i);
        int iDp = zIsUpdateLayoutVisible ? AndroidUtilities.dp(44.0f) + getPaddingBottom() : 0;
        setMeasuredDimension(size, iDp);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iDp, 1073741824);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        if (this.lastUpdateLayoutVisible != zIsUpdateLayoutVisible) {
            this.lastUpdateLayoutVisible = zIsUpdateLayoutVisible;
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).setPadding(i, i2, i3, i4);
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        int paddingBottom = getPaddingBottom();
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(0.1f, 0.75f, paddingBottom);
        int color = Theme.getColor(Theme.key_featuredStickers_addButton);
        int iCompositeColors = ColorUtils.compositeColors(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhite), navigationBarThirdButtonsFactor), color);
        this.paint.setColor(color);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - paddingBottom, this.paint);
        this.paint.setColor(iCompositeColors);
        canvas.drawRect(0.0f, getMeasuredHeight() - paddingBottom, getMeasuredWidth(), getMeasuredHeight(), this.paint);
        super.dispatchDraw(canvas);
    }
}
