package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class p01 extends View {
    public int f39305a;
    public int f39306b;
    public final s01 f39307c;

    public p01(s01 s01Var, Context context) {
        super(context);
        this.f39307c = s01Var;
        this.f39305a = 0;
        this.f39306b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f39306b;
        ProfileActivity profileActivity = this.f39307c.f40317e;
        int i13 = 0;
        if (i12 != profileActivity.f34201a.getMeasuredHeight()) {
            this.f39305a = 0;
        }
        this.f39306b = profileActivity.f34201a.getMeasuredHeight();
        int childCount = profileActivity.f34201a.getChildCount();
        if (childCount == profileActivity.d.f40317e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f34201a.getChildAt(i15);
                profileActivity.f34201a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f34201a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f34201a.getMeasuredWidth();
            this.f39305a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f34201a.getMeasuredWidth(), this.f39305a);
    }
}
