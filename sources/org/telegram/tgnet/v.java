package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.CallbackReturn {
    public final int f18381a;
    public final InputSerializedData f18382b;

    public v(int i10, InputSerializedData inputSerializedData) {
        this.f18381a = i10;
        this.f18382b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f18381a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f18382b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f18382b.readInt32(booleanValue));
            case 2:
                return this.f18382b.readString(booleanValue);
            default:
                return this.f18382b.readByteArray(booleanValue);
        }
    }
}
