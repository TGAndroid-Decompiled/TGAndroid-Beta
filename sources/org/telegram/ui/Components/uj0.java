package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class uj0 extends FrameLayout {
    public View f38681a;

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = this.f38681a;
        if (view == null) {
            ViewParent parent = getParent();
            while (true) {
                if (parent instanceof View) {
                    if (parent instanceof RecyclerView) {
                        view = (RecyclerView) parent;
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    view = null;
                    break;
                }
            }
        }
        int i11 = 0;
        if (view != null) {
            i11 = Math.max(0, (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom());
        }
        if (i11 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setViewportView(View view) {
        if (this.f38681a == view) {
            return;
        }
        this.f38681a = view;
        requestLayout();
    }
}
