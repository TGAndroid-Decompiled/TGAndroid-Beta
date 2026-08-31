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
public final class gd1 implements Runnable {
    public final int f37164a;
    public final Object f37165b;
    public final Object f37166c;
    public final Object d;

    public gd1(Object obj, Object obj2, Object obj3, int i10) {
        this.f37164a = i10;
        this.f37165b = obj;
        this.d = obj2;
        this.f37166c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f37164a;
        nn nnVar = null;
        nnVar = null;
        nnVar = null;
        boolean z4 = false;
        Object obj = this.f37166c;
        Object obj2 = this.d;
        Object obj3 = this.f37165b;
        switch (i11) {
            case 0:
                jd1 jd1Var = (jd1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                jd1Var.f38124y = 0;
                String str2 = jd1Var.B;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        jd1Var.a0(org.telegram.ui.ActionBar.k6.f21876p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        jd1Var.a0(org.telegram.ui.ActionBar.k6.f21998w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                jd1.W((jd1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                ud1 ud1Var = (ud1) obj3;
                xn xnVar = (xn) obj2;
                MessageObject messageObject = ud1Var.D;
                int i12 = ((TLRPC.TodoItem) obj).f20988id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f39484a = messageObject;
                    obj4.f39485b = -1;
                    obj4.f39486c = -1;
                    obj4.f39489g = true;
                    obj4.d = i12;
                    obj4.e();
                    nnVar = obj4;
                }
                xnVar.Cb(messageObject, nnVar);
                ud1Var.c(false);
                return;
            case 3:
                be1 be1Var = (be1) obj3;
                ArrayList arrayList = be1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = be1Var.f35495f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                be1Var.d.l();
                if (be1Var.f35491a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    be1Var.f35501y = ofFloat;
                    ofFloat.addUpdateListener(new j11(be1Var, 15));
                    be1Var.f35501y.setDuration(100L);
                    be1Var.f35501y.start();
                } else {
                    be1Var.B = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(be1Var.F);
                if (be1Var.C.getVisibility() == 0) {
                    be1Var.C.animate().alpha(0.0f).setListener(new xd1(be1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                mf1 mf1Var = (mf1) obj3;
                mf1Var.f39136s.deleteTopics(mf1Var.f39102a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                if1 if1Var = (if1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = if1Var.f37834a0;
                if (str3.equals(if1Var.V)) {
                    int i13 = if1Var.f37841h0;
                    if1Var.m0 = false;
                    if1Var.f37842i0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.p2) if1Var.f37849q0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        if1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z4 = true;
                        }
                        if1Var.f37843j0 = z4;
                    } else {
                        if1Var.f37843j0 = false;
                    }
                    if (if1Var.f37841h0 == 0) {
                        if1Var.f37844k0.e(if1Var.f37842i0, true);
                    }
                    if1Var.f37845l0.b(i13);
                    return;
                }
                return;
            default:
                fh1 fh1Var = (fh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                uf.k1 k1Var = fh1Var.f36888f;
                if (fh1Var.f36889n) {
                    fh1Var.h = null;
                    fh1Var.d = arrayList4;
                    fh1Var.f36887e = arrayList5;
                    k1Var.f(arrayList4, null);
                    if (fh1Var.f36889n && !k1Var.e()) {
                        fh1Var.v.f34934f.e(false, true);
                    }
                    fh1Var.l();
                    return;
                }
                return;
        }
    }

    public gd1(jd1 jd1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f37164a = 1;
        this.f37165b = jd1Var;
        this.f37166c = tL_error;
        this.d = updatetheme;
    }
}
