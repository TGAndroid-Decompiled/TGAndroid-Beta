package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class eb extends nb {
    public final pb T2;

    public eb(pb pbVar, Context context) {
        super(context, null);
        this.T2 = pbVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eb.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        MessageObject messageObject;
        pb pbVar = this.T2;
        if (pbVar.A != null && pbVar.C != null && (i13 = pbVar.N0) >= 0) {
            if (pbVar.M0 != 0) {
                int i14 = 0;
                while (true) {
                    lb lbVar = pbVar.E;
                    if (i14 < lbVar.d) {
                        if (i14 >= lbVar.f40102f && i14 < lbVar.h) {
                            ArrayList arrayList = lbVar.f40103n.f41413o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i14 - lbVar.f40102f)) - 1);
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.eventId == pbVar.M0) {
                            i13 = i14;
                            break;
                        }
                        i14++;
                    } else {
                        break;
                    }
                }
            }
            pbVar.C.i1(i13, pbVar.O0, true);
            pbVar.N0 = -1;
            pbVar.M0 = 0L;
        }
        super.onLayout(z10, i9, i10, i11, i12);
    }
}
