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
    public final int f35797a;
    public final l4 f35798b;

    public c3(l4 l4Var, int i10) {
        this.f35797a = i10;
        this.f35798b = l4Var;
    }

    @Override
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.n9 n9Var;
        switch (this.f35797a) {
            case 0:
                l4 l4Var = this.f35798b;
                if (l4Var.J0 && (articleViewer$WindowView = l4Var.f38760f0) != null) {
                    l4Var.J0 = false;
                    if (l4Var.f35532b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        l4Var.Z(((org.telegram.ui.Components.i11) l4Var.f35532b.f32580i).f27042b);
                        l4Var.f35532b = null;
                        l4Var.d = null;
                        View view = l4Var.f35534f;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                    View view2 = l4Var.f35534f;
                    if (view2 != null && l4Var.O0.f0(view2)) {
                        if (l4Var.f35534f.getTag() != null && l4Var.f35534f.getTag() == "bottomSheet" && (n9Var = l4Var.P0) != null) {
                            n9Var.l0();
                        } else {
                            l4Var.O0.l0();
                        }
                        if (l4Var.O0.x()) {
                            try {
                                l4Var.f38760f0.performHapticFeedback(0, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    } else if (l4Var.d != null && l4Var.f35534f != null) {
                        try {
                            l4Var.f38760f0.performHapticFeedback(0, 2);
                        } catch (Exception unused3) {
                        }
                        int[] iArr = new int[2];
                        l4Var.f35534f.getLocationInWindow(iArr);
                        int dp = (iArr[1] + l4Var.e) - AndroidUtilities.dp(54.0f);
                        if (dp < 0) {
                            dp = 0;
                        }
                        l4Var.f35534f.invalidate();
                        l4Var.h = true;
                        View view3 = l4Var.f35534f;
                        org.telegram.ui.ActionBar.m1 m1Var = l4Var.H;
                        if (m1Var != null && m1Var.isShowing()) {
                            l4Var.H.d(true);
                        } else {
                            if (l4Var.A0 == null) {
                                l4Var.C0 = new Rect();
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(l4Var.L, null);
                                l4Var.A0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                                l4Var.A0.setBackgroundDrawable(l4Var.L.getResources().getDrawable(R.drawable.menu_copy));
                                l4Var.A0.setAnimationEnabled(false);
                                l4Var.A0.setOnTouchListener(new e0(l4Var, 0));
                                l4Var.A0.setDispatchKeyEventListener(new t(l4Var));
                                l4Var.A0.setShownFromBottom(false);
                                TextView textView = new TextView(l4Var.L);
                                l4Var.B0 = textView;
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21078i6, false), 2, -1));
                                l4Var.B0.setGravity(16);
                                l4Var.B0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                                l4Var.B0.setTextSize(1, 15.0f);
                                l4Var.B0.setTypeface(AndroidUtilities.bold());
                                l4Var.B0.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                                l4Var.B0.setOnClickListener(new s(l4Var, 5));
                                l4Var.A0.addView(l4Var.B0, w7.z5.c(48.0f, -2));
                                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(l4Var.A0, -2, -2);
                                l4Var.H = m1Var2;
                                m1Var2.f21575b = false;
                                m1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                l4Var.H.setOutsideTouchable(true);
                                l4Var.H.setClippingEnabled(true);
                                l4Var.H.setInputMethodMode(2);
                                l4Var.H.setSoftInputMode(0);
                                l4Var.H.getContentView().setFocusableInTouchMode(true);
                                l4Var.H.setOnDismissListener(new f0(l4Var, 0));
                            }
                            l4Var.B0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = l4Var.A0;
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G8, false));
                            }
                            l4Var.A0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            l4Var.H.setFocusable(true);
                            l4Var.H.showAtLocation(view3, 48, 0, dp);
                            l4Var.H.h();
                        }
                        l4Var.f38774u0[0].f39748b.setLayoutFrozen(true);
                        l4Var.f38774u0[0].f39748b.setLayoutFrozen(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                l4 l4Var2 = this.f35798b;
                if (l4Var2.K0 == null) {
                    l4Var2.K0 = new c3(l4Var2, 0);
                }
                l4Var2.K0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = l4Var2.f38760f0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(l4Var2.K0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                }
                return;
        }
    }
}
