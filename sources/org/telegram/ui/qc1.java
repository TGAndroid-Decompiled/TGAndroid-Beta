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
public final class qc1 implements Runnable {
    public final int f41758a;
    public final Object f41759b;
    public final Object f41760c;
    public final Object d;

    public qc1(Object obj, Object obj2, Object obj3, int i9) {
        this.f41758a = i9;
        this.f41759b = obj;
        this.d = obj2;
        this.f41760c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i9;
        int i10 = this.f41758a;
        gn gnVar = null;
        gnVar = null;
        gnVar = null;
        boolean z10 = false;
        Object obj = this.f41760c;
        Object obj2 = this.d;
        Object obj3 = this.f41759b;
        switch (i10) {
            case 0:
                tc1 tc1Var = (tc1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                tc1Var.f42961y = 0;
                String str2 = tc1Var.A;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        tc1Var.Z(org.telegram.ui.ActionBar.f6.f23212p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        tc1Var.Z(org.telegram.ui.ActionBar.f6.f23334w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                tc1.V((tc1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                dd1 dd1Var = (dd1) obj3;
                qn qnVar = (qn) obj2;
                MessageObject messageObject = dd1Var.C;
                int i11 = ((TLRPC.TodoItem) obj).f22525id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f38572a = messageObject;
                    obj4.f38573b = -1;
                    obj4.f38574c = -1;
                    obj4.f38577g = true;
                    obj4.d = i11;
                    obj4.e();
                    gnVar = obj4;
                }
                qnVar.Cb(messageObject, gnVar);
                dd1Var.c(false);
                return;
            case 3:
                kd1 kd1Var = (kd1) obj3;
                ArrayList arrayList = kd1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = kd1Var.f39812f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                kd1Var.d.l();
                if (kd1Var.f39808a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    kd1Var.f39818y = ofFloat;
                    ofFloat.addUpdateListener(new v01(kd1Var, 15));
                    kd1Var.f39818y.setDuration(100L);
                    kd1Var.f39818y.start();
                } else {
                    kd1Var.A = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(kd1Var.E);
                if (kd1Var.B.getVisibility() == 0) {
                    kd1Var.B.animate().alpha(0.0f).setListener(new gd1(kd1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                we1 we1Var = (we1) obj3;
                we1Var.f43774s.deleteTopics(we1Var.f43741a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                re1 re1Var = (re1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = re1Var.W;
                if (str3.equals(re1Var.U)) {
                    int i12 = re1Var.f42399g0;
                    re1Var.f42404l0 = false;
                    re1Var.f42400h0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                            i9 = ((org.telegram.ui.ActionBar.o2) re1Var.f42407p0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i9, messages_messages.messages.get(i13), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        re1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        re1Var.f42401i0 = z10;
                    } else {
                        re1Var.f42401i0 = false;
                    }
                    if (re1Var.f42399g0 == 0) {
                        re1Var.f42402j0.e(re1Var.f42400h0, true);
                    }
                    re1Var.f42403k0.b(i12);
                    return;
                }
                return;
            default:
                pg1 pg1Var = (pg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                of.v1 v1Var = pg1Var.f41518f;
                if (pg1Var.f41519n) {
                    pg1Var.h = null;
                    pg1Var.d = arrayList4;
                    pg1Var.f41517e = arrayList5;
                    v1Var.f(arrayList4, null);
                    if (pg1Var.f41519n && !v1Var.e()) {
                        pg1Var.v.f36289f.e(false, true);
                    }
                    pg1Var.l();
                    return;
                }
                return;
        }
    }

    public qc1(tc1 tc1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f41758a = 1;
        this.f41759b = tc1Var;
        this.f41760c = tL_error;
        this.d = updatetheme;
    }
}
