package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.CallbackReturn {
    public final int f18369a;
    public final InputSerializedData f18370b;

    public v(int i10, InputSerializedData inputSerializedData) {
        this.f18369a = i10;
        this.f18370b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f18369a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f18370b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f18370b.readInt32(booleanValue));
            case 2:
                return this.f18370b.readString(booleanValue);
            default:
                return this.f18370b.readByteArray(booleanValue);
        }
    }
}
