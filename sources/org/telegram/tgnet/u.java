package org.telegram.tgnet;

import org.telegram.messenger.y10;
public final class u implements y10 {
    public final int f28672a;
    public final InputSerializedData f28673b;

    public u(InputSerializedData inputSerializedData, int i7) {
        this.f28672a = i7;
        this.f28673b = inputSerializedData;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f28672a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i7) {
            case 0:
                return Long.valueOf(this.f28673b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f28673b.readInt32(booleanValue));
            case 2:
                return this.f28673b.readString(booleanValue);
            default:
                return this.f28673b.readByteArray(booleanValue);
        }
    }
}
