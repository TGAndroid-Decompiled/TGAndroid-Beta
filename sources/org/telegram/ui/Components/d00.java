package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class d00 implements View.OnLongClickListener {
    public final int f32842a;
    public final Object f32843b;

    public d00(Object obj, int i7) {
        this.f32842a = i7;
        this.f32843b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int measuredHeight;
        org.telegram.ui.cn cnVar;
        int i7 = this.f32842a;
        Object obj = this.f32843b;
        switch (i7) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                final float C = MediaController.B().C(fragmentContextView.W);
                fragmentContextView.I.e(false, C);
                org.telegram.ui.ActionBar.v0 v0Var = fragmentContextView.I;
                int i10 = org.telegram.ui.ActionBar.m6.G8;
                org.telegram.ui.ActionBar.t6.h(i10, v0Var, fragmentContextView.f31414q0);
                org.telegram.ui.ActionBar.v0 v0Var2 = fragmentContextView.I;
                v0Var2.N = fragmentContextView.h instanceof org.telegram.ui.cn;
                v0Var2.F.setShader(null);
                v0Var2.h = null;
                Bitmap bitmap = v0Var2.f28660f;
                if (bitmap != null) {
                    bitmap.recycle();
                    v0Var2.f28660f = null;
                }
                fragmentContextView.G.H(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
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
                ec0 ec0Var = (ec0) obj;
                ec0Var.f33218r.setText("");
                fi.a8.a(ec0Var.f33219s, true);
                Drawable drawable = ec0Var.f33204a;
                if (drawable instanceof qa0) {
                    ((qa0) drawable).x();
                }
                return true;
            default:
                final mo0 mo0Var = (mo0) obj;
                li.w1 w1Var = mo0Var.f36041o1;
                boolean z9 = mo0Var.f36029c2;
                Activity activity = mo0Var.f36028b2;
                if (activity == null) {
                    return false;
                }
                LinearLayout linearLayout = new LinearLayout(mo0Var.getContext());
                linearLayout.setOrientation(1);
                if (mo0Var.I1 != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, mo0Var.I0);
                    if (z9) {
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Tg, actionBarPopupWindow$ActionBarPopupWindowLayout, mo0Var.I0);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new wn0(mo0Var, 0));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new hn0(mo0Var, 2));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                    final org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, mo0Var.getContext(), mo0Var.I0, true, false);
                    if (z9) {
                        z0Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27863bh, mo0Var.I0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var, c8.ha.o(-1, 48));
                    z0Var.j(org.telegram.messenger.id.M0(2131745331, null), 0, null);
                    mo0Var.D2 = true;
                    z0Var.setChecked(true);
                    final org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(1, mo0Var.getContext(), mo0Var.I0, false, true);
                    if (z9) {
                        z0Var2.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27863bh, mo0Var.I0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, c8.ha.o(-1, 48));
                    z0Var2.j(org.telegram.messenger.id.M0(2131749308, null), 0, null);
                    z0Var2.setChecked(!mo0Var.D2);
                    z0Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    mo0 mo0Var2 = mo0Var;
                                    mo0Var2.D2 = true;
                                    z0Var.setChecked(true);
                                    z0Var2.setChecked(!mo0Var2.D2);
                                    return;
                                default:
                                    mo0 mo0Var3 = mo0Var;
                                    mo0Var3.D2 = false;
                                    z0Var.setChecked(false);
                                    z0Var2.setChecked(!mo0Var3.D2);
                                    return;
                            }
                        }
                    });
                    z0Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    mo0 mo0Var2 = mo0Var;
                                    mo0Var2.D2 = true;
                                    z0Var.setChecked(true);
                                    z0Var2.setChecked(!mo0Var2.D2);
                                    return;
                                default:
                                    mo0 mo0Var3 = mo0Var;
                                    mo0Var3.D2 = false;
                                    z0Var.setChecked(false);
                                    z0Var2.setChecked(!mo0Var3.D2);
                                    return;
                            }
                        }
                    });
                    mo0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.m6.I5, mo0Var.I0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ha.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, mo0Var.I0);
                if (z9) {
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Tg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new wn0(mo0Var, 1));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new hn0(mo0Var, 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, mo0Var.getContext(), mo0Var.I0, true, true);
                if (z9) {
                    z0Var3.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27863bh, mo0Var.I0));
                    z0Var3.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.H6, mo0Var.I0));
                }
                z0Var3.j(org.telegram.messenger.id.M0(2131745583, null), 2131231508, null);
                z0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var3, c8.ha.o(-1, 48));
                z0Var3.setOnClickListener(new gn0(mo0Var, 2));
                org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(0, mo0Var.getContext(), mo0Var.I0, true, true);
                if (z9) {
                    z0Var4.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27863bh, mo0Var.I0));
                    z0Var4.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.H6, mo0Var.I0));
                }
                z0Var4.j(org.telegram.messenger.id.M0(2131745601, null), 2131232358, null);
                z0Var4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var4, c8.ha.o(-1, 48));
                z0Var4.setOnClickListener(new gn0(mo0Var, 3));
                mo0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.m6.I5, mo0Var.I0);
                linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, c8.ha.o(-1, -2));
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                mo0Var.E2 = g1Var;
                g1Var.f27491b = false;
                g1Var.setAnimationStyle(2131755193);
                mo0Var.E2.setOutsideTouchable(true);
                mo0Var.E2.setClippingEnabled(true);
                mo0Var.E2.setInputMethodMode(2);
                mo0Var.E2.setSoftInputMode(0);
                mo0Var.E2.getContentView().setFocusableInTouchMode(true);
                int i11 = org.telegram.messenger.iz.f23389a;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putInt("scheduledOrNoSoundHintShows", 3);
                edit.apply();
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                mo0Var.E2.setFocusable(true);
                int[] iArr = new int[2];
                w1Var.getLocationInWindow(iArr);
                if (mo0Var.d && (cnVar = mo0Var.f36027a2) != null && cnVar.l1.getMeasuredHeight() > org.telegram.messenger.g0.L(58.0f)) {
                    measuredHeight = w1Var.getMeasuredHeight() + iArr[1];
                } else {
                    measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
                }
                mo0Var.E2.showAtLocation(w1Var, 51, org.telegram.messenger.g0.L(8.0f) + ((w1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
                mo0Var.E2.b();
                try {
                    w1Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
        }
    }
}
