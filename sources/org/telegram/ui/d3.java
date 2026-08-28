package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class d3 implements Runnable {
    public final int f37393a;
    public final l4 f37394b;

    public d3(l4 l4Var, int i9) {
        this.f37393a = i9;
        this.f37394b = l4Var;
    }

    @Override
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.n9 n9Var;
        switch (this.f37393a) {
            case 0:
                l4 l4Var = this.f37394b;
                if (l4Var.F0 && (articleViewer$WindowView = l4Var.f40012b0) != null) {
                    l4Var.F0 = false;
                    if (l4Var.f36374b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        l4Var.Z(((org.telegram.ui.Components.rz0) l4Var.f36374b.f30768i).f32323b);
                        l4Var.f36374b = null;
                        l4Var.d = null;
                        View view = l4Var.f36377f;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                    View view2 = l4Var.f36377f;
                    if (view2 != null && l4Var.K0.g0(view2)) {
                        if (l4Var.f36377f.getTag() != null && l4Var.f36377f.getTag() == "bottomSheet" && (n9Var = l4Var.L0) != null) {
                            n9Var.m0();
                        } else {
                            l4Var.K0.m0();
                        }
                        if (l4Var.K0.y()) {
                            try {
                                l4Var.f40012b0.performHapticFeedback(0, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    } else if (l4Var.d != null && l4Var.f36377f != null) {
                        try {
                            l4Var.f40012b0.performHapticFeedback(0, 2);
                        } catch (Exception unused3) {
                        }
                        int[] iArr = new int[2];
                        l4Var.f36377f.getLocationInWindow(iArr);
                        int dp = (iArr[1] + l4Var.f36376e) - AndroidUtilities.dp(54.0f);
                        if (dp < 0) {
                            dp = 0;
                        }
                        l4Var.f36377f.invalidate();
                        l4Var.h = true;
                        View view3 = l4Var.f36377f;
                        org.telegram.ui.ActionBar.o1 o1Var = l4Var.D;
                        if (o1Var != null && o1Var.isShowing()) {
                            l4Var.D.d(true);
                        } else {
                            if (l4Var.f40032w0 == null) {
                                l4Var.f40034y0 = new Rect();
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(l4Var.H, null);
                                l4Var.f40032w0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                                l4Var.f40032w0.setBackgroundDrawable(l4Var.H.getResources().getDrawable(R.drawable.menu_copy));
                                l4Var.f40032w0.setAnimationEnabled(false);
                                l4Var.f40032w0.setOnTouchListener(new f0(l4Var, 0));
                                l4Var.f40032w0.setDispatchKeyEventListener(new t(l4Var));
                                l4Var.f40032w0.setShownFromBottom(false);
                                TextView textView = new TextView(l4Var.H);
                                l4Var.f40033x0 = textView;
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 2, -1));
                                l4Var.f40033x0.setGravity(16);
                                l4Var.f40033x0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                                l4Var.f40033x0.setTextSize(1, 15.0f);
                                l4Var.f40033x0.setTypeface(AndroidUtilities.bold());
                                l4Var.f40033x0.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                                l4Var.f40033x0.setOnClickListener(new s(l4Var, 5));
                                l4Var.f40032w0.addView(l4Var.f40033x0, g7.e6.c(48.0f, -2));
                                org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(l4Var.f40032w0, -2, -2);
                                l4Var.D = o1Var2;
                                o1Var2.f23688b = false;
                                o1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                l4Var.D.setOutsideTouchable(true);
                                l4Var.D.setClippingEnabled(true);
                                l4Var.D.setInputMethodMode(2);
                                l4Var.D.setSoftInputMode(0);
                                l4Var.D.getContentView().setFocusableInTouchMode(true);
                                l4Var.D.setOnDismissListener(new g0(l4Var, 0));
                            }
                            l4Var.f40033x0.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = l4Var.f40032w0;
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G8, false));
                            }
                            l4Var.f40032w0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            l4Var.D.setFocusable(true);
                            l4Var.D.showAtLocation(view3, 48, 0, dp);
                            l4Var.D.h();
                        }
                        l4Var.f40026q0[0].f41320b.setLayoutFrozen(true);
                        l4Var.f40026q0[0].f41320b.setLayoutFrozen(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                l4 l4Var2 = this.f37394b;
                if (l4Var2.G0 == null) {
                    l4Var2.G0 = new d3(l4Var2, 0);
                }
                l4Var2.G0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = l4Var2.f40012b0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(l4Var2.G0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                }
                return;
        }
    }
}
