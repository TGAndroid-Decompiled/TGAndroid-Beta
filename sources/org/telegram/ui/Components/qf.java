package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
public final class qf extends org.telegram.ui.yr0 {
    public boolean f29643a;
    public final org.telegram.messenger.ef f29644b;
    public final File f29645c;
    public final rf d;

    public qf(rf rfVar, org.telegram.messenger.ef efVar, File file) {
        this.d = rfVar;
        this.f29644b = efVar;
        this.f29645c = file;
    }

    @Override
    public final void G() {
        if (!this.f29643a) {
            try {
                this.f29645c.delete();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        String str;
        org.telegram.messenger.jj threadMessage;
        org.telegram.messenger.sw swVar;
        String str2;
        org.telegram.ui.un unVar;
        ChatActivityEnterView chatActivityEnterView = this.d.Z1;
        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
        if (knVar != null && (unVar = chatActivityEnterView.P2) != null && knVar.f38908f) {
            unVar.kc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        org.telegram.messenger.ef efVar = this.f29644b;
        if (!efVar.f19507b && (str2 = efVar.h) != null) {
            obj.f17515c = str2;
        } else {
            String str3 = efVar.I;
            if (str3 != null) {
                obj.f17515c = str3;
            }
        }
        obj.e = efVar.f19508c;
        obj.f17525p = efVar.d();
        obj.f17524o = efVar.f19507b;
        obj.f17526q = efVar.i();
        obj.f17534z = efVar.f19515m;
        obj.A = efVar.P;
        CharSequence charSequence = efVar.f19506a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.f17518i = efVar.f19516n;
        obj.f17519j = efVar.f19520r;
        obj.h = efVar.f19525x;
        obj.f17520k = x20Var;
        obj.f17527r = true;
        arrayList.add(obj);
        efVar.e();
        this.f29643a = true;
        boolean h = org.telegram.messenger.qz.h(obj.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.R;
        org.telegram.messenger.oj ojVar = null;
        long j10 = chatActivityEnterView.Q2;
        org.telegram.messenger.jj jjVar = chatActivityEnterView.T2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.kn knVar2 = chatActivityEnterView.V2;
        org.telegram.messenger.jj jjVar2 = chatActivityEnterView.Z1;
        org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
        if (unVar2 != null) {
            swVar = unVar2.P8();
        } else {
            swVar = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.un unVar3 = chatActivityEnterView.P2;
        if (unVar3 != null) {
            ojVar = unVar3.f42459w5;
        }
        org.telegram.messenger.qz.X(cVar, arrayList, j10, jjVar, threadMessage, null, knVar2, false, false, jjVar2, null, z10, i11, i12, h, null, swVar, 0L, false, 0L, sendMonoForumPeerId, ojVar, null, false);
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null) {
            sfVar.E(null, true, i11, i12, 0L);
        }
    }
}
