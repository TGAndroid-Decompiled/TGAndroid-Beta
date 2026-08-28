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
    public final int f36318a;
    public final Object f36319b;

    public a(Object obj, int i9) {
        this.f36318a = i9;
        this.f36319b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.i6 i6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i9;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.Cells.t8 t8Var;
        Runnable runnable;
        int i10 = this.f36318a;
        Object obj = this.f36319b;
        switch (i10) {
            case 0:
                ((d5.i) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.v0 webView = ((p3) obj).f41323f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                p4 p4Var = (p4) obj;
                if (view == p4Var.f41336e) {
                    org.telegram.ui.Components.y4.k(p4Var.getParentActivity(), null, new g(p4Var, 4));
                    return;
                }
                int i11 = ((o4) view).f40877e;
                if (p4Var.T() == 0 && i11 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.N = string;
                    c2Var.P = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i11 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mg.b(16));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ih.v3(9, p4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                p4Var.V(view, true);
                return;
            case 4:
                ((b5) obj).b(false);
                return;
            case 5:
                ((y6) obj).l0();
                return;
            case 6:
                o6 o6Var = (o6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(o6Var.f39382c.f29337g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) i6Var.f29337g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                c2Var2.N = sb3;
                c2Var2.P = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(o6Var.f39381b.f29337g, new b1(o6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                o6Var.d.showDialog(c2Var2);
                View d = c2Var2.d(-1);
                if (d instanceof TextView) {
                    int i12 = org.telegram.ui.ActionBar.f6.f23212p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                    d.setBackground(org.telegram.ui.ActionBar.f6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.w0(null, i12, false))));
                    return;
                }
                return;
            case 7:
                y6 y6Var = ((w6) obj).f43679e;
                y6Var.I = !y6Var.I;
                y6Var.v0(true);
                y6Var.u0();
                return;
            case 8:
                j7 j7Var = (j7) obj;
                switch (j7Var.f39390f) {
                    case 0:
                        ((k7) j7Var.h).f39761r.v.o1(null, (hh.a) j7Var.getTag(), true);
                        return;
                    default:
                        ((p7) j7Var.h).f41350n.v.o1(null, (hh.a) j7Var.getTag(), true);
                        return;
                }
            case 9:
                ((d5.i) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.pi0 pi0Var = ((f9) obj).d;
                if (!pi0Var.b()) {
                    pi0Var.setProgress(0.0f);
                    pi0Var.d();
                    return;
                }
                return;
            case 11:
                s9 s9Var = (s9) obj;
                CameraView cameraView = s9Var.f42596c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) s9Var.f42600r.getBackground();
                    AnimatorSet animatorSet = s9Var.f42601s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        s9Var.f42601s = null;
                    }
                    s9Var.f42601s = new AnimatorSet();
                    org.telegram.ui.Components.k6 k6Var = org.telegram.ui.Components.m6.f30703e;
                    if (s9Var.f42600r.getTag() == null) {
                        i9 = 68;
                    } else {
                        i9 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, k6Var, i9);
                    ofInt.addUpdateListener(new m9(s9Var, 1));
                    s9Var.f42601s.playTogether(ofInt);
                    s9Var.f42601s.setDuration(200L);
                    s9Var.f42601s.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                    s9Var.f42601s.addListener(new mh.x(s9Var, 9));
                    s9Var.f42601s.start();
                    if (s9Var.f42600r.getTag() == null) {
                        s9Var.f42600r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    s9Var.f42600r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((xc) obj).v0();
                return;
            case 13:
                qn qnVar = ((bj) obj).f36877b;
                qnVar.f41878d0.n();
                ih.u2 u2Var = qnVar.F1;
                if (u2Var != null) {
                    u2Var.I1(null, 0);
                }
                qnVar.X9();
                return;
            case 14:
                qn qnVar2 = ((cn) obj).f37236a;
                b5Var = ((org.telegram.ui.ActionBar.o2) qnVar2).parentLayout;
                if (b5Var != null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.o2) qnVar2).parentLayout;
                    ((ActionBarLayout) b5Var2).r();
                    return;
                }
                return;
            case 15:
                ((aq) obj).f36536e.q0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.t8[]) obj)[0].setChecked(!t8Var.f25711e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f22713a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.ll.m(3, (org.telegram.ui.ActionBar.o2) obj);
                return;
            case 19:
                final xu xuVar = (xu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xuVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22702a;
                c2Var3.N = string2;
                c2Var3.P = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var4, int i13) {
                        switch (r2) {
                            case 0:
                                xuVar.dismiss();
                                return;
                            default:
                                xu xuVar2 = xuVar;
                                xuVar2.dismiss();
                                g5.b bVar = xuVar2.V;
                                ((y6) bVar.f7112c).k0(xuVar2.U, xuVar2.X, xuVar2.f44606c0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var4, int i13) {
                        switch (r2) {
                            case 0:
                                xuVar.dismiss();
                                return;
                            default:
                                xu xuVar2 = xuVar;
                                xuVar2.dismiss();
                                g5.b bVar = xuVar2.V;
                                ((y6) bVar.f7112c).k0(xuVar2.U, xuVar2.X, xuVar2.f44606c0);
                                return;
                        }
                    }
                });
                c2Var3.show();
                c2Var3.h();
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
                ((a00) obj).P();
                return;
            case 23:
                ((zz) obj).f45276a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.pi0 pi0Var2 = ((d00) obj).f37369a;
                if (!pi0Var2.b()) {
                    pi0Var2.setProgress(0.0f);
                    pi0Var2.d();
                    return;
                }
                return;
            case 25:
                ((g00) obj).c();
                return;
            case 26:
                h10 h10Var = (h10) obj;
                org.telegram.ui.Components.p80 p80Var = h10Var.f38645s;
                if ((!h10Var.f38644r || p80Var.b()) && h10Var.f38647x != null) {
                    h10Var.f38644r = true;
                    p80Var.f31572b = -1L;
                    p80Var.f31573c = -1L;
                    h10Var.f38643n.invalidate();
                    a00.R(h10Var.A, h10Var.f38647x, new o00(h10Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.pi0 pi0Var3 = ((i10) obj).f38985a;
                if (!pi0Var3.b()) {
                    pi0Var3.setProgress(0.0f);
                    pi0Var3.d();
                    return;
                }
                return;
            case 28:
                final l10 l10Var = (l10) obj;
                h10 h10Var2 = (h10) view.getParent();
                final MessagesController.DialogFilter currentFilter = h10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = l10Var.f39968e;
                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(filtersSetupActivity, h10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        switch (r3) {
                            case 0:
                                l10 l10Var2 = l10Var;
                                FiltersSetupActivity filtersSetupActivity2 = l10Var2.f39968e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = l10Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new zf.j0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new n00(dialogFilter, null));
                                return;
                            default:
                                l10 l10Var3 = l10Var;
                                FiltersSetupActivity filtersSetupActivity3 = l10Var3.f39968e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.n00.S(filtersSetupActivity3, dialogFilter2.f19649id, new w3(l10Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new yr(10, l10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f22702a;
                                filtersSetupActivity3.showDialog(c2Var4);
                                TextView textView = (TextView) c2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        switch (r3) {
                            case 0:
                                l10 l10Var2 = l10Var;
                                FiltersSetupActivity filtersSetupActivity2 = l10Var2.f39968e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = l10Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new zf.j0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new n00(dialogFilter, null));
                                return;
                            default:
                                l10 l10Var3 = l10Var;
                                FiltersSetupActivity filtersSetupActivity3 = l10Var3.f39968e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.n00.S(filtersSetupActivity3, dialogFilter2.f19649id, new w3(l10Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new yr(10, l10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f22702a;
                                filtersSetupActivity3.showDialog(c2Var4);
                                TextView textView = (TextView) c2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f34562i = 3;
                }
                H.W(filtersSetupActivity.f35476a.V0(h10Var2, false));
                H.Z();
                return;
            default:
                ((y40) obj).dismiss();
                return;
        }
    }
}
