package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class eh implements f5.d {
    public final int f37824a;
    public final Object f37825b;
    public final Object f37826c;
    public final Object d;

    public eh(Object obj, Object obj2, Object obj3, int i10) {
        this.f37824a = i10;
        this.f37826c = obj;
        this.d = obj2;
        this.f37825b = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        int i10 = this.f37824a;
        Object obj2 = this.f37825b;
        Object obj3 = this.d;
        Object obj4 = this.f37826c;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                tn.p0((tn) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 1:
                Boolean bool2 = (Boolean) obj;
                fy.B0((fy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ye.c cVar = (ye.c) obj3;
                int[] iArr = (int[]) obj2;
                Long l10 = (Long) obj;
                Pattern pattern = LaunchActivity.f35560x1;
                if (cVar != null) {
                    launchActivity.getClass();
                    cVar.b();
                }
                if (MessagesController.getInstance(launchActivity.K).getUserOrChat(l10.longValue()) == null) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != null && (R instanceof tn)) {
                        ((tn) R).qb();
                        return;
                    }
                    return;
                }
                new ih.h2(launchActivity, iArr[0], l10.longValue(), null, null).show();
                return;
            default:
                mb0 mb0Var = (mb0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                n20 n20Var = (n20) obj2;
                Long l11 = (Long) obj;
                if (l11 == null) {
                    user = null;
                } else {
                    user = MessagesController.getInstance(mb0Var.f40514b).getUser(l11);
                }
                userArr[0] = user;
                if (user == null) {
                    mb0Var.a();
                    org.telegram.messenger.x3.s(R.string.NoUsernameFound, mb0.b(), null);
                    return;
                }
                n20Var.run();
                return;
        }
    }

    public eh(fy fyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.f37824a = 1;
        this.f37826c = fyVar;
        this.f37825b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
