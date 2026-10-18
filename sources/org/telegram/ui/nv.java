package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class nv implements org.telegram.ui.Components.wl0 {
    public final int f39586a;
    public final ey f39587b;

    public nv(ey eyVar, int i10) {
        this.f39586a = i10;
        this.f39587b = eyVar;
    }

    @Override
    public final void a(int i10, View view) {
        hg.o0 o0Var;
        switch (this.f39586a) {
            case 0:
                ey eyVar = this.f39587b;
                Object obj = eyVar.C0.f31366v0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    sn snVar = new sn(bundle);
                    ey.b4(snVar, messageObject);
                    eyVar.presentFragment(snVar);
                    return;
                } else if (obj instanceof ci.u6) {
                    ci.u6 u6Var = (ci.u6) obj;
                    Bundle i11 = org.telegram.ui.Cells.c1.i(3, "type");
                    i11.putString("hashtag", u6Var.C);
                    i11.putInt("storiesCount", u6Var.J);
                    eyVar.presentFragment(new org.telegram.ui.Components.wa0(i11, null));
                    return;
                } else {
                    return;
                }
            default:
                ey eyVar2 = this.f39587b;
                eyVar2.f36637b0.I0(true);
                ArrayList arrayList = eyVar2.f36637b0.V2;
                if (arrayList.isEmpty()) {
                    o0Var = hg.q0.f12018a3[i10];
                } else {
                    o0Var = (hg.o0) arrayList.get(i10);
                }
                eyVar2.g3(o0Var);
                return;
        }
    }
}
