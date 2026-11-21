package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
public final class lg extends org.telegram.ui.oq0 {
    public boolean f37175a;
    public final org.telegram.messenger.ef f37176b;
    public final File f37177c;
    public final mg d;

    public lg(mg mgVar, org.telegram.messenger.ef efVar, File file) {
        this.d = mgVar;
        this.f37176b = efVar;
        this.f37177c = file;
    }

    @Override
    public final void G() {
        if (!this.f37175a) {
            try {
                this.f37177c.delete();
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
        ChatActivityEnterView chatActivityEnterView = this.d.f37510f2;
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        if (rmVar != null && (bnVar = chatActivityEnterView.F3) != null && rmVar.f51619f) {
            bnVar.yc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        org.telegram.messenger.ef efVar = this.f37176b;
        if (!efVar.f27875b && (str2 = efVar.h) != null) {
            obj.f28239c = str2;
        } else {
            String str3 = efVar.I;
            if (str3 != null) {
                obj.f28239c = str3;
            }
        }
        obj.f28240e = efVar.f27876c;
        obj.f28250p = efVar.d();
        obj.f28249o = efVar.f27875b;
        obj.f28251q = efVar.j();
        obj.f28259z = efVar.f27884m;
        obj.A = efVar.P;
        CharSequence charSequence = efVar.f27874a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.f28243i = efVar.f27885n;
        obj.f28244j = efVar.f27889r;
        obj.h = efVar.f27894x;
        obj.f28245k = e20Var;
        obj.f28252r = true;
        arrayList.add(obj);
        efVar.e();
        this.f37175a = true;
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
            kjVar = bnVar3.f46264y5;
        }
        org.telegram.messenger.zy.X(cVar, arrayList, j3, fjVar, threadMessage, null, rmVar2, false, false, fjVar2, null, z10, i10, i11, h, null, bwVar, 0L, false, 0L, sendMonoForumPeerId, kjVar, null, false);
        ng ngVar = chatActivityEnterView.P3;
        if (ngVar != null) {
            ngVar.H(null, true, i10, i11, 0L);
        }
    }
}
