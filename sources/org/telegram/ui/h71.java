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
    public final int f37447a;
    public final Object f37448b;
    public final Object f37449c;
    public final Object d;

    public h71(Object obj, Object obj2, Object obj3, int i10) {
        this.f37447a = i10;
        this.f37449c = obj;
        this.f37448b = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f37447a;
        in inVar = null;
        inVar = null;
        inVar = null;
        boolean z10 = false;
        Object obj = this.d;
        Object obj2 = this.f37448b;
        Object obj3 = this.f37449c;
        switch (i11) {
            case 0:
                i71 i71Var = (i71) obj3;
                n9 n9Var = (n9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    i71Var.f37772c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new z40(28, i71Var, n9Var));
                    return;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new g71(i71Var, 1));
                    n9Var.run();
                    return;
                }
            case 1:
                qc1 qc1Var = (qc1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                qc1Var.f40383y = 0;
                String str2 = qc1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        qc1Var.a0(org.telegram.ui.ActionBar.h6.f21207p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        qc1Var.a0(org.telegram.ui.ActionBar.h6.f21338w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 2:
                qc1.W((qc1) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 3:
                ad1 ad1Var = (ad1) obj3;
                sn snVar = (sn) obj2;
                MessageObject messageObject = ad1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f20417id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f37923a = messageObject;
                    obj4.f37924b = -1;
                    obj4.f37925c = -1;
                    obj4.f37927g = true;
                    obj4.d = i12;
                    obj4.f();
                    inVar = obj4;
                }
                snVar.Gb(messageObject, inVar);
                ad1Var.c(false);
                return;
            case 4:
                id1 id1Var = (id1) obj3;
                ArrayList arrayList = id1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = id1Var.f37855f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                id1Var.d.l();
                if (id1Var.f37852a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    id1Var.f37861y = ofFloat;
                    ofFloat.addUpdateListener(new e11(id1Var, 13));
                    id1Var.f37861y.setDuration(100L);
                    id1Var.f37861y.start();
                } else {
                    id1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(id1Var.I);
                if (id1Var.F.getVisibility() == 0) {
                    id1Var.F.animate().alpha(0.0f).setListener(new ed1(id1Var, 2)).start();
                    return;
                }
                return;
            case 5:
                te1 te1Var = (te1) obj3;
                te1Var.f41714s.deleteTopics(te1Var.f41679a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 6:
                pe1 pe1Var = (pe1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = pe1Var.f40105d0;
                if (str3.equals(pe1Var.f40103b0)) {
                    int i13 = pe1Var.f40112k0;
                    pe1Var.f40116p0 = false;
                    pe1Var.f40113l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.n2) pe1Var.f40120t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        pe1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        pe1Var.m0 = z10;
                    } else {
                        pe1Var.m0 = false;
                    }
                    if (pe1Var.f40112k0 == 0) {
                        pe1Var.f40114n0.e(pe1Var.f40113l0, true);
                    }
                    pe1Var.f40115o0.b(i13);
                    return;
                }
                return;
            default:
                mg1 mg1Var = (mg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                hg.a2 a2Var = mg1Var.f39184f;
                if (mg1Var.f39185n) {
                    mg1Var.h = null;
                    mg1Var.d = arrayList4;
                    mg1Var.e = arrayList5;
                    a2Var.f(arrayList4, null);
                    if (mg1Var.f39185n && !a2Var.e()) {
                        mg1Var.v.f33944f.e(false, true);
                    }
                    mg1Var.l();
                    return;
                }
                return;
        }
    }
}
