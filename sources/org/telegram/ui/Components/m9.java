package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class m9 {
    public static void a(org.telegram.ui.bo boVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11, int i12) {
        org.telegram.ui.ActionBar.e5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = boVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (l9 l9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || l9Var.f25862f != j3) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = l9Var.e) != null && tL_forumTopic2.f18173id == tL_forumTopic.f18173id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f25859a = org.telegram.ui.bo.class;
            obj.f25860b = i10;
            obj.f25862f = j3;
            obj.h = i12;
            obj.f25863g = i11;
            obj.f25861c = chat;
            obj.d = user;
            obj.e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.o1 b(org.telegram.ui.ActionBar.o2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.f6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m9.b(org.telegram.ui.ActionBar.o2, android.view.View, long, long, org.telegram.ui.ActionBar.f6):org.telegram.ui.ActionBar.o1");
    }
}
