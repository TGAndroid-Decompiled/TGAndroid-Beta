package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class k41 implements Runnable {
    public final int f38681a;
    public final Object f38682b;
    public final Object f38683c;
    public final Object d;

    public k41(Object obj, Object obj2, Object obj3, int i10) {
        this.f38681a = i10;
        this.d = obj;
        this.f38682b = obj2;
        this.f38683c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f38681a;
        kn knVar = null;
        knVar = null;
        knVar = null;
        boolean z10 = false;
        Object obj = this.f38683c;
        Object obj2 = this.f38682b;
        Object obj3 = this.d;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((l41) obj3).f39054j0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.q0();
                    p41 p41Var = sessionsActivity.f34034a;
                    if (p41Var != null) {
                        p41Var.f();
                    }
                    sessionsActivity.o0(true);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((m41) obj3).f39474a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.q0();
                    p41 p41Var2 = sessionsActivity2.f34034a;
                    if (p41Var2 != null) {
                        p41Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                o41 o41Var = (o41) obj3;
                k9 k9Var = (k9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    o41Var.f40140c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new ul0(11, o41Var, k9Var));
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.e("Failed to pass qr code auth", e);
                    org.telegram.messenger.i0.g3(new n41(o41Var, 1));
                    k9Var.run();
                    return;
                }
            case 3:
                p91 p91Var = (p91) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                p91Var.f40551y = 0;
                String str2 = p91Var.D;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 != null && ("THEME_SLUG_INVALID".equals(tL_error3.text) || "THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        p91Var.e0(org.telegram.ui.ActionBar.t6.f21153p7, org.telegram.messenger.cd.L0(2131745523, null));
                        return;
                    } else {
                        p91Var.e0(org.telegram.ui.ActionBar.t6.f21277w6, org.telegram.messenger.cd.a0("SetUrlAvailable", null, 2131745525, str));
                        return;
                    }
                }
                return;
            case 4:
                p91.a0((p91) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 5:
                x91 x91Var = (x91) obj3;
                un unVar = (un) obj2;
                org.telegram.messenger.jj jjVar = x91Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f19940id;
                if (jjVar != null && (message = jjVar.f16337k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    org.telegram.messenger.jj.B0(message);
                    ?? obj4 = new Object();
                    obj4.f38905a = jjVar;
                    obj4.f38906b = -1;
                    obj4.f38907c = -1;
                    obj4.f38909g = true;
                    obj4.d = i12;
                    obj4.f();
                    knVar = obj4;
                }
                unVar.Vb(jjVar, knVar);
                x91Var.c(false);
                return;
            case 6:
                ea1 ea1Var = (ea1) obj3;
                ArrayList arrayList = ea1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = ea1Var.f37002f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                ea1Var.d.f();
                if (ea1Var.f36999a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ea1Var.D = ofFloat;
                    ofFloat.addUpdateListener(new u01(ea1Var, 11));
                    ea1Var.D.setDuration(100L);
                    ea1Var.D.start();
                } else {
                    ea1Var.E = 1.0f;
                }
                org.telegram.messenger.i0.r(ea1Var.I);
                if (ea1Var.F.getVisibility() == 0) {
                    ea1Var.F.animate().alpha(0.0f).setListener(new aa1(ea1Var, 2)).start();
                    return;
                }
                return;
            case 7:
                pb1 pb1Var = (pb1) obj3;
                pb1Var.f40604s.d((ArrayList) obj2, pb1Var.f40566a);
                ((Runnable) obj).run();
                return;
            case 8:
                lb1 lb1Var = (lb1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = lb1Var.f39154f0;
                if (str3.equals(lb1Var.f39152d0)) {
                    int i13 = lb1Var.m0;
                    lb1Var.f39165r0 = false;
                    lb1Var.f39161n0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.k2) lb1Var.f39169v0).currentAccount;
                            org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(i10, messages_messages.messages.get(i14), false, false);
                            jjVar2.J5(str3, true);
                            arrayList3.add(jjVar2);
                        }
                        lb1Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        lb1Var.f39162o0 = z10;
                    } else {
                        lb1Var.f39162o0 = false;
                    }
                    if (lb1Var.m0 == 0) {
                        lb1Var.f39163p0.e(lb1Var.f39161n0, true);
                    }
                    lb1Var.f39164q0.b(i13);
                    return;
                }
                return;
            default:
                fd1 fd1Var = (fd1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                zf.m1 m1Var = fd1Var.f37235f;
                if (fd1Var.f37236n) {
                    fd1Var.h = null;
                    fd1Var.d = arrayList4;
                    fd1Var.e = arrayList5;
                    m1Var.f(arrayList4, null);
                    if (fd1Var.f37236n && !m1Var.e()) {
                        fd1Var.f37239w.f34149f.e(false, true);
                    }
                    fd1Var.f();
                    return;
                }
                return;
        }
    }

    public k41(p91 p91Var, String str, TLRPC.TL_error tL_error) {
        this.f38681a = 3;
        this.d = p91Var;
        this.f38683c = str;
        this.f38682b = tL_error;
    }
}
