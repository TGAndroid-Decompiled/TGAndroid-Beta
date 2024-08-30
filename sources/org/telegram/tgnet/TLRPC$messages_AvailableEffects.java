package org.telegram.tgnet;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class TLRPC$messages_AvailableEffects extends TLObject {
    public int hash;
    public ArrayList effects = new ArrayList();
    public ArrayList documents = new ArrayList();

    public static TLRPC$messages_AvailableEffects TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_AvailableEffects tLRPC$messages_AvailableEffects = i != -1109696146 ? i != -772957605 ? null : new TLRPC$messages_AvailableEffects() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-772957605);
            }
        } : new TLRPC$messages_AvailableEffects() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.hash = abstractSerializedData2.readInt32(z2);
                int readInt32 = abstractSerializedData2.readInt32(z2);
                if (readInt32 != 481674261) {
                    if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                    }
                    return;
                }
                int readInt322 = abstractSerializedData2.readInt32(z2);
                for (int i2 = 0; i2 < readInt322; i2++) {
                    TLRPC$TL_availableEffect TLdeserialize = TLRPC$TL_availableEffect.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize == null) {
                        return;
                    }
                    this.effects.add(TLdeserialize);
                }
                int readInt323 = abstractSerializedData2.readInt32(z2);
                if (readInt323 != 481674261) {
                    if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                    }
                    return;
                }
                int readInt324 = abstractSerializedData2.readInt32(z2);
                for (int i3 = 0; i3 < readInt324; i3++) {
                    TLRPC$Document TLdeserialize2 = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize2 == null) {
                        return;
                    }
                    this.documents.add(TLdeserialize2);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1109696146);
                abstractSerializedData2.writeInt32(this.hash);
                abstractSerializedData2.writeInt32(481674261);
                abstractSerializedData2.writeInt32(this.effects.size());
                Iterator it = this.effects.iterator();
                while (it.hasNext()) {
                    ((TLRPC$TL_availableEffect) it.next()).serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(481674261);
                abstractSerializedData2.writeInt32(this.documents.size());
                Iterator it2 = this.documents.iterator();
                while (it2.hasNext()) {
                    ((TLRPC$Document) it2.next()).serializeToStream(abstractSerializedData2);
                }
            }
        };
        if (tLRPC$messages_AvailableEffects == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_AvailableEffects", Integer.valueOf(i)));
        }
        if (tLRPC$messages_AvailableEffects != null) {
            tLRPC$messages_AvailableEffects.readParams(abstractSerializedData, z);
        }
        return tLRPC$messages_AvailableEffects;
    }
}
