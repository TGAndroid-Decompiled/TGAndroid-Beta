package org.telegram.tgnet;

import org.telegram.messenger.y10;
public final class v implements y10 {
    public final int f28700a;
    public final InputSerializedData f28701b;

    public v(InputSerializedData inputSerializedData, int i7) {
        this.f28700a = i7;
        this.f28701b = inputSerializedData;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f28700a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i7) {
            case 0:
                return Long.valueOf(this.f28701b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f28701b.readInt32(booleanValue));
            case 2:
                return this.f28701b.readString(booleanValue);
            default:
                return this.f28701b.readByteArray(booleanValue);
        }
    }
}
