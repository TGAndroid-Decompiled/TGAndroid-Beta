package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class hw0 extends View {
    public int f48533a;
    public int f48534b;
    public final lw0 f48535c;

    public hw0(lw0 lw0Var, Context context) {
        super(context);
        this.f48535c = lw0Var;
        this.f48533a = 0;
        this.f48534b = 0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        int i11 = this.f48534b;
        ProfileActivity profileActivity = this.f48535c.f49714e;
        int i12 = 0;
        if (i11 != profileActivity.f43549a.getMeasuredHeight()) {
            this.f48533a = 0;
        }
        this.f48534b = profileActivity.f43549a.getMeasuredHeight();
        int childCount = profileActivity.f43549a.getChildCount();
        if (childCount == profileActivity.d.f49714e.O2) {
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = profileActivity.f43549a.getChildAt(i14);
                profileActivity.f43549a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.D3) {
                    i13 += profileActivity.f43549a.getChildAt(i14).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f24140m) - i13;
            if (currentActionBarHeight > profileActivity.j4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i12 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f43549a.getMeasuredWidth();
            this.f48533a = i12;
            setMeasuredDimension(measuredWidth, i12);
            return;
        }
        setMeasuredDimension(profileActivity.f43549a.getMeasuredWidth(), this.f48533a);
    }
}
