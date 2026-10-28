package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class nv implements org.telegram.ui.Components.am0 {
    public final int f41903a;
    public final ey f41904b;

    public nv(ey eyVar, int i10) {
        this.f41903a = i10;
        this.f41904b = eyVar;
    }

    @Override
    public final void c(int i10, View view) {
        ig.p0 p0Var;
        switch (this.f41903a) {
            case 0:
                ey eyVar = this.f41904b;
                Object obj = eyVar.C0.f28263x0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    wn wnVar = new wn(bundle);
                    ey.l4(wnVar, messageObject);
                    eyVar.presentFragment(wnVar);
                    return;
                } else if (obj instanceof di.t6) {
                    di.t6 t6Var = (di.t6) obj;
                    Bundle g7 = org.telegram.ui.Components.b10.g(3, "type");
                    g7.putString("hashtag", t6Var.C);
                    g7.putInt("storiesCount", t6Var.J);
                    eyVar.presentFragment(new org.telegram.ui.Components.ua0(g7, null));
                    return;
                } else {
                    return;
                }
            default:
                ey eyVar2 = this.f41904b;
                eyVar2.f38982b0.I0(true);
                ArrayList arrayList = eyVar2.f38982b0.f14219f3;
                if (arrayList.isEmpty()) {
                    p0Var = ig.r0.f14212k3[i10];
                } else {
                    p0Var = (ig.p0) arrayList.get(i10);
                }
                eyVar2.q3(p0Var);
                return;
        }
    }
}
