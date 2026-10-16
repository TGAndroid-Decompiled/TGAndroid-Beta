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
    public final int f35271a;
    public final Object f35272b;
    public final Object f35273c;
    public final Object d;

    public ee1(Object obj, Object obj2, Object obj3, int i10) {
        this.f35271a = i10;
        this.f35272b = obj;
        this.d = obj2;
        this.f35273c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f35271a;
        un unVar = null;
        unVar = null;
        unVar = null;
        boolean z10 = false;
        Object obj = this.f35273c;
        Object obj2 = this.d;
        Object obj3 = this.f35272b;
        switch (i11) {
            case 0:
                he1 he1Var = (he1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                he1Var.f36536y = 0;
                String str2 = he1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        he1Var.a0(org.telegram.ui.ActionBar.g6.f19822p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        he1Var.a0(org.telegram.ui.ActionBar.g6.f19952w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                he1.W((he1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                re1 re1Var = (re1) obj3;
                fo foVar = (fo) obj2;
                MessageObject messageObject = re1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f19061id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f40445a = messageObject;
                    obj4.f40446b = -1;
                    obj4.f40447c = -1;
                    obj4.f40449g = true;
                    obj4.d = i12;
                    obj4.e();
                    unVar = obj4;
                }
                foVar.Gb(messageObject, unVar);
                re1Var.c(false);
                return;
            case 3:
                ze1 ze1Var = (ze1) obj3;
                ArrayList arrayList = ze1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = ze1Var.f42295f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                ze1Var.d.l();
                if (ze1Var.f42292a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ze1Var.f42301y = ofFloat;
                    ofFloat.addUpdateListener(new f21(ze1Var, 15));
                    ze1Var.f42301y.setDuration(100L);
                    ze1Var.f42301y.start();
                } else {
                    ze1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(ze1Var.I);
                if (ze1Var.F.getVisibility() == 0) {
                    ze1Var.F.animate().alpha(0.0f).setListener(new ve1(ze1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                kg1 kg1Var = (kg1) obj3;
                kg1Var.f37415s.deleteTopics(kg1Var.f37380a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                gg1 gg1Var = (gg1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = gg1Var.f36199d0;
                if (str3.equals(gg1Var.f36197b0)) {
                    int i13 = gg1Var.f36206k0;
                    gg1Var.f36210p0 = false;
                    gg1Var.f36207l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.m2) gg1Var.f36214t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        gg1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        gg1Var.m0 = z10;
                    } else {
                        gg1Var.m0 = false;
                    }
                    if (gg1Var.f36206k0 == 0) {
                        gg1Var.f36208n0.e(gg1Var.f36207l0, true);
                    }
                    gg1Var.f36209o0.b(i13);
                    return;
                }
                return;
            default:
                ei1 ei1Var = (ei1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                hg.a2 a2Var = ei1Var.f35310f;
                if (ei1Var.f35311n) {
                    ei1Var.h = null;
                    ei1Var.d = arrayList4;
                    ei1Var.e = arrayList5;
                    a2Var.f(arrayList4, null);
                    if (ei1Var.f35311n && !a2Var.e()) {
                        ei1Var.v.f32604f.e(false, true);
                    }
                    ei1Var.l();
                    return;
                }
                return;
        }
    }

    public ee1(he1 he1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f35271a = 1;
        this.f35272b = he1Var;
        this.f35273c = tL_error;
        this.d = updatetheme;
    }
}
