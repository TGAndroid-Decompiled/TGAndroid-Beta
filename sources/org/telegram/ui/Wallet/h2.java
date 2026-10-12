package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.kp0;
public final class h2 extends org.telegram.ui.ActionBar.e3 {
    public final di.h1 f33225b;
    public final ArrayList f33226c;
    public boolean d;
    public FrameLayout e;
    public Integer f33227f;

    public h2(Context context, org.telegram.ui.ActionBar.c6 c6Var, View... viewArr) {
        super(1, context, c6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.f33226c = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        e2 e2Var = new e2(this, context);
        this.containerView = e2Var;
        di.h1 h1Var = new di.h1(this, context, 9);
        this.f33225b = h1Var;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        e2Var.addView(h1Var, w7.a6.e(-1, -1, 119));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f33225b.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.f33225b.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        di.h1 h1Var = this.f33225b;
        if (h1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : h1Var.getViewPages()) {
            if (view != null) {
                AndroidUtilities.hideKeyboard(view);
            }
        }
        h1Var.D(h1Var.getCurrentPosition() - 1);
    }

    @Override
    public final void show() {
        if (!this.d) {
            this.d = true;
            this.f33225b.setAdapter(new kp0(this, 1));
        }
        super.show();
        Integer num = this.f33227f;
        if (num != null) {
            setOverlayNavBarColor(num.intValue());
        }
    }

    public final void t(g2 g2Var) {
        this.f33226c.add(g2Var);
        if (this.d) {
            di.h1 h1Var = this.f33225b;
            h1Var.C(false);
            h1Var.o(false);
        }
    }

    public final void u(int i10) {
        this.f33227f = Integer.valueOf(i10);
        setBackgroundColor(i10);
        fixNavigationBar(i10);
        ((e2) this.containerView).invalidate();
    }

    public final void v(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.e = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.e.setClipToPadding(false);
            this.containerView.addView(this.e, w7.a6.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.e.addView(linearLayout, w7.a6.e(-1, -2, 80));
        di.h1 h1Var = this.f33225b;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, 0);
        ((e2) this.containerView).requestLayout();
    }
}
