package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class b80 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.n5 f35949a;
    public final org.telegram.ui.Components.i9 f35950b;
    public boolean f35951c;
    public int d;
    public final c80 e;

    public b80(c80 c80Var, Context context) {
        super(context);
        this.e = c80Var;
        int i10 = org.telegram.ui.ActionBar.k6.f21273i6;
        this.d = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f35949a = n5Var;
        n5Var.setTextSize(16);
        n5Var.setEllipsizeByGradient(true);
        n5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.f21290j5, null);
        addView(n5Var, w7.z5.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context, false);
        this.f35950b = i9Var;
        i9Var.f27369a.f26946a = true;
        i9Var.setStyle(11);
        i9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(i9Var, w7.z5.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 0, 4));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        this.f35951c = true;
        org.telegram.ui.ActionBar.n5 n5Var = this.f35949a;
        n5Var.setVisibility(8);
        super.onMeasure(i10, i11);
        n5Var.setVisibility(0);
        n5Var.getLayoutParams().width = getMeasuredWidth();
        this.f35951c = false;
        this.e.f();
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f35951c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21273i6, false);
            if (x02 != this.d) {
                this.d = x02;
                org.telegram.ui.ActionBar.k6.E1(getBackground(), x02, true);
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
