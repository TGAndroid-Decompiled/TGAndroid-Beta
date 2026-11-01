package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class yk implements RequestDelegate {
    public final int f19593a;
    public final wp f19594b;
    public final int f19595c;
    public final long d;
    public final long e;

    public yk(int i10, long j10, long j11, wp wpVar) {
        this.f19593a = 0;
        this.f19594b = wpVar;
        this.d = j10;
        this.f19595c = i10;
        this.e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Chat chat;
        switch (this.f19593a) {
            case 0:
                wp wpVar = this.f19594b;
                long j10 = this.d;
                long j11 = this.e;
                if (tLObject != null) {
                    TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
                    a0.h hVar = new a0.h();
                    int i10 = 0;
                    for (int i11 = 0; i11 < updates_channeldifference.users.size(); i11++) {
                        TLRPC.User user = updates_channeldifference.users.get(i11);
                        hVar.k(user, user.f19943id);
                    }
                    int i12 = 0;
                    while (true) {
                        if (i12 < updates_channeldifference.chats.size()) {
                            chat = updates_channeldifference.chats.get(i12);
                            if (chat.f19794id != j10) {
                                i12++;
                            }
                        } else {
                            chat = null;
                        }
                    }
                    TLRPC.Chat chat2 = chat;
                    ArrayList arrayList = new ArrayList();
                    if (!updates_channeldifference.other_updates.isEmpty()) {
                        while (i10 < updates_channeldifference.other_updates.size()) {
                            TLRPC.Update update = updates_channeldifference.other_updates.get(i10);
                            if (update instanceof TL_update.TL_updateMessageID) {
                                arrayList.add((TL_update.TL_updateMessageID) update);
                                updates_channeldifference.other_updates.remove(i10);
                                i10--;
                            }
                            i10++;
                        }
                    }
                    wpVar.getMessagesStorage().m1(updates_channeldifference.users, updates_channeldifference.chats, true, true);
                    i0.g3(new pi(11, wpVar, updates_channeldifference));
                    wpVar.getMessagesStorage().f16331a.c(new al(wpVar, arrayList, j10, updates_channeldifference, chat2, hVar, this.f19595c, j11));
                    return;
                } else if (tL_error != null) {
                    i0.g3(new ol(wpVar, tL_error, j10, 0));
                    wpVar.Z0.e(j10);
                    if (j11 != 0) {
                        wpVar.getMessagesStorage().q1(j11);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                i0.g3(new gk(this.f19594b, this.f19595c, this.d, this.e, 2));
                return;
            default:
                i0.g3(new gk(this.f19594b, this.f19595c, this.d, this.e, 0));
                return;
        }
    }

    public yk(wp wpVar, int i10, long j10, long j11, int i11) {
        this.f19593a = i11;
        this.f19594b = wpVar;
        this.f19595c = i10;
        this.d = j10;
        this.e = j11;
    }
}
