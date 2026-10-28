package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f22299a;
    public final OutputSerializedData f22300b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f22299a = i10;
        this.f22300b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22299a) {
            case 0:
                this.f22300b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f22300b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f22300b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f22300b.writeString((String) obj);
                return;
        }
    }
}
