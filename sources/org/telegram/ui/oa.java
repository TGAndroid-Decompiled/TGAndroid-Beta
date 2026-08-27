package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

public final class oa implements RequestDelegate {

    public final int f41044a;

    public final qb f41045b;

    public oa(qb qbVar, int i10) {
        this.f41044a = i10;
        this.f41045b = qbVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41044a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1(this.f41045b, tL_error, tLObject, 9));
                break;
            case 1:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i10 = 1;
                    final qb qbVar = this.f41045b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    qb.U(qbVar, tL_channels_adminLogResults);
                                    break;
                                default:
                                    qb.Y(qbVar, tL_channels_adminLogResults);
                                    break;
                            }
                        }
                    });
                }
                break;
            case 2:
                qb qbVar2 = this.f41045b;
                qbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i11));
                        }
                    }
                    qbVar2.getMessagesController().putUsers(arrayList2, false);
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(23, this.f41045b, tLObject));
                break;
            default:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i12 = 0;
                    final qb qbVar3 = this.f41045b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    qb.U(qbVar3, tL_channels_adminLogResults2);
                                    break;
                                default:
                                    qb.Y(qbVar3, tL_channels_adminLogResults2);
                                    break;
                            }
                        }
                    });
                }
                break;
        }
    }
}
