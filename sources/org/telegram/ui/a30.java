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

public final class a30 implements Runnable {

    public final int f36358a;

    public final Object f36359b;

    public final Object f36360c;

    public a30(int i10, Object obj, Object obj2) {
        this.f36358a = i10;
        this.f36359b = obj;
        this.f36360c = obj2;
    }

    @Override
    public final void run() {
        TLObject tLObject;
        int i10 = 14;
        int i11 = 0;
        switch (this.f36358a) {
            case 0:
                ((s50) ((w5) this.f36359b).f43609b).Q0.setNewColors((int[]) this.f36360c);
                break;
            case 1:
                c70.V((c70) this.f36359b, (TLRPC.TL_error) this.f36360c);
                break;
            case 2:
                y60 y60Var = (y60) this.f36359b;
                String str = (String) this.f36360c;
                z60 z60Var = y60Var.f44713a;
                z60Var.f45057e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                z60Var.f45056c = z60Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new gg(28, y60Var, str), 66);
                break;
            case 3:
                y60 y60Var2 = (y60) this.f36359b;
                TLObject tLObject2 = (TLObject) this.f36360c;
                z60 z60Var2 = y60Var2.f44713a;
                if (tLObject2 != null) {
                    c70.a0(z60Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                } else {
                    c70.a0(z60Var2.h, null);
                }
                break;
            case 4:
                b70 b70Var = (b70) this.f36359b;
                String str2 = (String) this.f36360c;
                b70Var.h = str2;
                c70 c70Var = b70Var.f36716r;
                if (c70Var.J) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f22490q = str2;
                    tLObject = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets.f22492q = str2;
                    tLObject = tL_messages_searchStickerSets;
                }
                b70Var.f36715n = c70Var.getConnectionsManager().sendRequest(tLObject, new z9(b70Var, str2, str2, i10), 66);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(i10, (v70) this.f36359b, (CacheByChatsController.KeepMediaException) this.f36360c), 150L);
                break;
            case 6:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f36359b;
                languageSelectActivity.f35492e = (ArrayList) this.f36360c;
                languageSelectActivity.f35491c.l();
                break;
            case 7:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f36359b;
                String str3 = (String) this.f36360c;
                int i12 = 6;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new a30(i12, languageSelectActivity2, new ArrayList()));
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i13);
                        if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity2.f35493f.size();
                    while (i11 < size2) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f35493f.get(i11);
                        if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList.add(localeInfo2);
                        }
                        i11++;
                    }
                    AndroidUtilities.runOnUIThread(new a30(i12, languageSelectActivity2, arrayList));
                }
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.f36359b;
                TLObject tLObject3 = (TLObject) this.f36360c;
                Pattern pattern = LaunchActivity.f35496x1;
                if (tLObject3 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject3;
                    MessagesController.getInstance(launchActivity.K).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.K).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.K).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    rn rnVar = new rn(bundle);
                    rnVar.f42036ea = resolvedbusinesschatlinks;
                    launchActivity.q0(rnVar, false, true);
                } else {
                    launchActivity.B0(org.telegram.ui.Components.y4.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                }
                break;
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f36359b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f36360c;
                Pattern pattern2 = LaunchActivity.f35496x1;
                MessagesController.getInstance(launchActivity2.K).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.K);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 10:
                h hVar = (h) this.f36359b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f36360c;
                Pattern pattern3 = LaunchActivity.f35496x1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                org.telegram.ui.Components.y4.u0(hVar, string, sb2.toString(), null);
                break;
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f36359b;
                String str4 = (String) this.f36360c;
                if (!launchActivity3.m0.getFragmentStack().isEmpty()) {
                    launchActivity3.m0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                }
                break;
            case 12:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f36359b;
                TL_account.Password password = (TL_account.Password) this.f36360c;
                Pattern pattern4 = LaunchActivity.f35496x1;
                launchActivity4.j0(password);
                break;
            case 13:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f36359b;
                Runnable runnable = (Runnable) this.f36360c;
                launchActivity5.m0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity5.f35523n0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity5.f35523n0.getView().getVisibility() == 0) {
                        launchActivity5.f35523n0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity5.f35525o0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity5.f35525o0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 14:
                LaunchActivity launchActivity6 = (LaunchActivity) this.f36359b;
                org.telegram.ui.Components.ec ecVar = (org.telegram.ui.Components.ec) this.f36360c;
                if (!launchActivity6.M && LaunchActivity.A1) {
                    ecVar.j();
                    break;
                }
                break;
            case 15:
                LaunchActivity launchActivity7 = (LaunchActivity) this.f36359b;
                nc1 nc1Var = (nc1) this.f36360c;
                Pattern pattern5 = LaunchActivity.f35496x1;
                launchActivity7.p0(nc1Var);
                break;
            case 16:
                LaunchActivity launchActivity8 = (LaunchActivity) this.f36359b;
                we.d dVar = (we.d) this.f36360c;
                launchActivity8.L0 = null;
                launchActivity8.M0 = null;
                launchActivity8.N0 = null;
                launchActivity8.O0 = null;
                launchActivity8.R0 = null;
                launchActivity8.P0 = null;
                if (dVar != null) {
                    dVar.b();
                }
                break;
            case 17:
                we.d dVar2 = (we.d) this.f36359b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f36360c;
                Pattern pattern6 = LaunchActivity.f35496x1;
                if (dVar2 != null) {
                    dVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                break;
            case 18:
                ob0 ob0Var = (ob0) this.f36359b;
                TLObject tLObject4 = (TLObject) this.f36360c;
                ob0Var.a();
                if (tLObject4 != null) {
                    ob0Var.f41050a.j0((TL_account.Password) tLObject4);
                }
                break;
            case 19:
                ((FiltersSetupActivity) this.f36360c).X(((ob0) this.f36359b).f41050a.O());
                break;
            case 20:
                tc0 tc0Var = (tc0) this.f36359b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f36360c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, byteBufferAllocateDirect);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, false);
                    bitmapCreateBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new lq(tc0Var, bitmapCreateBitmap2, gLSurfaceView, 21));
                    break;
                }
                break;
            case 21:
                tc0 tc0Var2 = (tc0) this.f36359b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.f36360c;
                tc0Var2.f42859c.setImageResource(R.drawable.msg_location_alert2);
                tc0Var2.e0(sharingLocationInfo.proximityMeters);
                tc0Var2.C = false;
                break;
            case 22:
                ((EditText) this.f36359b).removeTextChangedListener((gh.n4) this.f36360c);
                break;
            case 23:
                sd0 sd0Var = (sd0) this.f36359b;
                Runnable runnable2 = (Runnable) this.f36360c;
                od0 od0Var = sd0Var.f42580a;
                int i14 = 0;
                while (true) {
                    wr[] wrVarArr = od0Var.f43279f;
                    if (i14 >= wrVarArr.length) {
                        runnable2.run();
                        od0Var.f43278e = false;
                    } else {
                        wrVarArr[i14].l(0.0f);
                        i14++;
                    }
                    break;
                }
                break;
            case 24:
                be0 be0Var = (be0) this.f36359b;
                TLObject tLObject5 = (TLObject) this.f36360c;
                ig0 ig0Var = be0Var.f36803y;
                ig0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(be0Var.f36793a);
                ig0Var.o1((TLRPC.TL_auth_authorization) tLObject5, false);
                break;
            case 25:
                be0 be0Var2 = (be0) this.f36359b;
                String str5 = (String) this.f36360c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = be0Var2.f36798n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x8 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str5), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                zd0 zd0Var = new zd0(be0Var2, 2);
                if (z10) {
                    TL_account.Password password2 = be0Var2.f36798n;
                    TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x8, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (tL_inputCheckPasswordSRPStartCheck == null) {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        zd0Var.run(null, tL_error2);
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = tL_inputCheckPasswordSRPStartCheck;
                        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) be0Var2.f36803y).currentAccount).sendRequest(tL_auth_checkPassword, zd0Var, 10);
                    }
                }
                break;
            case 26:
                te0 te0Var = (te0) this.f36359b;
                TLObject tLObject6 = (TLObject) this.f36360c;
                te0Var.K.k1(false, false);
                AndroidUtilities.hideKeyboard(te0Var.K.fragmentView.findFocus());
                te0Var.K.o1((TLRPC.TL_auth_authorization) tLObject6, true);
                TLRPC.FileLocation fileLocation = te0Var.J;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new a30(27, te0Var, fileLocation));
                }
                break;
            case 27:
                MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) ((te0) this.f36359b).K).currentAccount).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f36360c);
                break;
            case 28:
                ue0 ue0Var = (ue0) this.f36359b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f36360c;
                ig0 ig0Var2 = ue0Var.A;
                ig0Var2.k1(false, true);
                if (tL_error3 == null) {
                    if (ue0Var.f43203r == null || ue0Var.f43204s == null || ue0Var.v == null) {
                        ig0Var2.u1(0, true, null, true);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", ue0Var.f43203r);
                        bundle2.putString("phoneHash", ue0Var.f43204s);
                        bundle2.putString("code", ue0Var.v);
                        ig0Var2.u1(5, true, bundle2, false);
                    }
                } else if (tL_error3.text.equals("2FA_RECENT_CONFIRM")) {
                    ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                } else {
                    ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                }
                break;
            default:
                mf0 mf0Var = (mf0) this.f36359b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f36360c);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f22702a.P = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.y1.k(new StringBuilder("+"), mf0Var.f40480b, oe.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f22702a.setOnDismissListener(new if0(mf0Var, i11));
                alertDialog$Builder.o();
                break;
        }
    }
}
