package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qd1 implements Runnable {
    public final int f36400a;
    public final Object f36401b;
    public final Object f36402c;
    public final Object d;

    public qd1(Object obj, Object obj2, Object obj3, int i10) {
        this.f36400a = i10;
        this.f36401b = obj;
        this.d = obj2;
        this.f36402c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f36400a;
        nn nnVar = null;
        nnVar = null;
        nnVar = null;
        boolean z10 = false;
        Object obj = this.f36402c;
        Object obj2 = this.d;
        Object obj3 = this.f36401b;
        switch (i11) {
            case 0:
                td1 td1Var = (td1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                td1Var.f37621y = 0;
                String str2 = td1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        td1Var.a0(org.telegram.ui.ActionBar.h6.f19008p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        td1Var.a0(org.telegram.ui.ActionBar.h6.f19136w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                td1.W((td1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                de1 de1Var = (de1) obj3;
                xn xnVar = (xn) obj2;
                MessageObject messageObject = de1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f18228id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f35557a = messageObject;
                    obj4.f35558b = -1;
                    obj4.f35559c = -1;
                    obj4.f35561g = true;
                    obj4.d = i12;
                    obj4.e();
                    nnVar = obj4;
                }
                xnVar.Cb(messageObject, nnVar);
                de1Var.c(false);
                return;
            case 3:
                le1 le1Var = (le1) obj3;
                ArrayList arrayList = le1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = le1Var.f34959f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                le1Var.d.l();
                if (le1Var.f34956a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    le1Var.f34965y = ofFloat;
                    ofFloat.addUpdateListener(new s11(le1Var, 15));
                    le1Var.f34965y.setDuration(100L);
                    le1Var.f34965y.start();
                } else {
                    le1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(le1Var.I);
                if (le1Var.F.getVisibility() == 0) {
                    le1Var.F.animate().alpha(0.0f).setListener(new he1(le1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                wf1 wf1Var = (wf1) obj3;
                wf1Var.f38971s.deleteTopics(wf1Var.f38936a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                sf1 sf1Var = (sf1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = sf1Var.f37279d0;
                if (str3.equals(sf1Var.f37277b0)) {
                    int i13 = sf1Var.f37286k0;
                    sf1Var.f37290p0 = false;
                    sf1Var.f37287l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.n2) sf1Var.f37294t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        sf1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        sf1Var.m0 = z10;
                    } else {
                        sf1Var.m0 = false;
                    }
                    if (sf1Var.f37286k0 == 0) {
                        sf1Var.f37288n0.e(sf1Var.f37287l0, true);
                    }
                    sf1Var.f37289o0.b(i13);
                    return;
                }
                return;
            default:
                ph1 ph1Var = (ph1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.c2 c2Var = ph1Var.f36116f;
                if (ph1Var.f36117n) {
                    ph1Var.h = null;
                    ph1Var.d = arrayList4;
                    ph1Var.e = arrayList5;
                    c2Var.f(arrayList4, null);
                    if (ph1Var.f36117n && !c2Var.e()) {
                        ph1Var.v.f31582f.e(false, true);
                    }
                    ph1Var.l();
                    return;
                }
                return;
        }
    }

    public qd1(td1 td1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f36400a = 1;
        this.f36401b = td1Var;
        this.f36402c = tL_error;
        this.d = updatetheme;
    }
}
