package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class i50 implements Runnable {
    public final int f48720a;
    public final Object f48721b;
    public final Object f48722c;

    public i50(int i7, Object obj, Object obj2) {
        this.f48720a = i7;
        this.f48721b = obj;
        this.f48722c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        byte[] bArr;
        int i7;
        int i10;
        switch (this.f48720a) {
            case 0:
                j50 j50Var = (j50) this.f48721b;
                String str = (String) this.f48722c;
                k50 k50Var = j50Var.f48991a;
                k50Var.f49322e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                k50Var.f49321c = k50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new d00(2, j50Var, str), 66);
                return;
            case 1:
                TLObject tLObject = (TLObject) this.f48722c;
                k50 k50Var2 = ((j50) this.f48721b).f48991a;
                if (tLObject != null) {
                    n50.f0(k50Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    n50.f0(k50Var2.h, null);
                    return;
                }
            case 2:
                m50 m50Var = (m50) this.f48721b;
                String str2 = (String) this.f48722c;
                m50Var.h = str2;
                n50 n50Var = m50Var.f49959r;
                if (n50Var.O) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f28604q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f28606q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                m50Var.f49958n = n50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new z9(m50Var, str2, str2, 14), 66);
                return;
            case 3:
                org.telegram.messenger.g0.h3(new u5(0, (b60) this.f48721b, (org.telegram.messenger.t2) this.f48722c), 150L);
                return;
            case 4:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f48721b;
                languageSelectActivity.f43183e = (ArrayList) this.f48722c;
                languageSelectActivity.f43182c.f();
                return;
            case 5:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f48721b;
                String str3 = (String) this.f48722c;
                if (str3.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.g3(new i50(4, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) languageSelectActivity2.h.get(i11);
                    if (cdVar.f23443a.toLowerCase().startsWith(str3) || cdVar.f23444b.toLowerCase().startsWith(str3)) {
                        arrayList.add(cdVar);
                    }
                }
                int size2 = languageSelectActivity2.f43184f.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    org.telegram.messenger.cd cdVar2 = (org.telegram.messenger.cd) languageSelectActivity2.f43184f.get(i12);
                    if (cdVar2.f23443a.toLowerCase().startsWith(str3) || cdVar2.f23444b.toLowerCase().startsWith(str3)) {
                        arrayList.add(cdVar2);
                    }
                }
                org.telegram.messenger.g0.g3(new i50(4, languageSelectActivity2, arrayList));
                return;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) this.f48721b;
                TLObject tLObject2 = (TLObject) this.f48722c;
                String str4 = LaunchActivity.C1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
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
                launchActivity.F0(org.telegram.ui.Components.b5.K(launchActivity, org.telegram.messenger.gd.N0(2131752704, null), org.telegram.messenger.gd.N0(2131752700, null)));
                return;
            case 7:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f48721b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f48722c;
                String str5 = LaunchActivity.C1;
                org.telegram.messenger.mp.u1(launchActivity2.P).f4(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.l2 b10 = org.telegram.messenger.l2.b(launchActivity2.P);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j3, j3, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 8:
                String str6 = LaunchActivity.C1;
                String N0 = org.telegram.messenger.gd.N0(2131753891, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                sb2.append(((TLRPC.TL_error) this.f48722c).text);
                org.telegram.ui.Components.b5.r0((g) this.f48721b, N0, sb2.toString(), null);
                return;
            case 9:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f48721b;
                String str7 = (String) this.f48722c;
                if (!launchActivity3.f43214p0.getFragmentStack().isEmpty()) {
                    launchActivity3.f43214p0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str7).getQueryParameter("ref")));
                    return;
                }
                return;
            case 10:
                String str8 = LaunchActivity.C1;
                ((LaunchActivity) this.f48721b).k0((TL_account.Password) this.f48722c);
                return;
            case 11:
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) this.f48722c;
                if (!((LaunchActivity) this.f48721b).R && LaunchActivity.G1) {
                    fcVar.j();
                    return;
                }
                return;
            case 12:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f48721b;
                Runnable runnable = (Runnable) this.f48722c;
                launchActivity4.f43214p0.getView().setVisibility(4);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f43216q0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f43216q0.getView().getVisibility() == 0) {
                        launchActivity4.f43216q0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f43218r0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f43218r0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                String str9 = LaunchActivity.C1;
                ((LaunchActivity) this.f48721b).t0((v71) this.f48722c);
                return;
            case 14:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f48721b;
                vf.b bVar = (vf.b) this.f48722c;
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
            case 15:
                vf.b bVar2 = (vf.b) this.f48721b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f48722c;
                String str10 = LaunchActivity.C1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                if (t1Var != null) {
                    t1Var.dismiss();
                    return;
                }
                return;
            case 16:
                r90 r90Var = (r90) this.f48721b;
                TLObject tLObject3 = (TLObject) this.f48722c;
                r90Var.c();
                if (tLObject3 != null) {
                    r90Var.f51667a.k0((TL_account.Password) tLObject3);
                    return;
                }
                return;
            case 17:
                ((FiltersSetupActivity) this.f48722c).d0(((r90) this.f48721b).f51667a.M());
                return;
            case 18:
                pa0 pa0Var = (pa0) this.f48721b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f48722c;
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
            case 19:
                pa0 pa0Var2 = (pa0) this.f48721b;
                pa0Var2.f50922c.setImageResource(2131232216);
                pa0Var2.m0(((org.telegram.messenger.pd) this.f48722c).f26323f);
                pa0Var2.f50951y = false;
                return;
            case 20:
                ((EditText) this.f48721b).removeTextChangedListener((bi.v) this.f48722c);
                return;
            case 21:
                Runnable runnable2 = (Runnable) this.f48722c;
                lb0 lb0Var = ((ob0) this.f48721b).f50620a;
                int i13 = 0;
                while (true) {
                    er[] erVarArr = lb0Var.f46491f;
                    if (i13 < erVarArr.length) {
                        erVarArr[i13].D(0.0f);
                        i13++;
                    } else {
                        runnable2.run();
                        lb0Var.f46490e = false;
                        return;
                    }
                }
            case 22:
                wb0 wb0Var = (wb0) this.f48721b;
                de0 de0Var = wb0Var.E;
                de0Var.C1(false, false);
                org.telegram.messenger.g0.v1(wb0Var.f53278a);
                de0Var.G1((TLRPC.TL_auth_authorization) ((TLObject) this.f48722c), false);
                return;
            case 23:
                wb0 wb0Var2 = (wb0) this.f48721b;
                String str11 = (String) this.f48722c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = wb0Var2.f53283n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = org.telegram.messenger.jv.c(org.telegram.messenger.g0.h1(str11), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                ub0 ub0Var = new ub0(wb0Var2, 2);
                if (z10) {
                    TL_account.Password password = wb0Var2.f53283n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.jv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        ub0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = d;
                    i7 = ((org.telegram.ui.ActionBar.g2) wb0Var2.E).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkPassword, ub0Var, 10);
                    return;
                }
                return;
            case 24:
                oc0 oc0Var = (oc0) this.f48721b;
                oc0Var.Q.C1(false, false);
                org.telegram.messenger.g0.v1(oc0Var.Q.fragmentView.findFocus());
                oc0Var.Q.G1((TLRPC.TL_auth_authorization) ((TLRPC.auth_Authorization) this.f48722c), true);
                TLRPC.FileLocation fileLocation = oc0Var.P;
                if (fileLocation != null) {
                    Utilities.f22878f.c(new i50(25, oc0Var, fileLocation));
                    return;
                }
                return;
            case 25:
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.f48722c;
                i10 = ((org.telegram.ui.ActionBar.g2) ((oc0) this.f48721b).Q).currentAccount;
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
            case 26:
                pc0 pc0Var = (pc0) this.f48721b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f48722c;
                de0 de0Var2 = pc0Var.H;
                de0Var2.C1(false, true);
                if (tL_error2 == null) {
                    if (pc0Var.f50974r != null && pc0Var.f50975s != null && pc0Var.f50976w != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", pc0Var.f50974r);
                        bundle2.putString("phoneHash", pc0Var.f50975s);
                        bundle2.putString("code", pc0Var.f50976w);
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
            case 27:
                gd0 gd0Var = (gd0) this.f48721b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f48722c);
                alertDialog$Builder.f28835a.S = org.telegram.messenger.gd.N0(2131752567, null);
                alertDialog$Builder.f28835a.U = org.telegram.messenger.gd.a0("CancelLinkSuccess", null, 2131752568, org.telegram.messenger.m10.h(new StringBuilder("+"), gd0Var.f48249b, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752029, null), null);
                alertDialog$Builder.f28835a.setOnDismissListener(new ad0(gd0Var, 0));
                alertDialog$Builder.p();
                return;
            case 28:
                gd0 gd0Var2 = (gd0) this.f48721b;
                gd0Var2.getClass();
                gd0Var2.f48259h0 = ((TLRPC.TL_error) this.f48722c).text;
                return;
            default:
                ((gd0) this.f48721b).f48275v0.G1((TLRPC.TL_auth_authorization) ((TLObject) this.f48722c), false);
                return;
        }
    }
}
