package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class p01 extends View {
    public int f36286a;
    public int f36287b;
    public final s01 f36288c;

    public p01(s01 s01Var, Context context) {
        super(context);
        this.f36288c = s01Var;
        this.f36286a = 0;
        this.f36287b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f36287b;
        ProfileActivity profileActivity = this.f36288c.e;
        int i13 = 0;
        if (i12 != profileActivity.f31526a.getMeasuredHeight()) {
            this.f36286a = 0;
        }
        this.f36287b = profileActivity.f31526a.getMeasuredHeight();
        int childCount = profileActivity.f31526a.getChildCount();
        if (childCount == profileActivity.d.e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f31526a.getChildAt(i15);
                profileActivity.f31526a.getClass();
                int S = RecyclerView.S(childAt);
                if (S >= 0 && S != profileActivity.C3) {
                    i14 += profileActivity.f31526a.getChildAt(i15).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i14;
            if (currentActionBarHeight > profileActivity.T3()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i13 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f31526a.getMeasuredWidth();
            this.f36286a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f31526a.getMeasuredWidth(), this.f36286a);
    }
}
