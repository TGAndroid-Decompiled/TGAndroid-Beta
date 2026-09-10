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
public final class ce1 implements Runnable {
    public final int f31650a;
    public final Object f31651b;
    public final Object f31652c;
    public final Object d;

    public ce1(Object obj, Object obj2, Object obj3, int i10) {
        this.f31650a = i10;
        this.f31651b = obj;
        this.d = obj2;
        this.f31652c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f31650a;
        tn tnVar = null;
        tnVar = null;
        tnVar = null;
        boolean z10 = false;
        Object obj = this.f31652c;
        Object obj2 = this.d;
        Object obj3 = this.f31651b;
        switch (i11) {
            case 0:
                fe1 fe1Var = (fe1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                fe1Var.f32802y = 0;
                String str2 = fe1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        fe1Var.a0(org.telegram.ui.ActionBar.j6.f18144p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        fe1Var.a0(org.telegram.ui.ActionBar.j6.f18271w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                fe1.W((fe1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                pe1 pe1Var = (pe1) obj3;
                eo eoVar = (eo) obj2;
                MessageObject messageObject = pe1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f17340id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f36967a = messageObject;
                    obj4.f36968b = -1;
                    obj4.f36969c = -1;
                    obj4.f36971g = true;
                    obj4.d = i12;
                    obj4.e();
                    tnVar = obj4;
                }
                eoVar.Cb(messageObject, tnVar);
                pe1Var.c(false);
                return;
            case 3:
                xe1 xe1Var = (xe1) obj3;
                ArrayList arrayList = xe1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = xe1Var.f38697f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                xe1Var.d.l();
                if (xe1Var.f38694a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    xe1Var.f38703y = ofFloat;
                    ofFloat.addUpdateListener(new f21(xe1Var, 15));
                    xe1Var.f38703y.setDuration(100L);
                    xe1Var.f38703y.start();
                } else {
                    xe1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(xe1Var.I);
                if (xe1Var.F.getVisibility() == 0) {
                    xe1Var.F.animate().alpha(0.0f).setListener(new te1(xe1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                ig1 ig1Var = (ig1) obj3;
                ig1Var.f33716s.deleteTopics(ig1Var.f33681a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                eg1 eg1Var = (eg1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = eg1Var.f32190d0;
                if (str3.equals(eg1Var.f32188b0)) {
                    int i13 = eg1Var.f32197k0;
                    eg1Var.f32201p0 = false;
                    eg1Var.f32198l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.p2) eg1Var.f32205t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        eg1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        eg1Var.m0 = z10;
                    } else {
                        eg1Var.m0 = false;
                    }
                    if (eg1Var.f32197k0 == 0) {
                        eg1Var.f32199n0.e(eg1Var.f32198l0, true);
                    }
                    eg1Var.f32200o0.b(i13);
                    return;
                }
                return;
            default:
                ci1 ci1Var = (ci1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                fg.d2 d2Var = ci1Var.f31676f;
                if (ci1Var.f31677n) {
                    ci1Var.h = null;
                    ci1Var.d = arrayList4;
                    ci1Var.e = arrayList5;
                    d2Var.f(arrayList4, null);
                    if (ci1Var.f31677n && !d2Var.e()) {
                        ci1Var.v.f30723f.e(false, true);
                    }
                    ci1Var.l();
                    return;
                }
                return;
        }
    }

    public ce1(fe1 fe1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f31650a = 1;
        this.f31651b = fe1Var;
        this.f31652c = tL_error;
        this.d = updatetheme;
    }
}
