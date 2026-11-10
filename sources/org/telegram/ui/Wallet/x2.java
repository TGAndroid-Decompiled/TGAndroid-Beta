package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class x2 extends org.telegram.ui.ActionBar.w2 {
    public final fi.g1 l1;
    public final ArrayList f43321m1;
    public boolean n1;
    public FrameLayout f43322o1;
    public Integer f43323p1;

    public x2(Context context, org.telegram.ui.ActionBar.h6 h6Var, View... viewArr) {
        super(1, context, h6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.f43321m1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        u2 u2Var = new u2(this, context);
        this.f28672b = u2Var;
        fi.g1 g1Var = new fi.g1(8, context, this);
        this.l1 = g1Var;
        int i7 = this.f28705t0;
        g1Var.setPadding(i7, 0, i7, org.telegram.messenger.g0.f22562n);
        u2Var.addView(g1Var, c8.ha.e(-1, -1, 119));
    }

    @Override
    public final boolean G() {
        if (this.l1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean I(MotionEvent motionEvent) {
        if (this.l1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void I0(w2 w2Var) {
        this.f43321m1.add(w2Var);
        if (this.n1) {
            fi.g1 g1Var = this.l1;
            g1Var.D(false);
            g1Var.o(false);
        }
    }

    public final void J0(int i7) {
        this.f43323p1 = Integer.valueOf(i7);
        v0(i7);
        O(i7);
        ((u2) this.f28672b).invalidate();
    }

    public final void K0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.f43322o1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f43322o1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.f43322o1.setClipToPadding(false);
            this.f28672b.addView(this.f43322o1, c8.ha.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.f43322o1.addView(linearLayout, c8.ha.e(-1, -2, 80));
        fi.g1 g1Var = this.l1;
        int i7 = this.f28705t0;
        g1Var.setPadding(i7, 0, i7, 0);
        ((u2) this.f28672b).requestLayout();
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        fi.g1 g1Var = this.l1;
        if (g1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : g1Var.getViewPages()) {
            if (view != null) {
                org.telegram.messenger.g0.v1(view);
            }
        }
        g1Var.E(g1Var.getCurrentPosition() - 1);
    }

    @Override
    public final void show() {
        if (!this.n1) {
            this.n1 = true;
            this.l1.setAdapter(new ii.x(this, 3));
        }
        super.show();
        Integer num = this.f43323p1;
        if (num != null) {
            E0(num.intValue());
        }
    }
}
