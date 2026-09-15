package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.CallbackReturn {
    public final int f18371a;
    public final InputSerializedData f18372b;

    public u(int i10, InputSerializedData inputSerializedData) {
        this.f18371a = i10;
        this.f18372b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f18371a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f18372b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f18372b.readInt32(booleanValue));
            case 2:
                return this.f18372b.readString(booleanValue);
            default:
                return this.f18372b.readByteArray(booleanValue);
        }
    }
}
