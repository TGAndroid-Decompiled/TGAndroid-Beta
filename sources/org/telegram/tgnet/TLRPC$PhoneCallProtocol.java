package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$PhoneCallProtocol extends TLObject {
    public int flags;
    public ArrayList<String> library_versions = new ArrayList<>();
    public int max_layer;
    public int min_layer;
    public boolean udp_p2p;
    public boolean udp_reflector;

    public static TLRPC$PhoneCallProtocol TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_phoneCallProtocol tLRPC$TL_phoneCallProtocol;
        if (i != -1564789301) {
            tLRPC$TL_phoneCallProtocol = i != -58224696 ? null : new TLRPC$TL_phoneCallProtocol();
        } else {
            tLRPC$TL_phoneCallProtocol = new TLRPC$TL_phoneCallProtocol() {
                public static int constructor = -1564789301;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    boolean z3 = false;
                    this.udp_p2p = (readInt32 & 1) != 0;
                    if ((readInt32 & 2) != 0) {
                        z3 = true;
                    }
                    this.udp_reflector = z3;
                    this.min_layer = abstractSerializedData2.readInt32(z2);
                    this.max_layer = abstractSerializedData2.readInt32(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    int i2 = this.udp_p2p ? this.flags | 1 : this.flags & (-2);
                    this.flags = i2;
                    int i3 = this.udp_reflector ? i2 | 2 : i2 & (-3);
                    this.flags = i3;
                    abstractSerializedData2.writeInt32(i3);
                    abstractSerializedData2.writeInt32(this.min_layer);
                    abstractSerializedData2.writeInt32(this.max_layer);
                }
            };
        }
        if (tLRPC$TL_phoneCallProtocol != null || !z) {
            if (tLRPC$TL_phoneCallProtocol != null) {
                tLRPC$TL_phoneCallProtocol.readParams(abstractSerializedData, z);
            }
            return tLRPC$TL_phoneCallProtocol;
        }
        throw new RuntimeException(String.format("can't parse magic %x in PhoneCallProtocol", Integer.valueOf(i)));
    }
}
