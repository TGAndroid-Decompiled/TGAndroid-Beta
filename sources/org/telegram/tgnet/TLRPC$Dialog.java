package org.telegram.tgnet;

public abstract class TLRPC$Dialog extends TLObject {
    public TLRPC$DraftMessage draft;
    public int flags;
    public int folder_id;
    public long f849id;
    public int last_message_date;
    public TLRPC$PeerNotifySettings notify_settings;
    public TLRPC$Peer peer;
    public boolean pinned;
    public int pinnedNum;
    public int pts;
    public int read_inbox_max_id;
    public int read_outbox_max_id;
    public int top_message;
    public int unread_count;
    public boolean unread_mark;
    public int unread_mentions_count;
    public int unread_reactions_count;

    public static TLRPC$Dialog TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Dialog tLRPC$Dialog;
        if (i != -1460809483) {
            tLRPC$Dialog = i != 1908216652 ? null : new TLRPC$TL_dialogFolder();
        } else {
            tLRPC$Dialog = new TLRPC$TL_dialog();
        }
        if (tLRPC$Dialog != null || !z) {
            if (tLRPC$Dialog != null) {
                tLRPC$Dialog.readParams(abstractSerializedData, z);
            }
            return tLRPC$Dialog;
        }
        throw new RuntimeException(String.format("can't parse magic %x in Dialog", Integer.valueOf(i)));
    }
}
