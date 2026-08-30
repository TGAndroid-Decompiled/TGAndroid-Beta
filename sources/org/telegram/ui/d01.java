package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class d01 extends View {
    public int f33471a;
    public int f33472b;
    public final g01 f33473c;

    public d01(g01 g01Var, Context context) {
        super(context);
        this.f33473c = g01Var;
        this.f33471a = 0;
        this.f33472b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f33472b;
        ProfileActivity profileActivity = this.f33473c.e;
        int i13 = 0;
        if (i12 != profileActivity.f32028a.getMeasuredHeight()) {
            this.f33471a = 0;
        }
        this.f33472b = profileActivity.f32028a.getMeasuredHeight();
        int childCount = profileActivity.f32028a.getChildCount();
        if (childCount == profileActivity.d.e.K2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f32028a.getChildAt(i15);
                profileActivity.f32028a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.f32204z3) {
                    i14 += profileActivity.f32028a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f32028a.getMeasuredWidth();
            this.f33471a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f32028a.getMeasuredWidth(), this.f33471a);
    }
}
