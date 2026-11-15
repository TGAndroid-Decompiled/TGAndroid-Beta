package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class pa implements RequestDelegate {
    public final int f50190a;
    public final lb f50191b;

    public pa(lb lbVar, int i7) {
        this.f50190a = i7;
        this.f50191b = lbVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50190a) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final lb lbVar = this.f50191b;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    lb.Z(lbVar, tL_channels_adminLogResults);
                                    return;
                                default:
                                    lb.d0(lbVar, tL_channels_adminLogResults);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                lb lbVar2 = this.f50191b;
                lbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (arrayList.get(i7) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i7));
                        }
                    }
                    lbVar2.getMessagesController().Y3(arrayList2, false);
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.h3(new u5(9, this.f50191b, tLObject));
                return;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final lb lbVar3 = this.f50191b;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    lb.Z(lbVar3, tL_channels_adminLogResults2);
                                    return;
                                default:
                                    lb.d0(lbVar3, tL_channels_adminLogResults2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new o1(this.f50191b, tL_error, tLObject, 9));
                return;
        }
    }
}
