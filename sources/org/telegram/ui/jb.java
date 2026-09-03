package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class jb extends sb {
    public final ub U2;

    public jb(ub ubVar, Context context) {
        super(context, null);
        this.U2 = ubVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jb.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        ub ubVar = this.U2;
        if (ubVar.B != null && ubVar.D != null && (i14 = ubVar.O0) >= 0) {
            if (ubVar.N0 != 0) {
                int i15 = 0;
                while (true) {
                    qb qbVar = ubVar.F;
                    if (i15 < qbVar.d) {
                        if (i15 >= qbVar.f37373f && i15 < qbVar.h) {
                            ArrayList arrayList = qbVar.f37374n.f38748p0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - qbVar.f37373f)) - 1);
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.eventId == ubVar.N0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            ubVar.D.i1(i14, ubVar.P0, true);
            ubVar.O0 = -1;
            ubVar.N0 = 0L;
        }
        super.onLayout(z4, i10, i11, i12, i13);
    }
}
