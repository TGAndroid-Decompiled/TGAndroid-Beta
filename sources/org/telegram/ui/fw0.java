package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class fw0 extends View {
    public int f47198a;
    public int f47199b;
    public final iw0 f47200c;

    public fw0(iw0 iw0Var, Context context) {
        super(context);
        this.f47200c = iw0Var;
        this.f47198a = 0;
        this.f47199b = 0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        int i11 = this.f47199b;
        ProfileActivity profileActivity = this.f47200c.f48123e;
        int i12 = 0;
        if (i11 != profileActivity.f43062a.getMeasuredHeight()) {
            this.f47198a = 0;
        }
        this.f47199b = profileActivity.f43062a.getMeasuredHeight();
        int childCount = profileActivity.f43062a.getChildCount();
        if (childCount == profileActivity.d.f48123e.O2) {
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = profileActivity.f43062a.getChildAt(i14);
                profileActivity.f43062a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.D3) {
                    i13 += profileActivity.f43062a.getChildAt(i14).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f23605m) - i13;
            if (currentActionBarHeight > profileActivity.i4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i12 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f43062a.getMeasuredWidth();
            this.f47198a = i12;
            setMeasuredDimension(measuredWidth, i12);
            return;
        }
        setMeasuredDimension(profileActivity.f43062a.getMeasuredWidth(), this.f47198a);
    }
}
