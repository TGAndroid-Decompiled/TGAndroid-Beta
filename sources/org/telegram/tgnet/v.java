package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f20608a;
    public final OutputSerializedData f20609b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f20608a = i10;
        this.f20609b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20608a) {
            case 0:
                this.f20609b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20609b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20609b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20609b.writeString((String) obj);
                return;
        }
    }
}
