package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b3 implements Runnable {
    public final int f35904a;
    public final k4 f35905b;

    public b3(k4 k4Var, int i10) {
        this.f35904a = i10;
        this.f35905b = k4Var;
    }

    @Override
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.o9 o9Var;
        switch (this.f35904a) {
            case 0:
                k4 k4Var = this.f35905b;
                if (k4Var.K0 && (articleViewer$WindowView = k4Var.f38760f0) != null) {
                    k4Var.K0 = false;
                    if (k4Var.f37215b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        k4Var.Z(((org.telegram.ui.Components.l11) k4Var.f37215b.f32544i).f28131b);
                        k4Var.f37215b = null;
                        k4Var.d = null;
                        View view = k4Var.f37217f;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                    View view2 = k4Var.f37217f;
                    if (view2 != null && k4Var.P0.f0(view2)) {
                        if (k4Var.f37217f.getTag() != null && k4Var.f37217f.getTag() == "bottomSheet" && (o9Var = k4Var.Q0) != null) {
                            o9Var.l0();
                        } else {
                            k4Var.P0.l0();
                        }
                        if (k4Var.P0.x()) {
                            try {
                                k4Var.f38760f0.performHapticFeedback(0, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    } else if (k4Var.d != null && k4Var.f37217f != null) {
                        try {
                            k4Var.f38760f0.performHapticFeedback(0, 2);
                        } catch (Exception unused3) {
                        }
                        int[] iArr = new int[2];
                        k4Var.f37217f.getLocationInWindow(iArr);
                        int dp = (iArr[1] + k4Var.e) - AndroidUtilities.dp(54.0f);
                        if (dp < 0) {
                            dp = 0;
                        }
                        k4Var.f37217f.invalidate();
                        k4Var.h = true;
                        View view3 = k4Var.f37217f;
                        org.telegram.ui.ActionBar.m1 m1Var = k4Var.H;
                        if (m1Var != null && m1Var.isShowing()) {
                            k4Var.H.d(true);
                        } else {
                            if (k4Var.B0 == null) {
                                k4Var.D0 = new Rect();
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(k4Var.L, null);
                                k4Var.B0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                                k4Var.B0.setBackgroundDrawable(k4Var.L.getResources().getDrawable(R.drawable.menu_copy));
                                k4Var.B0.setAnimationEnabled(false);
                                k4Var.B0.setOnTouchListener(new d0(k4Var, 0));
                                k4Var.B0.setDispatchKeyEventListener(new s(k4Var));
                                k4Var.B0.setShownFromBottom(false);
                                TextView textView = new TextView(k4Var.L);
                                k4Var.C0 = textView;
                                int i10 = org.telegram.ui.ActionBar.k6.f21273i6;
                                org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 2, -1);
                                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
                                textView.setBackground(g02);
                                org.telegram.ui.ActionBar.r6.k(textView, g02, null, O, null);
                                k4Var.C0.setGravity(16);
                                k4Var.C0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                                k4Var.C0.setTextSize(1, 15.0f);
                                k4Var.C0.setTypeface(AndroidUtilities.bold());
                                k4Var.C0.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                                k4Var.C0.setOnClickListener(new r(k4Var, 5));
                                k4Var.B0.addView(k4Var.C0, w7.z5.c(48.0f, -2));
                                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(k4Var.B0, -2, -2);
                                k4Var.H = m1Var2;
                                m1Var2.f21631b = false;
                                m1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                k4Var.H.setOutsideTouchable(true);
                                k4Var.H.setClippingEnabled(true);
                                k4Var.H.setInputMethodMode(2);
                                k4Var.H.setSoftInputMode(0);
                                k4Var.H.getContentView().setFocusableInTouchMode(true);
                                k4Var.H.setOnDismissListener(new e0(k4Var, 0));
                            }
                            org.telegram.ui.ActionBar.r6.W(k4Var.C0, org.telegram.ui.ActionBar.k6.E8, null);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = k4Var.B0;
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                            }
                            k4Var.B0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            k4Var.H.setFocusable(true);
                            k4Var.H.showAtLocation(view3, 48, 0, dp);
                            k4Var.H.h();
                        }
                        k4Var.f38774u0[0].f39702b.setLayoutFrozen(true);
                        k4Var.f38774u0[0].f39702b.setLayoutFrozen(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                k4 k4Var2 = this.f35905b;
                if (k4Var2.L0 == null) {
                    k4Var2.L0 = new b3(k4Var2, 0);
                }
                k4Var2.L0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = k4Var2.f38760f0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(k4Var2.L0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                }
                return;
        }
    }
}
