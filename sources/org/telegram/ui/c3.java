package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class c3 implements Runnable {
    public final int f35671a;
    public final l4 f35672b;

    public c3(l4 l4Var, int i10) {
        this.f35671a = i10;
        this.f35672b = l4Var;
    }

    @Override
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.m9 m9Var;
        switch (this.f35671a) {
            case 0:
                l4 l4Var = this.f35672b;
                if (l4Var.G0 && (articleViewer$WindowView = l4Var.f38510c0) != null) {
                    l4Var.G0 = false;
                    if (l4Var.f39554b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        l4Var.Z(((org.telegram.ui.Components.o01) l4Var.f39554b.f27423i).f29630b);
                        l4Var.f39554b = null;
                        l4Var.d = null;
                        View view = l4Var.f39557f;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                    View view2 = l4Var.f39557f;
                    if (view2 != null && l4Var.L0.g0(view2)) {
                        if (l4Var.f39557f.getTag() != null && l4Var.f39557f.getTag() == "bottomSheet" && (m9Var = l4Var.M0) != null) {
                            m9Var.m0();
                        } else {
                            l4Var.L0.m0();
                        }
                        if (l4Var.L0.y()) {
                            try {
                                l4Var.f38510c0.performHapticFeedback(0, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    } else if (l4Var.d != null && l4Var.f39557f != null) {
                        try {
                            l4Var.f38510c0.performHapticFeedback(0, 2);
                        } catch (Exception unused3) {
                        }
                        int[] iArr = new int[2];
                        l4Var.f39557f.getLocationInWindow(iArr);
                        int dp = (iArr[1] + l4Var.f39556e) - AndroidUtilities.dp(54.0f);
                        if (dp < 0) {
                            dp = 0;
                        }
                        l4Var.f39557f.invalidate();
                        l4Var.h = true;
                        View view3 = l4Var.f39557f;
                        org.telegram.ui.ActionBar.p1 p1Var = l4Var.E;
                        if (p1Var != null && p1Var.isShowing()) {
                            l4Var.E.d(true);
                        } else {
                            if (l4Var.f38530x0 == null) {
                                l4Var.f38532z0 = new Rect();
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(l4Var.I, null);
                                l4Var.f38530x0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                                l4Var.f38530x0.setBackgroundDrawable(l4Var.I.getResources().getDrawable(R.drawable.menu_copy));
                                l4Var.f38530x0.setAnimationEnabled(false);
                                l4Var.f38530x0.setOnTouchListener(new f0(l4Var, 0));
                                l4Var.f38530x0.setDispatchKeyEventListener(new v(l4Var));
                                l4Var.f38530x0.setShownFromBottom(false);
                                TextView textView = new TextView(l4Var.I);
                                l4Var.f38531y0 = textView;
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), 2, -1));
                                l4Var.f38531y0.setGravity(16);
                                l4Var.f38531y0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                                l4Var.f38531y0.setTextSize(1, 15.0f);
                                l4Var.f38531y0.setTypeface(AndroidUtilities.bold());
                                l4Var.f38531y0.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                                l4Var.f38531y0.setOnClickListener(new u(l4Var, 5));
                                l4Var.f38530x0.addView(l4Var.f38531y0, k7.c6.c(48.0f, -2));
                                org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(l4Var.f38530x0, -2, -2);
                                l4Var.E = p1Var2;
                                p1Var2.f22218b = false;
                                p1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                l4Var.E.setOutsideTouchable(true);
                                l4Var.E.setClippingEnabled(true);
                                l4Var.E.setInputMethodMode(2);
                                l4Var.E.setSoftInputMode(0);
                                l4Var.E.getContentView().setFocusableInTouchMode(true);
                                l4Var.E.setOnDismissListener(new g0(l4Var, 0));
                            }
                            l4Var.f38531y0.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false));
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = l4Var.f38530x0;
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G8, false));
                            }
                            l4Var.f38530x0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            l4Var.E.setFocusable(true);
                            l4Var.E.showAtLocation(view3, 48, 0, dp);
                            l4Var.E.h();
                        }
                        l4Var.f38524r0[0].f39862b.setLayoutFrozen(true);
                        l4Var.f38524r0[0].f39862b.setLayoutFrozen(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                l4 l4Var2 = this.f35672b;
                if (l4Var2.H0 == null) {
                    l4Var2.H0 = new c3(l4Var2, 0);
                }
                l4Var2.H0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = l4Var2.f38510c0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(l4Var2.H0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                }
                return;
        }
    }
}
