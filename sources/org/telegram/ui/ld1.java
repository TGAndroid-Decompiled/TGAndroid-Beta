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
    public final int f38616a;
    public final Object f38617b;
    public final Object f38618c;
    public final Object d;

    public ld1(Object obj, Object obj2, Object obj3, int i10) {
        this.f38616a = i10;
        this.f38617b = obj;
        this.d = obj2;
        this.f38618c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f38616a;
        nn nnVar = null;
        nnVar = null;
        nnVar = null;
        boolean z4 = false;
        Object obj = this.f38618c;
        Object obj2 = this.d;
        Object obj3 = this.f38617b;
        switch (i11) {
            case 0:
                od1 od1Var = (od1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                od1Var.f39672y = 0;
                String str2 = od1Var.B;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        od1Var.a0(org.telegram.ui.ActionBar.k6.f21878p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        od1Var.a0(org.telegram.ui.ActionBar.k6.f22000w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                od1.W((od1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                zd1 zd1Var = (zd1) obj3;
                xn xnVar = (xn) obj2;
                MessageObject messageObject = zd1Var.D;
                int i12 = ((TLRPC.TodoItem) obj).f20990id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f39405a = messageObject;
                    obj4.f39406b = -1;
                    obj4.f39407c = -1;
                    obj4.f39410g = true;
                    obj4.d = i12;
                    obj4.e();
                    nnVar = obj4;
                }
                xnVar.Cb(messageObject, nnVar);
                zd1Var.c(false);
                return;
            case 3:
                he1 he1Var = (he1) obj3;
                ArrayList arrayList = he1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = he1Var.f37358f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                he1Var.d.l();
                if (he1Var.f37354a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    he1Var.f37364y = ofFloat;
                    ofFloat.addUpdateListener(new n11(he1Var, 15));
                    he1Var.f37364y.setDuration(100L);
                    he1Var.f37364y.start();
                } else {
                    he1Var.B = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(he1Var.F);
                if (he1Var.C.getVisibility() == 0) {
                    he1Var.C.animate().alpha(0.0f).setListener(new de1(he1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                sf1 sf1Var = (sf1) obj3;
                sf1Var.f41222s.deleteTopics(sf1Var.f41188a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                of1 of1Var = (of1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = of1Var.f39691a0;
                if (str3.equals(of1Var.V)) {
                    int i13 = of1Var.f39698h0;
                    of1Var.m0 = false;
                    of1Var.f39699i0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.p2) of1Var.f39706q0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        of1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z4 = true;
                        }
                        of1Var.f39700j0 = z4;
                    } else {
                        of1Var.f39700j0 = false;
                    }
                    if (of1Var.f39698h0 == 0) {
                        of1Var.f39701k0.e(of1Var.f39699i0, true);
                    }
                    of1Var.f39702l0.b(i13);
                    return;
                }
                return;
            default:
                lh1 lh1Var = (lh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                uf.k1 k1Var = lh1Var.f38653f;
                if (lh1Var.f38654n) {
                    lh1Var.h = null;
                    lh1Var.d = arrayList4;
                    lh1Var.f38652e = arrayList5;
                    k1Var.f(arrayList4, null);
                    if (lh1Var.f38654n && !k1Var.e()) {
                        lh1Var.v.f34934f.e(false, true);
                    }
                    lh1Var.l();
                    return;
                }
                return;
        }
    }

    public ld1(od1 od1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f38616a = 1;
        this.f38617b = od1Var;
        this.f38618c = tL_error;
        this.d = updatetheme;
    }
}
