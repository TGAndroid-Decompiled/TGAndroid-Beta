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
public final class ee1 implements Runnable {
    public final int f35526a;
    public final Object f35527b;
    public final Object f35528c;
    public final Object d;

    public ee1(Object obj, Object obj2, Object obj3, int i10) {
        this.f35526a = i10;
        this.f35527b = obj;
        this.d = obj2;
        this.f35528c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f35526a;
        un unVar = null;
        unVar = null;
        unVar = null;
        boolean z10 = false;
        Object obj = this.f35528c;
        Object obj2 = this.d;
        Object obj3 = this.f35527b;
        switch (i11) {
            case 0:
                he1 he1Var = (he1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                he1Var.f36775y = 0;
                String str2 = he1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        he1Var.a0(org.telegram.ui.ActionBar.g6.f20122p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        he1Var.a0(org.telegram.ui.ActionBar.g6.f20252w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                he1.W((he1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                se1 se1Var = (se1) obj3;
                fo foVar = (fo) obj2;
                MessageObject messageObject = se1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f19361id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f40710a = messageObject;
                    obj4.f40711b = -1;
                    obj4.f40712c = -1;
                    obj4.f40714g = true;
                    obj4.d = i12;
                    obj4.e();
                    unVar = obj4;
                }
                foVar.Gb(messageObject, unVar);
                se1Var.c(false);
                return;
            case 3:
                af1 af1Var = (af1) obj3;
                ArrayList arrayList = af1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = af1Var.f34202f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                af1Var.d.l();
                if (af1Var.f34199a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    af1Var.f34208y = ofFloat;
                    ofFloat.addUpdateListener(new f21(af1Var, 15));
                    af1Var.f34208y.setDuration(100L);
                    af1Var.f34208y.start();
                } else {
                    af1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(af1Var.I);
                if (af1Var.F.getVisibility() == 0) {
                    af1Var.F.animate().alpha(0.0f).setListener(new we1(af1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                lg1 lg1Var = (lg1) obj3;
                lg1Var.f37992s.deleteTopics(lg1Var.f37957a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                hg1 hg1Var = (hg1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = hg1Var.f36799d0;
                if (str3.equals(hg1Var.f36797b0)) {
                    int i13 = hg1Var.f36806k0;
                    hg1Var.f36810p0 = false;
                    hg1Var.f36807l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.m2) hg1Var.f36814t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        hg1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        hg1Var.m0 = z10;
                    } else {
                        hg1Var.m0 = false;
                    }
                    if (hg1Var.f36806k0 == 0) {
                        hg1Var.f36808n0.e(hg1Var.f36807l0, true);
                    }
                    hg1Var.f36809o0.b(i13);
                    return;
                }
                return;
            default:
                ei1 ei1Var = (ei1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                hg.a2 a2Var = ei1Var.f35614f;
                if (ei1Var.f35615n) {
                    ei1Var.h = null;
                    ei1Var.d = arrayList4;
                    ei1Var.e = arrayList5;
                    a2Var.f(arrayList4, null);
                    if (ei1Var.f35615n && !a2Var.e()) {
                        ei1Var.v.f32902f.e(false, true);
                    }
                    ei1Var.l();
                    return;
                }
                return;
        }
    }

    public ee1(he1 he1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f35526a = 1;
        this.f35527b = he1Var;
        this.f35528c = tL_error;
        this.d = updatetheme;
    }
}
