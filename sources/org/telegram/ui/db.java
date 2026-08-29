package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class db extends mb {
    public final ob T2;

    public db(ob obVar, Context context) {
        super(context, null);
        this.T2 = obVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.db.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        ob obVar = this.T2;
        if (obVar.A != null && obVar.C != null && (i14 = obVar.N0) >= 0) {
            if (obVar.M0 != 0) {
                int i15 = 0;
                while (true) {
                    kb kbVar = obVar.E;
                    if (i15 < kbVar.d) {
                        if (i15 >= kbVar.f39828f && i15 < kbVar.h) {
                            ArrayList arrayList = kbVar.f39829n.f41061o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - kbVar.f39828f)) - 1);
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.eventId == obVar.M0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            obVar.C.i1(i14, obVar.O0, true);
            obVar.N0 = -1;
            obVar.M0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
