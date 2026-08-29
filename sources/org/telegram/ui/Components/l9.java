package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class l9 {
    public static void a(org.telegram.ui.tn tnVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11, int i12) {
        org.telegram.ui.ActionBar.b5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = tnVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (k9 k9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || k9Var.f29973f != j10) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = k9Var.f29972e) != null && tL_forumTopic2.f22444id == tL_forumTopic.f22444id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f29969a = org.telegram.ui.tn.class;
            obj.f29970b = i10;
            obj.f29973f = j10;
            obj.h = i12;
            obj.f29974g = i11;
            obj.f29971c = chat;
            obj.d = user;
            obj.f29972e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.o1 b(org.telegram.ui.ActionBar.o2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.c6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l9.b(org.telegram.ui.ActionBar.o2, android.view.View, long, long, org.telegram.ui.ActionBar.c6):org.telegram.ui.ActionBar.o1");
    }
}
