package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class qm0 implements View.OnLongClickListener {
    public final int f28156a;
    public final int f28157b;
    public final FrameLayout f28158c;

    public qm0(FrameLayout frameLayout, int i10, int i11) {
        this.f28156a = i11;
        this.f28158c = frameLayout;
        this.f28157b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        tm0 tm0Var;
        org.telegram.ui.lf lfVar;
        char c3;
        String string;
        switch (this.f28156a) {
            case 0:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f28158c;
                if (!scrollSlidingTextTabStrip.f23167k0 && (tm0Var = scrollSlidingTextTabStrip.f23155b) != null && tm0Var.m1(this.f28157b, view)) {
                    return true;
                }
                return false;
            default:
                wg.b bVar = ((wg.g) this.f28158c).f46573n;
                if (bVar != null) {
                    org.telegram.ui.xn xnVar = ((org.telegram.ui.te) bVar).f38643b;
                    int i10 = this.f28157b;
                    if (i10 == 2) {
                        lfVar = new org.telegram.ui.lf(xnVar, 10);
                        c3 = 1;
                    } else if (i10 == 3) {
                        lfVar = new org.telegram.ui.lf(xnVar, 11);
                        c3 = 0;
                    } else if (i10 == 4) {
                        lfVar = new org.telegram.ui.lf(xnVar, 12);
                        c3 = 2;
                    }
                    Activity parentActivity = xnVar.getParentActivity();
                    org.telegram.ui.ActionBar.e5 parentLayout = xnVar.getParentLayout();
                    org.telegram.ui.pm pmVar = xnVar.U0;
                    org.telegram.ui.ActionBar.f6 resourceProvider = xnVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, parentActivity, resourceProvider, true, true);
                    g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    if (c3 == 0) {
                        string = LocaleController.getString(R.string.ReadAllReactions);
                    } else if (c3 == 1) {
                        string = LocaleController.getString(R.string.ReadAllMentions);
                    } else {
                        string = LocaleController.getString(R.string.ReadAllPollVotes);
                    }
                    g1Var.g(string, R.drawable.msg_seen, null);
                    g1Var.setOnClickListener(new org.telegram.ui.gy0(1, lfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    p1Var.e = true;
                    p1Var.f20517c = 220;
                    p1Var.setOutsideTouchable(true);
                    p1Var.setClippingEnabled(true);
                    p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    p1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    p1Var.setInputMethodMode(2);
                    p1Var.setSoftInputMode(0);
                    p1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    ug.i.b(view, pmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    p1Var.showAtLocation(pmVar, 51, (int) width, (int) measuredHeight);
                    xnVar.N8 = p1Var;
                    xnVar.f8(xnVar.f40023g1, false);
                    xnVar.N8.setOnDismissListener(new org.telegram.ui.g0(xnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
        }
    }
}
