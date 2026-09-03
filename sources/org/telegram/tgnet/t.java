package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.CallbackReturn {
    public final int f19360a;
    public final InputSerializedData f19361b;

    public t(int i10, InputSerializedData inputSerializedData) {
        this.f19360a = i10;
        this.f19361b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f19360a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f19361b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f19361b.readInt32(booleanValue));
            case 2:
                return this.f19361b.readString(booleanValue);
            default:
                return this.f19361b.readByteArray(booleanValue);
        }
    }
}
