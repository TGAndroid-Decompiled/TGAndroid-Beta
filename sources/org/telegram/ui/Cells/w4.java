package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.hd;
public final class w4 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f30721a;
    public final FrameLayout f30722b;
    public int f30723c;
    public boolean d;

    public w4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f30721a = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30722b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.z5.e(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var), 8.0f));
        addView(frameLayout, c8.ha.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        k5Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        k5Var.setGravity(17);
        k5Var.setDrawablePadding(org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.Gi, f6Var);
        k5Var.setTextSize(14);
        k5Var.l(hd.M0(2131751437, null), false);
        k5Var.setLeftDrawable(2131231104);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(k5Var, c8.ha.c(-1.0f, -1));
        frameLayout.setOutlineProvider(bg.u0.f3381b);
        frameLayout.setClipToOutline(true);
        c8.ka.b(frameLayout, 0.02f, 1.2f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(73.0f), 1073741824));
    }

    public void setOnButtonClick(View.OnClickListener onClickListener) {
        this.f30722b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f30721a);
            FrameLayout frameLayout = this.f30722b;
            if (frameLayout != null) {
                if (w02 == this.f30723c) {
                    if (this.d != org.telegram.ui.ActionBar.k6.I.q()) {
                    }
                }
                this.d = org.telegram.ui.ActionBar.k6.I.q();
                this.f30723c = w02;
                org.telegram.ui.ActionBar.k6.H1(frameLayout.getBackground(), w02, false);
                org.telegram.ui.ActionBar.k6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.z5.b(w02), true);
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
