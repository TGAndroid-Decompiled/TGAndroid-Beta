package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class bb implements RequestDelegate {
    public final int f34499a;
    public final ac f34500b;

    public bb(ac acVar, int i10) {
        this.f34499a = i10;
        this.f34500b = acVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34499a) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final ac acVar = this.f34500b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ac.U(acVar, tL_channels_adminLogResults);
                                    return;
                                default:
                                    ac.Y(acVar, tL_channels_adminLogResults);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                ac acVar2 = this.f34500b;
                acVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i10));
                        }
                    }
                    acVar2.getMessagesController().putUsers(arrayList2, false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j(29, this.f34500b, tLObject));
                return;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final ac acVar3 = this.f34500b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ac.U(acVar3, tL_channels_adminLogResults2);
                                    return;
                                default:
                                    ac.Y(acVar3, tL_channels_adminLogResults2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new t1(this.f34500b, tL_error, tLObject, 9));
                return;
        }
    }
}
