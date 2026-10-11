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
public final class n70 implements Runnable {
    public final int f40141a;
    public final Object f40142b;
    public final Object f40143c;

    public n70(int i10, Object obj, Object obj2) {
        this.f40141a = i10;
        this.f40142b = obj;
        this.f40143c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f40141a) {
            case 0:
                o70 o70Var = (o70) this.f40142b;
                String str = (String) this.f40143c;
                p70 p70Var = o70Var.f40435a;
                p70Var.f40775e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                p70Var.f40774c = p70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new oo(24, o70Var, str), 66);
                return;
            case 1:
                TLObject tLObject = (TLObject) this.f40143c;
                p70 p70Var2 = ((o70) this.f40142b).f40435a;
                if (tLObject != null) {
                    s70.a0(p70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    s70.a0(p70Var2.h, null);
                    return;
                }
            case 2:
                r70 r70Var = (r70) this.f40142b;
                String str2 = (String) this.f40143c;
                r70Var.h = str2;
                s70 s70Var = r70Var.f41346r;
                if (s70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f20142q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f20144q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                r70Var.f41345n = s70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(r70Var, str2, str2, 14), 66);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(8, (l80) this.f40142b, (CacheByChatsController.KeepMediaException) this.f40143c), 150L);
                return;
            case 4:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f40142b;
                languageSelectActivity.f33801e = (ArrayList) this.f40143c;
                languageSelectActivity.f33800c.l();
                return;
            case 5:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f40142b;
                String str3 = (String) this.f40143c;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new n70(4, languageSelectActivity2, new ArrayList()));
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
                int size2 = languageSelectActivity2.f33802f.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f33802f.get(i13);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList.add(localeInfo2);
                    }
                }
                AndroidUtilities.runOnUIThread(new n70(4, languageSelectActivity2, arrayList));
                return;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) this.f40142b;
                TLObject tLObject2 = (TLObject) this.f40143c;
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
                    znVar.f44810ia = resolvedbusinesschatlinks;
                    launchActivity.q0(znVar, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.g5.M(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 7:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f40142b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f40143c;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j3, j3, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 8:
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f40143c).text);
                org.telegram.ui.Components.g5.t0((h) this.f40142b, string, sb2.toString(), null);
                return;
            case 9:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f40142b;
                String str4 = (String) this.f40143c;
                if (!launchActivity3.f33835q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f33835q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    return;
                }
                return;
            case 10:
                Pattern pattern4 = LaunchActivity.B1;
                ((LaunchActivity) this.f40142b).j0((TL_account.Password) this.f40143c);
                return;
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f40142b;
                Runnable runnable = (Runnable) this.f40143c;
                launchActivity4.f33835q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f33837r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f33837r0.getView().getVisibility() == 0) {
                        launchActivity4.f33837r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f33839s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f33839s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) this.f40143c;
                if (!((LaunchActivity) this.f40142b).Q && LaunchActivity.E1) {
                    scVar.j();
                    return;
                }
                return;
            case 13:
                Pattern pattern5 = LaunchActivity.B1;
                ((LaunchActivity) this.f40142b).p0((wd1) this.f40143c);
                return;
            case 14:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f40142b;
                of.e eVar = (of.e) this.f40143c;
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
            case 15:
                of.e eVar2 = (of.e) this.f40142b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f40143c;
                Pattern pattern6 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 16:
                dc0 dc0Var = (dc0) this.f40142b;
                TLObject tLObject3 = (TLObject) this.f40143c;
                dc0Var.c();
                if (tLObject3 != null) {
                    dc0Var.f36975a.j0((TL_account.Password) tLObject3);
                    return;
                }
                return;
            case 17:
                ((FiltersSetupActivity) this.f40143c).X(((dc0) this.f40142b).f36975a.O());
                return;
            case 18:
                gd0 gd0Var = (gd0) this.f40142b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f40143c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new vq(gd0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 19:
                gd0 gd0Var2 = (gd0) this.f40142b;
                gd0Var2.f38017c.setImageResource(R.drawable.msg_location_alert2);
                gd0Var2.d0(((LocationController.SharingLocationInfo) this.f40143c).proximityMeters);
                gd0Var2.G = false;
                return;
            case 20:
                ((EditText) this.f40142b).removeTextChangedListener((org.telegram.ui.Components.ho) this.f40143c);
                return;
            case 21:
                Runnable runnable2 = (Runnable) this.f40143c;
                be0 be0Var = ((ee0) this.f40142b).f37278a;
                int i14 = 0;
                while (true) {
                    ds[] dsVarArr = be0Var.f36450f;
                    if (i14 < dsVarArr.length) {
                        dsVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        be0Var.f36449e = false;
                        return;
                    }
                }
            case 22:
                ne0 ne0Var = (ne0) this.f40142b;
                vg0 vg0Var = ne0Var.f40235y;
                vg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(ne0Var.f40225a);
                vg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f40143c), false);
                return;
            case 23:
                ne0 ne0Var2 = (ne0) this.f40142b;
                String str5 = (String) this.f40143c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ne0Var2.f40230n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str5), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                le0 le0Var = new le0(ne0Var2, 2);
                if (z10) {
                    TL_account.Password password = ne0Var2.f40230n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        le0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.m2) ne0Var2.f40235y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, le0Var, 10);
                    return;
                }
                return;
            case 24:
                ff0 ff0Var = (ff0) this.f40142b;
                ff0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(ff0Var.O.fragmentView.findFocus());
                ff0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f40143c), true);
                TLRPC.FileLocation fileLocation = ff0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new n70(25, ff0Var, fileLocation));
                    return;
                }
                return;
            case 25:
                i11 = ((org.telegram.ui.ActionBar.m2) ((ff0) this.f40142b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f40143c);
                return;
            case 26:
                gf0 gf0Var = (gf0) this.f40142b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f40143c;
                vg0 vg0Var2 = gf0Var.E;
                vg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (gf0Var.f38075r != null && gf0Var.f38076s != null && gf0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", gf0Var.f38075r);
                        bundle2.putString("phoneHash", gf0Var.f38076s);
                        bundle2.putString("code", gf0Var.v);
                        vg0Var2.u1(5, true, bundle2, false);
                        return;
                    }
                    vg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 27:
                yf0 yf0Var = (yf0) this.f40142b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f40143c);
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f20368a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.ai.g(new StringBuilder("+"), yf0Var.f44359b, hf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f20368a.setOnDismissListener(new tf0(yf0Var, 0));
                alertDialog$Builder.o();
                return;
            case 28:
                yf0 yf0Var2 = (yf0) this.f40142b;
                yf0Var2.getClass();
                yf0Var2.f44365e0 = ((TLRPC.TL_error) this.f40143c).text;
                return;
            default:
                ((yf0) this.f40142b).f44382s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f40143c), false);
                return;
        }
    }
}
