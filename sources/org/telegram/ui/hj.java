package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class hj extends org.telegram.ui.Components.oo {
    public final qn f37682v0;

    public hj(qn qnVar, Context context, qn qnVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, qnVar2, z10, d6Var);
        this.f37682v0 = qnVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        qn qnVar = this.f37682v0;
        if (!qnVar.Pa && !qnVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inBubbleMode;
            if (!z10 && qnVar.f40728j0 != null && !qnVar.f40843s3) {
                if (!qnVar.K9() || qnVar.f40709h4) {
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
        qn qnVar = this.f37682v0;
        TLRPC.User user = qnVar.f40680f;
        if (user != null && user.linked_community_id != 0) {
            qnVar.showDialog(new hi.k0(qnVar, qnVar.f40680f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = qnVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            qnVar.showDialog(new hi.k0(qnVar, qnVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        qn qnVar = this.f37682v0;
        if (qnVar.J9()) {
            str = "";
        } else {
            str = null;
        }
        qnVar.qa(str);
    }

    @Override
    public final boolean o() {
        if (this.f37682v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
