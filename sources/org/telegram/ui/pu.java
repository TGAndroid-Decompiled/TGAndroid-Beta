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
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pu implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.cj0, qw, org.telegram.ui.Components.zs0, org.telegram.ui.Components.dj0, org.telegram.messenger.lc, OnCompleteListener, ps {
    public final int f48950a;
    public final Object f48951b;
    public final Object f48952c;

    public pu(int i7, Object obj, Object obj2) {
        this.f48950a = i7;
        this.f48951b = obj;
        this.f48952c = obj2;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ww wwVar) {
        return false;
    }

    @Override
    public void b(ms msVar) {
        bk0 bk0Var = (bk0) this.f48951b;
        int intValue = ((Integer) ((View) this.f48952c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = bk0Var.Y[intValue];
        if (intValue == 5) {
            bk0Var.f44399s = msVar.d;
        } else {
            bk0Var.f44408w = msVar.d;
        }
        editTextBoldCursor.setText(msVar.f47869a);
    }

    @Override
    public boolean c(int i7, View view) {
        pa0 pa0Var = (pa0) this.f48951b;
        Context context = (Context) this.f48952c;
        if (pa0Var.H0 == 2) {
            Object I = pa0Var.P.I(i7);
            if (I instanceof la0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, pa0Var.getParentActivity(), pa0Var.getResourceProvider(), true, true);
                z0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                z0Var.j(org.telegram.messenger.hd.M0(2131750472, null), 2131231104, null);
                z0Var.setOnClickListener(new org.telegram.ui.Components.t41(23, pa0Var, (la0) I));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                ka0 ka0Var = new ka0(pa0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                pa0Var.J0 = ka0Var;
                ka0Var.setOutsideTouchable(true);
                pa0Var.J0.setClippingEnabled(true);
                pa0Var.J0.setInputMethodMode(2);
                pa0Var.J0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                pa0Var.J0.showAtLocation(view, 48, 0, iArr[1] - org.telegram.messenger.g0.L(52.0f));
                pa0Var.J0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void d(org.telegram.messenger.rd rdVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.f48951b;
        int[] iArr = (int[]) this.f48952c;
        String str = LaunchActivity.B1;
        int i7 = rdVar.h.I1;
        iArr[0] = i7;
        launchActivity.O0(i7);
        pa0 pa0Var = new pa0(2);
        pa0Var.G0(rdVar.h);
        pa0Var.G0 = new di.c1(iArr, org.telegram.messenger.ij.B0(rdVar.h.f23244k), 9);
        launchActivity.t0(pa0Var);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        switch (this.f48950a) {
            case 1:
                ww.g0((ww) this.f48951b, (vw) this.f48952c, view, i7);
                return;
            case 2:
            default:
                NotificationsCustomSettingsActivity.Z((NotificationsCustomSettingsActivity) this.f48951b, (Context) this.f48952c, view, i7, f10, f11);
                return;
            case 3:
                FiltersSetupActivity.Z((FiltersSetupActivity) this.f48951b, (Context) this.f48952c, view, i7);
                return;
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        Bitmap n02;
        pa0 pa0Var = (pa0) this.f48951b;
        la0 la0Var = (la0) this.f48952c;
        if (z9 && !z10 && la0Var.f47495e != null && (n02 = pa0Var.n0(la0Var)) != null) {
            la0Var.f47495e.f22176a.a(c8.q9.a(n02));
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f48950a) {
            case 1:
                return false;
            case 2:
            default:
                return false;
            case 3:
                return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ConferenceCall conferenceCall;
        int i10;
        int i11 = this.f48950a;
        org.telegram.ui.ActionBar.u1 u1Var2 = null;
        int i12 = 0;
        Object obj = this.f48952c;
        Object obj2 = this.f48951b;
        switch (i11) {
            case 0:
                org.telegram.messenger.ui mediaDataController = ((ww) obj2).getMediaDataController();
                long j3 = ((TLRPC.User) obj).f27102id;
                for (int i13 = 0; i13 < mediaDataController.l1.size(); i13++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.l1.get(i13)).peer.user_id == j3) {
                        mediaDataController.l1.remove(i13);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().j1(j3);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new di.u5(11));
                        mediaDataController.getMessagesStorage().f26696a.c(new bi.ia(mediaDataController, j3, 2, 4));
                        mediaDataController.getNotificationCenter().k(84, new Object[0]);
                        return;
                    }
                }
                return;
            case 1:
            case 3:
            case 8:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 21:
            case 24:
            case 25:
            default:
                bk0.Z((bk0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 2:
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f27078id = voVar.f26064a;
                ww wwVar = ((nw) obj2).f48150b;
                wwVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                wwVar.getMessagesController().h4(voVar);
                org.telegram.messenger.yr messagesStorage = wwVar.getMessagesStorage();
                messagesStorage.f26696a.c(new org.telegram.messenger.yq(0, messagesStorage, voVar));
                return;
            case 4:
                e00 e00Var = (e00) obj2;
                org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) obj;
                FiltersSetupActivity filtersSetupActivity = e00Var.f45170e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, filtersSetupActivity.getParentActivity(), null);
                    u1Var3.f28569i0 = false;
                    u1Var3.show();
                    u1Var2 = u1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f27078id = voVar2.f26064a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new z9(e00Var, u1Var2, voVar2, 10));
                return;
            case 5:
                c40 c40Var = (c40) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.c cVar = c40Var.f44585k1;
                if (c40Var.r1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f27102id);
                        org.telegram.messenger.r3 r3Var = c40Var.R2;
                        long j10 = user.f27102id;
                        ArrayList arrayList = r3Var.f25220o;
                        if (!arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                            r3Var.z();
                            org.telegram.messenger.qs.f(r3Var.C.f21729a).k(166, Long.valueOf(r3Var.f25210c), Long.valueOf(r3Var.f25209b.f26963id), Boolean.FALSE);
                        }
                        c40Var.n1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    org.telegram.messenger.qp.s1(cVar.f21729a).f0(c40Var.l1(), user2);
                    c40Var.n1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    org.telegram.messenger.qp.s1(cVar.f21729a).g0(c40Var.l1(), null, chat, false, false);
                    c40Var.n1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 6:
                w40 w40Var = (w40) obj2;
                w40Var.f50953y.e((TLRPC.User) obj);
                if (w40Var.f50932f.f37441r.length() > 0) {
                    w40Var.f50932f.f37441r.setText((CharSequence) null);
                    return;
                }
                return;
            case 7:
                w40 w40Var2 = (w40) obj2;
                w40Var2.getClass();
                org.telegram.ui.Cells.c2 c2Var = ((org.telegram.ui.Cells.c2[]) obj)[0];
                if (c2Var != null && c2Var.b()) {
                    i12 = 100;
                }
                w40Var2.r0(i12);
                return;
            case 9:
                LanguageSelectActivity.c0((LanguageSelectActivity) obj2, (org.telegram.messenger.ed) obj);
                return;
            case 10:
                String str = LaunchActivity.B1;
                ((LaunchActivity) obj2).t0((ce0) obj);
                return;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.hd.E0().d(((org.telegram.messenger.ed[]) obj)[0], true, false, launchActivity.O);
                launchActivity.y0(true);
                return;
            case 19:
                ((ub0) obj2).G.G1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 20:
                xb0 xb0Var = (xb0) obj2;
                xb0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", xb0Var.f51822r);
                bundle.putString("requestPhone", xb0Var.f51823s);
                bundle.putString("phoneHash", xb0Var.f51824w);
                bundle.putString("phoneCode", xb0Var.f51825x);
                xb0Var.D.M1(7, true, bundle, false);
                return;
            case 22:
                gd0.n((gd0) obj2, (Context) obj);
                return;
            case 23:
                be0 be0Var = (be0) obj2;
                ((boolean[]) obj)[0] = true;
                if (be0Var.o()) {
                    d3.b bVar = new d3.b(1);
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    be0Var.f44291a0 = cancellationTokenSource;
                    Context context = be0Var.getContext();
                    i10 = ((org.telegram.ui.ActionBar.f2) be0Var.f44301g0).currentAccount;
                    CancellationToken token = cancellationTokenSource.getToken();
                    zc0 zc0Var = new zc0(6, be0Var, cancellationTokenSource);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource(token);
                    kotlin.jvm.internal.j.e(context, "context");
                    k0.b bVar2 = new k0.b(context);
                    Runnable[] runnableArr = new Runnable[1];
                    token.onCanceledRequested(new org.telegram.messenger.p1(runnableArr, 4));
                    TLRPC.TL_auth_initFirebasePnvLogin tL_auth_initFirebasePnvLogin = new TLRPC.TL_auth_initFirebasePnvLogin();
                    tL_auth_initFirebasePnvLogin.api_id = org.telegram.messenger.r2.d;
                    tL_auth_initFirebasePnvLogin.api_hash = org.telegram.messenger.r2.f25202e;
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    int i14 = 0;
                    for (int i15 = 4; i14 < i15; i15 = 4) {
                        org.telegram.messenger.p10 i16 = org.telegram.messenger.p10.i(i14);
                        if (i16.p()) {
                            arrayList2.add(Long.valueOf(i16.e()));
                        }
                        i14++;
                    }
                    tL_auth_initFirebasePnvLogin.except_ids = arrayList2;
                    runnableArr[0] = new org.telegram.messenger.g9(i10, ConnectionsManager.getInstance(i10).sendRequestTyped(tL_auth_initFirebasePnvLogin, new d3.b(1), new org.telegram.messenger.f9(token, taskCompletionSource, runnableArr, bVar2, context, zc0Var, i10), 8), 0);
                    if (token.isCancellationRequested()) {
                        runnableArr[0].run();
                    }
                    taskCompletionSource.getTask().addOnCompleteListener(bVar, new pu(24, be0Var, cancellationTokenSource)).addOnSuccessListener(bVar, new wd0(be0Var)).addOnFailureListener(bVar, new wd0(be0Var));
                    return;
                }
                return;
            case 26:
                bk0 bk0Var = (bk0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!bk0Var.f44406v0) {
                    bk0Var.f44401s1.clear();
                }
                bk0Var.f44403t1.clear();
                gj0 gj0Var = (gj0) bk0Var.B1;
                gj0Var.d.n1(bk0Var.E, bk0Var.F, bk0Var.G, zArr[0], null, null, gj0Var.f46016b);
                bk0Var.finishFragment();
                return;
            case 27:
                int[] iArr = ((bk0) obj2).f44414y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(org.telegram.messenger.hd.M0(2131747493, null));
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f48950a) {
            case 18:
                b9.j0 j0Var = (b9.j0) this.f48952c;
                ce0 ce0Var = ((ob0) this.f48951b).W;
                if (ce0Var.getParentActivity() != null) {
                    ce0Var.getParentActivity().startActivityForResult(j0Var.f(), 200);
                    return;
                }
                return;
            case 21:
                b9.j0 j0Var2 = (b9.j0) this.f48952c;
                ce0 ce0Var2 = ((sc0) this.f48951b).E;
                if (ce0Var2.getParentActivity() != null && !ce0Var2.getParentActivity().isFinishing()) {
                    ce0Var2.getParentActivity().startActivityForResult(j0Var2.f(), 200);
                    return;
                }
                return;
            default:
                be0 be0Var = (be0) this.f48951b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f48952c;
                org.telegram.ui.ActionBar.u1 u1Var = be0Var.f44293b0;
                if (u1Var != null) {
                    u1Var.dismiss();
                    be0Var.f44293b0 = null;
                }
                if (be0Var.f44291a0 == cancellationTokenSource) {
                    be0Var.f44291a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f48950a;
    }

    @Override
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        e60 e60Var = (e60) this.f48952c;
        ww wwVar2 = (ww) this.f48951b;
        org.telegram.messenger.s2 s2Var = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ArrayList arrayList2 = e60Var.f45212f0;
            org.telegram.messenger.s2 s2Var2 = new org.telegram.messenger.s2(((org.telegram.messenger.xr) arrayList.get(i11)).f26513a, 3);
            arrayList2.add(s2Var2);
            i11++;
            s2Var = s2Var2;
        }
        e60Var.f45210d0.h(e60Var.f45209c0, e60Var.f45212f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", e60Var.f45209c0);
        a60 a60Var = new a60(bundle, wwVar2);
        a60Var.d = e60Var.f45212f0;
        a60Var.Z();
        e60Var.f45213g0.presentFragment(a60Var);
        org.telegram.messenger.g0.i3(new q10(6, a60Var, s2Var), 150L);
        return true;
    }

    public pu(e60 e60Var, ww wwVar) {
        this.f48950a = 8;
        this.f48952c = e60Var;
        this.f48951b = wwVar;
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void h(View view, float f10, float f11) {
    }
}
