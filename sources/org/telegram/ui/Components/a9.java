package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class a9 {
    public static void a(org.telegram.ui.an anVar, int i7, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i10, int i11) {
        org.telegram.ui.ActionBar.o4 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = anVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (z8 z8Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || z8Var.f42302f != j3) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = z8Var.f42301e) != null && tL_forumTopic2.f28103id == tL_forumTopic.f28103id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f42298a = org.telegram.ui.an.class;
            obj.f42299b = i7;
            obj.f42302f = j3;
            obj.h = i11;
            obj.f42303g = i10;
            obj.f42300c = chat;
            obj.d = user;
            obj.f42301e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.g1 b(org.telegram.ui.ActionBar.e2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.e6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a9.b(org.telegram.ui.ActionBar.e2, android.view.View, long, long, org.telegram.ui.ActionBar.e6):org.telegram.ui.ActionBar.g1");
    }
}
