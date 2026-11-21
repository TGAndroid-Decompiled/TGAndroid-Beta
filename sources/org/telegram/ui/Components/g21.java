package org.telegram.ui.Components;

import java.io.File;
public final class g21 implements org.telegram.messenger.fs {
    public final String f35387a;
    public final org.telegram.messenger.ks f35388b;
    public final org.telegram.messenger.fj f35389c;

    public g21(String str, org.telegram.messenger.ks ksVar, org.telegram.messenger.fj fjVar) {
        this.f35387a = str;
        this.f35388b = ksVar;
        this.f35389c = fjVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (!this.f35387a.equals(objArr[0])) {
            return;
        }
        org.telegram.messenger.ks ksVar = this.f35388b;
        int i11 = org.telegram.messenger.ks.Y1;
        ksVar.n(this, i11);
        ksVar.n(this, org.telegram.messenger.ks.Z1);
        org.telegram.messenger.fj fjVar = this.f35389c;
        if (i7 == i11 && objArr.length > 1) {
            Object obj = objArr[1];
            if (obj instanceof File) {
                j21.x(fjVar, ((File) obj).getAbsolutePath());
                return;
            }
        }
        j21.m(fjVar);
    }
}
