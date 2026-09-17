package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f18382a;
    public final OutputSerializedData f18383b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f18382a = i10;
        this.f18383b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18382a) {
            case 0:
                this.f18383b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f18383b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f18383b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f18383b.writeString((String) obj);
                return;
        }
    }
}
