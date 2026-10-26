package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class q9 {
    public static void a(org.telegram.ui.un unVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11, int i12) {
        org.telegram.ui.ActionBar.j5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = unVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (p9 p9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || p9Var.f31474f != j10) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = p9Var.e) != null && tL_forumTopic2.f22079id == tL_forumTopic.f22079id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f31471a = org.telegram.ui.un.class;
            obj.f31472b = i10;
            obj.f31474f = j10;
            obj.h = i12;
            obj.f31475g = i11;
            obj.f31473c = chat;
            obj.d = user;
            obj.e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.o1 b(org.telegram.ui.ActionBar.r2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.u6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q9.b(org.telegram.ui.ActionBar.r2, android.view.View, long, long, org.telegram.ui.ActionBar.u6):org.telegram.ui.ActionBar.o1");
    }
}
