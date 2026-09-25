package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class n01 extends View {
    public int f35720a;
    public int f35721b;
    public final q01 f35722c;

    public n01(q01 q01Var, Context context) {
        super(context);
        this.f35722c = q01Var;
        this.f35720a = 0;
        this.f35721b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f35721b;
        ProfileActivity profileActivity = this.f35722c.e;
        int i13 = 0;
        if (i12 != profileActivity.f31525a.getMeasuredHeight()) {
            this.f35720a = 0;
        }
        this.f35721b = profileActivity.f31525a.getMeasuredHeight();
        int childCount = profileActivity.f31525a.getChildCount();
        if (childCount == profileActivity.d.e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f31525a.getChildAt(i15);
                profileActivity.f31525a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f31525a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f31525a.getMeasuredWidth();
            this.f35720a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f31525a.getMeasuredWidth(), this.f35720a);
    }
}
