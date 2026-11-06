package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gw0 extends View {
    public int f46103a;
    public int f46104b;
    public final jw0 f46105c;

    public gw0(jw0 jw0Var, Context context) {
        super(context);
        this.f46105c = jw0Var;
        this.f46103a = 0;
        this.f46104b = 0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        int i11 = this.f46104b;
        ProfileActivity profileActivity = this.f46105c.f47027e;
        int i12 = 0;
        if (i11 != profileActivity.f41663a.getMeasuredHeight()) {
            this.f46103a = 0;
        }
        this.f46104b = profileActivity.f41663a.getMeasuredHeight();
        int childCount = profileActivity.f41663a.getChildCount();
        if (childCount == profileActivity.d.f47027e.M2) {
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = profileActivity.f41663a.getChildAt(i14);
                profileActivity.f41663a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.B3) {
                    i13 += profileActivity.f41663a.getChildAt(i14).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22531m) - i13;
            if (currentActionBarHeight > profileActivity.j4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i12 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f41663a.getMeasuredWidth();
            this.f46103a = i12;
            setMeasuredDimension(measuredWidth, i12);
            return;
        }
        setMeasuredDimension(profileActivity.f41663a.getMeasuredWidth(), this.f46103a);
    }
}
