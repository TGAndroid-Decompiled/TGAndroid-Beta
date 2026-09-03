package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class qa implements RequestDelegate {
    public final int f40411a;
    public final sb f40412b;

    public qa(sb sbVar, int i10) {
        this.f40411a = i10;
        this.f40412b = sbVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40411a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1(this.f40412b, tL_error, tLObject, 9));
                return;
            case 1:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final sb sbVar = this.f40412b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    sb.U(sbVar, tL_channels_adminLogResults);
                                    return;
                                default:
                                    sb.Y(sbVar, tL_channels_adminLogResults);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 2:
                sb sbVar2 = this.f40412b;
                sbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i10));
                        }
                    }
                    sbVar2.getMessagesController().putUsers(arrayList2, false);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(27, this.f40412b, tLObject));
                return;
            default:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final sb sbVar3 = this.f40412b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    sb.U(sbVar3, tL_channels_adminLogResults2);
                                    return;
                                default:
                                    sb.Y(sbVar3, tL_channels_adminLogResults2);
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
