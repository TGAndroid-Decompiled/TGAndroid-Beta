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
    public final int f31143a;
    public final j4 f31144b;

    public b3(j4 j4Var, int i10) {
        this.f31143a = i10;
        this.f31144b = j4Var;
    }

    @Override
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.s9 s9Var;
        switch (this.f31143a) {
            case 0:
                j4 j4Var = this.f31144b;
                if (j4Var.J0 && (articleViewer$WindowView = j4Var.f33906f0) != null) {
                    j4Var.J0 = false;
                    if (j4Var.f36855b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        j4Var.Z(((org.telegram.ui.Components.x01) j4Var.f36855b.f25465i).f28901b);
                        j4Var.f36855b = null;
                        j4Var.d = null;
                        View view = j4Var.f36857f;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                    View view2 = j4Var.f36857f;
                    if (view2 != null && j4Var.O0.g0(view2)) {
                        if (j4Var.f36857f.getTag() != null && j4Var.f36857f.getTag() == "bottomSheet" && (s9Var = j4Var.P0) != null) {
                            s9Var.m0();
                        } else {
                            j4Var.O0.m0();
                        }
                        if (j4Var.O0.y()) {
                            try {
                                j4Var.f33906f0.performHapticFeedback(0, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    } else if (j4Var.d != null && j4Var.f36857f != null) {
                        try {
                            j4Var.f33906f0.performHapticFeedback(0, 2);
                        } catch (Exception unused3) {
                        }
                        int[] iArr = new int[2];
                        j4Var.f36857f.getLocationInWindow(iArr);
                        int dp = (iArr[1] + j4Var.e) - AndroidUtilities.dp(54.0f);
                        if (dp < 0) {
                            dp = 0;
                        }
                        j4Var.f36857f.invalidate();
                        j4Var.h = true;
                        View view3 = j4Var.f36857f;
                        org.telegram.ui.ActionBar.p1 p1Var = j4Var.H;
                        if (p1Var != null && p1Var.isShowing()) {
                            j4Var.H.d(true);
                        } else {
                            if (j4Var.A0 == null) {
                                j4Var.C0 = new Rect();
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(j4Var.L, null);
                                j4Var.A0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                                j4Var.A0.setBackgroundDrawable(j4Var.L.getResources().getDrawable(R.drawable.menu_copy));
                                j4Var.A0.setAnimationEnabled(false);
                                j4Var.A0.setOnTouchListener(new e0(j4Var, 0));
                                j4Var.A0.setDispatchKeyEventListener(new u(j4Var));
                                j4Var.A0.setShownFromBottom(false);
                                TextView textView = new TextView(j4Var.L);
                                j4Var.B0 = textView;
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 2, -1));
                                j4Var.B0.setGravity(16);
                                j4Var.B0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                                j4Var.B0.setTextSize(1, 15.0f);
                                j4Var.B0.setTypeface(AndroidUtilities.bold());
                                j4Var.B0.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                                j4Var.B0.setOnClickListener(new t(j4Var, 5));
                                j4Var.A0.addView(j4Var.B0, w7.a6.c(48.0f, -2));
                                org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(j4Var.A0, -2, -2);
                                j4Var.H = p1Var2;
                                p1Var2.f18534b = false;
                                p1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                j4Var.H.setOutsideTouchable(true);
                                j4Var.H.setClippingEnabled(true);
                                j4Var.H.setInputMethodMode(2);
                                j4Var.H.setSoftInputMode(0);
                                j4Var.H.getContentView().setFocusableInTouchMode(true);
                                j4Var.H.setOnDismissListener(new f0(j4Var, 0));
                            }
                            j4Var.B0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = j4Var.A0;
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false));
                            }
                            j4Var.A0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            j4Var.H.setFocusable(true);
                            j4Var.H.showAtLocation(view3, 48, 0, dp);
                            j4Var.H.h();
                        }
                        j4Var.f33920u0[0].f35102b.setLayoutFrozen(true);
                        j4Var.f33920u0[0].f35102b.setLayoutFrozen(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                j4 j4Var2 = this.f31144b;
                if (j4Var2.K0 == null) {
                    j4Var2.K0 = new b3(j4Var2, 0);
                }
                j4Var2.K0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = j4Var2.f33906f0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(j4Var2.K0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                }
                return;
        }
    }
}
