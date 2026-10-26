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
public final class h71 implements Runnable {
    public final int f39929a;
    public final Object f39930b;
    public final Object f39931c;
    public final Object d;

    public h71(Object obj, Object obj2, Object obj3, int i10) {
        this.f39929a = i10;
        this.d = obj;
        this.f39930b = obj2;
        this.f39931c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f39929a;
        kn knVar = null;
        knVar = null;
        knVar = null;
        boolean z10 = false;
        Object obj = this.f39931c;
        Object obj2 = this.f39930b;
        Object obj3 = this.d;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((i71) obj3).f40167j0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.n0();
                    n71 n71Var = sessionsActivity.f36211a;
                    if (n71Var != null) {
                        n71Var.l();
                    }
                    sessionsActivity.l0(true);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((j71) obj3).f40477a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.n0();
                    n71 n71Var2 = sessionsActivity2.f36211a;
                    if (n71Var2 != null) {
                        n71Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                m71 m71Var = (m71) obj3;
                p9 p9Var = (p9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    m71Var.f41487c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new l71(0, m71Var, p9Var));
                    return;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new k71(m71Var, 1));
                    p9Var.run();
                    return;
                }
            case 3:
                xc1 xc1Var = (xc1) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                xc1Var.f45734x = 0;
                String str2 = xc1Var.f45735y;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 != null && ("THEME_SLUG_INVALID".equals(tL_error3.text) || "THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        xc1Var.b0(org.telegram.ui.ActionBar.y6.f23581p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        xc1Var.b0(org.telegram.ui.ActionBar.y6.f23711w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 4:
                xc1.X((xc1) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 5:
                id1 id1Var = (id1) obj3;
                un unVar = (un) obj2;
                MessageObject messageObject = id1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f22174id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f40979a = messageObject;
                    obj4.f40980b = -1;
                    obj4.f40981c = -1;
                    obj4.f40983g = true;
                    obj4.d = i12;
                    obj4.f();
                    knVar = obj4;
                }
                unVar.Ob(messageObject, knVar);
                id1Var.c(false);
                return;
            case 6:
                pd1 pd1Var = (pd1) obj3;
                ArrayList arrayList = pd1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = pd1Var.f42474f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                pd1Var.d.l();
                if (pd1Var.f42471a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pd1Var.f42480y = ofFloat;
                    ofFloat.addUpdateListener(new v11(pd1Var, 12));
                    pd1Var.f42480y.setDuration(100L);
                    pd1Var.f42480y.start();
                } else {
                    pd1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(pd1Var.I);
                if (pd1Var.F.getVisibility() == 0) {
                    pd1Var.F.animate().alpha(0.0f).setListener(new ld1(pd1Var, 2)).start();
                    return;
                }
                return;
            case 7:
                af1 af1Var = (af1) obj3;
                af1Var.f37772s.deleteTopics(af1Var.f37734a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 8:
                we1 we1Var = (we1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = we1Var.f45127f0;
                if (str3.equals(we1Var.f45125d0)) {
                    int i13 = we1Var.m0;
                    we1Var.f45138r0 = false;
                    we1Var.f45134n0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.r2) we1Var.f45142v0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        we1Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        we1Var.f45135o0 = z10;
                    } else {
                        we1Var.f45135o0 = false;
                    }
                    if (we1Var.m0 == 0) {
                        we1Var.f45136p0.e(we1Var.f45134n0, true);
                    }
                    we1Var.f45137q0.b(i13);
                    return;
                }
                return;
            default:
                qg1 qg1Var = (qg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                ig.a2 a2Var = qg1Var.f42836f;
                if (qg1Var.f42837n) {
                    qg1Var.h = null;
                    qg1Var.d = arrayList4;
                    qg1Var.e = arrayList5;
                    a2Var.f(arrayList4, null);
                    if (qg1Var.f42837n && !a2Var.e()) {
                        qg1Var.v.f36325f.e(false, true);
                    }
                    qg1Var.l();
                    return;
                }
                return;
        }
    }

    public h71(xc1 xc1Var, String str, TLRPC.TL_error tL_error) {
        this.f39929a = 3;
        this.d = xc1Var;
        this.f39931c = str;
        this.f39930b = tL_error;
    }
}
