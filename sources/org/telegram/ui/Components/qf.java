package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
public final class qf extends org.telegram.ui.xr0 {
    public boolean f29724a;
    public final org.telegram.messenger.ff f29725b;
    public final File f29726c;
    public final rf d;

    public qf(rf rfVar, org.telegram.messenger.ff ffVar, File file) {
        this.d = rfVar;
        this.f29725b = ffVar;
        this.f29726c = file;
    }

    @Override
    public final void G() {
        if (!this.f29724a) {
            try {
                this.f29726c.delete();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        String str;
        org.telegram.messenger.kj threadMessage;
        org.telegram.messenger.tw twVar;
        String str2;
        org.telegram.ui.un unVar;
        ChatActivityEnterView chatActivityEnterView = this.d.Z1;
        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
        if (knVar != null && (unVar = chatActivityEnterView.P2) != null && knVar.f38934f) {
            unVar.pc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        org.telegram.messenger.ff ffVar = this.f29725b;
        if (!ffVar.f14603b && (str2 = ffVar.h) != null) {
            obj.f17850c = str2;
        } else {
            String str3 = ffVar.I;
            if (str3 != null) {
                obj.f17850c = str3;
            }
        }
        obj.e = ffVar.f14604c;
        obj.f17860p = ffVar.d();
        obj.f17859o = ffVar.f14603b;
        obj.f17861q = ffVar.i();
        obj.f17869z = ffVar.f14611m;
        obj.A = ffVar.P;
        CharSequence charSequence = ffVar.f14602a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.f17853i = ffVar.f14612n;
        obj.f17854j = ffVar.f14616r;
        obj.h = ffVar.f14621x;
        obj.f17855k = y20Var;
        obj.f17862r = true;
        arrayList.add(obj);
        ffVar.e();
        this.f29724a = true;
        boolean h = org.telegram.messenger.rz.h(obj.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.R;
        org.telegram.messenger.pj pjVar = null;
        long j10 = chatActivityEnterView.Q2;
        org.telegram.messenger.kj kjVar = chatActivityEnterView.T2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.kn knVar2 = chatActivityEnterView.V2;
        org.telegram.messenger.kj kjVar2 = chatActivityEnterView.Z1;
        org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
        if (unVar2 != null) {
            twVar = unVar2.T8();
        } else {
            twVar = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.un unVar3 = chatActivityEnterView.P2;
        if (unVar3 != null) {
            pjVar = unVar3.f42270w5;
        }
        org.telegram.messenger.rz.X(cVar, arrayList, j10, kjVar, threadMessage, null, knVar2, false, false, kjVar2, null, z10, i11, i12, h, null, twVar, 0L, false, 0L, sendMonoForumPeerId, pjVar, null, false);
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null) {
            sfVar.E(null, true, i11, i12, 0L);
        }
    }
}
