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
public final class n60 implements Runnable {
    public final int f50100a;
    public final Object f50101b;
    public final Object f50102c;

    public n60(int i7, Object obj, Object obj2) {
        this.f50100a = i7;
        this.f50101b = obj;
        this.f50102c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i7;
        int i10;
        switch (this.f50100a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f50101b;
                TLObject tLObject = (TLObject) this.f50102c;
                String str = LaunchActivity.C1;
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
                launchActivity.F0(org.telegram.ui.Components.b5.K(launchActivity, org.telegram.messenger.gd.M0(2131752705, null), org.telegram.messenger.gd.M0(2131752701, null)));
                return;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f50101b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f50102c;
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.mp.u1(launchActivity2.P).f4(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.l2 b10 = org.telegram.messenger.l2.b(launchActivity2.P);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j3, j3, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 2:
                String str3 = LaunchActivity.C1;
                String M0 = org.telegram.messenger.gd.M0(2131753892, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131751094, sb2, "\n");
                sb2.append(((TLRPC.TL_error) this.f50102c).text);
                org.telegram.ui.Components.b5.r0((g) this.f50101b, M0, sb2.toString(), null);
                return;
            case 3:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f50101b;
                String str4 = (String) this.f50102c;
                if (!launchActivity3.f43094p0.getFragmentStack().isEmpty()) {
                    launchActivity3.f43094p0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    return;
                }
                return;
            case 4:
                String str5 = LaunchActivity.C1;
                ((LaunchActivity) this.f50101b).k0((TL_account.Password) this.f50102c);
                return;
            case 5:
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) this.f50102c;
                if (!((LaunchActivity) this.f50101b).R && LaunchActivity.G1) {
                    gcVar.j();
                    return;
                }
                return;
            case 6:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f50101b;
                Runnable runnable = (Runnable) this.f50102c;
                launchActivity4.f43094p0.getView().setVisibility(4);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f43096q0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f43096q0.getView().getVisibility() == 0) {
                        launchActivity4.f43096q0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f43098r0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f43098r0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                String str6 = LaunchActivity.C1;
                ((LaunchActivity) this.f50101b).t0((x71) this.f50102c);
                return;
            case 8:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f50101b;
                vf.b bVar = (vf.b) this.f50102c;
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
                vf.b bVar2 = (vf.b) this.f50101b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f50102c;
                String str7 = LaunchActivity.C1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                if (u1Var != null) {
                    u1Var.dismiss();
                    return;
                }
                return;
            case 10:
                r90 r90Var = (r90) this.f50101b;
                TLObject tLObject2 = (TLObject) this.f50102c;
                r90Var.c();
                if (tLObject2 != null) {
                    r90Var.f51540a.k0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 11:
                ((FiltersSetupActivity) this.f50102c).d0(((r90) this.f50101b).f51540a.M());
                return;
            case 12:
                pa0 pa0Var = (pa0) this.f50101b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f50102c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    org.telegram.messenger.g0.g3(new up(pa0Var, createBitmap2, gLSurfaceView, 23));
                    return;
                }
                return;
            case 13:
                pa0 pa0Var2 = (pa0) this.f50101b;
                pa0Var2.f50834c.setImageResource(2131232213);
                pa0Var2.m0(((org.telegram.messenger.pd) this.f50102c).f26231f);
                pa0Var2.f50863y = false;
                return;
            case 14:
                ((EditText) this.f50101b).removeTextChangedListener((bi.v) this.f50102c);
                return;
            case 15:
                Runnable runnable2 = (Runnable) this.f50102c;
                lb0 lb0Var = ((ob0) this.f50101b).f50547a;
                int i11 = 0;
                while (true) {
                    er[] erVarArr = lb0Var.f46283f;
                    if (i11 < erVarArr.length) {
                        erVarArr[i11].D(0.0f);
                        i11++;
                    } else {
                        runnable2.run();
                        lb0Var.f46282e = false;
                        return;
                    }
                }
            case 16:
                wb0 wb0Var = (wb0) this.f50101b;
                de0 de0Var = wb0Var.E;
                de0Var.C1(false, false);
                org.telegram.messenger.g0.v1(wb0Var.f53049a);
                de0Var.G1((TLRPC.TL_auth_authorization) ((TLObject) this.f50102c), false);
                return;
            case 17:
                wb0 wb0Var2 = (wb0) this.f50101b;
                String str8 = (String) this.f50102c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = wb0Var2.f53054n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = org.telegram.messenger.jv.c(org.telegram.messenger.g0.h1(str8), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                ub0 ub0Var = new ub0(wb0Var2, 2);
                if (z10) {
                    TL_account.Password password = wb0Var2.f53054n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.jv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        ub0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = d;
                    i7 = ((org.telegram.ui.ActionBar.h2) wb0Var2.E).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkPassword, ub0Var, 10);
                    return;
                }
                return;
            case 18:
                oc0 oc0Var = (oc0) this.f50101b;
                oc0Var.Q.C1(false, false);
                org.telegram.messenger.g0.v1(oc0Var.Q.fragmentView.findFocus());
                oc0Var.Q.G1((TLRPC.TL_auth_authorization) ((TLRPC.auth_Authorization) this.f50102c), true);
                TLRPC.FileLocation fileLocation = oc0Var.P;
                if (fileLocation != null) {
                    Utilities.f22783f.c(new n60(19, oc0Var, fileLocation));
                    return;
                }
                return;
            case 19:
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.f50102c;
                i10 = ((org.telegram.ui.ActionBar.h2) ((oc0) this.f50101b).Q).currentAccount;
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
            case 20:
                pc0 pc0Var = (pc0) this.f50101b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f50102c;
                de0 de0Var2 = pc0Var.H;
                de0Var2.C1(false, true);
                if (tL_error2 == null) {
                    if (pc0Var.f50885r != null && pc0Var.f50886s != null && pc0Var.f50887w != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", pc0Var.f50885r);
                        bundle2.putString("phoneHash", pc0Var.f50886s);
                        bundle2.putString("code", pc0Var.f50887w);
                        de0Var2.M1(5, true, bundle2, false);
                        return;
                    }
                    de0Var2.M1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131745920, "ResetAccountCancelledAlert"));
                    return;
                } else {
                    de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error2.text);
                    return;
                }
            case 21:
                gd0 gd0Var = (gd0) this.f50101b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f50102c);
                alertDialog$Builder.f28746a.S = org.telegram.messenger.gd.M0(2131752568, null);
                alertDialog$Builder.f28746a.U = org.telegram.messenger.gd.a0("CancelLinkSuccess", null, 2131752569, org.telegram.messenger.n10.h(new StringBuilder("+"), gd0Var.f48054b, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752030, null), null);
                alertDialog$Builder.f28746a.setOnDismissListener(new ad0(gd0Var, 0));
                alertDialog$Builder.p();
                return;
            case 22:
                gd0 gd0Var2 = (gd0) this.f50101b;
                gd0Var2.getClass();
                gd0Var2.f48064h0 = ((TLRPC.TL_error) this.f50102c).text;
                return;
            case 23:
                ((gd0) this.f50101b).f48080v0.G1((TLRPC.TL_auth_authorization) ((TLObject) this.f50102c), false);
                return;
            case 24:
                Runnable runnable3 = (Runnable) this.f50102c;
                br brVar = ((gd0) this.f50101b).f48061f;
                int i12 = 0;
                while (true) {
                    er[] erVarArr2 = brVar.f46283f;
                    if (i12 < erVarArr2.length) {
                        erVarArr2[i12].D(0.0f);
                        i12++;
                    } else {
                        runnable3.run();
                        brVar.f46282e = false;
                        return;
                    }
                }
            case 25:
                ((r3) this.f50101b).a((String) this.f50102c);
                return;
            case 26:
                ArrayList arrayList = (ArrayList) this.f50102c;
                de0 de0Var3 = ((ce0) this.f50101b).f46512h0;
                SharedPreferences g12 = org.telegram.messenger.mp.g1();
                if (!g12.getBoolean("firstloginshow", true) && !de0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    de0Var3.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    return;
                }
                g12.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(de0Var3.getParentActivity());
                int i13 = org.telegram.ui.ActionBar.n6.L5;
                alertDialog$Builder2.m(2131624067, 46, org.telegram.ui.ActionBar.n6.x0(null, i13, false), null);
                alertDialog$Builder2.n(i13, null);
                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131751760, "Continue"), null);
                String M02 = org.telegram.messenger.gd.M0(2131754276, "AllowFillNumber");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28746a;
                u1Var2.U = M02;
                de0Var3.f46950n = de0Var3.showDialog(u1Var2, true, null);
                de0Var3.f46939d0 = true;
                return;
            case 27:
                ce0 ce0Var = (ce0) this.f50101b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f50102c;
                if (ce0Var.o()) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, ce0Var.getContext(), null);
                    u1Var3.setOnCancelListener(new wf(cancellationTokenSource, 4));
                    u1Var3.show();
                    ce0Var.f46505c0 = u1Var3;
                    return;
                }
                return;
            case 28:
                fe0.Z((fe0) this.f50101b, (org.telegram.ui.ActionBar.u1) this.f50102c);
                return;
            default:
                ff0 ff0Var = (ff0) this.f50101b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f50102c;
                ff0Var.f47670d0 = false;
                if (tL_error3 == null) {
                    xe0 l02 = ff0Var.l0();
                    ff0Var.f47679k0.clear();
                    ff0Var.n0(l02);
                    return;
                }
                return;
        }
    }
}
