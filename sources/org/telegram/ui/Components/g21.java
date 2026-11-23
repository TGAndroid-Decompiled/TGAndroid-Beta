package org.telegram.ui.Components;

import java.io.File;
public final class g21 implements org.telegram.messenger.gs {
    public final String f35406a;
    public final org.telegram.messenger.ls f35407b;
    public final org.telegram.messenger.gj f35408c;
    public final org.telegram.ui.Cells.m1 d;

    public g21(String str, org.telegram.messenger.ls lsVar, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.m1 m1Var) {
        this.f35406a = str;
        this.f35407b = lsVar;
        this.f35408c = gjVar;
        this.d = m1Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (!this.f35406a.equals(objArr[0])) {
            return;
        }
        org.telegram.messenger.ls lsVar = this.f35407b;
        int i11 = org.telegram.messenger.ls.Y1;
        lsVar.n(this, i11);
        lsVar.n(this, org.telegram.messenger.ls.Z1);
        org.telegram.messenger.gj gjVar = this.f35408c;
        if (i7 == i11 && objArr.length > 1) {
            Object obj = objArr[1];
            if (obj instanceof File) {
                j21.y(gjVar, ((File) obj).getAbsolutePath(), this.d);
                return;
            }
        }
        j21.n(gjVar);
    }
}
