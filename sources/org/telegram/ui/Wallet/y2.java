package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class y2 extends org.telegram.ui.ActionBar.v2 {
    public final fi.g1 f43385i1;
    public final ArrayList f43386j1;
    public boolean f43387k1;
    public FrameLayout l1;
    public Integer f43388m1;

    public y2(Context context, org.telegram.ui.ActionBar.f6 f6Var, View... viewArr) {
        super(1, context, f6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.f43386j1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        v2 v2Var = new v2(this, context);
        this.f28619b = v2Var;
        fi.g1 g1Var = new fi.g1(8, context, this);
        this.f43385i1 = g1Var;
        int i7 = this.f28649t0;
        g1Var.setPadding(i7, 0, i7, org.telegram.messenger.g0.f22558n);
        v2Var.addView(g1Var, c8.ha.e(-1, -1, 119));
    }

    @Override
    public final boolean G() {
        if (this.f43385i1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean I(MotionEvent motionEvent) {
        if (this.f43385i1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void I0(x2 x2Var) {
        this.f43386j1.add(x2Var);
        if (this.f43387k1) {
            fi.g1 g1Var = this.f43385i1;
            g1Var.D(false);
            g1Var.o(false);
        }
    }

    public final void J0(int i7) {
        this.f43388m1 = Integer.valueOf(i7);
        v0(i7);
        O(i7);
        ((v2) this.f28619b).invalidate();
    }

    public final void K0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.l1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.l1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.l1.setClipToPadding(false);
            this.f28619b.addView(this.l1, c8.ha.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.l1.addView(linearLayout, c8.ha.e(-1, -2, 80));
        fi.g1 g1Var = this.f43385i1;
        int i7 = this.f28649t0;
        g1Var.setPadding(i7, 0, i7, 0);
        ((v2) this.f28619b).requestLayout();
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        fi.g1 g1Var = this.f43385i1;
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
        if (!this.f43387k1) {
            this.f43387k1 = true;
            this.f43385i1.setAdapter(new ii.x(this, 3));
        }
        super.show();
        Integer num = this.f43388m1;
        if (num != null) {
            E0(num.intValue());
        }
    }
}
