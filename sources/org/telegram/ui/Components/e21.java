package org.telegram.ui.Components;

import java.io.File;
public final class e21 implements org.telegram.messenger.fs {
    public final String f34585a;
    public final org.telegram.messenger.ks f34586b;
    public final org.telegram.messenger.fj f34587c;

    public e21(String str, org.telegram.messenger.ks ksVar, org.telegram.messenger.fj fjVar) {
        this.f34585a = str;
        this.f34586b = ksVar;
        this.f34587c = fjVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (!this.f34585a.equals(objArr[0])) {
            return;
        }
        org.telegram.messenger.ks ksVar = this.f34586b;
        int i11 = org.telegram.messenger.ks.Y1;
        ksVar.n(this, i11);
        ksVar.n(this, org.telegram.messenger.ks.Z1);
        org.telegram.messenger.fj fjVar = this.f34587c;
        if (i7 == i11 && objArr.length > 1) {
            Object obj = objArr[1];
            if (obj instanceof File) {
                g21.w(fjVar, ((File) obj).getAbsolutePath());
                return;
            }
        }
        g21.m(fjVar);
    }
}
