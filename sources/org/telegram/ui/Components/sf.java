package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
public final class sf extends org.telegram.ui.eq0 {
    public boolean f38004a;
    public final org.telegram.messenger.ye f38005b;
    public final File f38006c;
    public final tf d;

    public sf(tf tfVar, org.telegram.messenger.ye yeVar, File file) {
        this.d = tfVar;
        this.f38005b = yeVar;
        this.f38006c = file;
    }

    @Override
    public final void G() {
        if (!this.f38004a) {
            try {
                this.f38006c.delete();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        String str;
        org.telegram.messenger.zi threadMessage;
        org.telegram.messenger.zv zvVar;
        String str2;
        org.telegram.ui.wm wmVar;
        ChatActivityEnterView chatActivityEnterView = this.d.f38406a2;
        org.telegram.ui.mm mmVar = chatActivityEnterView.W2;
        if (mmVar != null && (wmVar = chatActivityEnterView.Q2) != null && mmVar.f47704f) {
            wmVar.uc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        org.telegram.messenger.ye yeVar = this.f38005b;
        if (!yeVar.f25310b && (str2 = yeVar.h) != null) {
            obj.f26477c = str2;
        } else {
            String str3 = yeVar.I;
            if (str3 != null) {
                obj.f26477c = str3;
            }
        }
        obj.f26478e = yeVar.f25311c;
        obj.f26488p = yeVar.d();
        obj.f26487o = yeVar.f25310b;
        obj.f26489q = yeVar.j();
        obj.f26497z = yeVar.f25319m;
        obj.A = yeVar.P;
        CharSequence charSequence = yeVar.f25309a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.f26481i = yeVar.f25320n;
        obj.f26482j = yeVar.f25324r;
        obj.h = yeVar.f25329x;
        obj.f26483k = b20Var;
        obj.f26490r = true;
        arrayList.add(obj);
        yeVar.e();
        this.f38004a = true;
        boolean h = org.telegram.messenger.yy.h(obj.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.S;
        org.telegram.messenger.ej ejVar = null;
        long j10 = chatActivityEnterView.R2;
        org.telegram.messenger.zi ziVar = chatActivityEnterView.U2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.mm mmVar2 = chatActivityEnterView.W2;
        org.telegram.messenger.zi ziVar2 = chatActivityEnterView.f31086a2;
        org.telegram.ui.wm wmVar2 = chatActivityEnterView.Q2;
        if (wmVar2 != null) {
            zvVar = wmVar2.W8();
        } else {
            zvVar = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.wm wmVar3 = chatActivityEnterView.Q2;
        if (wmVar3 != null) {
            ejVar = wmVar3.f51540x5;
        }
        org.telegram.messenger.yy.X(cVar, arrayList, j10, ziVar, threadMessage, null, mmVar2, false, false, ziVar2, null, z10, i10, i11, h, null, zvVar, 0L, false, 0L, sendMonoForumPeerId, ejVar, null, false);
        uf ufVar = chatActivityEnterView.f31087a3;
        if (ufVar != null) {
            ufVar.G(null, true, i10, i11, 0L);
        }
    }
}
