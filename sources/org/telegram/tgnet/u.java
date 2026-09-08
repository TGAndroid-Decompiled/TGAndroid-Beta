package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.CallbackReturn {
    public final int f20157a;
    public final InputSerializedData f20158b;

    public u(int i10, InputSerializedData inputSerializedData) {
        this.f20157a = i10;
        this.f20158b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f20157a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f20158b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f20158b.readInt32(booleanValue));
            case 2:
                return this.f20158b.readString(booleanValue);
            default:
                return this.f20158b.readByteArray(booleanValue);
        }
    }
}
