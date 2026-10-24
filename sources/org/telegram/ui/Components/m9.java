package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class m9 {
    public static void a(org.telegram.ui.sn snVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11, int i12) {
        org.telegram.ui.ActionBar.h5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = snVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (l9 l9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || l9Var.f28275f != j10) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = l9Var.e) != null && tL_forumTopic2.f20396id == tL_forumTopic.f20396id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f28272a = org.telegram.ui.sn.class;
            obj.f28273b = i10;
            obj.f28275f = j10;
            obj.h = i12;
            obj.f28276g = i11;
            obj.f28274c = chat;
            obj.d = user;
            obj.e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.m1 b(org.telegram.ui.ActionBar.o2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.g6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m9.b(org.telegram.ui.ActionBar.o2, android.view.View, long, long, org.telegram.ui.ActionBar.g6):org.telegram.ui.ActionBar.m1");
    }
}
