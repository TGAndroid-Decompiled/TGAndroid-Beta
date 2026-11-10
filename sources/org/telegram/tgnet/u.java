package org.telegram.tgnet;

import org.telegram.messenger.d20;
public final class u implements d20 {
    public final int f27227a;
    public final InputSerializedData f27228b;

    public u(InputSerializedData inputSerializedData, int i7) {
        this.f27227a = i7;
        this.f27228b = inputSerializedData;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f27227a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i7) {
            case 0:
                return Long.valueOf(this.f27228b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f27228b.readInt32(booleanValue));
            case 2:
                return this.f27228b.readString(booleanValue);
            default:
                return this.f27228b.readByteArray(booleanValue);
        }
    }
}
