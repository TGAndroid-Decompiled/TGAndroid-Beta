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
public final class g71 implements Runnable {
    public final int f37474a;
    public final Object f37475b;
    public final Object f37476c;
    public final Object d;

    public g71(Object obj, Object obj2, Object obj3, int i10) {
        this.f37474a = i10;
        this.f37475b = obj;
        this.f37476c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f37474a;
        in inVar = null;
        inVar = null;
        inVar = null;
        boolean z10 = false;
        Object obj = this.d;
        Object obj2 = this.f37476c;
        Object obj3 = this.f37475b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((h71) obj3).f37774a;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.m0();
                    k71 k71Var = sessionsActivity.f34147a;
                    if (k71Var != null) {
                        k71Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                j71 j71Var = (j71) obj3;
                n9 n9Var = (n9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    j71Var.f38487c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new a50(28, j71Var, n9Var));
                    return;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new i71(j71Var, 1));
                    n9Var.run();
                    return;
                }
            case 2:
                tc1 tc1Var = (tc1) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                tc1Var.f42003x = 0;
                String str2 = tc1Var.f42004y;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error2 != null && ("THEME_SLUG_INVALID".equals(tL_error2.text) || "THEME_SLUG_OCCUPIED".equals(tL_error2.text))) {
                        tc1Var.a0(org.telegram.ui.ActionBar.k6.f21405p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        tc1Var.a0(org.telegram.ui.ActionBar.k6.f21536w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 3:
                tc1.W((tc1) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 4:
                dd1 dd1Var = (dd1) obj3;
                sn snVar = (sn) obj2;
                MessageObject messageObject = dd1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f20489id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f38332a = messageObject;
                    obj4.f38333b = -1;
                    obj4.f38334c = -1;
                    obj4.f38336g = true;
                    obj4.d = i12;
                    obj4.f();
                    inVar = obj4;
                }
                snVar.Ib(messageObject, inVar);
                dd1Var.c(false);
                return;
            case 5:
                ld1 ld1Var = (ld1) obj3;
                ArrayList arrayList = ld1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = ld1Var.f39205f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                ld1Var.d.l();
                if (ld1Var.f39202a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ld1Var.f39211y = ofFloat;
                    ofFloat.addUpdateListener(new f11(ld1Var, 13));
                    ld1Var.f39211y.setDuration(100L);
                    ld1Var.f39211y.start();
                } else {
                    ld1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(ld1Var.I);
                if (ld1Var.F.getVisibility() == 0) {
                    ld1Var.F.animate().alpha(0.0f).setListener(new hd1(ld1Var, 2)).start();
                    return;
                }
                return;
            case 6:
                xe1 xe1Var = (xe1) obj3;
                xe1Var.f43583s.deleteTopics(xe1Var.f43545a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 7:
                se1 se1Var = (se1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = se1Var.f41369d0;
                if (str3.equals(se1Var.f41367b0)) {
                    int i13 = se1Var.f41376k0;
                    se1Var.f41380p0 = false;
                    se1Var.f41377l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.o2) se1Var.f41384t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        se1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        se1Var.m0 = z10;
                    } else {
                        se1Var.m0 = false;
                    }
                    if (se1Var.f41376k0 == 0) {
                        se1Var.f41378n0.e(se1Var.f41377l0, true);
                    }
                    se1Var.f41379o0.b(i13);
                    return;
                }
                return;
            default:
                pg1 pg1Var = (pg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                hg.a2 a2Var = pg1Var.f40536f;
                if (pg1Var.f40537n) {
                    pg1Var.h = null;
                    pg1Var.d = arrayList4;
                    pg1Var.e = arrayList5;
                    a2Var.f(arrayList4, null);
                    if (pg1Var.f40537n && !a2Var.e()) {
                        pg1Var.v.f34262f.e(false, true);
                    }
                    pg1Var.l();
                    return;
                }
                return;
        }
    }

    public g71(tc1 tc1Var, String str, TLRPC.TL_error tL_error) {
        this.f37474a = 2;
        this.f37475b = tc1Var;
        this.d = str;
        this.f37476c = tL_error;
    }
}
