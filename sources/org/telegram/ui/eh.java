package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class eh implements d5.d {
    public final int f37945a;
    public final Object f37946b;
    public final Object f37947c;
    public final Object d;

    public eh(Object obj, Object obj2, Object obj3, int i9) {
        this.f37945a = i9;
        this.f37947c = obj;
        this.d = obj2;
        this.f37946b = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        int i9 = this.f37945a;
        Object obj2 = this.f37946b;
        Object obj3 = this.d;
        Object obj4 = this.f37947c;
        switch (i9) {
            case 0:
                Boolean bool = (Boolean) obj;
                qn.o0((qn) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 1:
                Boolean bool2 = (Boolean) obj;
                dy.A0((dy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ve.d dVar = (ve.d) obj3;
                int[] iArr = (int[]) obj2;
                Long l10 = (Long) obj;
                Pattern pattern = LaunchActivity.f35493x1;
                if (dVar != null) {
                    launchActivity.getClass();
                    dVar.b();
                }
                if (MessagesController.getInstance(launchActivity.K).getUserOrChat(l10.longValue()) == null) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != null && (R instanceof qn)) {
                        ((qn) R).qb();
                        return;
                    }
                    return;
                }
                new fh.p2(launchActivity, iArr[0], l10.longValue(), null, null).show();
                return;
            default:
                kb0 kb0Var = (kb0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                org.telegram.ui.Components.no0 no0Var = (org.telegram.ui.Components.no0) obj2;
                Long l11 = (Long) obj;
                if (l11 == null) {
                    user = null;
                } else {
                    user = MessagesController.getInstance(kb0Var.f39791b).getUser(l11);
                }
                userArr[0] = user;
                if (user == null) {
                    kb0Var.a();
                    org.telegram.messenger.ll.p(R.string.NoUsernameFound, kb0.b(), null);
                    return;
                }
                no0Var.run();
                return;
        }
    }

    public eh(dy dyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.f37945a = 1;
        this.f37947c = dyVar;
        this.f37946b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
