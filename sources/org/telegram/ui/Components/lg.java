package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
public final class lg extends org.telegram.ui.oq0 {
    public boolean f37180a;
    public final org.telegram.messenger.ff f37181b;
    public final File f37182c;
    public final mg d;

    public lg(mg mgVar, org.telegram.messenger.ff ffVar, File file) {
        this.d = mgVar;
        this.f37181b = ffVar;
        this.f37182c = file;
    }

    @Override
    public final void G() {
        if (!this.f37180a) {
            try {
                this.f37182c.delete();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        String str;
        org.telegram.messenger.gj threadMessage;
        org.telegram.messenger.cw cwVar;
        String str2;
        org.telegram.ui.bn bnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.f37508f2;
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        if (rmVar != null && (bnVar = chatActivityEnterView.F3) != null && rmVar.f51623f) {
            bnVar.yc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        org.telegram.messenger.ff ffVar = this.f37181b;
        if (!ffVar.f28059b && (str2 = ffVar.h) != null) {
            obj.f28407c = str2;
        } else {
            String str3 = ffVar.I;
            if (str3 != null) {
                obj.f28407c = str3;
            }
        }
        obj.f28408e = ffVar.f28060c;
        obj.f28418p = ffVar.d();
        obj.f28417o = ffVar.f28059b;
        obj.f28419q = ffVar.j();
        obj.f28427z = ffVar.f28068m;
        obj.A = ffVar.P;
        CharSequence charSequence = ffVar.f28058a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.f28411i = ffVar.f28069n;
        obj.f28412j = ffVar.f28073r;
        obj.h = ffVar.f28078x;
        obj.f28413k = f20Var;
        obj.f28420r = true;
        arrayList.add(obj);
        ffVar.e();
        this.f37180a = true;
        boolean h = org.telegram.messenger.az.h(obj.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.S;
        org.telegram.messenger.lj ljVar = null;
        long j3 = chatActivityEnterView.G3;
        org.telegram.messenger.gj gjVar = chatActivityEnterView.J3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.rm rmVar2 = chatActivityEnterView.L3;
        org.telegram.messenger.gj gjVar2 = chatActivityEnterView.P2;
        org.telegram.ui.bn bnVar2 = chatActivityEnterView.F3;
        if (bnVar2 != null) {
            cwVar = bnVar2.Y8();
        } else {
            cwVar = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.bn bnVar3 = chatActivityEnterView.F3;
        if (bnVar3 != null) {
            ljVar = bnVar3.f46268y5;
        }
        org.telegram.messenger.az.X(cVar, arrayList, j3, gjVar, threadMessage, null, rmVar2, false, false, gjVar2, null, z10, i10, i11, h, null, cwVar, 0L, false, 0L, sendMonoForumPeerId, ljVar, null, false);
        ng ngVar = chatActivityEnterView.P3;
        if (ngVar != null) {
            ngVar.H(null, true, i10, i11, 0L);
        }
    }
}
