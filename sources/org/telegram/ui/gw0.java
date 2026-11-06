package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gw0 extends View {
    public int f46122a;
    public int f46123b;
    public final jw0 f46124c;

    public gw0(jw0 jw0Var, Context context) {
        super(context);
        this.f46124c = jw0Var;
        this.f46122a = 0;
        this.f46123b = 0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        int i11 = this.f46123b;
        ProfileActivity profileActivity = this.f46124c.f47049e;
        int i12 = 0;
        if (i11 != profileActivity.f41687a.getMeasuredHeight()) {
            this.f46122a = 0;
        }
        this.f46123b = profileActivity.f41687a.getMeasuredHeight();
        int childCount = profileActivity.f41687a.getChildCount();
        if (childCount == profileActivity.d.f47049e.M2) {
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = profileActivity.f41687a.getChildAt(i14);
                profileActivity.f41687a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.B3) {
                    i13 += profileActivity.f41687a.getChildAt(i14).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22538m) - i13;
            if (currentActionBarHeight > profileActivity.j4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i12 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f41687a.getMeasuredWidth();
            this.f46122a = i12;
            setMeasuredDimension(measuredWidth, i12);
            return;
        }
        setMeasuredDimension(profileActivity.f41687a.getMeasuredWidth(), this.f46122a);
    }
}
