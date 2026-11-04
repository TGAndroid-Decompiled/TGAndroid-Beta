package org.telegram.ui;
public final class pz {
    public long f48707a;
    public int f48708b;

    public pz(int i3, long j10) {
        this.f48707a = j10;
        this.f48708b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pz.class == obj.getClass()) {
            pz pzVar = (pz) obj;
            if (this.f48707a == pzVar.f48707a && this.f48708b == pzVar.f48708b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f48708b;
    }
}
