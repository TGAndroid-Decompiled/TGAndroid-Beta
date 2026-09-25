package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
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
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n80 implements Runnable {
    public final int f35767a;
    public final Object f35768b;
    public final Object f35769c;

    public n80(int i10, Object obj, Object obj2) {
        this.f35767a = i10;
        this.f35768b = obj;
        this.f35769c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f35767a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f35768b;
                String str = (String) this.f35769c;
                if (str.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new tt(29, languageSelectActivity, new ArrayList()));
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
                int size2 = languageSelectActivity.f31098f.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity.f31098f.get(i13);
                    if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                        arrayList.add(localeInfo2);
                    }
                }
                AndroidUtilities.runOnUIThread(new tt(29, languageSelectActivity, arrayList));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.f35768b;
                TLObject tLObject = (TLObject) this.f35769c;
                Pattern pattern = LaunchActivity.B1;
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
                    wn wnVar = new wn(bundle);
                    wnVar.f39518ia = resolvedbusinesschatlinks;
                    launchActivity.q0(wnVar, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.e5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f35768b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f35769c;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j3, j3, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 3:
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f35769c).text);
                org.telegram.ui.Components.e5.u0((h) this.f35768b, string, sb2.toString(), null);
                return;
            case 4:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f35768b;
                String str2 = (String) this.f35769c;
                if (!launchActivity3.f31131q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f31131q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str2).getQueryParameter("ref")));
                    return;
                }
                return;
            case 5:
                Pattern pattern4 = LaunchActivity.B1;
                ((LaunchActivity) this.f35768b).j0((TL_account.Password) this.f35769c);
                return;
            case 6:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f35768b;
                Runnable runnable = (Runnable) this.f35769c;
                launchActivity4.f31131q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f31133r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f31133r0.getView().getVisibility() == 0) {
                        launchActivity4.f31133r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f31135s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f31135s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f35769c;
                if (!((LaunchActivity) this.f35768b).Q && LaunchActivity.E1) {
                    qcVar.j();
                    return;
                }
                return;
            case 8:
                Pattern pattern5 = LaunchActivity.B1;
                ((LaunchActivity) this.f35768b).p0((od1) this.f35769c);
                return;
            case 9:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f35768b;
                nf.e eVar = (nf.e) this.f35769c;
                launchActivity5.P0 = null;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.V0 = null;
                launchActivity5.T0 = null;
                if (eVar != null) {
                    eVar.b();
                    return;
                }
                return;
            case 10:
                nf.e eVar2 = (nf.e) this.f35768b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f35769c;
                Pattern pattern6 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 11:
                zb0 zb0Var = (zb0) this.f35768b;
                TLObject tLObject2 = (TLObject) this.f35769c;
                zb0Var.a();
                if (tLObject2 != null) {
                    zb0Var.f40435a.j0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 12:
                ((FiltersSetupActivity) this.f35769c).X(((zb0) this.f35768b).f40435a.O());
                return;
            case 13:
                cd0 cd0Var = (cd0) this.f35768b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f35769c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new sq(cd0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 14:
                cd0 cd0Var2 = (cd0) this.f35768b;
                cd0Var2.f32660c.setImageResource(R.drawable.msg_location_alert2);
                cd0Var2.e0(((LocationController.SharingLocationInfo) this.f35769c).proximityMeters);
                cd0Var2.G = false;
                return;
            case 15:
                ((EditText) this.f35768b).removeTextChangedListener((org.telegram.ui.Components.rn) this.f35769c);
                return;
            case 16:
                Runnable runnable2 = (Runnable) this.f35769c;
                xd0 xd0Var = ((ae0) this.f35768b).f32138a;
                int i14 = 0;
                while (true) {
                    as[] asVarArr = xd0Var.f40238f;
                    if (i14 < asVarArr.length) {
                        asVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        xd0Var.e = false;
                        return;
                    }
                }
            case 17:
                je0 je0Var = (je0) this.f35768b;
                qg0 qg0Var = je0Var.f34788y;
                qg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(je0Var.f34779a);
                qg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f35769c), false);
                return;
            case 18:
                je0 je0Var2 = (je0) this.f35768b;
                String str3 = (String) this.f35769c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = je0Var2.f34783n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                he0 he0Var = new he0(je0Var2, 2);
                if (z10) {
                    TL_account.Password password = je0Var2.f34783n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        he0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.m2) je0Var2.f34788y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, he0Var, 10);
                    return;
                }
                return;
            case 19:
                bf0 bf0Var = (bf0) this.f35768b;
                bf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(bf0Var.O.fragmentView.findFocus());
                bf0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f35769c), true);
                TLRPC.FileLocation fileLocation = bf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new n80(20, bf0Var, fileLocation));
                    return;
                }
                return;
            case 20:
                i11 = ((org.telegram.ui.ActionBar.m2) ((bf0) this.f35768b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f35769c);
                return;
            case 21:
                cf0 cf0Var = (cf0) this.f35768b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f35769c;
                qg0 qg0Var2 = cf0Var.E;
                qg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (cf0Var.f32705r != null && cf0Var.f32706s != null && cf0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", cf0Var.f32705r);
                        bundle2.putString("phoneHash", cf0Var.f32706s);
                        bundle2.putString("code", cf0Var.v);
                        qg0Var2.u1(5, true, bundle2, false);
                        return;
                    }
                    qg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 22:
                tf0 tf0Var = (tf0) this.f35768b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f35769c);
                alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f18662a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.ok.h(new StringBuilder("+"), tf0Var.f38077b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f18662a.setOnDismissListener(new pf0(tf0Var, 0));
                alertDialog$Builder.o();
                return;
            case 23:
                tf0 tf0Var2 = (tf0) this.f35768b;
                tf0Var2.getClass();
                tf0Var2.f38082e0 = ((TLRPC.TL_error) this.f35769c).text;
                return;
            case 24:
                ((tf0) this.f35768b).f38099s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f35769c), false);
                return;
            case 25:
                Runnable runnable3 = (Runnable) this.f35769c;
                yr yrVar = ((tf0) this.f35768b).f38083f;
                int i15 = 0;
                while (true) {
                    as[] asVarArr2 = yrVar.f40238f;
                    if (i15 < asVarArr2.length) {
                        asVarArr2[i15].l(0.0f);
                        i15++;
                    } else {
                        runnable3.run();
                        yrVar.e = false;
                        return;
                    }
                }
            case 26:
                ((t3) this.f35768b).run((String) this.f35769c);
                return;
            case 27:
                sh0 sh0Var = (sh0) this.f35768b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f35769c;
                sh0Var.f37774c0 = false;
                if (tL_error3 == null) {
                    jh0 f02 = sh0Var.f0();
                    sh0Var.f37782j0.clear();
                    sh0Var.h0(f02);
                    return;
                }
                return;
            case 28:
                sh0 sh0Var2 = ((ih0) this.f35768b).f34524a;
                jh0 f03 = sh0Var2.f0();
                sh0Var2.f37781i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f35769c));
                TLRPC.ChatFull chatFull = sh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    sh0Var2.getMessagesStorage().saveChatLinksCount(sh0Var2.f37785n, sh0Var2.d.invitesCount);
                }
                sh0Var2.h0(f03);
                return;
            default:
                dj0 dj0Var = (dj0) this.f35768b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f35769c;
                if (dj0Var.getParentActivity() != null) {
                    Toast.makeText(dj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
        }
    }
}
