package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class jw0 extends View {
    public int f47086a;
    public int f47087b;
    public final mw0 f47088c;

    public jw0(mw0 mw0Var, Context context) {
        super(context);
        this.f47088c = mw0Var;
        this.f47086a = 0;
        this.f47087b = 0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        int i11 = this.f47087b;
        ProfileActivity profileActivity = this.f47088c.f48065e;
        int i12 = 0;
        if (i11 != profileActivity.f41689a.getMeasuredHeight()) {
            this.f47086a = 0;
        }
        this.f47087b = profileActivity.f41689a.getMeasuredHeight();
        int childCount = profileActivity.f41689a.getChildCount();
        if (childCount == profileActivity.d.f48065e.M2) {
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = profileActivity.f41689a.getChildAt(i14);
                profileActivity.f41689a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.B3) {
                    i13 += profileActivity.f41689a.getChildAt(i14).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22561m) - i13;
            if (currentActionBarHeight > profileActivity.j4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i12 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f41689a.getMeasuredWidth();
            this.f47086a = i12;
            setMeasuredDimension(measuredWidth, i12);
            return;
        }
        setMeasuredDimension(profileActivity.f41689a.getMeasuredWidth(), this.f47086a);
    }
}
