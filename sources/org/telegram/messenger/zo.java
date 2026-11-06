package org.telegram.messenger;
public final class zo {
    public final int f26898a;
    public final int f26899b;

    public zo(int i7, int i10) {
        this.f26898a = i7;
        this.f26899b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zo)) {
            return false;
        }
        zo zoVar = (zo) obj;
        if (this.f26898a != zoVar.f26898a || this.f26899b != zoVar.f26899b) {
            return false;
        }
        return true;
    }
}
