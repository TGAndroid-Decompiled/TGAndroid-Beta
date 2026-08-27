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

public final class pc1 implements Runnable {

    public final int f41325a;

    public final Object f41326b;

    public final Object f41327c;
    public final Object d;

    public pc1(Object obj, Object obj2, Object obj3, int i10) {
        this.f41325a = i10;
        this.f41326b = obj;
        this.d = obj2;
        this.f41327c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10 = this.f41325a;
        hn hnVar = null;
        boolean z10 = false;
        Object obj = this.f41327c;
        Object obj2 = this.d;
        Object obj3 = this.f41326b;
        switch (i10) {
            case 0:
                tc1 tc1Var = (tc1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                tc1Var.f42901y = 0;
                String str2 = tc1Var.A;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error == null || !("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        tc1Var.a0(org.telegram.ui.ActionBar.g6.f23391w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    } else {
                        tc1Var.a0(org.telegram.ui.ActionBar.g6.f23269p7, LocaleController.getString(R.string.SetUrlInUse));
                    }
                    break;
                }
                break;
            case 1:
                tc1.W((tc1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                break;
            case 2:
                dd1 dd1Var = (dd1) obj3;
                rn rnVar = (rn) obj2;
                MessageObject messageObject = dd1Var.C;
                int i11 = ((TLRPC.TodoItem) obj).f22525id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    hnVar = new hn();
                    hnVar.f38861a = messageObject;
                    hnVar.f38862b = -1;
                    hnVar.f38863c = -1;
                    hnVar.f38866g = true;
                    hnVar.d = i11;
                    hnVar.e();
                }
                rnVar.Cb(messageObject, hnVar);
                dd1Var.c(false);
                break;
            case 3:
                ld1 ld1Var = (ld1) obj3;
                ArrayList arrayList = ld1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = ld1Var.f40059f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                ld1Var.d.l();
                if (ld1Var.f40055a.getMeasuredHeight() > 0) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ld1Var.f40065y = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new w01(ld1Var, 15));
                    ld1Var.f40065y.setDuration(100L);
                    ld1Var.f40065y.start();
                } else {
                    ld1Var.A = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(ld1Var.E);
                if (ld1Var.B.getVisibility() == 0) {
                    ld1Var.B.animate().alpha(0.0f).setListener(new hd1(ld1Var, 2)).start();
                }
                break;
            case 4:
                we1 we1Var = (we1) obj3;
                we1Var.f43752s.deleteTopics(we1Var.f43719a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 5:
                se1 se1Var = (se1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = se1Var.W;
                if (str3.equals(se1Var.U)) {
                    int i12 = se1Var.f42613g0;
                    se1Var.f42618l0 = false;
                    se1Var.f42614h0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                            MessageObject messageObject2 = new MessageObject(((org.telegram.ui.ActionBar.n2) se1Var.f42621p0).currentAccount, messages_messages.messages.get(i13), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        se1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        se1Var.f42615i0 = z10;
                    } else {
                        se1Var.f42615i0 = false;
                    }
                    if (se1Var.f42613g0 == 0) {
                        se1Var.f42616j0.e(se1Var.f42614h0, true);
                    }
                    se1Var.f42617k0.b(i12);
                }
                break;
            default:
                og1 og1Var = (og1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                pf.j1 j1Var = og1Var.f41094f;
                if (og1Var.f41095n) {
                    og1Var.h = null;
                    og1Var.d = arrayList4;
                    og1Var.f41093e = arrayList5;
                    j1Var.f(arrayList4, null);
                    if (og1Var.f41095n && !j1Var.e()) {
                        og1Var.v.f36292f.e(false, true);
                    }
                    og1Var.l();
                    break;
                }
                break;
        }
    }

    public pc1(tc1 tc1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f41325a = 1;
        this.f41326b = tc1Var;
        this.f41327c = tL_error;
        this.d = updatetheme;
    }
}
