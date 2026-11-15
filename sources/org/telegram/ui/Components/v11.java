package org.telegram.ui.Components;

import java.io.File;
public final class v11 implements org.telegram.messenger.is {
    public final String f40233a;
    public final org.telegram.messenger.ns f40234b;
    public final org.telegram.messenger.gj f40235c;

    public v11(String str, org.telegram.messenger.ns nsVar, org.telegram.messenger.gj gjVar) {
        this.f40233a = str;
        this.f40234b = nsVar;
        this.f40235c = gjVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (!this.f40233a.equals(objArr[0])) {
            return;
        }
        org.telegram.messenger.ns nsVar = this.f40234b;
        int i11 = org.telegram.messenger.ns.Y1;
        nsVar.n(this, i11);
        nsVar.n(this, org.telegram.messenger.ns.Z1);
        org.telegram.messenger.gj gjVar = this.f40235c;
        if (i7 == i11 && objArr.length > 1) {
            Object obj = objArr[1];
            if (obj instanceof File) {
                x11.w(gjVar, ((File) obj).getAbsolutePath());
                return;
            }
        }
        x11.m(gjVar);
    }
}
