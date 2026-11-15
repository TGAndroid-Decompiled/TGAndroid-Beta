package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.hd;
public final class w4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f31876a;
    public final FrameLayout f31877b;
    public int f31878c;
    public boolean d;

    public w4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f31876a = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31877b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var), 8.0f));
        addView(frameLayout, c8.ja.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        j5Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        j5Var.setGravity(17);
        j5Var.setDrawablePadding(org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.Ji, e6Var);
        j5Var.setTextSize(14);
        j5Var.l(hd.M0(2131751436, null), false);
        j5Var.setLeftDrawable(2131231104);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(j5Var, c8.ja.c(-1.0f, -1));
        frameLayout.setOutlineProvider(bg.t0.f3333b);
        frameLayout.setClipToOutline(true);
        c8.na.b(frameLayout, 0.02f, 1.2f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(73.0f), 1073741824));
    }

    public void setOnButtonClick(View.OnClickListener onClickListener) {
        this.f31877b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.f31876a);
            FrameLayout frameLayout = this.f31877b;
            if (frameLayout != null) {
                if (w02 == this.f31878c) {
                    if (this.d != org.telegram.ui.ActionBar.j6.I.q()) {
                    }
                }
                this.d = org.telegram.ui.ActionBar.j6.I.q();
                this.f31878c = w02;
                org.telegram.ui.ActionBar.j6.H1(frameLayout.getBackground(), w02, false);
                org.telegram.ui.ActionBar.j6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.y5.b(w02), true);
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
