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
    public final int f37769a;
    public final Object f37770b;
    public final Object f37771c;
    public final Object d;

    public h71(Object obj, Object obj2, Object obj3, int i10) {
        this.f37769a = i10;
        this.f37770b = obj;
        this.f37771c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f37769a;
        in inVar = null;
        inVar = null;
        inVar = null;
        boolean z10 = false;
        Object obj = this.d;
        Object obj2 = this.f37771c;
        Object obj3 = this.f37770b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((i71) obj3).f38084a;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.m0();
                    l71 l71Var = sessionsActivity.f34145a;
                    if (l71Var != null) {
                        l71Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                k71 k71Var = (k71) obj3;
                n9 n9Var = (n9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    k71Var.f38845c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new a50(28, k71Var, n9Var));
                    return;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new j71(k71Var, 1));
                    n9Var.run();
                    return;
                }
            case 2:
                uc1 uc1Var = (uc1) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                uc1Var.f42382x = 0;
                String str2 = uc1Var.f42383y;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error2 != null && ("THEME_SLUG_INVALID".equals(tL_error2.text) || "THEME_SLUG_OCCUPIED".equals(tL_error2.text))) {
                        uc1Var.a0(org.telegram.ui.ActionBar.k6.f21404p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        uc1Var.a0(org.telegram.ui.ActionBar.k6.f21535w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 3:
                uc1.W((uc1) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 4:
                ed1 ed1Var = (ed1) obj3;
                sn snVar = (sn) obj2;
                MessageObject messageObject = ed1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f20488id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f38270a = messageObject;
                    obj4.f38271b = -1;
                    obj4.f38272c = -1;
                    obj4.f38274g = true;
                    obj4.d = i12;
                    obj4.f();
                    inVar = obj4;
                }
                snVar.Ib(messageObject, inVar);
                ed1Var.c(false);
                return;
            case 5:
                md1 md1Var = (md1) obj3;
                ArrayList arrayList = md1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = md1Var.f39514f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                md1Var.d.l();
                if (md1Var.f39511a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    md1Var.f39520y = ofFloat;
                    ofFloat.addUpdateListener(new g11(md1Var, 13));
                    md1Var.f39520y.setDuration(100L);
                    md1Var.f39520y.start();
                } else {
                    md1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(md1Var.I);
                if (md1Var.F.getVisibility() == 0) {
                    md1Var.F.animate().alpha(0.0f).setListener(new id1(md1Var, 2)).start();
                    return;
                }
                return;
            case 6:
                ye1 ye1Var = (ye1) obj3;
                ye1Var.f43830s.deleteTopics(ye1Var.f43792a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 7:
                te1 te1Var = (te1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = te1Var.f41977d0;
                if (str3.equals(te1Var.f41975b0)) {
                    int i13 = te1Var.f41984k0;
                    te1Var.f41988p0 = false;
                    te1Var.f41985l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.o2) te1Var.f41992t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        te1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        te1Var.m0 = z10;
                    } else {
                        te1Var.m0 = false;
                    }
                    if (te1Var.f41984k0 == 0) {
                        te1Var.f41986n0.e(te1Var.f41985l0, true);
                    }
                    te1Var.f41987o0.b(i13);
                    return;
                }
                return;
            default:
                qg1 qg1Var = (qg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                hg.a2 a2Var = qg1Var.f40806f;
                if (qg1Var.f40807n) {
                    qg1Var.h = null;
                    qg1Var.d = arrayList4;
                    qg1Var.e = arrayList5;
                    a2Var.f(arrayList4, null);
                    if (qg1Var.f40807n && !a2Var.e()) {
                        qg1Var.v.f34260f.e(false, true);
                    }
                    qg1Var.l();
                    return;
                }
                return;
        }
    }

    public h71(uc1 uc1Var, String str, TLRPC.TL_error tL_error) {
        this.f37769a = 2;
        this.f37770b = uc1Var;
        this.d = str;
        this.f37771c = tL_error;
    }
}
