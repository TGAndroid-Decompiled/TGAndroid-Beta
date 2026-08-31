package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class f01 extends View {
    public int f36718a;
    public int f36719b;
    public final i01 f36720c;

    public f01(i01 i01Var, Context context) {
        super(context);
        this.f36720c = i01Var;
        this.f36718a = 0;
        this.f36719b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f36719b;
        ProfileActivity profileActivity = this.f36720c.f37715e;
        int i13 = 0;
        if (i12 != profileActivity.f34560a.getMeasuredHeight()) {
            this.f36718a = 0;
        }
        this.f36719b = profileActivity.f34560a.getMeasuredHeight();
        int childCount = profileActivity.f34560a.getChildCount();
        if (childCount == profileActivity.d.f37715e.K2) {
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
            this.f36718a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f34560a.getMeasuredWidth(), this.f36718a);
    }
}
