package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class c01 extends View {
    public int f36206a;
    public int f36207b;
    public final f01 f36208c;

    public c01(f01 f01Var, Context context) {
        super(context);
        this.f36208c = f01Var;
        this.f36206a = 0;
        this.f36207b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f36207b;
        ProfileActivity profileActivity = this.f36208c.e;
        int i13 = 0;
        if (i12 != profileActivity.f33882a.getMeasuredHeight()) {
            this.f36206a = 0;
        }
        this.f36207b = profileActivity.f33882a.getMeasuredHeight();
        int childCount = profileActivity.f33882a.getChildCount();
        if (childCount == profileActivity.d.e.O2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f33882a.getChildAt(i15);
                profileActivity.f33882a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.D3) {
                    i14 += profileActivity.f33882a.getChildAt(i15).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i14;
            if (currentActionBarHeight > profileActivity.V3()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i13 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f33882a.getMeasuredWidth();
            this.f36206a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f33882a.getMeasuredWidth(), this.f36206a);
    }
}
