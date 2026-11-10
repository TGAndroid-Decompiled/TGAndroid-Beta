package org.telegram.messenger;
public final class zo {
    public final int f26905a;
    public final int f26906b;

    public zo(int i7, int i10) {
        this.f26905a = i7;
        this.f26906b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zo)) {
            return false;
        }
        zo zoVar = (zo) obj;
        if (this.f26905a != zoVar.f26905a || this.f26906b != zoVar.f26906b) {
            return false;
        }
        return true;
    }
}
