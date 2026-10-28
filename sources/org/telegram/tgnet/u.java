package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.CallbackReturn {
    public final int f22297a;
    public final InputSerializedData f22298b;

    public u(int i10, InputSerializedData inputSerializedData) {
        this.f22297a = i10;
        this.f22298b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f22297a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f22298b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f22298b.readInt32(booleanValue));
            case 2:
                return this.f22298b.readString(booleanValue);
            default:
                return this.f22298b.readByteArray(booleanValue);
        }
    }
}
