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
public final class ld1 implements Runnable {
    public final int f35741a;
    public final Object f35742b;
    public final Object f35743c;
    public final Object d;

    public ld1(Object obj, Object obj2, Object obj3, int i10) {
        this.f35741a = i10;
        this.f35742b = obj;
        this.d = obj2;
        this.f35743c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f35741a;
        pn pnVar = null;
        pnVar = null;
        pnVar = null;
        boolean z4 = false;
        Object obj = this.f35743c;
        Object obj2 = this.d;
        Object obj3 = this.f35742b;
        switch (i11) {
            case 0:
                od1 od1Var = (od1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                od1Var.f36764y = 0;
                String str2 = od1Var.B;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        od1Var.a0(org.telegram.ui.ActionBar.j6.f20097p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        od1Var.a0(org.telegram.ui.ActionBar.j6.f20219w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                od1.W((od1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                yd1 yd1Var = (yd1) obj3;
                zn znVar = (zn) obj2;
                MessageObject messageObject = yd1Var.D;
                int i12 = ((TLRPC.TodoItem) obj).f19304id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f37189a = messageObject;
                    obj4.f37190b = -1;
                    obj4.f37191c = -1;
                    obj4.f37193g = true;
                    obj4.d = i12;
                    obj4.e();
                    pnVar = obj4;
                }
                znVar.Cb(messageObject, pnVar);
                yd1Var.c(false);
                return;
            case 3:
                ge1 ge1Var = (ge1) obj3;
                ArrayList arrayList = ge1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = ge1Var.f34430f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                ge1Var.d.l();
                if (ge1Var.f34427a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ge1Var.f34436y = ofFloat;
                    ofFloat.addUpdateListener(new o11(ge1Var, 15));
                    ge1Var.f34436y.setDuration(100L);
                    ge1Var.f34436y.start();
                } else {
                    ge1Var.B = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(ge1Var.F);
                if (ge1Var.C.getVisibility() == 0) {
                    ge1Var.C.animate().alpha(0.0f).setListener(new ce1(ge1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                sf1 sf1Var = (sf1) obj3;
                sf1Var.f38208s.deleteTopics(sf1Var.f38175a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                of1 of1Var = (of1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = of1Var.f36777a0;
                if (str3.equals(of1Var.V)) {
                    int i13 = of1Var.f36784h0;
                    of1Var.m0 = false;
                    of1Var.f36785i0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.p2) of1Var.f36792q0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        of1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z4 = true;
                        }
                        of1Var.f36786j0 = z4;
                    } else {
                        of1Var.f36786j0 = false;
                    }
                    if (of1Var.f36784h0 == 0) {
                        of1Var.f36787k0.e(of1Var.f36785i0, true);
                    }
                    of1Var.f36788l0.b(i13);
                    return;
                }
                return;
            default:
                lh1 lh1Var = (lh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                tf.j1 j1Var = lh1Var.f35770f;
                if (lh1Var.f35771n) {
                    lh1Var.h = null;
                    lh1Var.d = arrayList4;
                    lh1Var.e = arrayList5;
                    j1Var.f(arrayList4, null);
                    if (lh1Var.f35771n && !j1Var.e()) {
                        lh1Var.v.f32364f.e(false, true);
                    }
                    lh1Var.l();
                    return;
                }
                return;
        }
    }

    public ld1(od1 od1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f35741a = 1;
        this.f35742b = od1Var;
        this.f35743c = tL_error;
        this.d = updatetheme;
    }
}
