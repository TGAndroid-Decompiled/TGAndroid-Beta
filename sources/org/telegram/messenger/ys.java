package org.telegram.messenger;

import java.lang.ref.WeakReference;
public final class ys implements vs {
    public final at f19621a;
    public final WeakReference f19622b;
    public final int f19623c;

    public ys(at atVar, vs vsVar) {
        this.f19621a = atVar;
        this.f19622b = new WeakReference(vsVar);
        this.f19623c = System.identityHashCode(vsVar);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        vs vsVar = (vs) this.f19622b.get();
        if (vsVar != null) {
            vsVar.didReceivedNotification(i10, i11, objArr);
        } else {
            this.f19621a.n(this, i10);
        }
    }

    public final boolean equals(Object obj) {
        vs vsVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ys) && (vsVar = (vs) this.f19622b.get()) != null && vsVar == ((ys) obj).f19622b.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19623c;
    }
}
