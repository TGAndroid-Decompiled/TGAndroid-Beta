package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class q00 implements View.OnLongClickListener {
    public final int f38742a;
    public final Object f38743b;

    public q00(Object obj, int i7) {
        this.f38742a = i7;
        this.f38743b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int measuredHeight;
        org.telegram.ui.bn bnVar;
        int i7 = this.f38742a;
        Object obj = this.f38743b;
        switch (i7) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                final float C = MediaController.B().C(fragmentContextView.f32986a0);
                fragmentContextView.J.e(false, C);
                org.telegram.ui.ActionBar.u0 u0Var = fragmentContextView.J;
                int i10 = org.telegram.ui.ActionBar.m6.G8;
                org.telegram.ui.ActionBar.t6.h(i10, u0Var, fragmentContextView.f33008r0);
                org.telegram.ui.ActionBar.u0 u0Var2 = fragmentContextView.J;
                u0Var2.O = fragmentContextView.h instanceof org.telegram.ui.bn;
                u0Var2.G.setShader(null);
                u0Var2.h = null;
                Bitmap bitmap = u0Var2.f30115f;
                if (bitmap != null) {
                    bitmap.recycle();
                    u0Var2.f30115f = null;
                }
                fragmentContextView.H.I(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
                fragmentContextView.H.W();
                fragmentContextView.q(false);
                fragmentContextView.H.setDimMenu(0.3f);
                fragmentContextView.H.V(fragmentContextView.J, null);
                fragmentContextView.H.setOnMenuDismiss(new org.telegram.messenger.x10() {
                    @Override
                    public final void a(Object obj2) {
                        float[] fArr2 = FragmentContextView.X0;
                        if (!((Boolean) obj2).booleanValue()) {
                            MediaController B = MediaController.B();
                            FragmentContextView fragmentContextView2 = FragmentContextView.this;
                            fragmentContextView2.l(C, B.C(fragmentContextView2.f32986a0), false);
                        }
                    }
                });
                org.telegram.messenger.mp.h1().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                qc0 qc0Var = (qc0) obj;
                qc0Var.f38893r.setText("");
                hi.x7.a(qc0Var.f38894s, true);
                Drawable drawable = qc0Var.f38878a;
                if (drawable instanceof cb0) {
                    ((cb0) drawable).x();
                }
                return true;
            default:
                final ap0 ap0Var = (ap0) obj;
                oi.w1 w1Var = ap0Var.f33565p1;
                boolean z10 = ap0Var.d2;
                Activity activity = ap0Var.f33551c2;
                if (activity == null) {
                    return false;
                }
                LinearLayout linearLayout = new LinearLayout(ap0Var.getContext());
                linearLayout.setOrientation(1);
                if (ap0Var.J1 != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, ap0Var.J0);
                    if (z10) {
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout, ap0Var.J0);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new ko0(ap0Var, 0));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new wn0(ap0Var, 2));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                    final org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, ap0Var.getContext(), ap0Var.J0, true, false);
                    if (z10) {
                        y0Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29407eh, ap0Var.J0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var, c8.ma.o(-1, 48));
                    y0Var.j(org.telegram.messenger.gd.N0(2131745135, null), 0, null);
                    ap0Var.E2 = true;
                    y0Var.setChecked(true);
                    final org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(1, ap0Var.getContext(), ap0Var.J0, false, true);
                    if (z10) {
                        y0Var2.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29407eh, ap0Var.J0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var2, c8.ma.o(-1, 48));
                    y0Var2.j(org.telegram.messenger.gd.N0(2131749115, null), 0, null);
                    y0Var2.setChecked(!ap0Var.E2);
                    y0Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    ap0 ap0Var2 = ap0Var;
                                    ap0Var2.E2 = true;
                                    y0Var.setChecked(true);
                                    y0Var2.setChecked(!ap0Var2.E2);
                                    return;
                                default:
                                    ap0 ap0Var3 = ap0Var;
                                    ap0Var3.E2 = false;
                                    y0Var.setChecked(false);
                                    y0Var2.setChecked(!ap0Var3.E2);
                                    return;
                            }
                        }
                    });
                    y0Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    ap0 ap0Var2 = ap0Var;
                                    ap0Var2.E2 = true;
                                    y0Var.setChecked(true);
                                    y0Var2.setChecked(!ap0Var2.E2);
                                    return;
                                default:
                                    ap0 ap0Var3 = ap0Var;
                                    ap0Var3.E2 = false;
                                    y0Var.setChecked(false);
                                    y0Var2.setChecked(!ap0Var3.E2);
                                    return;
                            }
                        }
                    });
                    ap0.X0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.m6.I5, ap0Var.J0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ma.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, ap0Var.J0);
                if (z10) {
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new ko0(ap0Var, 1));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new wn0(ap0Var, 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, ap0Var.getContext(), ap0Var.J0, true, true);
                if (z10) {
                    y0Var3.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29407eh, ap0Var.J0));
                    y0Var3.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.H6, ap0Var.J0));
                }
                y0Var3.j(org.telegram.messenger.gd.N0(2131745387, null), 2131231509, null);
                y0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var3, c8.ma.o(-1, 48));
                y0Var3.setOnClickListener(new vn0(ap0Var, 2));
                org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(0, ap0Var.getContext(), ap0Var.J0, true, true);
                if (z10) {
                    y0Var4.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29407eh, ap0Var.J0));
                    y0Var4.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.H6, ap0Var.J0));
                }
                y0Var4.j(org.telegram.messenger.gd.N0(2131745405, null), 2131232360, null);
                y0Var4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var4, c8.ma.o(-1, 48));
                y0Var4.setOnClickListener(new vn0(ap0Var, 3));
                ap0.X0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.m6.I5, ap0Var.J0);
                linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, c8.ma.o(-1, -2));
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                ap0Var.F2 = g1Var;
                g1Var.f28972b = false;
                g1Var.setAnimationStyle(2131755193);
                ap0Var.F2.setOutsideTouchable(true);
                ap0Var.F2.setClippingEnabled(true);
                ap0Var.F2.setInputMethodMode(2);
                ap0Var.F2.setSoftInputMode(0);
                ap0Var.F2.getContentView().setFocusableInTouchMode(true);
                int i11 = org.telegram.messenger.bz.f23173a;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putInt("scheduledOrNoSoundHintShows", 3);
                edit.apply();
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                ap0Var.F2.setFocusable(true);
                int[] iArr = new int[2];
                w1Var.getLocationInWindow(iArr);
                if (ap0Var.d && (bnVar = ap0Var.f33550b2) != null && bnVar.f46107m1.getMeasuredHeight() > org.telegram.messenger.g0.L(58.0f)) {
                    measuredHeight = w1Var.getMeasuredHeight() + iArr[1];
                } else {
                    measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
                }
                ap0Var.F2.showAtLocation(w1Var, 51, org.telegram.messenger.g0.L(8.0f) + ((w1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
                ap0Var.F2.b();
                try {
                    w1Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
        }
    }
}
