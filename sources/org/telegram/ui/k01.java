package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k01 extends View {
    public int f38153a;
    public int f38154b;
    public final n01 f38155c;

    public k01(n01 n01Var, Context context) {
        super(context);
        this.f38155c = n01Var;
        this.f38153a = 0;
        this.f38154b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f38154b;
        ProfileActivity profileActivity = this.f38155c.f39152e;
        int i13 = 0;
        if (i12 != profileActivity.f34560a.getMeasuredHeight()) {
            this.f38153a = 0;
        }
        this.f38154b = profileActivity.f34560a.getMeasuredHeight();
        int childCount = profileActivity.f34560a.getChildCount();
        if (childCount == profileActivity.d.f39152e.K2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f34560a.getChildAt(i15);
                profileActivity.f34560a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.f34737z3) {
                    i14 += profileActivity.f34560a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f34560a.getMeasuredWidth();
            this.f38153a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f34560a.getMeasuredWidth(), this.f38153a);
    }
}
