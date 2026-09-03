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
public final class pm0 implements View.OnLongClickListener {
    public final int f27928a;
    public final int f27929b;
    public final FrameLayout f27930c;

    public pm0(FrameLayout frameLayout, int i10, int i11) {
        this.f27928a = i11;
        this.f27930c = frameLayout;
        this.f27929b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        sm0 sm0Var;
        org.telegram.ui.nf nfVar;
        char c3;
        String string;
        switch (this.f27928a) {
            case 0:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f27930c;
                if (!scrollSlidingTextTabStrip.f23140k0 && (sm0Var = scrollSlidingTextTabStrip.f23128b) != null && sm0Var.k1(this.f27929b, view)) {
                    return true;
                }
                return false;
            default:
                wg.b bVar = ((wg.g) this.f27930c).f46642n;
                if (bVar != null) {
                    org.telegram.ui.zn znVar = ((org.telegram.ui.ve) bVar).f39079b;
                    int i10 = this.f27929b;
                    if (i10 == 2) {
                        nfVar = new org.telegram.ui.nf(znVar, 10);
                        c3 = 1;
                    } else if (i10 == 3) {
                        nfVar = new org.telegram.ui.nf(znVar, 11);
                        c3 = 0;
                    } else if (i10 == 4) {
                        nfVar = new org.telegram.ui.nf(znVar, 12);
                        c3 = 2;
                    }
                    Activity parentActivity = znVar.getParentActivity();
                    org.telegram.ui.ActionBar.e5 parentLayout = znVar.getParentLayout();
                    org.telegram.ui.rm rmVar = znVar.U0;
                    org.telegram.ui.ActionBar.f6 resourceProvider = znVar.getResourceProvider();
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
                    g1Var.setOnClickListener(new org.telegram.ui.ny0(1, nfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    p1Var.e = true;
                    p1Var.f20492c = 220;
                    p1Var.setOutsideTouchable(true);
                    p1Var.setClippingEnabled(true);
                    p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    p1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    p1Var.setInputMethodMode(2);
                    p1Var.setSoftInputMode(0);
                    p1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    ug.i.b(view, rmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    p1Var.showAtLocation(rmVar, 51, (int) width, (int) measuredHeight);
                    znVar.N8 = p1Var;
                    znVar.f8(znVar.f40589g1, false);
                    znVar.N8.setOnDismissListener(new org.telegram.ui.h0(znVar, 1));
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
