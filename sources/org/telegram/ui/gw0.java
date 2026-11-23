package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gw0 extends View {
    public int f48367a;
    public int f48368b;
    public final jw0 f48369c;

    public gw0(jw0 jw0Var, Context context) {
        super(context);
        this.f48369c = jw0Var;
        this.f48367a = 0;
        this.f48368b = 0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        int i11 = this.f48368b;
        ProfileActivity profileActivity = this.f48369c.f49218e;
        int i12 = 0;
        if (i11 != profileActivity.f43634a.getMeasuredHeight()) {
            this.f48367a = 0;
        }
        this.f48368b = profileActivity.f43634a.getMeasuredHeight();
        int childCount = profileActivity.f43634a.getChildCount();
        if (childCount == profileActivity.d.f49218e.O2) {
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = profileActivity.f43634a.getChildAt(i14);
                profileActivity.f43634a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.D3) {
                    i13 += profileActivity.f43634a.getChildAt(i14).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f24220m) - i13;
            if (currentActionBarHeight > profileActivity.j4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i12 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f43634a.getMeasuredWidth();
            this.f48367a = i12;
            setMeasuredDimension(measuredWidth, i12);
            return;
        }
        setMeasuredDimension(profileActivity.f43634a.getMeasuredWidth(), this.f48367a);
    }
}
