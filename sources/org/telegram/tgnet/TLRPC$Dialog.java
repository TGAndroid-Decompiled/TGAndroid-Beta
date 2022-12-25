package org.telegram.tgnet;

public abstract class TLRPC$Dialog extends TLObject {
    public TLRPC$DraftMessage draft;
    public int flags;
    public int folder_id;
    public long f854id;
    public boolean isFolder;
    public int last_message_date;
    public TLRPC$PeerNotifySettings notify_settings;
    public TLRPC$Peer peer;
    public boolean pinned;
    public int pinnedNum;
    public int pts;
    public int read_inbox_max_id;
    public int read_outbox_max_id;
    public int top_message;
    public int ttl_period;
    public int unread_count;
    public boolean unread_mark;
    public int unread_mentions_count;
    public int unread_reactions_count;

    public static TLRPC$Dialog TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Dialog tLRPC$Dialog;
        if (i == -1460809483) {
            tLRPC$Dialog = new TLRPC$TL_dialog() {
                public static int constructor = -1460809483;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.pinned = (readInt32 & 4) != 0;
                    this.unread_mark = (readInt32 & 8) != 0;
                    this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.top_message = abstractSerializedData2.readInt32(z2);
                    this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                    this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                    this.unread_count = abstractSerializedData2.readInt32(z2);
                    this.unread_mentions_count = abstractSerializedData2.readInt32(z2);
                    this.unread_reactions_count = abstractSerializedData2.readInt32(z2);
                    this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if ((this.flags & 1) != 0) {
                        this.pts = abstractSerializedData2.readInt32(z2);
                    }
                    if ((this.flags & 2) != 0) {
                        this.draft = TLRPC$DraftMessage.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                    if ((this.flags & 16) != 0) {
                        this.folder_id = abstractSerializedData2.readInt32(z2);
                    }
                    if ((this.flags & 32) != 0) {
                        this.ttl_period = abstractSerializedData2.readInt32(z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    int i2 = this.pinned ? this.flags | 4 : this.flags & (-5);
                    this.flags = i2;
                    int i3 = this.unread_mark ? i2 | 8 : i2 & (-9);
                    this.flags = i3;
                    abstractSerializedData2.writeInt32(i3);
                    this.peer.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeInt32(this.top_message);
                    abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                    abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                    abstractSerializedData2.writeInt32(this.unread_count);
                    abstractSerializedData2.writeInt32(this.unread_mentions_count);
                    abstractSerializedData2.writeInt32(this.unread_reactions_count);
                    this.notify_settings.serializeToStream(abstractSerializedData2);
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeInt32(this.pts);
                    }
                    if ((this.flags & 2) != 0) {
                        this.draft.serializeToStream(abstractSerializedData2);
                    }
                    if ((this.flags & 16) != 0) {
                        abstractSerializedData2.writeInt32(this.folder_id);
                    }
                    if ((this.flags & 32) != 0) {
                        abstractSerializedData2.writeInt32(this.ttl_period);
                    }
                }
            };
        } else if (i == -712374074) {
            tLRPC$Dialog = new TLRPC$TL_dialog();
        } else if (i != 1908216652) {
            tLRPC$Dialog = null;
        } else {
            tLRPC$Dialog = new TLRPC$TL_dialogFolder();
            tLRPC$Dialog.isFolder = true;
        }
        if (tLRPC$Dialog == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in Dialog", Integer.valueOf(i)));
        }
        if (tLRPC$Dialog != null) {
            tLRPC$Dialog.readParams(abstractSerializedData, z);
        }
        return tLRPC$Dialog;
    }
}
