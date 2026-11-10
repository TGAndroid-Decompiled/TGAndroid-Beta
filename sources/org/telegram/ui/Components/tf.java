package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
public final class tf extends org.telegram.ui.qq0 {
    public boolean f38295a;
    public final org.telegram.messenger.gf f38296b;
    public final File f38297c;
    public final uf d;

    public tf(uf ufVar, org.telegram.messenger.gf gfVar, File file) {
        this.d = ufVar;
        this.f38296b = gfVar;
        this.f38297c = file;
    }

    @Override
    public final void G() {
        if (!this.f38295a) {
            try {
                this.f38297c.delete();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        String str;
        org.telegram.messenger.ij threadMessage;
        org.telegram.messenger.hw hwVar;
        String str2;
        org.telegram.ui.cn cnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.Z1;
        org.telegram.ui.sm smVar = chatActivityEnterView.V2;
        if (smVar != null && (cnVar = chatActivityEnterView.P2) != null && smVar.f49883f) {
            cnVar.xc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        org.telegram.messenger.gf gfVar = this.f38296b;
        if (!gfVar.f26849b && (str2 = gfVar.h) != null) {
            obj.f22516c = str2;
        } else {
            String str3 = gfVar.I;
            if (str3 != null) {
                obj.f22516c = str3;
            }
        }
        obj.f22517e = gfVar.f26850c;
        obj.f22527p = gfVar.d();
        obj.f22526o = gfVar.f26849b;
        obj.f22528q = gfVar.j();
        obj.f22536z = gfVar.f26858m;
        obj.A = gfVar.P;
        CharSequence charSequence = gfVar.f26848a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.f22520i = gfVar.f26859n;
        obj.f22521j = gfVar.f26863r;
        obj.h = gfVar.f26868x;
        obj.f22522k = j20Var;
        obj.f22529r = true;
        arrayList.add(obj);
        gfVar.e();
        this.f38295a = true;
        boolean h = org.telegram.messenger.gz.h(obj.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.R;
        org.telegram.messenger.nj njVar = null;
        long j3 = chatActivityEnterView.Q2;
        org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.sm smVar2 = chatActivityEnterView.V2;
        org.telegram.messenger.ij ijVar2 = chatActivityEnterView.Z1;
        org.telegram.ui.cn cnVar2 = chatActivityEnterView.P2;
        if (cnVar2 != null) {
            hwVar = cnVar2.X8();
        } else {
            hwVar = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.cn cnVar3 = chatActivityEnterView.P2;
        if (cnVar3 != null) {
            njVar = cnVar3.f44708w5;
        }
        org.telegram.messenger.gz.X(cVar, arrayList, j3, ijVar, threadMessage, null, smVar2, false, false, ijVar2, null, z9, i10, i11, h, null, hwVar, 0L, false, 0L, sendMonoForumPeerId, njVar, null, false);
        vf vfVar = chatActivityEnterView.Z2;
        if (vfVar != null) {
            vfVar.F(null, true, i10, i11, 0L);
        }
    }
}
