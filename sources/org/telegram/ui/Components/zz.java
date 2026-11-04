package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zz implements View.OnLongClickListener {
    public final int f41193a;
    public final Object f41194b;

    public zz(Object obj, int i3) {
        this.f41193a = i3;
        this.f41194b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int measuredHeight;
        org.telegram.ui.wm wmVar;
        int i3 = this.f41193a;
        Object obj = this.f41194b;
        switch (i3) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                final float C = MediaController.B().C(fragmentContextView.f31449a0);
                fragmentContextView.J.e(false, C);
                org.telegram.ui.ActionBar.u0 u0Var = fragmentContextView.J;
                int i10 = org.telegram.ui.ActionBar.k6.G8;
                org.telegram.ui.ActionBar.r6.i(i10, u0Var, fragmentContextView.f31471r0);
                org.telegram.ui.ActionBar.u0 u0Var2 = fragmentContextView.J;
                u0Var2.O = fragmentContextView.h instanceof org.telegram.ui.wm;
                u0Var2.G.setShader(null);
                u0Var2.h = null;
                Bitmap bitmap = u0Var2.f28721f;
                if (bitmap != null) {
                    bitmap.recycle();
                    u0Var2.f28721f = null;
                }
                fragmentContextView.H.H(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                fragmentContextView.H.V();
                fragmentContextView.q(false);
                fragmentContextView.H.setDimMenu(0.3f);
                fragmentContextView.H.U(fragmentContextView.J, null);
                fragmentContextView.H.setOnMenuDismiss(new org.telegram.messenger.u10() {
                    @Override
                    public final void a(Object obj2) {
                        float[] fArr2 = FragmentContextView.X0;
                        if (!((Boolean) obj2).booleanValue()) {
                            MediaController B = MediaController.B();
                            FragmentContextView fragmentContextView2 = FragmentContextView.this;
                            fragmentContextView2.l(C, B.C(fragmentContextView2.f31449a0), false);
                        }
                    }
                });
                org.telegram.messenger.hp.f1().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                zb0 zb0Var = (zb0) obj;
                zb0Var.f41013r.setText("");
                gi.z7.a(zb0Var.f41014s, true);
                Drawable drawable = zb0Var.f40998a;
                if (drawable instanceof la0) {
                    ((la0) drawable).x();
                }
                return true;
            default:
                final oo0 oo0Var = (oo0) obj;
                mi.x1 x1Var = oo0Var.m1;
                boolean z10 = oo0Var.f36875a2;
                Activity activity = oo0Var.Z1;
                if (activity == null) {
                    return false;
                }
                LinearLayout linearLayout = new LinearLayout(oo0Var.getContext());
                linearLayout.setOrientation(1);
                if (oo0Var.G1 != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, oo0Var.J0);
                    if (z10) {
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Tg, actionBarPopupWindow$ActionBarPopupWindowLayout, oo0Var.J0);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new yn0(oo0Var, 0));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new kn0(oo0Var, 2));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                    final org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, oo0Var.getContext(), oo0Var.J0, true, false);
                    if (z10) {
                        y0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27853bh, oo0Var.J0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var, b8.mf.o(-1, 48));
                    y0Var.j(org.telegram.messenger.bd.M0(2131745341, null), 0, null);
                    oo0Var.B2 = true;
                    y0Var.setChecked(true);
                    final org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(1, oo0Var.getContext(), oo0Var.J0, false, true);
                    if (z10) {
                        y0Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27853bh, oo0Var.J0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var2, b8.mf.o(-1, 48));
                    y0Var2.j(org.telegram.messenger.bd.M0(2131749316, null), 0, null);
                    y0Var2.setChecked(!oo0Var.B2);
                    y0Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    oo0 oo0Var2 = oo0Var;
                                    oo0Var2.B2 = true;
                                    y0Var.setChecked(true);
                                    y0Var2.setChecked(!oo0Var2.B2);
                                    return;
                                default:
                                    oo0 oo0Var3 = oo0Var;
                                    oo0Var3.B2 = false;
                                    y0Var.setChecked(false);
                                    y0Var2.setChecked(!oo0Var3.B2);
                                    return;
                            }
                        }
                    });
                    y0Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    oo0 oo0Var2 = oo0Var;
                                    oo0Var2.B2 = true;
                                    y0Var.setChecked(true);
                                    y0Var2.setChecked(!oo0Var2.B2);
                                    return;
                                default:
                                    oo0 oo0Var3 = oo0Var;
                                    oo0Var3.B2 = false;
                                    y0Var.setChecked(false);
                                    y0Var2.setChecked(!oo0Var3.B2);
                                    return;
                            }
                        }
                    });
                    oo0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.k6.I5, oo0Var.J0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, b8.mf.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, oo0Var.J0);
                if (z10) {
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Tg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new yn0(oo0Var, 1));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new kn0(oo0Var, 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, oo0Var.getContext(), oo0Var.J0, true, true);
                if (z10) {
                    y0Var3.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27853bh, oo0Var.J0));
                    y0Var3.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.H6, oo0Var.J0));
                }
                y0Var3.j(org.telegram.messenger.bd.M0(2131745593, null), 2131231508, null);
                y0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var3, b8.mf.o(-1, 48));
                y0Var3.setOnClickListener(new jn0(oo0Var, 2));
                org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(0, oo0Var.getContext(), oo0Var.J0, true, true);
                if (z10) {
                    y0Var4.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27853bh, oo0Var.J0));
                    y0Var4.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.H6, oo0Var.J0));
                }
                y0Var4.j(org.telegram.messenger.bd.M0(2131745611, null), 2131232358, null);
                y0Var4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var4, b8.mf.o(-1, 48));
                y0Var4.setOnClickListener(new jn0(oo0Var, 3));
                oo0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.k6.I5, oo0Var.J0);
                linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, b8.mf.o(-1, -2));
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(linearLayout, -2, -2);
                oo0Var.C2 = f1Var;
                f1Var.f27493b = false;
                f1Var.setAnimationStyle(2131755193);
                oo0Var.C2.setOutsideTouchable(true);
                oo0Var.C2.setClippingEnabled(true);
                oo0Var.C2.setInputMethodMode(2);
                oo0Var.C2.setSoftInputMode(0);
                oo0Var.C2.getContentView().setFocusableInTouchMode(true);
                int i11 = org.telegram.messenger.az.f21612a;
                SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                edit.putInt("scheduledOrNoSoundHintShows", 3);
                edit.apply();
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                oo0Var.C2.setFocusable(true);
                int[] iArr = new int[2];
                x1Var.getLocationInWindow(iArr);
                if (oo0Var.d && (wmVar = oo0Var.Y1) != null && wmVar.m1.getMeasuredHeight() > org.telegram.messenger.g0.L(58.0f)) {
                    measuredHeight = x1Var.getMeasuredHeight() + iArr[1];
                } else {
                    measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
                }
                oo0Var.C2.showAtLocation(x1Var, 51, org.telegram.messenger.g0.L(8.0f) + ((x1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
                oo0Var.C2.b();
                try {
                    x1Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
        }
    }
}
