package org.telegram.tgnet;
public class TLRPC$TL_reactionNotificationsFromContacts extends TLRPC$ReactionNotificationsFrom {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1161583078);
    }
}
