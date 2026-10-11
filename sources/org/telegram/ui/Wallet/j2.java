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
import org.telegram.ui.cp0;
public final class j2 extends org.telegram.ui.ActionBar.e3 {
    public final ci.h1 f35135b;
    public final ArrayList f35136c;
    public boolean d;
    public FrameLayout f35137e;
    public Integer f35138f;

    public j2(Context context, org.telegram.ui.ActionBar.d6 d6Var, View... viewArr) {
        super(1, context, d6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.f35136c = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        g2 g2Var = new g2(this, context);
        this.containerView = g2Var;
        ci.h1 h1Var = new ci.h1(this, context, 9);
        this.f35135b = h1Var;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        g2Var.addView(h1Var, w7.x5.e(-1, -1, 119));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f35135b.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.f35135b.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        ci.h1 h1Var = this.f35135b;
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
            this.f35135b.setAdapter(new cp0(this, 1));
        }
        super.show();
        Integer num = this.f35138f;
        if (num != null) {
            setOverlayNavBarColor(num.intValue());
        }
    }

    public final void t(i2 i2Var) {
        this.f35136c.add(i2Var);
        if (this.d) {
            ci.h1 h1Var = this.f35135b;
            h1Var.C(false);
            h1Var.o(false);
        }
    }

    public final void u(int i10) {
        this.f35138f = Integer.valueOf(i10);
        setBackgroundColor(i10);
        fixNavigationBar(i10);
        ((g2) this.containerView).invalidate();
    }

    public final void v(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.f35137e;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f35137e = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.f35137e.setClipToPadding(false);
            this.containerView.addView(this.f35137e, w7.x5.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.f35137e.addView(linearLayout, w7.x5.e(-1, -2, 80));
        ci.h1 h1Var = this.f35135b;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, 0);
        ((g2) this.containerView).requestLayout();
    }
}
