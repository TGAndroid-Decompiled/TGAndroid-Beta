package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k01 extends View {
    public int f35398a;
    public int f35399b;
    public final n01 f35400c;

    public k01(n01 n01Var, Context context) {
        super(context);
        this.f35400c = n01Var;
        this.f35398a = 0;
        this.f35399b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f35399b;
        ProfileActivity profileActivity = this.f35400c.e;
        int i13 = 0;
        if (i12 != profileActivity.f32002a.getMeasuredHeight()) {
            this.f35398a = 0;
        }
        this.f35399b = profileActivity.f32002a.getMeasuredHeight();
        int childCount = profileActivity.f32002a.getChildCount();
        if (childCount == profileActivity.d.e.K2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f32002a.getChildAt(i15);
                profileActivity.f32002a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.f32178z3) {
                    i14 += profileActivity.f32002a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f32002a.getMeasuredWidth();
            this.f35398a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f32002a.getMeasuredWidth(), this.f35398a);
    }
}
