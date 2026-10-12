package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.CallbackReturn {
    public final int f20074a;
    public final InputSerializedData f20075b;

    public w(int i10, InputSerializedData inputSerializedData) {
        this.f20074a = i10;
        this.f20075b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f20074a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f20075b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f20075b.readInt32(booleanValue));
            case 2:
                return this.f20075b.readString(booleanValue);
            default:
                return this.f20075b.readByteArray(booleanValue);
        }
    }
}
