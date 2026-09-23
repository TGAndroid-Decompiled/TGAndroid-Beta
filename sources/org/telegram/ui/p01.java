package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class p01 extends View {
    public int f35991a;
    public int f35992b;
    public final s01 f35993c;

    public p01(s01 s01Var, Context context) {
        super(context);
        this.f35993c = s01Var;
        this.f35991a = 0;
        this.f35992b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f35992b;
        ProfileActivity profileActivity = this.f35993c.e;
        int i13 = 0;
        if (i12 != profileActivity.f31209a.getMeasuredHeight()) {
            this.f35991a = 0;
        }
        this.f35992b = profileActivity.f31209a.getMeasuredHeight();
        int childCount = profileActivity.f31209a.getChildCount();
        if (childCount == profileActivity.d.e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f31209a.getChildAt(i15);
                profileActivity.f31209a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f31209a.getChildAt(i15).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i14;
            if (currentActionBarHeight > profileActivity.T3()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i13 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f31209a.getMeasuredWidth();
            this.f35991a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f31209a.getMeasuredWidth(), this.f35991a);
    }
}
