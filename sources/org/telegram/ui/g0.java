package org.telegram.ui;

import android.net.Uri;
public final class g0 implements org.telegram.messenger.m10 {
    public final i4 f45423a;
    public final String f45424b;
    public final boolean[] f45425c;
    public final sf.b d;

    public g0(i4 i4Var, String str, boolean[] zArr, sf.b bVar) {
        this.f45423a = i4Var;
        this.f45424b = str;
        this.f45425c = zArr;
        this.d = bVar;
    }

    @Override
    public final Object run() {
        String str = this.f45424b;
        if (!sf.c.g(Uri.parse(str), false, this.f45425c)) {
            return Boolean.FALSE;
        }
        i4 i4Var = this.f45423a;
        sf.b bVar = this.d;
        if (bVar != null) {
            bVar.f54709c = new org.telegram.messenger.voip.l0(11, i4Var, bVar);
        } else {
            u3 u3Var = i4Var.L;
            if (u3Var != null) {
                u3Var.a(true);
            }
        }
        sf.c.s(i4Var.M, Uri.parse(str), true, true, false, bVar, null, true, true, false, false);
        return Boolean.TRUE;
    }
}
