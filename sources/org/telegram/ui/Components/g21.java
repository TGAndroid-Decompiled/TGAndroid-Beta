package org.telegram.ui.Components;

import java.io.File;
public final class g21 implements org.telegram.messenger.gs {
    public final String f35368a;
    public final org.telegram.messenger.ls f35369b;
    public final org.telegram.messenger.gj f35370c;

    public g21(String str, org.telegram.messenger.ls lsVar, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.m1 m1Var) {
        this.f35368a = str;
        this.f35369b = lsVar;
        this.f35370c = gjVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (!this.f35368a.equals(objArr[0])) {
            return;
        }
        org.telegram.messenger.ls lsVar = this.f35369b;
        int i11 = org.telegram.messenger.ls.Y1;
        lsVar.n(this, i11);
        lsVar.n(this, org.telegram.messenger.ls.Z1);
        org.telegram.messenger.gj gjVar = this.f35370c;
        if (i7 == i11 && objArr.length > 1) {
            Object obj = objArr[1];
            if (obj instanceof File) {
                j21.y(gjVar, ((File) obj).getAbsolutePath());
                return;
            }
        }
        j21.n(gjVar);
    }
}
