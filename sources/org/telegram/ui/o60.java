package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import com.google.android.gms.tasks.CancellationTokenSource;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o60 implements Runnable {
    public final int f50478a;
    public final Object f50479b;
    public final Object f50480c;

    public o60(int i7, Object obj, Object obj2) {
        this.f50478a = i7;
        this.f50479b = obj;
        this.f50480c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i7;
        int i10;
        switch (this.f50478a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f50479b;
                TLObject tLObject = (TLObject) this.f50480c;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject;
                    org.telegram.messenger.np.u1(launchActivity.P).f4(resolvedbusinesschatlinks.users, false);
                    org.telegram.messenger.np.u1(launchActivity.P).Z3(resolvedbusinesschatlinks.chats, false);
                    org.telegram.messenger.ur.a0(launchActivity.P).m1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    bn bnVar = new bn(bundle);
                    bnVar.Fa = resolvedbusinesschatlinks;
                    launchActivity.u0(bnVar, false, true);
                    return;
                }
                launchActivity.F0(org.telegram.ui.Components.c5.K(launchActivity, org.telegram.messenger.hd.N0(2131752704, null), org.telegram.messenger.hd.N0(2131752700, null)));
                return;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f50479b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f50480c;
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.np.u1(launchActivity2.P).f4(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.l2 b10 = org.telegram.messenger.l2.b(launchActivity2.P);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j3, j3, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 2:
                String str3 = LaunchActivity.C1;
                String N0 = org.telegram.messenger.hd.N0(2131753891, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                sb2.append(((TLRPC.TL_error) this.f50480c).text);
                org.telegram.ui.Components.c5.r0((g) this.f50479b, N0, sb2.toString(), null);
                return;
            case 3:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f50479b;
                String str4 = (String) this.f50480c;
                if (!launchActivity3.f43104p0.getFragmentStack().isEmpty()) {
                    launchActivity3.f43104p0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    return;
                }
                return;
            case 4:
                String str5 = LaunchActivity.C1;
                ((LaunchActivity) this.f50479b).k0((TL_account.Password) this.f50480c);
                return;
            case 5:
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) this.f50480c;
                if (!((LaunchActivity) this.f50479b).R && LaunchActivity.G1) {
                    gcVar.j();
                    return;
                }
                return;
            case 6:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f50479b;
                Runnable runnable = (Runnable) this.f50480c;
                launchActivity4.f43104p0.getView().setVisibility(4);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f43106q0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f43106q0.getView().getVisibility() == 0) {
                        launchActivity4.f43106q0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f43108r0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f43108r0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                String str6 = LaunchActivity.C1;
                ((LaunchActivity) this.f50479b).t0((x71) this.f50480c);
                return;
            case 8:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f50479b;
                vf.b bVar = (vf.b) this.f50480c;
                launchActivity5.P0 = null;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.V0 = null;
                launchActivity5.T0 = null;
                if (bVar != null) {
                    bVar.b();
                    return;
                }
                return;
            case 9:
                vf.b bVar2 = (vf.b) this.f50479b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f50480c;
                String str7 = LaunchActivity.C1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                if (t1Var != null) {
                    t1Var.dismiss();
                    return;
                }
                return;
            case 10:
                s90 s90Var = (s90) this.f50479b;
                TLObject tLObject2 = (TLObject) this.f50480c;
                s90Var.c();
                if (tLObject2 != null) {
                    s90Var.f51947a.k0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 11:
                ((FiltersSetupActivity) this.f50480c).d0(((s90) this.f50479b).f51947a.M());
                return;
            case 12:
                qa0 qa0Var = (qa0) this.f50479b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f50480c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    org.telegram.messenger.g0.g3(new up(qa0Var, createBitmap2, gLSurfaceView, 23));
                    return;
                }
                return;
            case 13:
                qa0 qa0Var2 = (qa0) this.f50479b;
                qa0Var2.f51091c.setImageResource(2131232213);
                qa0Var2.m0(((org.telegram.messenger.qd) this.f50480c).f26402f);
                qa0Var2.f51120y = false;
                return;
            case 14:
                ((EditText) this.f50479b).removeTextChangedListener((bi.v) this.f50480c);
                return;
            case 15:
                Runnable runnable2 = (Runnable) this.f50480c;
                mb0 mb0Var = ((pb0) this.f50479b).f50806a;
                int i11 = 0;
                while (true) {
                    er[] erVarArr = mb0Var.f46275f;
                    if (i11 < erVarArr.length) {
                        erVarArr[i11].D(0.0f);
                        i11++;
                    } else {
                        runnable2.run();
                        mb0Var.f46274e = false;
                        return;
                    }
                }
            case 16:
                xb0 xb0Var = (xb0) this.f50479b;
                de0 de0Var = xb0Var.E;
                de0Var.C1(false, false);
                org.telegram.messenger.g0.v1(xb0Var.f53733a);
                de0Var.G1((TLRPC.TL_auth_authorization) ((TLObject) this.f50480c), false);
                return;
            case 17:
                xb0 xb0Var2 = (xb0) this.f50479b;
                String str8 = (String) this.f50480c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = xb0Var2.f53738n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = org.telegram.messenger.kv.c(org.telegram.messenger.g0.h1(str8), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                vb0 vb0Var = new vb0(xb0Var2, 2);
                if (z10) {
                    TL_account.Password password = xb0Var2.f53738n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.kv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        vb0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = d;
                    i7 = ((org.telegram.ui.ActionBar.g2) xb0Var2.E).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkPassword, vb0Var, 10);
                    return;
                }
                return;
            case 18:
                pc0 pc0Var = (pc0) this.f50479b;
                pc0Var.Q.C1(false, false);
                org.telegram.messenger.g0.v1(pc0Var.Q.fragmentView.findFocus());
                pc0Var.Q.G1((TLRPC.TL_auth_authorization) ((TLRPC.auth_Authorization) this.f50480c), true);
                TLRPC.FileLocation fileLocation = pc0Var.P;
                if (fileLocation != null) {
                    Utilities.f22775f.c(new o60(19, pc0Var, fileLocation));
                    return;
                }
                return;
            case 19:
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.f50480c;
                i10 = ((org.telegram.ui.ActionBar.g2) ((pc0) this.f50479b).Q).currentAccount;
                org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i10);
                if (fileLocation2 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(org.telegram.messenger.w7.z(4));
                    sb3.append("/");
                    sb3.append(fileLocation2.volume_id);
                    sb3.append("_");
                    u12.Q2 = a8.p0.n(fileLocation2.local_id, ".jpg", sb3);
                    u12.getFileLoader().h0(false, 16777216, u12.Q2, true);
                    return;
                }
                return;
            case 20:
                qc0 qc0Var = (qc0) this.f50479b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f50480c;
                de0 de0Var2 = qc0Var.H;
                de0Var2.C1(false, true);
                if (tL_error2 == null) {
                    if (qc0Var.f51182r != null && qc0Var.f51183s != null && qc0Var.f51184w != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", qc0Var.f51182r);
                        bundle2.putString("phoneHash", qc0Var.f51183s);
                        bundle2.putString("code", qc0Var.f51184w);
                        de0Var2.M1(5, true, bundle2, false);
                        return;
                    }
                    de0Var2.M1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131745919, "ResetAccountCancelledAlert"));
                    return;
                } else {
                    de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error2.text);
                    return;
                }
            case 21:
                gd0 gd0Var = (gd0) this.f50479b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f50480c);
                alertDialog$Builder.f28743a.S = org.telegram.messenger.hd.N0(2131752567, null);
                alertDialog$Builder.f28743a.U = org.telegram.messenger.hd.a0("CancelLinkSuccess", null, 2131752568, org.telegram.messenger.o10.h(new StringBuilder("+"), gd0Var.f48002b, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752029, null), null);
                alertDialog$Builder.f28743a.setOnDismissListener(new bd0(gd0Var, 0));
                alertDialog$Builder.p();
                return;
            case 22:
                gd0 gd0Var2 = (gd0) this.f50479b;
                gd0Var2.getClass();
                gd0Var2.f48012h0 = ((TLRPC.TL_error) this.f50480c).text;
                return;
            case 23:
                ((gd0) this.f50479b).f48028v0.G1((TLRPC.TL_auth_authorization) ((TLObject) this.f50480c), false);
                return;
            case 24:
                Runnable runnable3 = (Runnable) this.f50480c;
                br brVar = ((gd0) this.f50479b).f48009f;
                int i12 = 0;
                while (true) {
                    er[] erVarArr2 = brVar.f46275f;
                    if (i12 < erVarArr2.length) {
                        erVarArr2[i12].D(0.0f);
                        i12++;
                    } else {
                        runnable3.run();
                        brVar.f46274e = false;
                        return;
                    }
                }
            case 25:
                ((r3) this.f50479b).a((String) this.f50480c);
                return;
            case 26:
                ArrayList arrayList = (ArrayList) this.f50480c;
                de0 de0Var3 = ((ce0) this.f50479b).f46528h0;
                SharedPreferences g12 = org.telegram.messenger.np.g1();
                if (!g12.getBoolean("firstloginshow", true) && !de0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    de0Var3.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    return;
                }
                g12.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(de0Var3.getParentActivity());
                int i13 = org.telegram.ui.ActionBar.m6.L5;
                alertDialog$Builder2.m(2131624067, 46, org.telegram.ui.ActionBar.m6.x0(null, i13, false), null);
                alertDialog$Builder2.n(i13, null);
                alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131751759, "Continue"), null);
                String N02 = org.telegram.messenger.hd.N0(2131754275, "AllowFillNumber");
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                t1Var2.U = N02;
                de0Var3.f46903n = de0Var3.showDialog(t1Var2, true, null);
                de0Var3.f46892d0 = true;
                return;
            case 27:
                ce0 ce0Var = (ce0) this.f50479b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f50480c;
                if (ce0Var.o()) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, ce0Var.getContext(), null);
                    t1Var3.setOnCancelListener(new wf(cancellationTokenSource, 4));
                    t1Var3.show();
                    ce0Var.f46521c0 = t1Var3;
                    return;
                }
                return;
            case 28:
                fe0.Z((fe0) this.f50479b, (org.telegram.ui.ActionBar.t1) this.f50480c);
                return;
            default:
                ff0 ff0Var = (ff0) this.f50479b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f50480c;
                ff0Var.f47662d0 = false;
                if (tL_error3 == null) {
                    xe0 l02 = ff0Var.l0();
                    ff0Var.f47671k0.clear();
                    ff0Var.n0(l02);
                    return;
                }
                return;
        }
    }
}
