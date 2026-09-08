package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qh implements e2.h {
    public final int f39900a;
    public final Object f39901b;
    public final Object f39902c;
    public final Object d;

    public qh(Object obj, Object obj2, Object obj3, int i10) {
        this.f39900a = i10;
        this.f39902c = obj;
        this.d = obj2;
        this.f39901b = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        int i10 = this.f39900a;
        Object obj2 = this.f39901b;
        Object obj3 = this.d;
        Object obj4 = this.f39902c;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                co.x0((co) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 1:
                Boolean bool2 = (Boolean) obj;
                uy.W((uy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                of.e eVar = (of.e) obj3;
                int[] iArr = (int[]) obj2;
                Long l4 = (Long) obj;
                Pattern pattern = LaunchActivity.B1;
                if (eVar != null) {
                    launchActivity.getClass();
                    eVar.b();
                }
                if (MessagesController.getInstance(launchActivity.O).getUserOrChat(l4.longValue()) == null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null && (R instanceof co)) {
                        ((co) R).qb();
                        return;
                    }
                    return;
                }
                new yh.p1(launchActivity, iArr[0], l4.longValue(), null, null).show();
                return;
            default:
                fc0 fc0Var = (fc0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                org.telegram.ui.Components.in0 in0Var = (org.telegram.ui.Components.in0) obj2;
                Long l10 = (Long) obj;
                if (l10 == null) {
                    user = null;
                } else {
                    user = MessagesController.getInstance(fc0Var.f36395b).getUser(l10);
                }
                userArr[0] = user;
                if (user == null) {
                    fc0Var.a();
                    org.telegram.messenger.w1.p(R.string.NoUsernameFound, fc0.b(), null);
                    return;
                }
                in0Var.run();
                return;
        }
    }

    public qh(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.f39900a = 1;
        this.f39902c = uyVar;
        this.f39901b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
