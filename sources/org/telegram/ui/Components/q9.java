package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class q9 {
    public static void a(org.telegram.ui.zn znVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11, int i12) {
        org.telegram.ui.ActionBar.b5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = znVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (p9 p9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || p9Var.f29646f != j3) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = p9Var.f29645e) != null && tL_forumTopic2.f20084id == tL_forumTopic.f20084id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f29642a = org.telegram.ui.zn.class;
            obj.f29643b = i10;
            obj.f29646f = j3;
            obj.h = i12;
            obj.f29647g = i11;
            obj.f29644c = chat;
            obj.d = user;
            obj.f29645e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.m1 b(org.telegram.ui.ActionBar.m2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.d6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q9.b(org.telegram.ui.ActionBar.m2, android.view.View, long, long, org.telegram.ui.ActionBar.d6):org.telegram.ui.ActionBar.m1");
    }
}
