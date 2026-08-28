package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class dj extends org.telegram.ui.Components.tn {
    public final qn f37554r0;

    public dj(qn qnVar, Context context, qn qnVar2, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, qnVar2, z10, b6Var);
        this.f37554r0 = qnVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        qn qnVar = this.f37554r0;
        if (!qnVar.Ka && !qnVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inBubbleMode;
            if (!z10 && qnVar.f41904f0 != null && !qnVar.f42018o3) {
                if (!qnVar.F9() || qnVar.f41882d4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean d() {
        qn qnVar = this.f37554r0;
        TLRPC.User user = qnVar.f41903f;
        if (user != null && user.linked_community_id != 0) {
            qnVar.showDialog(new nh.j0(qnVar, qnVar.f41903f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = qnVar.f41890e;
        if (chat != null && chat.linked_community_id != 0) {
            qnVar.showDialog(new nh.j0(qnVar, qnVar.f41890e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        qn qnVar = this.f37554r0;
        if (qnVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        qnVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f37554r0.N3 == 3) {
            return true;
        }
        return false;
    }
}
