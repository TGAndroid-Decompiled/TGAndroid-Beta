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
public final class f10 implements Runnable {
    public final int f45481a;
    public final Object f45482b;
    public final Object f45483c;

    public f10(int i7, Object obj, Object obj2) {
        this.f45481a = i7;
        this.f45482b = obj;
        this.f45483c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        byte[] bArr;
        switch (this.f45481a) {
            case 0:
                f40 f40Var = (f40) this.f45482b;
                org.telegram.messenger.qs.f(f40Var.n1.f21770a).k(75, 6, ((TLRPC.TL_error) this.f45483c).text);
                f40Var.dismiss();
                return;
            case 1:
                m4 m4Var = (m4) this.f45482b;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.k2) this.f45483c).f39346e.getBitmap(100, 100);
                    if (bitmap != null) {
                        org.telegram.messenger.g0.h3(new f10(2, m4Var, a8.ba.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 2:
                ((f40) ((m4) this.f45482b).f47787b).O2.setNewColors((int[]) this.f45483c);
                return;
            case 3:
                p50.a0((p50) this.f45482b, (TLRPC.TL_error) this.f45483c);
                return;
            case 4:
                l50 l50Var = (l50) this.f45482b;
                String str = (String) this.f45483c;
                m50 m50Var = l50Var.f47517a;
                m50Var.f47795e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                m50Var.f47794c = m50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new k50(0, l50Var, str), 66);
                return;
            case 5:
                TLObject tLObject = (TLObject) this.f45483c;
                m50 m50Var2 = ((l50) this.f45482b).f47517a;
                if (tLObject != null) {
                    p50.f0(m50Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    p50.f0(m50Var2.h, null);
                    return;
                }
            case 6:
                o50 o50Var = (o50) this.f45482b;
                String str2 = (String) this.f45483c;
                o50Var.h = str2;
                p50 p50Var = o50Var.f48434r;
                if (p50Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f27072q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f27074q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                o50Var.f48433n = p50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new z9(o50Var, str2, str2, 14), 66);
                return;
            case 7:
                org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.c(12, (d60) this.f45482b, (org.telegram.messenger.s2) this.f45483c), 150L);
                return;
            case 8:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f45482b;
                languageSelectActivity.f41248e = (ArrayList) this.f45483c;
                languageSelectActivity.f41247c.f();
                return;
            case 9:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f45482b;
                String str3 = (String) this.f45483c;
                if (str3.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.h3(new f10(8, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) languageSelectActivity2.h.get(i7);
                    if (fdVar.f22400a.toLowerCase().startsWith(str3) || fdVar.f22401b.toLowerCase().startsWith(str3)) {
                        arrayList.add(fdVar);
                    }
                }
                int size2 = languageSelectActivity2.f41249f.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.fd fdVar2 = (org.telegram.messenger.fd) languageSelectActivity2.f41249f.get(i10);
                    if (fdVar2.f22400a.toLowerCase().startsWith(str3) || fdVar2.f22401b.toLowerCase().startsWith(str3)) {
                        arrayList.add(fdVar2);
                    }
                }
                org.telegram.messenger.g0.h3(new f10(8, languageSelectActivity2, arrayList));
                return;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.f45482b;
                TLObject tLObject2 = (TLObject) this.f45483c;
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
                    cn cnVar = new cn(bundle);
                    cnVar.Da = resolvedbusinesschatlinks;
                    launchActivity.u0(cnVar, false, true);
                    return;
                }
                launchActivity.F0(org.telegram.ui.Components.u4.K(launchActivity, org.telegram.messenger.id.M0(2131752716, null), org.telegram.messenger.id.M0(2131752712, null)));
                return;
            case 11:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f45482b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f45483c;
                String str5 = LaunchActivity.B1;
                org.telegram.messenger.qp.s1(launchActivity2.O).Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2 b10 = org.telegram.messenger.k2.b(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j3, j3, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 12:
                String str6 = LaunchActivity.B1;
                String M0 = org.telegram.messenger.id.M0(2131753894, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131751105, sb2, "\n");
                sb2.append(((TLRPC.TL_error) this.f45483c).text);
                org.telegram.ui.Components.u4.r0((g) this.f45482b, M0, sb2.toString(), null);
                return;
            case 13:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f45482b;
                String str7 = (String) this.f45483c;
                if (!launchActivity3.f41277o0.getFragmentStack().isEmpty()) {
                    launchActivity3.f41277o0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str7).getQueryParameter("ref")));
                    return;
                }
                return;
            case 14:
                String str8 = LaunchActivity.B1;
                ((LaunchActivity) this.f45482b).k0((TL_account.Password) this.f45483c);
                return;
            case 15:
                org.telegram.ui.Components.bc bcVar = (org.telegram.ui.Components.bc) this.f45483c;
                if (!((LaunchActivity) this.f45482b).Q && LaunchActivity.F1) {
                    bcVar.j();
                    return;
                }
                return;
            case 16:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f45482b;
                Runnable runnable = (Runnable) this.f45483c;
                launchActivity4.f41277o0.getView().setVisibility(4);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f41279p0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f41279p0.getView().getVisibility() == 0) {
                        launchActivity4.f41279p0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f41281q0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f41281q0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 17:
                String str9 = LaunchActivity.B1;
                ((LaunchActivity) this.f45482b).t0((x71) this.f45483c);
                return;
            case 18:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f45482b;
                vf.b bVar = (vf.b) this.f45483c;
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
            case 19:
                vf.b bVar2 = (vf.b) this.f45482b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f45483c;
                String str10 = LaunchActivity.B1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                if (u1Var != null) {
                    u1Var.dismiss();
                    return;
                }
                return;
            case 20:
                s90 s90Var = (s90) this.f45482b;
                TLObject tLObject3 = (TLObject) this.f45483c;
                s90Var.c();
                if (tLObject3 != null) {
                    s90Var.f49756a.k0((TL_account.Password) tLObject3);
                    return;
                }
                return;
            case 21:
                ((FiltersSetupActivity) this.f45483c).d0(((s90) this.f45482b).f49756a.M());
                return;
            case 22:
                sa0 sa0Var = (sa0) this.f45482b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f45483c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    org.telegram.messenger.g0.h3(new tp(sa0Var, createBitmap2, gLSurfaceView, 23));
                    return;
                }
                return;
            case 23:
                sa0 sa0Var2 = (sa0) this.f45482b;
                sa0Var2.f49771c.setImageResource(2131232211);
                sa0Var2.m0(((org.telegram.messenger.rd) this.f45483c).f25284f);
                sa0Var2.f49800y = false;
                return;
            case 24:
                ((EditText) this.f45482b).removeTextChangedListener((fi.h7) this.f45483c);
                return;
            case 25:
                Runnable runnable2 = (Runnable) this.f45483c;
                ob0 ob0Var = ((rb0) this.f45482b).f49332a;
                int i11 = 0;
                while (true) {
                    er[] erVarArr = ob0Var.f44118f;
                    if (i11 < erVarArr.length) {
                        erVarArr[i11].C(0.0f);
                        i11++;
                    } else {
                        runnable2.run();
                        ob0Var.f44117e = false;
                        return;
                    }
                }
            case 26:
                ac0 ac0Var = (ac0) this.f45482b;
                fe0 fe0Var = ac0Var.D;
                fe0Var.C1(false, false);
                org.telegram.messenger.g0.v1(ac0Var.f43634a);
                fe0Var.G1((TLRPC.TL_auth_authorization) ((TLObject) this.f45483c), false);
                return;
            case 27:
                ac0 ac0Var2 = (ac0) this.f45482b;
                String str11 = (String) this.f45483c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ac0Var2.f43639n.current_algo;
                boolean z9 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z9) {
                    bArr = org.telegram.messenger.pv.c(org.telegram.messenger.g0.h1(str11), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                yb0 yb0Var = new yb0(ac0Var2, 2);
                if (z9) {
                    TL_account.Password password = ac0Var2.f43639n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.pv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        yb0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = d;
                    ConnectionsManager.getInstance(fe0.q0(ac0Var2.D)).sendRequest(tL_auth_checkPassword, yb0Var, 10);
                    return;
                }
                return;
            case 28:
                sc0 sc0Var = (sc0) this.f45482b;
                sc0Var.P.C1(false, false);
                org.telegram.messenger.g0.v1(sc0Var.P.fragmentView.findFocus());
                sc0Var.P.G1((TLRPC.TL_auth_authorization) ((TLRPC.auth_Authorization) this.f45483c), true);
                TLRPC.FileLocation fileLocation = sc0Var.O;
                if (fileLocation != null) {
                    Utilities.f21342f.c(new f10(29, sc0Var, fileLocation));
                    return;
                }
                return;
            default:
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.f45483c;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(fe0.K0(((sc0) this.f45482b).P));
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
        }
    }
}
