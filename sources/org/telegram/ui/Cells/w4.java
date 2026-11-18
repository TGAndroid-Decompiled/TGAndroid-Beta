package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.gd;
public final class w4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f32256a;
    public final FrameLayout f32257b;
    public int f32258c;
    public boolean d;

    public w4(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f32256a = i6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32257b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var), 8.0f));
        addView(frameLayout, c8.ma.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        n5Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        n5Var.setGravity(17);
        n5Var.setDrawablePadding(org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        n5Var.setTextSize(14);
        n5Var.l(gd.M0(2131751425, null), false);
        n5Var.setLeftDrawable(2131231104);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(n5Var, c8.ma.c(-1.0f, -1));
        frameLayout.setOutlineProvider(bg.u0.f3343b);
        frameLayout.setClipToOutline(true);
        c8.ra.b(frameLayout, 0.02f, 1.2f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(73.0f), 1073741824));
    }

    public void setOnButtonClick(View.OnClickListener onClickListener) {
        this.f32257b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f32256a);
            FrameLayout frameLayout = this.f32257b;
            if (frameLayout != null) {
                if (w02 == this.f32258c) {
                    if (this.d != org.telegram.ui.ActionBar.n6.I.q()) {
                    }
                }
                this.d = org.telegram.ui.ActionBar.n6.I.q();
                this.f32258c = w02;
                org.telegram.ui.ActionBar.n6.H1(frameLayout.getBackground(), w02, false);
                org.telegram.ui.ActionBar.n6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.b6.b(w02), true);
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
