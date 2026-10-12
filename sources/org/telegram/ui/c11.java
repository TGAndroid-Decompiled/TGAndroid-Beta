package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class c11 extends View {
    public int f34672a;
    public int f34673b;
    public final f11 f34674c;

    public c11(f11 f11Var, Context context) {
        super(context);
        this.f34674c = f11Var;
        this.f34672a = 0;
        this.f34673b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f34673b;
        ProfileActivity profileActivity = this.f34674c.e;
        int i13 = 0;
        if (i12 != profileActivity.f32528a.getMeasuredHeight()) {
            this.f34672a = 0;
        }
        this.f34673b = profileActivity.f32528a.getMeasuredHeight();
        int childCount = profileActivity.f32528a.getChildCount();
        if (childCount == profileActivity.d.e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f32528a.getChildAt(i15);
                profileActivity.f32528a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f32528a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f32528a.getMeasuredWidth();
            this.f34672a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f32528a.getMeasuredWidth(), this.f34672a);
    }
}
