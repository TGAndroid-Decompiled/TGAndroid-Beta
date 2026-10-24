package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class b01 extends View {
    public int f35875a;
    public int f35876b;
    public final e01 f35877c;

    public b01(e01 e01Var, Context context) {
        super(context);
        this.f35877c = e01Var;
        this.f35875a = 0;
        this.f35876b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f35876b;
        ProfileActivity profileActivity = this.f35877c.e;
        int i13 = 0;
        if (i12 != profileActivity.f33884a.getMeasuredHeight()) {
            this.f35875a = 0;
        }
        this.f35876b = profileActivity.f33884a.getMeasuredHeight();
        int childCount = profileActivity.f33884a.getChildCount();
        if (childCount == profileActivity.d.e.O2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f33884a.getChildAt(i15);
                profileActivity.f33884a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.D3) {
                    i14 += profileActivity.f33884a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f33884a.getMeasuredWidth();
            this.f35875a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f33884a.getMeasuredWidth(), this.f35875a);
    }
}
