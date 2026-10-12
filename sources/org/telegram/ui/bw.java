package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class bw implements org.telegram.ui.Components.km0 {
    public final int f36270a;
    public final vy f36271b;

    public bw(vy vyVar, int i10) {
        this.f36270a = i10;
        this.f36271b = vyVar;
    }

    @Override
    public final void d(int i10, View view) {
        gg.p0 p0Var;
        switch (this.f36270a) {
            case 0:
                vy vyVar = this.f36271b;
                Object obj = vyVar.C0.f27617v0.G(i10).G;
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
                    vy.a4(eoVar, messageObject);
                    vyVar.presentFragment(eoVar);
                    return;
                } else if (obj instanceof ai.w8) {
                    ai.w8 w8Var = (ai.w8) obj;
                    Bundle f7 = org.telegram.ui.Cells.c1.f(3, "type");
                    f7.putString("hashtag", w8Var.C);
                    f7.putInt("storiesCount", w8Var.J);
                    vyVar.presentFragment(new org.telegram.ui.Components.hb0(f7, null));
                    return;
                } else {
                    return;
                }
            default:
                vy vyVar2 = this.f36271b;
                vyVar2.f42888b0.I0(true);
                ArrayList arrayList = vyVar2.f42888b0.V2;
                if (arrayList.isEmpty()) {
                    p0Var = gg.r0.f10777a3[i10];
                } else {
                    p0Var = (gg.p0) arrayList.get(i10);
                }
                vyVar2.g3(p0Var);
                return;
        }
    }
}
