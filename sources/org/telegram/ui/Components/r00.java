package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class r00 implements View.OnLongClickListener {
    public final int f29792a;
    public final Object f29793b;

    public r00(Object obj, int i10) {
        this.f29792a = i10;
        this.f29793b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int measuredHeight;
        org.telegram.ui.un unVar;
        int i10 = this.f29792a;
        Object obj = this.f29793b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                final float C = MediaController.B().C(fragmentContextView.W);
                fragmentContextView.I.e(false, C);
                org.telegram.ui.ActionBar.x0 x0Var = fragmentContextView.I;
                int i11 = org.telegram.ui.ActionBar.t6.G8;
                org.telegram.ui.ActionBar.a7.i(i11, x0Var, fragmentContextView.f24050q0);
                org.telegram.ui.ActionBar.x0 x0Var2 = fragmentContextView.I;
                x0Var2.N = fragmentContextView.h instanceof org.telegram.ui.un;
                x0Var2.F.setShader(null);
                x0Var2.h = null;
                Bitmap bitmap = x0Var2.f21545f;
                if (bitmap != null) {
                    bitmap.recycle();
                    x0Var2.f21545f = null;
                }
                fragmentContextView.G.H(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                fragmentContextView.G.V();
                fragmentContextView.q(false);
                fragmentContextView.G.setDimMenu(0.3f);
                fragmentContextView.G.U(fragmentContextView.I, null);
                fragmentContextView.G.setOnMenuDismiss(new org.telegram.messenger.q20() {
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
                org.telegram.messenger.vp.e1().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                zc0 zc0Var = (zc0) obj;
                zc0Var.f33019r.setText("");
                uc0.a(zc0Var.f33020s, true);
                Drawable drawable = zc0Var.f33006a;
                if (drawable instanceof jb0) {
                    ((jb0) drawable).x();
                }
                return true;
            default:
                final op0 op0Var = (op0) obj;
                bi.f2 f2Var = op0Var.l1;
                boolean z10 = op0Var.Z1;
                Activity activity = op0Var.Y1;
                if (activity == null) {
                    return false;
                }
                LinearLayout linearLayout = new LinearLayout(op0Var.getContext());
                linearLayout.setOrientation(1);
                if (op0Var.F1 != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, op0Var.I0);
                    if (z10) {
                        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Tg, actionBarPopupWindow$ActionBarPopupWindowLayout, op0Var.I0);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new yo0(op0Var, 0));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new io0(op0Var, 2));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                    final org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(1, op0Var.getContext(), op0Var.I0, true, false);
                    if (z10) {
                        b1Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20901bh, op0Var.I0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var, w7.b6.o(-1, 48));
                    b1Var.j(org.telegram.messenger.cd.L0(2131745349, null), 0, null);
                    op0Var.A2 = true;
                    b1Var.setChecked(true);
                    final org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(1, op0Var.getContext(), op0Var.I0, false, true);
                    if (z10) {
                        b1Var2.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20901bh, op0Var.I0));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var2, w7.b6.o(-1, 48));
                    b1Var2.j(org.telegram.messenger.cd.L0(2131749317, null), 0, null);
                    b1Var2.setChecked(!op0Var.A2);
                    b1Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    op0 op0Var2 = op0Var;
                                    op0Var2.A2 = true;
                                    b1Var.setChecked(true);
                                    b1Var2.setChecked(!op0Var2.A2);
                                    return;
                                default:
                                    op0 op0Var3 = op0Var;
                                    op0Var3.A2 = false;
                                    b1Var.setChecked(false);
                                    b1Var2.setChecked(!op0Var3.A2);
                                    return;
                            }
                        }
                    });
                    b1Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r4) {
                                case 0:
                                    op0 op0Var2 = op0Var;
                                    op0Var2.A2 = true;
                                    b1Var.setChecked(true);
                                    b1Var2.setChecked(!op0Var2.A2);
                                    return;
                                default:
                                    op0 op0Var3 = op0Var;
                                    op0Var3.A2 = false;
                                    b1Var.setChecked(false);
                                    b1Var2.setChecked(!op0Var3.A2);
                                    return;
                            }
                        }
                    });
                    op0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.t6.I5, op0Var.I0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.b6.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, op0Var.I0);
                if (z10) {
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Tg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new yo0(op0Var, 1));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new io0(op0Var, 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(0, op0Var.getContext(), op0Var.I0, true, true);
                if (z10) {
                    b1Var3.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20901bh, op0Var.I0));
                    b1Var3.setIconColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.H6, op0Var.I0));
                }
                b1Var3.j(org.telegram.messenger.cd.L0(2131745600, null), 2131231509, null);
                b1Var3.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(b1Var3, w7.b6.o(-1, 48));
                b1Var3.setOnClickListener(new ho0(op0Var, 2));
                org.telegram.ui.ActionBar.b1 b1Var4 = new org.telegram.ui.ActionBar.b1(0, op0Var.getContext(), op0Var.I0, true, true);
                if (z10) {
                    b1Var4.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20901bh, op0Var.I0));
                    b1Var4.setIconColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.H6, op0Var.I0));
                }
                b1Var4.j(org.telegram.messenger.cd.L0(2131745618, null), 2131232357, null);
                b1Var4.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(b1Var4, w7.b6.o(-1, 48));
                b1Var4.setOnClickListener(new ho0(op0Var, 3));
                op0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.t6.I5, op0Var.I0);
                linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.b6.o(-1, -2));
                org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(linearLayout, -2, -2);
                op0Var.B2 = k1Var;
                k1Var.f20455b = false;
                k1Var.setAnimationStyle(2131755193);
                op0Var.B2.setOutsideTouchable(true);
                op0Var.B2.setClippingEnabled(true);
                op0Var.B2.setInputMethodMode(2);
                op0Var.B2.setSoftInputMode(0);
                op0Var.B2.getContentView().setFocusableInTouchMode(true);
                int i12 = org.telegram.messenger.tz.f18131a;
                SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                edit.putInt("scheduledOrNoSoundHintShows", 3);
                edit.apply();
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE));
                op0Var.B2.setFocusable(true);
                int[] iArr = new int[2];
                f2Var.getLocationInWindow(iArr);
                if (op0Var.d && (unVar = op0Var.X1) != null && unVar.l1.getMeasuredHeight() > org.telegram.messenger.i0.L(58.0f)) {
                    measuredHeight = f2Var.getMeasuredHeight() + iArr[1];
                } else {
                    measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f);
                }
                op0Var.B2.showAtLocation(f2Var, 51, org.telegram.messenger.i0.L(8.0f) + ((f2Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), measuredHeight);
                op0Var.B2.b();
                try {
                    f2Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
        }
    }
}
