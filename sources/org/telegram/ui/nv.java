package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class nv implements org.telegram.ui.Components.am0 {
    public final int f39996a;
    public final ey f39997b;

    public nv(ey eyVar, int i10) {
        this.f39996a = i10;
        this.f39997b = eyVar;
    }

    @Override
    public final void d(int i10, View view) {
        hg.o0 o0Var;
        switch (this.f39996a) {
            case 0:
                ey eyVar = this.f39997b;
                Object obj = eyVar.C0.f24818v0.G(i10).G;
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
                } else if (obj instanceof ci.t6) {
                    ci.t6 t6Var = (ci.t6) obj;
                    Bundle i11 = org.telegram.ui.Cells.b1.i(3, "type");
                    i11.putString("hashtag", t6Var.C);
                    i11.putInt("storiesCount", t6Var.J);
                    eyVar.presentFragment(new org.telegram.ui.Components.xa0(i11, null));
                    return;
                } else {
                    return;
                }
            default:
                ey eyVar2 = this.f39997b;
                eyVar2.f37043b0.I0(true);
                ArrayList arrayList = eyVar2.f37043b0.Y2;
                if (arrayList.isEmpty()) {
                    o0Var = hg.q0.f12042d3[i10];
                } else {
                    o0Var = (hg.o0) arrayList.get(i10);
                }
                eyVar2.f3(o0Var);
                return;
        }
    }
}
