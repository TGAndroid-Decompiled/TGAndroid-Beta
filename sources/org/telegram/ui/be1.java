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
public final class be1 implements Runnable {
    public final int f36144a;
    public final Object f36145b;
    public final Object f36146c;
    public final Object d;

    public be1(Object obj, Object obj2, Object obj3, int i10) {
        this.f36144a = i10;
        this.f36145b = obj;
        this.d = obj2;
        this.f36146c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f36144a;
        tn tnVar = null;
        tnVar = null;
        tnVar = null;
        boolean z10 = false;
        Object obj = this.f36146c;
        Object obj2 = this.d;
        Object obj3 = this.f36145b;
        switch (i11) {
            case 0:
                ee1 ee1Var = (ee1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ee1Var.f37079y = 0;
                String str2 = ee1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        ee1Var.a0(org.telegram.ui.ActionBar.h6.f20780p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        ee1Var.a0(org.telegram.ui.ActionBar.h6.f20910w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                ee1.W((ee1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                oe1 oe1Var = (oe1) obj3;
                eo eoVar = (eo) obj2;
                MessageObject messageObject = oe1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f19947id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f42242a = messageObject;
                    obj4.f42243b = -1;
                    obj4.f42244c = -1;
                    obj4.f42247g = true;
                    obj4.d = i12;
                    obj4.e();
                    tnVar = obj4;
                }
                eoVar.Gb(messageObject, tnVar);
                oe1Var.c(false);
                return;
            case 3:
                we1 we1Var = (we1) obj3;
                ArrayList arrayList = we1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = we1Var.f43149f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                we1Var.d.l();
                if (we1Var.f43145a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    we1Var.f43155y = ofFloat;
                    ofFloat.addUpdateListener(new a21(we1Var, 15));
                    we1Var.f43155y.setDuration(100L);
                    we1Var.f43155y.start();
                } else {
                    we1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(we1Var.I);
                if (we1Var.F.getVisibility() == 0) {
                    we1Var.F.animate().alpha(0.0f).setListener(new se1(we1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                hg1 hg1Var = (hg1) obj3;
                hg1Var.f38412s.deleteTopics(hg1Var.f38376a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                dg1 dg1Var = (dg1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = dg1Var.f36808d0;
                if (str3.equals(dg1Var.f36806b0)) {
                    int i13 = dg1Var.f36815k0;
                    dg1Var.f36819p0 = false;
                    dg1Var.f36816l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.m2) dg1Var.f36823t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        dg1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        dg1Var.m0 = z10;
                    } else {
                        dg1Var.m0 = false;
                    }
                    if (dg1Var.f36815k0 == 0) {
                        dg1Var.f36817n0.e(dg1Var.f36816l0, true);
                    }
                    dg1Var.f36818o0.b(i13);
                    return;
                }
                return;
            default:
                ai1 ai1Var = (ai1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.b2 b2Var = ai1Var.f35845f;
                if (ai1Var.f35846n) {
                    ai1Var.h = null;
                    ai1Var.d = arrayList4;
                    ai1Var.f35844e = arrayList5;
                    b2Var.f(arrayList4, null);
                    if (ai1Var.f35846n && !b2Var.e()) {
                        ai1Var.v.f34433f.e(false, true);
                    }
                    ai1Var.l();
                    return;
                }
                return;
        }
    }

    public be1(ee1 ee1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f36144a = 1;
        this.f36145b = ee1Var;
        this.f36146c = tL_error;
        this.d = updatetheme;
    }
}
