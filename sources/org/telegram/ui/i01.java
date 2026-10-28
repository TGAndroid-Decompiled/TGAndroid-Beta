package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i01 extends View {
    public int f40016a;
    public int f40017b;
    public final l01 f40018c;

    public i01(l01 l01Var, Context context) {
        super(context);
        this.f40018c = l01Var;
        this.f40016a = 0;
        this.f40017b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f40017b;
        ProfileActivity profileActivity = this.f40018c.e;
        int i13 = 0;
        if (i12 != profileActivity.f35972a.getMeasuredHeight()) {
            this.f40016a = 0;
        }
        this.f40017b = profileActivity.f35972a.getMeasuredHeight();
        int childCount = profileActivity.f35972a.getChildCount();
        if (childCount == profileActivity.d.e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f35972a.getChildAt(i15);
                profileActivity.f35972a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f35972a.getChildAt(i15).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i14;
            if (currentActionBarHeight > profileActivity.c4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i13 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f35972a.getMeasuredWidth();
            this.f40016a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f35972a.getMeasuredWidth(), this.f40016a);
    }
}
