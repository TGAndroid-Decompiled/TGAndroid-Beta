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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.dj1;
import org.telegram.ui.jj1;
import org.telegram.ui.js0;
import org.telegram.ui.oj1;
import org.telegram.ui.pj1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class i implements Runnable {
    public final int f35065a;
    public final Object f35066b;
    public final Object f35067c;

    public i(int i10, Object obj, Object obj2) {
        this.f35065a = i10;
        this.f35066b = obj;
        this.f35067c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.b1 b1Var;
        org.telegram.ui.web.g0 g0Var;
        float f7;
        int i10 = this.f35065a;
        boolean z10 = true;
        int i11 = 0;
        Object obj = this.f35067c;
        Object obj2 = this.f35066b;
        switch (i10) {
            case 0:
                MessagesController.getInstance(((l0) obj2).f35185a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                return;
            case 1:
                l0 l0Var = (l0) obj2;
                l0.E("enable backup: ready! getting secret phrase...");
                l0Var.x(new ai.m0(20, l0Var, (d7) obj), false, true);
                return;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                r rVar = (r) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    rVar.run();
                    return;
                }
                return;
            case 3:
                l0 l0Var2 = (l0) obj2;
                k kVar = (k) obj;
                l0.E("emulate disable backup: ready");
                if (l0Var2.t() <= 0) {
                    kVar.run(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = l0Var2.f35186b;
                if (walletEngine2 == null) {
                    l0.i("emulate disable backup: no engine!");
                    kVar.run(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new d(l0Var2, kVar));
                return;
            case 4:
                MessagesController.getInstance(((f2) obj2).f34890a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                return;
            case 5:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new ka0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 6:
                ((p3) obj2).run(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 7:
                ((c5) obj2).D0.remove((o6) obj);
                return;
            case 8:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Utilities.Callback2) obj2).run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 9:
                k2[] k2VarArr = (k2[]) obj2;
                k2VarArr[0].setOnDismissListener(new w3((TLRPC.User) obj, 0));
                k2VarArr[0].dismiss();
                return;
            case 10:
                new ad(((k2[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.d6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
                return;
            case 11:
                k2[] k2VarArr2 = (k2[]) obj2;
                k2VarArr2[0].setOnDismissListener(new w3((TL_wallet.WalletTransactionPeer) obj, 1));
                k2VarArr2[0].dismiss();
                return;
            case 12:
                ((ViewGroup) obj).removeView(((x5) obj2).h);
                return;
            case 13:
                ((Utilities.Callback) obj2).run((TL_wallet.walletTransaction) obj);
                return;
            case 14:
                c7 c7Var = (c7) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if ((m2Var instanceof c5) && ad.a(m2Var)) {
                    ad.a0(m2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                c7Var.finishFragment();
                return;
            case 15:
                ((q0) obj).B();
                ((n7) obj2).f26922a.W2.N(true);
                return;
            case 16:
                n7 n7Var = (n7) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n7Var.getParentActivity(), 0, n7Var.getResourceProvider());
                String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new js0(25, n7Var, (l0) obj2));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 17:
                ((org.telegram.ui.ActionBar.a2[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 18:
                ((ViewGroup) obj).removeView(((y8) obj2).h);
                return;
            case 19:
                dj1 dj1Var = (dj1) obj2;
                int[] iArr = (int[]) obj;
                dj1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    WallpapersListActivity wallpapersListActivity = dj1Var.f37037a;
                    int[][] iArr2 = WallpapersListActivity.f35798k0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 20:
                jj1 jj1Var = (jj1) obj2;
                String str = (String) obj;
                jj1Var.d.clear();
                jj1Var.f39071e.clear();
                jj1Var.f39072f = true;
                jj1Var.F(str, "", true);
                jj1Var.h = str;
                jj1Var.l();
                jj1Var.f39078y = null;
                return;
            case 21:
                jj1 jj1Var2 = (jj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = jj1Var2.E;
                MessagesController.getInstance(WallpapersListActivity.p0(wallpapersListActivity2)).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(WallpapersListActivity.q0(wallpapersListActivity2)).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = jj1Var2.f39077x;
                jj1Var2.f39077x = null;
                jj1Var2.F(str2, "", false);
                return;
            case 22:
                String str3 = (String) obj;
                pj1 pj1Var = ((oj1) obj2).f40557a;
                Activity parentActivity = pj1Var.getParentActivity();
                MessageObject messageObject = pj1Var.f40897n;
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
                    pj1Var.showDialog(or0.O0(pj1Var.getParentActivity(), messageObject, null, false, pj1Var.h));
                    return;
                }
                return;
            case 23:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) obj2;
                ei.r rVar2 = b1Var2.f43440j0;
                rVar2.f9319f = true;
                rVar2.k();
                b1Var2.v((ea) obj);
                return;
            case 24:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (b1Var = botWebViewContainer$BotWebViewProxy.f43403a) != null && (g0Var = b1Var.f43430c) != null) {
                    g0Var.f(arrayList);
                    return;
                }
                return;
            case 25:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.d1.f43477c.addAll(0, arrayList2);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    org.telegram.ui.web.d1.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.c1) longSparseArray.valueAt(i13));
                }
                org.telegram.ui.web.d1.f43476b = true;
                org.telegram.ui.web.d1.f43475a = false;
                ArrayList arrayList3 = org.telegram.ui.web.d1.f43478e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        ((Utilities.Callback) obj3).run(arrayList2);
                    }
                    org.telegram.ui.web.d1.f43478e = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.web.g1 g1Var = ((org.telegram.ui.web.f1) obj2).h;
                ArrayList arrayList4 = g1Var.f43495f;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                g1Var.h = false;
                g71 g71Var = g1Var.f26922a;
                if (g71Var != null) {
                    g71Var.W2.N(true);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) obj2;
                if (((org.telegram.ui.web.g2) obj).b() == null) {
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
            case 28:
                ((org.telegram.ui.k0) obj2).f43674f0.run((Integer) obj);
                return;
            default:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj2;
                y1Var.getMessagesController().removeWebBrowserException((String) obj);
                y1Var.f26922a.W2.N(true);
                return;
        }
    }

    public i(n7 n7Var, l0 l0Var) {
        this.f35065a = 16;
        this.f35067c = n7Var;
        this.f35066b = l0Var;
    }
}
