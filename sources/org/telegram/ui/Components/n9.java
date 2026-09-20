package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class n9 {
    public static void a(org.telegram.ui.zn znVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11, int i12) {
        org.telegram.ui.ActionBar.d5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = znVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (m9 m9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || m9Var.f26351f != j3) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = m9Var.e) != null && tL_forumTopic2.f18380id == tL_forumTopic.f18380id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f26348a = org.telegram.ui.zn.class;
            obj.f26349b = i10;
            obj.f26351f = j3;
            obj.h = i12;
            obj.f26352g = i11;
            obj.f26350c = chat;
            obj.d = user;
            obj.e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.n1 b(org.telegram.ui.ActionBar.n2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.f6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n9.b(org.telegram.ui.ActionBar.n2, android.view.View, long, long, org.telegram.ui.ActionBar.f6):org.telegram.ui.ActionBar.n1");
    }
}
