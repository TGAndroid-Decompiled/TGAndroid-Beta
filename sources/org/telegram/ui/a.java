package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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

    public final int f36321a;

    public final Object f36322b;

    public a(Object obj, int i10) {
        this.f36321a = i10;
        this.f36322b = obj;
    }

    @Override
    public final void onClick(View view) {
        CameraSessionWrapper cameraSession;
        int i10 = this.f36321a;
        int i11 = 3;
        final int i12 = 0;
        final int i13 = 1;
        Object obj = this.f36322b;
        switch (i10) {
            case 0:
                ((d5.i) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.e3[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.w0 webView = ((q3) obj).f41499f.getWebView();
                if (webView != null) {
                    webView.reload();
                }
                break;
            case 3:
                q4 q4Var = (q4) obj;
                if (view != q4Var.f41512e) {
                    int i14 = ((p4) view).f41259e;
                    if (q4Var.U() == 0 && i14 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getParentActivity());
                        String string = LocaleController.getString(R.string.MessageLifetime);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.N = string;
                        b2Var.P = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ng.a(21));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new jh.z1(9, q4Var, view));
                        alertDialog$Builder.o();
                    } else {
                        q4Var.W(view, true);
                    }
                } else {
                    org.telegram.ui.Components.y4.k(q4Var.getParentActivity(), null, new g(q4Var, 4));
                }
                break;
            case 4:
                ((c5) obj).b(false);
                break;
            case 5:
                ((z6) obj).m0();
                break;
            case 6:
                p6 p6Var = (p6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.i6 i6Var = p6Var.f39955c;
                sb2.append(TextUtils.isEmpty(i6Var.f29243g) ? "" : " (" + ((Object) i6Var.f29243g) + ")");
                String string2 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                b2Var2.N = string2;
                b2Var2.P = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(p6Var.f39954b.f29243g, new c1(p6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p6Var.d.showDialog(b2Var2);
                View viewD = b2Var2.d(-1);
                if (viewD instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.g6.f23269p7;
                    ((TextView) viewD).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                    viewD.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i15, false))));
                }
                break;
            case 7:
                z6 z6Var = ((x6) obj).f44289e;
                z6Var.I = !z6Var.I;
                z6Var.w0(true);
                z6Var.v0();
                break;
            case 8:
                k7 k7Var = (k7) obj;
                switch (k7Var.f39632f) {
                    case 0:
                        ((l7) k7Var.h).f39961r.v.J(null, (ih.a) k7Var.getTag(), true);
                        break;
                    default:
                        ((q7) k7Var.h).f41534n.v.J(null, (ih.a) k7Var.getTag(), true);
                        break;
                }
                break;
            case 9:
                ((d5.i) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.ri0 ri0Var = ((g9) obj).d;
                if (!ri0Var.b()) {
                    ri0Var.setProgress(0.0f);
                    ri0Var.d();
                }
                break;
            case 11:
                t9 t9Var = (t9) obj;
                CameraView cameraView = t9Var.f42821c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) t9Var.f42825r.getBackground();
                    AnimatorSet animatorSet = t9Var.f42826s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        t9Var.f42826s = null;
                    }
                    t9Var.f42826s = new AnimatorSet();
                    ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.m6.f30581e, t9Var.f42825r.getTag() == null ? 68 : 34);
                    objectAnimatorOfInt.addUpdateListener(new n9(t9Var, i13));
                    t9Var.f42826s.playTogether(objectAnimatorOfInt);
                    t9Var.f42826s.setDuration(200L);
                    t9Var.f42826s.setInterpolator(org.telegram.ui.Components.er.f28122f);
                    t9Var.f42826s.addListener(new lh.h9(t9Var, 11));
                    t9Var.f42826s.start();
                    if (t9Var.f42825r.getTag() != null) {
                        t9Var.f42825r.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                    } else {
                        t9Var.f42825r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                    }
                }
                break;
            case 12:
                ((xc) obj).w0();
                break;
            case 13:
                rn rnVar = ((dj) obj).f37415b;
                rnVar.f42013d0.n();
                jh.t2 t2Var = rnVar.F1;
                if (t2Var != null) {
                    t2Var.I1(null, 0);
                }
                rnVar.X9();
                break;
            case 14:
                rn rnVar2 = ((dn) obj).f37446a;
                if (((org.telegram.ui.ActionBar.n2) rnVar2).parentLayout != null) {
                    ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) rnVar2).parentLayout).r();
                }
                break;
            case 15:
                ((cq) obj).f37130e.r0(true);
                break;
            case 16:
                org.telegram.ui.Cells.p8 p8Var = ((org.telegram.ui.Cells.p8[]) obj)[0];
                p8Var.setChecked(!p8Var.f25003e.h);
                break;
            case 17:
                ((org.telegram.ui.ActionBar.z2) obj).f23994a.dismissRunnable.run();
                break;
            case 18:
                org.telegram.messenger.rl.k(3, (org.telegram.ui.ActionBar.n2) obj);
                break;
            case 19:
                final av avVar = (av) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(avVar.getContext());
                String string3 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f22702a;
                b2Var3.N = string3;
                b2Var3.P = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                avVar.dismiss();
                                break;
                            default:
                                av avVar2 = avVar;
                                avVar2.dismiss();
                                i6 i6Var2 = avVar2.V;
                                ((z6) i6Var2.f38985c).l0(avVar2.U, avVar2.X, avVar2.f36639c0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                avVar.dismiss();
                                break;
                            default:
                                av avVar2 = avVar;
                                avVar2.dismiss();
                                i6 i6Var2 = avVar2.V;
                                ((z6) i6Var2.f38985c).l0(avVar2.U, avVar2.X, avVar2.f36639c0);
                                break;
                        }
                    }
                });
                b2Var3.show();
                b2Var3.h();
                break;
            case 20:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                }
                break;
            case 21:
                String str = (String) obj;
                ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
                if (applicationLoader != null) {
                    applicationLoader.onSuggestionClick(str);
                }
                break;
            case 22:
                ((d00) obj).Q();
                break;
            case 23:
                ((c00) obj).f36905a.dismiss();
                break;
            case 24:
                org.telegram.ui.Components.ri0 ri0Var2 = ((g00) obj).f38251a;
                if (!ri0Var2.b()) {
                    ri0Var2.setProgress(0.0f);
                    ri0Var2.d();
                }
                break;
            case 25:
                ((j00) obj).c();
                break;
            case 26:
                k10 k10Var = (k10) obj;
                org.telegram.ui.Components.t80 t80Var = k10Var.f39568s;
                if ((!k10Var.f39567r || t80Var.b()) && k10Var.f39570x != null) {
                    k10Var.f39567r = true;
                    t80Var.f32692b = -1L;
                    t80Var.f32693c = -1L;
                    k10Var.f39566n.invalidate();
                    d00.S(k10Var.A, k10Var.f39570x, new r00(k10Var, i11));
                }
                break;
            case 27:
                org.telegram.ui.Components.ri0 ri0Var3 = ((l10) obj).f39912a;
                if (!ri0Var3.b()) {
                    ri0Var3.setProgress(0.0f);
                    ri0Var3.d();
                }
                break;
            case 28:
                final o10 o10Var = (o10) obj;
                k10 k10Var2 = (k10) view.getParent();
                final MessagesController.DialogFilter currentFilter = k10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = o10Var.f40974e;
                org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(filtersSetupActivity, k10Var2);
                b70VarH.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                o10 o10Var2 = o10Var;
                                FiltersSetupActivity filtersSetupActivity2 = o10Var2.f40974e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new q00(dialogFilter, null));
                                } else {
                                    filtersSetupActivity2.showDialog(new ag.i1(3, ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount, o10Var2.d, filtersSetupActivity2, null));
                                }
                                break;
                            default:
                                o10 o10Var3 = o10Var;
                                FiltersSetupActivity filtersSetupActivity3 = o10Var3.f40974e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new zr(10, o10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f22702a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                    }
                                } else {
                                    org.telegram.ui.Components.q00.T(filtersSetupActivity3, dialogFilter2.f19622id, new x3(o10Var3, 5));
                                }
                                break;
                        }
                    }
                }, false);
                b70VarH.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() {
                    @Override
                    public final void run() {
                        switch (i13) {
                            case 0:
                                o10 o10Var2 = o10Var;
                                FiltersSetupActivity filtersSetupActivity2 = o10Var2.f40974e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new q00(dialogFilter, null));
                                } else {
                                    filtersSetupActivity2.showDialog(new ag.i1(3, ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount, o10Var2.d, filtersSetupActivity2, null));
                                }
                                break;
                            default:
                                o10 o10Var3 = o10Var;
                                FiltersSetupActivity filtersSetupActivity3 = o10Var3.f40974e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new zr(10, o10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f22702a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                    }
                                } else {
                                    org.telegram.ui.Components.q00.T(filtersSetupActivity3, dialogFilter2.f19622id, new x3(o10Var3, 5));
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    b70VarH.f26974i = 3;
                }
                b70VarH.W(filtersSetupActivity.f35479a.V0(k10Var2, false));
                b70VarH.Z();
                break;
            default:
                ((b50) obj).dismiss();
                break;
        }
    }
}
