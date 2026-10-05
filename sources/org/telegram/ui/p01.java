package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class p01 extends View {
    public int f39321a;
    public int f39322b;
    public final s01 f39323c;

    public p01(s01 s01Var, Context context) {
        super(context);
        this.f39323c = s01Var;
        this.f39321a = 0;
        this.f39322b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f39322b;
        ProfileActivity profileActivity = this.f39323c.f40298e;
        int i13 = 0;
        if (i12 != profileActivity.f34221a.getMeasuredHeight()) {
            this.f39321a = 0;
        }
        this.f39322b = profileActivity.f34221a.getMeasuredHeight();
        int childCount = profileActivity.f34221a.getChildCount();
        if (childCount == profileActivity.d.f40298e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f34221a.getChildAt(i15);
                profileActivity.f34221a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f34221a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f34221a.getMeasuredWidth();
            this.f39321a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f34221a.getMeasuredWidth(), this.f39321a);
    }
}
