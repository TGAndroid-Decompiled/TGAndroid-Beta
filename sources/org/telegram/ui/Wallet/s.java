package org.telegram.ui.Wallet;

import ai.ea;
import android.app.Activity;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.gj1;
import org.telegram.ui.mj1;
import org.telegram.ui.ns0;
import org.telegram.ui.rj1;
import org.telegram.ui.sj1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class s implements Runnable {
    public final int f35333a;
    public final Object f35334b;
    public final Object f35335c;

    public s(int i10, Object obj, Object obj2) {
        this.f35333a = i10;
        this.f35334b = obj;
        this.f35335c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.b1 b1Var;
        org.telegram.ui.web.g0 g0Var;
        float f7;
        org.telegram.ui.web.t0 t0Var;
        int i10 = this.f35333a;
        boolean z10 = true;
        int i11 = 0;
        Object obj = this.f35335c;
        Object obj2 = this.f35334b;
        switch (i10) {
            case 0:
                boolean[] zArr = (boolean[]) obj2;
                q qVar = (q) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    qVar.run();
                    return;
                }
                return;
            case 1:
                l0 l0Var = (l0) obj2;
                j jVar = (j) obj;
                l0.E("emulate disable backup: ready");
                if (l0Var.t() <= 0) {
                    jVar.run(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = l0Var.f34995b;
                if (walletEngine2 == null) {
                    l0.i("emulate disable backup: no engine!");
                    jVar.run(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new d(l0Var, jVar));
                return;
            case 2:
                MessagesController.getInstance(((f2) obj2).f34699a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                return;
            case 3:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new na0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 4:
                ((p3) obj2).run(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 5:
                ((c5) obj2).D0.remove((o6) obj);
                return;
            case 6:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Utilities.Callback2) obj2).run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 7:
                k2[] k2VarArr = (k2[]) obj2;
                k2VarArr[0].setOnDismissListener(new w3((TLRPC.User) obj, 0));
                k2VarArr[0].dismiss();
                return;
            case 8:
                new zc(((k2[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.c6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
                return;
            case 9:
                k2[] k2VarArr2 = (k2[]) obj2;
                k2VarArr2[0].setOnDismissListener(new w3((TL_wallet.WalletTransactionPeer) obj, 1));
                k2VarArr2[0].dismiss();
                return;
            case 10:
                ((ViewGroup) obj).removeView(((x5) obj2).h);
                return;
            case 11:
                ((Utilities.Callback) obj2).run((TL_wallet.walletTransaction) obj);
                return;
            case 12:
                c7 c7Var = (c7) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if ((m2Var instanceof c5) && zc.a(m2Var)) {
                    zc.a0(m2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                c7Var.finishFragment();
                return;
            case 13:
                ((q0) obj).B();
                ((n7) obj2).f27773a.W2.N(true);
                return;
            case 14:
                n7 n7Var = (n7) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n7Var.getParentActivity(), 0, n7Var.getResourceProvider());
                String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new ns0(24, n7Var, (l0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 15:
                ((org.telegram.ui.ActionBar.a2[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 16:
                ((ViewGroup) obj).removeView(((y8) obj2).h);
                return;
            case 17:
                gj1 gj1Var = (gj1) obj2;
                int[] iArr = (int[]) obj;
                gj1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    WallpapersListActivity wallpapersListActivity = gj1Var.f38075a;
                    int[][] iArr2 = WallpapersListActivity.f35608k0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 18:
                mj1 mj1Var = (mj1) obj2;
                String str = (String) obj;
                mj1Var.d.clear();
                mj1Var.f40075e.clear();
                mj1Var.f40076f = true;
                mj1Var.F(str, "", true);
                mj1Var.h = str;
                mj1Var.l();
                mj1Var.f40082y = null;
                return;
            case 19:
                mj1 mj1Var2 = (mj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = mj1Var2.E;
                MessagesController.getInstance(WallpapersListActivity.p0(wallpapersListActivity2)).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(WallpapersListActivity.q0(wallpapersListActivity2)).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = mj1Var2.f40081x;
                mj1Var2.f40081x = null;
                mj1Var2.F(str2, "", false);
                return;
            case 20:
                String str3 = (String) obj;
                sj1 sj1Var = ((rj1) obj2).f41669a;
                Activity parentActivity = sj1Var.getParentActivity();
                MessageObject messageObject = sj1Var.f41943n;
                if (parentActivity != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(str3);
                    }
                    str3.getClass();
                    if (!str3.equals("share_game")) {
                        if (str3.equals("share_score")) {
                            messageObject.messageOwner.with_my_score = true;
                        }
                    } else {
                        messageObject.messageOwner.with_my_score = false;
                    }
                    sj1Var.showDialog(sr0.O0(sj1Var.getParentActivity(), messageObject, null, false, sj1Var.h));
                    return;
                }
                return;
            case 21:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) obj2;
                ei.r rVar = b1Var2.f43193j0;
                rVar.f9317f = true;
                rVar.k();
                b1Var2.v((ea) obj);
                return;
            case 22:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (b1Var = botWebViewContainer$BotWebViewProxy.f43156a) != null && (g0Var = b1Var.f43183c) != null) {
                    g0Var.f(arrayList);
                    return;
                }
                return;
            case 23:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.d1.f43230c.addAll(0, arrayList2);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    org.telegram.ui.web.d1.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.c1) longSparseArray.valueAt(i13));
                }
                org.telegram.ui.web.d1.f43229b = true;
                org.telegram.ui.web.d1.f43228a = false;
                ArrayList arrayList3 = org.telegram.ui.web.d1.f43231e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        ((Utilities.Callback) obj3).run(arrayList2);
                    }
                    org.telegram.ui.web.d1.f43231e = null;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.g1 g1Var = ((org.telegram.ui.web.f1) obj2).h;
                ArrayList arrayList4 = g1Var.f43256f;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                g1Var.h = false;
                j71 j71Var = g1Var.f27773a;
                if (j71Var != null) {
                    j71Var.W2.N(true);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) obj2;
                if (((org.telegram.ui.web.f2) obj).b() == null) {
                    z10 = false;
                }
                e1Var.setEnabled(z10);
                ViewPropertyAnimator animate = e1Var.animate();
                if (e1Var.isEnabled()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
            case 26:
                ((org.telegram.ui.l0) obj2).f43424f0.run((Integer) obj);
                return;
            case 27:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj2;
                y1Var.getMessagesController().removeWebBrowserException((String) obj);
                y1Var.f27773a.W2.N(true);
                return;
            case 28:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) obj2;
                TLObject tLObject = (TLObject) obj;
                int i14 = f2Var.f43243a;
                f2Var.f43248g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i14).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i14).putChats(tL_messages_webPage.chats, false);
                    f2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            f2Var.h = tL_webPage;
                        }
                    }
                    f2Var.h = null;
                }
                TLRPC.WebPage webPage = f2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    f2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (t0Var = f2Var.f43252l) != null) {
                    t0Var.run();
                }
                f2Var.c();
                return;
            default:
                ((org.telegram.ui.web.f2) obj2).f43253m.remove((s) obj);
                return;
        }
    }
}
