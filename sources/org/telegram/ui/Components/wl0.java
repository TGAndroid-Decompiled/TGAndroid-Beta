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

public final class wl0 implements View.OnLongClickListener {

    public final int f34286a;

    public final int f34287b;

    public final FrameLayout f34288c;

    public wl0(FrameLayout frameLayout, int i10, int i11) {
        this.f34286a = i11;
        this.f34288c = frameLayout;
        this.f34287b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        zl0 zl0Var;
        org.telegram.ui.gf gfVar;
        char c10;
        String string;
        switch (this.f34286a) {
            case 0:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f34288c;
                return (scrollSlidingTextTabStrip.f26522j0 || (zl0Var = scrollSlidingTextTabStrip.f26510b) == null || !zl0Var.l1(this.f34287b, view)) ? false : true;
            default:
                sg.b bVar = ((sg.g) this.f34288c).f47922n;
                if (bVar != null) {
                    org.telegram.ui.rn rnVar = ((org.telegram.ui.oe) bVar).f41069b;
                    int i10 = this.f34287b;
                    if (i10 == 2) {
                        gfVar = new org.telegram.ui.gf(rnVar, 10);
                        c10 = 1;
                    } else if (i10 == 3) {
                        gfVar = new org.telegram.ui.gf(rnVar, 11);
                        c10 = 0;
                    } else if (i10 == 4) {
                        gfVar = new org.telegram.ui.gf(rnVar, 12);
                        c10 = 2;
                    }
                    Activity parentActivity = rnVar.getParentActivity();
                    org.telegram.ui.ActionBar.b5 parentLayout = rnVar.getParentLayout();
                    org.telegram.ui.jm jmVar = rnVar.T0;
                    org.telegram.ui.ActionBar.c6 resourceProvider = rnVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, parentActivity, resourceProvider, true, true);
                    f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    if (c10 == 0) {
                        string = LocaleController.getString(R.string.ReadAllReactions);
                    } else {
                        string = c10 == 1 ? LocaleController.getString(R.string.ReadAllMentions) : LocaleController.getString(R.string.ReadAllPollVotes);
                    }
                    f1Var.g(string, R.drawable.msg_seen, null);
                    f1Var.setOnClickListener(new org.telegram.ui.wx0(1, gfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                    org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    n1Var.f23684e = true;
                    n1Var.f23683c = 220;
                    n1Var.setOutsideTouchable(true);
                    n1Var.setClippingEnabled(true);
                    n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    n1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    n1Var.setInputMethodMode(2);
                    n1Var.setSoftInputMode(0);
                    n1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    qg.j.b(view, jmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    n1Var.showAtLocation(jmVar, 51, (int) width, (int) measuredHeight);
                    rnVar.M8 = n1Var;
                    rnVar.f8(rnVar.f42041f1, false);
                    rnVar.M8.setOnDismissListener(new org.telegram.ui.h0(rnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
        }
    }
}
