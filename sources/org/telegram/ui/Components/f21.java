package org.telegram.ui.Components;

import java.io.File;
public final class f21 implements org.telegram.messenger.fs {
    public final String f34986a;
    public final org.telegram.messenger.ks f34987b;
    public final org.telegram.messenger.fj f34988c;

    public f21(String str, org.telegram.messenger.ks ksVar, org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.m1 m1Var) {
        this.f34986a = str;
        this.f34987b = ksVar;
        this.f34988c = fjVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (!this.f34986a.equals(objArr[0])) {
            return;
        }
        org.telegram.messenger.ks ksVar = this.f34987b;
        int i11 = org.telegram.messenger.ks.Y1;
        ksVar.n(this, i11);
        ksVar.n(this, org.telegram.messenger.ks.Z1);
        org.telegram.messenger.fj fjVar = this.f34988c;
        if (i7 == i11 && objArr.length > 1) {
            Object obj = objArr[1];
            if (obj instanceof File) {
                i21.y(fjVar, ((File) obj).getAbsolutePath());
                return;
            }
        }
        i21.n(fjVar);
    }
}
