package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ov implements org.telegram.ui.Components.zk0 {
    public final int f41229a;
    public final fy f41230b;

    public ov(fy fyVar, int i10) {
        this.f41229a = i10;
        this.f41230b = fyVar;
    }

    @Override
    public final void c(int i10, View view) {
        rf.f0 f0Var;
        switch (this.f41229a) {
            case 0:
                fy fyVar = this.f41230b;
                Object obj = fyVar.f38377y0.f33004r0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    tn tnVar = new tn(bundle);
                    fy.d4(tnVar, messageObject);
                    fyVar.presentFragment(tnVar);
                    return;
                } else if (obj instanceof lh.e6) {
                    lh.e6 e6Var = (lh.e6) obj;
                    Bundle h = a4.w.h(3, "type");
                    h.putString("hashtag", e6Var.C);
                    h.putInt("storiesCount", e6Var.J);
                    fyVar.presentFragment(new org.telegram.ui.Components.y90(h, null));
                    return;
                } else {
                    return;
                }
            default:
                fy fyVar2 = this.f41230b;
                fyVar2.X.I0(true);
                ArrayList arrayList = fyVar2.X.T2;
                if (arrayList.isEmpty()) {
                    f0Var = rf.h0.Y2[i10];
                } else {
                    f0Var = (rf.f0) arrayList.get(i10);
                }
                fyVar2.j3(f0Var);
                return;
        }
    }
}
