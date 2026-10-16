package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class b11 extends View {
    public int f34148a;
    public int f34149b;
    public final e11 f34150c;

    public b11(e11 e11Var, Context context) {
        super(context);
        this.f34150c = e11Var;
        this.f34148a = 0;
        this.f34149b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f34149b;
        ProfileActivity profileActivity = this.f34150c.e;
        int i13 = 0;
        if (i12 != profileActivity.f32230a.getMeasuredHeight()) {
            this.f34148a = 0;
        }
        this.f34149b = profileActivity.f32230a.getMeasuredHeight();
        int childCount = profileActivity.f32230a.getChildCount();
        if (childCount == profileActivity.d.e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f32230a.getChildAt(i15);
                profileActivity.f32230a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f32230a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f32230a.getMeasuredWidth();
            this.f34148a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f32230a.getMeasuredWidth(), this.f34148a);
    }
}
