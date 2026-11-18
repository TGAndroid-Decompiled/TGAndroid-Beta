package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class i9 {
    public static void a(org.telegram.ui.bn bnVar, int i7, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i10, int i11) {
        org.telegram.ui.ActionBar.s4 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = bnVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (h9 h9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || h9Var.f35823f != j3) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = h9Var.f35822e) != null && tL_forumTopic2.f28457id == tL_forumTopic.f28457id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f35819a = org.telegram.ui.bn.class;
            obj.f35820b = i7;
            obj.f35823f = j3;
            obj.h = i11;
            obj.f35824g = i10;
            obj.f35821c = chat;
            obj.d = user;
            obj.f35822e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.h1 b(org.telegram.ui.ActionBar.h2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.i6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i9.b(org.telegram.ui.ActionBar.h2, android.view.View, long, long, org.telegram.ui.ActionBar.i6):org.telegram.ui.ActionBar.h1");
    }
}
