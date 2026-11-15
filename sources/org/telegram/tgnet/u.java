package org.telegram.tgnet;

import org.telegram.messenger.a20;
public final class u implements a20 {
    public final int f28318a;
    public final InputSerializedData f28319b;

    public u(InputSerializedData inputSerializedData, int i7) {
        this.f28318a = i7;
        this.f28319b = inputSerializedData;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f28318a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i7) {
            case 0:
                return Long.valueOf(this.f28319b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f28319b.readInt32(booleanValue));
            case 2:
                return this.f28319b.readString(booleanValue);
            default:
                return this.f28319b.readByteArray(booleanValue);
        }
    }
}
