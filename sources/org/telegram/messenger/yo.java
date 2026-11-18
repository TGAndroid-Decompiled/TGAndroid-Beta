package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;
public final class yo {
    public final String f28171a;
    public final String[] f28172b;
    public final String f28173c;
    public int d;

    public yo(String str, String[] strArr, String str2) {
        this.f28171a = str;
        this.f28172b = strArr;
        this.f28173c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yo)) {
            return false;
        }
        return this.f28171a.equals(((yo) obj).f28171a);
    }

    public final String toString() {
        int i7;
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.f28171a);
        String[] strArr = this.f28172b;
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
        serializedData.writeString(this.f28173c);
        return Utilities.f(serializedData.toByteArray());
    }
}
