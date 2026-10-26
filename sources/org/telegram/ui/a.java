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
    public final int f37606a;
    public final Object f37607b;

    public a(Object obj, int i10) {
        this.f37606a = i10;
        this.f37607b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.r6 r6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.Cells.a9 a9Var;
        Runnable runnable;
        int i11 = this.f37606a;
        Object obj = this.f37607b;
        switch (i11) {
            case 0:
                ((ai.h0) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.k3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.x0 webView = ((m3) obj).f41445f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                t4 t4Var = (t4) obj;
                if (view == t4Var.e) {
                    org.telegram.ui.Components.g5.k(t4Var.getParentActivity(), null, new f(t4Var, 4));
                    return;
                }
                int i12 = ((s4) view).e;
                if (t4Var.V() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                    e2Var.R = string;
                    e2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.x0(23));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4.s0(8, t4Var, view));
                    alertDialog$Builder.p();
                    return;
                }
                t4Var.X(view, true);
                return;
            case 4:
                ((f5) obj).b(false);
                return;
            case 5:
                t6 t6Var = (t6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(t6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(t6Var.f42367c.f32126i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) r6Var.f32126i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                e2Var2.R = sb3;
                e2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(t6Var.f42366b.f32126i, new y0(t6Var, 9));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                t6Var.d.showDialog(e2Var2);
                View d = e2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.y6.f23581p7;
                    org.telegram.ui.ActionBar.f7.V((TextView) d, i13, null);
                    d.setBackground(org.telegram.ui.ActionBar.y6.I0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.x0(null, i13, false))));
                    return;
                }
                return;
            case 6:
                c7 c7Var = ((a7) obj).e;
                c7Var.L = !c7Var.L;
                c7Var.w0(true);
                c7Var.u0();
                return;
            case 7:
                o7 o7Var = (o7) obj;
                switch (o7Var.f42112f) {
                    case 0:
                        ((p7) o7Var.h).f42381r.F.q(null, (ci.a) o7Var.getTag(), true);
                        return;
                    default:
                        ((u7) o7Var.h).f44032n.F.q(null, (ci.a) o7Var.getTag(), true);
                        return;
                }
            case 8:
                ((g4) obj).run();
                return;
            case 9:
                org.telegram.ui.Components.ak0 ak0Var = ((l9) obj).d;
                if (!ak0Var.b()) {
                    ak0Var.setProgress(0.0f);
                    ak0Var.d();
                    return;
                }
                return;
            case 10:
                y9 y9Var = (y9) obj;
                CameraView cameraView = y9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) y9Var.f46005s.getBackground();
                    AnimatorSet animatorSet = y9Var.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        y9Var.v = null;
                    }
                    y9Var.v = new AnimatorSet();
                    org.telegram.ui.Components.t6 t6Var2 = org.telegram.ui.Components.v6.e;
                    if (y9Var.f46005s.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, t6Var2, i10);
                    ofInt.addUpdateListener(new s9(y9Var, 1));
                    y9Var.v.playTogether(ofInt);
                    y9Var.v.setDuration(200L);
                    y9Var.v.setInterpolator(org.telegram.ui.Components.ds.f27586f);
                    y9Var.v.addListener(new kg.e(y9Var, 10));
                    y9Var.v.start();
                    if (y9Var.f46005s.getTag() == null) {
                        y9Var.f46005s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    y9Var.f46005s.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 11:
                ((bd) obj).z0();
                return;
            case 12:
                un unVar = ((gj) obj).f39709b;
                unVar.f44269h0.o();
                di.a3 a3Var = unVar.V1;
                if (a3Var != null) {
                    a3Var.O1(null, 0);
                }
                unVar.ha();
                return;
            case 13:
                un unVar2 = ((fn) obj).f39423a;
                j5Var = ((org.telegram.ui.ActionBar.r2) unVar2).parentLayout;
                if (j5Var != null) {
                    j5Var2 = ((org.telegram.ui.ActionBar.r2) unVar2).parentLayout;
                    ((ActionBarLayout) j5Var2).r();
                    return;
                }
                return;
            case 14:
                ((fq) obj).e.s0(true);
                return;
            case 15:
                ContactsActivity.X((ContactsActivity) obj);
                return;
            case 16:
                ((org.telegram.ui.Cells.a9[]) obj)[0].setChecked(!a9Var.e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.e3) obj).f22601a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.vh.l(3, (org.telegram.ui.ActionBar.r2) obj);
                return;
            case 19:
                final vu vuVar = (vu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(vuVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.f22368a;
                e2Var3.R = string2;
                e2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                vuVar.dismiss();
                                return;
                            default:
                                vu vuVar2 = vuVar;
                                vuVar2.dismiss();
                                m4.c cVar = vuVar2.Z;
                                ((c7) cVar.f18010c).k0(vuVar2.Y, vuVar2.f44904b0, vuVar2.f44909g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                vuVar.dismiss();
                                return;
                            default:
                                vu vuVar2 = vuVar;
                                vuVar2.dismiss();
                                m4.c cVar = vuVar2.Z;
                                ((c7) cVar.f18010c).k0(vuVar2.Y, vuVar2.f44904b0, vuVar2.f44909g0);
                                return;
                        }
                    }
                });
                e2Var3.show();
                e2Var3.i();
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
                ((b00) obj).Q();
                return;
            case 23:
                ((a00) obj).f37610a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.ak0 ak0Var2 = ((e00) obj).f38962a;
                if (!ak0Var2.b()) {
                    ak0Var2.setProgress(0.0f);
                    ak0Var2.d();
                    return;
                }
                return;
            case 25:
                ((h00) obj).c();
                return;
            case 26:
                l10 l10Var = (l10) obj;
                org.telegram.ui.Components.da0 da0Var = l10Var.f41107s;
                if ((!l10Var.f41106r || da0Var.c()) && l10Var.f41109x != null) {
                    l10Var.f41106r = true;
                    da0Var.f27462b = -1L;
                    da0Var.f27463c = -1L;
                    l10Var.f41105n.invalidate();
                    b00.S(l10Var.H, l10Var.f41109x, new p00(l10Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.ak0 ak0Var3 = ((m10) obj).f41431a;
                if (!ak0Var3.b()) {
                    ak0Var3.setProgress(0.0f);
                    ak0Var3.d();
                    return;
                }
                return;
            case 28:
                final p10 p10Var = (p10) obj;
                l10 l10Var2 = (l10) view.getParent();
                final MessagesController.DialogFilter currentFilter = l10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = p10Var.e;
                org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(filtersSetupActivity, l10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                p10 p10Var2 = p10Var;
                                FiltersSetupActivity filtersSetupActivity2 = p10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = p10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.r2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new tg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new o00(dialogFilter, null));
                                return;
                            default:
                                p10 p10Var3 = p10Var;
                                FiltersSetupActivity filtersSetupActivity3 = p10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.n10.U(filtersSetupActivity3, dialogFilter2.f19549id, new t3(p10Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f22368a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f22368a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.voip.k1(12, p10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.e2 e2Var4 = alertDialog$Builder4.f22368a;
                                filtersSetupActivity3.showDialog(e2Var4);
                                TextView textView = (TextView) e2Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
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
                                p10 p10Var2 = p10Var;
                                FiltersSetupActivity filtersSetupActivity2 = p10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = p10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.r2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new tg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new o00(dialogFilter, null));
                                return;
                            default:
                                p10 p10Var3 = p10Var;
                                FiltersSetupActivity filtersSetupActivity3 = p10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.n10.U(filtersSetupActivity3, dialogFilter2.f19549id, new t3(p10Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f22368a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f22368a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.voip.k1(12, p10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.e2 e2Var4 = alertDialog$Builder4.f22368a;
                                filtersSetupActivity3.showDialog(e2Var4);
                                TextView textView = (TextView) e2Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f29850i = 3;
                }
                H.W(filtersSetupActivity.f35508a.V0(l10Var2, false));
                H.Z();
                return;
            default:
                ((e50) obj).dismiss();
                return;
        }
    }
}
