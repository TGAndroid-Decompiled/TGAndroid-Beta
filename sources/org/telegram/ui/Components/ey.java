package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class ey extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int f26136a;
    public boolean f26137b;
    public final FrameLayout f26138c;
    public final rz d;

    public ey(rz rzVar, Context context) {
        super(context);
        this.d = rzVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f21817a;
        o6 o6Var = new o6(getContext(), false, false, false);
        o6Var.b(0.3f, 250L, zr.h);
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.k6.Sh;
        org.telegram.ui.ActionBar.g6 g6Var = rzVar.Z1;
        org.telegram.ui.ActionBar.r6.a0(o6Var, i10, g6Var);
        o6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f26138c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{8.0f}, rzVar.A(org.telegram.ui.ActionBar.k6.Oh)));
        frameLayout.addView(o6Var, w7.z5.e(-1, -2, 17));
        addView(frameLayout, w7.z5.c(-1.0f, -1));
        sg.p0 p0Var = new sg.p0(getContext(), g6Var, false);
        p0Var.setIcon(R.raw.unlock_icon);
        addView(p0Var, w7.z5.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int A = this.d.A(org.telegram.ui.ActionBar.k6.Oh);
            FrameLayout frameLayout = this.f26138c;
            if (frameLayout != null) {
                if (A == this.f26136a) {
                    if (this.f26137b != org.telegram.ui.ActionBar.k6.I.q()) {
                    }
                }
                this.f26137b = org.telegram.ui.ActionBar.k6.I.q();
                this.f26136a = A;
                org.telegram.ui.ActionBar.k6.E1(frameLayout.getBackground(), A, false);
                org.telegram.ui.ActionBar.k6.E1(frameLayout.getBackground(), org.telegram.ui.ActionBar.a6.b(A), true);
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
