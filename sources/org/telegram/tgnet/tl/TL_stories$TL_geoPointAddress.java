package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stories$TL_geoPointAddress extends TLObject {
    public String city;
    public String country_iso2;
    public int flags;
    public String state;
    public String street;

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("geo{country=");
        sb.append(this.country_iso2);
        sb.append(", ");
        String str3 = "";
        if (this.state != null) {
            str = "state=" + this.state + ", ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.city != null) {
            str2 = "city=" + this.city + ", ";
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.street != null) {
            str3 = "street=" + this.street;
        }
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }

    public static TL_stories$TL_geoPointAddress TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-565420653 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_geoPointAddress", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stories$TL_geoPointAddress tL_stories$TL_geoPointAddress = new TL_stories$TL_geoPointAddress();
        tL_stories$TL_geoPointAddress.readParams(abstractSerializedData, z);
        return tL_stories$TL_geoPointAddress;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.country_iso2 = abstractSerializedData.readString(z);
        if ((this.flags & 1) != 0) {
            this.state = abstractSerializedData.readString(z);
        }
        if ((this.flags & 2) != 0) {
            this.city = abstractSerializedData.readString(z);
        }
        if ((this.flags & 4) != 0) {
            this.street = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-565420653);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.country_iso2);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.state);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.city);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.street);
        }
    }
}
