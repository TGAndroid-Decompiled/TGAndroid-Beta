package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
public final class kg extends org.telegram.ui.pq0 {
    public boolean f36874a;
    public final org.telegram.messenger.ff f36875b;
    public final File f36876c;
    public final lg d;

    public kg(lg lgVar, org.telegram.messenger.ff ffVar, File file) {
        this.d = lgVar;
        this.f36875b = ffVar;
        this.f36876c = file;
    }

    @Override
    public final void G() {
        if (!this.f36874a) {
            try {
                this.f36876c.delete();
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
        ChatActivityEnterView chatActivityEnterView = this.d.f37138f2;
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        if (rmVar != null && (bnVar = chatActivityEnterView.F3) != null && rmVar.f51655f) {
            bnVar.yc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        org.telegram.messenger.ff ffVar = this.f36875b;
        if (!ffVar.f28023b && (str2 = ffVar.h) != null) {
            obj.f28371c = str2;
        } else {
            String str3 = ffVar.I;
            if (str3 != null) {
                obj.f28371c = str3;
            }
        }
        obj.f28372e = ffVar.f28024c;
        obj.f28382p = ffVar.d();
        obj.f28381o = ffVar.f28023b;
        obj.f28383q = ffVar.j();
        obj.f28391z = ffVar.f28032m;
        obj.A = ffVar.P;
        CharSequence charSequence = ffVar.f28022a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.f28375i = ffVar.f28033n;
        obj.f28376j = ffVar.f28037r;
        obj.h = ffVar.f28042x;
        obj.f28377k = f20Var;
        obj.f28384r = true;
        arrayList.add(obj);
        ffVar.e();
        this.f36874a = true;
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
            ljVar = bnVar3.f46221y5;
        }
        org.telegram.messenger.az.X(cVar, arrayList, j3, gjVar, threadMessage, null, rmVar2, false, false, gjVar2, null, z10, i10, i11, h, null, cwVar, 0L, false, 0L, sendMonoForumPeerId, ljVar, null, false);
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar != null) {
            mgVar.H(null, true, i10, i11, 0L);
        }
    }
}
