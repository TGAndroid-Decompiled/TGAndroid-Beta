package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class pb extends yb {
    public final ac V2;

    public pb(ac acVar, Context context) {
        super(context, null);
        this.V2 = acVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pb.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        ac acVar = this.V2;
        if (acVar.v != null && acVar.f33864x != null && (i14 = acVar.N0) >= 0) {
            if (acVar.M0 != 0) {
                int i15 = 0;
                while (true) {
                    wb wbVar = acVar.E;
                    if (i15 < wbVar.d) {
                        if (i15 >= wbVar.f40913f && i15 < wbVar.h) {
                            ArrayList arrayList = wbVar.f40914n.f33852o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - wbVar.f40913f)) - 1);
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.eventId == acVar.M0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            acVar.f33864x.i1(i14, acVar.O0, true);
            acVar.N0 = -1;
            acVar.M0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
