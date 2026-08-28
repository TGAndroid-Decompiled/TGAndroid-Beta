package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class na implements RequestDelegate {
    public final int f40677a;
    public final pb f40678b;

    public na(pb pbVar, int i9) {
        this.f40677a = i9;
        this.f40678b = pbVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40677a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1(this.f40678b, tL_error, tLObject, 9));
                return;
            case 1:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final pb pbVar = this.f40678b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    pb.T(pbVar, tL_channels_adminLogResults);
                                    return;
                                default:
                                    pb.X(pbVar, tL_channels_adminLogResults);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 2:
                pb pbVar2 = this.f40678b;
                pbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        if (arrayList.get(i9) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i9));
                        }
                    }
                    pbVar2.getMessagesController().putUsers(arrayList2, false);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(23, this.f40678b, tLObject));
                return;
            default:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final pb pbVar3 = this.f40678b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    pb.T(pbVar3, tL_channels_adminLogResults2);
                                    return;
                                default:
                                    pb.X(pbVar3, tL_channels_adminLogResults2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
        }
    }
}
