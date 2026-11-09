package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class e00 implements View.OnLongClickListener {
    public final int f33246a;
    public final Object f33247b;

    public e00(Object obj, int i7) {
        this.f33246a = i7;
        this.f33247b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int measuredHeight;
        org.telegram.ui.cn cnVar;
        int i7 = this.f33246a;
        Object obj = this.f33247b;
        switch (i7) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                final float C = MediaController.B().C(fragmentContextView.W);
                fragmentContextView.I.e(false, C);
                org.telegram.ui.ActionBar.v0 v0Var = fragmentContextView.I;
                int i10 = org.telegram.ui.ActionBar.l6.G8;
                org.telegram.ui.ActionBar.s6.h(i10, v0Var, fragmentContextView.f31403q0);
                org.telegram.ui.ActionBar.v0 v0Var2 = fragmentContextView.I;
                v0Var2.N = fragmentContextView.h instanceof org.telegram.ui.cn;
                v0Var2.F.setShader(null);
                v0Var2.h = null;
                Bitmap bitmap = v0Var2.f28692f;
                if (bitmap != null) {
                    bitmap.recycle();
                    v0Var2.f28692f = null;
                }
                fragmentContextView.G.H(org.telegram.ui.ActionBar.l6.x0(null, i10, false));
                fragmentContextView.G.V();
                fragmentContextView.q(false);
                fragmentContextView.G.setDimMenu(0.3f);
                fragmentContextView.G.U(fragmentContextView.I, null);
                fragmentContextView.G.setOnMenuDismiss(new org.telegram.messenger.c20() {
                    @Override
                    public final void a(Object obj2) {
                        float[] fArr2 = FragmentContextView.W0;
                        if (!((Boolean) obj2).booleanValue()) {
                            MediaController B = MediaController.B();
                            FragmentContextView fragmentContextView2 = FragmentContextView.this;
                            fragmentContextView2.l(C, B.C(fragmentContextView2.W), false);
                        }
                    }
                });
                org.telegram.messenger.qp.f1().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                fc0 fc0Var = (fc0) obj;
                fc0Var.f33632r.setText("");
                fi.a8.a(fc0Var.f33633s, true);
                Drawable drawable = fc0Var.f33618a;
                if (drawable instanceof ra0) {
                    ((ra0) drawable).x();
                }
                return true;
            default:
                final no0 no0Var = (no0) obj;
                li.w1 w1Var = no0Var.l1;
                boolean z9 = no0Var.Z1;
                Activity activity = no0Var.Y1;
                if (activity == null) {
                    return false;
                }
                LinearLayout linearLayout = new LinearLayout(no0Var.getContext());
                linearLayout.setOrientation(1);
                if (no0Var.F1 != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, no0Var.I0);
                    if (z9) {
                        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.Tg, actionBarPopupWindow$ActionBarPopupWindowLayout, no0Var.I0);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new xn0(no0Var, 0));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new in0(no0Var, 2));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                    final org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, no0Var.getContext(), no0Var.I0, true, false);
                    if (z9) {
                        z0Var.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27838bh, no0Var.I0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var, c8.ha.o(-1, 48));
                    z0Var.j(org.telegram.messenger.id.M0(2131745331, null), 0, null);
                    no0Var.A2 = true;
                    z0Var.setChecked(true);
                    final org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(1, no0Var.getContext(), no0Var.I0, false, true);
                    if (z9) {
                        z0Var2.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27838bh, no0Var.I0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, c8.ha.o(-1, 48));
                    z0Var2.j(org.telegram.messenger.id.M0(2131749308, null), 0, null);
                    z0Var2.setChecked(!no0Var.A2);
                    z0Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    no0 no0Var2 = no0Var;
                                    no0Var2.A2 = true;
                                    z0Var.setChecked(true);
                                    z0Var2.setChecked(!no0Var2.A2);
                                    return;
                                default:
                                    no0 no0Var3 = no0Var;
                                    no0Var3.A2 = false;
                                    z0Var.setChecked(false);
                                    z0Var2.setChecked(!no0Var3.A2);
                                    return;
                            }
                        }
                    });
                    z0Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    no0 no0Var2 = no0Var;
                                    no0Var2.A2 = true;
                                    z0Var.setChecked(true);
                                    z0Var2.setChecked(!no0Var2.A2);
                                    return;
                                default:
                                    no0 no0Var3 = no0Var;
                                    no0Var3.A2 = false;
                                    z0Var.setChecked(false);
                                    z0Var2.setChecked(!no0Var3.A2);
                                    return;
                            }
                        }
                    });
                    no0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.l6.I5, no0Var.I0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ha.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, no0Var.I0);
                if (z9) {
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.Tg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new xn0(no0Var, 1));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new in0(no0Var, 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, no0Var.getContext(), no0Var.I0, true, true);
                if (z9) {
                    z0Var3.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27838bh, no0Var.I0));
                    z0Var3.setIconColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.H6, no0Var.I0));
                }
                z0Var3.j(org.telegram.messenger.id.M0(2131745583, null), 2131231508, null);
                z0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var3, c8.ha.o(-1, 48));
                z0Var3.setOnClickListener(new hn0(no0Var, 2));
                org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(0, no0Var.getContext(), no0Var.I0, true, true);
                if (z9) {
                    z0Var4.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27838bh, no0Var.I0));
                    z0Var4.setIconColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.H6, no0Var.I0));
                }
                z0Var4.j(org.telegram.messenger.id.M0(2131745601, null), 2131232358, null);
                z0Var4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var4, c8.ha.o(-1, 48));
                z0Var4.setOnClickListener(new hn0(no0Var, 3));
                no0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.l6.I5, no0Var.I0);
                linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, c8.ha.o(-1, -2));
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                no0Var.B2 = g1Var;
                g1Var.f27485b = false;
                g1Var.setAnimationStyle(2131755193);
                no0Var.B2.setOutsideTouchable(true);
                no0Var.B2.setClippingEnabled(true);
                no0Var.B2.setInputMethodMode(2);
                no0Var.B2.setSoftInputMode(0);
                no0Var.B2.getContentView().setFocusableInTouchMode(true);
                int i11 = org.telegram.messenger.iz.f23385a;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putInt("scheduledOrNoSoundHintShows", 3);
                edit.apply();
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                no0Var.B2.setFocusable(true);
                int[] iArr = new int[2];
                w1Var.getLocationInWindow(iArr);
                if (no0Var.d && (cnVar = no0Var.X1) != null && cnVar.l1.getMeasuredHeight() > org.telegram.messenger.g0.L(58.0f)) {
                    measuredHeight = w1Var.getMeasuredHeight() + iArr[1];
                } else {
                    measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
                }
                no0Var.B2.showAtLocation(w1Var, 51, org.telegram.messenger.g0.L(8.0f) + ((w1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
                no0Var.B2.b();
                try {
                    w1Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
        }
    }
}
