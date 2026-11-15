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
public final class g50 implements Runnable {
    public final int f47346a;
    public final Object f47347b;
    public final Object f47348c;

    public g50(int i7, Object obj, Object obj2) {
        this.f47346a = i7;
        this.f47347b = obj;
        this.f47348c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        byte[] bArr;
        int i7;
        int i10;
        switch (this.f47346a) {
            case 0:
                TLObject tLObject = (TLObject) this.f47348c;
                i50 i50Var = ((h50) this.f47347b).f47613a;
                if (tLObject != null) {
                    l50.f0(i50Var.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    l50.f0(i50Var.h, null);
                    return;
                }
            case 1:
                k50 k50Var = (k50) this.f47347b;
                String str = (String) this.f47348c;
                k50Var.h = str;
                l50 l50Var = k50Var.f48591r;
                if (l50Var.O) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f28163q = str;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f28165q = str;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                k50Var.f48590n = l50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new z9(k50Var, str, str, 14), 66);
                return;
            case 2:
                org.telegram.messenger.g0.i3(new u5(0, (z50) this.f47347b, (org.telegram.messenger.s2) this.f47348c), 150L);
                return;
            case 3:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f47347b;
                languageSelectActivity.f42618e = (ArrayList) this.f47348c;
                languageSelectActivity.f42617c.f();
                return;
            case 4:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f47347b;
                String str2 = (String) this.f47348c;
                if (str2.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.h3(new g50(3, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) languageSelectActivity2.h.get(i11);
                    if (ddVar.f23058a.toLowerCase().startsWith(str2) || ddVar.f23059b.toLowerCase().startsWith(str2)) {
                        arrayList.add(ddVar);
                    }
                }
                int size2 = languageSelectActivity2.f42619f.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) languageSelectActivity2.f42619f.get(i12);
                    if (ddVar2.f23058a.toLowerCase().startsWith(str2) || ddVar2.f23059b.toLowerCase().startsWith(str2)) {
                        arrayList.add(ddVar2);
                    }
                }
                org.telegram.messenger.g0.h3(new g50(3, languageSelectActivity2, arrayList));
                return;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.f47347b;
                TLObject tLObject2 = (TLObject) this.f47348c;
                String str3 = LaunchActivity.C1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    org.telegram.messenger.np.s1(launchActivity.P).Y3(resolvedbusinesschatlinks.users, false);
                    org.telegram.messenger.np.s1(launchActivity.P).S3(resolvedbusinesschatlinks.chats, false);
                    org.telegram.messenger.vr.a0(launchActivity.P).m1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    an anVar = new an(bundle);
                    anVar.Ea = resolvedbusinesschatlinks;
                    launchActivity.u0(anVar, false, true);
                    return;
                }
                launchActivity.F0(org.telegram.ui.Components.t4.K(launchActivity, org.telegram.messenger.hd.M0(2131752716, null), org.telegram.messenger.hd.M0(2131752712, null)));
                return;
            case 6:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f47347b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f47348c;
                String str4 = LaunchActivity.C1;
                org.telegram.messenger.np.s1(launchActivity2.P).Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2 b10 = org.telegram.messenger.k2.b(launchActivity2.P);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j3, j3, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 7:
                String str5 = LaunchActivity.C1;
                String M0 = org.telegram.messenger.hd.M0(2131753894, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.y0.r(null, 2131751105, sb2, "\n");
                sb2.append(((TLRPC.TL_error) this.f47348c).text);
                org.telegram.ui.Components.t4.r0((g) this.f47347b, M0, sb2.toString(), null);
                return;
            case 8:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f47347b;
                String str6 = (String) this.f47348c;
                if (!launchActivity3.f42649p0.getFragmentStack().isEmpty()) {
                    launchActivity3.f42649p0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str6).getQueryParameter("ref")));
                    return;
                }
                return;
            case 9:
                String str7 = LaunchActivity.C1;
                ((LaunchActivity) this.f47347b).k0((TL_account.Password) this.f47348c);
                return;
            case 10:
                org.telegram.ui.Components.xb xbVar = (org.telegram.ui.Components.xb) this.f47348c;
                if (!((LaunchActivity) this.f47347b).R && LaunchActivity.G1) {
                    xbVar.j();
                    return;
                }
                return;
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f47347b;
                Runnable runnable = (Runnable) this.f47348c;
                launchActivity4.f42649p0.getView().setVisibility(4);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f42651q0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f42651q0.getView().getVisibility() == 0) {
                        launchActivity4.f42651q0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f42653r0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f42653r0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 12:
                String str8 = LaunchActivity.C1;
                ((LaunchActivity) this.f47347b).t0((t71) this.f47348c);
                return;
            case 13:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f47347b;
                vf.b bVar = (vf.b) this.f47348c;
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
            case 14:
                vf.b bVar2 = (vf.b) this.f47347b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f47348c;
                String str9 = LaunchActivity.C1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                if (t1Var != null) {
                    t1Var.dismiss();
                    return;
                }
                return;
            case 15:
                q90 q90Var = (q90) this.f47347b;
                TLObject tLObject3 = (TLObject) this.f47348c;
                q90Var.c();
                if (tLObject3 != null) {
                    q90Var.f50510a.k0((TL_account.Password) tLObject3);
                    return;
                }
                return;
            case 16:
                ((FiltersSetupActivity) this.f47348c).d0(((q90) this.f47347b).f50510a.M());
                return;
            case 17:
                pa0 pa0Var = (pa0) this.f47347b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f47348c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    org.telegram.messenger.g0.h3(new tp(pa0Var, createBitmap2, gLSurfaceView, 23));
                    return;
                }
                return;
            case 18:
                pa0 pa0Var2 = (pa0) this.f47347b;
                pa0Var2.f50196c.setImageResource(2131232212);
                pa0Var2.m0(((org.telegram.messenger.qd) this.f47348c).f26082f);
                pa0Var2.f50225y = false;
                return;
            case 19:
                ((EditText) this.f47347b).removeTextChangedListener((bi.v) this.f47348c);
                return;
            case 20:
                Runnable runnable2 = (Runnable) this.f47348c;
                lb0 lb0Var = ((ob0) this.f47347b).f49890a;
                int i13 = 0;
                while (true) {
                    dr[] drVarArr = lb0Var.f45491f;
                    if (i13 < drVarArr.length) {
                        drVarArr[i13].D(0.0f);
                        i13++;
                    } else {
                        runnable2.run();
                        lb0Var.f45490e = false;
                        return;
                    }
                }
            case 21:
                wb0 wb0Var = (wb0) this.f47347b;
                ce0 ce0Var = wb0Var.E;
                ce0Var.C1(false, false);
                org.telegram.messenger.g0.v1(wb0Var.f52527a);
                ce0Var.G1((TLRPC.TL_auth_authorization) ((TLObject) this.f47348c), false);
                return;
            case 22:
                wb0 wb0Var2 = (wb0) this.f47347b;
                String str10 = (String) this.f47348c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = wb0Var2.f52532n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = org.telegram.messenger.nv.c(org.telegram.messenger.g0.h1(str10), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                ub0 ub0Var = new ub0(wb0Var2, 2);
                if (z10) {
                    TL_account.Password password = wb0Var2.f52532n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.nv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        ub0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = d;
                    i7 = ((org.telegram.ui.ActionBar.e2) wb0Var2.E).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkPassword, ub0Var, 10);
                    return;
                }
                return;
            case 23:
                oc0 oc0Var = (oc0) this.f47347b;
                oc0Var.Q.C1(false, false);
                org.telegram.messenger.g0.v1(oc0Var.Q.fragmentView.findFocus());
                oc0Var.Q.G1((TLRPC.TL_auth_authorization) ((TLRPC.auth_Authorization) this.f47348c), true);
                TLRPC.FileLocation fileLocation = oc0Var.P;
                if (fileLocation != null) {
                    Utilities.f22417f.c(new g50(24, oc0Var, fileLocation));
                    return;
                }
                return;
            case 24:
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.f47348c;
                i10 = ((org.telegram.ui.ActionBar.e2) ((oc0) this.f47347b).Q).currentAccount;
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i10);
                if (fileLocation2 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(org.telegram.messenger.w7.z(4));
                    sb3.append("/");
                    sb3.append(fileLocation2.volume_id);
                    sb3.append("_");
                    s12.O2 = a8.p0.n(fileLocation2.local_id, ".jpg", sb3);
                    s12.getFileLoader().h0(false, 16777216, s12.O2, true);
                    return;
                }
                return;
            case 25:
                pc0 pc0Var = (pc0) this.f47347b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f47348c;
                ce0 ce0Var2 = pc0Var.H;
                ce0Var2.C1(false, true);
                if (tL_error2 == null) {
                    if (pc0Var.f50247r != null && pc0Var.f50248s != null && pc0Var.f50249w != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", pc0Var.f50247r);
                        bundle2.putString("phoneHash", pc0Var.f50248s);
                        bundle2.putString("code", pc0Var.f50249w);
                        ce0Var2.M1(5, true, bundle2, false);
                        return;
                    }
                    ce0Var2.M1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131746115, "ResetAccountCancelledAlert"));
                    return;
                } else {
                    ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), tL_error2.text);
                    return;
                }
            case 26:
                ed0 ed0Var = (ed0) this.f47347b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f47348c);
                alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131752579, null);
                alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.a0("CancelLinkSuccess", null, 2131752580, org.telegram.messenger.k5.h(new StringBuilder("+"), ed0Var.f46733b, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752041, null), null);
                alertDialog$Builder.f28392a.setOnDismissListener(new ad0(ed0Var, 0));
                alertDialog$Builder.p();
                return;
            case 27:
                ed0 ed0Var2 = (ed0) this.f47347b;
                ed0Var2.getClass();
                ed0Var2.f46743h0 = ((TLRPC.TL_error) this.f47348c).text;
                return;
            case 28:
                ((ed0) this.f47347b).f46759v0.G1((TLRPC.TL_auth_authorization) ((TLObject) this.f47348c), false);
                return;
            default:
                Runnable runnable3 = (Runnable) this.f47348c;
                ar arVar = ((ed0) this.f47347b).f46740f;
                int i14 = 0;
                while (true) {
                    dr[] drVarArr2 = arVar.f45491f;
                    if (i14 < drVarArr2.length) {
                        drVarArr2[i14].D(0.0f);
                        i14++;
                    } else {
                        runnable3.run();
                        arVar.f45490e = false;
                        return;
                    }
                }
        }
    }
}
