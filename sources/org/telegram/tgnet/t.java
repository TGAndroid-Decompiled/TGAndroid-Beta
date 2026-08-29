package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.CallbackReturn {
    public final int f22595a;
    public final InputSerializedData f22596b;

    public t(InputSerializedData inputSerializedData, int i10) {
        this.f22595a = i10;
        this.f22596b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f22595a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f22596b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f22596b.readInt32(booleanValue));
            case 2:
                return this.f22596b.readString(booleanValue);
            default:
                return this.f22596b.readByteArray(booleanValue);
        }
    }
}
