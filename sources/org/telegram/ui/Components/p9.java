package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class p9 {
    public static void a(org.telegram.ui.co coVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11, int i12) {
        org.telegram.ui.ActionBar.d5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = coVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (o9 o9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || o9Var.f29034f != j3) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = o9Var.f29033e) != null && tL_forumTopic2.f19948id == tL_forumTopic.f19948id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f29030a = org.telegram.ui.co.class;
            obj.f29031b = i10;
            obj.f29034f = j3;
            obj.h = i12;
            obj.f29035g = i11;
            obj.f29032c = chat;
            obj.d = user;
            obj.f29033e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.n1 b(org.telegram.ui.ActionBar.n2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.f6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p9.b(org.telegram.ui.ActionBar.n2, android.view.View, long, long, org.telegram.ui.ActionBar.f6):org.telegram.ui.ActionBar.n1");
    }
}
