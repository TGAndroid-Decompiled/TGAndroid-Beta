package org.telegram.tgnet;
public class TLRPC$TL_reactionsNotifySettings extends TLObject {
    public int flags;
    public TLRPC$ReactionNotificationsFrom messages_notify_from;
    public boolean show_previews;
    public TLRPC$NotificationSound sound;
    public TLRPC$ReactionNotificationsFrom stories_notify_from;

    public static TLRPC$TL_reactionsNotifySettings TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1457736048 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_reactionsNotifySettings", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_reactionsNotifySettings tLRPC$TL_reactionsNotifySettings = new TLRPC$TL_reactionsNotifySettings();
        tLRPC$TL_reactionsNotifySettings.readParams(abstractSerializedData, z);
        return tLRPC$TL_reactionsNotifySettings;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            this.messages_notify_from = TLRPC$ReactionNotificationsFrom.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 2) != 0) {
            this.stories_notify_from = TLRPC$ReactionNotificationsFrom.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.sound = TLRPC$NotificationSound.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.show_previews = abstractSerializedData.readBool(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1457736048);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            this.messages_notify_from.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            this.stories_notify_from.serializeToStream(abstractSerializedData);
        }
        this.sound.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.show_previews);
    }
}
