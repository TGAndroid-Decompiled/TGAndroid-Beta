package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class o00 implements View.OnLongClickListener {
    public final int f37969a;
    public final Object f37970b;

    public o00(Object obj, int i7) {
        this.f37969a = i7;
        this.f37970b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int measuredHeight;
        org.telegram.ui.bn bnVar;
        int i7 = this.f37969a;
        Object obj = this.f37970b;
        switch (i7) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                final float C = MediaController.B().C(fragmentContextView.f33053a0);
                fragmentContextView.J.e(false, C);
                org.telegram.ui.ActionBar.u0 u0Var = fragmentContextView.J;
                int i10 = org.telegram.ui.ActionBar.n6.G8;
                org.telegram.ui.ActionBar.u6.h(i10, u0Var, fragmentContextView.f33075r0);
                org.telegram.ui.ActionBar.u0 u0Var2 = fragmentContextView.J;
                u0Var2.O = fragmentContextView.h instanceof org.telegram.ui.bn;
                u0Var2.G.setShader(null);
                u0Var2.h = null;
                Bitmap bitmap = u0Var2.f30178f;
                if (bitmap != null) {
                    bitmap.recycle();
                    u0Var2.f30178f = null;
                }
                fragmentContextView.H.I(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                fragmentContextView.H.W();
                fragmentContextView.q(false);
                fragmentContextView.H.setDimMenu(0.3f);
                fragmentContextView.H.V(fragmentContextView.J, null);
                fragmentContextView.H.setOnMenuDismiss(new org.telegram.messenger.w10() {
                    @Override
                    public final void a(Object obj2) {
                        float[] fArr2 = FragmentContextView.X0;
                        if (!((Boolean) obj2).booleanValue()) {
                            MediaController B = MediaController.B();
                            FragmentContextView fragmentContextView2 = FragmentContextView.this;
                            fragmentContextView2.l(C, B.C(fragmentContextView2.f33053a0), false);
                        }
                    }
                });
                org.telegram.messenger.mp.h1().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                oc0 oc0Var = (oc0) obj;
                oc0Var.f38122r.setText("");
                hi.s8.a(oc0Var.f38123s, true);
                Drawable drawable = oc0Var.f38107a;
                if (drawable instanceof za0) {
                    ((za0) drawable).x();
                }
                return true;
            default:
                final zo0 zo0Var = (zo0) obj;
                oi.w1 w1Var = zo0Var.f42986p1;
                boolean z10 = zo0Var.d2;
                Activity activity = zo0Var.f42972c2;
                if (activity == null) {
                    return false;
                }
                LinearLayout linearLayout = new LinearLayout(zo0Var.getContext());
                linearLayout.setOrientation(1);
                if (zo0Var.J1 != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, zo0Var.J0);
                    if (z10) {
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout, zo0Var.J0);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new jo0(zo0Var, 0));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new vn0(zo0Var, 2));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                    final org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, zo0Var.getContext(), zo0Var.J0, true, false);
                    if (z10) {
                        y0Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29480eh, zo0Var.J0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var, c8.na.o(-1, 48));
                    y0Var.j(org.telegram.messenger.gd.N0(2131745135, null), 0, null);
                    zo0Var.E2 = true;
                    y0Var.setChecked(true);
                    final org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(1, zo0Var.getContext(), zo0Var.J0, false, true);
                    if (z10) {
                        y0Var2.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29480eh, zo0Var.J0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var2, c8.na.o(-1, 48));
                    y0Var2.j(org.telegram.messenger.gd.N0(2131749115, null), 0, null);
                    y0Var2.setChecked(!zo0Var.E2);
                    y0Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    zo0 zo0Var2 = zo0Var;
                                    zo0Var2.E2 = true;
                                    y0Var.setChecked(true);
                                    y0Var2.setChecked(!zo0Var2.E2);
                                    return;
                                default:
                                    zo0 zo0Var3 = zo0Var;
                                    zo0Var3.E2 = false;
                                    y0Var.setChecked(false);
                                    y0Var2.setChecked(!zo0Var3.E2);
                                    return;
                            }
                        }
                    });
                    y0Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    zo0 zo0Var2 = zo0Var;
                                    zo0Var2.E2 = true;
                                    y0Var.setChecked(true);
                                    y0Var2.setChecked(!zo0Var2.E2);
                                    return;
                                default:
                                    zo0 zo0Var3 = zo0Var;
                                    zo0Var3.E2 = false;
                                    y0Var.setChecked(false);
                                    y0Var2.setChecked(!zo0Var3.E2);
                                    return;
                            }
                        }
                    });
                    zo0.X0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.n6.I5, zo0Var.J0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.na.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, zo0Var.J0);
                if (z10) {
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new jo0(zo0Var, 1));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new vn0(zo0Var, 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, zo0Var.getContext(), zo0Var.J0, true, true);
                if (z10) {
                    y0Var3.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29480eh, zo0Var.J0));
                    y0Var3.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, zo0Var.J0));
                }
                y0Var3.j(org.telegram.messenger.gd.N0(2131745387, null), 2131231512, null);
                y0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var3, c8.na.o(-1, 48));
                y0Var3.setOnClickListener(new un0(zo0Var, 2));
                org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(0, zo0Var.getContext(), zo0Var.J0, true, true);
                if (z10) {
                    y0Var4.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29480eh, zo0Var.J0));
                    y0Var4.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, zo0Var.J0));
                }
                y0Var4.j(org.telegram.messenger.gd.N0(2131745405, null), 2131232363, null);
                y0Var4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var4, c8.na.o(-1, 48));
                y0Var4.setOnClickListener(new un0(zo0Var, 3));
                zo0.X0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.n6.I5, zo0Var.J0);
                linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, c8.na.o(-1, -2));
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                zo0Var.F2 = g1Var;
                g1Var.f29034b = false;
                g1Var.setAnimationStyle(2131755193);
                zo0Var.F2.setOutsideTouchable(true);
                zo0Var.F2.setClippingEnabled(true);
                zo0Var.F2.setInputMethodMode(2);
                zo0Var.F2.setSoftInputMode(0);
                zo0Var.F2.getContentView().setFocusableInTouchMode(true);
                int i11 = org.telegram.messenger.bz.f23270a;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putInt("scheduledOrNoSoundHintShows", 3);
                edit.apply();
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                zo0Var.F2.setFocusable(true);
                int[] iArr = new int[2];
                w1Var.getLocationInWindow(iArr);
                if (zo0Var.d && (bnVar = zo0Var.f42971b2) != null && bnVar.f46279m1.getMeasuredHeight() > org.telegram.messenger.g0.L(58.0f)) {
                    measuredHeight = w1Var.getMeasuredHeight() + iArr[1];
                } else {
                    measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
                }
                zo0Var.F2.showAtLocation(w1Var, 51, org.telegram.messenger.g0.L(8.0f) + ((w1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
                zo0Var.F2.b();
                try {
                    w1Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
        }
    }
}
