package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.id;
public final class w4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f30740a;
    public final FrameLayout f30741b;
    public int f30742c;
    public boolean d;

    public w4(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f30740a = h6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30741b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var), 8.0f));
        addView(frameLayout, c8.ha.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        m5Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        m5Var.setGravity(17);
        m5Var.setDrawablePadding(org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.Gi, h6Var);
        m5Var.setTextSize(14);
        m5Var.l(id.M0(2131751436, null), false);
        m5Var.setLeftDrawable(2131231104);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(m5Var, c8.ha.c(-1.0f, -1));
        frameLayout.setOutlineProvider(bg.u0.f3381b);
        frameLayout.setClipToOutline(true);
        c8.ka.b(frameLayout, 0.02f, 1.2f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(73.0f), 1073741824));
    }

    public void setOnButtonClick(View.OnClickListener onClickListener) {
        this.f30741b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.f30740a);
            FrameLayout frameLayout = this.f30741b;
            if (frameLayout != null) {
                if (w02 == this.f30742c) {
                    if (this.d != org.telegram.ui.ActionBar.m6.I.q()) {
                    }
                }
                this.d = org.telegram.ui.ActionBar.m6.I.q();
                this.f30742c = w02;
                org.telegram.ui.ActionBar.m6.H1(frameLayout.getBackground(), w02, false);
                org.telegram.ui.ActionBar.m6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.b6.b(w02), true);
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
