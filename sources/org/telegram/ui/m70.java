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
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.CacheByChatsController;
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
public final class m70 implements Runnable {
    public final int f39825a;
    public final Object f39826b;
    public final Object f39827c;

    public m70(int i10, Object obj, Object obj2) {
        this.f39825a = i10;
        this.f39826b = obj;
        this.f39827c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f39825a) {
            case 0:
                s70.V((s70) this.f39826b, (TLRPC.TL_error) this.f39827c);
                return;
            case 1:
                o70 o70Var = (o70) this.f39826b;
                String str = (String) this.f39827c;
                p70 p70Var = o70Var.f40468a;
                p70Var.f40736e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                p70Var.f40735c = p70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new oo(24, o70Var, str), 66);
                return;
            case 2:
                TLObject tLObject = (TLObject) this.f39827c;
                p70 p70Var2 = ((o70) this.f39826b).f40468a;
                if (tLObject != null) {
                    s70.a0(p70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    s70.a0(p70Var2.h, null);
                    return;
                }
            case 3:
                r70 r70Var = (r70) this.f39826b;
                String str2 = (String) this.f39827c;
                r70Var.h = str2;
                s70 s70Var = r70Var.f41344r;
                if (s70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f20152q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f20154q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                r70Var.f41343n = s70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ba(r70Var, str2, str2, 14), 66);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(9, (m80) this.f39826b, (CacheByChatsController.KeepMediaException) this.f39827c), 150L);
                return;
            case 5:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f39826b;
                languageSelectActivity.f33811e = (ArrayList) this.f39827c;
                languageSelectActivity.f33810c.l();
                return;
            case 6:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f39826b;
                String str3 = (String) this.f39827c;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new m70(5, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i12 = 0; i12 < size; i12++) {
                    LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i12);
                    if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList.add(localeInfo);
                    }
                }
                int size2 = languageSelectActivity2.f33812f.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f33812f.get(i13);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList.add(localeInfo2);
                    }
                }
                AndroidUtilities.runOnUIThread(new m70(5, languageSelectActivity2, arrayList));
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) this.f39826b;
                TLObject tLObject2 = (TLObject) this.f39827c;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
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
                    zn znVar = new zn(bundle);
                    znVar.f44855ia = resolvedbusinesschatlinks;
                    launchActivity.q0(znVar, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.g5.M(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 8:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f39826b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f39827c;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j3, j3, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 9:
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f39827c).text);
                org.telegram.ui.Components.g5.t0((h) this.f39826b, string, sb2.toString(), null);
                return;
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f39826b;
                String str4 = (String) this.f39827c;
                if (!launchActivity3.f33845q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f33845q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    return;
                }
                return;
            case 11:
                Pattern pattern4 = LaunchActivity.B1;
                ((LaunchActivity) this.f39826b).j0((TL_account.Password) this.f39827c);
                return;
            case 12:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f39826b;
                Runnable runnable = (Runnable) this.f39827c;
                launchActivity4.f33845q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f33847r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f33847r0.getView().getVisibility() == 0) {
                        launchActivity4.f33847r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f33849s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f33849s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.tc tcVar = (org.telegram.ui.Components.tc) this.f39827c;
                if (!((LaunchActivity) this.f39826b).Q && LaunchActivity.E1) {
                    tcVar.j();
                    return;
                }
                return;
            case 14:
                Pattern pattern5 = LaunchActivity.B1;
                ((LaunchActivity) this.f39826b).p0((xd1) this.f39827c);
                return;
            case 15:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f39826b;
                of.e eVar = (of.e) this.f39827c;
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
            case 16:
                of.e eVar2 = (of.e) this.f39826b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f39827c;
                Pattern pattern6 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 17:
                ec0 ec0Var = (ec0) this.f39826b;
                TLObject tLObject3 = (TLObject) this.f39827c;
                ec0Var.c();
                if (tLObject3 != null) {
                    ec0Var.f37265a.j0((TL_account.Password) tLObject3);
                    return;
                }
                return;
            case 18:
                ((FiltersSetupActivity) this.f39827c).X(((ec0) this.f39826b).f37265a.O());
                return;
            case 19:
                hd0 hd0Var = (hd0) this.f39826b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f39827c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new vq(hd0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 20:
                hd0 hd0Var2 = (hd0) this.f39826b;
                hd0Var2.f38303c.setImageResource(R.drawable.msg_location_alert2);
                hd0Var2.d0(((LocationController.SharingLocationInfo) this.f39827c).proximityMeters);
                hd0Var2.G = false;
                return;
            case 21:
                ((EditText) this.f39826b).removeTextChangedListener((org.telegram.ui.Components.ho) this.f39827c);
                return;
            case 22:
                Runnable runnable2 = (Runnable) this.f39827c;
                ce0 ce0Var = ((fe0) this.f39826b).f37569a;
                int i14 = 0;
                while (true) {
                    es[] esVarArr = ce0Var.f36778f;
                    if (i14 < esVarArr.length) {
                        esVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        ce0Var.f36777e = false;
                        return;
                    }
                }
            case 23:
                oe0 oe0Var = (oe0) this.f39826b;
                wg0 wg0Var = oe0Var.f40560y;
                wg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(oe0Var.f40550a);
                wg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f39827c), false);
                return;
            case 24:
                oe0 oe0Var2 = (oe0) this.f39826b;
                String str5 = (String) this.f39827c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = oe0Var2.f40555n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str5), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                me0 me0Var = new me0(oe0Var2, 2);
                if (z10) {
                    TL_account.Password password = oe0Var2.f40555n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        me0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.n2) oe0Var2.f40560y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, me0Var, 10);
                    return;
                }
                return;
            case 25:
                gf0 gf0Var = (gf0) this.f39826b;
                gf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(gf0Var.O.fragmentView.findFocus());
                gf0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f39827c), true);
                TLRPC.FileLocation fileLocation = gf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new m70(26, gf0Var, fileLocation));
                    return;
                }
                return;
            case 26:
                i11 = ((org.telegram.ui.ActionBar.n2) ((gf0) this.f39826b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f39827c);
                return;
            case 27:
                hf0 hf0Var = (hf0) this.f39826b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f39827c;
                wg0 wg0Var2 = hf0Var.E;
                wg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (hf0Var.f38361r != null && hf0Var.f38362s != null && hf0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", hf0Var.f38361r);
                        bundle2.putString("phoneHash", hf0Var.f38362s);
                        bundle2.putString("code", hf0Var.v);
                        wg0Var2.u1(5, true, bundle2, false);
                        return;
                    }
                    wg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 28:
                zf0 zf0Var = (zf0) this.f39826b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f39827c);
                alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f20378a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.bi.g(new StringBuilder("+"), zf0Var.f44633b, hf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f20378a.setOnDismissListener(new vf0(zf0Var, 0));
                alertDialog$Builder.o();
                return;
            default:
                zf0 zf0Var2 = (zf0) this.f39826b;
                zf0Var2.getClass();
                zf0Var2.f44639e0 = ((TLRPC.TL_error) this.f39827c).text;
                return;
        }
    }
}
