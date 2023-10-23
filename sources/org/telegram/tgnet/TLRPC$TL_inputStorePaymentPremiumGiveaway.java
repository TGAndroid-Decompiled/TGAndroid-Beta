package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_inputStorePaymentPremiumGiveaway extends TLRPC$InputStorePaymentPurpose {
    public static int constructor = 2090038758;
    public long amount;
    public TLRPC$InputPeer boost_peer;
    public String currency;
    public int flags;
    public boolean only_new_subscribers;
    public long random_id;
    public int until_date;
    public ArrayList<TLRPC$InputPeer> additional_peers = new ArrayList<>();
    public ArrayList<String> countries_iso2 = new ArrayList<>();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.only_new_subscribers = (readInt32 & 1) != 0;
        this.boost_peer = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 2) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$InputPeer TLdeserialize = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.additional_peers.add(TLdeserialize);
            }
        }
        if ((this.flags & 4) != 0) {
            int readInt324 = abstractSerializedData.readInt32(z);
            if (readInt324 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                }
                return;
            }
            int readInt325 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt325; i2++) {
                this.countries_iso2.add(abstractSerializedData.readString(z));
            }
        }
        this.random_id = abstractSerializedData.readInt64(z);
        this.until_date = abstractSerializedData.readInt32(z);
        this.currency = abstractSerializedData.readString(z);
        this.amount = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.only_new_subscribers ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.boost_peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.additional_peers.size();
            abstractSerializedData.writeInt32(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.additional_peers.get(i2).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.countries_iso2.size();
            abstractSerializedData.writeInt32(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                abstractSerializedData.writeString(this.countries_iso2.get(i3));
            }
        }
        abstractSerializedData.writeInt64(this.random_id);
        abstractSerializedData.writeInt32(this.until_date);
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.amount);
    }
}
