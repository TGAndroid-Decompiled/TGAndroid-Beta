package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class c11 extends View {
    public int f31485a;
    public int f31486b;
    public final f11 f31487c;

    public c11(f11 f11Var, Context context) {
        super(context);
        this.f31487c = f11Var;
        this.f31485a = 0;
        this.f31486b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f31486b;
        ProfileActivity profileActivity = this.f31487c.e;
        int i13 = 0;
        if (i12 != profileActivity.f30350a.getMeasuredHeight()) {
            this.f31485a = 0;
        }
        this.f31486b = profileActivity.f30350a.getMeasuredHeight();
        int childCount = profileActivity.f30350a.getChildCount();
        if (childCount == profileActivity.d.e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f30350a.getChildAt(i15);
                profileActivity.f30350a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f30350a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f30350a.getMeasuredWidth();
            this.f31485a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f30350a.getMeasuredWidth(), this.f31485a);
    }
}
