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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.vo0;
public final class i2 extends org.telegram.ui.ActionBar.k3 {
    public final fi.h1 f36664b;
    public final ArrayList f36665c;
    public boolean d;
    public FrameLayout e;
    public Integer f36666f;

    public i2(Context context, org.telegram.ui.ActionBar.u6 u6Var, View... viewArr) {
        super(1, context, u6Var, true);
        List asList = Arrays.asList(viewArr);
        ArrayList arrayList = new ArrayList();
        this.f36665c = arrayList;
        if (asList != null) {
            arrayList.addAll(asList);
        }
        f2 f2Var = new f2(this, context);
        this.containerView = f2Var;
        fi.h1 h1Var = new fi.h1(this, context, 9);
        this.f36664b = h1Var;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        f2Var.addView(h1Var, gb1.i(-1, -1, 119));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f36664b.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.f36664b.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        View[] viewPages;
        fi.h1 h1Var = this.f36664b;
        if (h1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        for (View view : h1Var.getViewPages()) {
            if (view != null) {
                AndroidUtilities.hideKeyboard(view);
            }
        }
        h1Var.E(h1Var.getCurrentPosition() - 1);
    }

    public final void r(h2 h2Var) {
        this.f36665c.add(h2Var);
        if (this.d) {
            fi.h1 h1Var = this.f36664b;
            h1Var.D(false);
            h1Var.o(false);
        }
    }

    public final void s(int i10) {
        this.f36666f = Integer.valueOf(i10);
        setBackgroundColor(i10);
        fixNavigationBar(i10);
        ((f2) this.containerView).invalidate();
    }

    @Override
    public final void show() {
        if (!this.d) {
            this.d = true;
            this.f36664b.setAdapter(new vo0(this, 1));
        }
        super.show();
        Integer num = this.f36666f;
        if (num != null) {
            setOverlayNavBarColor(num.intValue());
        }
    }

    public final void t(LinearLayout linearLayout) {
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.e = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.e.setClipToPadding(false);
            this.containerView.addView(this.e, gb1.i(-1, -2, 80));
        } else {
            frameLayout.removeAllViews();
        }
        this.e.addView(linearLayout, gb1.i(-1, -2, 80));
        fi.h1 h1Var = this.f36664b;
        int i10 = this.backgroundPaddingLeft;
        h1Var.setPadding(i10, 0, i10, 0);
        ((f2) this.containerView).requestLayout();
    }
}
