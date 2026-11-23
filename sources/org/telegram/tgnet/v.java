package org.telegram.tgnet;

import org.telegram.messenger.x10;
public final class v implements x10 {
    public final int f28761a;
    public final InputSerializedData f28762b;

    public v(InputSerializedData inputSerializedData, int i7) {
        this.f28761a = i7;
        this.f28762b = inputSerializedData;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f28761a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i7) {
            case 0:
                return Long.valueOf(this.f28762b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f28762b.readInt32(booleanValue));
            case 2:
                return this.f28762b.readString(booleanValue);
            default:
                return this.f28762b.readByteArray(booleanValue);
        }
    }
}
