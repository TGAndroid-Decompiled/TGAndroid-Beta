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
    public final int f37918a;
    public final Object f37919b;

    public o00(Object obj, int i7) {
        this.f37918a = i7;
        this.f37919b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int measuredHeight;
        org.telegram.ui.bn bnVar;
        int i7 = this.f37918a;
        Object obj = this.f37919b;
        switch (i7) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                final float C = MediaController.B().C(fragmentContextView.f32953a0);
                fragmentContextView.J.e(false, C);
                org.telegram.ui.ActionBar.v0 v0Var = fragmentContextView.J;
                int i10 = org.telegram.ui.ActionBar.n6.G8;
                org.telegram.ui.ActionBar.u6.h(i10, v0Var, fragmentContextView.f32975r0);
                org.telegram.ui.ActionBar.v0 v0Var2 = fragmentContextView.J;
                v0Var2.O = fragmentContextView.h instanceof org.telegram.ui.bn;
                v0Var2.G.setShader(null);
                v0Var2.h = null;
                Bitmap bitmap = v0Var2.f30134f;
                if (bitmap != null) {
                    bitmap.recycle();
                    v0Var2.f30134f = null;
                }
                fragmentContextView.H.I(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
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
                            fragmentContextView2.l(C, B.C(fragmentContextView2.f32953a0), false);
                        }
                    }
                });
                org.telegram.messenger.mp.h1().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                pc0 pc0Var = (pc0) obj;
                pc0Var.f38375r.setText("");
                hi.y7.a(pc0Var.f38376s, true);
                Drawable drawable = pc0Var.f38360a;
                if (drawable instanceof bb0) {
                    ((bb0) drawable).x();
                }
                return true;
            default:
                final yo0 yo0Var = (yo0) obj;
                oi.u1 u1Var = yo0Var.f42569p1;
                boolean z10 = yo0Var.d2;
                Activity activity = yo0Var.f42555c2;
                if (activity == null) {
                    return false;
                }
                LinearLayout linearLayout = new LinearLayout(yo0Var.getContext());
                linearLayout.setOrientation(1);
                if (yo0Var.J1 != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, yo0Var.J0);
                    if (z10) {
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout, yo0Var.J0);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new io0(yo0Var, 0));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new un0(yo0Var, 2));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                    final org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, yo0Var.getContext(), yo0Var.J0, true, false);
                    if (z10) {
                        z0Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29425eh, yo0Var.J0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var, c8.ma.o(-1, 48));
                    z0Var.j(org.telegram.messenger.gd.M0(2131745136, null), 0, null);
                    yo0Var.E2 = true;
                    z0Var.setChecked(true);
                    final org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(1, yo0Var.getContext(), yo0Var.J0, false, true);
                    if (z10) {
                        z0Var2.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29425eh, yo0Var.J0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, c8.ma.o(-1, 48));
                    z0Var2.j(org.telegram.messenger.gd.M0(2131749116, null), 0, null);
                    z0Var2.setChecked(!yo0Var.E2);
                    z0Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    yo0 yo0Var2 = yo0Var;
                                    yo0Var2.E2 = true;
                                    z0Var.setChecked(true);
                                    z0Var2.setChecked(!yo0Var2.E2);
                                    return;
                                default:
                                    yo0 yo0Var3 = yo0Var;
                                    yo0Var3.E2 = false;
                                    z0Var.setChecked(false);
                                    z0Var2.setChecked(!yo0Var3.E2);
                                    return;
                            }
                        }
                    });
                    z0Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    yo0 yo0Var2 = yo0Var;
                                    yo0Var2.E2 = true;
                                    z0Var.setChecked(true);
                                    z0Var2.setChecked(!yo0Var2.E2);
                                    return;
                                default:
                                    yo0 yo0Var3 = yo0Var;
                                    yo0Var3.E2 = false;
                                    z0Var.setChecked(false);
                                    z0Var2.setChecked(!yo0Var3.E2);
                                    return;
                            }
                        }
                    });
                    yo0.X0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.n6.I5, yo0Var.J0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ma.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, yo0Var.J0);
                if (z10) {
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new io0(yo0Var, 1));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new un0(yo0Var, 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, yo0Var.getContext(), yo0Var.J0, true, true);
                if (z10) {
                    z0Var3.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29425eh, yo0Var.J0));
                    z0Var3.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, yo0Var.J0));
                }
                z0Var3.j(org.telegram.messenger.gd.M0(2131745388, null), 2131231509, null);
                z0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var3, c8.ma.o(-1, 48));
                z0Var3.setOnClickListener(new tn0(yo0Var, 2));
                org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(0, yo0Var.getContext(), yo0Var.J0, true, true);
                if (z10) {
                    z0Var4.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29425eh, yo0Var.J0));
                    z0Var4.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, yo0Var.J0));
                }
                z0Var4.j(org.telegram.messenger.gd.M0(2131745406, null), 2131232360, null);
                z0Var4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var4, c8.ma.o(-1, 48));
                z0Var4.setOnClickListener(new tn0(yo0Var, 3));
                yo0.X0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.n6.I5, yo0Var.J0);
                linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, c8.ma.o(-1, -2));
                org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(linearLayout, -2, -2);
                yo0Var.F2 = h1Var;
                h1Var.f28991b = false;
                h1Var.setAnimationStyle(2131755193);
                yo0Var.F2.setOutsideTouchable(true);
                yo0Var.F2.setClippingEnabled(true);
                yo0Var.F2.setInputMethodMode(2);
                yo0Var.F2.setSoftInputMode(0);
                yo0Var.F2.getContentView().setFocusableInTouchMode(true);
                int i11 = org.telegram.messenger.bz.f23148a;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putInt("scheduledOrNoSoundHintShows", 3);
                edit.apply();
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                yo0Var.F2.setFocusable(true);
                int[] iArr = new int[2];
                u1Var.getLocationInWindow(iArr);
                if (yo0Var.d && (bnVar = yo0Var.f42554b2) != null && bnVar.f46093m1.getMeasuredHeight() > org.telegram.messenger.g0.L(58.0f)) {
                    measuredHeight = u1Var.getMeasuredHeight() + iArr[1];
                } else {
                    measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
                }
                yo0Var.F2.showAtLocation(u1Var, 51, org.telegram.messenger.g0.L(8.0f) + ((u1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
                yo0Var.F2.b();
                try {
                    u1Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
        }
    }
}
