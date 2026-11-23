package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;
public final class zl implements Runnable {
    public final int f28316a;
    public final np f28317b;
    public final a0.h f28318c;

    public zl(np npVar, a0.h hVar, int i7) {
        this.f28316a = i7;
        this.f28317b = npVar;
        this.f28318c = hVar;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        switch (this.f28316a) {
            case 0:
                np npVar = this.f28317b;
                a0.h hVar = this.f28318c;
                ys notificationsController = npVar.getNotificationsController();
                notificationsController.getClass();
                if (hVar.m() != 0) {
                    for (int i7 = 0; i7 < hVar.m(); i7++) {
                        ArrayList arrayList = (ArrayList) hVar.n(i7);
                        if (arrayList != null) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                gj gjVar = (gj) arrayList.get(i10);
                                if (gjVar != null && (message = gjVar.f24177k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(t0.f26895b, notificationsController.currentAccount, gjVar.e1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    ys.f28133l0.c(new sq(16, notificationsController, hVar));
                }
                f00 f00Var = npVar.f25932t7;
                f00Var.getClass();
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < hVar.m(); i11++) {
                    ArrayList arrayList2 = (ArrayList) hVar.n(i11);
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) f00Var.f23774e.f(f00.p(((gj) arrayList2.get(i12)).e1(), -gj.B0(((gj) arrayList2.get(i12)).f24177k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((gj) arrayList2.get(i12)).f24177k;
                            hashSet.add(Long.valueOf(-gj.B0(((gj) arrayList2.get(i12)).f24177k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    f00Var.y(((Long) it.next()).longValue(), true);
                }
                return;
            case 1:
                g0.g3(new zl(this.f28317b, this.f28318c, 0));
                return;
            default:
                np npVar2 = this.f28317b;
                a0.h hVar2 = this.f28318c;
                for (int i13 = 0; i13 < hVar2.m(); i13++) {
                    npVar2.x5(0, hVar2.j(i13), (ArrayList) hVar2.n(i13));
                }
                npVar2.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}
