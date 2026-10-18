package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class a01 extends View {
    public int f35224a;
    public int f35225b;
    public final d01 f35226c;

    public a01(d01 d01Var, Context context) {
        super(context);
        this.f35226c = d01Var;
        this.f35224a = 0;
        this.f35225b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f35225b;
        ProfileActivity profileActivity = this.f35226c.e;
        int i13 = 0;
        if (i12 != profileActivity.f33568a.getMeasuredHeight()) {
            this.f35224a = 0;
        }
        this.f35225b = profileActivity.f33568a.getMeasuredHeight();
        int childCount = profileActivity.f33568a.getChildCount();
        if (childCount == profileActivity.d.e.O2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f33568a.getChildAt(i15);
                profileActivity.f33568a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.D3) {
                    i14 += profileActivity.f33568a.getChildAt(i15).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i14;
            if (currentActionBarHeight > profileActivity.T3()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i13 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f33568a.getMeasuredWidth();
            this.f35224a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f33568a.getMeasuredWidth(), this.f35224a);
    }
}
