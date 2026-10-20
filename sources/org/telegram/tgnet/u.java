package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.CallbackReturn {
    public final int f20539a;
    public final InputSerializedData f20540b;

    public u(int i10, InputSerializedData inputSerializedData) {
        this.f20539a = i10;
        this.f20540b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f20539a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f20540b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f20540b.readInt32(booleanValue));
            case 2:
                return this.f20540b.readString(booleanValue);
            default:
                return this.f20540b.readByteArray(booleanValue);
        }
    }
}
