package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b8.mf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class x2 extends org.telegram.ui.ActionBar.t2 {
    public final gi.g1 f43389j1;
    public final ArrayList k1;
    public boolean f43390l1;
    public FrameLayout m1;
    public Integer f43391n1;

    public x2(Context context, org.telegram.ui.ActionBar.e6 e6Var, View... viewArr) {
        super(1, context, e6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.k1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        u2 u2Var = new u2(this, context);
        this.f28586b = u2Var;
        gi.g1 g1Var = new gi.g1(8, context, this);
        this.f43389j1 = g1Var;
        int i3 = this.f28618u0;
        g1Var.setPadding(i3, 0, i3, org.telegram.messenger.g0.f22603n);
        u2Var.addView(g1Var, mf.e(-1, -1, 119));
    }

    @Override
    public final boolean G() {
        if (this.f43389j1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean I(MotionEvent motionEvent) {
        if (this.f43389j1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void I0(w2 w2Var) {
        this.k1.add(w2Var);
        if (this.f43390l1) {
            gi.g1 g1Var = this.f43389j1;
            g1Var.C(false);
            g1Var.k(false);
        }
    }

    public final void J0(int i3) {
        this.f43391n1 = Integer.valueOf(i3);
        v0(i3);
        O(i3);
        ((u2) this.f28586b).invalidate();
    }

    public final void K0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.m1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.m1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.m1.setClipToPadding(false);
            this.f28586b.addView(this.m1, mf.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.m1.addView(linearLayout, mf.e(-1, -2, 80));
        gi.g1 g1Var = this.f43389j1;
        int i3 = this.f28618u0;
        g1Var.setPadding(i3, 0, i3, 0);
        ((u2) this.f28586b).requestLayout();
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        gi.g1 g1Var = this.f43389j1;
        if (g1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : g1Var.getViewPages()) {
            if (view != null) {
                org.telegram.messenger.g0.v1(view);
            }
        }
        g1Var.D(g1Var.getCurrentPosition() - 1);
    }

    @Override
    public final void show() {
        if (!this.f43390l1) {
            this.f43390l1 = true;
            this.f43389j1.setAdapter(new ji.v(this, 3));
        }
        super.show();
        Integer num = this.f43391n1;
        if (num != null) {
            E0(num.intValue());
        }
    }
}
