package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class em0 extends FrameLayout {
    public View f26091a;

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = this.f26091a;
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
        int i12 = 0;
        if (view != null) {
            i12 = Math.max(0, (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom());
        }
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setViewportView(View view) {
        if (this.f26091a == view) {
            return;
        }
        this.f26091a = view;
        requestLayout();
    }
}
