package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class hw0 extends View {
    public int f48537a;
    public int f48538b;
    public final lw0 f48539c;

    public hw0(lw0 lw0Var, Context context) {
        super(context);
        this.f48539c = lw0Var;
        this.f48537a = 0;
        this.f48538b = 0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        int i11 = this.f48538b;
        ProfileActivity profileActivity = this.f48539c.f49718e;
        int i12 = 0;
        if (i11 != profileActivity.f43553a.getMeasuredHeight()) {
            this.f48537a = 0;
        }
        this.f48538b = profileActivity.f43553a.getMeasuredHeight();
        int childCount = profileActivity.f43553a.getChildCount();
        if (childCount == profileActivity.d.f49718e.O2) {
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = profileActivity.f43553a.getChildAt(i14);
                profileActivity.f43553a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.D3) {
                    i13 += profileActivity.f43553a.getChildAt(i14).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f24040m) - i13;
            if (currentActionBarHeight > profileActivity.j4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i12 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f43553a.getMeasuredWidth();
            this.f48537a = i12;
            setMeasuredDimension(measuredWidth, i12);
            return;
        }
        setMeasuredDimension(profileActivity.f43553a.getMeasuredWidth(), this.f48537a);
    }
}
