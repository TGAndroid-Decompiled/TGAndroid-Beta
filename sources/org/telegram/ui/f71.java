package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class f71 implements Runnable {
    public final int f36908a;
    public final Object f36909b;
    public final Object f36910c;
    public final Object d;

    public f71(Object obj, Object obj2, Object obj3, int i10) {
        this.f36908a = i10;
        this.f36910c = obj;
        this.f36909b = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f36908a;
        gn gnVar = null;
        gnVar = null;
        gnVar = null;
        boolean z10 = false;
        Object obj = this.d;
        Object obj2 = this.f36909b;
        Object obj3 = this.f36910c;
        switch (i11) {
            case 0:
                g71 g71Var = (g71) obj3;
                n9 n9Var = (n9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    g71Var.f37213c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new x40(28, g71Var, n9Var));
                    return;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new e71(g71Var, 1));
                    n9Var.run();
                    return;
                }
            case 1:
                oc1 oc1Var = (oc1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                oc1Var.f39844y = 0;
                String str2 = oc1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        oc1Var.a0(org.telegram.ui.ActionBar.h6.f21211p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        oc1Var.a0(org.telegram.ui.ActionBar.h6.f21342w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 2:
                oc1.W((oc1) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 3:
                yc1 yc1Var = (yc1) obj3;
                qn qnVar = (qn) obj2;
                MessageObject messageObject = yc1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f20421id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f37357a = messageObject;
                    obj4.f37358b = -1;
                    obj4.f37359c = -1;
                    obj4.f37361g = true;
                    obj4.d = i12;
                    obj4.f();
                    gnVar = obj4;
                }
                qnVar.Hb(messageObject, gnVar);
                yc1Var.c(false);
                return;
            case 4:
                gd1 gd1Var = (gd1) obj3;
                ArrayList arrayList = gd1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = gd1Var.f37287f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                gd1Var.d.l();
                if (gd1Var.f37284a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    gd1Var.f37293y = ofFloat;
                    ofFloat.addUpdateListener(new c11(gd1Var, 13));
                    gd1Var.f37293y.setDuration(100L);
                    gd1Var.f37293y.start();
                } else {
                    gd1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(gd1Var.I);
                if (gd1Var.F.getVisibility() == 0) {
                    gd1Var.F.animate().alpha(0.0f).setListener(new cd1(gd1Var, 2)).start();
                    return;
                }
                return;
            case 5:
                re1 re1Var = (re1) obj3;
                re1Var.f41183s.deleteTopics(re1Var.f41148a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 6:
                ne1 ne1Var = (ne1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = ne1Var.f39566d0;
                if (str3.equals(ne1Var.f39564b0)) {
                    int i13 = ne1Var.f39573k0;
                    ne1Var.f39577p0 = false;
                    ne1Var.f39574l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.n2) ne1Var.f39581t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        ne1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        ne1Var.m0 = z10;
                    } else {
                        ne1Var.m0 = false;
                    }
                    if (ne1Var.f39573k0 == 0) {
                        ne1Var.f39575n0.e(ne1Var.f39574l0, true);
                    }
                    ne1Var.f39576o0.b(i13);
                    return;
                }
                return;
            default:
                kg1 kg1Var = (kg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                hg.a2 a2Var = kg1Var.f38603f;
                if (kg1Var.f38604n) {
                    kg1Var.h = null;
                    kg1Var.d = arrayList4;
                    kg1Var.e = arrayList5;
                    a2Var.f(arrayList4, null);
                    if (kg1Var.f38604n && !a2Var.e()) {
                        kg1Var.v.f33958f.e(false, true);
                    }
                    kg1Var.l();
                    return;
                }
                return;
        }
    }
}
