package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a implements View.OnClickListener {
    public final int f32419a;
    public final Object f32420b;

    public a(Object obj, int i10) {
        this.f32419a = i10;
        this.f32420b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.j6 j6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.Cells.s8 s8Var;
        Runnable runnable;
        int i11 = this.f32419a;
        Object obj = this.f32420b;
        switch (i11) {
            case 0:
                ((ah.a) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.g3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.w0 webView = ((p3) obj).f37161f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                s4 s4Var = (s4) obj;
                if (view == s4Var.e) {
                    org.telegram.ui.Components.z4.k(s4Var.getParentActivity(), null, new h(s4Var, 4));
                    return;
                }
                int i12 = ((r4) view).e;
                if (s4Var.U() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m.j0(15));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new mg.w(8, s4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                s4Var.W(view, true);
                return;
            case 4:
                ((e5) obj).b(false);
                return;
            case 5:
                ((b7) obj).m0();
                return;
            case 6:
                s6 s6Var = (s6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s6Var.getContext());
                StringBuilder sb = new StringBuilder();
                sb.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(s6Var.f36798c.f25887g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) j6Var.f25887g) + ")";
                }
                sb.append(str);
                String sb2 = sb.toString();
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19503a;
                d2Var2.O = sb2;
                d2Var2.Q = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(s6Var.f36797b.f25887g, new a1(s6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                s6Var.d.showDialog(d2Var2);
                View d = d2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.j6.f20122p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                    d.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i13, false))));
                    return;
                }
                return;
            case 7:
                b7 b7Var = ((z6) obj).e;
                b7Var.J = !b7Var.J;
                b7Var.w0(true);
                b7Var.v0();
                return;
            case 8:
                m7 m7Var = (m7) obj;
                switch (m7Var.f36215f) {
                    case 0:
                        ((n7) m7Var.h).f36474r.v.r(null, (mh.a) m7Var.getTag(), true);
                        return;
                    default:
                        ((s7) m7Var.h).f38206n.v.r(null, (mh.a) m7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ah.a) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.jj0 jj0Var = ((i9) obj).d;
                if (!jj0Var.b()) {
                    jj0Var.setProgress(0.0f);
                    jj0Var.d();
                    return;
                }
                return;
            case 11:
                v9 v9Var = (v9) obj;
                CameraView cameraView = v9Var.f39111c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) v9Var.f39114r.getBackground();
                    AnimatorSet animatorSet = v9Var.f39115s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        v9Var.f39115s = null;
                    }
                    v9Var.f39115s = new AnimatorSet();
                    org.telegram.ui.Components.l6 l6Var = org.telegram.ui.Components.n6.e;
                    if (v9Var.f39114r.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, l6Var, i10);
                    ofInt.addUpdateListener(new p9(v9Var, 1));
                    v9Var.f39115s.playTogether(ofInt);
                    v9Var.f39115s.setDuration(200L);
                    v9Var.f39115s.setInterpolator(org.telegram.ui.Components.nr.f27346f);
                    v9Var.f39115s.addListener(new s5(v9Var, 2));
                    v9Var.f39115s.start();
                    if (v9Var.f39114r.getTag() == null) {
                        v9Var.f39114r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    v9Var.f39114r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((bd) obj).w0();
                return;
            case 13:
                xn xnVar = ((jj) obj).f35363b;
                xnVar.f39997e0.n();
                nh.t2 t2Var = xnVar.G1;
                if (t2Var != null) {
                    t2Var.I1(null, 0);
                }
                xnVar.X9();
                return;
            case 14:
                xn xnVar2 = ((jn) obj).f35381a;
                e5Var = ((org.telegram.ui.ActionBar.p2) xnVar2).parentLayout;
                if (e5Var != null) {
                    e5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar2).parentLayout;
                    ((ActionBarLayout) e5Var2).r();
                    return;
                }
                return;
            case 15:
                ((iq) obj).e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.s8[]) obj)[0].setChecked(!s8Var.e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.b3) obj).f19525a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                b.k(3, (org.telegram.ui.ActionBar.p2) obj);
                return;
            case 19:
                final gv gvVar = (gv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(gvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f19503a;
                d2Var3.O = string2;
                d2Var3.Q = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2() {
                    @Override
                    public final void i(org.telegram.ui.ActionBar.d2 d2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                gvVar.dismiss();
                                return;
                            default:
                                gv gvVar2 = gvVar;
                                gvVar2.dismiss();
                                n7.qa qaVar = gvVar2.W;
                                ((b7) qaVar.f14703c).l0(gvVar2.V, gvVar2.Y, gvVar2.f34688d0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2() {
                    @Override
                    public final void i(org.telegram.ui.ActionBar.d2 d2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                gvVar.dismiss();
                                return;
                            default:
                                gv gvVar2 = gvVar;
                                gvVar2.dismiss();
                                n7.qa qaVar = gvVar2.W;
                                ((b7) qaVar.f14703c).l0(gvVar2.V, gvVar2.Y, gvVar2.f34688d0);
                                return;
                        }
                    }
                });
                d2Var3.show();
                d2Var3.h();
                return;
            case 20:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 21:
                String str2 = (String) obj;
                ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
                if (applicationLoader != null) {
                    applicationLoader.onSuggestionClick(str2);
                    return;
                }
                return;
            case 22:
                ((o00) obj).Q();
                return;
            case 23:
                ((n00) obj).f36422a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.jj0 jj0Var2 = ((r00) obj).f37892a;
                if (!jj0Var2.b()) {
                    jj0Var2.setProgress(0.0f);
                    jj0Var2.d();
                    return;
                }
                return;
            case 25:
                ((u00) obj).c();
                return;
            case 26:
                v10 v10Var = (v10) obj;
                org.telegram.ui.Components.i90 i90Var = v10Var.f39057s;
                if ((!v10Var.f39056r || i90Var.b()) && v10Var.f39059x != null) {
                    v10Var.f39056r = true;
                    i90Var.f25633b = -1L;
                    i90Var.f25634c = -1L;
                    v10Var.f39055n.invalidate();
                    o00.S(v10Var.B, v10Var.f39059x, new c10(v10Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.jj0 jj0Var3 = ((w10) obj).f39298a;
                if (!jj0Var3.b()) {
                    jj0Var3.setProgress(0.0f);
                    jj0Var3.d();
                    return;
                }
                return;
            case 28:
                final z10 z10Var = (z10) obj;
                v10 v10Var2 = (v10) view.getParent();
                final MessagesController.DialogFilter currentFilter = v10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = z10Var.e;
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(filtersSetupActivity, v10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                z10 z10Var2 = z10Var;
                                FiltersSetupActivity filtersSetupActivity2 = z10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = z10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new eg.v0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new b10(dialogFilter, null));
                                return;
                            default:
                                z10 z10Var3 = z10Var;
                                FiltersSetupActivity filtersSetupActivity3 = z10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.f16669id, new w3(z10Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f19503a.O = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f19503a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new qs(9, z10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.f19503a;
                                filtersSetupActivity3.showDialog(d2Var4);
                                TextView textView = (TextView) d2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                z10 z10Var2 = z10Var;
                                FiltersSetupActivity filtersSetupActivity2 = z10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = z10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new eg.v0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new b10(dialogFilter, null));
                                return;
                            default:
                                z10 z10Var3 = z10Var;
                                FiltersSetupActivity filtersSetupActivity3 = z10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.f16669id, new w3(z10Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f19503a.O = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f19503a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new qs(9, z10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.f19503a;
                                filtersSetupActivity3.showDialog(d2Var4);
                                TextView textView = (TextView) d2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f27471i = 3;
                }
                H.W(filtersSetupActivity.f31597a.V0(v10Var2, false));
                H.Z();
                return;
            default:
                ((m50) obj).dismiss();
                return;
        }
    }
}
