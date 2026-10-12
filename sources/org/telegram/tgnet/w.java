package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.CallbackReturn {
    public final int f20073a;
    public final InputSerializedData f20074b;

    public w(int i10, InputSerializedData inputSerializedData) {
        this.f20073a = i10;
        this.f20074b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f20073a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f20074b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f20074b.readInt32(booleanValue));
            case 2:
                return this.f20074b.readString(booleanValue);
            default:
                return this.f20074b.readByteArray(booleanValue);
        }
    }
}
