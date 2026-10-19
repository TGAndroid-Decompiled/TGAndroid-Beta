package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
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
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.ci1;
import org.telegram.ui.en0;
import org.telegram.ui.ph1;
import org.telegram.ui.vh1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class z3 implements Runnable {
    public final int f35170a;
    public final Object f35171b;
    public final Object f35172c;

    public z3(int i10, Object obj, Object obj2) {
        this.f35170a = i10;
        this.f35171b = obj;
        this.f35172c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.a1 a1Var;
        org.telegram.ui.web.g0 g0Var;
        float f7;
        org.telegram.ui.web.z1 z1Var;
        int i10 = this.f35170a;
        boolean z10 = true;
        int i11 = 0;
        Object obj = this.f35172c;
        Object obj2 = this.f35171b;
        switch (i10) {
            case 0:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new ca0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Utilities.Callback2) obj2).run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 2:
                ((b4) obj2).run(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 3:
                ((o5) obj2).O0.remove((w6) obj);
                return;
            case 4:
                k2[] k2VarArr = (k2[]) obj2;
                k2VarArr[0].setOnDismissListener(new i4((TLRPC.User) obj, 0));
                k2VarArr[0].dismiss();
                return;
            case 5:
                new xc(((k2[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.d6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
                return;
            case 6:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                return;
            case 7:
                v5.e((v5) obj2, (Canvas) obj);
                return;
            case 8:
                v5.f((v5) obj2, (Canvas) obj);
                return;
            case 9:
                ((ViewGroup) obj).removeView(((e6) obj2).h);
                return;
            case 10:
                ((Utilities.Callback) obj2).run((TL_wallet.walletTransaction) obj);
                return;
            case 11:
                t7 t7Var = (t7) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!t7Var.f34908a1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    t7Var.d(cardVar);
                    return;
                }
                return;
            case 12:
                w7 w7Var = (w7) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if ((n2Var instanceof o5) && xc.a(n2Var)) {
                    xc.a0(n2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                w7Var.finishFragment();
                return;
            case 13:
                ((q0) obj).B();
                ((h8) obj2).f32027a.W2.N(true);
                return;
            case 14:
                h8 h8Var = (h8) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h8Var.getParentActivity(), 0, h8Var.getResourceProvider());
                String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new en0(28, h8Var, (m0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 15:
                ((org.telegram.ui.ActionBar.b2[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 16:
                ((ViewGroup) obj).removeView(((v9) obj2).h);
                return;
            case 17:
                ph1 ph1Var = (ph1) obj2;
                int[] iArr = (int[]) obj;
                ph1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    WallpapersListActivity wallpapersListActivity = ph1Var.f40239a;
                    int[][] iArr2 = WallpapersListActivity.f35198k0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 18:
                vh1 vh1Var = (vh1) obj2;
                String str = (String) obj;
                vh1Var.d.clear();
                vh1Var.e.clear();
                vh1Var.f42254f = true;
                vh1Var.F(str, "", true);
                vh1Var.h = str;
                vh1Var.l();
                vh1Var.f42260y = null;
                return;
            case 19:
                vh1 vh1Var2 = (vh1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = vh1Var2.E;
                MessagesController.getInstance(WallpapersListActivity.p0(wallpapersListActivity2)).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(WallpapersListActivity.q0(wallpapersListActivity2)).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = vh1Var2.f42259x;
                vh1Var2.f42259x = null;
                vh1Var2.F(str2, "", false);
                return;
            case 20:
                String str3 = (String) obj;
                ci1 ci1Var = ((bi1) obj2).f35663a;
                Activity parentActivity = ci1Var.getParentActivity();
                MessageObject messageObject = ci1Var.f36017n;
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
                    ci1Var.showDialog(er0.P0(ci1Var.getParentActivity(), messageObject, null, false, ci1Var.h));
                    return;
                }
                return;
            case 21:
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) obj2;
                gi.r rVar = a1Var2.f42567j0;
                rVar.f11415f = true;
                rVar.k();
                a1Var2.v((ci.z7) obj);
                return;
            case 22:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (a1Var = botWebViewContainer$BotWebViewProxy.f42543a) != null && (g0Var = a1Var.f42558c) != null) {
                    g0Var.f(arrayList);
                    return;
                }
                return;
            case 23:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.c1.f42608c.addAll(0, arrayList2);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    org.telegram.ui.web.c1.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.b1) longSparseArray.valueAt(i13));
                }
                org.telegram.ui.web.c1.f42607b = true;
                org.telegram.ui.web.c1.f42606a = false;
                ArrayList arrayList3 = org.telegram.ui.web.c1.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        ((Utilities.Callback) obj3).run(arrayList2);
                    }
                    org.telegram.ui.web.c1.e = null;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.f1 f1Var = ((org.telegram.ui.web.e1) obj2).f42620s;
                ArrayList arrayList4 = f1Var.f42626f;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                f1Var.h = false;
                v61 v61Var = f1Var.f32027a;
                if (v61Var != null) {
                    v61Var.W2.N(true);
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
                ((org.telegram.ui.n0) obj2).f42787f0.run((Integer) obj);
                return;
            case 27:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) obj2;
                x1Var.getMessagesController().removeWebBrowserException((String) obj);
                x1Var.f32027a.W2.N(true);
                return;
            case 28:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) obj2;
                TLObject tLObject = (TLObject) obj;
                int i14 = f2Var.f42631a;
                f2Var.f42635g = true;
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
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (z1Var = f2Var.f42639l) != null) {
                    z1Var.run();
                }
                f2Var.c();
                return;
            default:
                ((org.telegram.ui.web.f2) obj2).f42640m.remove((z3) obj);
                return;
        }
    }
}
