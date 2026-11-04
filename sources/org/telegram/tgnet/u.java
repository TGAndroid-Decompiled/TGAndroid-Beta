package org.telegram.tgnet;

import org.telegram.messenger.v10;
public final class u implements v10 {
    public final int f27269a;
    public final InputSerializedData f27270b;

    public u(InputSerializedData inputSerializedData, int i3) {
        this.f27269a = i3;
        this.f27270b = inputSerializedData;
    }

    @Override
    public final Object a(Object obj) {
        int i3 = this.f27269a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i3) {
            case 0:
                return Long.valueOf(this.f27270b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f27270b.readInt32(booleanValue));
            case 2:
                return this.f27270b.readString(booleanValue);
            default:
                return this.f27270b.readByteArray(booleanValue);
        }
    }
}
