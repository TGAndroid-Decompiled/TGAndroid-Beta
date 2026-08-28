package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class b51 extends xu0 {
    public final int f27045s0;

    public b51(Context context, org.telegram.ui.ActionBar.b5 b5Var, int i9) {
        super(context, b5Var);
        this.f27045s0 = i9;
    }

    @Override
    public boolean P() {
        switch (this.f27045s0) {
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
        switch (this.f27045s0) {
            case 3:
                if (view instanceof wy) {
                    ViewGroup.LayoutParams layoutParams = ((wy) view).getLayoutParams();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b51.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f27045s0) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }
}
