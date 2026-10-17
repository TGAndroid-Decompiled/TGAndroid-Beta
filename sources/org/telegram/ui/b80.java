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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class b80 implements Runnable {
    public final int f35588a;
    public final Object f35589b;
    public final Object f35590c;

    public b80(int i10, Object obj, Object obj2) {
        this.f35588a = i10;
        this.f35589b = obj;
        this.f35590c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f35588a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f35589b;
                String str = (String) this.f35590c;
                if (str.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new nt(29, languageSelectActivity, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity.h.size();
                for (int i12 = 0; i12 < size; i12++) {
                    LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i12);
                    if (localeInfo.name.toLowerCase().startsWith(str) || localeInfo.nameEnglish.toLowerCase().startsWith(str)) {
                        arrayList.add(localeInfo);
                    }
                }
                int size2 = languageSelectActivity.f33140f.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity.f33140f.get(i13);
                    if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                        arrayList.add(localeInfo2);
                    }
                }
                AndroidUtilities.runOnUIThread(new nt(29, languageSelectActivity, arrayList));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.f35589b;
                TLObject tLObject = (TLObject) this.f35590c;
                Pattern pattern = LaunchActivity.C1;
                if (tLObject instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject;
                    MessagesController.getInstance(launchActivity.O).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.O).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.O).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    sn snVar = new sn(bundle);
                    snVar.ia = resolvedbusinesschatlinks;
                    launchActivity.u0(snVar, false, true);
                    return;
                }
                launchActivity.F0(org.telegram.ui.Components.f5.M(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f35589b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f35590c;
                Pattern pattern2 = LaunchActivity.C1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 3:
                Pattern pattern3 = LaunchActivity.C1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.t0.n(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f35590c).text);
                org.telegram.ui.Components.f5.t0((h) this.f35589b, string, sb2.toString(), null);
                return;
            case 4:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f35589b;
                String str2 = (String) this.f35590c;
                if (!launchActivity3.f33173q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f33173q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str2).getQueryParameter("ref")));
                    return;
                }
                return;
            case 5:
                Pattern pattern4 = LaunchActivity.C1;
                ((LaunchActivity) this.f35589b).k0((TL_account.Password) this.f35590c);
                return;
            case 6:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f35589b;
                Runnable runnable = (Runnable) this.f35590c;
                launchActivity4.f33173q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f33175r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f33175r0.getView().getVisibility() == 0) {
                        launchActivity4.f33175r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f33177s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f33177s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f35590c;
                if (!((LaunchActivity) this.f35589b).Q && LaunchActivity.F1) {
                    qcVar.j();
                    return;
                }
                return;
            case 8:
                Pattern pattern5 = LaunchActivity.C1;
                ((LaunchActivity) this.f35589b).t0((mc1) this.f35590c);
                return;
            case 9:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f35589b;
                pf.c cVar = (pf.c) this.f35590c;
                launchActivity5.P0 = null;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.V0 = null;
                launchActivity5.T0 = null;
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
            case 10:
                pf.c cVar2 = (pf.c) this.f35589b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f35590c;
                Pattern pattern6 = LaunchActivity.C1;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 11:
                kb0 kb0Var = (kb0) this.f35589b;
                TLObject tLObject2 = (TLObject) this.f35590c;
                kb0Var.c();
                if (tLObject2 != null) {
                    kb0Var.f38459a.k0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 12:
                ((FiltersSetupActivity) this.f35590c).X(((kb0) this.f35589b).f38459a.O());
                return;
            case 13:
                pc0 pc0Var = (pc0) this.f35589b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f35590c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new lq(pc0Var, createBitmap2, gLSurfaceView, 22));
                    return;
                }
                return;
            case 14:
                pc0 pc0Var2 = (pc0) this.f35589b;
                pc0Var2.f40041c.setImageResource(R.drawable.msg_location_alert2);
                pc0Var2.d0(((LocationController.SharingLocationInfo) this.f35590c).proximityMeters);
                pc0Var2.G = false;
                return;
            case 15:
                ((EditText) this.f35589b).removeTextChangedListener((org.telegram.ui.Components.ao) this.f35590c);
                return;
            case 16:
                Runnable runnable2 = (Runnable) this.f35590c;
                kd0 kd0Var = ((od0) this.f35589b).f39742a;
                int i14 = 0;
                while (true) {
                    vr[] vrVarArr = kd0Var.f41486f;
                    if (i14 < vrVarArr.length) {
                        vrVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        kd0Var.e = false;
                        return;
                    }
                }
            case 17:
                xd0 xd0Var = (xd0) this.f35589b;
                fg0 fg0Var = xd0Var.f43099y;
                fg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(xd0Var.f43090a);
                fg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f35590c), false);
                return;
            case 18:
                xd0 xd0Var2 = (xd0) this.f35589b;
                String str3 = (String) this.f35590c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = xd0Var2.f43094n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                vd0 vd0Var = new vd0(xd0Var2, 2);
                if (z10) {
                    TL_account.Password password = xd0Var2.f43094n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        vd0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.n2) xd0Var2.f43099y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, vd0Var, 10);
                    return;
                }
                return;
            case 19:
                pe0 pe0Var = (pe0) this.f35589b;
                pe0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(pe0Var.O.fragmentView.findFocus());
                pe0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f35590c), true);
                TLRPC.FileLocation fileLocation = pe0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new b80(20, pe0Var, fileLocation));
                    return;
                }
                return;
            case 20:
                i11 = ((org.telegram.ui.ActionBar.n2) ((pe0) this.f35589b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f35590c);
                return;
            case 21:
                qe0 qe0Var = (qe0) this.f35589b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f35590c;
                fg0 fg0Var2 = qe0Var.E;
                fg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (qe0Var.f40397r != null && qe0Var.f40398s != null && qe0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", qe0Var.f40397r);
                        bundle2.putString("phoneHash", qe0Var.f40398s);
                        bundle2.putString("code", qe0Var.v);
                        fg0Var2.u1(5, true, bundle2, false);
                        return;
                    }
                    fg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 22:
                jf0 jf0Var = (jf0) this.f35589b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f35590c);
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f20601a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.wh.g(new StringBuilder("+"), jf0Var.f38136b, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f20601a.setOnDismissListener(new df0(jf0Var, 0));
                alertDialog$Builder.o();
                return;
            case 23:
                jf0 jf0Var2 = (jf0) this.f35589b;
                jf0Var2.getClass();
                jf0Var2.f38141e0 = ((TLRPC.TL_error) this.f35590c).text;
                return;
            case 24:
                ((jf0) this.f35589b).f38158s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f35590c), false);
                return;
            case 25:
                Runnable runnable3 = (Runnable) this.f35590c;
                sr srVar = ((jf0) this.f35589b).f38142f;
                int i15 = 0;
                while (true) {
                    vr[] vrVarArr2 = srVar.f41486f;
                    if (i15 < vrVarArr2.length) {
                        vrVarArr2[i15].l(0.0f);
                        i15++;
                    } else {
                        runnable3.run();
                        srVar.e = false;
                        return;
                    }
                }
            case 26:
                ((v3) this.f35589b).run((String) this.f35590c);
                return;
            case 27:
                ArrayList arrayList2 = (ArrayList) this.f35590c;
                fg0 fg0Var3 = ((eg0) this.f35589b).V;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !fg0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    fg0Var3.getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                    return;
                }
                globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(fg0Var3.getParentActivity());
                alertDialog$Builder2.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                String string2 = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20601a;
                b2Var2.T = string2;
                fg0Var3.f36919n = fg0Var3.showDialog(b2Var2, true, null);
                fg0Var3.f36908c0 = true;
                return;
            case 28:
                ig0.V((ig0) this.f35589b, (org.telegram.ui.ActionBar.b2) this.f35590c);
                return;
            default:
                kh0 kh0Var = (kh0) this.f35589b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f35590c;
                kh0Var.f38531c0 = false;
                if (tL_error3 == null) {
                    bh0 f02 = kh0Var.f0();
                    kh0Var.f38539j0.clear();
                    kh0Var.h0(f02);
                    return;
                }
                return;
        }
    }
}
