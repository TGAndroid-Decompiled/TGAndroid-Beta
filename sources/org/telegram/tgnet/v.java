package org.telegram.tgnet;

import org.telegram.messenger.s20;
public final class v implements s20 {
    public final int f20063a;
    public final InputSerializedData f20064b;

    public v(InputSerializedData inputSerializedData, int i10) {
        this.f20063a = i10;
        this.f20064b = inputSerializedData;
    }

    @Override
    public final Object a(Object obj) {
        int i10 = this.f20063a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f20064b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f20064b.readInt32(booleanValue));
            case 2:
                return this.f20064b.readString(booleanValue);
            default:
                return this.f20064b.readByteArray(booleanValue);
        }
    }
}
