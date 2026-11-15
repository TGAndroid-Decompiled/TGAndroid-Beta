package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w2 extends org.telegram.ui.ActionBar.u2 {
    public final hi.i1 f44619m1;
    public final ArrayList n1;
    public boolean f44620o1;
    public FrameLayout f44621p1;
    public Integer f44622q1;

    public w2(Context context, org.telegram.ui.ActionBar.e6 e6Var, View... viewArr) {
        super(1, context, e6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        t2 t2Var = new t2(this, context);
        this.f29682b = t2Var;
        hi.i1 i1Var = new hi.i1(8, context, this);
        this.f44619m1 = i1Var;
        int i7 = this.f29717u0;
        i1Var.setPadding(i7, 0, i7, org.telegram.messenger.g0.f23604n);
        t2Var.addView(i1Var, c8.ja.e(-1, -1, 119));
    }

    @Override
    public final boolean H() {
        if (this.f44619m1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void I0(v2 v2Var) {
        this.n1.add(v2Var);
        if (this.f44620o1) {
            hi.i1 i1Var = this.f44619m1;
            i1Var.B(false);
            i1Var.k(false);
        }
    }

    @Override
    public final boolean J(MotionEvent motionEvent) {
        if (this.f44619m1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void J0(int i7) {
        this.f44622q1 = Integer.valueOf(i7);
        v0(i7);
        P(i7);
        ((t2) this.f29682b).invalidate();
    }

    public final void K0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.f44621p1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f44621p1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.f44621p1.setClipToPadding(false);
            this.f29682b.addView(this.f44621p1, c8.ja.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.f44621p1.addView(linearLayout, c8.ja.e(-1, -2, 80));
        hi.i1 i1Var = this.f44619m1;
        int i7 = this.f29717u0;
        i1Var.setPadding(i7, 0, i7, 0);
        ((t2) this.f29682b).requestLayout();
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        hi.i1 i1Var = this.f44619m1;
        if (i1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : i1Var.getViewPages()) {
            if (view != null) {
                org.telegram.messenger.g0.v1(view);
            }
        }
        i1Var.C(i1Var.getCurrentPosition() - 1);
    }

    @Override
    public final void show() {
        if (!this.f44620o1) {
            this.f44620o1 = true;
            this.f44619m1.setAdapter(new li.x(this, 3));
        }
        super.show();
        Integer num = this.f44622q1;
        if (num != null) {
            E0(num.intValue());
        }
    }
}
