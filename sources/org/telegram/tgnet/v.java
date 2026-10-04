package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.CallbackReturn {
    public final int f20299a;
    public final InputSerializedData f20300b;

    public v(int i10, InputSerializedData inputSerializedData) {
        this.f20299a = i10;
        this.f20300b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f20299a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f20300b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f20300b.readInt32(booleanValue));
            case 2:
                return this.f20300b.readString(booleanValue);
            default:
                return this.f20300b.readByteArray(booleanValue);
        }
    }
}
