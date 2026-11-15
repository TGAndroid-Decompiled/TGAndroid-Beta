package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;
public final class zo {
    public final String f27990a;
    public final String[] f27991b;
    public final String f27992c;
    public int d;

    public zo(String str, String[] strArr, String str2) {
        this.f27990a = str;
        this.f27991b = strArr;
        this.f27992c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zo)) {
            return false;
        }
        return this.f27990a.equals(((zo) obj).f27990a);
    }

    public final String toString() {
        int i7;
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.f27990a);
        String[] strArr = this.f27991b;
        if (strArr != null) {
            i7 = strArr.length;
        } else {
            i7 = 0;
        }
        serializedData.writeInt32(i7);
        if (strArr != null) {
            for (String str : strArr) {
                serializedData.writeString(str);
            }
        }
        serializedData.writeString(this.f27992c);
        return Utilities.f(serializedData.toByteArray());
    }
}
