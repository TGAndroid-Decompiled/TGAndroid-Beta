package org.telegram.tgnet;

import org.telegram.messenger.z10;
public final class v implements z10 {
    public final int f28703a;
    public final InputSerializedData f28704b;

    public v(InputSerializedData inputSerializedData, int i7) {
        this.f28703a = i7;
        this.f28704b = inputSerializedData;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f28703a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i7) {
            case 0:
                return Long.valueOf(this.f28704b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f28704b.readInt32(booleanValue));
            case 2:
                return this.f28704b.readString(booleanValue);
            default:
                return this.f28704b.readByteArray(booleanValue);
        }
    }
}
