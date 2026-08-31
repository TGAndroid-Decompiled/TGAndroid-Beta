package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.CallbackReturn {
    public final int f21046a;
    public final InputSerializedData f21047b;

    public t(int i10, InputSerializedData inputSerializedData) {
        this.f21046a = i10;
        this.f21047b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f21046a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f21047b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f21047b.readInt32(booleanValue));
            case 2:
                return this.f21047b.readString(booleanValue);
            default:
                return this.f21047b.readByteArray(booleanValue);
        }
    }
}
