package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class cw implements org.telegram.ui.Components.jl0 {
    public final int f31780a;
    public final wy f31781b;

    public cw(wy wyVar, int i10) {
        this.f31780a = i10;
        this.f31781b = wyVar;
    }

    @Override
    public final void d(int i10, View view) {
        fg.q0 q0Var;
        switch (this.f31780a) {
            case 0:
                wy wyVar = this.f31781b;
                Object obj = wyVar.C0.f23732v0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    eo eoVar = new eo(bundle);
                    wy.d4(eoVar, messageObject);
                    wyVar.presentFragment(eoVar);
                    return;
                } else if (obj instanceof zh.u4) {
                    zh.u4 u4Var = (zh.u4) obj;
                    Bundle e = org.telegram.ui.Cells.r6.e(3, "type");
                    e.putString("hashtag", u4Var.C);
                    e.putInt("storiesCount", u4Var.J);
                    wyVar.presentFragment(new org.telegram.ui.Components.la0(e, null));
                    return;
                } else {
                    return;
                }
            default:
                wy wyVar2 = this.f31781b;
                wyVar2.f38415b0.I0(true);
                ArrayList arrayList = wyVar2.f38415b0.X2;
                if (arrayList.isEmpty()) {
                    q0Var = fg.s0.f8199c3[i10];
                } else {
                    q0Var = (fg.q0) arrayList.get(i10);
                }
                wyVar2.j3(q0Var);
                return;
        }
    }
}
