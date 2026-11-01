package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class i41 implements Runnable {
    public final int f37937a;
    public final Object f37938b;
    public final Object f37939c;
    public final Object d;

    public i41(Object obj, Object obj2, Object obj3, int i10) {
        this.f37937a = i10;
        this.d = obj;
        this.f37938b = obj2;
        this.f37939c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f37937a;
        kn knVar = null;
        knVar = null;
        knVar = null;
        boolean z10 = false;
        Object obj = this.f37939c;
        Object obj2 = this.f37938b;
        Object obj3 = this.d;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((j41) obj3).f38273j0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.r0();
                    n41 n41Var = sessionsActivity.f34041a;
                    if (n41Var != null) {
                        n41Var.f();
                    }
                    sessionsActivity.p0(true);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((k41) obj3).f38650a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.r0();
                    n41 n41Var2 = sessionsActivity2.f34041a;
                    if (n41Var2 != null) {
                        n41Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                m41 m41Var = (m41) obj3;
                k9 k9Var = (k9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    m41Var.f39432c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new sl0(11, m41Var, k9Var));
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.e("Failed to pass qr code auth", e);
                    org.telegram.messenger.i0.g3(new l41(m41Var, 1));
                    k9Var.run();
                    return;
                }
            case 3:
                n91 n91Var = (n91) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                n91Var.f39785y = 0;
                String str2 = n91Var.D;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 != null && ("THEME_SLUG_INVALID".equals(tL_error3.text) || "THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        n91Var.f0(org.telegram.ui.ActionBar.t6.f21154p7, org.telegram.messenger.dd.L0(2131745523, null));
                        return;
                    } else {
                        n91Var.f0(org.telegram.ui.ActionBar.t6.f21278w6, org.telegram.messenger.dd.a0("SetUrlAvailable", null, 2131745525, str));
                        return;
                    }
                }
                return;
            case 4:
                n91.b0((n91) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 5:
                v91 v91Var = (v91) obj3;
                un unVar = (un) obj2;
                org.telegram.messenger.kj kjVar = v91Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f19941id;
                if (kjVar != null && (message = kjVar.f16690k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    org.telegram.messenger.kj.B0(message);
                    ?? obj4 = new Object();
                    obj4.f38931a = kjVar;
                    obj4.f38932b = -1;
                    obj4.f38933c = -1;
                    obj4.f38935g = true;
                    obj4.d = i12;
                    obj4.f();
                    knVar = obj4;
                }
                unVar.ac(kjVar, knVar);
                v91Var.c(false);
                return;
            case 6:
                ca1 ca1Var = (ca1) obj3;
                ArrayList arrayList = ca1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = ca1Var.f36273f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                ca1Var.d.f();
                if (ca1Var.f36270a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ca1Var.D = ofFloat;
                    ofFloat.addUpdateListener(new u01(ca1Var, 11));
                    ca1Var.D.setDuration(100L);
                    ca1Var.D.start();
                } else {
                    ca1Var.E = 1.0f;
                }
                org.telegram.messenger.i0.r(ca1Var.I);
                if (ca1Var.F.getVisibility() == 0) {
                    ca1Var.F.animate().alpha(0.0f).setListener(new y91(ca1Var, 2)).start();
                    return;
                }
                return;
            case 7:
                nb1 nb1Var = (nb1) obj3;
                nb1Var.f39835s.d((ArrayList) obj2, nb1Var.f39797a);
                ((Runnable) obj).run();
                return;
            case 8:
                jb1 jb1Var = (jb1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = jb1Var.f38341f0;
                if (str3.equals(jb1Var.f38339d0)) {
                    int i13 = jb1Var.m0;
                    jb1Var.f38352r0 = false;
                    jb1Var.f38348n0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.k2) jb1Var.f38356v0).currentAccount;
                            org.telegram.messenger.kj kjVar2 = new org.telegram.messenger.kj(i10, messages_messages.messages.get(i14), false, false);
                            kjVar2.J5(str3, true);
                            arrayList3.add(kjVar2);
                        }
                        jb1Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        jb1Var.f38349o0 = z10;
                    } else {
                        jb1Var.f38349o0 = false;
                    }
                    if (jb1Var.m0 == 0) {
                        jb1Var.f38350p0.e(jb1Var.f38348n0, true);
                    }
                    jb1Var.f38351q0.b(i13);
                    return;
                }
                return;
            default:
                dd1 dd1Var = (dd1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                zf.m1 m1Var = dd1Var.f36572f;
                if (dd1Var.f36573n) {
                    dd1Var.h = null;
                    dd1Var.d = arrayList4;
                    dd1Var.e = arrayList5;
                    m1Var.f(arrayList4, null);
                    if (dd1Var.f36573n && !m1Var.e()) {
                        dd1Var.f36576w.f34156f.e(false, true);
                    }
                    dd1Var.f();
                    return;
                }
                return;
        }
    }

    public i41(n91 n91Var, String str, TLRPC.TL_error tL_error) {
        this.f37937a = 3;
        this.d = n91Var;
        this.f37939c = str;
        this.f37938b = tL_error;
    }
}
