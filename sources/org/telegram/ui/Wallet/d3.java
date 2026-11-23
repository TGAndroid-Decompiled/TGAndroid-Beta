package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class d3 extends org.telegram.ui.ActionBar.w2 {
    public final hi.h1 f44039m1;
    public final ArrayList n1;
    public boolean f44040o1;
    public FrameLayout f44041p1;
    public Integer f44042q1;

    public d3(Context context, org.telegram.ui.ActionBar.h6 h6Var, View... viewArr) {
        super(1, context, h6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        a3 a3Var = new a3(this, context);
        this.f30142b = a3Var;
        hi.h1 h1Var = new hi.h1(8, context, this);
        this.f44039m1 = h1Var;
        int i7 = this.f30177u0;
        h1Var.setPadding(i7, 0, i7, org.telegram.messenger.g0.f24005n);
        a3Var.addView(h1Var, c8.na.e(-1, -1, 119));
    }

    @Override
    public final boolean G() {
        if (this.f44039m1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean J(MotionEvent motionEvent) {
        if (this.f44039m1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void J0(c3 c3Var) {
        this.n1.add(c3Var);
        if (this.f44040o1) {
            hi.h1 h1Var = this.f44039m1;
            h1Var.z(false);
            h1Var.j(false);
        }
    }

    public final void K0(int i7) {
        this.f44042q1 = Integer.valueOf(i7);
        v0(i7);
        P(i7);
        ((a3) this.f30142b).invalidate();
    }

    public final void L0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.f44041p1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f44041p1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.f44041p1.setClipToPadding(false);
            this.f30142b.addView(this.f44041p1, c8.na.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.f44041p1.addView(linearLayout, c8.na.e(-1, -2, 80));
        hi.h1 h1Var = this.f44039m1;
        int i7 = this.f30177u0;
        h1Var.setPadding(i7, 0, i7, 0);
        ((a3) this.f30142b).requestLayout();
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        hi.h1 h1Var = this.f44039m1;
        if (h1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : h1Var.getViewPages()) {
            if (view != null) {
                org.telegram.messenger.g0.v1(view);
            }
        }
        h1Var.A(h1Var.getCurrentPosition() - 1);
    }

    @Override
    public final void show() {
        if (!this.f44040o1) {
            this.f44040o1 = true;
            this.f44039m1.setAdapter(new li.x(this, 3));
        }
        super.show();
        Integer num = this.f44042q1;
        if (num != null) {
            E0(num.intValue());
        }
    }
}
