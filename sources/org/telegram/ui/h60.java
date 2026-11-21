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
public final class h60 implements Runnable {
    public final int f48241a;
    public final Object f48242b;
    public final Object f48243c;

    public h60(int i7, Object obj, Object obj2) {
        this.f48241a = i7;
        this.f48242b = obj;
        this.f48243c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i7;
        int i10;
        switch (this.f48241a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f48242b;
                languageSelectActivity.f43104e = (ArrayList) this.f48243c;
                languageSelectActivity.f43103c.f();
                return;
            case 1:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f48242b;
                String str = (String) this.f48243c;
                if (str.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.g3(new h60(0, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) languageSelectActivity2.h.get(i11);
                    if (cdVar.f23356a.toLowerCase().startsWith(str) || cdVar.f23357b.toLowerCase().startsWith(str)) {
                        arrayList.add(cdVar);
                    }
                }
                int size2 = languageSelectActivity2.f43105f.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    org.telegram.messenger.cd cdVar2 = (org.telegram.messenger.cd) languageSelectActivity2.f43105f.get(i12);
                    if (cdVar2.f23356a.toLowerCase().startsWith(str) || cdVar2.f23357b.toLowerCase().startsWith(str)) {
                        arrayList.add(cdVar2);
                    }
                }
                org.telegram.messenger.g0.g3(new h60(0, languageSelectActivity2, arrayList));
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.f48242b;
                TLObject tLObject = (TLObject) this.f48243c;
                String str2 = LaunchActivity.C1;
                if (tLObject instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject;
                    org.telegram.messenger.mp.u1(launchActivity.P).f4(resolvedbusinesschatlinks.users, false);
                    org.telegram.messenger.mp.u1(launchActivity.P).Z3(resolvedbusinesschatlinks.chats, false);
                    org.telegram.messenger.tr.a0(launchActivity.P).m1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
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
                launchActivity.F0(org.telegram.ui.Components.c5.K(launchActivity, org.telegram.messenger.gd.N0(2131752704, null), org.telegram.messenger.gd.N0(2131752700, null)));
                return;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f48242b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f48243c;
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.mp.u1(launchActivity2.P).f4(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.l2 b10 = org.telegram.messenger.l2.b(launchActivity2.P);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j3, j3, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 4:
                String str4 = LaunchActivity.C1;
                String N0 = org.telegram.messenger.gd.N0(2131753891, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                sb2.append(((TLRPC.TL_error) this.f48243c).text);
                org.telegram.ui.Components.c5.r0((g) this.f48242b, N0, sb2.toString(), null);
                return;
            case 5:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f48242b;
                String str5 = (String) this.f48243c;
                if (!launchActivity3.f43135p0.getFragmentStack().isEmpty()) {
                    launchActivity3.f43135p0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str5).getQueryParameter("ref")));
                    return;
                }
                return;
            case 6:
                String str6 = LaunchActivity.C1;
                ((LaunchActivity) this.f48242b).k0((TL_account.Password) this.f48243c);
                return;
            case 7:
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) this.f48243c;
                if (!((LaunchActivity) this.f48242b).R && LaunchActivity.G1) {
                    gcVar.j();
                    return;
                }
                return;
            case 8:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f48242b;
                Runnable runnable = (Runnable) this.f48243c;
                launchActivity4.f43135p0.getView().setVisibility(4);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f43137q0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f43137q0.getView().getVisibility() == 0) {
                        launchActivity4.f43137q0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f43139r0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f43139r0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 9:
                String str7 = LaunchActivity.C1;
                ((LaunchActivity) this.f48242b).t0((x71) this.f48243c);
                return;
            case 10:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f48242b;
                vf.b bVar = (vf.b) this.f48243c;
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
            case 11:
                vf.b bVar2 = (vf.b) this.f48242b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f48243c;
                String str8 = LaunchActivity.C1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                if (t1Var != null) {
                    t1Var.dismiss();
                    return;
                }
                return;
            case 12:
                s90 s90Var = (s90) this.f48242b;
                TLObject tLObject2 = (TLObject) this.f48243c;
                s90Var.c();
                if (tLObject2 != null) {
                    s90Var.f51974a.k0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 13:
                ((FiltersSetupActivity) this.f48243c).d0(((s90) this.f48242b).f51974a.M());
                return;
            case 14:
                qa0 qa0Var = (qa0) this.f48242b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f48243c;
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
            case 15:
                qa0 qa0Var2 = (qa0) this.f48242b;
                qa0Var2.f51156c.setImageResource(2131232213);
                qa0Var2.m0(((org.telegram.messenger.pd) this.f48243c).f26257f);
                qa0Var2.f51185y = false;
                return;
            case 16:
                ((EditText) this.f48242b).removeTextChangedListener((bi.v) this.f48243c);
                return;
            case 17:
                Runnable runnable2 = (Runnable) this.f48243c;
                mb0 mb0Var = ((pb0) this.f48242b).f50829a;
                int i13 = 0;
                while (true) {
                    er[] erVarArr = mb0Var.f46297f;
                    if (i13 < erVarArr.length) {
                        erVarArr[i13].D(0.0f);
                        i13++;
                    } else {
                        runnable2.run();
                        mb0Var.f46296e = false;
                        return;
                    }
                }
            case 18:
                xb0 xb0Var = (xb0) this.f48242b;
                de0 de0Var = xb0Var.E;
                de0Var.C1(false, false);
                org.telegram.messenger.g0.v1(xb0Var.f53809a);
                de0Var.G1((TLRPC.TL_auth_authorization) ((TLObject) this.f48243c), false);
                return;
            case 19:
                xb0 xb0Var2 = (xb0) this.f48242b;
                String str9 = (String) this.f48243c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = xb0Var2.f53814n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = org.telegram.messenger.jv.c(org.telegram.messenger.g0.h1(str9), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                vb0 vb0Var = new vb0(xb0Var2, 2);
                if (z10) {
                    TL_account.Password password = xb0Var2.f53814n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.jv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
            case 20:
                pc0 pc0Var = (pc0) this.f48242b;
                pc0Var.Q.C1(false, false);
                org.telegram.messenger.g0.v1(pc0Var.Q.fragmentView.findFocus());
                pc0Var.Q.G1((TLRPC.TL_auth_authorization) ((TLRPC.auth_Authorization) this.f48243c), true);
                TLRPC.FileLocation fileLocation = pc0Var.P;
                if (fileLocation != null) {
                    Utilities.f22808f.c(new h60(21, pc0Var, fileLocation));
                    return;
                }
                return;
            case 21:
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.f48243c;
                i10 = ((org.telegram.ui.ActionBar.g2) ((pc0) this.f48242b).Q).currentAccount;
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i10);
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
            case 22:
                qc0 qc0Var = (qc0) this.f48242b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f48243c;
                de0 de0Var2 = qc0Var.H;
                de0Var2.C1(false, true);
                if (tL_error2 == null) {
                    if (qc0Var.f51247r != null && qc0Var.f51248s != null && qc0Var.f51249w != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", qc0Var.f51247r);
                        bundle2.putString("phoneHash", qc0Var.f51248s);
                        bundle2.putString("code", qc0Var.f51249w);
                        de0Var2.M1(5, true, bundle2, false);
                        return;
                    }
                    de0Var2.M1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131745919, "ResetAccountCancelledAlert"));
                    return;
                } else {
                    de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error2.text);
                    return;
                }
            case 23:
                gd0 gd0Var = (gd0) this.f48242b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f48243c);
                alertDialog$Builder.f28774a.S = org.telegram.messenger.gd.N0(2131752567, null);
                alertDialog$Builder.f28774a.U = org.telegram.messenger.gd.a0("CancelLinkSuccess", null, 2131752568, org.telegram.messenger.n10.h(new StringBuilder("+"), gd0Var.f48054b, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752029, null), null);
                alertDialog$Builder.f28774a.setOnDismissListener(new bd0(gd0Var, 0));
                alertDialog$Builder.p();
                return;
            case 24:
                gd0 gd0Var2 = (gd0) this.f48242b;
                gd0Var2.getClass();
                gd0Var2.f48064h0 = ((TLRPC.TL_error) this.f48243c).text;
                return;
            case 25:
                ((gd0) this.f48242b).f48080v0.G1((TLRPC.TL_auth_authorization) ((TLObject) this.f48243c), false);
                return;
            case 26:
                Runnable runnable3 = (Runnable) this.f48243c;
                br brVar = ((gd0) this.f48242b).f48061f;
                int i14 = 0;
                while (true) {
                    er[] erVarArr2 = brVar.f46297f;
                    if (i14 < erVarArr2.length) {
                        erVarArr2[i14].D(0.0f);
                        i14++;
                    } else {
                        runnable3.run();
                        brVar.f46296e = false;
                        return;
                    }
                }
            case 27:
                ((r3) this.f48242b).a((String) this.f48243c);
                return;
            case 28:
                ArrayList arrayList2 = (ArrayList) this.f48243c;
                de0 de0Var3 = ((ce0) this.f48242b).f46539h0;
                SharedPreferences g12 = org.telegram.messenger.mp.g1();
                if (!g12.getBoolean("firstloginshow", true) && !de0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    de0Var3.getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                    return;
                }
                g12.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(de0Var3.getParentActivity());
                int i15 = org.telegram.ui.ActionBar.m6.L5;
                alertDialog$Builder2.m(2131624067, 46, org.telegram.ui.ActionBar.m6.x0(null, i15, false), null);
                alertDialog$Builder2.n(i15, null);
                alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131751759, "Continue"), null);
                String N02 = org.telegram.messenger.gd.N0(2131754275, "AllowFillNumber");
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28774a;
                t1Var2.U = N02;
                de0Var3.f46940n = de0Var3.showDialog(t1Var2, true, null);
                de0Var3.f46929d0 = true;
                return;
            default:
                ce0 ce0Var = (ce0) this.f48242b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f48243c;
                if (ce0Var.o()) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, ce0Var.getContext(), null);
                    t1Var3.setOnCancelListener(new wf(cancellationTokenSource, 4));
                    t1Var3.show();
                    ce0Var.f46532c0 = t1Var3;
                    return;
                }
                return;
        }
    }
}
