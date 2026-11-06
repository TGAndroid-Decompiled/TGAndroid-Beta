package org.telegram.ui;

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
public final class q10 implements Runnable {
    public final int f49009a;
    public final Object f49010b;
    public final Object f49011c;

    public q10(int i7, Object obj, Object obj2) {
        this.f49009a = i7;
        this.f49010b = obj;
        this.f49011c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        byte[] bArr;
        int i7;
        int i10;
        switch (this.f49009a) {
            case 0:
                m4 m4Var = (m4) this.f49010b;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.k2) this.f49011c).f39302e.getBitmap(100, 100);
                    if (bitmap != null) {
                        org.telegram.messenger.g0.h3(new q10(1, m4Var, a8.ba.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                ((c40) ((m4) this.f49010b).f47659b).L2.setNewColors((int[]) this.f49011c);
                return;
            case 2:
                m50.a0((m50) this.f49010b, (TLRPC.TL_error) this.f49011c);
                return;
            case 3:
                i50 i50Var = (i50) this.f49010b;
                String str = (String) this.f49011c;
                j50 j50Var = i50Var.f46574a;
                j50Var.f46845e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                j50Var.f46844c = j50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new h50(0, i50Var, str), 66);
                return;
            case 4:
                TLObject tLObject = (TLObject) this.f49011c;
                j50 j50Var2 = ((i50) this.f49010b).f46574a;
                if (tLObject != null) {
                    m50.f0(j50Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    m50.f0(j50Var2.h, null);
                    return;
                }
            case 5:
                l50 l50Var = (l50) this.f49010b;
                String str2 = (String) this.f49011c;
                l50Var.h = str2;
                m50 m50Var = l50Var.f47422r;
                if (m50Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f27065q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f27067q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                l50Var.f47421n = m50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new z9(l50Var, str2, str2, 14), 66);
                return;
            case 6:
                org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.p(11, (a60) this.f49010b, (org.telegram.messenger.s2) this.f49011c), 150L);
                return;
            case 7:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f49010b;
                languageSelectActivity.f41246e = (ArrayList) this.f49011c;
                languageSelectActivity.f41245c.f();
                return;
            case 8:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f49010b;
                String str3 = (String) this.f49011c;
                if (str3.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.h3(new q10(7, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    org.telegram.messenger.ed edVar = (org.telegram.messenger.ed) languageSelectActivity2.h.get(i11);
                    if (edVar.f22181a.toLowerCase().startsWith(str3) || edVar.f22182b.toLowerCase().startsWith(str3)) {
                        arrayList.add(edVar);
                    }
                }
                int size2 = languageSelectActivity2.f41247f.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    org.telegram.messenger.ed edVar2 = (org.telegram.messenger.ed) languageSelectActivity2.f41247f.get(i12);
                    if (edVar2.f22181a.toLowerCase().startsWith(str3) || edVar2.f22182b.toLowerCase().startsWith(str3)) {
                        arrayList.add(edVar2);
                    }
                }
                org.telegram.messenger.g0.h3(new q10(7, languageSelectActivity2, arrayList));
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.f49010b;
                TLObject tLObject2 = (TLObject) this.f49011c;
                String str4 = LaunchActivity.B1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    org.telegram.messenger.qp.s1(launchActivity.O).Y3(resolvedbusinesschatlinks.users, false);
                    org.telegram.messenger.qp.s1(launchActivity.O).S3(resolvedbusinesschatlinks.chats, false);
                    org.telegram.messenger.yr.a0(launchActivity.O).m1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    an anVar = new an(bundle);
                    anVar.Ba = resolvedbusinesschatlinks;
                    launchActivity.u0(anVar, false, true);
                    return;
                }
                launchActivity.F0(org.telegram.ui.Components.v4.K(launchActivity, org.telegram.messenger.hd.M0(2131752716, null), org.telegram.messenger.hd.M0(2131752712, null)));
                return;
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f49010b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f49011c;
                String str5 = LaunchActivity.B1;
                org.telegram.messenger.qp.s1(launchActivity2.O).Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2 b10 = org.telegram.messenger.k2.b(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j3, j3, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 11:
                String str6 = LaunchActivity.B1;
                String M0 = org.telegram.messenger.hd.M0(2131753894, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                sb2.append(((TLRPC.TL_error) this.f49011c).text);
                org.telegram.ui.Components.v4.r0((g) this.f49010b, M0, sb2.toString(), null);
                return;
            case 12:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f49010b;
                String str7 = (String) this.f49011c;
                if (!launchActivity3.f41275o0.getFragmentStack().isEmpty()) {
                    launchActivity3.f41275o0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str7).getQueryParameter("ref")));
                    return;
                }
                return;
            case 13:
                String str8 = LaunchActivity.B1;
                ((LaunchActivity) this.f49010b).k0((TL_account.Password) this.f49011c);
                return;
            case 14:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.f49011c;
                if (!((LaunchActivity) this.f49010b).Q && LaunchActivity.F1) {
                    ccVar.j();
                    return;
                }
                return;
            case 15:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f49010b;
                Runnable runnable = (Runnable) this.f49011c;
                launchActivity4.f41275o0.getView().setVisibility(4);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f41277p0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f41277p0.getView().getVisibility() == 0) {
                        launchActivity4.f41277p0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f41279q0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f41279q0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                String str9 = LaunchActivity.B1;
                ((LaunchActivity) this.f49010b).t0((u71) this.f49011c);
                return;
            case 17:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f49010b;
                vf.b bVar = (vf.b) this.f49011c;
                launchActivity5.O0 = null;
                launchActivity5.P0 = null;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.U0 = null;
                launchActivity5.S0 = null;
                if (bVar != null) {
                    bVar.b();
                    return;
                }
                return;
            case 18:
                vf.b bVar2 = (vf.b) this.f49010b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f49011c;
                String str10 = LaunchActivity.B1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                if (u1Var != null) {
                    u1Var.dismiss();
                    return;
                }
                return;
            case 19:
                p90 p90Var = (p90) this.f49010b;
                TLObject tLObject3 = (TLObject) this.f49011c;
                p90Var.c();
                if (tLObject3 != null) {
                    p90Var.f48717a.k0((TL_account.Password) tLObject3);
                    return;
                }
                return;
            case 20:
                ((FiltersSetupActivity) this.f49011c).d0(((p90) this.f49010b).f48717a.M());
                return;
            case 21:
                pa0 pa0Var = (pa0) this.f49010b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f49011c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    org.telegram.messenger.g0.h3(new rp(pa0Var, createBitmap2, gLSurfaceView, 23));
                    return;
                }
                return;
            case 22:
                pa0 pa0Var2 = (pa0) this.f49010b;
                pa0Var2.f48732c.setImageResource(2131232211);
                pa0Var2.m0(((org.telegram.messenger.rd) this.f49011c).f25277f);
                pa0Var2.f48761y = false;
                return;
            case 23:
                ((EditText) this.f49010b).removeTextChangedListener((fi.h7) this.f49011c);
                return;
            case 24:
                Runnable runnable2 = (Runnable) this.f49011c;
                lb0 lb0Var = ((ob0) this.f49010b).f48352a;
                int i13 = 0;
                while (true) {
                    br[] brVarArr = lb0Var.f52309f;
                    if (i13 < brVarArr.length) {
                        brVarArr[i13].C(0.0f);
                        i13++;
                    } else {
                        runnable2.run();
                        lb0Var.f52308e = false;
                        return;
                    }
                }
            case 25:
                xb0 xb0Var = (xb0) this.f49010b;
                ce0 ce0Var = xb0Var.D;
                ce0Var.C1(false, false);
                org.telegram.messenger.g0.v1(xb0Var.f51816a);
                ce0Var.G1((TLRPC.TL_auth_authorization) ((TLObject) this.f49011c), false);
                return;
            case 26:
                xb0 xb0Var2 = (xb0) this.f49010b;
                String str11 = (String) this.f49011c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = xb0Var2.f51821n.current_algo;
                boolean z9 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z9) {
                    bArr = org.telegram.messenger.pv.c(org.telegram.messenger.g0.h1(str11), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                vb0 vb0Var = new vb0(xb0Var2, 2);
                if (z9) {
                    TL_account.Password password = xb0Var2.f51821n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.pv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        vb0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = d;
                    i7 = ((org.telegram.ui.ActionBar.f2) xb0Var2.D).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkPassword, vb0Var, 10);
                    return;
                }
                return;
            case 27:
                pc0 pc0Var = (pc0) this.f49010b;
                pc0Var.P.C1(false, false);
                org.telegram.messenger.g0.v1(pc0Var.P.fragmentView.findFocus());
                pc0Var.P.G1((TLRPC.TL_auth_authorization) ((TLRPC.auth_Authorization) this.f49011c), true);
                TLRPC.FileLocation fileLocation = pc0Var.O;
                if (fileLocation != null) {
                    Utilities.f21334f.c(new q10(28, pc0Var, fileLocation));
                    return;
                }
                return;
            case 28:
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.f49011c;
                i10 = ((org.telegram.ui.ActionBar.f2) ((pc0) this.f49010b).P).currentAccount;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
                if (fileLocation2 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(org.telegram.messenger.w7.z(4));
                    sb3.append("/");
                    sb3.append(fileLocation2.volume_id);
                    sb3.append("_");
                    s12.N2 = a8.p0.n(fileLocation2.local_id, ".jpg", sb3);
                    s12.getFileLoader().h0(false, 16777216, s12.N2, true);
                    return;
                }
                return;
            default:
                qc0 qc0Var = (qc0) this.f49010b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f49011c;
                ce0 ce0Var2 = qc0Var.G;
                ce0Var2.C1(false, true);
                if (tL_error2 == null) {
                    if (qc0Var.f49195r != null && qc0Var.f49196s != null && qc0Var.f49197w != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", qc0Var.f49195r);
                        bundle2.putString("phoneHash", qc0Var.f49196s);
                        bundle2.putString("code", qc0Var.f49197w);
                        ce0Var2.M1(5, true, bundle2, false);
                        return;
                    }
                    ce0Var2.M1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131746116, "ResetAccountCancelledAlert"));
                    return;
                } else {
                    ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error2.text);
                    return;
                }
        }
    }
}
