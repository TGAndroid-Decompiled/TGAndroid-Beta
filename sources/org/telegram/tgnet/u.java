package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.Callback {
    public final int f22640a;
    public final OutputSerializedData f22641b;

    public u(OutputSerializedData outputSerializedData, int i9) {
        this.f22640a = i9;
        this.f22641b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22640a) {
            case 0:
                this.f22641b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f22641b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f22641b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f22641b.writeString((String) obj);
                return;
        }
    }
}
