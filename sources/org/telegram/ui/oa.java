package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class oa implements RequestDelegate {
    public final int f48242a;
    public final kb f48243b;

    public oa(kb kbVar, int i3) {
        this.f48242a = i3;
        this.f48243b = kbVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48242a) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final kb kbVar = this.f48243b;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    kb.Z(kbVar, tL_channels_adminLogResults);
                                    return;
                                default:
                                    kb.d0(kbVar, tL_channels_adminLogResults);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                kb kbVar2 = this.f48243b;
                kbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (arrayList.get(i3) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i3));
                        }
                    }
                    kbVar2.getMessagesController().Y3(arrayList2, false);
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(25, this.f48243b, tLObject));
                return;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final kb kbVar3 = this.f48243b;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    kb.Z(kbVar3, tL_channels_adminLogResults2);
                                    return;
                                default:
                                    kb.d0(kbVar3, tL_channels_adminLogResults2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new p1(this.f48243b, tL_error, tLObject, 9));
                return;
        }
    }
}
