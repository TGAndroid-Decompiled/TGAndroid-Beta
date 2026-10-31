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
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f70 implements Runnable {
    public final int f37189a;
    public final Object f37190b;
    public final Object f37191c;

    public f70(int i10, Object obj, Object obj2) {
        this.f37189a = i10;
        this.f37190b = obj;
        this.f37191c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f37189a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f37190b;
                languageSelectActivity.e = (ArrayList) this.f37191c;
                languageSelectActivity.f33343c.f();
                return;
            case 1:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f37190b;
                String str = (String) this.f37191c;
                if (str.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.i0.g3(new f70(0, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.zc zcVar = (org.telegram.messenger.zc) languageSelectActivity2.h.get(i10);
                    if (zcVar.f19495a.toLowerCase().startsWith(str) || zcVar.f19496b.toLowerCase().startsWith(str)) {
                        arrayList.add(zcVar);
                    }
                }
                int size2 = languageSelectActivity2.f33344f.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    org.telegram.messenger.zc zcVar2 = (org.telegram.messenger.zc) languageSelectActivity2.f33344f.get(i11);
                    if (zcVar2.f19495a.toLowerCase().startsWith(str) || zcVar2.f19496b.toLowerCase().startsWith(str)) {
                        arrayList.add(zcVar2);
                    }
                }
                org.telegram.messenger.i0.g3(new f70(0, languageSelectActivity2, arrayList));
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.f37190b;
                TLObject tLObject = (TLObject) this.f37191c;
                Pattern pattern = LaunchActivity.D1;
                if (tLObject instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject;
                    org.telegram.messenger.vp.r1(launchActivity.O).V3(resolvedbusinesschatlinks.users, false);
                    org.telegram.messenger.vp.r1(launchActivity.O).P3(resolvedbusinesschatlinks.chats, false);
                    org.telegram.messenger.hs.a0(launchActivity.O).m1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    un unVar = new un(bundle);
                    unVar.Ba = resolvedbusinesschatlinks;
                    launchActivity.u0(unVar, false, true);
                    return;
                }
                launchActivity.F0(org.telegram.ui.Components.s4.M(launchActivity, org.telegram.messenger.cd.L0(2131752716, null), org.telegram.messenger.cd.L0(2131752712, null)));
                return;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f37190b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f37191c;
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.vp.r1(launchActivity2.O).V3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.o2 b10 = org.telegram.messenger.o2.b(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j10, j10, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.D1;
                String L0 = org.telegram.messenger.cd.L0(2131753894, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.z20.q(null, 2131751106, sb2, "\n");
                sb2.append(((TLRPC.TL_error) this.f37191c).text);
                org.telegram.ui.Components.s4.t0((f) this.f37190b, L0, sb2.toString(), null);
                return;
            case 5:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f37190b;
                String str2 = (String) this.f37191c;
                if (!launchActivity3.f33377q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f33377q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str2).getQueryParameter("ref")));
                    return;
                }
                return;
            case 6:
                Pattern pattern4 = LaunchActivity.D1;
                ((LaunchActivity) this.f37190b).k0((TL_account.Password) this.f37191c);
                return;
            case 7:
                org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) this.f37191c;
                if (!((LaunchActivity) this.f37190b).Q && LaunchActivity.G1) {
                    wbVar.j();
                    return;
                }
                return;
            case 8:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f37190b;
                Runnable runnable = (Runnable) this.f37191c;
                launchActivity4.f33377q0.getView().setVisibility(4);
                if (org.telegram.messenger.i0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f33379r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f33379r0.getView().getVisibility() == 0) {
                        launchActivity4.f33379r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f33381s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f33381s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 9:
                Pattern pattern5 = LaunchActivity.D1;
                ((LaunchActivity) this.f37190b).t0((m91) this.f37191c);
                return;
            case 10:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f37190b;
                gf.e eVar = (gf.e) this.f37191c;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.T0 = null;
                launchActivity5.W0 = null;
                launchActivity5.U0 = null;
                if (eVar != null) {
                    eVar.b();
                    return;
                }
                return;
            case 11:
                gf.e eVar2 = (gf.e) this.f37190b;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.f37191c;
                Pattern pattern6 = LaunchActivity.D1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (x1Var != null) {
                    x1Var.dismiss();
                    return;
                }
                return;
            case 12:
                ua0 ua0Var = (ua0) this.f37190b;
                TLObject tLObject2 = (TLObject) this.f37191c;
                ua0Var.c();
                if (tLObject2 != null) {
                    ua0Var.f42100a.k0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 13:
                ((FiltersSetupActivity) this.f37191c).c0(((ua0) this.f37190b).f42100a.M());
                return;
            case 14:
                yb0 yb0Var = (yb0) this.f37190b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f37191c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    org.telegram.messenger.i0.g3(new qq(yb0Var, createBitmap2, gLSurfaceView, 23));
                    return;
                }
                return;
            case 15:
                yb0 yb0Var2 = (yb0) this.f37190b;
                yb0Var2.f43784c.setImageResource(2131232210);
                yb0Var2.l0(((org.telegram.messenger.md) this.f37191c).f16943f);
                yb0Var2.E = false;
                return;
            case 16:
                ((EditText) this.f37190b).removeTextChangedListener((ag.u2) this.f37191c);
                return;
            case 17:
                Runnable runnable2 = (Runnable) this.f37191c;
                uc0 uc0Var = ((wc0) this.f37190b).f42927a;
                int i12 = 0;
                while (true) {
                    bs[] bsVarArr = uc0Var.f44219f;
                    if (i12 < bsVarArr.length) {
                        bsVarArr[i12].C(0.0f);
                        i12++;
                    } else {
                        runnable2.run();
                        uc0Var.e = false;
                        return;
                    }
                }
            case 18:
                ed0 ed0Var = (ed0) this.f37190b;
                hf0 hf0Var = ed0Var.D;
                hf0Var.s1(false, false);
                org.telegram.messenger.i0.v1(ed0Var.f37023a);
                hf0Var.w1((TLRPC.TL_auth_authorization) ((TLObject) this.f37191c), false);
                return;
            case 19:
                ed0 ed0Var2 = (ed0) this.f37190b;
                String str3 = (String) this.f37191c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ed0Var2.f37027n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = org.telegram.messenger.aw.c(org.telegram.messenger.i0.h1(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                cd0 cd0Var = new cd0(ed0Var2, 2);
                if (z10) {
                    TL_account.Password password = ed0Var2.f37027n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.aw.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        cd0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = d;
                    ConnectionsManager.getInstance(hf0.o0(ed0Var2.D)).sendRequest(tL_auth_checkPassword, cd0Var, 10);
                    return;
                }
                return;
            case 20:
                wd0 wd0Var = (wd0) this.f37190b;
                wd0Var.O.s1(false, false);
                org.telegram.messenger.i0.v1(wd0Var.O.fragmentView.findFocus());
                wd0Var.O.w1((TLRPC.TL_auth_authorization) ((TLObject) this.f37191c), true);
                TLRPC.FileLocation fileLocation = wd0Var.N;
                if (fileLocation != null) {
                    Utilities.f14521f.c(new f70(21, wd0Var, fileLocation));
                    return;
                }
                return;
            case 21:
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.f37191c;
                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(hf0.I0(((wd0) this.f37190b).O));
                if (fileLocation2 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(org.telegram.messenger.b8.z(4));
                    sb3.append("/");
                    sb3.append(fileLocation2.volume_id);
                    sb3.append("_");
                    r12.N2 = a1.g.p(sb3, fileLocation2.local_id, ".jpg");
                    r12.getFileLoader().i0(false, 16777216, r12.N2, true);
                    return;
                }
                return;
            case 22:
                xd0 xd0Var = (xd0) this.f37190b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f37191c;
                hf0 hf0Var2 = xd0Var.G;
                hf0Var2.s1(false, true);
                if (tL_error2 == null) {
                    if (xd0Var.f43559r != null && xd0Var.f43560s != null && xd0Var.f43561w != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", xd0Var.f43559r);
                        bundle2.putString("phoneHash", xd0Var.f43560s);
                        bundle2.putString("code", xd0Var.f43561w);
                        hf0Var2.C1(5, true, bundle2, false);
                        return;
                    }
                    hf0Var2.C1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131746132, "ResetAccountCancelledAlert"));
                    return;
                } else {
                    hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                    return;
                }
            case 23:
                me0 me0Var = (me0) this.f37190b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f37191c);
                alertDialog$Builder.f20134a.R = org.telegram.messenger.cd.L0(2131752579, null);
                alertDialog$Builder.f20134a.T = org.telegram.messenger.cd.a0("CancelLinkSuccess", null, 2131752580, org.telegram.messenger.m5.h(new StringBuilder("+"), me0Var.f39658b, af.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752041, null), null);
                alertDialog$Builder.f20134a.setOnDismissListener(new ie0(me0Var, 0));
                alertDialog$Builder.p();
                return;
            case 24:
                me0 me0Var2 = (me0) this.f37190b;
                me0Var2.getClass();
                me0Var2.f39666g0 = ((TLRPC.TL_error) this.f37191c).text;
                return;
            case 25:
                ((me0) this.f37190b).f39682u0.w1((TLRPC.TL_auth_authorization) ((TLObject) this.f37191c), false);
                return;
            case 26:
                Runnable runnable3 = (Runnable) this.f37191c;
                zr zrVar = ((me0) this.f37190b).f39664f;
                int i13 = 0;
                while (true) {
                    bs[] bsVarArr2 = zrVar.f44219f;
                    if (i13 < bsVarArr2.length) {
                        bsVarArr2[i13].C(0.0f);
                        i13++;
                    } else {
                        runnable3.run();
                        zrVar.e = false;
                        return;
                    }
                }
            case 27:
                ((s3) this.f37190b).a((String) this.f37191c);
                return;
            case 28:
                ArrayList arrayList2 = (ArrayList) this.f37191c;
                hf0 hf0Var3 = ((gf0) this.f37190b).f37534a0;
                SharedPreferences d12 = org.telegram.messenger.vp.d1();
                if (!d12.getBoolean("firstloginshow", true) && !hf0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    hf0Var3.getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                    return;
                }
                d12.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hf0Var3.getParentActivity());
                int i14 = org.telegram.ui.ActionBar.t6.L5;
                alertDialog$Builder2.m(2131624065, 46, org.telegram.ui.ActionBar.t6.x0(null, i14, false), null);
                alertDialog$Builder2.n(i14, null);
                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131751771, "Continue"), null);
                String L02 = org.telegram.messenger.cd.L0(2131754278, "AllowFillNumber");
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                x1Var2.T = L02;
                hf0Var3.f37934n = hf0Var3.showDialog(x1Var2, true, null);
                hf0Var3.f37923c0 = true;
                return;
            default:
                jf0.Y((jf0) this.f37190b, (org.telegram.ui.ActionBar.x1) this.f37191c);
                return;
        }
    }
}
