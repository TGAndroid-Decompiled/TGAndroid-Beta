package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.CallbackReturn {
    public final int f20309a;
    public final InputSerializedData f20310b;

    public v(int i10, InputSerializedData inputSerializedData) {
        this.f20309a = i10;
        this.f20310b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f20309a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f20310b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f20310b.readInt32(booleanValue));
            case 2:
                return this.f20310b.readString(booleanValue);
            default:
                return this.f20310b.readByteArray(booleanValue);
        }
    }
}
