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
import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.di1;
import org.telegram.ui.ei1;
import org.telegram.ui.gn0;
import org.telegram.ui.i01;
import org.telegram.ui.rh1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.xh1;
public final class v3 implements Runnable {
    public final int f34991a;
    public final Object f34992b;
    public final Object f34993c;

    public v3(int i10, Object obj, Object obj2) {
        this.f34991a = i10;
        this.f34992b = obj;
        this.f34993c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.b1 b1Var;
        org.telegram.ui.web.h0 h0Var;
        float f7;
        org.telegram.ui.web.a2 a2Var;
        int i10 = this.f34991a;
        boolean z10 = true;
        int i11 = 0;
        Object obj = this.f34993c;
        Object obj2 = this.f34992b;
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
                ((x3) obj2).run(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 2:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Utilities.Callback2) obj2).run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 3:
                ((n5) obj2).M0.remove((w6) obj);
                return;
            case 4:
                k2[] k2VarArr = (k2[]) obj2;
                k2VarArr[0].setOnDismissListener(new h4((TLRPC.User) obj, 0));
                k2VarArr[0].dismiss();
                return;
            case 5:
                new xc(((k2[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.d6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
                return;
            case 6:
                i01 i01Var = (i01) obj;
                if (((boolean[]) obj2)[0]) {
                    i01Var.run();
                    return;
                }
                return;
            case 7:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                return;
            case 8:
                v5.e((v5) obj2, (Canvas) obj);
                return;
            case 9:
                v5.f((v5) obj2, (Canvas) obj);
                return;
            case 10:
                ((ViewGroup) obj).removeView(((e6) obj2).h);
                return;
            case 11:
                ((Utilities.Callback) obj2).run((TL_wallet.walletTransaction) obj);
                return;
            case 12:
                t7 t7Var = (t7) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!t7Var.f34894a1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    t7Var.d(cardVar);
                    return;
                }
                return;
            case 13:
                w7 w7Var = (w7) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if ((n2Var instanceof n5) && xc.a(n2Var)) {
                    xc.a0(n2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                w7Var.finishFragment();
                return;
            case 14:
                ((q0) obj).B();
                ((h8) obj2).f31190a.W2.N(true);
                return;
            case 15:
                h8 h8Var = (h8) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h8Var.getParentActivity(), 0, h8Var.getResourceProvider());
                String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new gn0(28, h8Var, (m0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 16:
                ((org.telegram.ui.ActionBar.b2[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 17:
                ((ViewGroup) obj).removeView(((v9) obj2).h);
                return;
            case 18:
                rh1 rh1Var = (rh1) obj2;
                int[] iArr = (int[]) obj;
                rh1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    WallpapersListActivity wallpapersListActivity = rh1Var.f40737a;
                    int[][] iArr2 = WallpapersListActivity.f35195k0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 19:
                xh1 xh1Var = (xh1) obj2;
                String str = (String) obj;
                xh1Var.d.clear();
                xh1Var.e.clear();
                xh1Var.f43125f = true;
                xh1Var.F(str, "", true);
                xh1Var.h = str;
                xh1Var.l();
                xh1Var.f43131y = null;
                return;
            case 20:
                xh1 xh1Var2 = (xh1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = xh1Var2.E;
                MessagesController.getInstance(WallpapersListActivity.p0(wallpapersListActivity2)).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(WallpapersListActivity.q0(wallpapersListActivity2)).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = xh1Var2.f43130x;
                xh1Var2.f43130x = null;
                xh1Var2.F(str2, "", false);
                return;
            case 21:
                String str3 = (String) obj;
                ei1 ei1Var = ((di1) obj2).f36210a;
                Activity parentActivity = ei1Var.getParentActivity();
                MessageObject messageObject = ei1Var.f36542n;
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
                    ei1Var.showDialog(dr0.O0(ei1Var.getParentActivity(), messageObject, null, false, ei1Var.h));
                    return;
                }
                return;
            case 22:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) obj2;
                gi.r rVar = b1Var2.f42532j0;
                rVar.f11414f = true;
                rVar.k();
                b1Var2.v((ci.y7) obj);
                return;
            case 23:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (b1Var = botWebViewContainer$BotWebViewProxy.f42500a) != null && (h0Var = b1Var.f42523c) != null) {
                    h0Var.f(arrayList);
                    return;
                }
                return;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.d1.f42573c.addAll(0, arrayList2);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    org.telegram.ui.web.d1.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.c1) longSparseArray.valueAt(i13));
                }
                org.telegram.ui.web.d1.f42572b = true;
                org.telegram.ui.web.d1.f42571a = false;
                ArrayList arrayList3 = org.telegram.ui.web.d1.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        ((Utilities.Callback) obj3).run(arrayList2);
                    }
                    org.telegram.ui.web.d1.e = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.web.g1 g1Var = ((org.telegram.ui.web.f1) obj2).f42585s;
                ArrayList arrayList4 = g1Var.f42591f;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                g1Var.h = false;
                u61 u61Var = g1Var.f31190a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
                    return;
                }
                return;
            case 26:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) obj2;
                if (((org.telegram.ui.web.h2) obj).b() == null) {
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
            case 27:
                ((org.telegram.ui.n0) obj2).f42755f0.run((Integer) obj);
                return;
            case 28:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj2;
                y1Var.getMessagesController().removeWebBrowserException((String) obj);
                y1Var.f31190a.W2.N(true);
                return;
            default:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) obj2;
                TLObject tLObject = (TLObject) obj;
                int i14 = h2Var.f42603a;
                h2Var.f42607g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i14).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i14).putChats(tL_messages_webPage.chats, false);
                    h2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            h2Var.h = tL_webPage;
                        }
                    }
                    h2Var.h = null;
                }
                TLRPC.WebPage webPage = h2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    h2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && h2Var.h != null && (a2Var = h2Var.f42611l) != null) {
                    a2Var.run();
                }
                h2Var.c();
                return;
        }
    }
}
