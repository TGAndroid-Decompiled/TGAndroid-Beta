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
public final class at implements org.telegram.ui.Components.pj0, org.telegram.ui.ActionBar.r1, ww, org.telegram.ui.Components.it0, org.telegram.ui.Components.qj0, org.telegram.messenger.jc, OnCompleteListener {
    public final int f45656a;
    public final Object f45657b;
    public final Object f45658c;

    public at(int i7, Object obj, Object obj2) {
        this.f45656a = i7;
        this.f45657b = obj;
        this.f45658c = obj2;
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
    public void b(org.telegram.messenger.pd pdVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.f45657b;
        int[] iArr = (int[]) this.f45658c;
        String str = LaunchActivity.C1;
        int i7 = pdVar.h.K1;
        iArr[0] = i7;
        launchActivity.O0(i7);
        qa0 qa0Var = new qa0(2);
        qa0Var.G0(pdVar.h);
        qa0Var.M0 = new ai.d0(iArr, org.telegram.messenger.fj.B0(pdVar.h.f23965k), 10);
        launchActivity.t0(qa0Var);
    }

    @Override
    public boolean b1(View view) {
        switch (this.f45656a) {
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
        qa0 qa0Var = (qa0) this.f45657b;
        Context context = (Context) this.f45658c;
        if (qa0Var.N0 == 2) {
            Object I = qa0Var.Q.I(i7);
            if (I instanceof ma0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, qa0Var.getParentActivity(), qa0Var.getResourceProvider(), true, true);
                z0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                z0Var.j(org.telegram.messenger.gd.M0(2131750457, null), 2131231104, null);
                z0Var.setOnClickListener(new org.telegram.ui.Components.c31(27, qa0Var, (ma0) I));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
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
        switch (this.f45656a) {
            case 0:
                DataSettingsActivity.Z((DataSettingsActivity) this.f45657b, (Context) this.f45658c, view, i7, f10);
                return;
            case 4:
                cx.d0((cx) this.f45657b, (bx) this.f45658c, view, i7);
                return;
            case 6:
                FiltersSetupActivity.Z((FiltersSetupActivity) this.f45657b, (Context) this.f45658c, view, i7);
                return;
            default:
                NotificationsCustomSettingsActivity.Z((NotificationsCustomSettingsActivity) this.f45657b, (Context) this.f45658c, view, i7, f10, f11);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ConferenceCall conferenceCall;
        int i10;
        int i11 = this.f45656a;
        org.telegram.ui.ActionBar.u1 u1Var2 = null;
        int i12 = 0;
        Object obj = this.f45658c;
        Object obj2 = this.f45657b;
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
                if (!hk0Var.f48419w0) {
                    hk0Var.f48413t1.clear();
                }
                hk0Var.f48415u1.clear();
                mj0 mj0Var = (mj0) hk0Var.C1;
                mj0Var.d.n1(hk0Var.F, hk0Var.G, hk0Var.H, zArr[0], null, null, mj0Var.f49845b);
                hk0Var.finishFragment();
                return;
            case 3:
                org.telegram.messenger.ri mediaDataController = ((cx) obj2).getMediaDataController();
                long j3 = ((TLRPC.User) obj).f28552id;
                for (int i13 = 0; i13 < mediaDataController.f26624m1.size(); i13++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.f26624m1.get(i13)).peer.user_id == j3) {
                        mediaDataController.f26624m1.remove(i13);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().l1(j3);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new fi.k5(11));
                        mediaDataController.getMessagesStorage().f27052a.c(new di.b9(mediaDataController, j3, 2, 4));
                        mediaDataController.getNotificationCenter().k(84, new Object[0]);
                        return;
                    }
                }
                return;
            case 5:
                org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f28528id = roVar.f26672a;
                cx cxVar = ((tw) obj2).f52363b;
                cxVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                cxVar.getMessagesController().p4(roVar);
                org.telegram.messenger.tr messagesStorage = cxVar.getMessagesStorage();
                messagesStorage.f27052a.c(new org.telegram.messenger.rq(3, messagesStorage, roVar));
                return;
            case 7:
                j00 j00Var = (j00) obj2;
                org.telegram.messenger.ro roVar2 = (org.telegram.messenger.ro) obj;
                FiltersSetupActivity filtersSetupActivity = j00Var.f48831e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, filtersSetupActivity.getParentActivity(), null);
                    u1Var3.f30047j0 = false;
                    u1Var3.show();
                    u1Var2 = u1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f28528id = roVar2.f26672a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new z9(j00Var, u1Var2, roVar2, 10));
                return;
            case 8:
                f40 f40Var = (f40) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.c cVar = f40Var.f47454o1;
                if (f40Var.s1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f28552id);
                        org.telegram.messenger.t3 t3Var = f40Var.V2;
                        long j10 = user.f28552id;
                        ArrayList arrayList = t3Var.f26946o;
                        if (!arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                            t3Var.z();
                            org.telegram.messenger.ks.f(t3Var.C.f23218a).k(166, Long.valueOf(t3Var.f26936c), Long.valueOf(t3Var.f26935b.f28413id), Boolean.FALSE);
                        }
                        f40Var.o1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    org.telegram.messenger.mp.u1(cVar.f23218a).f0(f40Var.m1(), user2);
                    f40Var.o1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    org.telegram.messenger.mp.u1(cVar.f23218a).g0(f40Var.m1(), null, chat, false, false);
                    f40Var.o1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 9:
                z40 z40Var = (z40) obj2;
                z40Var.f54387y.f((TLRPC.User) obj);
                if (z40Var.f54365f.f33845r.length() > 0) {
                    z40Var.f54365f.f33845r.setText((CharSequence) null);
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
                LanguageSelectActivity.c0((LanguageSelectActivity) obj2, (org.telegram.messenger.cd) obj);
                return;
            case 13:
                String str = LaunchActivity.C1;
                ((LaunchActivity) obj2).t0((ee0) obj);
                return;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.gd.E0().d(((org.telegram.messenger.cd[]) obj)[0], true, false, launchActivity.P);
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
                bundle.putString("password", xb0Var.f53772r);
                bundle.putString("requestPhone", xb0Var.f53773s);
                bundle.putString("phoneHash", xb0Var.f53774w);
                bundle.putString("phoneCode", xb0Var.f53775x);
                xb0Var.E.M1(7, true, bundle, false);
                return;
            case 25:
                hd0.n((hd0) obj2, (Context) obj);
                return;
            case 26:
                de0 de0Var = (de0) obj2;
                ((boolean[]) obj)[0] = true;
                if (de0Var.o()) {
                    d3.b bVar = new d3.b(1);
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    de0Var.f46869b0 = cancellationTokenSource;
                    Context context = de0Var.getContext();
                    int m12 = ee0.m1(de0Var.f46878h0);
                    CancellationToken token = cancellationTokenSource.getToken();
                    o60 o60Var = new o60(27, de0Var, cancellationTokenSource);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource(token);
                    kotlin.jvm.internal.j.e(context, "context");
                    androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(context, 4);
                    Runnable[] runnableArr = new Runnable[1];
                    token.onCanceledRequested(new org.telegram.messenger.j1(runnableArr, 4));
                    TLRPC.TL_auth_initFirebasePnvLogin tL_auth_initFirebasePnvLogin = new TLRPC.TL_auth_initFirebasePnvLogin();
                    tL_auth_initFirebasePnvLogin.api_id = org.telegram.messenger.s2.d;
                    tL_auth_initFirebasePnvLogin.api_hash = org.telegram.messenger.s2.f26724e;
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    for (int i14 = 4; i12 < i14; i14 = 4) {
                        org.telegram.messenger.j10 i15 = org.telegram.messenger.j10.i(i12);
                        if (i15.p()) {
                            arrayList2.add(Long.valueOf(i15.e()));
                        }
                        i12++;
                    }
                    tL_auth_initFirebasePnvLogin.except_ids = arrayList2;
                    runnableArr[0] = new org.telegram.messenger.e9(m12, ConnectionsManager.getInstance(m12).sendRequestTyped(tL_auth_initFirebasePnvLogin, new d3.b(1), new bi.i4(token, taskCompletionSource, runnableArr, nVar, context, o60Var, m12), 8), 0);
                    if (token.isCancellationRequested()) {
                        runnableArr[0].run();
                    }
                    taskCompletionSource.getTask().addOnCompleteListener(bVar, new at(27, de0Var, cancellationTokenSource)).addOnSuccessListener(bVar, new yd0(de0Var)).addOnFailureListener(bVar, new yd0(de0Var));
                    return;
                }
                return;
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap n02;
        qa0 qa0Var = (qa0) this.f45657b;
        ma0 ma0Var = (ma0) this.f45658c;
        if (z10 && !z11 && ma0Var.f49784e != null && (n02 = qa0Var.n0(ma0Var)) != null) {
            ma0Var.f49784e.f23279a.a(c8.r9.a(n02));
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f45656a) {
            case 21:
                b9.k0 k0Var = (b9.k0) this.f45658c;
                ee0 ee0Var = ((pb0) this.f45657b).f50789a0;
                if (ee0Var.getParentActivity() != null) {
                    ee0Var.getParentActivity().startActivityForResult(k0Var.f(), 200);
                    return;
                }
                return;
            case 24:
                b9.k0 k0Var2 = (b9.k0) this.f45658c;
                ee0 ee0Var2 = ((sc0) this.f45657b).F;
                if (ee0Var2.getParentActivity() != null && !ee0Var2.getParentActivity().isFinishing()) {
                    ee0Var2.getParentActivity().startActivityForResult(k0Var2.f(), 200);
                    return;
                }
                return;
            default:
                de0 de0Var = (de0) this.f45657b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f45658c;
                org.telegram.ui.ActionBar.u1 u1Var = de0Var.f46871c0;
                if (u1Var != null) {
                    u1Var.dismiss();
                    de0Var.f46871c0 = null;
                }
                if (de0Var.f46869b0 == cancellationTokenSource) {
                    de0Var.f46869b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void s0(View view, float f10, float f11) {
        int i7 = this.f45656a;
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        f60 f60Var = (f60) this.f45657b;
        cx cxVar2 = (cx) this.f45658c;
        org.telegram.messenger.t2 t2Var = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ArrayList arrayList2 = f60Var.f47543g0;
            org.telegram.messenger.t2 t2Var2 = new org.telegram.messenger.t2(((org.telegram.messenger.sr) arrayList.get(i11)).f26845a, 3);
            arrayList2.add(t2Var2);
            i11++;
            t2Var = t2Var2;
        }
        f60Var.f47541e0.h(f60Var.f47540d0, f60Var.f47543g0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", f60Var.f47540d0);
        b60 b60Var = new b60(bundle, cxVar2);
        b60Var.d = f60Var.f47543g0;
        b60Var.Z();
        f60Var.f47544h0.presentFragment(b60Var);
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
