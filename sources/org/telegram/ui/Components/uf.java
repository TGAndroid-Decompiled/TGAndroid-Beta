package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
public final class uf extends org.telegram.ui.nq0 {
    public boolean f38621a;
    public final org.telegram.messenger.gf f38622b;
    public final File f38623c;
    public final vf d;

    public uf(vf vfVar, org.telegram.messenger.gf gfVar, File file) {
        this.d = vfVar;
        this.f38622b = gfVar;
        this.f38623c = file;
    }

    @Override
    public final void G() {
        if (!this.f38621a) {
            try {
                this.f38623c.delete();
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
        org.telegram.ui.an anVar;
        ChatActivityEnterView chatActivityEnterView = this.d.Z1;
        org.telegram.ui.qm qmVar = chatActivityEnterView.V2;
        if (qmVar != null && (anVar = chatActivityEnterView.P2) != null && qmVar.f49269f) {
            anVar.uc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        org.telegram.messenger.gf gfVar = this.f38622b;
        if (!gfVar.f26845b && (str2 = gfVar.h) != null) {
            obj.f22512c = str2;
        } else {
            String str3 = gfVar.I;
            if (str3 != null) {
                obj.f22512c = str3;
            }
        }
        obj.f22513e = gfVar.f26846c;
        obj.f22523p = gfVar.d();
        obj.f22522o = gfVar.f26845b;
        obj.f22524q = gfVar.j();
        obj.f22532z = gfVar.f26854m;
        obj.A = gfVar.P;
        CharSequence charSequence = gfVar.f26844a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.f22516i = gfVar.f26855n;
        obj.f22517j = gfVar.f26859r;
        obj.h = gfVar.f26864x;
        obj.f22518k = j20Var;
        obj.f22525r = true;
        arrayList.add(obj);
        gfVar.e();
        this.f38621a = true;
        boolean h = org.telegram.messenger.gz.h(obj.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.R;
        org.telegram.messenger.nj njVar = null;
        long j3 = chatActivityEnterView.Q2;
        org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.qm qmVar2 = chatActivityEnterView.V2;
        org.telegram.messenger.ij ijVar2 = chatActivityEnterView.Z1;
        org.telegram.ui.an anVar2 = chatActivityEnterView.P2;
        if (anVar2 != null) {
            hwVar = anVar2.W8();
        } else {
            hwVar = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.an anVar3 = chatActivityEnterView.P2;
        if (anVar3 != null) {
            njVar = anVar3.f44010w5;
        }
        org.telegram.messenger.gz.X(cVar, arrayList, j3, ijVar, threadMessage, null, qmVar2, false, false, ijVar2, null, z9, i10, i11, h, null, hwVar, 0L, false, 0L, sendMonoForumPeerId, njVar, null, false);
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.F(null, true, i10, i11, 0L);
        }
    }
}
