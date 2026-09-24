package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.CallbackReturn {
    public final int f18581a;
    public final InputSerializedData f18582b;

    public v(int i10, InputSerializedData inputSerializedData) {
        this.f18581a = i10;
        this.f18582b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f18581a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f18582b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f18582b.readInt32(booleanValue));
            case 2:
                return this.f18582b.readString(booleanValue);
            default:
                return this.f18582b.readByteArray(booleanValue);
        }
    }
}
