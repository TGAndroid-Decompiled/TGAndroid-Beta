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
import org.telegram.ui.fr0;
import org.telegram.ui.rh1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.xh1;
public final class t3 implements Runnable {
    public final int f34894a;
    public final Object f34895b;
    public final Object f34896c;

    public t3(int i10, Object obj, Object obj2) {
        this.f34894a = i10;
        this.f34895b = obj;
        this.f34896c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.a1 a1Var;
        org.telegram.ui.web.g0 g0Var;
        float f7;
        org.telegram.ui.web.z1 z1Var;
        int i10 = this.f34894a;
        boolean z10 = true;
        int i11 = 0;
        Object obj = this.f34896c;
        Object obj2 = this.f34895b;
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
                ((v3) obj2).run(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 2:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Utilities.Callback2) obj2).run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 3:
                ((l5) obj2).O0.remove((z6) obj);
                return;
            case 4:
                k2[] k2VarArr = (k2[]) obj2;
                k2VarArr[0].setOnDismissListener(new f4((TLRPC.User) obj, 0));
                k2VarArr[0].dismiss();
                return;
            case 5:
                new xc(((k2[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.d6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
                return;
            case 6:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                return;
            case 7:
                t5.e((t5) obj2, (Canvas) obj);
                return;
            case 8:
                t5.f((t5) obj2, (Canvas) obj);
                return;
            case 9:
                ((ViewGroup) obj).removeView(((h6) obj2).h);
                return;
            case 10:
                ((Utilities.Callback) obj2).run((TL_wallet.walletTransaction) obj);
                return;
            case 11:
                w7 w7Var = (w7) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!w7Var.V0 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    w7Var.d(cardVar);
                    return;
                }
                return;
            case 12:
                z7 z7Var = (z7) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if ((n2Var instanceof l5) && xc.a(n2Var)) {
                    xc.a0(n2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                z7Var.finishFragment();
                return;
            case 13:
                ((q0) obj).B();
                ((k8) obj2).f31190a.W2.N(true);
                return;
            case 14:
                k8 k8Var = (k8) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k8Var.getParentActivity(), 0, k8Var.getResourceProvider());
                String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new fr0(27, k8Var, (m0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 15:
                ((org.telegram.ui.ActionBar.b2[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 16:
                ((ViewGroup) obj).removeView(((x9) obj2).h);
                return;
            case 17:
                rh1 rh1Var = (rh1) obj2;
                int[] iArr = (int[]) obj;
                rh1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    WallpapersListActivity wallpapersListActivity = rh1Var.f40748a;
                    int[][] iArr2 = WallpapersListActivity.f35223k0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 18:
                xh1 xh1Var = (xh1) obj2;
                String str = (String) obj;
                xh1Var.d.clear();
                xh1Var.e.clear();
                xh1Var.f43143f = true;
                xh1Var.F(str, "", true);
                xh1Var.h = str;
                xh1Var.l();
                xh1Var.f43149y = null;
                return;
            case 19:
                xh1 xh1Var2 = (xh1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = xh1Var2.E;
                MessagesController.getInstance(WallpapersListActivity.p0(wallpapersListActivity2)).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(WallpapersListActivity.q0(wallpapersListActivity2)).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = xh1Var2.f43148x;
                xh1Var2.f43148x = null;
                xh1Var2.F(str2, "", false);
                return;
            case 20:
                String str3 = (String) obj;
                ei1 ei1Var = ((di1) obj2).f36206a;
                Activity parentActivity = ei1Var.getParentActivity();
                MessageObject messageObject = ei1Var.f36554n;
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
            case 21:
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) obj2;
                gi.r rVar = a1Var2.f42527j0;
                rVar.f11414f = true;
                rVar.k();
                a1Var2.v((ci.z7) obj);
                return;
            case 22:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (a1Var = botWebViewContainer$BotWebViewProxy.f42503a) != null && (g0Var = a1Var.f42518c) != null) {
                    g0Var.f(arrayList);
                    return;
                }
                return;
            case 23:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.c1.f42567c.addAll(0, arrayList2);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    org.telegram.ui.web.c1.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.b1) longSparseArray.valueAt(i13));
                }
                org.telegram.ui.web.c1.f42566b = true;
                org.telegram.ui.web.c1.f42565a = false;
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
                org.telegram.ui.web.f1 f1Var = ((org.telegram.ui.web.e1) obj2).f42579s;
                ArrayList arrayList4 = f1Var.f42585f;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                f1Var.h = false;
                u61 u61Var = f1Var.f31190a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
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
                ((org.telegram.ui.n0) obj2).f42746f0.run((Integer) obj);
                return;
            case 27:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) obj2;
                x1Var.getMessagesController().removeWebBrowserException((String) obj);
                x1Var.f31190a.W2.N(true);
                return;
            case 28:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) obj2;
                TLObject tLObject = (TLObject) obj;
                int i14 = f2Var.f42590a;
                f2Var.f42594g = true;
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
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (z1Var = f2Var.f42598l) != null) {
                    z1Var.run();
                }
                f2Var.c();
                return;
            default:
                ((org.telegram.ui.web.f2) obj2).f42599m.remove((t3) obj);
                return;
        }
    }
}
