package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class r9 {
    public static void a(org.telegram.ui.fo foVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11, int i12) {
        org.telegram.ui.ActionBar.b5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = foVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (q9 q9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || q9Var.f28245f != j10) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = q9Var.e) != null && tL_forumTopic2.f18968id == tL_forumTopic.f18968id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f28242a = org.telegram.ui.fo.class;
            obj.f28243b = i10;
            obj.f28245f = j10;
            obj.h = i12;
            obj.f28246g = i11;
            obj.f28244c = chat;
            obj.d = user;
            obj.e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.m1 b(org.telegram.ui.ActionBar.m2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.c6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r9.b(org.telegram.ui.ActionBar.m2, android.view.View, long, long, org.telegram.ui.ActionBar.c6):org.telegram.ui.ActionBar.m1");
    }
}
