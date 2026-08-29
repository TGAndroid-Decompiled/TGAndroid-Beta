package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class n51 extends hv0 {
    public final int f30860s0;

    public n51(Context context, org.telegram.ui.ActionBar.b5 b5Var, int i10) {
        super(context, b5Var);
        this.f30860s0 = i10;
    }

    @Override
    public boolean P() {
        switch (this.f30860s0) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
            default:
                return super.P();
            case 4:
                return false;
        }
    }

    @Override
    public void addView(View view) {
        switch (this.f30860s0) {
            case 3:
                if (view instanceof fz) {
                    ViewGroup.LayoutParams layoutParams = ((fz) view).getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) layoutParams).gravity = 87;
                    }
                    view.setLayoutParams(layoutParams);
                }
                super.addView(view);
                return;
            default:
                super.addView(view);
                return;
        }
    }

    @Override
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n51.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f30860s0) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
