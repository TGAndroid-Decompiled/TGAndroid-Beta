package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class h00 implements View.OnLongClickListener {
    public final int f35136a;
    public final Object f35137b;

    public h00(Object obj, int i7) {
        this.f35136a = i7;
        this.f35137b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int measuredHeight;
        org.telegram.ui.an anVar;
        int i7 = this.f35136a;
        Object obj = this.f35137b;
        switch (i7) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                final float C = MediaController.B().C(fragmentContextView.f32556a0);
                fragmentContextView.J.e(false, C);
                org.telegram.ui.ActionBar.v0 v0Var = fragmentContextView.J;
                int i10 = org.telegram.ui.ActionBar.j6.G8;
                org.telegram.ui.ActionBar.q6.h(i10, v0Var, fragmentContextView.f32578r0);
                org.telegram.ui.ActionBar.v0 v0Var2 = fragmentContextView.J;
                v0Var2.O = fragmentContextView.h instanceof org.telegram.ui.an;
                v0Var2.G.setShader(null);
                v0Var2.h = null;
                Bitmap bitmap = v0Var2.f29784f;
                if (bitmap != null) {
                    bitmap.recycle();
                    v0Var2.f29784f = null;
                }
                fragmentContextView.H.I(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
                fragmentContextView.H.W();
                fragmentContextView.q(false);
                fragmentContextView.H.setDimMenu(0.3f);
                fragmentContextView.H.V(fragmentContextView.J, null);
                fragmentContextView.H.setOnMenuDismiss(new org.telegram.messenger.z10() {
                    @Override
                    public final void a(Object obj2) {
                        float[] fArr2 = FragmentContextView.X0;
                        if (!((Boolean) obj2).booleanValue()) {
                            MediaController B = MediaController.B();
                            FragmentContextView fragmentContextView2 = FragmentContextView.this;
                            fragmentContextView2.l(C, B.C(fragmentContextView2.f32556a0), false);
                        }
                    }
                });
                org.telegram.messenger.np.f1().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                fc0 fc0Var = (fc0) obj;
                fc0Var.f34575r.setText("");
                hi.y7.a(fc0Var.f34576s, true);
                Drawable drawable = fc0Var.f34560a;
                if (drawable instanceof ra0) {
                    ((ra0) drawable).x();
                }
                return true;
            default:
                final po0 po0Var = (po0) obj;
                oi.u1 u1Var = po0Var.f38356p1;
                boolean z10 = po0Var.d2;
                Activity activity = po0Var.f38342c2;
                if (activity == null) {
                    return false;
                }
                LinearLayout linearLayout = new LinearLayout(po0Var.getContext());
                linearLayout.setOrientation(1);
                if (po0Var.J1 != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, po0Var.J0);
                    if (z10) {
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout, po0Var.J0);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new zn0(po0Var, 0));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new ln0(po0Var, 2));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                    final org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, po0Var.getContext(), po0Var.J0, true, false);
                    if (z10) {
                        z0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28878eh, po0Var.J0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var, c8.ja.o(-1, 48));
                    z0Var.j(org.telegram.messenger.hd.M0(2131745331, null), 0, null);
                    po0Var.E2 = true;
                    z0Var.setChecked(true);
                    final org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(1, po0Var.getContext(), po0Var.J0, false, true);
                    if (z10) {
                        z0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28878eh, po0Var.J0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, c8.ja.o(-1, 48));
                    z0Var2.j(org.telegram.messenger.hd.M0(2131749308, null), 0, null);
                    z0Var2.setChecked(!po0Var.E2);
                    z0Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    po0 po0Var2 = po0Var;
                                    po0Var2.E2 = true;
                                    z0Var.setChecked(true);
                                    z0Var2.setChecked(!po0Var2.E2);
                                    return;
                                default:
                                    po0 po0Var3 = po0Var;
                                    po0Var3.E2 = false;
                                    z0Var.setChecked(false);
                                    z0Var2.setChecked(!po0Var3.E2);
                                    return;
                            }
                        }
                    });
                    z0Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    po0 po0Var2 = po0Var;
                                    po0Var2.E2 = true;
                                    z0Var.setChecked(true);
                                    z0Var2.setChecked(!po0Var2.E2);
                                    return;
                                default:
                                    po0 po0Var3 = po0Var;
                                    po0Var3.E2 = false;
                                    z0Var.setChecked(false);
                                    z0Var2.setChecked(!po0Var3.E2);
                                    return;
                            }
                        }
                    });
                    po0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.j6.I5, po0Var.J0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ja.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, po0Var.J0);
                if (z10) {
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new zn0(po0Var, 1));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new ln0(po0Var, 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, po0Var.getContext(), po0Var.J0, true, true);
                if (z10) {
                    z0Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28878eh, po0Var.J0));
                    z0Var3.setIconColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.H6, po0Var.J0));
                }
                z0Var3.j(org.telegram.messenger.hd.M0(2131745583, null), 2131231508, null);
                z0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var3, c8.ja.o(-1, 48));
                z0Var3.setOnClickListener(new kn0(po0Var, 2));
                org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(0, po0Var.getContext(), po0Var.J0, true, true);
                if (z10) {
                    z0Var4.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28878eh, po0Var.J0));
                    z0Var4.setIconColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.H6, po0Var.J0));
                }
                z0Var4.j(org.telegram.messenger.hd.M0(2131745601, null), 2131232359, null);
                z0Var4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var4, c8.ja.o(-1, 48));
                z0Var4.setOnClickListener(new kn0(po0Var, 3));
                po0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.j6.I5, po0Var.J0);
                linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, c8.ja.o(-1, -2));
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                po0Var.F2 = g1Var;
                g1Var.f28553b = false;
                g1Var.setAnimationStyle(2131755193);
                po0Var.F2.setOutsideTouchable(true);
                po0Var.F2.setClippingEnabled(true);
                po0Var.F2.setInputMethodMode(2);
                po0Var.F2.setSoftInputMode(0);
                po0Var.F2.getContentView().setFocusableInTouchMode(true);
                int i11 = org.telegram.messenger.gz.f23929a;
                SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                edit.putInt("scheduledOrNoSoundHintShows", 3);
                edit.apply();
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                po0Var.F2.setFocusable(true);
                int[] iArr = new int[2];
                u1Var.getLocationInWindow(iArr);
                if (po0Var.d && (anVar = po0Var.f38341b2) != null && anVar.f45278m1.getMeasuredHeight() > org.telegram.messenger.g0.L(58.0f)) {
                    measuredHeight = u1Var.getMeasuredHeight() + iArr[1];
                } else {
                    measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
                }
                po0Var.F2.showAtLocation(u1Var, 51, org.telegram.messenger.g0.L(8.0f) + ((u1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
                po0Var.F2.b();
                try {
                    u1Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
        }
    }
}
