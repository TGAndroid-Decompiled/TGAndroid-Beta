package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f22298a;
    public final OutputSerializedData f22299b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f22298a = i10;
        this.f22299b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22298a) {
            case 0:
                this.f22299b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f22299b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f22299b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f22299b.writeString((String) obj);
                return;
        }
    }
}
