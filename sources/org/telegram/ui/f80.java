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
public final class f80 implements Runnable {
    public final int f37227a;
    public final Object f37228b;
    public final Object f37229c;

    public f80(int i10, Object obj, Object obj2) {
        this.f37227a = i10;
        this.f37228b = obj;
        this.f37229c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f37227a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f37228b;
                String str = (String) this.f37229c;
                if (str.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new ot(29, languageSelectActivity, new ArrayList()));
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
                int size2 = languageSelectActivity.f33456f.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity.f33456f.get(i13);
                    if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                        arrayList.add(localeInfo2);
                    }
                }
                AndroidUtilities.runOnUIThread(new ot(29, languageSelectActivity, arrayList));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.f37228b;
                TLObject tLObject = (TLObject) this.f37229c;
                Pattern pattern = LaunchActivity.D1;
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
                    snVar.ua = resolvedbusinesschatlinks;
                    launchActivity.v0(snVar, false, true);
                    return;
                }
                launchActivity.G0(org.telegram.ui.Components.d5.M(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f37228b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f37229c;
                Pattern pattern2 = LaunchActivity.D1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 3:
                Pattern pattern3 = LaunchActivity.D1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f37229c).text);
                org.telegram.ui.Components.d5.t0((g) this.f37228b, string, sb2.toString(), null);
                return;
            case 4:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f37228b;
                String str2 = (String) this.f37229c;
                if (!launchActivity3.f33489q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f33489q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str2).getQueryParameter("ref")));
                    return;
                }
                return;
            case 5:
                Pattern pattern4 = LaunchActivity.D1;
                ((LaunchActivity) this.f37228b).l0((TL_account.Password) this.f37229c);
                return;
            case 6:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f37228b;
                Runnable runnable = (Runnable) this.f37229c;
                launchActivity4.f33489q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f33491r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f33491r0.getView().getVisibility() == 0) {
                        launchActivity4.f33491r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f33493s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f33493s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.oc ocVar = (org.telegram.ui.Components.oc) this.f37229c;
                if (!((LaunchActivity) this.f37228b).Q && LaunchActivity.G1) {
                    ocVar.j();
                    return;
                }
                return;
            case 8:
                Pattern pattern5 = LaunchActivity.D1;
                ((LaunchActivity) this.f37228b).u0((pc1) this.f37229c);
                return;
            case 9:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f37228b;
                pf.c cVar = (pf.c) this.f37229c;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.T0 = null;
                launchActivity5.W0 = null;
                launchActivity5.U0 = null;
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
            case 10:
                pf.c cVar2 = (pf.c) this.f37228b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f37229c;
                Pattern pattern6 = LaunchActivity.D1;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (c2Var != null) {
                    c2Var.dismiss();
                    return;
                }
                return;
            case 11:
                ob0 ob0Var = (ob0) this.f37228b;
                TLObject tLObject2 = (TLObject) this.f37229c;
                ob0Var.c();
                if (tLObject2 != null) {
                    ob0Var.f40145a.l0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 12:
                ((FiltersSetupActivity) this.f37229c).Y(((ob0) this.f37228b).f40145a.O());
                return;
            case 13:
                rc0 rc0Var = (rc0) this.f37228b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f37229c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new lq(rc0Var, createBitmap2, gLSurfaceView, 23));
                    return;
                }
                return;
            case 14:
                rc0 rc0Var2 = (rc0) this.f37228b;
                rc0Var2.f41096c.setImageResource(R.drawable.msg_location_alert2);
                rc0Var2.e0(((LocationController.SharingLocationInfo) this.f37229c).proximityMeters);
                rc0Var2.G = false;
                return;
            case 15:
                ((EditText) this.f37228b).removeTextChangedListener((org.telegram.ui.Components.yn) this.f37229c);
                return;
            case 16:
                Runnable runnable2 = (Runnable) this.f37229c;
                nd0 nd0Var = ((qd0) this.f37228b).f40783a;
                int i14 = 0;
                while (true) {
                    vr[] vrVarArr = nd0Var.f41792f;
                    if (i14 < vrVarArr.length) {
                        vrVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        nd0Var.e = false;
                        return;
                    }
                }
            case 17:
                ae0 ae0Var = (ae0) this.f37228b;
                hg0 hg0Var = ae0Var.f35746y;
                hg0Var.o1(false, false);
                AndroidUtilities.hideKeyboard(ae0Var.f35737a);
                hg0Var.s1((TLRPC.TL_auth_authorization) ((TLObject) this.f37229c), false);
                return;
            case 18:
                ae0 ae0Var2 = (ae0) this.f37228b;
                String str3 = (String) this.f37229c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ae0Var2.f35741n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                xd0 xd0Var = new xd0(ae0Var2, 2);
                if (z10) {
                    TL_account.Password password = ae0Var2.f35741n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        xd0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.o2) ae0Var2.f35746y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, xd0Var, 10);
                    return;
                }
                return;
            case 19:
                te0 te0Var = (te0) this.f37228b;
                te0Var.O.o1(false, false);
                AndroidUtilities.hideKeyboard(te0Var.O.fragmentView.findFocus());
                te0Var.O.s1((TLRPC.TL_auth_authorization) ((TLObject) this.f37229c), true);
                TLRPC.FileLocation fileLocation = te0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new f80(20, te0Var, fileLocation));
                    return;
                }
                return;
            case 20:
                i11 = ((org.telegram.ui.ActionBar.o2) ((te0) this.f37228b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f37229c);
                return;
            case 21:
                ue0 ue0Var = (ue0) this.f37228b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f37229c;
                hg0 hg0Var2 = ue0Var.G;
                hg0Var2.o1(false, true);
                if (tL_error2 == null) {
                    if (ue0Var.f42404r != null && ue0Var.f42405s != null && ue0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", ue0Var.f42404r);
                        bundle2.putString("phoneHash", ue0Var.f42405s);
                        bundle2.putString("code", ue0Var.v);
                        hg0Var2.y1(5, true, bundle2, false);
                        return;
                    }
                    hg0Var2.y1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 22:
                lf0 lf0Var = (lf0) this.f37228b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f37229c);
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f20679a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.tl.h(new StringBuilder("+"), lf0Var.f39231b, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f20679a.setOnDismissListener(new gf0(lf0Var, 0));
                alertDialog$Builder.p();
                return;
            case 23:
                lf0 lf0Var2 = (lf0) this.f37228b;
                lf0Var2.getClass();
                lf0Var2.f39239g0 = ((TLRPC.TL_error) this.f37229c).text;
                return;
            case 24:
                ((lf0) this.f37228b).f39255u0.s1((TLRPC.TL_auth_authorization) ((TLObject) this.f37229c), false);
                return;
            case 25:
                Runnable runnable3 = (Runnable) this.f37229c;
                sr srVar = ((lf0) this.f37228b).f39237f;
                int i15 = 0;
                while (true) {
                    vr[] vrVarArr2 = srVar.f41792f;
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
                ((u3) this.f37228b).run((String) this.f37229c);
                return;
            case 27:
                ArrayList arrayList2 = (ArrayList) this.f37229c;
                hg0 hg0Var3 = ((gg0) this.f37228b).f37562a0;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !hg0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    hg0Var3.getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                    return;
                }
                globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hg0Var3.getParentActivity());
                int i16 = R.raw.incoming_calls;
                int i17 = org.telegram.ui.ActionBar.k6.L5;
                alertDialog$Builder2.m(i16, 46, org.telegram.ui.ActionBar.k6.x0(null, i17, false), null);
                alertDialog$Builder2.n(i17, null);
                alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                String string2 = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
                c2Var2.T = string2;
                hg0Var3.f37849n = hg0Var3.showDialog(c2Var2, true, null);
                hg0Var3.f37838c0 = true;
                return;
            case 28:
                kg0.V((kg0) this.f37228b, (org.telegram.ui.ActionBar.c2) this.f37229c);
                return;
            default:
                lh0 lh0Var = (lh0) this.f37228b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f37229c;
                lh0Var.f39276c0 = false;
                if (tL_error3 == null) {
                    ch0 g02 = lh0Var.g0();
                    lh0Var.f39284j0.clear();
                    lh0Var.i0(g02);
                    return;
                }
                return;
        }
    }
}
