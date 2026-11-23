package org.telegram.tgnet;

import org.telegram.messenger.z10;
public final class w implements z10 {
    public final int f28669a;
    public final InputSerializedData f28670b;

    public w(InputSerializedData inputSerializedData, int i7) {
        this.f28669a = i7;
        this.f28670b = inputSerializedData;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f28669a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i7) {
            case 0:
                return Long.valueOf(this.f28670b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f28670b.readInt32(booleanValue));
            case 2:
                return this.f28670b.readString(booleanValue);
            default:
                return this.f28670b.readByteArray(booleanValue);
        }
    }
}
