package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class iw0 extends View {
    public int f46767a;
    public int f46768b;
    public final lw0 f46769c;

    public iw0(lw0 lw0Var, Context context) {
        super(context);
        this.f46769c = lw0Var;
        this.f46767a = 0;
        this.f46768b = 0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        int i11 = this.f46768b;
        ProfileActivity profileActivity = this.f46769c.f47690e;
        int i12 = 0;
        if (i11 != profileActivity.f41698a.getMeasuredHeight()) {
            this.f46767a = 0;
        }
        this.f46768b = profileActivity.f41698a.getMeasuredHeight();
        int childCount = profileActivity.f41698a.getChildCount();
        if (childCount == profileActivity.d.f47690e.M2) {
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = profileActivity.f41698a.getChildAt(i14);
                profileActivity.f41698a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.B3) {
                    i13 += profileActivity.f41698a.getChildAt(i14).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22557m) - i13;
            if (currentActionBarHeight > profileActivity.j4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i12 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f41698a.getMeasuredWidth();
            this.f46767a = i12;
            setMeasuredDimension(measuredWidth, i12);
            return;
        }
        setMeasuredDimension(profileActivity.f41698a.getMeasuredWidth(), this.f46767a);
    }
}
