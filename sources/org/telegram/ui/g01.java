package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class g01 extends View {
    public int f39515a;
    public int f39516b;
    public final j01 f39517c;

    public g01(j01 j01Var, Context context) {
        super(context);
        this.f39517c = j01Var;
        this.f39515a = 0;
        this.f39516b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f39516b;
        ProfileActivity profileActivity = this.f39517c.e;
        int i13 = 0;
        if (i12 != profileActivity.f35948a.getMeasuredHeight()) {
            this.f39515a = 0;
        }
        this.f39516b = profileActivity.f35948a.getMeasuredHeight();
        int childCount = profileActivity.f35948a.getChildCount();
        if (childCount == profileActivity.d.e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f35948a.getChildAt(i15);
                profileActivity.f35948a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f35948a.getChildAt(i15).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i14;
            if (currentActionBarHeight > profileActivity.c4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i13 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f35948a.getMeasuredWidth();
            this.f39515a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f35948a.getMeasuredWidth(), this.f39515a);
    }
}
