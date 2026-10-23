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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ci1;
import org.telegram.ui.ji1;
import org.telegram.ui.ki1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.wh1;
public final class y3 implements Runnable {
    public final int f35441a;
    public final Object f35442b;
    public final Object f35443c;

    public y3(int i10, Object obj, Object obj2) {
        this.f35441a = i10;
        this.f35442b = obj;
        this.f35443c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.b1 b1Var;
        org.telegram.ui.web.h0 h0Var;
        float f7;
        org.telegram.ui.web.a2 a2Var;
        int i10 = this.f35441a;
        boolean z10 = true;
        int i11 = 0;
        Object obj = this.f35443c;
        Object obj2 = this.f35442b;
        switch (i10) {
            case 0:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new da0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
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
                ((ci.s) obj2).run(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 3:
                ((o5) obj2).O0.remove((w6) obj);
                return;
            case 4:
                j2[] j2VarArr = (j2[]) obj2;
                j2VarArr[0].setOnDismissListener(new g4((TLRPC.User) obj, 0));
                j2VarArr[0].dismiss();
                return;
            case 5:
                new xc(((j2[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.g6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
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
                if (!t7Var.f35220a1 && userFull != null) {
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
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if ((o2Var instanceof o5) && xc.a(o2Var)) {
                    xc.a0(o2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                w7Var.finishFragment();
                return;
            case 13:
                ((p0) obj).B();
                ((i8) obj2).f25907a.Z2.N(true);
                return;
            case 14:
                i8 i8Var = (i8) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i8Var.getParentActivity(), 0, i8Var.getResourceProvider());
                String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new e8(0, i8Var, (l0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 15:
                ((org.telegram.ui.ActionBar.c2[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 16:
                ((ViewGroup) obj).removeView(((w9) obj2).h);
                return;
            case 17:
                wh1 wh1Var = (wh1) obj2;
                int[] iArr = (int[]) obj;
                wh1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    WallpapersListActivity wallpapersListActivity = wh1Var.f43378a;
                    int[][] iArr2 = WallpapersListActivity.f35515k0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 18:
                ci1 ci1Var = (ci1) obj2;
                String str = (String) obj;
                ci1Var.d.clear();
                ci1Var.e.clear();
                ci1Var.f36373f = true;
                ci1Var.F(str, "", true);
                ci1Var.h = str;
                ci1Var.l();
                ci1Var.f36379y = null;
                return;
            case 19:
                ci1 ci1Var2 = (ci1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = ci1Var2.E;
                MessagesController.getInstance(WallpapersListActivity.p0(wallpapersListActivity2)).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(WallpapersListActivity.q0(wallpapersListActivity2)).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = ci1Var2.f36378x;
                ci1Var2.f36378x = null;
                ci1Var2.F(str2, "", false);
                return;
            case 20:
                String str3 = (String) obj;
                ki1 ki1Var = ((ji1) obj2).f38590a;
                Activity parentActivity = ki1Var.getParentActivity();
                MessageObject messageObject = ki1Var.f38960n;
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
                    ki1Var.showDialog(ir0.S0(ki1Var.getParentActivity(), messageObject, null, false, ki1Var.h));
                    return;
                }
                return;
            case 21:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) obj2;
                gi.r rVar = b1Var2.f43056j0;
                rVar.f11439f = true;
                rVar.k();
                b1Var2.v((ci.y7) obj);
                return;
            case 22:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (b1Var = botWebViewContainer$BotWebViewProxy.f43023a) != null && (h0Var = b1Var.f43047c) != null) {
                    h0Var.f(arrayList);
                    return;
                }
                return;
            case 23:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.d1.f43094c.addAll(0, arrayList2);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    org.telegram.ui.web.d1.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.c1) longSparseArray.valueAt(i13));
                }
                org.telegram.ui.web.d1.f43093b = true;
                org.telegram.ui.web.d1.f43092a = false;
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
            case 24:
                org.telegram.ui.web.g1 g1Var = ((org.telegram.ui.web.f1) obj2).f43110s;
                ArrayList arrayList4 = g1Var.f43116f;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                g1Var.h = false;
                d71 d71Var = g1Var.f25907a;
                if (d71Var != null) {
                    d71Var.Z2.N(true);
                    return;
                }
                return;
            case 25:
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
            case 26:
                ((org.telegram.ui.m0) obj2).f43277f0.run((Integer) obj);
                return;
            case 27:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj2;
                y1Var.getMessagesController().removeWebBrowserException((String) obj);
                y1Var.f25907a.Z2.N(true);
                return;
            case 28:
                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) obj2;
                TLObject tLObject = (TLObject) obj;
                int i14 = g2Var.f43121a;
                g2Var.f43125g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i14).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i14).putChats(tL_messages_webPage.chats, false);
                    g2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            g2Var.h = tL_webPage;
                        }
                    }
                    g2Var.h = null;
                }
                TLRPC.WebPage webPage = g2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    g2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && g2Var.h != null && (a2Var = g2Var.f43129l) != null) {
                    a2Var.run();
                }
                g2Var.c();
                return;
            default:
                ((org.telegram.ui.web.g2) obj2).f43130m.remove((y3) obj);
                return;
        }
    }
}
