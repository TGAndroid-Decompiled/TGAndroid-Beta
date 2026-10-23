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
    public final int f37243a;
    public final Object f37244b;
    public final Object f37245c;

    public f80(int i10, Object obj, Object obj2) {
        this.f37243a = i10;
        this.f37244b = obj;
        this.f37245c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f37243a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f37244b;
                String str = (String) this.f37245c;
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
                int size2 = languageSelectActivity.f33454f.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity.f33454f.get(i13);
                    if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                        arrayList.add(localeInfo2);
                    }
                }
                AndroidUtilities.runOnUIThread(new ot(29, languageSelectActivity, arrayList));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.f37244b;
                TLObject tLObject = (TLObject) this.f37245c;
                Pattern pattern = LaunchActivity.E1;
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
                launchActivity.G0(org.telegram.ui.Components.f5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f37244b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f37245c;
                Pattern pattern2 = LaunchActivity.E1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 3:
                Pattern pattern3 = LaunchActivity.E1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f37245c).text);
                org.telegram.ui.Components.f5.u0((g) this.f37244b, string, sb2.toString(), null);
                return;
            case 4:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f37244b;
                String str2 = (String) this.f37245c;
                if (!launchActivity3.f33487q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f33487q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str2).getQueryParameter("ref")));
                    return;
                }
                return;
            case 5:
                Pattern pattern4 = LaunchActivity.E1;
                ((LaunchActivity) this.f37244b).l0((TL_account.Password) this.f37245c);
                return;
            case 6:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f37244b;
                Runnable runnable = (Runnable) this.f37245c;
                launchActivity4.f33487q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f33489r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f33489r0.getView().getVisibility() == 0) {
                        launchActivity4.f33489r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f33491s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f33491s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f37245c;
                if (!((LaunchActivity) this.f37244b).Q && LaunchActivity.H1) {
                    qcVar.j();
                    return;
                }
                return;
            case 8:
                Pattern pattern5 = LaunchActivity.E1;
                ((LaunchActivity) this.f37244b).u0((qc1) this.f37245c);
                return;
            case 9:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f37244b;
                pf.c cVar = (pf.c) this.f37245c;
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
                pf.c cVar2 = (pf.c) this.f37244b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f37245c;
                Pattern pattern6 = LaunchActivity.E1;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (c2Var != null) {
                    c2Var.dismiss();
                    return;
                }
                return;
            case 11:
                ob0 ob0Var = (ob0) this.f37244b;
                TLObject tLObject2 = (TLObject) this.f37245c;
                ob0Var.c();
                if (tLObject2 != null) {
                    ob0Var.f40119a.l0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 12:
                ((FiltersSetupActivity) this.f37245c).Y(((ob0) this.f37244b).f40119a.O());
                return;
            case 13:
                sc0 sc0Var = (sc0) this.f37244b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f37245c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new lq(sc0Var, createBitmap2, gLSurfaceView, 23));
                    return;
                }
                return;
            case 14:
                sc0 sc0Var2 = (sc0) this.f37244b;
                sc0Var2.f41351c.setImageResource(R.drawable.msg_location_alert2);
                sc0Var2.e0(((LocationController.SharingLocationInfo) this.f37245c).proximityMeters);
                sc0Var2.G = false;
                return;
            case 15:
                ((EditText) this.f37244b).removeTextChangedListener((org.telegram.ui.Components.ao) this.f37245c);
                return;
            case 16:
                Runnable runnable2 = (Runnable) this.f37245c;
                od0 od0Var = ((rd0) this.f37244b).f41094a;
                int i14 = 0;
                while (true) {
                    vr[] vrVarArr = od0Var.f41793f;
                    if (i14 < vrVarArr.length) {
                        vrVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        od0Var.e = false;
                        return;
                    }
                }
            case 17:
                be0 be0Var = (be0) this.f37244b;
                ig0 ig0Var = be0Var.f36068y;
                ig0Var.o1(false, false);
                AndroidUtilities.hideKeyboard(be0Var.f36059a);
                ig0Var.s1((TLRPC.TL_auth_authorization) ((TLObject) this.f37245c), false);
                return;
            case 18:
                be0 be0Var2 = (be0) this.f37244b;
                String str3 = (String) this.f37245c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = be0Var2.f36063n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                yd0 yd0Var = new yd0(be0Var2, 2);
                if (z10) {
                    TL_account.Password password = be0Var2.f36063n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        yd0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.o2) be0Var2.f36068y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, yd0Var, 10);
                    return;
                }
                return;
            case 19:
                ue0 ue0Var = (ue0) this.f37244b;
                ue0Var.O.o1(false, false);
                AndroidUtilities.hideKeyboard(ue0Var.O.fragmentView.findFocus());
                ue0Var.O.s1((TLRPC.TL_auth_authorization) ((TLObject) this.f37245c), true);
                TLRPC.FileLocation fileLocation = ue0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new f80(20, ue0Var, fileLocation));
                    return;
                }
                return;
            case 20:
                i11 = ((org.telegram.ui.ActionBar.o2) ((ue0) this.f37244b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f37245c);
                return;
            case 21:
                ve0 ve0Var = (ve0) this.f37244b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f37245c;
                ig0 ig0Var2 = ve0Var.G;
                ig0Var2.o1(false, true);
                if (tL_error2 == null) {
                    if (ve0Var.f42748r != null && ve0Var.f42749s != null && ve0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", ve0Var.f42748r);
                        bundle2.putString("phoneHash", ve0Var.f42749s);
                        bundle2.putString("code", ve0Var.v);
                        ig0Var2.y1(5, true, bundle2, false);
                        return;
                    }
                    ig0Var2.y1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 22:
                mf0 mf0Var = (mf0) this.f37244b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f37245c);
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f20678a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.sl.h(new StringBuilder("+"), mf0Var.f39538b, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f20678a.setOnDismissListener(new hf0(mf0Var, 0));
                alertDialog$Builder.p();
                return;
            case 23:
                mf0 mf0Var2 = (mf0) this.f37244b;
                mf0Var2.getClass();
                mf0Var2.f39546g0 = ((TLRPC.TL_error) this.f37245c).text;
                return;
            case 24:
                ((mf0) this.f37244b).f39562u0.s1((TLRPC.TL_auth_authorization) ((TLObject) this.f37245c), false);
                return;
            case 25:
                Runnable runnable3 = (Runnable) this.f37245c;
                sr srVar = ((mf0) this.f37244b).f39544f;
                int i15 = 0;
                while (true) {
                    vr[] vrVarArr2 = srVar.f41793f;
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
                ((u3) this.f37244b).run((String) this.f37245c);
                return;
            case 27:
                ArrayList arrayList2 = (ArrayList) this.f37245c;
                ig0 ig0Var3 = ((hg0) this.f37244b).f37846a0;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !ig0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    ig0Var3.getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                    return;
                }
                globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ig0Var3.getParentActivity());
                int i16 = R.raw.incoming_calls;
                int i17 = org.telegram.ui.ActionBar.k6.L5;
                alertDialog$Builder2.m(i16, 46, org.telegram.ui.ActionBar.k6.x0(null, i17, false), null);
                alertDialog$Builder2.n(i17, null);
                alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                String string2 = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                c2Var2.T = string2;
                ig0Var3.f38208n = ig0Var3.showDialog(c2Var2, true, null);
                ig0Var3.f38197c0 = true;
                return;
            case 28:
                lg0.V((lg0) this.f37244b, (org.telegram.ui.ActionBar.c2) this.f37245c);
                return;
            default:
                mh0 mh0Var = (mh0) this.f37244b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f37245c;
                mh0Var.f39581c0 = false;
                if (tL_error3 == null) {
                    dh0 g02 = mh0Var.g0();
                    mh0Var.f39589j0.clear();
                    mh0Var.i0(g02);
                    return;
                }
                return;
        }
    }
}
