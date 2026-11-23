package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class at implements org.telegram.ui.Components.rj0, org.telegram.ui.ActionBar.q1, ww, org.telegram.ui.Components.lt0, org.telegram.ui.Components.sj0, org.telegram.messenger.kc, OnCompleteListener {
    public final int f45644a;
    public final Object f45645b;
    public final Object f45646c;

    public at(int i7, Object obj, Object obj2) {
        this.f45644a = i7;
        this.f45645b = obj;
        this.f45646c = obj2;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean P(cx cxVar) {
        return false;
    }

    @Override
    public void b(org.telegram.messenger.qd qdVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.f45645b;
        int[] iArr = (int[]) this.f45646c;
        String str = LaunchActivity.C1;
        int i7 = qdVar.h.K1;
        iArr[0] = i7;
        launchActivity.O0(i7);
        qa0 qa0Var = new qa0(2);
        qa0Var.G0(qdVar.h);
        qa0Var.M0 = new ai.y(iArr, org.telegram.messenger.gj.B0(qdVar.h.f24177k), 10);
        launchActivity.t0(qa0Var);
    }

    @Override
    public boolean b1(View view) {
        switch (this.f45644a) {
            case 0:
                return false;
            case 4:
                return false;
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        qa0 qa0Var = (qa0) this.f45645b;
        Context context = (Context) this.f45646c;
        if (qa0Var.N0 == 2) {
            Object I = qa0Var.Q.I(i7);
            if (I instanceof ma0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, qa0Var.getParentActivity(), qa0Var.getResourceProvider(), true, true);
                y0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                y0Var.j(org.telegram.messenger.hd.N0(2131750456, null), 2131231104, null);
                y0Var.setOnClickListener(new org.telegram.ui.Components.q31(25, qa0Var, (ma0) I));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                la0 la0Var = new la0(qa0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                qa0Var.P0 = la0Var;
                la0Var.setOutsideTouchable(true);
                qa0Var.P0.setClippingEnabled(true);
                qa0Var.P0.setInputMethodMode(2);
                qa0Var.P0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                qa0Var.P0.showAtLocation(view, 48, 0, iArr[1] - org.telegram.messenger.g0.L(52.0f));
                qa0Var.P0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        switch (this.f45644a) {
            case 0:
                DataSettingsActivity.Z((DataSettingsActivity) this.f45645b, (Context) this.f45646c, view, i7, f10);
                return;
            case 4:
                cx.d0((cx) this.f45645b, (bx) this.f45646c, view, i7);
                return;
            case 6:
                FiltersSetupActivity.Z((FiltersSetupActivity) this.f45645b, (Context) this.f45646c, view, i7);
                return;
            default:
                NotificationsCustomSettingsActivity.Z((NotificationsCustomSettingsActivity) this.f45645b, (Context) this.f45646c, view, i7, f10, f11);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ConferenceCall conferenceCall;
        int i10;
        int i11 = this.f45644a;
        org.telegram.ui.ActionBar.t1 t1Var2 = null;
        int i12 = 0;
        Object obj = this.f45646c;
        Object obj2 = this.f45645b;
        switch (i11) {
            case 1:
                eu.Z((eu) obj2, (TLRPC.User) obj);
                return;
            case 2:
            case 4:
            case 6:
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
            default:
                hk0 hk0Var = (hk0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!hk0Var.f48430w0) {
                    hk0Var.f48424t1.clear();
                }
                hk0Var.f48426u1.clear();
                mj0 mj0Var = (mj0) hk0Var.C1;
                mj0Var.d.n1(hk0Var.F, hk0Var.G, hk0Var.H, zArr[0], null, null, mj0Var.f49859b);
                hk0Var.finishFragment();
                return;
            case 3:
                org.telegram.messenger.si mediaDataController = ((cx) obj2).getMediaDataController();
                long j3 = ((TLRPC.User) obj).f28547id;
                for (int i13 = 0; i13 < mediaDataController.f26802m1.size(); i13++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.f26802m1.get(i13)).peer.user_id == j3) {
                        mediaDataController.f26802m1.remove(i13);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().l1(j3);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new fi.k5(11));
                        mediaDataController.getMessagesStorage().f27214a.c(new di.c9(mediaDataController, j3, 2, 4));
                        mediaDataController.getNotificationCenter().k(84, new Object[0]);
                        return;
                    }
                }
                return;
            case 5:
                org.telegram.messenger.so soVar = (org.telegram.messenger.so) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f28523id = soVar.f26850a;
                cx cxVar = ((tw) obj2).f52369b;
                cxVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                cxVar.getMessagesController().p4(soVar);
                org.telegram.messenger.ur messagesStorage = cxVar.getMessagesStorage();
                messagesStorage.f27214a.c(new org.telegram.messenger.sq(3, messagesStorage, soVar));
                return;
            case 7:
                j00 j00Var = (j00) obj2;
                org.telegram.messenger.so soVar2 = (org.telegram.messenger.so) obj;
                FiltersSetupActivity filtersSetupActivity = j00Var.f48860e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, filtersSetupActivity.getParentActivity(), null);
                    t1Var3.f29999j0 = false;
                    t1Var3.show();
                    t1Var2 = t1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f28523id = soVar2.f26850a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new z9(j00Var, t1Var2, soVar2, 10));
                return;
            case 8:
                f40 f40Var = (f40) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.c cVar = f40Var.f47488o1;
                if (f40Var.s1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f28547id);
                        org.telegram.messenger.t3 t3Var = f40Var.V2;
                        long j10 = user.f28547id;
                        ArrayList arrayList = t3Var.f26925o;
                        if (!arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                            t3Var.z();
                            org.telegram.messenger.ls.f(t3Var.C.f23166a).k(166, Long.valueOf(t3Var.f26915c), Long.valueOf(t3Var.f26914b.f28408id), Boolean.FALSE);
                        }
                        f40Var.o1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    org.telegram.messenger.np.u1(cVar.f23166a).f0(f40Var.m1(), user2);
                    f40Var.o1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    org.telegram.messenger.np.u1(cVar.f23166a).g0(f40Var.m1(), null, chat, false, false);
                    f40Var.o1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 9:
                z40 z40Var = (z40) obj2;
                z40Var.f54398y.f((TLRPC.User) obj);
                if (z40Var.f54376f.f34632r.length() > 0) {
                    z40Var.f54376f.f34632r.setText((CharSequence) null);
                    return;
                }
                return;
            case 10:
                z40 z40Var2 = (z40) obj2;
                z40Var2.getClass();
                org.telegram.ui.Cells.d2 d2Var = ((org.telegram.ui.Cells.d2[]) obj)[0];
                if (d2Var != null && d2Var.b()) {
                    i10 = 100;
                } else {
                    i10 = 0;
                }
                z40Var2.r0(i10);
                return;
            case 12:
                LanguageSelectActivity.c0((LanguageSelectActivity) obj2, (org.telegram.messenger.dd) obj);
                return;
            case 13:
                String str = LaunchActivity.C1;
                ((LaunchActivity) obj2).t0((de0) obj);
                return;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.hd.E0().d(((org.telegram.messenger.dd[]) obj)[0], true, false, launchActivity.P);
                launchActivity.y0(true);
                return;
            case 22:
                ((ub0) obj2).H.G1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 23:
                xb0 xb0Var = (xb0) obj2;
                xb0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", xb0Var.f53739r);
                bundle.putString("requestPhone", xb0Var.f53740s);
                bundle.putString("phoneHash", xb0Var.f53741w);
                bundle.putString("phoneCode", xb0Var.f53742x);
                xb0Var.E.M1(7, true, bundle, false);
                return;
            case 25:
                gd0.n((gd0) obj2, (Context) obj);
                return;
            case 26:
                ce0 ce0Var = (ce0) obj2;
                ((boolean[]) obj)[0] = true;
                if (ce0Var.o()) {
                    d3.b bVar = new d3.b(1);
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    ce0Var.f46519b0 = cancellationTokenSource;
                    Context context = ce0Var.getContext();
                    int m12 = de0.m1(ce0Var.f46528h0);
                    CancellationToken token = cancellationTokenSource.getToken();
                    o60 o60Var = new o60(27, ce0Var, cancellationTokenSource);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource(token);
                    kotlin.jvm.internal.j.e(context, "context");
                    androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(context, 4);
                    Runnable[] runnableArr = new Runnable[1];
                    token.onCanceledRequested(new org.telegram.messenger.j1(runnableArr, 4));
                    TLRPC.TL_auth_initFirebasePnvLogin tL_auth_initFirebasePnvLogin = new TLRPC.TL_auth_initFirebasePnvLogin();
                    tL_auth_initFirebasePnvLogin.api_id = org.telegram.messenger.s2.d;
                    tL_auth_initFirebasePnvLogin.api_hash = org.telegram.messenger.s2.f26697e;
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    for (int i14 = 4; i12 < i14; i14 = 4) {
                        org.telegram.messenger.k10 i15 = org.telegram.messenger.k10.i(i12);
                        if (i15.p()) {
                            arrayList2.add(Long.valueOf(i15.e()));
                        }
                        i12++;
                    }
                    tL_auth_initFirebasePnvLogin.except_ids = arrayList2;
                    runnableArr[0] = new org.telegram.messenger.f9(m12, ConnectionsManager.getInstance(m12).sendRequestTyped(tL_auth_initFirebasePnvLogin, new d3.b(1), new bi.p4(token, taskCompletionSource, runnableArr, nVar, context, o60Var, m12), 8), 0);
                    if (token.isCancellationRequested()) {
                        runnableArr[0].run();
                    }
                    taskCompletionSource.getTask().addOnCompleteListener(bVar, new at(27, ce0Var, cancellationTokenSource)).addOnSuccessListener(bVar, new xd0(ce0Var)).addOnFailureListener(bVar, new xd0(ce0Var));
                    return;
                }
                return;
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap n02;
        qa0 qa0Var = (qa0) this.f45645b;
        ma0 ma0Var = (ma0) this.f45646c;
        if (z10 && !z11 && ma0Var.f49805e != null && (n02 = qa0Var.n0(ma0Var)) != null) {
            ma0Var.f49805e.f23488a.a(c8.s9.a(n02));
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f45644a) {
            case 21:
                b9.k0 k0Var = (b9.k0) this.f45646c;
                de0 de0Var = ((pb0) this.f45645b).f50807a0;
                if (de0Var.getParentActivity() != null) {
                    de0Var.getParentActivity().startActivityForResult(k0Var.f(), 200);
                    return;
                }
                return;
            case 24:
                b9.k0 k0Var2 = (b9.k0) this.f45646c;
                de0 de0Var2 = ((sc0) this.f45645b).F;
                if (de0Var2.getParentActivity() != null && !de0Var2.getParentActivity().isFinishing()) {
                    de0Var2.getParentActivity().startActivityForResult(k0Var2.f(), 200);
                    return;
                }
                return;
            default:
                ce0 ce0Var = (ce0) this.f45645b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f45646c;
                org.telegram.ui.ActionBar.t1 t1Var = ce0Var.f46521c0;
                if (t1Var != null) {
                    t1Var.dismiss();
                    ce0Var.f46521c0 = null;
                }
                if (ce0Var.f46519b0 == cancellationTokenSource) {
                    ce0Var.f46519b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void s0(View view, float f10, float f11) {
        int i7 = this.f45644a;
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        f60 f60Var = (f60) this.f45645b;
        cx cxVar2 = (cx) this.f45646c;
        org.telegram.messenger.t2 t2Var = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ArrayList arrayList2 = f60Var.f47577g0;
            org.telegram.messenger.t2 t2Var2 = new org.telegram.messenger.t2(((org.telegram.messenger.tr) arrayList.get(i11)).f27037a, 3);
            arrayList2.add(t2Var2);
            i11++;
            t2Var = t2Var2;
        }
        f60Var.f47575e0.h(f60Var.f47574d0, f60Var.f47577g0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", f60Var.f47574d0);
        b60 b60Var = new b60(bundle, cxVar2);
        b60Var.d = f60Var.f47577g0;
        b60Var.Z();
        f60Var.f47578h0.presentFragment(b60Var);
        org.telegram.messenger.g0.h3(new vs(27, b60Var, t2Var), 150L);
        return true;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void d(View view, float f10, float f11) {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void g(View view, float f10, float f11) {
    }
}
