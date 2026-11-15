package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;
public final class ag extends org.telegram.ui.mq0 {
    public boolean f32984a;
    public final org.telegram.messenger.ff f32985b;
    public final File f32986c;
    public final bg d;

    public ag(bg bgVar, org.telegram.messenger.ff ffVar, File file) {
        this.d = bgVar;
        this.f32985b = ffVar;
        this.f32986c = file;
    }

    @Override
    public final void G() {
        if (!this.f32984a) {
            try {
                this.f32986c.delete();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        String str;
        org.telegram.messenger.gj threadMessage;
        org.telegram.messenger.fw fwVar;
        String str2;
        org.telegram.ui.an anVar;
        ChatActivityEnterView chatActivityEnterView = this.d.f33278f2;
        org.telegram.ui.qm qmVar = chatActivityEnterView.D3;
        if (qmVar != null && (anVar = chatActivityEnterView.f32319x3) != null && qmVar.f50651f) {
            anVar.yc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        org.telegram.messenger.ff ffVar = this.f32985b;
        if (!ffVar.f27710b && (str2 = ffVar.h) != null) {
            obj.f23196c = str2;
        } else {
            String str3 = ffVar.I;
            if (str3 != null) {
                obj.f23196c = str3;
            }
        }
        obj.f23197e = ffVar.f27711c;
        obj.f23207p = ffVar.d();
        obj.f23206o = ffVar.f27710b;
        obj.f23208q = ffVar.j();
        obj.f23216z = ffVar.f27719m;
        obj.A = ffVar.P;
        CharSequence charSequence = ffVar.f27709a;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        obj.d = str;
        obj.f23200i = ffVar.f27720n;
        obj.f23201j = ffVar.f27724r;
        obj.h = ffVar.f27729x;
        obj.f23202k = g20Var;
        obj.f23209r = true;
        arrayList.add(obj);
        ffVar.e();
        this.f32984a = true;
        boolean h = org.telegram.messenger.ez.h(obj.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.S;
        org.telegram.messenger.lj ljVar = null;
        long j3 = chatActivityEnterView.f32327y3;
        org.telegram.messenger.gj gjVar = chatActivityEnterView.B3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.qm qmVar2 = chatActivityEnterView.D3;
        org.telegram.messenger.gj gjVar2 = chatActivityEnterView.H2;
        org.telegram.ui.an anVar2 = chatActivityEnterView.f32319x3;
        if (anVar2 != null) {
            fwVar = anVar2.Y8();
        } else {
            fwVar = null;
        }
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.an anVar3 = chatActivityEnterView.f32319x3;
        if (anVar3 != null) {
            ljVar = anVar3.f45421x5;
        }
        org.telegram.messenger.ez.X(cVar, arrayList, j3, gjVar, threadMessage, null, qmVar2, false, false, gjVar2, null, z10, i10, i11, h, null, fwVar, 0L, false, 0L, sendMonoForumPeerId, ljVar, null, false);
        cg cgVar = chatActivityEnterView.H3;
        if (cgVar != null) {
            cgVar.M(null, true, i10, i11, 0L);
        }
    }
}
