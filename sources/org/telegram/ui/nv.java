package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class nv implements org.telegram.ui.Components.zl0 {
    public final int f39998a;
    public final ey f39999b;

    public nv(ey eyVar, int i10) {
        this.f39998a = i10;
        this.f39999b = eyVar;
    }

    @Override
    public final void d(int i10, View view) {
        hg.o0 o0Var;
        switch (this.f39998a) {
            case 0:
                ey eyVar = this.f39999b;
                Object obj = eyVar.C0.f33322v0.G(i10).G;
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
                    eyVar.presentFragment(new org.telegram.ui.Components.va0(i11, null));
                    return;
                } else {
                    return;
                }
            default:
                ey eyVar2 = this.f39999b;
                eyVar2.f37018b0.I0(true);
                ArrayList arrayList = eyVar2.f37018b0.Y2;
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
