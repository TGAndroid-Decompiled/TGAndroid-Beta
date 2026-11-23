package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class iw0 extends View {
    public int f48838a;
    public int f48839b;
    public final lw0 f48840c;

    public iw0(lw0 lw0Var, Context context) {
        super(context);
        this.f48840c = lw0Var;
        this.f48838a = 0;
        this.f48839b = 0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        int i11 = this.f48839b;
        ProfileActivity profileActivity = this.f48840c.f49684e;
        int i12 = 0;
        if (i11 != profileActivity.f43518a.getMeasuredHeight()) {
            this.f48838a = 0;
        }
        this.f48839b = profileActivity.f43518a.getMeasuredHeight();
        int childCount = profileActivity.f43518a.getChildCount();
        if (childCount == profileActivity.d.f49684e.O2) {
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = profileActivity.f43518a.getChildAt(i14);
                profileActivity.f43518a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.D3) {
                    i13 += profileActivity.f43518a.getChildAt(i14).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f24004m) - i13;
            if (currentActionBarHeight > profileActivity.j4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i12 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f43518a.getMeasuredWidth();
            this.f48838a = i12;
            setMeasuredDimension(measuredWidth, i12);
            return;
        }
        setMeasuredDimension(profileActivity.f43518a.getMeasuredWidth(), this.f48838a);
    }
}
