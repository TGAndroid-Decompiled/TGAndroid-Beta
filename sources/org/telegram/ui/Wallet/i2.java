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
import org.telegram.ui.po0;
public final class i2 extends org.telegram.ui.ActionBar.h3 {
    public final ei.h1 f34594b;
    public final ArrayList f34595c;
    public boolean d;
    public FrameLayout e;
    public Integer f34596f;

    public i2(Context context, org.telegram.ui.ActionBar.g6 g6Var, View... viewArr) {
        super(1, context, g6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.f34595c = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        f2 f2Var = new f2(this, context);
        this.containerView = f2Var;
        ei.h1 h1Var = new ei.h1(this, context, 9);
        this.f34594b = h1Var;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        f2Var.addView(h1Var, w7.z5.e(-1, -1, 119));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f34594b.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.f34594b.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        ei.h1 h1Var = this.f34594b;
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

    public final void s(h2 h2Var) {
        this.f34595c.add(h2Var);
        if (this.d) {
            ei.h1 h1Var = this.f34594b;
            h1Var.C(false);
            h1Var.o(false);
        }
    }

    @Override
    public final void show() {
        if (!this.d) {
            this.d = true;
            this.f34594b.setAdapter(new po0(this, 1));
        }
        super.show();
        Integer num = this.f34596f;
        if (num != null) {
            setOverlayNavBarColor(num.intValue());
        }
    }

    public final void t(int i10) {
        this.f34596f = Integer.valueOf(i10);
        setBackgroundColor(i10);
        fixNavigationBar(i10);
        ((f2) this.containerView).invalidate();
    }

    public final void u(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.e = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.e.setClipToPadding(false);
            this.containerView.addView(this.e, w7.z5.e(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.e.addView(linearLayout, w7.z5.e(-1, -2, 80));
        ei.h1 h1Var = this.f34594b;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, 0);
        ((f2) this.containerView).requestLayout();
    }
}
