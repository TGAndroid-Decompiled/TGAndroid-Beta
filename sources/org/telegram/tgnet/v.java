package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f22296a;
    public final OutputSerializedData f22297b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f22296a = i10;
        this.f22297b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22296a) {
            case 0:
                this.f22297b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f22297b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f22297b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f22297b.writeString((String) obj);
                return;
        }
    }
}
