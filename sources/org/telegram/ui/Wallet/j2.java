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
import org.telegram.ui.mo0;
public final class j2 extends org.telegram.ui.ActionBar.f3 {
    public final ei.h1 f34381b;
    public final ArrayList f34382c;
    public boolean d;
    public FrameLayout e;
    public Integer f34383f;

    public j2(Context context, org.telegram.ui.ActionBar.d6 d6Var, View... viewArr) {
        super(1, context, d6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.f34382c = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        g2 g2Var = new g2(this, context);
        this.containerView = g2Var;
        ei.h1 h1Var = new ei.h1(this, context, 9);
        this.f34381b = h1Var;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        g2Var.addView(h1Var, w7.z5.e(-1, -1, 119));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f34381b.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.f34381b.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        ei.h1 h1Var = this.f34381b;
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
            this.f34381b.setAdapter(new mo0(this, 1));
        }
        super.show();
        Integer num = this.f34383f;
        if (num != null) {
            setOverlayNavBarColor(num.intValue());
        }
    }

    public final void t(i2 i2Var) {
        this.f34382c.add(i2Var);
        if (this.d) {
            ei.h1 h1Var = this.f34381b;
            h1Var.C(false);
            h1Var.o(false);
        }
    }

    public final void u(int i10) {
        this.f34383f = Integer.valueOf(i10);
        setBackgroundColor(i10);
        fixNavigationBar(i10);
        ((g2) this.containerView).invalidate();
    }

    public final void v(LinearLayout linearLayout) {
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
        ei.h1 h1Var = this.f34381b;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, 0);
        ((g2) this.containerView).requestLayout();
    }
}
