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
    public final int f34439a;
    public final k4 f34440b;

    public c3(k4 k4Var, int i10) {
        this.f34439a = i10;
        this.f34440b = k4Var;
    }

    @Override
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.o9 o9Var;
        switch (this.f34439a) {
            case 0:
                k4 k4Var = this.f34440b;
                if (k4Var.J0 && (articleViewer$WindowView = k4Var.f37264f0) != null) {
                    k4Var.J0 = false;
                    if (k4Var.f42175b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        k4Var.Z(((org.telegram.ui.Components.m11) k4Var.f42175b.f24357i).f26885b);
                        k4Var.f42175b = null;
                        k4Var.d = null;
                        View view = k4Var.f42177f;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                    View view2 = k4Var.f42177f;
                    if (view2 != null && k4Var.O0.f0(view2)) {
                        if (k4Var.f42177f.getTag() != null && k4Var.f42177f.getTag() == "bottomSheet" && (o9Var = k4Var.P0) != null) {
                            o9Var.l0();
                        } else {
                            k4Var.O0.l0();
                        }
                        if (k4Var.O0.x()) {
                            try {
                                k4Var.f37264f0.performHapticFeedback(0, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    } else if (k4Var.d != null && k4Var.f42177f != null) {
                        try {
                            k4Var.f37264f0.performHapticFeedback(0, 2);
                        } catch (Exception unused3) {
                        }
                        int[] iArr = new int[2];
                        k4Var.f42177f.getLocationInWindow(iArr);
                        int dp = (iArr[1] + k4Var.e) - AndroidUtilities.dp(54.0f);
                        if (dp < 0) {
                            dp = 0;
                        }
                        k4Var.f42177f.invalidate();
                        k4Var.h = true;
                        View view3 = k4Var.f42177f;
                        org.telegram.ui.ActionBar.m1 m1Var = k4Var.H;
                        if (m1Var != null && m1Var.isShowing()) {
                            k4Var.H.d(true);
                        } else {
                            if (k4Var.A0 == null) {
                                k4Var.C0 = new Rect();
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(k4Var.L, null);
                                k4Var.A0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                                k4Var.A0.setBackgroundDrawable(k4Var.L.getResources().getDrawable(R.drawable.menu_copy));
                                k4Var.A0.setAnimationEnabled(false);
                                k4Var.A0.setOnTouchListener(new e0(k4Var, 0));
                                k4Var.A0.setDispatchKeyEventListener(new t(k4Var));
                                k4Var.A0.setShownFromBottom(false);
                                TextView textView = new TextView(k4Var.L);
                                k4Var.B0 = textView;
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19690i6, false), 2, -1));
                                k4Var.B0.setGravity(16);
                                k4Var.B0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                                k4Var.B0.setTextSize(1, 15.0f);
                                k4Var.B0.setTypeface(AndroidUtilities.bold());
                                k4Var.B0.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                                k4Var.B0.setOnClickListener(new s(k4Var, 5));
                                k4Var.A0.addView(k4Var.B0, w7.z5.d(48.0f, -2));
                                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(k4Var.A0, -2, -2);
                                k4Var.H = m1Var2;
                                m1Var2.f20220b = false;
                                m1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                k4Var.H.setOutsideTouchable(true);
                                k4Var.H.setClippingEnabled(true);
                                k4Var.H.setInputMethodMode(2);
                                k4Var.H.setSoftInputMode(0);
                                k4Var.H.getContentView().setFocusableInTouchMode(true);
                                k4Var.H.setOnDismissListener(new f0(k4Var, 0));
                            }
                            k4Var.B0.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false));
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = k4Var.A0;
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false));
                            }
                            k4Var.A0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            k4Var.H.setFocusable(true);
                            k4Var.H.showAtLocation(view3, 48, 0, dp);
                            k4Var.H.h();
                        }
                        k4Var.f37278u0[0].f38529b.setLayoutFrozen(true);
                        k4Var.f37278u0[0].f38529b.setLayoutFrozen(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                k4 k4Var2 = this.f34440b;
                if (k4Var2.K0 == null) {
                    k4Var2.K0 = new c3(k4Var2, 0);
                }
                k4Var2.K0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = k4Var2.f37264f0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(k4Var2.K0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                }
                return;
        }
    }
}
