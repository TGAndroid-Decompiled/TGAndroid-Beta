package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;
public final class zo {
    public final String f27980a;
    public final String[] f27981b;
    public final String f27982c;
    public int d;

    public zo(String str, String[] strArr, String str2) {
        this.f27980a = str;
        this.f27981b = strArr;
        this.f27982c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zo)) {
            return false;
        }
        return this.f27980a.equals(((zo) obj).f27980a);
    }

    public final String toString() {
        int i7;
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.f27980a);
        String[] strArr = this.f27981b;
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
        serializedData.writeString(this.f27982c);
        return Utilities.f(serializedData.toByteArray());
    }
}
