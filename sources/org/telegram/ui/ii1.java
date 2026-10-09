package org.telegram.ui;

import android.animation.ValueAnimator;
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
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class ii1 implements Runnable {
    public final int f38669a;
    public final Object f38670b;
    public final Object f38671c;

    public ii1(int i10, Object obj, Object obj2) {
        this.f38669a = i10;
        this.f38670b = obj;
        this.f38671c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.b1 b1Var;
        org.telegram.ui.web.g0 g0Var;
        int i10 = this.f38669a;
        float f7 = 1.0f;
        boolean z10 = true;
        int i11 = 0;
        Object obj = this.f38671c;
        Object obj2 = this.f38670b;
        switch (i10) {
            case 0:
                wi1 wi1Var = (wi1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.m2.U = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = wi1Var.K.animate().setDuration(150L);
                org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.f27118f;
                duration.setInterpolator(hsVar).start();
                wi1Var.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(hsVar).start();
                wi1Var.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(hsVar).start();
                wi1Var.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(hsVar).start();
                wi1Var.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(hsVar).start();
                wi1Var.f43647j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(hsVar).start();
                wi1Var.f43643h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(hsVar).start();
                wi1Var.f43645i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(hsVar).start();
                wi1Var.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(hsVar).start();
                valueAnimator.addListener(new ki1(wi1Var, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(hsVar);
                valueAnimator.start();
                return;
            case 1:
                MessagesController.getInstance(((org.telegram.ui.Wallet.k0) obj2).f35093a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                return;
            case 2:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.k0.E("enable backup: ready! getting secret phrase...");
                k0Var.x(new ai.m0(20, k0Var, (org.telegram.ui.Wallet.a7) obj), false, true);
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.p pVar = (org.telegram.ui.Wallet.p) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    pVar.run();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.i iVar = (org.telegram.ui.Wallet.i) obj;
                org.telegram.ui.Wallet.k0.E("emulate disable backup: ready");
                if (k0Var2.t() <= 0) {
                    iVar.run(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = k0Var2.f35094b;
                if (walletEngine2 == null) {
                    org.telegram.ui.Wallet.k0.i("emulate disable backup: no engine!");
                    iVar.run(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(k0Var2, iVar));
                return;
            case 5:
                MessagesController.getInstance(((org.telegram.ui.Wallet.d2) obj2).f34787a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                return;
            case 6:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new org.telegram.ui.Components.ja0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 7:
                ((org.telegram.ui.Wallet.m3) obj2).run(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 8:
                ((org.telegram.ui.Wallet.z4) obj2).D0.remove((org.telegram.ui.Wallet.l6) obj);
                return;
            case 9:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Utilities.Callback2) obj2).run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 10:
                org.telegram.ui.Wallet.i2[] i2VarArr = (org.telegram.ui.Wallet.i2[]) obj2;
                i2VarArr[0].setOnDismissListener(new org.telegram.ui.Wallet.t3((TLRPC.User) obj, 0));
                i2VarArr[0].dismiss();
                return;
            case 11:
                new org.telegram.ui.Components.ad(((org.telegram.ui.Wallet.i2[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.e6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
                return;
            case 12:
                org.telegram.ui.Wallet.i2[] i2VarArr2 = (org.telegram.ui.Wallet.i2[]) obj2;
                i2VarArr2[0].setOnDismissListener(new org.telegram.ui.Wallet.t3((TL_wallet.WalletTransactionPeer) obj, 1));
                i2VarArr2[0].dismiss();
                return;
            case 13:
                ((ViewGroup) obj).removeView(((org.telegram.ui.Wallet.u5) obj2).h);
                return;
            case 14:
                ((Utilities.Callback) obj2).run((TL_wallet.walletTransaction) obj);
                return;
            case 15:
                org.telegram.ui.Wallet.z6 z6Var = (org.telegram.ui.Wallet.z6) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if ((n2Var instanceof org.telegram.ui.Wallet.z4) && org.telegram.ui.Components.ad.a(n2Var)) {
                    org.telegram.ui.Components.ad.a0(n2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                z6Var.finishFragment();
                return;
            case 16:
                ((org.telegram.ui.Wallet.p0) obj).B();
                ((org.telegram.ui.Wallet.k7) obj2).f26290a.W2.N(true);
                return;
            case 17:
                org.telegram.ui.Wallet.k7 k7Var = (org.telegram.ui.Wallet.k7) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getParentActivity(), 0, k7Var.getResourceProvider());
                String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new ls0(24, k7Var, (org.telegram.ui.Wallet.k0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 18:
                ((org.telegram.ui.ActionBar.b2[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 19:
                ((ViewGroup) obj).removeView(((org.telegram.ui.Wallet.v8) obj2).h);
                return;
            case 20:
                fj1 fj1Var = (fj1) obj2;
                int[] iArr = (int[]) obj;
                fj1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    WallpapersListActivity wallpapersListActivity = fj1Var.f37622a;
                    int[][] iArr2 = WallpapersListActivity.f35759k0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 21:
                lj1 lj1Var = (lj1) obj2;
                String str = (String) obj;
                lj1Var.d.clear();
                lj1Var.f39610e.clear();
                lj1Var.f39611f = true;
                lj1Var.F(str, "", true);
                lj1Var.h = str;
                lj1Var.l();
                lj1Var.f39617y = null;
                return;
            case 22:
                lj1 lj1Var2 = (lj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = lj1Var2.E;
                MessagesController.getInstance(WallpapersListActivity.p0(wallpapersListActivity2)).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(WallpapersListActivity.q0(wallpapersListActivity2)).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = lj1Var2.f39616x;
                lj1Var2.f39616x = null;
                lj1Var2.F(str2, "", false);
                return;
            case 23:
                String str3 = (String) obj;
                rj1 rj1Var = ((qj1) obj2).f41135a;
                Activity parentActivity = rj1Var.getParentActivity();
                MessageObject messageObject = rj1Var.f41443n;
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
                    rj1Var.showDialog(org.telegram.ui.Components.mr0.O0(rj1Var.getParentActivity(), messageObject, null, false, rj1Var.h));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) obj2;
                ei.r rVar = b1Var2.f43249j0;
                rVar.f9320f = true;
                rVar.k();
                b1Var2.v((ai.ea) obj);
                return;
            case 25:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (b1Var = botWebViewContainer$BotWebViewProxy.f43211a) != null && (g0Var = b1Var.f43239c) != null) {
                    g0Var.f(arrayList);
                    return;
                }
                return;
            case 26:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.d1.f43287c.addAll(0, arrayList2);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    org.telegram.ui.web.d1.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.c1) longSparseArray.valueAt(i13));
                }
                org.telegram.ui.web.d1.f43286b = true;
                org.telegram.ui.web.d1.f43285a = false;
                ArrayList arrayList3 = org.telegram.ui.web.d1.f43288e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        ((Utilities.Callback) obj3).run(arrayList2);
                    }
                    org.telegram.ui.web.d1.f43288e = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.web.g1 g1Var = ((org.telegram.ui.web.f1) obj2).h;
                ArrayList arrayList4 = g1Var.f43305f;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                g1Var.h = false;
                org.telegram.ui.Components.e71 e71Var = g1Var.f26290a;
                if (e71Var != null) {
                    e71Var.W2.N(true);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                if (((org.telegram.ui.web.g2) obj).b() == null) {
                    z10 = false;
                }
                f1Var.setEnabled(z10);
                ViewPropertyAnimator animate = f1Var.animate();
                if (!f1Var.isEnabled()) {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
            default:
                ((l0) obj2).f43484f0.run((Integer) obj);
                return;
        }
    }
}
