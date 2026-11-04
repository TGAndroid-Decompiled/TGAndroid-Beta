package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.ws0;
public final class zd implements RequestDelegate {
    public final int f26781a;
    public final int f26782b;
    public final int f26783c;
    public final cs d;

    public zd(cs csVar, int i3, int i10, int i11) {
        this.f26781a = i11;
        this.d = csVar;
        this.f26782b = i3;
        this.f26783c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.f26781a;
        cs csVar = this.d;
        switch (i3) {
            case 0:
                String[] strArr = MediaController.W1;
                g0.h3(new ii.j4(this.f26782b, this.f26783c, 7, (MediaController) csVar, tLObject, tL_error));
                return;
            case 1:
                hp hpVar = (hp) csVar;
                LongSparseIntArray longSparseIntArray = hpVar.Z0;
                int i10 = 0;
                if (tL_error == null) {
                    TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) tLObject;
                    if (updates_difference instanceof TLRPC.TL_updates_differenceTooLong) {
                        g0.h3(new k2.a0(hpVar, updates_difference, this.f26782b, this.f26783c, 4));
                        return;
                    }
                    if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                        TLRPC.TL_updates_state tL_updates_state = updates_difference.intermediate_state;
                        hpVar.Y0(tL_updates_state.pts, tL_updates_state.date, tL_updates_state.qts, true);
                    }
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i11 = 0; i11 < updates_difference.users.size(); i11++) {
                        TLRPC.User user = updates_difference.users.get(i11);
                        hVar.k(user, user.f27150id);
                    }
                    for (int i12 = 0; i12 < updates_difference.chats.size(); i12++) {
                        TLRPC.Chat chat = updates_difference.chats.get(i12);
                        hVar2.k(chat, chat.f27001id);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!updates_difference.other_updates.isEmpty()) {
                        while (i10 < updates_difference.other_updates.size()) {
                            TLRPC.Update update = updates_difference.other_updates.get(i10);
                            if (update instanceof TL_update.TL_updateMessageID) {
                                arrayList.add((TL_update.TL_updateMessageID) update);
                                updates_difference.other_updates.remove(i10);
                            } else {
                                if (hp.Y1(update) == 2) {
                                    long V1 = hp.V1(update);
                                    int i13 = longSparseIntArray.get(V1);
                                    if (i13 == 0 && (i13 = hpVar.getMessagesStorage().N(V1)) != 0) {
                                        longSparseIntArray.put(V1, i13);
                                    }
                                    if (i13 != 0 && hp.W1(update) <= i13) {
                                        updates_difference.other_updates.remove(i10);
                                    }
                                }
                                i10++;
                            }
                            i10--;
                            i10++;
                        }
                    }
                    g0.h3(new yh(26, hpVar, updates_difference));
                    hpVar.getMessagesStorage().f24934a.c(new cn(hpVar, updates_difference, arrayList, hVar, hVar2, 10));
                    return;
                }
                hpVar.f23013g2 = false;
                hpVar.getConnectionsManager().setIsUpdating(false);
                a8.b("received: isUpdating = false");
                return;
            default:
                g0.h3(new ap0((ws0) csVar, tL_error, this.f26782b, this.f26783c, tLObject, 0));
                return;
        }
    }
}
