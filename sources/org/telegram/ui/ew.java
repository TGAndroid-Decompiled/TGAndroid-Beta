package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ew implements org.telegram.ui.Components.am0 {
    public final int f35394a;
    public final yy f35395b;

    public ew(yy yyVar, int i10) {
        this.f35394a = i10;
        this.f35395b = yyVar;
    }

    @Override
    public final void a(int i10, View view) {
        hg.p0 p0Var;
        switch (this.f35394a) {
            case 0:
                yy yyVar = this.f35395b;
                Object obj = yyVar.C0.f31637v0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    fo foVar = new fo(bundle);
                    yy.b4(foVar, messageObject);
                    yyVar.presentFragment(foVar);
                    return;
                } else if (obj instanceof bi.g8) {
                    bi.g8 g8Var = (bi.g8) obj;
                    Bundle f7 = org.telegram.ui.Cells.c1.f(3, "type");
                    f7.putString("hashtag", g8Var.C);
                    f7.putInt("storiesCount", g8Var.J);
                    yyVar.presentFragment(new org.telegram.ui.Components.cb0(f7, null));
                    return;
                } else {
                    return;
                }
            default:
                yy yyVar2 = this.f35395b;
                yyVar2.f41988b0.I0(true);
                ArrayList arrayList = yyVar2.f41988b0.V2;
                if (arrayList.isEmpty()) {
                    p0Var = hg.r0.f10718a3[i10];
                } else {
                    p0Var = (hg.p0) arrayList.get(i10);
                }
                yyVar2.g3(p0Var);
                return;
        }
    }
}
