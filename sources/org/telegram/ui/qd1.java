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
    public final int f36867a;
    public final Object f36868b;
    public final Object f36869c;
    public final Object d;

    public qd1(Object obj, Object obj2, Object obj3, int i10) {
        this.f36867a = i10;
        this.f36868b = obj;
        this.d = obj2;
        this.f36869c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f36867a;
        mn mnVar = null;
        mnVar = null;
        mnVar = null;
        boolean z10 = false;
        Object obj = this.f36869c;
        Object obj2 = this.d;
        Object obj3 = this.f36868b;
        switch (i11) {
            case 0:
                td1 td1Var = (td1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                td1Var.f38062y = 0;
                String str2 = td1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        td1Var.a0(org.telegram.ui.ActionBar.h6.f19279p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        td1Var.a0(org.telegram.ui.ActionBar.h6.f19408w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                td1.W((td1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                de1 de1Var = (de1) obj3;
                wn wnVar = (wn) obj2;
                MessageObject messageObject = de1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f18480id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f35624a = messageObject;
                    obj4.f35625b = -1;
                    obj4.f35626c = -1;
                    obj4.f35628g = true;
                    obj4.d = i12;
                    obj4.e();
                    mnVar = obj4;
                }
                wnVar.Cb(messageObject, mnVar);
                de1Var.c(false);
                return;
            case 3:
                le1 le1Var = (le1) obj3;
                ArrayList arrayList = le1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = le1Var.f35342f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                le1Var.d.l();
                if (le1Var.f35339a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    le1Var.f35348y = ofFloat;
                    ofFloat.addUpdateListener(new q11(le1Var, 15));
                    le1Var.f35348y.setDuration(100L);
                    le1Var.f35348y.start();
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
                wf1Var.f39343s.deleteTopics(wf1Var.f39308a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                sf1 sf1Var = (sf1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = sf1Var.f37738d0;
                if (str3.equals(sf1Var.f37736b0)) {
                    int i13 = sf1Var.f37745k0;
                    sf1Var.f37749p0 = false;
                    sf1Var.f37746l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.m2) sf1Var.f37753t0).currentAccount;
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
                    if (sf1Var.f37745k0 == 0) {
                        sf1Var.f37747n0.e(sf1Var.f37746l0, true);
                    }
                    sf1Var.f37748o0.b(i13);
                    return;
                }
                return;
            default:
                ph1 ph1Var = (ph1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.c2 c2Var = ph1Var.f36550f;
                if (ph1Var.f36551n) {
                    ph1Var.h = null;
                    ph1Var.d = arrayList4;
                    ph1Var.e = arrayList5;
                    c2Var.f(arrayList4, null);
                    if (ph1Var.f36551n && !c2Var.e()) {
                        ph1Var.v.f31897f.e(false, true);
                    }
                    ph1Var.l();
                    return;
                }
                return;
        }
    }

    public qd1(td1 td1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f36867a = 1;
        this.f36868b = td1Var;
        this.f36869c = tL_error;
        this.d = updatetheme;
    }
}
