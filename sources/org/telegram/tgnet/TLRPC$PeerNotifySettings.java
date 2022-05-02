package org.telegram.tgnet;

public abstract class TLRPC$PeerNotifySettings extends TLObject {
    public TLRPC$NotificationSound android_sound;
    public int events_mask;
    public int flags;
    public TLRPC$NotificationSound ios_sound;
    public int mute_until;
    public TLRPC$NotificationSound other_sound;
    public boolean show_previews;
    public boolean silent;
    public String sound;

    public static TLRPC$PeerNotifySettings TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PeerNotifySettings tLRPC$PeerNotifySettings;
        switch (i) {
            case -1923214866:
                tLRPC$PeerNotifySettings = new TLRPC$TL_peerNotifySettings() {
                    public static int constructor = -1923214866;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.mute_until = abstractSerializedData2.readInt32(z2);
                        this.sound = abstractSerializedData2.readString(z2);
                        this.show_previews = abstractSerializedData2.readBool(z2);
                        this.events_mask = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.mute_until);
                        abstractSerializedData2.writeString(this.sound);
                        abstractSerializedData2.writeBool(this.show_previews);
                        abstractSerializedData2.writeInt32(this.events_mask);
                    }
                };
                break;
            case -1697798976:
                tLRPC$PeerNotifySettings = new TLRPC$TL_peerNotifySettings() {
                    public static int constructor = -1697798976;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        boolean z3 = false;
                        this.show_previews = (readInt32 & 1) != 0;
                        if ((readInt32 & 2) != 0) {
                            z3 = true;
                        }
                        this.silent = z3;
                        this.mute_until = abstractSerializedData2.readInt32(z2);
                        this.sound = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.show_previews ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.silent ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32(this.mute_until);
                        abstractSerializedData2.writeString(this.sound);
                    }
                };
                break;
            case -1472527322:
                tLRPC$PeerNotifySettings = new TLRPC$TL_peerNotifySettings();
                break;
            case -1353671392:
                tLRPC$PeerNotifySettings = new TLRPC$TL_peerNotifySettings() {
                    public static int constructor = -1353671392;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            this.show_previews = abstractSerializedData2.readBool(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.silent = abstractSerializedData2.readBool(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.mute_until = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.sound = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeBool(this.show_previews);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeBool(this.silent);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.mute_until);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeString(this.sound);
                        }
                    }
                };
                break;
            case 1889961234:
                tLRPC$PeerNotifySettings = new TLRPC$TL_peerNotifySettingsEmpty_layer77();
                break;
            default:
                tLRPC$PeerNotifySettings = null;
                break;
        }
        if (tLRPC$PeerNotifySettings != null || !z) {
            if (tLRPC$PeerNotifySettings != null) {
                tLRPC$PeerNotifySettings.readParams(abstractSerializedData, z);
            }
            return tLRPC$PeerNotifySettings;
        }
        throw new RuntimeException(String.format("can't parse magic %x in PeerNotifySettings", Integer.valueOf(i)));
    }
}
