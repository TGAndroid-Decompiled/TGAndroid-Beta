package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;
public final class zo {
    public final String f28365a;
    public final String[] f28366b;
    public final String f28367c;
    public int d;

    public zo(String str, String[] strArr, String str2) {
        this.f28365a = str;
        this.f28366b = strArr;
        this.f28367c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zo)) {
            return false;
        }
        return this.f28365a.equals(((zo) obj).f28365a);
    }

    public final String toString() {
        int i7;
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.f28365a);
        String[] strArr = this.f28366b;
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
        serializedData.writeString(this.f28367c);
        return Utilities.f(serializedData.toByteArray());
    }
}
