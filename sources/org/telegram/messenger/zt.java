package org.telegram.messenger;
public final class zt implements cd.c {
    public final tt f19751a;

    public zt(tt ttVar) {
        this.f19751a = ttVar;
    }

    @Override
    public final cd.h getContext() {
        return cd.i.f4123a;
    }

    @Override
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof ad.f;
        tt ttVar = this.f19751a;
        if (z10) {
            ttVar.a(null, ((ad.f) obj).f395a);
        } else {
            ttVar.a(obj, null);
        }
    }
}
