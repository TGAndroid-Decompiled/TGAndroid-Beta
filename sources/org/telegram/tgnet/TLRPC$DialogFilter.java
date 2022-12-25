package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$DialogFilter extends TLObject {
    public boolean bots;
    public boolean broadcasts;
    public boolean contacts;
    public String emoticon;
    public boolean exclude_archived;
    public boolean exclude_muted;
    public boolean exclude_read;
    public int flags;
    public boolean groups;
    public int f855id;
    public boolean non_contacts;
    public String title;
    public ArrayList<TLRPC$InputPeer> pinned_peers = new ArrayList<>();
    public ArrayList<TLRPC$InputPeer> include_peers = new ArrayList<>();
    public ArrayList<TLRPC$InputPeer> exclude_peers = new ArrayList<>();

    public static TLRPC$DialogFilter TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$DialogFilter tLRPC$DialogFilter;
        if (i == 909284270) {
            tLRPC$DialogFilter = new TLRPC$DialogFilter() {
                public static int constructor = 909284270;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$DialogFilter = i != 1949890536 ? null : new TLRPC$TL_dialogFilter();
        }
        if (tLRPC$DialogFilter == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in DialogFilter", Integer.valueOf(i)));
        }
        if (tLRPC$DialogFilter != null) {
            tLRPC$DialogFilter.readParams(abstractSerializedData, z);
        }
        return tLRPC$DialogFilter;
    }
}
