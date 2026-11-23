package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class e3 extends org.telegram.ui.ActionBar.w2 {
    public final hi.q1 f44200m1;
    public final ArrayList n1;
    public boolean f44201o1;
    public FrameLayout f44202p1;
    public Integer f44203q1;

    public e3(Context context, org.telegram.ui.ActionBar.i6 i6Var, View... viewArr) {
        super(1, context, i6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        b3 b3Var = new b3(this, context);
        this.f30226b = b3Var;
        hi.q1 q1Var = new hi.q1(8, context, this);
        this.f44200m1 = q1Var;
        int i7 = this.f30261u0;
        q1Var.setPadding(i7, 0, i7, org.telegram.messenger.g0.f24221n);
        b3Var.addView(q1Var, c8.na.e(-1, -1, 119));
    }

    @Override
    public final boolean F() {
        if (this.f44200m1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean I(MotionEvent motionEvent) {
        if (this.f44200m1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void J0(d3 d3Var) {
        this.n1.add(d3Var);
        if (this.f44201o1) {
            hi.q1 q1Var = this.f44200m1;
            q1Var.A(false);
            q1Var.l(false);
        }
    }

    public final void K0(int i7) {
        this.f44203q1 = Integer.valueOf(i7);
        v0(i7);
        P(i7);
        ((b3) this.f30226b).invalidate();
    }

    public final void L0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.f44202p1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f44202p1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.f44202p1.setClipToPadding(false);
            this.f30226b.addView(this.f44202p1, c8.na.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.f44202p1.addView(linearLayout, c8.na.e(-1, -2, 80));
        hi.q1 q1Var = this.f44200m1;
        int i7 = this.f30261u0;
        q1Var.setPadding(i7, 0, i7, 0);
        ((b3) this.f30226b).requestLayout();
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        hi.q1 q1Var = this.f44200m1;
        if (q1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : q1Var.getViewPages()) {
            if (view != null) {
                org.telegram.messenger.g0.v1(view);
            }
        }
        q1Var.C(q1Var.getCurrentPosition() - 1);
    }

    @Override
    public final void show() {
        if (!this.f44201o1) {
            this.f44201o1 = true;
            this.f44200m1.setAdapter(new li.w(this, 3));
        }
        super.show();
        Integer num = this.f44203q1;
        if (num != null) {
            E0(num.intValue());
        }
    }
}
