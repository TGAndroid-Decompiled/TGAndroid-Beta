package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class p01 extends View {
    public int f39311a;
    public int f39312b;
    public final s01 f39313c;

    public p01(s01 s01Var, Context context) {
        super(context);
        this.f39313c = s01Var;
        this.f39311a = 0;
        this.f39312b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f39312b;
        ProfileActivity profileActivity = this.f39313c.f40323e;
        int i13 = 0;
        if (i12 != profileActivity.f34208a.getMeasuredHeight()) {
            this.f39311a = 0;
        }
        this.f39312b = profileActivity.f34208a.getMeasuredHeight();
        int childCount = profileActivity.f34208a.getChildCount();
        if (childCount == profileActivity.d.f40323e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f34208a.getChildAt(i15);
                profileActivity.f34208a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f34208a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f34208a.getMeasuredWidth();
            this.f39311a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f34208a.getMeasuredWidth(), this.f39311a);
    }
}
