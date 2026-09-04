package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a3 implements Runnable {
    public final int f34309a;
    public final i4 f34310b;

    public a3(i4 i4Var, int i10) {
        this.f34309a = i10;
        this.f34310b = i4Var;
    }

    @Override
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.q9 q9Var;
        switch (this.f34309a) {
            case 0:
                i4 i4Var = this.f34310b;
                if (i4Var.J0 && (articleViewer$WindowView = i4Var.f37218f0) != null) {
                    i4Var.J0 = false;
                    if (i4Var.f41434b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        i4Var.Z(((org.telegram.ui.Components.j01) i4Var.f41434b.f25623i).f27296b);
                        i4Var.f41434b = null;
                        i4Var.d = null;
                        View view = i4Var.f41437f;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                    View view2 = i4Var.f41437f;
                    if (view2 != null && i4Var.O0.g0(view2)) {
                        if (i4Var.f41437f.getTag() != null && i4Var.f41437f.getTag() == "bottomSheet" && (q9Var = i4Var.P0) != null) {
                            q9Var.m0();
                        } else {
                            i4Var.O0.m0();
                        }
                        if (i4Var.O0.y()) {
                            try {
                                i4Var.f37218f0.performHapticFeedback(0, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    } else if (i4Var.d != null && i4Var.f41437f != null) {
                        try {
                            i4Var.f37218f0.performHapticFeedback(0, 2);
                        } catch (Exception unused3) {
                        }
                        int[] iArr = new int[2];
                        i4Var.f41437f.getLocationInWindow(iArr);
                        int dp = (iArr[1] + i4Var.f41436e) - AndroidUtilities.dp(54.0f);
                        if (dp < 0) {
                            dp = 0;
                        }
                        i4Var.f41437f.invalidate();
                        i4Var.h = true;
                        View view3 = i4Var.f41437f;
                        org.telegram.ui.ActionBar.n1 n1Var = i4Var.H;
                        if (n1Var != null && n1Var.isShowing()) {
                            i4Var.H.d(true);
                        } else {
                            if (i4Var.A0 == null) {
                                i4Var.C0 = new Rect();
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i4Var.L, null);
                                i4Var.A0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                                i4Var.A0.setBackgroundDrawable(i4Var.L.getResources().getDrawable(R.drawable.menu_copy));
                                i4Var.A0.setAnimationEnabled(false);
                                i4Var.A0.setOnTouchListener(new d0(i4Var, 0));
                                i4Var.A0.setDispatchKeyEventListener(new t(i4Var));
                                i4Var.A0.setShownFromBottom(false);
                                TextView textView = new TextView(i4Var.L);
                                i4Var.B0 = textView;
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20753i6, false), 2, -1));
                                i4Var.B0.setGravity(16);
                                i4Var.B0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                                i4Var.B0.setTextSize(1, 15.0f);
                                i4Var.B0.setTypeface(AndroidUtilities.bold());
                                i4Var.B0.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                                i4Var.B0.setOnClickListener(new s(i4Var, 5));
                                i4Var.A0.addView(i4Var.B0, w7.x5.c(48.0f, -2));
                                org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(i4Var.A0, -2, -2);
                                i4Var.H = n1Var2;
                                n1Var2.f21209b = false;
                                n1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                i4Var.H.setOutsideTouchable(true);
                                i4Var.H.setClippingEnabled(true);
                                i4Var.H.setInputMethodMode(2);
                                i4Var.H.setSoftInputMode(0);
                                i4Var.H.getContentView().setFocusableInTouchMode(true);
                                i4Var.H.setOnDismissListener(new e0(i4Var, 0));
                            }
                            i4Var.B0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = i4Var.A0;
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false));
                            }
                            i4Var.A0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            i4Var.H.setFocusable(true);
                            i4Var.H.showAtLocation(view3, 48, 0, dp);
                            i4Var.H.h();
                        }
                        i4Var.f37232u0[0].f38551b.setLayoutFrozen(true);
                        i4Var.f37232u0[0].f38551b.setLayoutFrozen(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                i4 i4Var2 = this.f34310b;
                if (i4Var2.K0 == null) {
                    i4Var2.K0 = new a3(i4Var2, 0);
                }
                i4Var2.K0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = i4Var2.f37218f0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(i4Var2.K0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                }
                return;
        }
    }
}
