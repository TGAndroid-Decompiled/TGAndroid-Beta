package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f20538a;
    public final OutputSerializedData f20539b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f20538a = i10;
        this.f20539b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20538a) {
            case 0:
                this.f20539b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20539b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20539b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20539b.writeString((String) obj);
                return;
        }
    }
}
