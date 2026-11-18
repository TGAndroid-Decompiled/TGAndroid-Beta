package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
public final class ig extends org.telegram.ui.oq0 {
    public boolean f36123a;
    public final org.telegram.messenger.ef f36124b;
    public final File f36125c;
    public final jg d;

    public ig(jg jgVar, org.telegram.messenger.ef efVar, File file) {
        this.d = jgVar;
        this.f36124b = efVar;
        this.f36125c = file;
    }

    @Override
    public final void G() {
        if (!this.f36123a) {
            try {
                this.f36125c.delete();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        String str;
        org.telegram.messenger.fj threadMessage;
        org.telegram.messenger.bw bwVar;
        String str2;
        org.telegram.ui.bn bnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.f36431f2;
        org.telegram.ui.rm rmVar = chatActivityEnterView.J3;
        if (rmVar != null && (bnVar = chatActivityEnterView.D3) != null && rmVar.f51644f) {
            bnVar.yc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        org.telegram.messenger.ef efVar = this.f36124b;
        if (!efVar.f27847b && (str2 = efVar.h) != null) {
            obj.f28211c = str2;
        } else {
            String str3 = efVar.I;
            if (str3 != null) {
                obj.f28211c = str3;
            }
        }
        obj.f28212e = efVar.f27848c;
        obj.f28222p = efVar.d();
        obj.f28221o = efVar.f27847b;
        obj.f28223q = efVar.j();
        obj.f28231z = efVar.f27856m;
        obj.A = efVar.P;
        CharSequence charSequence = efVar.f27846a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.f28215i = efVar.f27857n;
        obj.f28216j = efVar.f27861r;
        obj.h = efVar.f27866x;
        obj.f28217k = e20Var;
        obj.f28224r = true;
        arrayList.add(obj);
        efVar.e();
        this.f36123a = true;
        boolean h = org.telegram.messenger.zy.h(obj.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.S;
        org.telegram.messenger.kj kjVar = null;
        long j3 = chatActivityEnterView.E3;
        org.telegram.messenger.fj fjVar = chatActivityEnterView.H3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.rm rmVar2 = chatActivityEnterView.J3;
        org.telegram.messenger.fj fjVar2 = chatActivityEnterView.N2;
        org.telegram.ui.bn bnVar2 = chatActivityEnterView.D3;
        if (bnVar2 != null) {
            bwVar = bnVar2.Y8();
        } else {
            bwVar = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.bn bnVar3 = chatActivityEnterView.D3;
        if (bnVar3 != null) {
            kjVar = bnVar3.f46241y5;
        }
        org.telegram.messenger.zy.X(cVar, arrayList, j3, fjVar, threadMessage, null, rmVar2, false, false, fjVar2, null, z10, i10, i11, h, null, bwVar, 0L, false, 0L, sendMonoForumPeerId, kjVar, null, false);
        kg kgVar = chatActivityEnterView.N3;
        if (kgVar != null) {
            kgVar.H(null, true, i10, i11, 0L);
        }
    }
}
