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
public final class gm0 implements View.OnLongClickListener {
    public final int f28918a;
    public final int f28919b;
    public final FrameLayout f28920c;

    public gm0(FrameLayout frameLayout, int i10, int i11) {
        this.f28918a = i11;
        this.f28920c = frameLayout;
        this.f28919b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        jm0 jm0Var;
        org.telegram.ui.df dfVar;
        char c3;
        String string;
        switch (this.f28918a) {
            case 0:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f28920c;
                if (!scrollSlidingTextTabStrip.f26537j0 && (jm0Var = scrollSlidingTextTabStrip.f26525b) != null && jm0Var.i1(this.f28919b, view)) {
                    return true;
                }
                return false;
            default:
                ug.b bVar = ((ug.g) this.f28920c).f49238n;
                if (bVar != null) {
                    org.telegram.ui.tn tnVar = ((org.telegram.ui.me) bVar).f40541b;
                    int i10 = this.f28919b;
                    if (i10 == 2) {
                        dfVar = new org.telegram.ui.df(tnVar, 10);
                        c3 = 1;
                    } else if (i10 == 3) {
                        dfVar = new org.telegram.ui.df(tnVar, 11);
                        c3 = 0;
                    } else if (i10 == 4) {
                        dfVar = new org.telegram.ui.df(tnVar, 12);
                        c3 = 2;
                    }
                    Activity parentActivity = tnVar.getParentActivity();
                    org.telegram.ui.ActionBar.b5 parentLayout = tnVar.getParentLayout();
                    org.telegram.ui.km kmVar = tnVar.T0;
                    org.telegram.ui.ActionBar.c6 resourceProvider = tnVar.getResourceProvider();
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
                    g1Var.setOnClickListener(new org.telegram.ui.vx0(1, dfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    o1Var.f23712e = true;
                    o1Var.f23711c = 220;
                    o1Var.setOutsideTouchable(true);
                    o1Var.setClippingEnabled(true);
                    o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    o1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    o1Var.setInputMethodMode(2);
                    o1Var.setSoftInputMode(0);
                    o1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    sg.i.b(view, kmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    o1Var.showAtLocation(kmVar, 51, (int) width, (int) measuredHeight);
                    tnVar.M8 = o1Var;
                    tnVar.f8(tnVar.f42803f1, false);
                    tnVar.M8.setOnDismissListener(new org.telegram.ui.h0(tnVar, 1));
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
