package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.hk;
public final class y2 extends org.telegram.ui.ActionBar.z2 {
    public final hk f35407i1;
    public final ArrayList f35408j1;
    public boolean f35409k1;
    public FrameLayout l1;
    public Integer f35410m1;

    public y2(Context context, org.telegram.ui.ActionBar.p6 p6Var, View... viewArr) {
        super(1, context, p6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.f35408j1 = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        v2 v2Var = new v2(this, context);
        this.f21586b = v2Var;
        hk hkVar = new hk(this, context, 5);
        this.f35407i1 = hkVar;
        int i10 = this.f21615t0;
        hkVar.setPadding(i10, 0, i10, org.telegram.messenger.i0.f16021n);
        v2Var.addView(hkVar, w7.b6.e(-1, -1, 119));
    }

    @Override
    public final boolean H() {
        if (this.f35407i1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void I0(x2 x2Var) {
        this.f35408j1.add(x2Var);
        if (this.f35409k1) {
            hk hkVar = this.f35407i1;
            hkVar.D(false);
            hkVar.o(false);
        }
    }

    @Override
    public final boolean J(MotionEvent motionEvent) {
        if (this.f35407i1.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void J0(int i10) {
        this.f35410m1 = Integer.valueOf(i10);
        v0(i10);
        P(i10);
        ((v2) this.f21586b).invalidate();
    }

    public final void K0(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.l1;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.l1 = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.l1.setClipToPadding(false);
            this.f21586b.addView(this.l1, w7.b6.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.l1.addView(linearLayout, w7.b6.e(-1, -2, 80));
        hk hkVar = this.f35407i1;
        int i10 = this.f21615t0;
        hkVar.setPadding(i10, 0, i10, 0);
        ((v2) this.f21586b).requestLayout();
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        hk hkVar = this.f35407i1;
        if (hkVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : hkVar.getViewPages()) {
            if (view != null) {
                org.telegram.messenger.i0.v1(view);
            }
        }
        hkVar.E(hkVar.getCurrentPosition() - 1);
    }

    @Override
    public final void show() {
        if (!this.f35409k1) {
            this.f35409k1 = true;
            this.f35407i1.setAdapter(new ig.n(this, 3));
        }
        super.show();
        Integer num = this.f35410m1;
        if (num != null) {
            E0(num.intValue());
        }
    }
}
