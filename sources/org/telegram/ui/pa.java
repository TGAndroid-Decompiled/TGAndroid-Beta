package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class pa implements RequestDelegate {
    public final int f48721a;
    public final mb f48722b;

    public pa(mb mbVar, int i7) {
        this.f48721a = i7;
        this.f48722b = mbVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48721a) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final mb mbVar = this.f48722b;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    mb.Z(mbVar, tL_channels_adminLogResults);
                                    return;
                                default:
                                    mb.d0(mbVar, tL_channels_adminLogResults);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                mb mbVar2 = this.f48722b;
                mbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (arrayList.get(i7) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i7));
                        }
                    }
                    mbVar2.getMessagesController().Y3(arrayList2, false);
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(20, this.f48722b, tLObject));
                return;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final mb mbVar3 = this.f48722b;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    mb.Z(mbVar3, tL_channels_adminLogResults2);
                                    return;
                                default:
                                    mb.d0(mbVar3, tL_channels_adminLogResults2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new o1(this.f48722b, tL_error, tLObject, 9));
                return;
        }
    }
}
