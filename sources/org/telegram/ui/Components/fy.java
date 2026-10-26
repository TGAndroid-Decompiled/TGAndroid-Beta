package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class fy extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int f28333a;
    public boolean f28334b;
    public final FrameLayout f28335c;
    public final sz d;

    public fy(sz szVar, Context context) {
        super(context);
        this.d = szVar;
        org.telegram.ui.ActionBar.e7 e7Var = org.telegram.ui.ActionBar.f7.f22627a;
        s6 s6Var = new s6(getContext(), false, false, false);
        s6Var.b(0.3f, 250L, ds.h);
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.y6.Sh;
        org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i10, u6Var);
        s6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f28335c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{8.0f}, szVar.A(org.telegram.ui.ActionBar.y6.Oh)));
        frameLayout.addView(s6Var, gb1.i(-1, -2, 17));
        addView(frameLayout, gb1.g(-1.0f, -1));
        tg.p0 p0Var = new tg.p0(getContext(), u6Var, false);
        p0Var.setIcon(R.raw.unlock_icon);
        addView(p0Var, gb1.g(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int A = this.d.A(org.telegram.ui.ActionBar.y6.Oh);
            FrameLayout frameLayout = this.f28335c;
            if (frameLayout != null) {
                if (A == this.f28333a) {
                    if (this.f28334b != org.telegram.ui.ActionBar.y6.I.q()) {
                    }
                }
                this.f28334b = org.telegram.ui.ActionBar.y6.I.q();
                this.f28333a = A;
                org.telegram.ui.ActionBar.y6.E1(frameLayout.getBackground(), A, false);
                org.telegram.ui.ActionBar.y6.E1(frameLayout.getBackground(), org.telegram.ui.ActionBar.o6.b(A), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
