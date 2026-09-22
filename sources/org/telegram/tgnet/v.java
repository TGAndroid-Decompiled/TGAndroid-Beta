package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.CallbackReturn {
    public final int f18603a;
    public final InputSerializedData f18604b;

    public v(int i10, InputSerializedData inputSerializedData) {
        this.f18603a = i10;
        this.f18604b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f18603a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f18604b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f18604b.readInt32(booleanValue));
            case 2:
                return this.f18604b.readString(booleanValue);
            default:
                return this.f18604b.readByteArray(booleanValue);
        }
    }
}
