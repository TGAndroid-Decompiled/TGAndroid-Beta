package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
public final class kg extends org.telegram.ui.oq0 {
    public boolean f36738a;
    public final org.telegram.messenger.ef f36739b;
    public final File f36740c;
    public final lg d;

    public kg(lg lgVar, org.telegram.messenger.ef efVar, File file) {
        this.d = lgVar;
        this.f36739b = efVar;
        this.f36740c = file;
    }

    @Override
    public final void G() {
        if (!this.f36738a) {
            try {
                this.f36740c.delete();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        String str;
        org.telegram.messenger.fj threadMessage;
        org.telegram.messenger.bw bwVar;
        String str2;
        org.telegram.ui.bn bnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.f37124f2;
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        if (rmVar != null && (bnVar = chatActivityEnterView.F3) != null && rmVar.f51750f) {
            bnVar.yc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        org.telegram.messenger.ef efVar = this.f36739b;
        if (!efVar.f27963b && (str2 = efVar.h) != null) {
            obj.f28311c = str2;
        } else {
            String str3 = efVar.I;
            if (str3 != null) {
                obj.f28311c = str3;
            }
        }
        obj.f28312e = efVar.f27964c;
        obj.f28322p = efVar.d();
        obj.f28321o = efVar.f27963b;
        obj.f28323q = efVar.j();
        obj.f28331z = efVar.f27972m;
        obj.A = efVar.P;
        CharSequence charSequence = efVar.f27962a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.f28315i = efVar.f27973n;
        obj.f28316j = efVar.f27977r;
        obj.h = efVar.f27982x;
        obj.f28317k = d20Var;
        obj.f28324r = true;
        arrayList.add(obj);
        efVar.e();
        this.f36738a = true;
        boolean h = org.telegram.messenger.zy.h(obj.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.S;
        org.telegram.messenger.kj kjVar = null;
        long j3 = chatActivityEnterView.G3;
        org.telegram.messenger.fj fjVar = chatActivityEnterView.J3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.rm rmVar2 = chatActivityEnterView.L3;
        org.telegram.messenger.fj fjVar2 = chatActivityEnterView.P2;
        org.telegram.ui.bn bnVar2 = chatActivityEnterView.F3;
        if (bnVar2 != null) {
            bwVar = bnVar2.Y8();
        } else {
            bwVar = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.bn bnVar3 = chatActivityEnterView.F3;
        if (bnVar3 != null) {
            kjVar = bnVar3.f46436y5;
        }
        org.telegram.messenger.zy.X(cVar, arrayList, j3, fjVar, threadMessage, null, rmVar2, false, false, fjVar2, null, z10, i10, i11, h, null, bwVar, 0L, false, 0L, sendMonoForumPeerId, kjVar, null, false);
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar != null) {
            mgVar.G(null, true, i10, i11, 0L);
        }
    }
}
