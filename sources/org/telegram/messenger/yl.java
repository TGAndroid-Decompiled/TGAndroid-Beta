package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;
public final class yl implements Runnable {
    public final int f28158a;
    public final mp f28159b;
    public final a0.h f28160c;

    public yl(mp mpVar, a0.h hVar, int i7) {
        this.f28158a = i7;
        this.f28159b = mpVar;
        this.f28160c = hVar;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        switch (this.f28158a) {
            case 0:
                mp mpVar = this.f28159b;
                a0.h hVar = this.f28160c;
                xs notificationsController = mpVar.getNotificationsController();
                notificationsController.getClass();
                if (hVar.m() != 0) {
                    for (int i7 = 0; i7 < hVar.m(); i7++) {
                        ArrayList arrayList = (ArrayList) hVar.n(i7);
                        if (arrayList != null) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                fj fjVar = (fj) arrayList.get(i10);
                                if (fjVar != null && (message = fjVar.f23968k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(t0.f26915b, notificationsController.currentAccount, fjVar.e1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    xs.f27959l0.c(new rq(16, notificationsController, hVar));
                }
                e00 e00Var = mpVar.f25771t7;
                e00Var.getClass();
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < hVar.m(); i11++) {
                    ArrayList arrayList2 = (ArrayList) hVar.n(i11);
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) e00Var.f23626e.f(e00.p(((fj) arrayList2.get(i12)).e1(), -fj.B0(((fj) arrayList2.get(i12)).f23968k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((fj) arrayList2.get(i12)).f23968k;
                            hashSet.add(Long.valueOf(-fj.B0(((fj) arrayList2.get(i12)).f23968k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    e00Var.y(((Long) it.next()).longValue(), true);
                }
                return;
            case 1:
                g0.g3(new yl(this.f28159b, this.f28160c, 0));
                return;
            default:
                mp mpVar2 = this.f28159b;
                a0.h hVar2 = this.f28160c;
                for (int i13 = 0; i13 < hVar2.m(); i13++) {
                    mpVar2.x5(0, hVar2.j(i13), (ArrayList) hVar2.n(i13));
                }
                mpVar2.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}
