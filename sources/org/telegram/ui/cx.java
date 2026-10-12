package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class cx implements o70 {
    public final yy f35083a;

    public cx(yy yyVar) {
        this.f35083a = yyVar;
    }

    @Override
    public final void a(p70 p70Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        yy yyVar = this.f35083a;
        sy syVar = yyVar.C2;
        if (yyVar.B2) {
            yyVar.removeSelfFromStack();
        }
        syVar.w(yyVar, arrayList, null, true, yyVar.J2, yyVar.K2, yyVar.L2, null);
    }
}
