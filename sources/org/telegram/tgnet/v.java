package org.telegram.tgnet;

import org.telegram.messenger.r20;
public final class v implements r20 {
    public final int f20062a;
    public final InputSerializedData f20063b;

    public v(InputSerializedData inputSerializedData, int i10) {
        this.f20062a = i10;
        this.f20063b = inputSerializedData;
    }

    @Override
    public final Object a(Object obj) {
        int i10 = this.f20062a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f20063b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f20063b.readInt32(booleanValue));
            case 2:
                return this.f20063b.readString(booleanValue);
            default:
                return this.f20063b.readByteArray(booleanValue);
        }
    }
}
