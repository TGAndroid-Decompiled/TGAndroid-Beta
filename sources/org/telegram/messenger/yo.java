package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;
public final class yo {
    public final String f28269a;
    public final String[] f28270b;
    public final String f28271c;
    public int d;

    public yo(String str, String[] strArr, String str2) {
        this.f28269a = str;
        this.f28270b = strArr;
        this.f28271c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yo)) {
            return false;
        }
        return this.f28269a.equals(((yo) obj).f28269a);
    }

    public final String toString() {
        int i7;
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.f28269a);
        String[] strArr = this.f28270b;
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
        serializedData.writeString(this.f28271c);
        return Utilities.f(serializedData.toByteArray());
    }
}
