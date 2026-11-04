package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import b8.pf;
import java.util.HashSet;
import org.telegram.messenger.bd;
public final class w4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f30800a;
    public final FrameLayout f30801b;
    public int f30802c;
    public boolean d;

    public w4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f30800a = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30801b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var), 8.0f));
        addView(frameLayout, mf.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        k5Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        k5Var.setGravity(17);
        k5Var.setDrawablePadding(org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.Gi, e6Var);
        k5Var.setTextSize(14);
        k5Var.l(bd.M0(2131751437, null), false);
        k5Var.setLeftDrawable(2131231104);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(k5Var, mf.c(-1.0f, -1));
        frameLayout.setOutlineProvider(cg.t0.f4746b);
        frameLayout.setClipToOutline(true);
        pf.b(frameLayout, 0.02f, 1.2f);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(73.0f), 1073741824));
    }

    public void setOnButtonClick(View.OnClickListener onClickListener) {
        this.f30801b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f30800a);
            FrameLayout frameLayout = this.f30801b;
            if (frameLayout != null) {
                if (w02 == this.f30802c) {
                    if (this.d != org.telegram.ui.ActionBar.k6.I.q()) {
                    }
                }
                this.d = org.telegram.ui.ActionBar.k6.I.q();
                this.f30802c = w02;
                org.telegram.ui.ActionBar.k6.H1(frameLayout.getBackground(), w02, false);
                org.telegram.ui.ActionBar.k6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.y5.b(w02), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
