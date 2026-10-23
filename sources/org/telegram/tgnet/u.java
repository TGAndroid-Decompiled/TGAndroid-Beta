package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.CallbackReturn {
    public final int f20606a;
    public final InputSerializedData f20607b;

    public u(int i10, InputSerializedData inputSerializedData) {
        this.f20606a = i10;
        this.f20607b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f20606a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f20607b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f20607b.readInt32(booleanValue));
            case 2:
                return this.f20607b.readString(booleanValue);
            default:
                return this.f20607b.readByteArray(booleanValue);
        }
    }
}
