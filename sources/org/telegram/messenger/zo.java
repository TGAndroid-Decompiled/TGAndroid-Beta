package org.telegram.messenger;
public final class zo {
    public final int f26901a;
    public final int f26902b;

    public zo(int i7, int i10) {
        this.f26901a = i7;
        this.f26902b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zo)) {
            return false;
        }
        zo zoVar = (zo) obj;
        if (this.f26901a != zoVar.f26901a || this.f26902b != zoVar.f26902b) {
            return false;
        }
        return true;
    }
}
