package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class nb extends wb {
    public final yb V2;

    public nb(yb ybVar, Context context) {
        super(context, null);
        this.V2 = ybVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nb.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        yb ybVar = this.V2;
        if (ybVar.v != null && ybVar.f44436x != null && (i14 = ybVar.N0) >= 0) {
            if (ybVar.M0 != 0) {
                int i15 = 0;
                while (true) {
                    ub ubVar = ybVar.E;
                    if (i15 < ubVar.d) {
                        if (i15 >= ubVar.f42478f && i15 < ubVar.h) {
                            ArrayList arrayList = ubVar.f42479n.f44424o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - ubVar.f42478f)) - 1);
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.eventId == ybVar.M0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            ybVar.f44436x.i1(i14, ybVar.O0, true);
            ybVar.N0 = -1;
            ybVar.M0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
