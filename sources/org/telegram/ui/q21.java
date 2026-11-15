package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class q21 implements Runnable {
    public final int f50440a;
    public final Object f50441b;
    public final Object f50442c;
    public final Object d;

    public q21(Object obj, Object obj2, Object obj3, int i7) {
        this.f50440a = i7;
        this.d = obj;
        this.f50441b = obj2;
        this.f50442c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i7;
        int i10 = this.f50440a;
        qm qmVar = null;
        qmVar = null;
        qmVar = null;
        boolean z10 = false;
        Object obj = this.f50442c;
        Object obj2 = this.f50441b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((r21) obj3).f50835k0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.f43330e.remove(tL_authorization);
                    sessionsActivity.r0();
                    v21 v21Var = sessionsActivity.f43327a;
                    if (v21Var != null) {
                        v21Var.f();
                    }
                    sessionsActivity.p0(true);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((s21) obj3).f51078a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.f43330e.remove(tL_authorization2);
                    sessionsActivity2.r0();
                    v21 v21Var2 = sessionsActivity2.f43327a;
                    if (v21Var2 != null) {
                        v21Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                u21 u21Var = (u21) obj3;
                j9 j9Var = (j9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    u21Var.f51728c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new b00(29, u21Var, j9Var));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.e("Failed to pass qr code auth", e10);
                    org.telegram.messenger.g0.h3(new t21(u21Var, 1));
                    j9Var.run();
                    return;
                }
            case 3:
                w71 w71Var = (w71) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                w71Var.f52492y = 0;
                String str2 = w71Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 != null && ("THEME_SLUG_INVALID".equals(tL_error3.text) || "THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        w71Var.f0(org.telegram.ui.ActionBar.j6.f29070p7, org.telegram.messenger.hd.M0(2131745506, null));
                        return;
                    } else {
                        w71Var.f0(org.telegram.ui.ActionBar.j6.f29203w6, org.telegram.messenger.hd.a0("SetUrlAvailable", null, 2131745508, str));
                        return;
                    }
                }
                return;
            case 4:
                w71.b0((w71) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 5:
                e81 e81Var = (e81) obj3;
                an anVar = (an) obj2;
                org.telegram.messenger.gj gjVar = e81Var.H;
                int i11 = ((TLRPC.TodoItem) obj).f28198id;
                if (gjVar != null && (message = gjVar.f23819k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    org.telegram.messenger.gj.B0(message);
                    ?? obj4 = new Object();
                    obj4.f50647a = gjVar;
                    obj4.f50648b = -1;
                    obj4.f50649c = -1;
                    obj4.f50652g = true;
                    obj4.d = i11;
                    obj4.f();
                    qmVar = obj4;
                }
                anVar.jc(gjVar, qmVar);
                e81Var.c(false);
                return;
            case 6:
                l81 l81Var = (l81) obj3;
                ArrayList arrayList = l81Var.h;
                arrayList.clear();
                ArrayList arrayList2 = l81Var.f48895f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                l81Var.d.f();
                if (l81Var.f48891a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    l81Var.E = ofFloat;
                    ofFloat.addUpdateListener(new ez0(l81Var, 11));
                    l81Var.E.setDuration(100L);
                    l81Var.E.start();
                } else {
                    l81Var.F = 1.0f;
                }
                org.telegram.messenger.g0.r(l81Var.J);
                if (l81Var.G.getVisibility() == 0) {
                    l81Var.G.animate().alpha(0.0f).setListener(new h81(l81Var, 2)).start();
                    return;
                }
                return;
            case 7:
                u91 u91Var = (u91) obj3;
                u91Var.f51874s.d((ArrayList) obj2, u91Var.f51835a);
                ((Runnable) obj).run();
                return;
            case 8:
                q91 q91Var = (q91) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = q91Var.f50515g0;
                if (str3.equals(q91Var.f50513e0)) {
                    int i12 = q91Var.f50521n0;
                    q91Var.f50526s0 = false;
                    q91Var.f50522o0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                            i7 = ((org.telegram.ui.ActionBar.e2) q91Var.f50530w0).currentAccount;
                            org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(i7, messages_messages.messages.get(i13), false, false);
                            gjVar2.K5(str3, true);
                            arrayList3.add(gjVar2);
                        }
                        q91Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        q91Var.f50523p0 = z10;
                    } else {
                        q91Var.f50523p0 = false;
                    }
                    if (q91Var.f50521n0 == 0) {
                        q91Var.f50524q0.e(q91Var.f50522o0, true);
                    }
                    q91Var.f50525r0.b(i12);
                    return;
                }
                return;
            default:
                ib1 ib1Var = (ib1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                jg.z1 z1Var = ib1Var.f48011f;
                if (ib1Var.f48012n) {
                    ib1Var.h = null;
                    ib1Var.d = arrayList4;
                    ib1Var.f48010e = arrayList5;
                    z1Var.f(arrayList4, null);
                    if (ib1Var.f48012n && !z1Var.e()) {
                        ib1Var.f48015w.f43452f.e(false, true);
                    }
                    ib1Var.f();
                    return;
                }
                return;
        }
    }

    public q21(w71 w71Var, String str, TLRPC.TL_error tL_error) {
        this.f50440a = 3;
        this.d = w71Var;
        this.f50442c = str;
        this.f50441b = tL_error;
    }
}
